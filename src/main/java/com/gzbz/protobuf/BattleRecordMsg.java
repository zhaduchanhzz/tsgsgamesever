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

public final class BattleRecordMsg {
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BattleRecordMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012BattleRecord.proto\u0012\u001ebattleRecord.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fBattle.proto\"×\u0001\n\u0010BattleRecordInfo\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bwatchNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bshareNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nisThumbsUp\u0018\u0005 \u0002(\b\u0012\u0011\n\tisCollect\u0018\u0006 \u0002(\b\u0012?\n\u0006result\u0018\u0007 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u0010\n\bserverId\u0018\b \u0001(\u0005\"l\n\u0017SpecialBattleRecordInfo\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0003\u0012?\n\u0006result\u0018\u0002 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"&\n\u0015C2S_BattleRecord_8403\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\"\u0094\u0001\n\u001bS2C_BattleRecordResult_8404\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tenableNum\u0018\u0002 \u0002(\u0005\u0012?\n\u0005infos\u0018\u0003 \u0003(\u000b20.battleRecord.com.gzbz.protobuf.BattleRecordInfo\u0012\u0012\n\ncollectNum\u0018\u0004 \u0002(\u0005\"7\n\u0014C2S_ShareRecord_8409\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\"O\n\u001aS2C_ShareRecordResult_8410\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bshareNum\u0018\u0003 \u0002(\u0005\"L\n\u0016C2S_CollectRecord_8411\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\toperation\u0018\u0003 \u0002(\u0005\"y\n\u001cS2C_CollectRecordResult_8412\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\toperation\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tisCollect\u0018\u0004 \u0002(\b\u0012\u0012\n\ncollectNum\u0018\u0005 \u0002(\u0005\":\n\u0017C2S_ThumbsUpRecord_8413\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\"|\n\u001dS2C_ThumbsUpRecordResult_8414\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tenableNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nisThumbsUp\u0018\u0005 \u0002(\b\"7\n\u0014C2S_WatchRecord_8415\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\"O\n\u001aS2C_WatchRecordResult_8416\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bwatchNum\u0018\u0003 \u0002(\u0005\"L\n\u001aC2S_SpecialRecordList_8417\u0012\f\n\u0004page\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bpageSize\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006nation\u0018\u0003 \u0003(\u0005\"\u0099\u0001\n\u001aS2C_SpecialRecordList_8418\u0012\"\n\bpageInfo\u0018\u0001 \u0002(\u000b2\u0010.common.PageInfo\u0012\u000e\n\u0006nation\u0018\u0002 \u0003(\u0005\u0012G\n\u0006record\u0018\u0003 \u0003(\u000b27.battleRecord.com.gzbz.protobuf.SpecialBattleRecordInfo\"/\n\u001bC2S_WatchSpecialRecord_8419\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0003B&\n\u0011com.gzbz.protobufB\u000fBattleRecordMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor, new String[]{"RecordId", "WatchNum", "ShareNum", "ThumbsUpNum", "IsThumbsUp", "IsCollect", "Result", "ServerId"});
      internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor, new String[]{"RecordId", "Result"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor, new String[]{"Model"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor, new String[]{"Model", "EnableNum", "Infos", "CollectNum"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor, new String[]{"Model", "RecordId"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor, new String[]{"Model", "RecordId", "ShareNum"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor, new String[]{"Model", "RecordId", "Operation"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor, new String[]{"Model", "RecordId", "Operation", "IsCollect", "CollectNum"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor, new String[]{"Model", "RecordId"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor, new String[]{"Model", "EnableNum", "RecordId", "ThumbsUpNum", "IsThumbsUp"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor, new String[]{"Model", "RecordId"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor, new String[]{"Model", "RecordId", "WatchNum"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor, new String[]{"Page", "PageSize", "Nation"});
      internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor, new String[]{"PageInfo", "Nation", "Record"});
      internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor, new String[]{"RecordId"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class BattleRecordInfo extends GeneratedMessageV3 implements BattleRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int WATCHNUM_FIELD_NUMBER = 2;
      private int watchNum_;
      public static final int SHARENUM_FIELD_NUMBER = 3;
      private int shareNum_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 4;
      private int thumbsUpNum_;
      public static final int ISTHUMBSUP_FIELD_NUMBER = 5;
      private boolean isThumbsUp_;
      public static final int ISCOLLECT_FIELD_NUMBER = 6;
      private boolean isCollect_;
      public static final int RESULT_FIELD_NUMBER = 7;
      private BattleMsg.S2C_BattleResult_6102 result_;
      public static final int SERVERID_FIELD_NUMBER = 8;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final BattleRecordInfo DEFAULT_INSTANCE = new BattleRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<BattleRecordInfo> PARSER = new AbstractParser<BattleRecordInfo>() {
         public BattleRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BattleRecordInfo(input, extensionRegistry);
         }
      };

      private BattleRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BattleRecordInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BattleRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BattleRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recordId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.watchNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.shareNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.thumbsUpNum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isThumbsUp_ = input.readBool();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.isCollect_ = input.readBool();
                        break;
                     case 58:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 64) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 64;
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.serverId_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BattleRecordInfo.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasWatchNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWatchNum() {
         return this.watchNum_;
      }

      public boolean hasShareNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShareNum() {
         return this.shareNum_;
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
      }

      public boolean hasIsThumbsUp() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsThumbsUp() {
         return this.isThumbsUp_;
      }

      public boolean hasIsCollect() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getIsCollect() {
         return this.isCollect_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 64) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShareNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsThumbsUp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsCollect()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.watchNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.shareNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isThumbsUp_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.isCollect_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeMessage(7, this.getResult());
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.watchNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.shareNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isThumbsUp_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isCollect_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeMessageSize(7, this.getResult());
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BattleRecordInfo)) {
            return super.equals(obj);
         } else {
            BattleRecordInfo other = (BattleRecordInfo)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasWatchNum() != other.hasWatchNum()) {
               return false;
            } else if (this.hasWatchNum() && this.getWatchNum() != other.getWatchNum()) {
               return false;
            } else if (this.hasShareNum() != other.hasShareNum()) {
               return false;
            } else if (this.hasShareNum() && this.getShareNum() != other.getShareNum()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasIsThumbsUp() != other.hasIsThumbsUp()) {
               return false;
            } else if (this.hasIsThumbsUp() && this.getIsThumbsUp() != other.getIsThumbsUp()) {
               return false;
            } else if (this.hasIsCollect() != other.hasIsCollect()) {
               return false;
            } else if (this.hasIsCollect() && this.getIsCollect() != other.getIsCollect()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasWatchNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWatchNum();
            }

            if (this.hasShareNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShareNum();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasIsThumbsUp()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsThumbsUp());
            }

            if (this.hasIsCollect()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCollect());
            }

            if (this.hasResult()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getResult().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BattleRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(InputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BattleRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BattleRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BattleRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BattleRecordInfo> parser() {
         return PARSER;
      }

      public Parser<BattleRecordInfo> getParserForType() {
         return PARSER;
      }

      public BattleRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattleRecordInfoOrBuilder {
         private int bitField0_;
         private int recordId_;
         private int watchNum_;
         private int shareNum_;
         private int thumbsUpNum_;
         private boolean isThumbsUp_;
         private boolean isCollect_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BattleRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.BattleRecordInfo.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.watchNum_ = 0;
            this.bitField0_ &= -3;
            this.shareNum_ = 0;
            this.bitField0_ &= -5;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -9;
            this.isThumbsUp_ = false;
            this.bitField0_ &= -17;
            this.isCollect_ = false;
            this.bitField0_ &= -33;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -65;
            this.serverId_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_BattleRecordInfo_descriptor;
         }

         public BattleRecordInfo getDefaultInstanceForType() {
            return BattleRecordMsg.BattleRecordInfo.getDefaultInstance();
         }

         public BattleRecordInfo build() {
            BattleRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BattleRecordInfo buildPartial() {
            BattleRecordInfo result = new BattleRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.watchNum_ = this.watchNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.shareNum_ = this.shareNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isThumbsUp_ = this.isThumbsUp_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.isCollect_ = this.isCollect_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
               }

               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof BattleRecordInfo) {
               return this.mergeFrom((BattleRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BattleRecordInfo other) {
            if (other == BattleRecordMsg.BattleRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasWatchNum()) {
                  this.setWatchNum(other.getWatchNum());
               }

               if (other.hasShareNum()) {
                  this.setShareNum(other.getShareNum());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasIsThumbsUp()) {
                  this.setIsThumbsUp(other.getIsThumbsUp());
               }

               if (other.hasIsCollect()) {
                  this.setIsCollect(other.getIsCollect());
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasWatchNum()) {
               return false;
            } else if (!this.hasShareNum()) {
               return false;
            } else if (!this.hasThumbsUpNum()) {
               return false;
            } else if (!this.hasIsThumbsUp()) {
               return false;
            } else if (!this.hasIsCollect()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BattleRecordInfo parsedMessage = null;

            try {
               parsedMessage = (BattleRecordInfo)BattleRecordMsg.BattleRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BattleRecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWatchNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWatchNum() {
            return this.watchNum_;
         }

         public Builder setWatchNum(int value) {
            this.bitField0_ |= 2;
            this.watchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWatchNum() {
            this.bitField0_ &= -3;
            this.watchNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShareNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShareNum() {
            return this.shareNum_;
         }

         public Builder setShareNum(int value) {
            this.bitField0_ |= 4;
            this.shareNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShareNum() {
            this.bitField0_ &= -5;
            this.shareNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 8;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -9;
            this.thumbsUpNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsThumbsUp() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsThumbsUp() {
            return this.isThumbsUp_;
         }

         public Builder setIsThumbsUp(boolean value) {
            this.bitField0_ |= 16;
            this.isThumbsUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsThumbsUp() {
            this.bitField0_ &= -17;
            this.isThumbsUp_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsCollect() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIsCollect() {
            return this.isCollect_;
         }

         public Builder setIsCollect(boolean value) {
            this.bitField0_ |= 32;
            this.isCollect_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCollect() {
            this.bitField0_ &= -33;
            this.isCollect_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 64) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -65;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 64;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 128;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -129;
            this.serverId_ = 0;
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

   public static final class SpecialBattleRecordInfo extends GeneratedMessageV3 implements SpecialBattleRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private long recordId_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private BattleMsg.S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final SpecialBattleRecordInfo DEFAULT_INSTANCE = new SpecialBattleRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SpecialBattleRecordInfo> PARSER = new AbstractParser<SpecialBattleRecordInfo>() {
         public SpecialBattleRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SpecialBattleRecordInfo(input, extensionRegistry);
         }
      };

      private SpecialBattleRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SpecialBattleRecordInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SpecialBattleRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SpecialBattleRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recordId_ = input.readInt64();
                        break;
                     case 18:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SpecialBattleRecordInfo.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getRecordId() {
         return this.recordId_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getResult());
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
               size += CodedOutputStream.computeInt64Size(1, this.recordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SpecialBattleRecordInfo)) {
            return super.equals(obj);
         } else {
            SpecialBattleRecordInfo other = (SpecialBattleRecordInfo)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
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
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getRecordId());
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SpecialBattleRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data);
      }

      public static SpecialBattleRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SpecialBattleRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data);
      }

      public static SpecialBattleRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SpecialBattleRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data);
      }

      public static SpecialBattleRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SpecialBattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SpecialBattleRecordInfo parseFrom(InputStream input) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SpecialBattleRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SpecialBattleRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SpecialBattleRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SpecialBattleRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SpecialBattleRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SpecialBattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SpecialBattleRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SpecialBattleRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SpecialBattleRecordInfo> parser() {
         return PARSER;
      }

      public Parser<SpecialBattleRecordInfo> getParserForType() {
         return PARSER;
      }

      public SpecialBattleRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpecialBattleRecordInfoOrBuilder {
         private int bitField0_;
         private long recordId_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SpecialBattleRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.SpecialBattleRecordInfo.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0L;
            this.bitField0_ &= -2;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_SpecialBattleRecordInfo_descriptor;
         }

         public SpecialBattleRecordInfo getDefaultInstanceForType() {
            return BattleRecordMsg.SpecialBattleRecordInfo.getDefaultInstance();
         }

         public SpecialBattleRecordInfo build() {
            SpecialBattleRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SpecialBattleRecordInfo buildPartial() {
            SpecialBattleRecordInfo result = new SpecialBattleRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
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
            if (other instanceof SpecialBattleRecordInfo) {
               return this.mergeFrom((SpecialBattleRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SpecialBattleRecordInfo other) {
            if (other == BattleRecordMsg.SpecialBattleRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SpecialBattleRecordInfo parsedMessage = null;

            try {
               parsedMessage = (SpecialBattleRecordInfo)BattleRecordMsg.SpecialBattleRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SpecialBattleRecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(long value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BattleRecord_8403 extends GeneratedMessageV3 implements C2S_BattleRecord_8403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecord_8403 DEFAULT_INSTANCE = new C2S_BattleRecord_8403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecord_8403> PARSER = new AbstractParser<C2S_BattleRecord_8403>() {
         public C2S_BattleRecord_8403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecord_8403(input, extensionRegistry);
         }
      };

      private C2S_BattleRecord_8403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecord_8403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecord_8403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecord_8403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_8403.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleRecord_8403)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecord_8403 other = (C2S_BattleRecord_8403)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleRecord_8403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_8403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_8403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_8403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_8403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_8403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_8403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_8403 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_8403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_8403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_8403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_8403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_8403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_8403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecord_8403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecord_8403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecord_8403> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecord_8403> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecord_8403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecord_8403OrBuilder {
         private int bitField0_;
         private int model_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_8403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_BattleRecord_8403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_BattleRecord_8403_descriptor;
         }

         public C2S_BattleRecord_8403 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_BattleRecord_8403.getDefaultInstance();
         }

         public C2S_BattleRecord_8403 build() {
            C2S_BattleRecord_8403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecord_8403 buildPartial() {
            C2S_BattleRecord_8403 result = new C2S_BattleRecord_8403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
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
            if (other instanceof C2S_BattleRecord_8403) {
               return this.mergeFrom((C2S_BattleRecord_8403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecord_8403 other) {
            if (other == BattleRecordMsg.C2S_BattleRecord_8403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasModel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleRecord_8403 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecord_8403)BattleRecordMsg.C2S_BattleRecord_8403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecord_8403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
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

   public static final class S2C_BattleRecordResult_8404 extends GeneratedMessageV3 implements S2C_BattleRecordResult_8404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int ENABLENUM_FIELD_NUMBER = 2;
      private int enableNum_;
      public static final int INFOS_FIELD_NUMBER = 3;
      private List<BattleRecordInfo> infos_;
      public static final int COLLECTNUM_FIELD_NUMBER = 4;
      private int collectNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleRecordResult_8404 DEFAULT_INSTANCE = new S2C_BattleRecordResult_8404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleRecordResult_8404> PARSER = new AbstractParser<S2C_BattleRecordResult_8404>() {
         public S2C_BattleRecordResult_8404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleRecordResult_8404(input, extensionRegistry);
         }
      };

      private S2C_BattleRecordResult_8404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleRecordResult_8404() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleRecordResult_8404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleRecordResult_8404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.enableNum_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.infos_.add(input.readMessage(BattleRecordMsg.BattleRecordInfo.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.collectNum_ = input.readInt32();
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecordResult_8404.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasEnableNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEnableNum() {
         return this.enableNum_;
      }

      public List<BattleRecordInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends BattleRecordInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public BattleRecordInfo getInfos(int index) {
         return (BattleRecordInfo)this.infos_.get(index);
      }

      public BattleRecordInfoOrBuilder getInfosOrBuilder(int index) {
         return (BattleRecordInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasCollectNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCollectNum() {
         return this.collectNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnableNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCollectNum()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.enableNum_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.collectNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.enableNum_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.collectNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleRecordResult_8404)) {
            return super.equals(obj);
         } else {
            S2C_BattleRecordResult_8404 other = (S2C_BattleRecordResult_8404)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasEnableNum() != other.hasEnableNum()) {
               return false;
            } else if (this.hasEnableNum() && this.getEnableNum() != other.getEnableNum()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasCollectNum() != other.hasCollectNum()) {
               return false;
            } else if (this.hasCollectNum() && this.getCollectNum() != other.getCollectNum()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasEnableNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEnableNum();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasCollectNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCollectNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleRecordResult_8404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordResult_8404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecordResult_8404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordResult_8404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordResult_8404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordResult_8404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleRecordResult_8404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleRecordResult_8404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleRecordResult_8404> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleRecordResult_8404> getParserForType() {
         return PARSER;
      }

      public S2C_BattleRecordResult_8404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleRecordResult_8404OrBuilder {
         private int bitField0_;
         private int model_;
         private int enableNum_;
         private List<BattleRecordInfo> infos_;
         private RepeatedFieldBuilderV3<BattleRecordInfo, BattleRecordInfo.Builder, BattleRecordInfoOrBuilder> infosBuilder_;
         private int collectNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecordResult_8404.class, Builder.class);
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
            if (BattleRecordMsg.S2C_BattleRecordResult_8404.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.enableNum_ = 0;
            this.bitField0_ &= -3;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infosBuilder_.clear();
            }

            this.collectNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_BattleRecordResult_8404_descriptor;
         }

         public S2C_BattleRecordResult_8404 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_BattleRecordResult_8404.getDefaultInstance();
         }

         public S2C_BattleRecordResult_8404 build() {
            S2C_BattleRecordResult_8404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleRecordResult_8404 buildPartial() {
            S2C_BattleRecordResult_8404 result = new S2C_BattleRecordResult_8404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.enableNum_ = this.enableNum_;
               to_bitField0_ |= 2;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -5;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.collectNum_ = this.collectNum_;
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
            if (other instanceof S2C_BattleRecordResult_8404) {
               return this.mergeFrom((S2C_BattleRecordResult_8404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleRecordResult_8404 other) {
            if (other == BattleRecordMsg.S2C_BattleRecordResult_8404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasEnableNum()) {
                  this.setEnableNum(other.getEnableNum());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.infosBuilder_ = BattleRecordMsg.S2C_BattleRecordResult_8404.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasCollectNum()) {
                  this.setCollectNum(other.getCollectNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasEnableNum()) {
               return false;
            } else if (!this.hasCollectNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleRecordResult_8404 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleRecordResult_8404)BattleRecordMsg.S2C_BattleRecordResult_8404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleRecordResult_8404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnableNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEnableNum() {
            return this.enableNum_;
         }

         public Builder setEnableNum(int value) {
            this.bitField0_ |= 2;
            this.enableNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnableNum() {
            this.bitField0_ &= -3;
            this.enableNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 4;
            }

         }

         public List<BattleRecordInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public BattleRecordInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (BattleRecordInfo)this.infos_.get(index) : (BattleRecordInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, BattleRecordInfo value) {
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

         public Builder setInfos(int index, BattleRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(BattleRecordInfo value) {
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

         public Builder addInfos(int index, BattleRecordInfo value) {
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

         public Builder addInfos(BattleRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, BattleRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends BattleRecordInfo> values) {
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
               this.bitField0_ &= -5;
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

         public BattleRecordInfo.Builder getInfosBuilder(int index) {
            return (BattleRecordInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public BattleRecordInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (BattleRecordInfoOrBuilder)this.infos_.get(index) : (BattleRecordInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BattleRecordInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public BattleRecordInfo.Builder addInfosBuilder() {
            return (BattleRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(BattleRecordMsg.BattleRecordInfo.getDefaultInstance());
         }

         public BattleRecordInfo.Builder addInfosBuilder(int index) {
            return (BattleRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, BattleRecordMsg.BattleRecordInfo.getDefaultInstance());
         }

         public List<BattleRecordInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BattleRecordInfo, BattleRecordInfo.Builder, BattleRecordInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasCollectNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCollectNum() {
            return this.collectNum_;
         }

         public Builder setCollectNum(int value) {
            this.bitField0_ |= 8;
            this.collectNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCollectNum() {
            this.bitField0_ &= -9;
            this.collectNum_ = 0;
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

   public static final class C2S_ShareRecord_8409 extends GeneratedMessageV3 implements C2S_ShareRecord_8409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_ShareRecord_8409 DEFAULT_INSTANCE = new C2S_ShareRecord_8409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShareRecord_8409> PARSER = new AbstractParser<C2S_ShareRecord_8409>() {
         public C2S_ShareRecord_8409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShareRecord_8409(input, extensionRegistry);
         }
      };

      private C2S_ShareRecord_8409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShareRecord_8409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShareRecord_8409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShareRecord_8409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareRecord_8409.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShareRecord_8409)) {
            return super.equals(obj);
         } else {
            C2S_ShareRecord_8409 other = (C2S_ShareRecord_8409)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShareRecord_8409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data);
      }

      public static C2S_ShareRecord_8409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareRecord_8409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data);
      }

      public static C2S_ShareRecord_8409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareRecord_8409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data);
      }

      public static C2S_ShareRecord_8409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareRecord_8409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareRecord_8409 parseFrom(InputStream input) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareRecord_8409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareRecord_8409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShareRecord_8409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareRecord_8409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareRecord_8409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareRecord_8409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShareRecord_8409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShareRecord_8409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShareRecord_8409> parser() {
         return PARSER;
      }

      public Parser<C2S_ShareRecord_8409> getParserForType() {
         return PARSER;
      }

      public C2S_ShareRecord_8409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShareRecord_8409OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareRecord_8409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_ShareRecord_8409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ShareRecord_8409_descriptor;
         }

         public C2S_ShareRecord_8409 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_ShareRecord_8409.getDefaultInstance();
         }

         public C2S_ShareRecord_8409 build() {
            C2S_ShareRecord_8409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShareRecord_8409 buildPartial() {
            C2S_ShareRecord_8409 result = new C2S_ShareRecord_8409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof C2S_ShareRecord_8409) {
               return this.mergeFrom((C2S_ShareRecord_8409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShareRecord_8409 other) {
            if (other == BattleRecordMsg.C2S_ShareRecord_8409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else {
               return this.hasRecordId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShareRecord_8409 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShareRecord_8409)BattleRecordMsg.C2S_ShareRecord_8409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShareRecord_8409)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
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

   public static final class S2C_ShareRecordResult_8410 extends GeneratedMessageV3 implements S2C_ShareRecordResult_8410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      public static final int SHARENUM_FIELD_NUMBER = 3;
      private int shareNum_;
      private byte memoizedIsInitialized;
      private static final S2C_ShareRecordResult_8410 DEFAULT_INSTANCE = new S2C_ShareRecordResult_8410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShareRecordResult_8410> PARSER = new AbstractParser<S2C_ShareRecordResult_8410>() {
         public S2C_ShareRecordResult_8410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShareRecordResult_8410(input, extensionRegistry);
         }
      };

      private S2C_ShareRecordResult_8410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShareRecordResult_8410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShareRecordResult_8410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShareRecordResult_8410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.shareNum_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareRecordResult_8410.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasShareNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShareNum() {
         return this.shareNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShareNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.shareNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.shareNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShareRecordResult_8410)) {
            return super.equals(obj);
         } else {
            S2C_ShareRecordResult_8410 other = (S2C_ShareRecordResult_8410)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasShareNum() != other.hasShareNum()) {
               return false;
            } else if (this.hasShareNum() && this.getShareNum() != other.getShareNum()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasShareNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShareNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShareRecordResult_8410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareRecordResult_8410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(InputStream input) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareRecordResult_8410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShareRecordResult_8410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareRecordResult_8410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareRecordResult_8410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShareRecordResult_8410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShareRecordResult_8410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShareRecordResult_8410> parser() {
         return PARSER;
      }

      public Parser<S2C_ShareRecordResult_8410> getParserForType() {
         return PARSER;
      }

      public S2C_ShareRecordResult_8410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShareRecordResult_8410OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;
         private int shareNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareRecordResult_8410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.S2C_ShareRecordResult_8410.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            this.shareNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ShareRecordResult_8410_descriptor;
         }

         public S2C_ShareRecordResult_8410 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_ShareRecordResult_8410.getDefaultInstance();
         }

         public S2C_ShareRecordResult_8410 build() {
            S2C_ShareRecordResult_8410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShareRecordResult_8410 buildPartial() {
            S2C_ShareRecordResult_8410 result = new S2C_ShareRecordResult_8410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.shareNum_ = this.shareNum_;
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
            if (other instanceof S2C_ShareRecordResult_8410) {
               return this.mergeFrom((S2C_ShareRecordResult_8410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShareRecordResult_8410 other) {
            if (other == BattleRecordMsg.S2C_ShareRecordResult_8410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasShareNum()) {
                  this.setShareNum(other.getShareNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else {
               return this.hasShareNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShareRecordResult_8410 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShareRecordResult_8410)BattleRecordMsg.S2C_ShareRecordResult_8410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShareRecordResult_8410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShareNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShareNum() {
            return this.shareNum_;
         }

         public Builder setShareNum(int value) {
            this.bitField0_ |= 4;
            this.shareNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShareNum() {
            this.bitField0_ &= -5;
            this.shareNum_ = 0;
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

   public static final class C2S_CollectRecord_8411 extends GeneratedMessageV3 implements C2S_CollectRecord_8411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      public static final int OPERATION_FIELD_NUMBER = 3;
      private int operation_;
      private byte memoizedIsInitialized;
      private static final C2S_CollectRecord_8411 DEFAULT_INSTANCE = new C2S_CollectRecord_8411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CollectRecord_8411> PARSER = new AbstractParser<C2S_CollectRecord_8411>() {
         public C2S_CollectRecord_8411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CollectRecord_8411(input, extensionRegistry);
         }
      };

      private C2S_CollectRecord_8411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CollectRecord_8411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CollectRecord_8411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CollectRecord_8411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.operation_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CollectRecord_8411.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasOperation() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOperation() {
         return this.operation_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOperation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.operation_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.operation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CollectRecord_8411)) {
            return super.equals(obj);
         } else {
            C2S_CollectRecord_8411 other = (C2S_CollectRecord_8411)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasOperation() != other.hasOperation()) {
               return false;
            } else if (this.hasOperation() && this.getOperation() != other.getOperation()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasOperation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOperation();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CollectRecord_8411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data);
      }

      public static C2S_CollectRecord_8411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CollectRecord_8411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data);
      }

      public static C2S_CollectRecord_8411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CollectRecord_8411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data);
      }

      public static C2S_CollectRecord_8411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CollectRecord_8411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CollectRecord_8411 parseFrom(InputStream input) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CollectRecord_8411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CollectRecord_8411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CollectRecord_8411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CollectRecord_8411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CollectRecord_8411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CollectRecord_8411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CollectRecord_8411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CollectRecord_8411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CollectRecord_8411> parser() {
         return PARSER;
      }

      public Parser<C2S_CollectRecord_8411> getParserForType() {
         return PARSER;
      }

      public C2S_CollectRecord_8411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CollectRecord_8411OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;
         private int operation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CollectRecord_8411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_CollectRecord_8411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            this.operation_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_CollectRecord_8411_descriptor;
         }

         public C2S_CollectRecord_8411 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_CollectRecord_8411.getDefaultInstance();
         }

         public C2S_CollectRecord_8411 build() {
            C2S_CollectRecord_8411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CollectRecord_8411 buildPartial() {
            C2S_CollectRecord_8411 result = new C2S_CollectRecord_8411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.operation_ = this.operation_;
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
            if (other instanceof C2S_CollectRecord_8411) {
               return this.mergeFrom((C2S_CollectRecord_8411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CollectRecord_8411 other) {
            if (other == BattleRecordMsg.C2S_CollectRecord_8411.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasOperation()) {
                  this.setOperation(other.getOperation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else {
               return this.hasOperation();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CollectRecord_8411 parsedMessage = null;

            try {
               parsedMessage = (C2S_CollectRecord_8411)BattleRecordMsg.C2S_CollectRecord_8411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CollectRecord_8411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOperation() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOperation() {
            return this.operation_;
         }

         public Builder setOperation(int value) {
            this.bitField0_ |= 4;
            this.operation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOperation() {
            this.bitField0_ &= -5;
            this.operation_ = 0;
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

   public static final class S2C_CollectRecordResult_8412 extends GeneratedMessageV3 implements S2C_CollectRecordResult_8412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      public static final int OPERATION_FIELD_NUMBER = 3;
      private int operation_;
      public static final int ISCOLLECT_FIELD_NUMBER = 4;
      private boolean isCollect_;
      public static final int COLLECTNUM_FIELD_NUMBER = 5;
      private int collectNum_;
      private byte memoizedIsInitialized;
      private static final S2C_CollectRecordResult_8412 DEFAULT_INSTANCE = new S2C_CollectRecordResult_8412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CollectRecordResult_8412> PARSER = new AbstractParser<S2C_CollectRecordResult_8412>() {
         public S2C_CollectRecordResult_8412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CollectRecordResult_8412(input, extensionRegistry);
         }
      };

      private S2C_CollectRecordResult_8412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CollectRecordResult_8412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CollectRecordResult_8412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CollectRecordResult_8412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.operation_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isCollect_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.collectNum_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CollectRecordResult_8412.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasOperation() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOperation() {
         return this.operation_;
      }

      public boolean hasIsCollect() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsCollect() {
         return this.isCollect_;
      }

      public boolean hasCollectNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCollectNum() {
         return this.collectNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOperation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsCollect()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCollectNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.operation_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isCollect_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.collectNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.operation_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isCollect_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.collectNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CollectRecordResult_8412)) {
            return super.equals(obj);
         } else {
            S2C_CollectRecordResult_8412 other = (S2C_CollectRecordResult_8412)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasOperation() != other.hasOperation()) {
               return false;
            } else if (this.hasOperation() && this.getOperation() != other.getOperation()) {
               return false;
            } else if (this.hasIsCollect() != other.hasIsCollect()) {
               return false;
            } else if (this.hasIsCollect() && this.getIsCollect() != other.getIsCollect()) {
               return false;
            } else if (this.hasCollectNum() != other.hasCollectNum()) {
               return false;
            } else if (this.hasCollectNum() && this.getCollectNum() != other.getCollectNum()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasOperation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOperation();
            }

            if (this.hasIsCollect()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCollect());
            }

            if (this.hasCollectNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCollectNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CollectRecordResult_8412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CollectRecordResult_8412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(InputStream input) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CollectRecordResult_8412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CollectRecordResult_8412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CollectRecordResult_8412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CollectRecordResult_8412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CollectRecordResult_8412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CollectRecordResult_8412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CollectRecordResult_8412> parser() {
         return PARSER;
      }

      public Parser<S2C_CollectRecordResult_8412> getParserForType() {
         return PARSER;
      }

      public S2C_CollectRecordResult_8412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CollectRecordResult_8412OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;
         private int operation_;
         private boolean isCollect_;
         private int collectNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CollectRecordResult_8412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.S2C_CollectRecordResult_8412.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            this.operation_ = 0;
            this.bitField0_ &= -5;
            this.isCollect_ = false;
            this.bitField0_ &= -9;
            this.collectNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_CollectRecordResult_8412_descriptor;
         }

         public S2C_CollectRecordResult_8412 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_CollectRecordResult_8412.getDefaultInstance();
         }

         public S2C_CollectRecordResult_8412 build() {
            S2C_CollectRecordResult_8412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CollectRecordResult_8412 buildPartial() {
            S2C_CollectRecordResult_8412 result = new S2C_CollectRecordResult_8412(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.operation_ = this.operation_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isCollect_ = this.isCollect_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.collectNum_ = this.collectNum_;
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
            if (other instanceof S2C_CollectRecordResult_8412) {
               return this.mergeFrom((S2C_CollectRecordResult_8412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CollectRecordResult_8412 other) {
            if (other == BattleRecordMsg.S2C_CollectRecordResult_8412.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasOperation()) {
                  this.setOperation(other.getOperation());
               }

               if (other.hasIsCollect()) {
                  this.setIsCollect(other.getIsCollect());
               }

               if (other.hasCollectNum()) {
                  this.setCollectNum(other.getCollectNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasOperation()) {
               return false;
            } else if (!this.hasIsCollect()) {
               return false;
            } else {
               return this.hasCollectNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CollectRecordResult_8412 parsedMessage = null;

            try {
               parsedMessage = (S2C_CollectRecordResult_8412)BattleRecordMsg.S2C_CollectRecordResult_8412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CollectRecordResult_8412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOperation() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOperation() {
            return this.operation_;
         }

         public Builder setOperation(int value) {
            this.bitField0_ |= 4;
            this.operation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOperation() {
            this.bitField0_ &= -5;
            this.operation_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsCollect() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsCollect() {
            return this.isCollect_;
         }

         public Builder setIsCollect(boolean value) {
            this.bitField0_ |= 8;
            this.isCollect_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCollect() {
            this.bitField0_ &= -9;
            this.isCollect_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasCollectNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCollectNum() {
            return this.collectNum_;
         }

         public Builder setCollectNum(int value) {
            this.bitField0_ |= 16;
            this.collectNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCollectNum() {
            this.bitField0_ &= -17;
            this.collectNum_ = 0;
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

   public static final class C2S_ThumbsUpRecord_8413 extends GeneratedMessageV3 implements C2S_ThumbsUpRecord_8413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_ThumbsUpRecord_8413 DEFAULT_INSTANCE = new C2S_ThumbsUpRecord_8413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ThumbsUpRecord_8413> PARSER = new AbstractParser<C2S_ThumbsUpRecord_8413>() {
         public C2S_ThumbsUpRecord_8413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ThumbsUpRecord_8413(input, extensionRegistry);
         }
      };

      private C2S_ThumbsUpRecord_8413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ThumbsUpRecord_8413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ThumbsUpRecord_8413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ThumbsUpRecord_8413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ThumbsUpRecord_8413.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ThumbsUpRecord_8413)) {
            return super.equals(obj);
         } else {
            C2S_ThumbsUpRecord_8413 other = (C2S_ThumbsUpRecord_8413)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUpRecord_8413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(InputStream input) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ThumbsUpRecord_8413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUpRecord_8413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUpRecord_8413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUpRecord_8413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ThumbsUpRecord_8413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ThumbsUpRecord_8413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ThumbsUpRecord_8413> parser() {
         return PARSER;
      }

      public Parser<C2S_ThumbsUpRecord_8413> getParserForType() {
         return PARSER;
      }

      public C2S_ThumbsUpRecord_8413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ThumbsUpRecord_8413OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ThumbsUpRecord_8413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_ThumbsUpRecord_8413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_ThumbsUpRecord_8413_descriptor;
         }

         public C2S_ThumbsUpRecord_8413 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_ThumbsUpRecord_8413.getDefaultInstance();
         }

         public C2S_ThumbsUpRecord_8413 build() {
            C2S_ThumbsUpRecord_8413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ThumbsUpRecord_8413 buildPartial() {
            C2S_ThumbsUpRecord_8413 result = new C2S_ThumbsUpRecord_8413(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof C2S_ThumbsUpRecord_8413) {
               return this.mergeFrom((C2S_ThumbsUpRecord_8413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ThumbsUpRecord_8413 other) {
            if (other == BattleRecordMsg.C2S_ThumbsUpRecord_8413.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else {
               return this.hasRecordId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ThumbsUpRecord_8413 parsedMessage = null;

            try {
               parsedMessage = (C2S_ThumbsUpRecord_8413)BattleRecordMsg.C2S_ThumbsUpRecord_8413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ThumbsUpRecord_8413)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
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

   public static final class S2C_ThumbsUpRecordResult_8414 extends GeneratedMessageV3 implements S2C_ThumbsUpRecordResult_8414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int ENABLENUM_FIELD_NUMBER = 2;
      private int enableNum_;
      public static final int RECORDID_FIELD_NUMBER = 3;
      private int recordId_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 4;
      private int thumbsUpNum_;
      public static final int ISTHUMBSUP_FIELD_NUMBER = 5;
      private boolean isThumbsUp_;
      private byte memoizedIsInitialized;
      private static final S2C_ThumbsUpRecordResult_8414 DEFAULT_INSTANCE = new S2C_ThumbsUpRecordResult_8414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ThumbsUpRecordResult_8414> PARSER = new AbstractParser<S2C_ThumbsUpRecordResult_8414>() {
         public S2C_ThumbsUpRecordResult_8414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ThumbsUpRecordResult_8414(input, extensionRegistry);
         }
      };

      private S2C_ThumbsUpRecordResult_8414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ThumbsUpRecordResult_8414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ThumbsUpRecordResult_8414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ThumbsUpRecordResult_8414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.enableNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.recordId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.thumbsUpNum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isThumbsUp_ = input.readBool();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ThumbsUpRecordResult_8414.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasEnableNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEnableNum() {
         return this.enableNum_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
      }

      public boolean hasIsThumbsUp() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsThumbsUp() {
         return this.isThumbsUp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnableNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsThumbsUp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.enableNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.recordId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isThumbsUp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.enableNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.recordId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isThumbsUp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ThumbsUpRecordResult_8414)) {
            return super.equals(obj);
         } else {
            S2C_ThumbsUpRecordResult_8414 other = (S2C_ThumbsUpRecordResult_8414)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasEnableNum() != other.hasEnableNum()) {
               return false;
            } else if (this.hasEnableNum() && this.getEnableNum() != other.getEnableNum()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasIsThumbsUp() != other.hasIsThumbsUp()) {
               return false;
            } else if (this.hasIsThumbsUp() && this.getIsThumbsUp() != other.getIsThumbsUp()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasEnableNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEnableNum();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasIsThumbsUp()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsThumbsUp());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpRecordResult_8414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(InputStream input) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpRecordResult_8414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpRecordResult_8414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ThumbsUpRecordResult_8414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ThumbsUpRecordResult_8414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ThumbsUpRecordResult_8414> parser() {
         return PARSER;
      }

      public Parser<S2C_ThumbsUpRecordResult_8414> getParserForType() {
         return PARSER;
      }

      public S2C_ThumbsUpRecordResult_8414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ThumbsUpRecordResult_8414OrBuilder {
         private int bitField0_;
         private int model_;
         private int enableNum_;
         private int recordId_;
         private int thumbsUpNum_;
         private boolean isThumbsUp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ThumbsUpRecordResult_8414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.enableNum_ = 0;
            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.bitField0_ &= -5;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -9;
            this.isThumbsUp_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_ThumbsUpRecordResult_8414_descriptor;
         }

         public S2C_ThumbsUpRecordResult_8414 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.getDefaultInstance();
         }

         public S2C_ThumbsUpRecordResult_8414 build() {
            S2C_ThumbsUpRecordResult_8414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ThumbsUpRecordResult_8414 buildPartial() {
            S2C_ThumbsUpRecordResult_8414 result = new S2C_ThumbsUpRecordResult_8414(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.enableNum_ = this.enableNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isThumbsUp_ = this.isThumbsUp_;
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
            if (other instanceof S2C_ThumbsUpRecordResult_8414) {
               return this.mergeFrom((S2C_ThumbsUpRecordResult_8414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ThumbsUpRecordResult_8414 other) {
            if (other == BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasEnableNum()) {
                  this.setEnableNum(other.getEnableNum());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasIsThumbsUp()) {
                  this.setIsThumbsUp(other.getIsThumbsUp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasEnableNum()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasThumbsUpNum()) {
               return false;
            } else {
               return this.hasIsThumbsUp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ThumbsUpRecordResult_8414 parsedMessage = null;

            try {
               parsedMessage = (S2C_ThumbsUpRecordResult_8414)BattleRecordMsg.S2C_ThumbsUpRecordResult_8414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ThumbsUpRecordResult_8414)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnableNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEnableNum() {
            return this.enableNum_;
         }

         public Builder setEnableNum(int value) {
            this.bitField0_ |= 2;
            this.enableNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnableNum() {
            this.bitField0_ &= -3;
            this.enableNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 4;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -5;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 8;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -9;
            this.thumbsUpNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsThumbsUp() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsThumbsUp() {
            return this.isThumbsUp_;
         }

         public Builder setIsThumbsUp(boolean value) {
            this.bitField0_ |= 16;
            this.isThumbsUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsThumbsUp() {
            this.bitField0_ &= -17;
            this.isThumbsUp_ = false;
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

   public static final class C2S_WatchRecord_8415 extends GeneratedMessageV3 implements C2S_WatchRecord_8415OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_WatchRecord_8415 DEFAULT_INSTANCE = new C2S_WatchRecord_8415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchRecord_8415> PARSER = new AbstractParser<C2S_WatchRecord_8415>() {
         public C2S_WatchRecord_8415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchRecord_8415(input, extensionRegistry);
         }
      };

      private C2S_WatchRecord_8415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchRecord_8415() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchRecord_8415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchRecord_8415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchRecord_8415.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WatchRecord_8415)) {
            return super.equals(obj);
         } else {
            C2S_WatchRecord_8415 other = (C2S_WatchRecord_8415)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WatchRecord_8415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data);
      }

      public static C2S_WatchRecord_8415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchRecord_8415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data);
      }

      public static C2S_WatchRecord_8415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchRecord_8415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data);
      }

      public static C2S_WatchRecord_8415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchRecord_8415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchRecord_8415 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchRecord_8415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchRecord_8415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchRecord_8415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchRecord_8415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchRecord_8415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchRecord_8415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchRecord_8415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchRecord_8415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchRecord_8415> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchRecord_8415> getParserForType() {
         return PARSER;
      }

      public C2S_WatchRecord_8415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchRecord_8415OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchRecord_8415.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_WatchRecord_8415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchRecord_8415_descriptor;
         }

         public C2S_WatchRecord_8415 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_WatchRecord_8415.getDefaultInstance();
         }

         public C2S_WatchRecord_8415 build() {
            C2S_WatchRecord_8415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchRecord_8415 buildPartial() {
            C2S_WatchRecord_8415 result = new C2S_WatchRecord_8415(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof C2S_WatchRecord_8415) {
               return this.mergeFrom((C2S_WatchRecord_8415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchRecord_8415 other) {
            if (other == BattleRecordMsg.C2S_WatchRecord_8415.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else {
               return this.hasRecordId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WatchRecord_8415 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchRecord_8415)BattleRecordMsg.C2S_WatchRecord_8415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchRecord_8415)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
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

   public static final class S2C_WatchRecordResult_8416 extends GeneratedMessageV3 implements S2C_WatchRecordResult_8416OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      public static final int RECORDID_FIELD_NUMBER = 2;
      private int recordId_;
      public static final int WATCHNUM_FIELD_NUMBER = 3;
      private int watchNum_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchRecordResult_8416 DEFAULT_INSTANCE = new S2C_WatchRecordResult_8416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchRecordResult_8416> PARSER = new AbstractParser<S2C_WatchRecordResult_8416>() {
         public S2C_WatchRecordResult_8416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchRecordResult_8416(input, extensionRegistry);
         }
      };

      private S2C_WatchRecordResult_8416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchRecordResult_8416() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchRecordResult_8416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchRecordResult_8416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.model_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.watchNum_ = input.readInt32();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchRecordResult_8416.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasWatchNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWatchNum() {
         return this.watchNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.watchNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.watchNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchRecordResult_8416)) {
            return super.equals(obj);
         } else {
            S2C_WatchRecordResult_8416 other = (S2C_WatchRecordResult_8416)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasWatchNum() != other.hasWatchNum()) {
               return false;
            } else if (this.hasWatchNum() && this.getWatchNum() != other.getWatchNum()) {
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
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasWatchNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWatchNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchRecordResult_8416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchRecordResult_8416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchRecordResult_8416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchRecordResult_8416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchRecordResult_8416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchRecordResult_8416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchRecordResult_8416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchRecordResult_8416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchRecordResult_8416> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchRecordResult_8416> getParserForType() {
         return PARSER;
      }

      public S2C_WatchRecordResult_8416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchRecordResult_8416OrBuilder {
         private int bitField0_;
         private int model_;
         private int recordId_;
         private int watchNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchRecordResult_8416.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.S2C_WatchRecordResult_8416.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.bitField0_ &= -3;
            this.watchNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_WatchRecordResult_8416_descriptor;
         }

         public S2C_WatchRecordResult_8416 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_WatchRecordResult_8416.getDefaultInstance();
         }

         public S2C_WatchRecordResult_8416 build() {
            S2C_WatchRecordResult_8416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchRecordResult_8416 buildPartial() {
            S2C_WatchRecordResult_8416 result = new S2C_WatchRecordResult_8416(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.watchNum_ = this.watchNum_;
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
            if (other instanceof S2C_WatchRecordResult_8416) {
               return this.mergeFrom((S2C_WatchRecordResult_8416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchRecordResult_8416 other) {
            if (other == BattleRecordMsg.S2C_WatchRecordResult_8416.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasWatchNum()) {
                  this.setWatchNum(other.getWatchNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModel()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else {
               return this.hasWatchNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WatchRecordResult_8416 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchRecordResult_8416)BattleRecordMsg.S2C_WatchRecordResult_8416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchRecordResult_8416)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 2;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWatchNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWatchNum() {
            return this.watchNum_;
         }

         public Builder setWatchNum(int value) {
            this.bitField0_ |= 4;
            this.watchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWatchNum() {
            this.bitField0_ &= -5;
            this.watchNum_ = 0;
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

   public static final class C2S_SpecialRecordList_8417 extends GeneratedMessageV3 implements C2S_SpecialRecordList_8417OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PAGE_FIELD_NUMBER = 1;
      private int page_;
      public static final int PAGESIZE_FIELD_NUMBER = 2;
      private int pageSize_;
      public static final int NATION_FIELD_NUMBER = 3;
      private Internal.IntList nation_;
      private byte memoizedIsInitialized;
      private static final C2S_SpecialRecordList_8417 DEFAULT_INSTANCE = new C2S_SpecialRecordList_8417();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SpecialRecordList_8417> PARSER = new AbstractParser<C2S_SpecialRecordList_8417>() {
         public C2S_SpecialRecordList_8417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SpecialRecordList_8417(input, extensionRegistry);
         }
      };

      private C2S_SpecialRecordList_8417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SpecialRecordList_8417() {
         this.memoizedIsInitialized = -1;
         this.nation_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SpecialRecordList_8417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SpecialRecordList_8417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.page_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.pageSize_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.nation_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.nation_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.nation_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.nation_.addInt(input.readInt32());
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
                  this.nation_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialRecordList_8417.class, Builder.class);
      }

      public boolean hasPage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPage() {
         return this.page_;
      }

      public boolean hasPageSize() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPageSize() {
         return this.pageSize_;
      }

      public List<Integer> getNationList() {
         return this.nation_;
      }

      public int getNationCount() {
         return this.nation_.size();
      }

      public int getNation(int index) {
         return this.nation_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPageSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.page_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.pageSize_);
         }

         for(int i = 0; i < this.nation_.size(); ++i) {
            output.writeInt32(3, this.nation_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.page_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.pageSize_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.nation_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.nation_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getNationList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SpecialRecordList_8417)) {
            return super.equals(obj);
         } else {
            C2S_SpecialRecordList_8417 other = (C2S_SpecialRecordList_8417)obj;
            if (this.hasPage() != other.hasPage()) {
               return false;
            } else if (this.hasPage() && this.getPage() != other.getPage()) {
               return false;
            } else if (this.hasPageSize() != other.hasPageSize()) {
               return false;
            } else if (this.hasPageSize() && this.getPageSize() != other.getPageSize()) {
               return false;
            } else if (!this.getNationList().equals(other.getNationList())) {
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
            if (this.hasPage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPage();
            }

            if (this.hasPageSize()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPageSize();
            }

            if (this.getNationCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNationList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SpecialRecordList_8417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialRecordList_8417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(InputStream input) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialRecordList_8417 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SpecialRecordList_8417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialRecordList_8417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialRecordList_8417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SpecialRecordList_8417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SpecialRecordList_8417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SpecialRecordList_8417> parser() {
         return PARSER;
      }

      public Parser<C2S_SpecialRecordList_8417> getParserForType() {
         return PARSER;
      }

      public C2S_SpecialRecordList_8417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SpecialRecordList_8417OrBuilder {
         private int bitField0_;
         private int page_;
         private int pageSize_;
         private Internal.IntList nation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialRecordList_8417.class, Builder.class);
         }

         private Builder() {
            this.nation_ = BattleRecordMsg.C2S_SpecialRecordList_8417.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.nation_ = BattleRecordMsg.C2S_SpecialRecordList_8417.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_SpecialRecordList_8417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.page_ = 0;
            this.bitField0_ &= -2;
            this.pageSize_ = 0;
            this.bitField0_ &= -3;
            this.nation_ = BattleRecordMsg.C2S_SpecialRecordList_8417.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_SpecialRecordList_8417_descriptor;
         }

         public C2S_SpecialRecordList_8417 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_SpecialRecordList_8417.getDefaultInstance();
         }

         public C2S_SpecialRecordList_8417 build() {
            C2S_SpecialRecordList_8417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SpecialRecordList_8417 buildPartial() {
            C2S_SpecialRecordList_8417 result = new C2S_SpecialRecordList_8417(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.page_ = this.page_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.pageSize_ = this.pageSize_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.nation_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.nation_ = this.nation_;
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
            if (other instanceof C2S_SpecialRecordList_8417) {
               return this.mergeFrom((C2S_SpecialRecordList_8417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SpecialRecordList_8417 other) {
            if (other == BattleRecordMsg.C2S_SpecialRecordList_8417.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPage()) {
                  this.setPage(other.getPage());
               }

               if (other.hasPageSize()) {
                  this.setPageSize(other.getPageSize());
               }

               if (!other.nation_.isEmpty()) {
                  if (this.nation_.isEmpty()) {
                     this.nation_ = other.nation_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureNationIsMutable();
                     this.nation_.addAll(other.nation_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPage()) {
               return false;
            } else {
               return this.hasPageSize();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SpecialRecordList_8417 parsedMessage = null;

            try {
               parsedMessage = (C2S_SpecialRecordList_8417)BattleRecordMsg.C2S_SpecialRecordList_8417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SpecialRecordList_8417)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPage() {
            return this.page_;
         }

         public Builder setPage(int value) {
            this.bitField0_ |= 1;
            this.page_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPage() {
            this.bitField0_ &= -2;
            this.page_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPageSize() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPageSize() {
            return this.pageSize_;
         }

         public Builder setPageSize(int value) {
            this.bitField0_ |= 2;
            this.pageSize_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPageSize() {
            this.bitField0_ &= -3;
            this.pageSize_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureNationIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.nation_ = BattleRecordMsg.C2S_SpecialRecordList_8417.mutableCopy(this.nation_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getNationList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.nation_) : this.nation_);
         }

         public int getNationCount() {
            return this.nation_.size();
         }

         public int getNation(int index) {
            return this.nation_.getInt(index);
         }

         public Builder setNation(int index, int value) {
            this.ensureNationIsMutable();
            this.nation_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addNation(int value) {
            this.ensureNationIsMutable();
            this.nation_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllNation(Iterable<? extends Integer> values) {
            this.ensureNationIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.nation_);
            this.onChanged();
            return this;
         }

         public Builder clearNation() {
            this.nation_ = BattleRecordMsg.C2S_SpecialRecordList_8417.emptyIntList();
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

   public static final class S2C_SpecialRecordList_8418 extends GeneratedMessageV3 implements S2C_SpecialRecordList_8418OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PAGEINFO_FIELD_NUMBER = 1;
      private CommonMsg.PageInfo pageInfo_;
      public static final int NATION_FIELD_NUMBER = 2;
      private Internal.IntList nation_;
      public static final int RECORD_FIELD_NUMBER = 3;
      private List<SpecialBattleRecordInfo> record_;
      private byte memoizedIsInitialized;
      private static final S2C_SpecialRecordList_8418 DEFAULT_INSTANCE = new S2C_SpecialRecordList_8418();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpecialRecordList_8418> PARSER = new AbstractParser<S2C_SpecialRecordList_8418>() {
         public S2C_SpecialRecordList_8418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpecialRecordList_8418(input, extensionRegistry);
         }
      };

      private S2C_SpecialRecordList_8418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpecialRecordList_8418() {
         this.memoizedIsInitialized = -1;
         this.nation_ = emptyIntList();
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpecialRecordList_8418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpecialRecordList_8418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.pageInfo_.toBuilder();
                        }

                        this.pageInfo_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageInfo_);
                           this.pageInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.nation_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.nation_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.nation_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.record_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.record_.add(input.readMessage(BattleRecordMsg.SpecialBattleRecordInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.nation_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.nation_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.record_ = Collections.unmodifiableList(this.record_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialRecordList_8418.class, Builder.class);
      }

      public boolean hasPageInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PageInfo getPageInfo() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public List<Integer> getNationList() {
         return this.nation_;
      }

      public int getNationCount() {
         return this.nation_.size();
      }

      public int getNation(int index) {
         return this.nation_.getInt(index);
      }

      public List<SpecialBattleRecordInfo> getRecordList() {
         return this.record_;
      }

      public List<? extends SpecialBattleRecordInfoOrBuilder> getRecordOrBuilderList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public SpecialBattleRecordInfo getRecord(int index) {
         return (SpecialBattleRecordInfo)this.record_.get(index);
      }

      public SpecialBattleRecordInfoOrBuilder getRecordOrBuilder(int index) {
         return (SpecialBattleRecordInfoOrBuilder)this.record_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPageInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRecordCount(); ++i) {
               if (!this.getRecord(i).isInitialized()) {
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
            output.writeMessage(1, this.getPageInfo());
         }

         for(int i = 0; i < this.nation_.size(); ++i) {
            output.writeInt32(2, this.nation_.getInt(i));
         }

         for(int i = 0; i < this.record_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.record_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getPageInfo());
            }

            int dataSize = 0;

            for(int i = 0; i < this.nation_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.nation_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getNationList().size();

            for(int i = 0; i < this.record_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.record_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpecialRecordList_8418)) {
            return super.equals(obj);
         } else {
            S2C_SpecialRecordList_8418 other = (S2C_SpecialRecordList_8418)obj;
            if (this.hasPageInfo() != other.hasPageInfo()) {
               return false;
            } else if (this.hasPageInfo() && !this.getPageInfo().equals(other.getPageInfo())) {
               return false;
            } else if (!this.getNationList().equals(other.getNationList())) {
               return false;
            } else if (!this.getRecordList().equals(other.getRecordList())) {
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
            if (this.hasPageInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPageInfo().hashCode();
            }

            if (this.getNationCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNationList().hashCode();
            }

            if (this.getRecordCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpecialRecordList_8418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialRecordList_8418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(InputStream input) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialRecordList_8418 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpecialRecordList_8418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialRecordList_8418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialRecordList_8418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpecialRecordList_8418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpecialRecordList_8418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpecialRecordList_8418> parser() {
         return PARSER;
      }

      public Parser<S2C_SpecialRecordList_8418> getParserForType() {
         return PARSER;
      }

      public S2C_SpecialRecordList_8418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpecialRecordList_8418OrBuilder {
         private int bitField0_;
         private CommonMsg.PageInfo pageInfo_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageInfoBuilder_;
         private Internal.IntList nation_;
         private List<SpecialBattleRecordInfo> record_;
         private RepeatedFieldBuilderV3<SpecialBattleRecordInfo, SpecialBattleRecordInfo.Builder, SpecialBattleRecordInfoOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialRecordList_8418.class, Builder.class);
         }

         private Builder() {
            this.nation_ = BattleRecordMsg.S2C_SpecialRecordList_8418.emptyIntList();
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.nation_ = BattleRecordMsg.S2C_SpecialRecordList_8418.emptyIntList();
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.S2C_SpecialRecordList_8418.alwaysUseFieldBuilders) {
               this.getPageInfoFieldBuilder();
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.nation_ = BattleRecordMsg.S2C_SpecialRecordList_8418.emptyIntList();
            this.bitField0_ &= -3;
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_S2C_SpecialRecordList_8418_descriptor;
         }

         public S2C_SpecialRecordList_8418 getDefaultInstanceForType() {
            return BattleRecordMsg.S2C_SpecialRecordList_8418.getDefaultInstance();
         }

         public S2C_SpecialRecordList_8418 build() {
            S2C_SpecialRecordList_8418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpecialRecordList_8418 buildPartial() {
            S2C_SpecialRecordList_8418 result = new S2C_SpecialRecordList_8418(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.pageInfoBuilder_ == null) {
                  result.pageInfo_ = this.pageInfo_;
               } else {
                  result.pageInfo_ = (CommonMsg.PageInfo)this.pageInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.nation_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.nation_ = this.nation_;
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.record_ = Collections.unmodifiableList(this.record_);
                  this.bitField0_ &= -5;
               }

               result.record_ = this.record_;
            } else {
               result.record_ = this.recordBuilder_.build();
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
            if (other instanceof S2C_SpecialRecordList_8418) {
               return this.mergeFrom((S2C_SpecialRecordList_8418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpecialRecordList_8418 other) {
            if (other == BattleRecordMsg.S2C_SpecialRecordList_8418.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPageInfo()) {
                  this.mergePageInfo(other.getPageInfo());
               }

               if (!other.nation_.isEmpty()) {
                  if (this.nation_.isEmpty()) {
                     this.nation_ = other.nation_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureNationIsMutable();
                     this.nation_.addAll(other.nation_);
                  }

                  this.onChanged();
               }

               if (this.recordBuilder_ == null) {
                  if (!other.record_.isEmpty()) {
                     if (this.record_.isEmpty()) {
                        this.record_ = other.record_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRecordIsMutable();
                        this.record_.addAll(other.record_);
                     }

                     this.onChanged();
                  }
               } else if (!other.record_.isEmpty()) {
                  if (this.recordBuilder_.isEmpty()) {
                     this.recordBuilder_.dispose();
                     this.recordBuilder_ = null;
                     this.record_ = other.record_;
                     this.bitField0_ &= -5;
                     this.recordBuilder_ = BattleRecordMsg.S2C_SpecialRecordList_8418.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
                  } else {
                     this.recordBuilder_.addAllMessages(other.record_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPageInfo()) {
               return false;
            } else if (!this.getPageInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRecordCount(); ++i) {
                  if (!this.getRecord(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SpecialRecordList_8418 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpecialRecordList_8418)BattleRecordMsg.S2C_SpecialRecordList_8418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpecialRecordList_8418)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPageInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PageInfo getPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            } else {
               return (CommonMsg.PageInfo)this.pageInfoBuilder_.getMessage();
            }
         }

         public Builder setPageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageInfo_ = value;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPageInfo(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.pageInfo_ != null && this.pageInfo_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageInfo_ = CommonMsg.PageInfo.newBuilder(this.pageInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.pageInfo_ = value;
               }

               this.onChanged();
            } else {
               this.pageInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
            if (this.pageInfoBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageInfoFieldBuilder() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfoBuilder_ = new SingleFieldBuilderV3(this.getPageInfo(), this.getParentForChildren(), this.isClean());
               this.pageInfo_ = null;
            }

            return this.pageInfoBuilder_;
         }

         private void ensureNationIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.nation_ = BattleRecordMsg.S2C_SpecialRecordList_8418.mutableCopy(this.nation_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getNationList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.nation_) : this.nation_);
         }

         public int getNationCount() {
            return this.nation_.size();
         }

         public int getNation(int index) {
            return this.nation_.getInt(index);
         }

         public Builder setNation(int index, int value) {
            this.ensureNationIsMutable();
            this.nation_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addNation(int value) {
            this.ensureNationIsMutable();
            this.nation_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllNation(Iterable<? extends Integer> values) {
            this.ensureNationIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.nation_);
            this.onChanged();
            return this;
         }

         public Builder clearNation() {
            this.nation_ = BattleRecordMsg.S2C_SpecialRecordList_8418.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureRecordIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.record_ = new ArrayList(this.record_);
               this.bitField0_ |= 4;
            }

         }

         public List<SpecialBattleRecordInfo> getRecordList() {
            return this.recordBuilder_ == null ? Collections.unmodifiableList(this.record_) : this.recordBuilder_.getMessageList();
         }

         public int getRecordCount() {
            return this.recordBuilder_ == null ? this.record_.size() : this.recordBuilder_.getCount();
         }

         public SpecialBattleRecordInfo getRecord(int index) {
            return this.recordBuilder_ == null ? (SpecialBattleRecordInfo)this.record_.get(index) : (SpecialBattleRecordInfo)this.recordBuilder_.getMessage(index);
         }

         public Builder setRecord(int index, SpecialBattleRecordInfo value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecord(int index, SpecialBattleRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(SpecialBattleRecordInfo value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecord(int index, SpecialBattleRecordInfo value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecord(SpecialBattleRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(int index, SpecialBattleRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(Iterable<? extends SpecialBattleRecordInfo> values) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
               this.onChanged();
            } else {
               this.recordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecord(int index) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.remove(index);
               this.onChanged();
            } else {
               this.recordBuilder_.remove(index);
            }

            return this;
         }

         public SpecialBattleRecordInfo.Builder getRecordBuilder(int index) {
            return (SpecialBattleRecordInfo.Builder)this.getRecordFieldBuilder().getBuilder(index);
         }

         public SpecialBattleRecordInfoOrBuilder getRecordOrBuilder(int index) {
            return this.recordBuilder_ == null ? (SpecialBattleRecordInfoOrBuilder)this.record_.get(index) : (SpecialBattleRecordInfoOrBuilder)this.recordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SpecialBattleRecordInfoOrBuilder> getRecordOrBuilderList() {
            return this.recordBuilder_ != null ? this.recordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.record_);
         }

         public SpecialBattleRecordInfo.Builder addRecordBuilder() {
            return (SpecialBattleRecordInfo.Builder)this.getRecordFieldBuilder().addBuilder(BattleRecordMsg.SpecialBattleRecordInfo.getDefaultInstance());
         }

         public SpecialBattleRecordInfo.Builder addRecordBuilder(int index) {
            return (SpecialBattleRecordInfo.Builder)this.getRecordFieldBuilder().addBuilder(index, BattleRecordMsg.SpecialBattleRecordInfo.getDefaultInstance());
         }

         public List<SpecialBattleRecordInfo.Builder> getRecordBuilderList() {
            return this.getRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SpecialBattleRecordInfo, SpecialBattleRecordInfo.Builder, SpecialBattleRecordInfoOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new RepeatedFieldBuilderV3(this.record_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WatchSpecialRecord_8419 extends GeneratedMessageV3 implements C2S_WatchSpecialRecord_8419OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private long recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_WatchSpecialRecord_8419 DEFAULT_INSTANCE = new C2S_WatchSpecialRecord_8419();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchSpecialRecord_8419> PARSER = new AbstractParser<C2S_WatchSpecialRecord_8419>() {
         public C2S_WatchSpecialRecord_8419 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchSpecialRecord_8419(input, extensionRegistry);
         }
      };

      private C2S_WatchSpecialRecord_8419(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchSpecialRecord_8419() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchSpecialRecord_8419();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchSpecialRecord_8419(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recordId_ = input.readInt64();
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
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchSpecialRecord_8419.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getRecordId() {
         return this.recordId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.recordId_);
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
               size += CodedOutputStream.computeInt64Size(1, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WatchSpecialRecord_8419)) {
            return super.equals(obj);
         } else {
            C2S_WatchSpecialRecord_8419 other = (C2S_WatchSpecialRecord_8419)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getRecordId());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchSpecialRecord_8419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchSpecialRecord_8419 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchSpecialRecord_8419 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchSpecialRecord_8419 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchSpecialRecord_8419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchSpecialRecord_8419 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchSpecialRecord_8419 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchSpecialRecord_8419> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchSpecialRecord_8419> getParserForType() {
         return PARSER;
      }

      public C2S_WatchSpecialRecord_8419 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchSpecialRecord_8419OrBuilder {
         private int bitField0_;
         private long recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchSpecialRecord_8419.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleRecordMsg.C2S_WatchSpecialRecord_8419.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0L;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleRecordMsg.internal_static_battleRecord_com_gzbz_protobuf_C2S_WatchSpecialRecord_8419_descriptor;
         }

         public C2S_WatchSpecialRecord_8419 getDefaultInstanceForType() {
            return BattleRecordMsg.C2S_WatchSpecialRecord_8419.getDefaultInstance();
         }

         public C2S_WatchSpecialRecord_8419 build() {
            C2S_WatchSpecialRecord_8419 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchSpecialRecord_8419 buildPartial() {
            C2S_WatchSpecialRecord_8419 result = new C2S_WatchSpecialRecord_8419(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof C2S_WatchSpecialRecord_8419) {
               return this.mergeFrom((C2S_WatchSpecialRecord_8419)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchSpecialRecord_8419 other) {
            if (other == BattleRecordMsg.C2S_WatchSpecialRecord_8419.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecordId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WatchSpecialRecord_8419 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchSpecialRecord_8419)BattleRecordMsg.C2S_WatchSpecialRecord_8419.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchSpecialRecord_8419)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(long value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0L;
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

   public interface BattleRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasWatchNum();

      int getWatchNum();

      boolean hasShareNum();

      int getShareNum();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasIsThumbsUp();

      boolean getIsThumbsUp();

      boolean hasIsCollect();

      boolean getIsCollect();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();

      boolean hasServerId();

      int getServerId();
   }

   public interface C2S_BattleRecord_8403OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();
   }

   public interface C2S_CollectRecord_8411OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();

      boolean hasOperation();

      int getOperation();
   }

   public interface C2S_ShareRecord_8409OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();
   }

   public interface C2S_SpecialRecordList_8417OrBuilder extends MessageOrBuilder {
      boolean hasPage();

      int getPage();

      boolean hasPageSize();

      int getPageSize();

      List<Integer> getNationList();

      int getNationCount();

      int getNation(int index);
   }

   public interface C2S_ThumbsUpRecord_8413OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();
   }

   public interface C2S_WatchRecord_8415OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();
   }

   public interface C2S_WatchSpecialRecord_8419OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      long getRecordId();
   }

   public interface S2C_BattleRecordResult_8404OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasEnableNum();

      int getEnableNum();

      List<BattleRecordInfo> getInfosList();

      BattleRecordInfo getInfos(int index);

      int getInfosCount();

      List<? extends BattleRecordInfoOrBuilder> getInfosOrBuilderList();

      BattleRecordInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasCollectNum();

      int getCollectNum();
   }

   public interface S2C_CollectRecordResult_8412OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();

      boolean hasOperation();

      int getOperation();

      boolean hasIsCollect();

      boolean getIsCollect();

      boolean hasCollectNum();

      int getCollectNum();
   }

   public interface S2C_ShareRecordResult_8410OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();

      boolean hasShareNum();

      int getShareNum();
   }

   public interface S2C_SpecialRecordList_8418OrBuilder extends MessageOrBuilder {
      boolean hasPageInfo();

      CommonMsg.PageInfo getPageInfo();

      CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder();

      List<Integer> getNationList();

      int getNationCount();

      int getNation(int index);

      List<SpecialBattleRecordInfo> getRecordList();

      SpecialBattleRecordInfo getRecord(int index);

      int getRecordCount();

      List<? extends SpecialBattleRecordInfoOrBuilder> getRecordOrBuilderList();

      SpecialBattleRecordInfoOrBuilder getRecordOrBuilder(int index);
   }

   public interface S2C_ThumbsUpRecordResult_8414OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasEnableNum();

      int getEnableNum();

      boolean hasRecordId();

      int getRecordId();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasIsThumbsUp();

      boolean getIsThumbsUp();
   }

   public interface S2C_WatchRecordResult_8416OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();

      boolean hasRecordId();

      int getRecordId();

      boolean hasWatchNum();

      int getWatchNum();
   }

   public interface SpecialBattleRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      long getRecordId();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }
}
