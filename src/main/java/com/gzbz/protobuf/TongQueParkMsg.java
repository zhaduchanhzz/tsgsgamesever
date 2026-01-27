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

public final class TongQueParkMsg {
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_GiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_ChessData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TongQueParkMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011TongQuePark.proto\u0012\u001dtongQuePark.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"H\n\bGiftData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\r\n\u0005isBuy\u0018\u0003 \u0002(\b\"(\n\tChessData\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006iconId\u0018\u0002 \u0002(\u0005\"5\n\u000fFloorRewardData\u0012\r\n\u0005floor\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000brewardIndex\u0018\u0002 \u0002(\u0005\"\u001b\n\u0019C2S_TongQueParkMain_12101\"Å\u0002\n\u0019S2C_TongQueParkMain_12102\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\u00129\n\bgiftList\u0018\u0002 \u0003(\u000b2'.tongQuePark.com.gzbz.protobuf.GiftData\u0012;\n\tchessList\u0018\u0003 \u0003(\u000b2(.tongQuePark.com.gzbz.protobuf.ChessData\u0012\u0012\n\nflushCount\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007floorId\u0018\u0005 \u0002(\u0005\u0012\u0014\n\fflyGoldCount\u0018\u0006 \u0002(\u0005\u0012\u0016\n\u000eisRewardBeauty\u0018\u0007 \u0002(\b\u00126\n\btaskList\u0018\b \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0014\n\fdailyDrawNum\u0018\t \u0002(\u0005\"(\n\u0019C2S_TongQueParkOpen_12103\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\"f\n\u0019S2C_TongQueParkOpen_12104\u00127\n\u0005chess\u0018\u0001 \u0002(\u000b2(.tongQuePark.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"!\n\u001fC2S_TongQueParkOneKeyOpen_12105\"p\n\u001fS2C_TongQueParkOneKeyOpen_12106\u0012;\n\tchessList\u0018\u0001 \u0003(\u000b2(.tongQuePark.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"\u001c\n\u001aC2S_TongQueParkFlush_12107\"0\n\u001aS2C_TongQueParkFlush_12108\u0012\u0012\n\nflushCount\u0018\u0001 \u0002(\u0005\"(\n\u0018C2S_TongQueParkFly_12109\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"¾\u0001\n\u0018S2C_TongQueParkFly_12110\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fflyGoldCount\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007floorId\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000eisRewardBeauty\u0018\u0004 \u0002(\b\u0012?\n\u0007rewards\u0018\u0005 \u0003(\u000b2..tongQuePark.com.gzbz.protobuf.FloorRewardData\u0012\u0014\n\fdailyDrawNum\u0018\u0006 \u0002(\u0005\"\u001e\n\u001cC2S_TongQueParkBuyItem_12111\"\u001e\n\u001cS2C_TongQueParkBuyItem_12112\"1\n\u001fC2S_TongQueParkCommitTask_12113\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"1\n\u001fS2C_TongQueParkCommitTask_12114\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"T\n\u001aS2C_TongQueParkTasks_12116\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0015\n\u0013C2S_ChessList_12117\"R\n\u0013S2C_ChessList_12118\u0012;\n\tchessList\u0018\u0001 \u0003(\u000b2(.tongQuePark.com.gzbz.protobuf.ChessDataB%\n\u0011com.gzbz.protobufB\u000eTongQueParkMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_tongQuePark_com_gzbz_protobuf_GiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor, new String[]{"Id", "Rewards", "IsBuy"});
      internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_tongQuePark_com_gzbz_protobuf_ChessData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor, new String[]{"Pos", "IconId"});
      internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor, new String[]{"Floor", "RewardIndex"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor, new String[]{"EndTime", "GiftList", "ChessList", "FlushCount", "FloorId", "FlyGoldCount", "IsRewardBeauty", "TaskList", "DailyDrawNum"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor, new String[]{"Pos"});
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor, new String[]{"Chess", "PrizeIds"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor, new String[]{"ChessList", "PrizeIds"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor, new String[]{"FlushCount"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor, new String[]{"Type"});
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor, new String[]{"Type", "FlyGoldCount", "FloorId", "IsRewardBeauty", "Rewards", "DailyDrawNum"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor, new String[]{"TaskId"});
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor, new String[]{"TaskId"});
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor, new String[]{"TaskList"});
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor, new String[0]);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor, new String[]{"ChessList"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class GiftData extends GeneratedMessageV3 implements GiftDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int REWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int ISBUY_FIELD_NUMBER = 3;
      private boolean isBuy_;
      private byte memoizedIsInitialized;
      private static final GiftData DEFAULT_INSTANCE = new GiftData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GiftData> PARSER = new AbstractParser<GiftData>() {
         public GiftData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GiftData(input, extensionRegistry);
         }
      };

      private GiftData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GiftData() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GiftData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GiftData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.isBuy_ = input.readBool();
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<CommonMsg.ItemInfo> getRewardsList() {
         return this.rewards_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
         return this.rewards_;
      }

      public int getRewardsCount() {
         return this.rewards_.size();
      }

      public CommonMsg.ItemInfo getRewards(int index) {
         return (CommonMsg.ItemInfo)this.rewards_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index);
      }

      public boolean hasIsBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsBuy() {
         return this.isBuy_;
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
         } else if (!this.hasIsBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
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

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.isBuy_);
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

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GiftData)) {
            return super.equals(obj);
         } else {
            GiftData other = (GiftData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasIsBuy() != other.hasIsBuy()) {
               return false;
            } else if (this.hasIsBuy() && this.getIsBuy() != other.getIsBuy()) {
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

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasIsBuy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBuy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GiftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseDelimitedFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GiftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseFrom(CodedInputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GiftData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GiftData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GiftData> parser() {
         return PARSER;
      }

      public Parser<GiftData> getParserForType() {
         return PARSER;
      }

      public GiftData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GiftDataOrBuilder {
         private int bitField0_;
         private int id_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private boolean isBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
         }

         private Builder() {
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.GiftData.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.isBuy_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_GiftData_descriptor;
         }

         public GiftData getDefaultInstanceForType() {
            return TongQueParkMsg.GiftData.getDefaultInstance();
         }

         public GiftData build() {
            GiftData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GiftData buildPartial() {
            GiftData result = new GiftData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -3;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isBuy_ = this.isBuy_;
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
            if (other instanceof GiftData) {
               return this.mergeFrom((GiftData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GiftData other) {
            if (other == TongQueParkMsg.GiftData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardsIsMutable();
                        this.rewards_.addAll(other.rewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewards_.isEmpty()) {
                  if (this.rewardsBuilder_.isEmpty()) {
                     this.rewardsBuilder_.dispose();
                     this.rewardsBuilder_ = null;
                     this.rewards_ = other.rewards_;
                     this.bitField0_ &= -3;
                     this.rewardsBuilder_ = TongQueParkMsg.GiftData.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasIsBuy()) {
                  this.setIsBuy(other.getIsBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasIsBuy()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardsCount(); ++i) {
                  if (!this.getRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GiftData parsedMessage = null;

            try {
               parsedMessage = (GiftData)TongQueParkMsg.GiftData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GiftData)e.getUnfinishedMessage();
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

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardsList() {
            return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
         }

         public int getRewardsCount() {
            return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getRewards(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfo)this.rewards_.get(index) : (CommonMsg.ItemInfo)this.rewardsBuilder_.getMessage(index);
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.set(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewards(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewards_);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewards() {
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewards(int index) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.remove(index);
               this.onChanged();
            } else {
               this.rewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
            return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardsBuilderList() {
            return this.getRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardsFieldBuilder() {
            if (this.rewardsBuilder_ == null) {
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasIsBuy() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsBuy() {
            return this.isBuy_;
         }

         public Builder setIsBuy(boolean value) {
            this.bitField0_ |= 4;
            this.isBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBuy() {
            this.bitField0_ &= -5;
            this.isBuy_ = false;
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

   public static final class ChessData extends GeneratedMessageV3 implements ChessDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      public static final int ICONID_FIELD_NUMBER = 2;
      private int iconId_;
      private byte memoizedIsInitialized;
      private static final ChessData DEFAULT_INSTANCE = new ChessData();
      /** @deprecated */
      @Deprecated
      public static final Parser<ChessData> PARSER = new AbstractParser<ChessData>() {
         public ChessData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ChessData(input, extensionRegistry);
         }
      };

      private ChessData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ChessData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ChessData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ChessData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.iconId_ = input.readInt32();
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasIconId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIconId() {
         return this.iconId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIconId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.iconId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.iconId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ChessData)) {
            return super.equals(obj);
         } else {
            ChessData other = (ChessData)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasIconId() != other.hasIconId()) {
               return false;
            } else if (this.hasIconId() && this.getIconId() != other.getIconId()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasIconId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIconId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ChessData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(InputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChessData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChessData parseDelimitedFrom(InputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ChessData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChessData parseFrom(CodedInputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChessData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ChessData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ChessData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ChessData> parser() {
         return PARSER;
      }

      public Parser<ChessData> getParserForType() {
         return PARSER;
      }

      public ChessData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChessDataOrBuilder {
         private int bitField0_;
         private int pos_;
         private int iconId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.ChessData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            this.iconId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_ChessData_descriptor;
         }

         public ChessData getDefaultInstanceForType() {
            return TongQueParkMsg.ChessData.getDefaultInstance();
         }

         public ChessData build() {
            ChessData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ChessData buildPartial() {
            ChessData result = new ChessData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.iconId_ = this.iconId_;
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
            if (other instanceof ChessData) {
               return this.mergeFrom((ChessData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ChessData other) {
            if (other == TongQueParkMsg.ChessData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasIconId()) {
                  this.setIconId(other.getIconId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPos()) {
               return false;
            } else {
               return this.hasIconId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ChessData parsedMessage = null;

            try {
               parsedMessage = (ChessData)TongQueParkMsg.ChessData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ChessData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIconId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIconId() {
            return this.iconId_;
         }

         public Builder setIconId(int value) {
            this.bitField0_ |= 2;
            this.iconId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIconId() {
            this.bitField0_ &= -3;
            this.iconId_ = 0;
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

   public static final class FloorRewardData extends GeneratedMessageV3 implements FloorRewardDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLOOR_FIELD_NUMBER = 1;
      private int floor_;
      public static final int REWARDINDEX_FIELD_NUMBER = 2;
      private int rewardIndex_;
      private byte memoizedIsInitialized;
      private static final FloorRewardData DEFAULT_INSTANCE = new FloorRewardData();
      /** @deprecated */
      @Deprecated
      public static final Parser<FloorRewardData> PARSER = new AbstractParser<FloorRewardData>() {
         public FloorRewardData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FloorRewardData(input, extensionRegistry);
         }
      };

      private FloorRewardData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FloorRewardData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FloorRewardData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FloorRewardData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.floor_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardIndex_ = input.readInt32();
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_fieldAccessorTable.ensureFieldAccessorsInitialized(FloorRewardData.class, Builder.class);
      }

      public boolean hasFloor() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFloor() {
         return this.floor_;
      }

      public boolean hasRewardIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardIndex() {
         return this.rewardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFloor()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.floor_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.floor_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FloorRewardData)) {
            return super.equals(obj);
         } else {
            FloorRewardData other = (FloorRewardData)obj;
            if (this.hasFloor() != other.hasFloor()) {
               return false;
            } else if (this.hasFloor() && this.getFloor() != other.getFloor()) {
               return false;
            } else if (this.hasRewardIndex() != other.hasRewardIndex()) {
               return false;
            } else if (this.hasRewardIndex() && this.getRewardIndex() != other.getRewardIndex()) {
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
            if (this.hasFloor()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFloor();
            }

            if (this.hasRewardIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FloorRewardData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data);
      }

      public static FloorRewardData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FloorRewardData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data);
      }

      public static FloorRewardData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FloorRewardData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data);
      }

      public static FloorRewardData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FloorRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FloorRewardData parseFrom(InputStream input) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FloorRewardData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FloorRewardData parseDelimitedFrom(InputStream input) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FloorRewardData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FloorRewardData parseFrom(CodedInputStream input) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FloorRewardData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FloorRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FloorRewardData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FloorRewardData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FloorRewardData> parser() {
         return PARSER;
      }

      public Parser<FloorRewardData> getParserForType() {
         return PARSER;
      }

      public FloorRewardData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FloorRewardDataOrBuilder {
         private int bitField0_;
         private int floor_;
         private int rewardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_fieldAccessorTable.ensureFieldAccessorsInitialized(FloorRewardData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.FloorRewardData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.floor_ = 0;
            this.bitField0_ &= -2;
            this.rewardIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_FloorRewardData_descriptor;
         }

         public FloorRewardData getDefaultInstanceForType() {
            return TongQueParkMsg.FloorRewardData.getDefaultInstance();
         }

         public FloorRewardData build() {
            FloorRewardData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FloorRewardData buildPartial() {
            FloorRewardData result = new FloorRewardData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.floor_ = this.floor_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardIndex_ = this.rewardIndex_;
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
            if (other instanceof FloorRewardData) {
               return this.mergeFrom((FloorRewardData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FloorRewardData other) {
            if (other == TongQueParkMsg.FloorRewardData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFloor()) {
                  this.setFloor(other.getFloor());
               }

               if (other.hasRewardIndex()) {
                  this.setRewardIndex(other.getRewardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFloor()) {
               return false;
            } else {
               return this.hasRewardIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FloorRewardData parsedMessage = null;

            try {
               parsedMessage = (FloorRewardData)TongQueParkMsg.FloorRewardData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FloorRewardData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFloor() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFloor() {
            return this.floor_;
         }

         public Builder setFloor(int value) {
            this.bitField0_ |= 1;
            this.floor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFloor() {
            this.bitField0_ &= -2;
            this.floor_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardIndex() {
            return this.rewardIndex_;
         }

         public Builder setRewardIndex(int value) {
            this.bitField0_ |= 2;
            this.rewardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardIndex() {
            this.bitField0_ &= -3;
            this.rewardIndex_ = 0;
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

   public static final class C2S_TongQueParkMain_12101 extends GeneratedMessageV3 implements C2S_TongQueParkMain_12101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkMain_12101 DEFAULT_INSTANCE = new C2S_TongQueParkMain_12101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkMain_12101> PARSER = new AbstractParser<C2S_TongQueParkMain_12101>() {
         public C2S_TongQueParkMain_12101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkMain_12101(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkMain_12101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkMain_12101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkMain_12101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkMain_12101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_12101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkMain_12101)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkMain_12101 other = (C2S_TongQueParkMain_12101)obj;
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

      public static C2S_TongQueParkMain_12101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_12101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_12101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_12101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_12101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_12101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkMain_12101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkMain_12101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkMain_12101> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkMain_12101> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkMain_12101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkMain_12101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_12101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkMain_12101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkMain_12101_descriptor;
         }

         public C2S_TongQueParkMain_12101 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkMain_12101.getDefaultInstance();
         }

         public C2S_TongQueParkMain_12101 build() {
            C2S_TongQueParkMain_12101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkMain_12101 buildPartial() {
            C2S_TongQueParkMain_12101 result = new C2S_TongQueParkMain_12101(this);
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
            if (other instanceof C2S_TongQueParkMain_12101) {
               return this.mergeFrom((C2S_TongQueParkMain_12101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkMain_12101 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkMain_12101.getDefaultInstance()) {
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
            C2S_TongQueParkMain_12101 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkMain_12101)TongQueParkMsg.C2S_TongQueParkMain_12101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkMain_12101)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkMain_12102 extends GeneratedMessageV3 implements S2C_TongQueParkMain_12102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENDTIME_FIELD_NUMBER = 1;
      private int endTime_;
      public static final int GIFTLIST_FIELD_NUMBER = 2;
      private List<GiftData> giftList_;
      public static final int CHESSLIST_FIELD_NUMBER = 3;
      private List<ChessData> chessList_;
      public static final int FLUSHCOUNT_FIELD_NUMBER = 4;
      private int flushCount_;
      public static final int FLOORID_FIELD_NUMBER = 5;
      private int floorId_;
      public static final int FLYGOLDCOUNT_FIELD_NUMBER = 6;
      private int flyGoldCount_;
      public static final int ISREWARDBEAUTY_FIELD_NUMBER = 7;
      private boolean isRewardBeauty_;
      public static final int TASKLIST_FIELD_NUMBER = 8;
      private List<ActivityMsg.TaskData> taskList_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 9;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkMain_12102 DEFAULT_INSTANCE = new S2C_TongQueParkMain_12102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkMain_12102> PARSER = new AbstractParser<S2C_TongQueParkMain_12102>() {
         public S2C_TongQueParkMain_12102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkMain_12102(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkMain_12102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkMain_12102() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
         this.chessList_ = Collections.emptyList();
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkMain_12102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkMain_12102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.endTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.giftList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.giftList_.add(input.readMessage(TongQueParkMsg.GiftData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.chessList_.add(input.readMessage(TongQueParkMsg.ChessData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.flushCount_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.floorId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.flyGoldCount_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.isRewardBeauty_ = input.readBool();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 72:
                        this.bitField0_ |= 32;
                        this.dailyDrawNum_ = input.readInt32();
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
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_12102.class, Builder.class);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<GiftData> getGiftListList() {
         return this.giftList_;
      }

      public List<? extends GiftDataOrBuilder> getGiftListOrBuilderList() {
         return this.giftList_;
      }

      public int getGiftListCount() {
         return this.giftList_.size();
      }

      public GiftData getGiftList(int index) {
         return (GiftData)this.giftList_.get(index);
      }

      public GiftDataOrBuilder getGiftListOrBuilder(int index) {
         return (GiftDataOrBuilder)this.giftList_.get(index);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public boolean hasFlushCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFlushCount() {
         return this.flushCount_;
      }

      public boolean hasFloorId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFloorId() {
         return this.floorId_;
      }

      public boolean hasFlyGoldCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFlyGoldCount() {
         return this.flyGoldCount_;
      }

      public boolean hasIsRewardBeauty() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsRewardBeauty() {
         return this.isRewardBeauty_;
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFlushCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFloorId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFlyGoldCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsRewardBeauty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGiftListCount(); ++i) {
               if (!this.getGiftList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
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
            output.writeInt32(1, this.endTime_);
         }

         for(int i = 0; i < this.giftList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.giftList_.get(i));
         }

         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.chessList_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.flushCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.floorId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.flyGoldCount_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(7, this.isRewardBeauty_);
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.taskList_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(9, this.dailyDrawNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.endTime_);
            }

            for(int i = 0; i < this.giftList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.giftList_.get(i));
            }

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.chessList_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.flushCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.floorId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.flyGoldCount_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.isRewardBeauty_);
            }

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.taskList_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkMain_12102)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkMain_12102 other = (S2C_TongQueParkMain_12102)obj;
            if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getGiftListList().equals(other.getGiftListList())) {
               return false;
            } else if (!this.getChessListList().equals(other.getChessListList())) {
               return false;
            } else if (this.hasFlushCount() != other.hasFlushCount()) {
               return false;
            } else if (this.hasFlushCount() && this.getFlushCount() != other.getFlushCount()) {
               return false;
            } else if (this.hasFloorId() != other.hasFloorId()) {
               return false;
            } else if (this.hasFloorId() && this.getFloorId() != other.getFloorId()) {
               return false;
            } else if (this.hasFlyGoldCount() != other.hasFlyGoldCount()) {
               return false;
            } else if (this.hasFlyGoldCount() && this.getFlyGoldCount() != other.getFlyGoldCount()) {
               return false;
            } else if (this.hasIsRewardBeauty() != other.hasIsRewardBeauty()) {
               return false;
            } else if (this.hasIsRewardBeauty() && this.getIsRewardBeauty() != other.getIsRewardBeauty()) {
               return false;
            } else if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
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
            if (this.hasEndTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getGiftListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGiftListList().hashCode();
            }

            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            if (this.hasFlushCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFlushCount();
            }

            if (this.hasFloorId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFloorId();
            }

            if (this.hasFlyGoldCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFlyGoldCount();
            }

            if (this.hasIsRewardBeauty()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRewardBeauty());
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkMain_12102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_12102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_12102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_12102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_12102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_12102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkMain_12102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkMain_12102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkMain_12102> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkMain_12102> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkMain_12102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkMain_12102OrBuilder {
         private int bitField0_;
         private int endTime_;
         private List<GiftData> giftList_;
         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> giftListBuilder_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;
         private int flushCount_;
         private int floorId_;
         private int flyGoldCount_;
         private boolean isRewardBeauty_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_12102.class, Builder.class);
         }

         private Builder() {
            this.giftList_ = Collections.emptyList();
            this.chessList_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftList_ = Collections.emptyList();
            this.chessList_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkMain_12102.alwaysUseFieldBuilders) {
               this.getGiftListFieldBuilder();
               this.getChessListFieldBuilder();
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.endTime_ = 0;
            this.bitField0_ &= -2;
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.giftListBuilder_.clear();
            }

            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.chessListBuilder_.clear();
            }

            this.flushCount_ = 0;
            this.bitField0_ &= -9;
            this.floorId_ = 0;
            this.bitField0_ &= -17;
            this.flyGoldCount_ = 0;
            this.bitField0_ &= -33;
            this.isRewardBeauty_ = false;
            this.bitField0_ &= -65;
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.taskListBuilder_.clear();
            }

            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkMain_12102_descriptor;
         }

         public S2C_TongQueParkMain_12102 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkMain_12102.getDefaultInstance();
         }

         public S2C_TongQueParkMain_12102 build() {
            S2C_TongQueParkMain_12102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkMain_12102 buildPartial() {
            S2C_TongQueParkMain_12102 result = new S2C_TongQueParkMain_12102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 1;
            }

            if (this.giftListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
                  this.bitField0_ &= -3;
               }

               result.giftList_ = this.giftList_;
            } else {
               result.giftList_ = this.giftListBuilder_.build();
            }

            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -5;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.flushCount_ = this.flushCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.floorId_ = this.floorId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.flyGoldCount_ = this.flyGoldCount_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isRewardBeauty_ = this.isRewardBeauty_;
               to_bitField0_ |= 16;
            }

            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -129;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
            }

            if ((from_bitField0_ & 256) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_TongQueParkMain_12102) {
               return this.mergeFrom((S2C_TongQueParkMain_12102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkMain_12102 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkMain_12102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (this.giftListBuilder_ == null) {
                  if (!other.giftList_.isEmpty()) {
                     if (this.giftList_.isEmpty()) {
                        this.giftList_ = other.giftList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGiftListIsMutable();
                        this.giftList_.addAll(other.giftList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.giftList_.isEmpty()) {
                  if (this.giftListBuilder_.isEmpty()) {
                     this.giftListBuilder_.dispose();
                     this.giftListBuilder_ = null;
                     this.giftList_ = other.giftList_;
                     this.bitField0_ &= -3;
                     this.giftListBuilder_ = TongQueParkMsg.S2C_TongQueParkMain_12102.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
                  } else {
                     this.giftListBuilder_.addAllMessages(other.giftList_);
                  }
               }

               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -5;
                     this.chessListBuilder_ = TongQueParkMsg.S2C_TongQueParkMain_12102.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               if (other.hasFlushCount()) {
                  this.setFlushCount(other.getFlushCount());
               }

               if (other.hasFloorId()) {
                  this.setFloorId(other.getFloorId());
               }

               if (other.hasFlyGoldCount()) {
                  this.setFlyGoldCount(other.getFlyGoldCount());
               }

               if (other.hasIsRewardBeauty()) {
                  this.setIsRewardBeauty(other.getIsRewardBeauty());
               }

               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -129;
                     this.taskListBuilder_ = TongQueParkMsg.S2C_TongQueParkMain_12102.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasFlushCount()) {
               return false;
            } else if (!this.hasFloorId()) {
               return false;
            } else if (!this.hasFlyGoldCount()) {
               return false;
            } else if (!this.hasIsRewardBeauty()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getGiftListCount(); ++i) {
                  if (!this.getGiftList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getChessListCount(); ++i) {
                  if (!this.getChessList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkMain_12102 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkMain_12102)TongQueParkMsg.S2C_TongQueParkMain_12102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkMain_12102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 1;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGiftListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.giftList_ = new ArrayList(this.giftList_);
               this.bitField0_ |= 2;
            }

         }

         public List<GiftData> getGiftListList() {
            return this.giftListBuilder_ == null ? Collections.unmodifiableList(this.giftList_) : this.giftListBuilder_.getMessageList();
         }

         public int getGiftListCount() {
            return this.giftListBuilder_ == null ? this.giftList_.size() : this.giftListBuilder_.getCount();
         }

         public GiftData getGiftList(int index) {
            return this.giftListBuilder_ == null ? (GiftData)this.giftList_.get(index) : (GiftData)this.giftListBuilder_.getMessage(index);
         }

         public Builder setGiftList(int index, GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.set(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGiftList(int index, GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGiftList(int index, GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGiftList(GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(int index, GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGiftList(Iterable<? extends GiftData> values) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftList_);
               this.onChanged();
            } else {
               this.giftListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGiftList() {
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.giftListBuilder_.clear();
            }

            return this;
         }

         public Builder removeGiftList(int index) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.remove(index);
               this.onChanged();
            } else {
               this.giftListBuilder_.remove(index);
            }

            return this;
         }

         public GiftData.Builder getGiftListBuilder(int index) {
            return (GiftData.Builder)this.getGiftListFieldBuilder().getBuilder(index);
         }

         public GiftDataOrBuilder getGiftListOrBuilder(int index) {
            return this.giftListBuilder_ == null ? (GiftDataOrBuilder)this.giftList_.get(index) : (GiftDataOrBuilder)this.giftListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GiftDataOrBuilder> getGiftListOrBuilderList() {
            return this.giftListBuilder_ != null ? this.giftListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.giftList_);
         }

         public GiftData.Builder addGiftListBuilder() {
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(TongQueParkMsg.GiftData.getDefaultInstance());
         }

         public GiftData.Builder addGiftListBuilder(int index) {
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(index, TongQueParkMsg.GiftData.getDefaultInstance());
         }

         public List<GiftData.Builder> getGiftListBuilderList() {
            return this.getGiftListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> getGiftListFieldBuilder() {
            if (this.giftListBuilder_ == null) {
               this.giftListBuilder_ = new RepeatedFieldBuilderV3(this.giftList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.giftList_ = null;
            }

            return this.giftListBuilder_;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 4;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         public boolean hasFlushCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFlushCount() {
            return this.flushCount_;
         }

         public Builder setFlushCount(int value) {
            this.bitField0_ |= 8;
            this.flushCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushCount() {
            this.bitField0_ &= -9;
            this.flushCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFloorId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFloorId() {
            return this.floorId_;
         }

         public Builder setFloorId(int value) {
            this.bitField0_ |= 16;
            this.floorId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFloorId() {
            this.bitField0_ &= -17;
            this.floorId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFlyGoldCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFlyGoldCount() {
            return this.flyGoldCount_;
         }

         public Builder setFlyGoldCount(int value) {
            this.bitField0_ |= 32;
            this.flyGoldCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlyGoldCount() {
            this.bitField0_ &= -33;
            this.flyGoldCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsRewardBeauty() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsRewardBeauty() {
            return this.isRewardBeauty_;
         }

         public Builder setIsRewardBeauty(boolean value) {
            this.bitField0_ |= 64;
            this.isRewardBeauty_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRewardBeauty() {
            this.bitField0_ &= -65;
            this.isRewardBeauty_ = false;
            this.onChanged();
            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 128;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 256;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -257;
            this.dailyDrawNum_ = 0;
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

   public static final class C2S_TongQueParkOpen_12103 extends GeneratedMessageV3 implements C2S_TongQueParkOpen_12103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOpen_12103 DEFAULT_INSTANCE = new C2S_TongQueParkOpen_12103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOpen_12103> PARSER = new AbstractParser<C2S_TongQueParkOpen_12103>() {
         public C2S_TongQueParkOpen_12103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOpen_12103(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOpen_12103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOpen_12103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOpen_12103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOpen_12103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_12103.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TongQueParkOpen_12103)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOpen_12103 other = (C2S_TongQueParkOpen_12103)obj;
            if (this.hasPos() != other.hasPos()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_12103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_12103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_12103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_12103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_12103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOpen_12103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOpen_12103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOpen_12103> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOpen_12103> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOpen_12103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOpen_12103OrBuilder {
         private int bitField0_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_12103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkOpen_12103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOpen_12103_descriptor;
         }

         public C2S_TongQueParkOpen_12103 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkOpen_12103.getDefaultInstance();
         }

         public C2S_TongQueParkOpen_12103 build() {
            C2S_TongQueParkOpen_12103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOpen_12103 buildPartial() {
            C2S_TongQueParkOpen_12103 result = new C2S_TongQueParkOpen_12103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof C2S_TongQueParkOpen_12103) {
               return this.mergeFrom((C2S_TongQueParkOpen_12103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOpen_12103 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkOpen_12103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TongQueParkOpen_12103 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOpen_12103)TongQueParkMsg.C2S_TongQueParkOpen_12103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOpen_12103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
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

   public static final class S2C_TongQueParkOpen_12104 extends GeneratedMessageV3 implements S2C_TongQueParkOpen_12104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHESS_FIELD_NUMBER = 1;
      private ChessData chess_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOpen_12104 DEFAULT_INSTANCE = new S2C_TongQueParkOpen_12104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOpen_12104> PARSER = new AbstractParser<S2C_TongQueParkOpen_12104>() {
         public S2C_TongQueParkOpen_12104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOpen_12104(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOpen_12104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOpen_12104() {
         this.memoizedIsInitialized = -1;
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOpen_12104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOpen_12104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChessData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chess_.toBuilder();
                        }

                        this.chess_ = (ChessData)input.readMessage(TongQueParkMsg.ChessData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chess_);
                           this.chess_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.prizeIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.prizeIds_.addInt(input.readInt32());
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
                  this.prizeIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_12104.class, Builder.class);
      }

      public boolean hasChess() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChessData getChess() {
         return this.chess_ == null ? TongQueParkMsg.ChessData.getDefaultInstance() : this.chess_;
      }

      public ChessDataOrBuilder getChessOrBuilder() {
         return this.chess_ == null ? TongQueParkMsg.ChessData.getDefaultInstance() : this.chess_;
      }

      public List<Integer> getPrizeIdsList() {
         return this.prizeIds_;
      }

      public int getPrizeIdsCount() {
         return this.prizeIds_.size();
      }

      public int getPrizeIds(int index) {
         return this.prizeIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChess().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChess());
         }

         for(int i = 0; i < this.prizeIds_.size(); ++i) {
            output.writeInt32(2, this.prizeIds_.getInt(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getChess());
            }

            int dataSize = 0;

            for(int i = 0; i < this.prizeIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.prizeIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPrizeIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkOpen_12104)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOpen_12104 other = (S2C_TongQueParkOpen_12104)obj;
            if (this.hasChess() != other.hasChess()) {
               return false;
            } else if (this.hasChess() && !this.getChess().equals(other.getChess())) {
               return false;
            } else if (!this.getPrizeIdsList().equals(other.getPrizeIdsList())) {
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
            if (this.hasChess()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChess().hashCode();
            }

            if (this.getPrizeIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrizeIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_12104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_12104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_12104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_12104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_12104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOpen_12104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOpen_12104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOpen_12104> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOpen_12104> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOpen_12104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOpen_12104OrBuilder {
         private int bitField0_;
         private ChessData chess_;
         private SingleFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_12104.class, Builder.class);
         }

         private Builder() {
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOpen_12104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOpen_12104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkOpen_12104.alwaysUseFieldBuilders) {
               this.getChessFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessBuilder_ == null) {
               this.chess_ = null;
            } else {
               this.chessBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOpen_12104.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOpen_12104_descriptor;
         }

         public S2C_TongQueParkOpen_12104 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkOpen_12104.getDefaultInstance();
         }

         public S2C_TongQueParkOpen_12104 build() {
            S2C_TongQueParkOpen_12104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOpen_12104 buildPartial() {
            S2C_TongQueParkOpen_12104 result = new S2C_TongQueParkOpen_12104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chessBuilder_ == null) {
                  result.chess_ = this.chess_;
               } else {
                  result.chess_ = (ChessData)this.chessBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.prizeIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.prizeIds_ = this.prizeIds_;
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
            if (other instanceof S2C_TongQueParkOpen_12104) {
               return this.mergeFrom((S2C_TongQueParkOpen_12104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOpen_12104 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkOpen_12104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChess()) {
                  this.mergeChess(other.getChess());
               }

               if (!other.prizeIds_.isEmpty()) {
                  if (this.prizeIds_.isEmpty()) {
                     this.prizeIds_ = other.prizeIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePrizeIdsIsMutable();
                     this.prizeIds_.addAll(other.prizeIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChess()) {
               return false;
            } else {
               return this.getChess().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkOpen_12104 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOpen_12104)TongQueParkMsg.S2C_TongQueParkOpen_12104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOpen_12104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChess() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChessData getChess() {
            if (this.chessBuilder_ == null) {
               return this.chess_ == null ? TongQueParkMsg.ChessData.getDefaultInstance() : this.chess_;
            } else {
               return (ChessData)this.chessBuilder_.getMessage();
            }
         }

         public Builder setChess(ChessData value) {
            if (this.chessBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chess_ = value;
               this.onChanged();
            } else {
               this.chessBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChess(ChessData.Builder builderForValue) {
            if (this.chessBuilder_ == null) {
               this.chess_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chessBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChess(ChessData value) {
            if (this.chessBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chess_ != null && this.chess_ != TongQueParkMsg.ChessData.getDefaultInstance()) {
                  this.chess_ = TongQueParkMsg.ChessData.newBuilder(this.chess_).mergeFrom(value).buildPartial();
               } else {
                  this.chess_ = value;
               }

               this.onChanged();
            } else {
               this.chessBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChess() {
            if (this.chessBuilder_ == null) {
               this.chess_ = null;
               this.onChanged();
            } else {
               this.chessBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChessData.Builder getChessBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChessData.Builder)this.getChessFieldBuilder().getBuilder();
         }

         public ChessDataOrBuilder getChessOrBuilder() {
            if (this.chessBuilder_ != null) {
               return (ChessDataOrBuilder)this.chessBuilder_.getMessageOrBuilder();
            } else {
               return this.chess_ == null ? TongQueParkMsg.ChessData.getDefaultInstance() : this.chess_;
            }
         }

         private SingleFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessFieldBuilder() {
            if (this.chessBuilder_ == null) {
               this.chessBuilder_ = new SingleFieldBuilderV3(this.getChess(), this.getParentForChildren(), this.isClean());
               this.chess_ = null;
            }

            return this.chessBuilder_;
         }

         private void ensurePrizeIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOpen_12104.mutableCopy(this.prizeIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPrizeIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.prizeIds_) : this.prizeIds_);
         }

         public int getPrizeIdsCount() {
            return this.prizeIds_.size();
         }

         public int getPrizeIds(int index) {
            return this.prizeIds_.getInt(index);
         }

         public Builder setPrizeIds(int index, int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPrizeIds(int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPrizeIds(Iterable<? extends Integer> values) {
            this.ensurePrizeIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prizeIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPrizeIds() {
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOpen_12104.emptyIntList();
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

   public static final class C2S_TongQueParkOneKeyOpen_12105 extends GeneratedMessageV3 implements C2S_TongQueParkOneKeyOpen_12105OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOneKeyOpen_12105 DEFAULT_INSTANCE = new C2S_TongQueParkOneKeyOpen_12105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOneKeyOpen_12105> PARSER = new AbstractParser<C2S_TongQueParkOneKeyOpen_12105>() {
         public C2S_TongQueParkOneKeyOpen_12105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOneKeyOpen_12105(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOneKeyOpen_12105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOneKeyOpen_12105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOneKeyOpen_12105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOneKeyOpen_12105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_12105.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkOneKeyOpen_12105)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOneKeyOpen_12105 other = (C2S_TongQueParkOneKeyOpen_12105)obj;
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

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_12105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_12105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_12105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOneKeyOpen_12105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOneKeyOpen_12105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOneKeyOpen_12105> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOneKeyOpen_12105> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOneKeyOpen_12105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOneKeyOpen_12105OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_12105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkOneKeyOpen_12105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_12105_descriptor;
         }

         public C2S_TongQueParkOneKeyOpen_12105 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkOneKeyOpen_12105.getDefaultInstance();
         }

         public C2S_TongQueParkOneKeyOpen_12105 build() {
            C2S_TongQueParkOneKeyOpen_12105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOneKeyOpen_12105 buildPartial() {
            C2S_TongQueParkOneKeyOpen_12105 result = new C2S_TongQueParkOneKeyOpen_12105(this);
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
            if (other instanceof C2S_TongQueParkOneKeyOpen_12105) {
               return this.mergeFrom((C2S_TongQueParkOneKeyOpen_12105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOneKeyOpen_12105 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkOneKeyOpen_12105.getDefaultInstance()) {
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
            C2S_TongQueParkOneKeyOpen_12105 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_12105)TongQueParkMsg.C2S_TongQueParkOneKeyOpen_12105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_12105)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkOneKeyOpen_12106 extends GeneratedMessageV3 implements S2C_TongQueParkOneKeyOpen_12106OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOneKeyOpen_12106 DEFAULT_INSTANCE = new S2C_TongQueParkOneKeyOpen_12106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOneKeyOpen_12106> PARSER = new AbstractParser<S2C_TongQueParkOneKeyOpen_12106>() {
         public S2C_TongQueParkOneKeyOpen_12106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOneKeyOpen_12106(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOneKeyOpen_12106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOneKeyOpen_12106() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOneKeyOpen_12106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOneKeyOpen_12106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.chessList_.add(input.readMessage(TongQueParkMsg.ChessData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.prizeIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.prizeIds_.addInt(input.readInt32());
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
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.prizeIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_12106.class, Builder.class);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public List<Integer> getPrizeIdsList() {
         return this.prizeIds_;
      }

      public int getPrizeIdsCount() {
         return this.prizeIds_.size();
      }

      public int getPrizeIds(int index) {
         return this.prizeIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.chessList_.get(i));
         }

         for(int i = 0; i < this.prizeIds_.size(); ++i) {
            output.writeInt32(2, this.prizeIds_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.chessList_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.prizeIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.prizeIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPrizeIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkOneKeyOpen_12106)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOneKeyOpen_12106 other = (S2C_TongQueParkOneKeyOpen_12106)obj;
            if (!this.getChessListList().equals(other.getChessListList())) {
               return false;
            } else if (!this.getPrizeIdsList().equals(other.getPrizeIdsList())) {
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
            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            if (this.getPrizeIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrizeIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_12106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_12106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_12106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOneKeyOpen_12106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOneKeyOpen_12106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOneKeyOpen_12106> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOneKeyOpen_12106> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOneKeyOpen_12106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOneKeyOpen_12106OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_12106.class, Builder.class);
         }

         private Builder() {
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.alwaysUseFieldBuilders) {
               this.getChessListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.chessListBuilder_.clear();
            }

            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_12106_descriptor;
         }

         public S2C_TongQueParkOneKeyOpen_12106 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.getDefaultInstance();
         }

         public S2C_TongQueParkOneKeyOpen_12106 build() {
            S2C_TongQueParkOneKeyOpen_12106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOneKeyOpen_12106 buildPartial() {
            S2C_TongQueParkOneKeyOpen_12106 result = new S2C_TongQueParkOneKeyOpen_12106(this);
            int from_bitField0_ = this.bitField0_;
            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -2;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.prizeIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.prizeIds_ = this.prizeIds_;
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
            if (other instanceof S2C_TongQueParkOneKeyOpen_12106) {
               return this.mergeFrom((S2C_TongQueParkOneKeyOpen_12106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOneKeyOpen_12106 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.getDefaultInstance()) {
               return this;
            } else {
               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -2;
                     this.chessListBuilder_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               if (!other.prizeIds_.isEmpty()) {
                  if (this.prizeIds_.isEmpty()) {
                     this.prizeIds_ = other.prizeIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePrizeIdsIsMutable();
                     this.prizeIds_.addAll(other.prizeIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkOneKeyOpen_12106 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_12106)TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_12106)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         private void ensurePrizeIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.mutableCopy(this.prizeIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPrizeIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.prizeIds_) : this.prizeIds_);
         }

         public int getPrizeIdsCount() {
            return this.prizeIds_.size();
         }

         public int getPrizeIds(int index) {
            return this.prizeIds_.getInt(index);
         }

         public Builder setPrizeIds(int index, int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPrizeIds(int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPrizeIds(Iterable<? extends Integer> values) {
            this.ensurePrizeIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prizeIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPrizeIds() {
            this.prizeIds_ = TongQueParkMsg.S2C_TongQueParkOneKeyOpen_12106.emptyIntList();
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

   public static final class C2S_TongQueParkFlush_12107 extends GeneratedMessageV3 implements C2S_TongQueParkFlush_12107OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkFlush_12107 DEFAULT_INSTANCE = new C2S_TongQueParkFlush_12107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkFlush_12107> PARSER = new AbstractParser<C2S_TongQueParkFlush_12107>() {
         public C2S_TongQueParkFlush_12107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkFlush_12107(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkFlush_12107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkFlush_12107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkFlush_12107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkFlush_12107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_12107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkFlush_12107)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkFlush_12107 other = (C2S_TongQueParkFlush_12107)obj;
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

      public static C2S_TongQueParkFlush_12107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_12107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_12107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_12107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_12107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_12107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkFlush_12107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkFlush_12107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkFlush_12107> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkFlush_12107> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkFlush_12107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkFlush_12107OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_12107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkFlush_12107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFlush_12107_descriptor;
         }

         public C2S_TongQueParkFlush_12107 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkFlush_12107.getDefaultInstance();
         }

         public C2S_TongQueParkFlush_12107 build() {
            C2S_TongQueParkFlush_12107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkFlush_12107 buildPartial() {
            C2S_TongQueParkFlush_12107 result = new C2S_TongQueParkFlush_12107(this);
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
            if (other instanceof C2S_TongQueParkFlush_12107) {
               return this.mergeFrom((C2S_TongQueParkFlush_12107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkFlush_12107 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkFlush_12107.getDefaultInstance()) {
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
            C2S_TongQueParkFlush_12107 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkFlush_12107)TongQueParkMsg.C2S_TongQueParkFlush_12107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkFlush_12107)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkFlush_12108 extends GeneratedMessageV3 implements S2C_TongQueParkFlush_12108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSHCOUNT_FIELD_NUMBER = 1;
      private int flushCount_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkFlush_12108 DEFAULT_INSTANCE = new S2C_TongQueParkFlush_12108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkFlush_12108> PARSER = new AbstractParser<S2C_TongQueParkFlush_12108>() {
         public S2C_TongQueParkFlush_12108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkFlush_12108(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkFlush_12108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkFlush_12108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkFlush_12108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkFlush_12108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flushCount_ = input.readInt32();
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_12108.class, Builder.class);
      }

      public boolean hasFlushCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFlushCount() {
         return this.flushCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlushCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.flushCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.flushCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkFlush_12108)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkFlush_12108 other = (S2C_TongQueParkFlush_12108)obj;
            if (this.hasFlushCount() != other.hasFlushCount()) {
               return false;
            } else if (this.hasFlushCount() && this.getFlushCount() != other.getFlushCount()) {
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
            if (this.hasFlushCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFlushCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_12108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_12108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_12108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_12108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_12108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkFlush_12108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkFlush_12108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkFlush_12108> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkFlush_12108> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkFlush_12108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkFlush_12108OrBuilder {
         private int bitField0_;
         private int flushCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_12108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkFlush_12108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.flushCount_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFlush_12108_descriptor;
         }

         public S2C_TongQueParkFlush_12108 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkFlush_12108.getDefaultInstance();
         }

         public S2C_TongQueParkFlush_12108 build() {
            S2C_TongQueParkFlush_12108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkFlush_12108 buildPartial() {
            S2C_TongQueParkFlush_12108 result = new S2C_TongQueParkFlush_12108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flushCount_ = this.flushCount_;
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
            if (other instanceof S2C_TongQueParkFlush_12108) {
               return this.mergeFrom((S2C_TongQueParkFlush_12108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkFlush_12108 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkFlush_12108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlushCount()) {
                  this.setFlushCount(other.getFlushCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFlushCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkFlush_12108 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkFlush_12108)TongQueParkMsg.S2C_TongQueParkFlush_12108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkFlush_12108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlushCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFlushCount() {
            return this.flushCount_;
         }

         public Builder setFlushCount(int value) {
            this.bitField0_ |= 1;
            this.flushCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushCount() {
            this.bitField0_ &= -2;
            this.flushCount_ = 0;
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

   public static final class C2S_TongQueParkFly_12109 extends GeneratedMessageV3 implements C2S_TongQueParkFly_12109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkFly_12109 DEFAULT_INSTANCE = new C2S_TongQueParkFly_12109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkFly_12109> PARSER = new AbstractParser<C2S_TongQueParkFly_12109>() {
         public C2S_TongQueParkFly_12109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkFly_12109(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkFly_12109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkFly_12109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkFly_12109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkFly_12109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFly_12109.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TongQueParkFly_12109)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkFly_12109 other = (C2S_TongQueParkFly_12109)obj;
            if (this.hasType() != other.hasType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TongQueParkFly_12109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFly_12109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFly_12109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFly_12109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFly_12109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFly_12109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkFly_12109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkFly_12109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkFly_12109> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkFly_12109> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkFly_12109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkFly_12109OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFly_12109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkFly_12109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkFly_12109_descriptor;
         }

         public C2S_TongQueParkFly_12109 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkFly_12109.getDefaultInstance();
         }

         public C2S_TongQueParkFly_12109 build() {
            C2S_TongQueParkFly_12109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkFly_12109 buildPartial() {
            C2S_TongQueParkFly_12109 result = new C2S_TongQueParkFly_12109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_TongQueParkFly_12109) {
               return this.mergeFrom((C2S_TongQueParkFly_12109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkFly_12109 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkFly_12109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            C2S_TongQueParkFly_12109 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkFly_12109)TongQueParkMsg.C2S_TongQueParkFly_12109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkFly_12109)e.getUnfinishedMessage();
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

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
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

   public static final class S2C_TongQueParkFly_12110 extends GeneratedMessageV3 implements S2C_TongQueParkFly_12110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int FLYGOLDCOUNT_FIELD_NUMBER = 2;
      private int flyGoldCount_;
      public static final int FLOORID_FIELD_NUMBER = 3;
      private int floorId_;
      public static final int ISREWARDBEAUTY_FIELD_NUMBER = 4;
      private boolean isRewardBeauty_;
      public static final int REWARDS_FIELD_NUMBER = 5;
      private List<FloorRewardData> rewards_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 6;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkFly_12110 DEFAULT_INSTANCE = new S2C_TongQueParkFly_12110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkFly_12110> PARSER = new AbstractParser<S2C_TongQueParkFly_12110>() {
         public S2C_TongQueParkFly_12110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkFly_12110(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkFly_12110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkFly_12110() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkFly_12110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkFly_12110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.flyGoldCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.floorId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isRewardBeauty_ = input.readBool();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.rewards_.add(input.readMessage(TongQueParkMsg.FloorRewardData.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.dailyDrawNum_ = input.readInt32();
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFly_12110.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasFlyGoldCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFlyGoldCount() {
         return this.flyGoldCount_;
      }

      public boolean hasFloorId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFloorId() {
         return this.floorId_;
      }

      public boolean hasIsRewardBeauty() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsRewardBeauty() {
         return this.isRewardBeauty_;
      }

      public List<FloorRewardData> getRewardsList() {
         return this.rewards_;
      }

      public List<? extends FloorRewardDataOrBuilder> getRewardsOrBuilderList() {
         return this.rewards_;
      }

      public int getRewardsCount() {
         return this.rewards_.size();
      }

      public FloorRewardData getRewards(int index) {
         return (FloorRewardData)this.rewards_.get(index);
      }

      public FloorRewardDataOrBuilder getRewardsOrBuilder(int index) {
         return (FloorRewardDataOrBuilder)this.rewards_.get(index);
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
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
         } else if (!this.hasFlyGoldCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFloorId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsRewardBeauty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.flyGoldCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.floorId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isRewardBeauty_);
         }

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.dailyDrawNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.flyGoldCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.floorId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isRewardBeauty_);
            }

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkFly_12110)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkFly_12110 other = (S2C_TongQueParkFly_12110)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasFlyGoldCount() != other.hasFlyGoldCount()) {
               return false;
            } else if (this.hasFlyGoldCount() && this.getFlyGoldCount() != other.getFlyGoldCount()) {
               return false;
            } else if (this.hasFloorId() != other.hasFloorId()) {
               return false;
            } else if (this.hasFloorId() && this.getFloorId() != other.getFloorId()) {
               return false;
            } else if (this.hasIsRewardBeauty() != other.hasIsRewardBeauty()) {
               return false;
            } else if (this.hasIsRewardBeauty() && this.getIsRewardBeauty() != other.getIsRewardBeauty()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
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
               hash = 53 * hash + this.getType();
            }

            if (this.hasFlyGoldCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFlyGoldCount();
            }

            if (this.hasFloorId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFloorId();
            }

            if (this.hasIsRewardBeauty()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRewardBeauty());
            }

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkFly_12110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFly_12110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFly_12110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFly_12110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFly_12110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFly_12110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkFly_12110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkFly_12110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkFly_12110> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkFly_12110> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkFly_12110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkFly_12110OrBuilder {
         private int bitField0_;
         private int type_;
         private int flyGoldCount_;
         private int floorId_;
         private boolean isRewardBeauty_;
         private List<FloorRewardData> rewards_;
         private RepeatedFieldBuilderV3<FloorRewardData, FloorRewardData.Builder, FloorRewardDataOrBuilder> rewardsBuilder_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFly_12110.class, Builder.class);
         }

         private Builder() {
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkFly_12110.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.flyGoldCount_ = 0;
            this.bitField0_ &= -3;
            this.floorId_ = 0;
            this.bitField0_ &= -5;
            this.isRewardBeauty_ = false;
            this.bitField0_ &= -9;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkFly_12110_descriptor;
         }

         public S2C_TongQueParkFly_12110 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkFly_12110.getDefaultInstance();
         }

         public S2C_TongQueParkFly_12110 build() {
            S2C_TongQueParkFly_12110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkFly_12110 buildPartial() {
            S2C_TongQueParkFly_12110 result = new S2C_TongQueParkFly_12110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.flyGoldCount_ = this.flyGoldCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.floorId_ = this.floorId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isRewardBeauty_ = this.isRewardBeauty_;
               to_bitField0_ |= 8;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -17;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_TongQueParkFly_12110) {
               return this.mergeFrom((S2C_TongQueParkFly_12110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkFly_12110 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkFly_12110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasFlyGoldCount()) {
                  this.setFlyGoldCount(other.getFlyGoldCount());
               }

               if (other.hasFloorId()) {
                  this.setFloorId(other.getFloorId());
               }

               if (other.hasIsRewardBeauty()) {
                  this.setIsRewardBeauty(other.getIsRewardBeauty());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureRewardsIsMutable();
                        this.rewards_.addAll(other.rewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewards_.isEmpty()) {
                  if (this.rewardsBuilder_.isEmpty()) {
                     this.rewardsBuilder_.dispose();
                     this.rewardsBuilder_ = null;
                     this.rewards_ = other.rewards_;
                     this.bitField0_ &= -17;
                     this.rewardsBuilder_ = TongQueParkMsg.S2C_TongQueParkFly_12110.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasFlyGoldCount()) {
               return false;
            } else if (!this.hasFloorId()) {
               return false;
            } else if (!this.hasIsRewardBeauty()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardsCount(); ++i) {
                  if (!this.getRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkFly_12110 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkFly_12110)TongQueParkMsg.S2C_TongQueParkFly_12110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkFly_12110)e.getUnfinishedMessage();
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

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFlyGoldCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFlyGoldCount() {
            return this.flyGoldCount_;
         }

         public Builder setFlyGoldCount(int value) {
            this.bitField0_ |= 2;
            this.flyGoldCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlyGoldCount() {
            this.bitField0_ &= -3;
            this.flyGoldCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFloorId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFloorId() {
            return this.floorId_;
         }

         public Builder setFloorId(int value) {
            this.bitField0_ |= 4;
            this.floorId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFloorId() {
            this.bitField0_ &= -5;
            this.floorId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsRewardBeauty() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsRewardBeauty() {
            return this.isRewardBeauty_;
         }

         public Builder setIsRewardBeauty(boolean value) {
            this.bitField0_ |= 8;
            this.isRewardBeauty_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRewardBeauty() {
            this.bitField0_ &= -9;
            this.isRewardBeauty_ = false;
            this.onChanged();
            return this;
         }

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 16;
            }

         }

         public List<FloorRewardData> getRewardsList() {
            return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
         }

         public int getRewardsCount() {
            return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
         }

         public FloorRewardData getRewards(int index) {
            return this.rewardsBuilder_ == null ? (FloorRewardData)this.rewards_.get(index) : (FloorRewardData)this.rewardsBuilder_.getMessage(index);
         }

         public Builder setRewards(int index, FloorRewardData value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.set(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewards(int index, FloorRewardData.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(FloorRewardData value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewards(int index, FloorRewardData value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewards(FloorRewardData.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(int index, FloorRewardData.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewards(Iterable<? extends FloorRewardData> values) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewards_);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewards() {
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewards(int index) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.remove(index);
               this.onChanged();
            } else {
               this.rewardsBuilder_.remove(index);
            }

            return this;
         }

         public FloorRewardData.Builder getRewardsBuilder(int index) {
            return (FloorRewardData.Builder)this.getRewardsFieldBuilder().getBuilder(index);
         }

         public FloorRewardDataOrBuilder getRewardsOrBuilder(int index) {
            return this.rewardsBuilder_ == null ? (FloorRewardDataOrBuilder)this.rewards_.get(index) : (FloorRewardDataOrBuilder)this.rewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends FloorRewardDataOrBuilder> getRewardsOrBuilderList() {
            return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
         }

         public FloorRewardData.Builder addRewardsBuilder() {
            return (FloorRewardData.Builder)this.getRewardsFieldBuilder().addBuilder(TongQueParkMsg.FloorRewardData.getDefaultInstance());
         }

         public FloorRewardData.Builder addRewardsBuilder(int index) {
            return (FloorRewardData.Builder)this.getRewardsFieldBuilder().addBuilder(index, TongQueParkMsg.FloorRewardData.getDefaultInstance());
         }

         public List<FloorRewardData.Builder> getRewardsBuilderList() {
            return this.getRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FloorRewardData, FloorRewardData.Builder, FloorRewardDataOrBuilder> getRewardsFieldBuilder() {
            if (this.rewardsBuilder_ == null) {
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 32;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -33;
            this.dailyDrawNum_ = 0;
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

   public static final class C2S_TongQueParkBuyItem_12111 extends GeneratedMessageV3 implements C2S_TongQueParkBuyItem_12111OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkBuyItem_12111 DEFAULT_INSTANCE = new C2S_TongQueParkBuyItem_12111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkBuyItem_12111> PARSER = new AbstractParser<C2S_TongQueParkBuyItem_12111>() {
         public C2S_TongQueParkBuyItem_12111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkBuyItem_12111(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkBuyItem_12111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkBuyItem_12111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkBuyItem_12111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkBuyItem_12111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkBuyItem_12111.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkBuyItem_12111)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkBuyItem_12111 other = (C2S_TongQueParkBuyItem_12111)obj;
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

      public static C2S_TongQueParkBuyItem_12111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkBuyItem_12111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkBuyItem_12111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkBuyItem_12111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkBuyItem_12111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkBuyItem_12111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkBuyItem_12111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkBuyItem_12111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkBuyItem_12111> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkBuyItem_12111> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkBuyItem_12111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkBuyItem_12111OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkBuyItem_12111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkBuyItem_12111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkBuyItem_12111_descriptor;
         }

         public C2S_TongQueParkBuyItem_12111 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkBuyItem_12111.getDefaultInstance();
         }

         public C2S_TongQueParkBuyItem_12111 build() {
            C2S_TongQueParkBuyItem_12111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkBuyItem_12111 buildPartial() {
            C2S_TongQueParkBuyItem_12111 result = new C2S_TongQueParkBuyItem_12111(this);
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
            if (other instanceof C2S_TongQueParkBuyItem_12111) {
               return this.mergeFrom((C2S_TongQueParkBuyItem_12111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkBuyItem_12111 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkBuyItem_12111.getDefaultInstance()) {
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
            C2S_TongQueParkBuyItem_12111 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkBuyItem_12111)TongQueParkMsg.C2S_TongQueParkBuyItem_12111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkBuyItem_12111)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkBuyItem_12112 extends GeneratedMessageV3 implements S2C_TongQueParkBuyItem_12112OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkBuyItem_12112 DEFAULT_INSTANCE = new S2C_TongQueParkBuyItem_12112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkBuyItem_12112> PARSER = new AbstractParser<S2C_TongQueParkBuyItem_12112>() {
         public S2C_TongQueParkBuyItem_12112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkBuyItem_12112(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkBuyItem_12112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkBuyItem_12112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkBuyItem_12112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkBuyItem_12112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkBuyItem_12112.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkBuyItem_12112)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkBuyItem_12112 other = (S2C_TongQueParkBuyItem_12112)obj;
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

      public static S2C_TongQueParkBuyItem_12112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkBuyItem_12112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkBuyItem_12112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkBuyItem_12112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkBuyItem_12112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkBuyItem_12112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkBuyItem_12112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkBuyItem_12112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkBuyItem_12112> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkBuyItem_12112> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkBuyItem_12112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkBuyItem_12112OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkBuyItem_12112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkBuyItem_12112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkBuyItem_12112_descriptor;
         }

         public S2C_TongQueParkBuyItem_12112 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkBuyItem_12112.getDefaultInstance();
         }

         public S2C_TongQueParkBuyItem_12112 build() {
            S2C_TongQueParkBuyItem_12112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkBuyItem_12112 buildPartial() {
            S2C_TongQueParkBuyItem_12112 result = new S2C_TongQueParkBuyItem_12112(this);
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
            if (other instanceof S2C_TongQueParkBuyItem_12112) {
               return this.mergeFrom((S2C_TongQueParkBuyItem_12112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkBuyItem_12112 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkBuyItem_12112.getDefaultInstance()) {
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
            S2C_TongQueParkBuyItem_12112 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkBuyItem_12112)TongQueParkMsg.S2C_TongQueParkBuyItem_12112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkBuyItem_12112)e.getUnfinishedMessage();
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

   public static final class C2S_TongQueParkCommitTask_12113 extends GeneratedMessageV3 implements C2S_TongQueParkCommitTask_12113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkCommitTask_12113 DEFAULT_INSTANCE = new C2S_TongQueParkCommitTask_12113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkCommitTask_12113> PARSER = new AbstractParser<C2S_TongQueParkCommitTask_12113>() {
         public C2S_TongQueParkCommitTask_12113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkCommitTask_12113(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkCommitTask_12113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkCommitTask_12113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkCommitTask_12113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkCommitTask_12113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_12113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkCommitTask_12113)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkCommitTask_12113 other = (C2S_TongQueParkCommitTask_12113)obj;
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

      public static C2S_TongQueParkCommitTask_12113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_12113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_12113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_12113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_12113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_12113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkCommitTask_12113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkCommitTask_12113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkCommitTask_12113> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkCommitTask_12113> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkCommitTask_12113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkCommitTask_12113OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_12113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_TongQueParkCommitTask_12113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_TongQueParkCommitTask_12113_descriptor;
         }

         public C2S_TongQueParkCommitTask_12113 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_TongQueParkCommitTask_12113.getDefaultInstance();
         }

         public C2S_TongQueParkCommitTask_12113 build() {
            C2S_TongQueParkCommitTask_12113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkCommitTask_12113 buildPartial() {
            C2S_TongQueParkCommitTask_12113 result = new C2S_TongQueParkCommitTask_12113(this);
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
            if (other instanceof C2S_TongQueParkCommitTask_12113) {
               return this.mergeFrom((C2S_TongQueParkCommitTask_12113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkCommitTask_12113 other) {
            if (other == TongQueParkMsg.C2S_TongQueParkCommitTask_12113.getDefaultInstance()) {
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
            C2S_TongQueParkCommitTask_12113 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkCommitTask_12113)TongQueParkMsg.C2S_TongQueParkCommitTask_12113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkCommitTask_12113)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkCommitTask_12114 extends GeneratedMessageV3 implements S2C_TongQueParkCommitTask_12114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkCommitTask_12114 DEFAULT_INSTANCE = new S2C_TongQueParkCommitTask_12114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkCommitTask_12114> PARSER = new AbstractParser<S2C_TongQueParkCommitTask_12114>() {
         public S2C_TongQueParkCommitTask_12114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkCommitTask_12114(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkCommitTask_12114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkCommitTask_12114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkCommitTask_12114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkCommitTask_12114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_12114.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkCommitTask_12114)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkCommitTask_12114 other = (S2C_TongQueParkCommitTask_12114)obj;
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

      public static S2C_TongQueParkCommitTask_12114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_12114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_12114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_12114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_12114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_12114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkCommitTask_12114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkCommitTask_12114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkCommitTask_12114> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkCommitTask_12114> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkCommitTask_12114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkCommitTask_12114OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_12114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkCommitTask_12114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkCommitTask_12114_descriptor;
         }

         public S2C_TongQueParkCommitTask_12114 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkCommitTask_12114.getDefaultInstance();
         }

         public S2C_TongQueParkCommitTask_12114 build() {
            S2C_TongQueParkCommitTask_12114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkCommitTask_12114 buildPartial() {
            S2C_TongQueParkCommitTask_12114 result = new S2C_TongQueParkCommitTask_12114(this);
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
            if (other instanceof S2C_TongQueParkCommitTask_12114) {
               return this.mergeFrom((S2C_TongQueParkCommitTask_12114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkCommitTask_12114 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkCommitTask_12114.getDefaultInstance()) {
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
            S2C_TongQueParkCommitTask_12114 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkCommitTask_12114)TongQueParkMsg.S2C_TongQueParkCommitTask_12114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkCommitTask_12114)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkTasks_12116 extends GeneratedMessageV3 implements S2C_TongQueParkTasks_12116OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkTasks_12116 DEFAULT_INSTANCE = new S2C_TongQueParkTasks_12116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkTasks_12116> PARSER = new AbstractParser<S2C_TongQueParkTasks_12116>() {
         public S2C_TongQueParkTasks_12116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkTasks_12116(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkTasks_12116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkTasks_12116() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkTasks_12116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkTasks_12116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_12116.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkTasks_12116)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkTasks_12116 other = (S2C_TongQueParkTasks_12116)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_12116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_12116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_12116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_12116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_12116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkTasks_12116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkTasks_12116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkTasks_12116> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkTasks_12116> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkTasks_12116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkTasks_12116OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_12116.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_TongQueParkTasks_12116.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_TongQueParkTasks_12116_descriptor;
         }

         public S2C_TongQueParkTasks_12116 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_TongQueParkTasks_12116.getDefaultInstance();
         }

         public S2C_TongQueParkTasks_12116 build() {
            S2C_TongQueParkTasks_12116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkTasks_12116 buildPartial() {
            S2C_TongQueParkTasks_12116 result = new S2C_TongQueParkTasks_12116(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_TongQueParkTasks_12116) {
               return this.mergeFrom((S2C_TongQueParkTasks_12116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkTasks_12116 other) {
            if (other == TongQueParkMsg.S2C_TongQueParkTasks_12116.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = TongQueParkMsg.S2C_TongQueParkTasks_12116.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkTasks_12116 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkTasks_12116)TongQueParkMsg.S2C_TongQueParkTasks_12116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkTasks_12116)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ChessList_12117 extends GeneratedMessageV3 implements C2S_ChessList_12117OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChessList_12117 DEFAULT_INSTANCE = new C2S_ChessList_12117();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChessList_12117> PARSER = new AbstractParser<C2S_ChessList_12117>() {
         public C2S_ChessList_12117 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChessList_12117(input, extensionRegistry);
         }
      };

      private C2S_ChessList_12117(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChessList_12117() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChessList_12117();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChessList_12117(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_12117.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChessList_12117)) {
            return super.equals(obj);
         } else {
            C2S_ChessList_12117 other = (C2S_ChessList_12117)obj;
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

      public static C2S_ChessList_12117 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_12117 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_12117 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_12117 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_12117 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_12117 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_12117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_12117 parseFrom(InputStream input) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_12117 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_12117 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChessList_12117 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_12117 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_12117 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_12117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChessList_12117 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChessList_12117 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChessList_12117> parser() {
         return PARSER;
      }

      public Parser<C2S_ChessList_12117> getParserForType() {
         return PARSER;
      }

      public C2S_ChessList_12117 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChessList_12117OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_12117.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.C2S_ChessList_12117.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_C2S_ChessList_12117_descriptor;
         }

         public C2S_ChessList_12117 getDefaultInstanceForType() {
            return TongQueParkMsg.C2S_ChessList_12117.getDefaultInstance();
         }

         public C2S_ChessList_12117 build() {
            C2S_ChessList_12117 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChessList_12117 buildPartial() {
            C2S_ChessList_12117 result = new C2S_ChessList_12117(this);
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
            if (other instanceof C2S_ChessList_12117) {
               return this.mergeFrom((C2S_ChessList_12117)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChessList_12117 other) {
            if (other == TongQueParkMsg.C2S_ChessList_12117.getDefaultInstance()) {
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
            C2S_ChessList_12117 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChessList_12117)TongQueParkMsg.C2S_ChessList_12117.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChessList_12117)e.getUnfinishedMessage();
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

   public static final class S2C_ChessList_12118 extends GeneratedMessageV3 implements S2C_ChessList_12118OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      private byte memoizedIsInitialized;
      private static final S2C_ChessList_12118 DEFAULT_INSTANCE = new S2C_ChessList_12118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChessList_12118> PARSER = new AbstractParser<S2C_ChessList_12118>() {
         public S2C_ChessList_12118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChessList_12118(input, extensionRegistry);
         }
      };

      private S2C_ChessList_12118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChessList_12118() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChessList_12118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChessList_12118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.chessList_.add(input.readMessage(TongQueParkMsg.ChessData.PARSER, extensionRegistry));
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
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_12118.class, Builder.class);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.chessList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.chessList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChessList_12118)) {
            return super.equals(obj);
         } else {
            S2C_ChessList_12118 other = (S2C_ChessList_12118)obj;
            if (!this.getChessListList().equals(other.getChessListList())) {
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
            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChessList_12118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_12118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_12118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_12118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_12118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_12118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_12118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_12118 parseFrom(InputStream input) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_12118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_12118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChessList_12118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_12118 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_12118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_12118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChessList_12118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChessList_12118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChessList_12118> parser() {
         return PARSER;
      }

      public Parser<S2C_ChessList_12118> getParserForType() {
         return PARSER;
      }

      public S2C_ChessList_12118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChessList_12118OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_12118.class, Builder.class);
         }

         private Builder() {
            this.chessList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chessList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueParkMsg.S2C_ChessList_12118.alwaysUseFieldBuilders) {
               this.getChessListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueParkMsg.internal_static_tongQuePark_com_gzbz_protobuf_S2C_ChessList_12118_descriptor;
         }

         public S2C_ChessList_12118 getDefaultInstanceForType() {
            return TongQueParkMsg.S2C_ChessList_12118.getDefaultInstance();
         }

         public S2C_ChessList_12118 build() {
            S2C_ChessList_12118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChessList_12118 buildPartial() {
            S2C_ChessList_12118 result = new S2C_ChessList_12118(this);
            int from_bitField0_ = this.bitField0_;
            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -2;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
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
            if (other instanceof S2C_ChessList_12118) {
               return this.mergeFrom((S2C_ChessList_12118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChessList_12118 other) {
            if (other == TongQueParkMsg.S2C_ChessList_12118.getDefaultInstance()) {
               return this;
            } else {
               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -2;
                     this.chessListBuilder_ = TongQueParkMsg.S2C_ChessList_12118.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChessList_12118 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChessList_12118)TongQueParkMsg.S2C_ChessList_12118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChessList_12118)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueParkMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ChessList_12117OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkBuyItem_12111OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkCommitTask_12113OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TongQueParkFlush_12107OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkFly_12109OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_TongQueParkMain_12101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOneKeyOpen_12105OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOpen_12103OrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();
   }

   public interface ChessDataOrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();

      boolean hasIconId();

      int getIconId();
   }

   public interface FloorRewardDataOrBuilder extends MessageOrBuilder {
      boolean hasFloor();

      int getFloor();

      boolean hasRewardIndex();

      int getRewardIndex();
   }

   public interface GiftDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasIsBuy();

      boolean getIsBuy();
   }

   public interface S2C_ChessList_12118OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);
   }

   public interface S2C_TongQueParkBuyItem_12112OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_TongQueParkCommitTask_12114OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TongQueParkFlush_12108OrBuilder extends MessageOrBuilder {
      boolean hasFlushCount();

      int getFlushCount();
   }

   public interface S2C_TongQueParkFly_12110OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasFlyGoldCount();

      int getFlyGoldCount();

      boolean hasFloorId();

      int getFloorId();

      boolean hasIsRewardBeauty();

      boolean getIsRewardBeauty();

      List<FloorRewardData> getRewardsList();

      FloorRewardData getRewards(int index);

      int getRewardsCount();

      List<? extends FloorRewardDataOrBuilder> getRewardsOrBuilderList();

      FloorRewardDataOrBuilder getRewardsOrBuilder(int index);

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_TongQueParkMain_12102OrBuilder extends MessageOrBuilder {
      boolean hasEndTime();

      int getEndTime();

      List<GiftData> getGiftListList();

      GiftData getGiftList(int index);

      int getGiftListCount();

      List<? extends GiftDataOrBuilder> getGiftListOrBuilderList();

      GiftDataOrBuilder getGiftListOrBuilder(int index);

      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);

      boolean hasFlushCount();

      int getFlushCount();

      boolean hasFloorId();

      int getFloorId();

      boolean hasFlyGoldCount();

      int getFlyGoldCount();

      boolean hasIsRewardBeauty();

      boolean getIsRewardBeauty();

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_TongQueParkOneKeyOpen_12106OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkOpen_12104OrBuilder extends MessageOrBuilder {
      boolean hasChess();

      ChessData getChess();

      ChessDataOrBuilder getChessOrBuilder();

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkTasks_12116OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }
}
