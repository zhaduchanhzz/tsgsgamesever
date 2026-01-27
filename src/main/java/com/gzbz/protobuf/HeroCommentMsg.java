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
import com.google.protobuf.ProtocolMessageEnum;
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

public final class HeroCommentMsg {
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_CommentInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroCommentMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011HeroComment.proto\u0012\u001dherocomment.com.gzbz.protobuf\"\u0081\u0002\n\u000bCommentInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0004 \u0002(\t\u0012\u000f\n\u0007content\u0018\u0005 \u0002(\t\u0012\u000f\n\u0007likeNum\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007hateNum\u0018\u0007 \u0002(\u0005\u0012D\n\u000bmyOperation\u0018\b \u0001(\u000e2/.herocomment.com.gzbz.protobuf.CommentOperation\u0012\u0012\n\ncreateTime\u0018\t \u0002(\u0005\u0012\u0013\n\u000bcommentHots\u0018\n \u0002(\u0005\u0012\u0010\n\bisReport\u0018\u000b \u0001(\b\"/\n\u000fC2S_OpenUi_8301\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\"\u009d\u0001\n\u0015S2C_OpenUiResult_8302\u0012\r\n\u0005likes\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005click\u0018\u0003 \u0002(\u0005\u00129\n\u0005infos\u0018\u0004 \u0003(\u000b2*.herocomment.com.gzbz.protobuf.CommentInfo\u0012\u0010\n\bheroHots\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0006 \u0001(\u0005\" \n\u000eC2S_Click_8303\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\"G\n\u0014S2C_ClickResult_8304\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005likes\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bheroHots\u0018\u0003 \u0002(\u0005\"3\n\u0010C2S_Comment_8305\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007context\u0018\u0002 \u0002(\t\"Y\n\u0016S2C_CommentResult_8306\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007context\u0018\u0002 \u0002(\t\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bheroHots\u0018\u0004 \u0002(\u0005\"u\n\u0011C2S_ThumbsUp_8307\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012B\n\toperation\u0018\u0003 \u0002(\u000e2/.herocomment.com.gzbz.protobuf.CommentOperation\"¢\u0001\n\u0017S2C_ThumbsUpResult_8308\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012B\n\toperation\u0018\u0003 \u0002(\u000e2/.herocomment.com.gzbz.protobuf.CommentOperation\u0012\u0013\n\u000bcommentHots\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bheroHots\u0018\u0005 \u0002(\u0005\"3\n\u0013C2S_DelComment_8309\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\"U\n\u0013S2C_DelComment_8310\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006heroId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bheroHots\u0018\u0004 \u0002(\u0005\"I\n\u0016C2S_ReportComment_8311\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tisSuccess\u0018\u0003 \u0001(\b\"b\n\u0015S2C_ReportResult_8312\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00129\n\u0005infos\u0018\u0002 \u0001(\u000b2*.herocomment.com.gzbz.protobuf.CommentInfo\"\u0017\n\u0015S2S_ReportResult_8313*L\n\u0010CommentOperation\u0012\u0010\n\fOPERATION_NO\u0010\u0000\u0012\u0012\n\u000eOPERATION_LIKE\u0010\u0001\u0012\u0012\n\u000eOPERATION_HATE\u0010\u0002B%\n\u0011com.gzbz.protobufB\u000eHeroCommentMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_herocomment_com_gzbz_protobuf_CommentInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor, new String[]{"Code", "ServerId", "PlayerId", "Name", "Content", "LikeNum", "HateNum", "MyOperation", "CreateTime", "CommentHots", "IsReport"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor, new String[]{"HeroId", "Type"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor, new String[]{"Likes", "Num", "Click", "Infos", "HeroHots", "Type"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor, new String[]{"HeroId"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor, new String[]{"Result", "Likes", "HeroHots"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor, new String[]{"HeroId", "Context"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor, new String[]{"Result", "Context", "Code", "HeroHots"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor, new String[]{"HeroId", "Code", "Operation"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor, new String[]{"Result", "Code", "Operation", "CommentHots", "HeroHots"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor, new String[]{"HeroId", "Code"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor, new String[]{"Result", "HeroId", "Code", "HeroHots"});
      internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor, new String[]{"HeroId", "Code", "IsSuccess"});
      internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor, new String[]{"Result", "Infos"});
      internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor, new String[0]);
   }

   public static enum CommentOperation implements ProtocolMessageEnum {
      OPERATION_NO(0),
      OPERATION_LIKE(1),
      OPERATION_HATE(2);

      public static final int OPERATION_NO_VALUE = 0;
      public static final int OPERATION_LIKE_VALUE = 1;
      public static final int OPERATION_HATE_VALUE = 2;
      private static final Internal.EnumLiteMap<CommentOperation> internalValueMap = new Internal.EnumLiteMap<CommentOperation>() {
         public CommentOperation findValueByNumber(int number) {
            return HeroCommentMsg.CommentOperation.forNumber(number);
         }
      };
      private static final CommentOperation[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CommentOperation valueOf(int value) {
         return forNumber(value);
      }

      public static CommentOperation forNumber(int value) {
         switch (value) {
            case 0:
               return OPERATION_NO;
            case 1:
               return OPERATION_LIKE;
            case 2:
               return OPERATION_HATE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CommentOperation> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)HeroCommentMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static CommentOperation valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CommentOperation(int value) {
         this.value = value;
      }
   }

   public static final class CommentInfo extends GeneratedMessageV3 implements CommentInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int NAME_FIELD_NUMBER = 4;
      private volatile Object name_;
      public static final int CONTENT_FIELD_NUMBER = 5;
      private volatile Object content_;
      public static final int LIKENUM_FIELD_NUMBER = 6;
      private int likeNum_;
      public static final int HATENUM_FIELD_NUMBER = 7;
      private int hateNum_;
      public static final int MYOPERATION_FIELD_NUMBER = 8;
      private int myOperation_;
      public static final int CREATETIME_FIELD_NUMBER = 9;
      private int createTime_;
      public static final int COMMENTHOTS_FIELD_NUMBER = 10;
      private int commentHots_;
      public static final int ISREPORT_FIELD_NUMBER = 11;
      private boolean isReport_;
      private byte memoizedIsInitialized;
      private static final CommentInfo DEFAULT_INSTANCE = new CommentInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CommentInfo> PARSER = new AbstractParser<CommentInfo>() {
         public CommentInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CommentInfo(input, extensionRegistry);
         }
      };

      private CommentInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CommentInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
         this.content_ = "";
         this.myOperation_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CommentInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CommentInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.name_ = bs;
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.content_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.likeNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.hateNum_ = input.readInt32();
                        break;
                     case 64:
                        int rawValue = input.readEnum();
                        CommentOperation value = HeroCommentMsg.CommentOperation.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(8, rawValue);
                        } else {
                           this.bitField0_ |= 128;
                           this.myOperation_ = rawValue;
                        }
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.createTime_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.commentHots_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.isReport_ = input.readBool();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_CommentInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CommentInfo.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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

      public boolean hasName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasContent() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasLikeNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLikeNum() {
         return this.likeNum_;
      }

      public boolean hasHateNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHateNum() {
         return this.hateNum_;
      }

      public boolean hasMyOperation() {
         return (this.bitField0_ & 128) != 0;
      }

      public CommentOperation getMyOperation() {
         CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.myOperation_);
         return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasCommentHots() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getCommentHots() {
         return this.commentHots_;
      }

      public boolean hasIsReport() {
         return (this.bitField0_ & 1024) != 0;
      }

      public boolean getIsReport() {
         return this.isReport_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLikeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHateNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCommentHots()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.name_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.content_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.likeNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.hateNum_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeEnum(8, this.myOperation_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.createTime_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.commentHots_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeBool(11, this.isReport_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.name_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.content_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.likeNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.hateNum_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeEnumSize(8, this.myOperation_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.createTime_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.commentHots_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeBoolSize(11, this.isReport_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CommentInfo)) {
            return super.equals(obj);
         } else {
            CommentInfo other = (CommentInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
               return false;
            } else if (this.hasLikeNum() != other.hasLikeNum()) {
               return false;
            } else if (this.hasLikeNum() && this.getLikeNum() != other.getLikeNum()) {
               return false;
            } else if (this.hasHateNum() != other.hasHateNum()) {
               return false;
            } else if (this.hasHateNum() && this.getHateNum() != other.getHateNum()) {
               return false;
            } else if (this.hasMyOperation() != other.hasMyOperation()) {
               return false;
            } else if (this.hasMyOperation() && this.myOperation_ != other.myOperation_) {
               return false;
            } else if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasCommentHots() != other.hasCommentHots()) {
               return false;
            } else if (this.hasCommentHots() && this.getCommentHots() != other.getCommentHots()) {
               return false;
            } else if (this.hasIsReport() != other.hasIsReport()) {
               return false;
            } else if (this.hasIsReport() && this.getIsReport() != other.getIsReport()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasContent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getContent().hashCode();
            }

            if (this.hasLikeNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLikeNum();
            }

            if (this.hasHateNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHateNum();
            }

            if (this.hasMyOperation()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.myOperation_;
            }

            if (this.hasCreateTime()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasCommentHots()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getCommentHots();
            }

            if (this.hasIsReport()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashBoolean(this.getIsReport());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CommentInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data);
      }

      public static CommentInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CommentInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data);
      }

      public static CommentInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CommentInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data);
      }

      public static CommentInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CommentInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CommentInfo parseFrom(InputStream input) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CommentInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CommentInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CommentInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CommentInfo parseFrom(CodedInputStream input) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CommentInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CommentInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CommentInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CommentInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CommentInfo> parser() {
         return PARSER;
      }

      public Parser<CommentInfo> getParserForType() {
         return PARSER;
      }

      public CommentInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CommentInfoOrBuilder {
         private int bitField0_;
         private int code_;
         private int serverId_;
         private int playerId_;
         private Object name_;
         private Object content_;
         private int likeNum_;
         private int hateNum_;
         private int myOperation_;
         private int createTime_;
         private int commentHots_;
         private boolean isReport_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_CommentInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CommentInfo.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.content_ = "";
            this.myOperation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.content_ = "";
            this.myOperation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.CommentInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.name_ = "";
            this.bitField0_ &= -9;
            this.content_ = "";
            this.bitField0_ &= -17;
            this.likeNum_ = 0;
            this.bitField0_ &= -33;
            this.hateNum_ = 0;
            this.bitField0_ &= -65;
            this.myOperation_ = 0;
            this.bitField0_ &= -129;
            this.createTime_ = 0;
            this.bitField0_ &= -257;
            this.commentHots_ = 0;
            this.bitField0_ &= -513;
            this.isReport_ = false;
            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_CommentInfo_descriptor;
         }

         public CommentInfo getDefaultInstanceForType() {
            return HeroCommentMsg.CommentInfo.getDefaultInstance();
         }

         public CommentInfo build() {
            CommentInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CommentInfo buildPartial() {
            CommentInfo result = new CommentInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
               to_bitField0_ |= 8;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.content_ = this.content_;
            if ((from_bitField0_ & 32) != 0) {
               result.likeNum_ = this.likeNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.hateNum_ = this.hateNum_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               to_bitField0_ |= 128;
            }

            result.myOperation_ = this.myOperation_;
            if ((from_bitField0_ & 256) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.commentHots_ = this.commentHots_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.isReport_ = this.isReport_;
               to_bitField0_ |= 1024;
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
            if (other instanceof CommentInfo) {
               return this.mergeFrom((CommentInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CommentInfo other) {
            if (other == HeroCommentMsg.CommentInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 8;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasContent()) {
                  this.bitField0_ |= 16;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               if (other.hasLikeNum()) {
                  this.setLikeNum(other.getLikeNum());
               }

               if (other.hasHateNum()) {
                  this.setHateNum(other.getHateNum());
               }

               if (other.hasMyOperation()) {
                  this.setMyOperation(other.getMyOperation());
               }

               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasCommentHots()) {
                  this.setCommentHots(other.getCommentHots());
               }

               if (other.hasIsReport()) {
                  this.setIsReport(other.getIsReport());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasContent()) {
               return false;
            } else if (!this.hasLikeNum()) {
               return false;
            } else if (!this.hasHateNum()) {
               return false;
            } else if (!this.hasCreateTime()) {
               return false;
            } else {
               return this.hasCommentHots();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CommentInfo parsedMessage = null;

            try {
               parsedMessage = (CommentInfo)HeroCommentMsg.CommentInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CommentInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

         public boolean hasName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -9;
            this.name_ = HeroCommentMsg.CommentInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasContent() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -17;
            this.content_ = HeroCommentMsg.CommentInfo.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLikeNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLikeNum() {
            return this.likeNum_;
         }

         public Builder setLikeNum(int value) {
            this.bitField0_ |= 32;
            this.likeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLikeNum() {
            this.bitField0_ &= -33;
            this.likeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHateNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHateNum() {
            return this.hateNum_;
         }

         public Builder setHateNum(int value) {
            this.bitField0_ |= 64;
            this.hateNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHateNum() {
            this.bitField0_ &= -65;
            this.hateNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyOperation() {
            return (this.bitField0_ & 128) != 0;
         }

         public CommentOperation getMyOperation() {
            CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.myOperation_);
            return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
         }

         public Builder setMyOperation(CommentOperation value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 128;
               this.myOperation_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearMyOperation() {
            this.bitField0_ &= -129;
            this.myOperation_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 256;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -257;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCommentHots() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getCommentHots() {
            return this.commentHots_;
         }

         public Builder setCommentHots(int value) {
            this.bitField0_ |= 512;
            this.commentHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommentHots() {
            this.bitField0_ &= -513;
            this.commentHots_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsReport() {
            return (this.bitField0_ & 1024) != 0;
         }

         public boolean getIsReport() {
            return this.isReport_;
         }

         public Builder setIsReport(boolean value) {
            this.bitField0_ |= 1024;
            this.isReport_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReport() {
            this.bitField0_ &= -1025;
            this.isReport_ = false;
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

   public static final class C2S_OpenUi_8301 extends GeneratedMessageV3 implements C2S_OpenUi_8301OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_8301 DEFAULT_INSTANCE = new C2S_OpenUi_8301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_8301> PARSER = new AbstractParser<C2S_OpenUi_8301>() {
         public C2S_OpenUi_8301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_8301(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_8301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_8301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_8301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_8301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_8301.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
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
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
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
         } else if (!(obj instanceof C2S_OpenUi_8301)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_8301 other = (C2S_OpenUi_8301)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
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

      public static C2S_OpenUi_8301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8301 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_8301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_8301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_8301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_8301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_8301> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_8301> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_8301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_8301OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_8301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_OpenUi_8301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_OpenUi_8301_descriptor;
         }

         public C2S_OpenUi_8301 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_OpenUi_8301.getDefaultInstance();
         }

         public C2S_OpenUi_8301 build() {
            C2S_OpenUi_8301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_8301 buildPartial() {
            C2S_OpenUi_8301 result = new C2S_OpenUi_8301(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof C2S_OpenUi_8301) {
               return this.mergeFrom((C2S_OpenUi_8301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_8301 other) {
            if (other == HeroCommentMsg.C2S_OpenUi_8301.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
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
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenUi_8301 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_8301)HeroCommentMsg.C2S_OpenUi_8301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_8301)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

   public static final class S2C_OpenUiResult_8302 extends GeneratedMessageV3 implements S2C_OpenUiResult_8302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LIKES_FIELD_NUMBER = 1;
      private int likes_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int CLICK_FIELD_NUMBER = 3;
      private int click_;
      public static final int INFOS_FIELD_NUMBER = 4;
      private List<CommentInfo> infos_;
      public static final int HEROHOTS_FIELD_NUMBER = 5;
      private int heroHots_;
      public static final int TYPE_FIELD_NUMBER = 6;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_8302 DEFAULT_INSTANCE = new S2C_OpenUiResult_8302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_8302> PARSER = new AbstractParser<S2C_OpenUiResult_8302>() {
         public S2C_OpenUiResult_8302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_8302(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_8302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_8302() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_8302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_8302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.likes_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.click_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.infos_.add(input.readMessage(HeroCommentMsg.CommentInfo.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.heroHots_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_8302.class, Builder.class);
      }

      public boolean hasLikes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLikes() {
         return this.likes_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasClick() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getClick() {
         return this.click_;
      }

      public List<CommentInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CommentInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CommentInfo getInfos(int index) {
         return (CommentInfo)this.infos_.get(index);
      }

      public CommentInfoOrBuilder getInfosOrBuilder(int index) {
         return (CommentInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasHeroHots() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroHots() {
         return this.heroHots_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasLikes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasClick()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHots()) {
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
            output.writeInt32(1, this.likes_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.click_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.heroHots_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.likes_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.click_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.heroHots_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUiResult_8302)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_8302 other = (S2C_OpenUiResult_8302)obj;
            if (this.hasLikes() != other.hasLikes()) {
               return false;
            } else if (this.hasLikes() && this.getLikes() != other.getLikes()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasClick() != other.hasClick()) {
               return false;
            } else if (this.hasClick() && this.getClick() != other.getClick()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasHeroHots() != other.hasHeroHots()) {
               return false;
            } else if (this.hasHeroHots() && this.getHeroHots() != other.getHeroHots()) {
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
            if (this.hasLikes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLikes();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasClick()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getClick();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasHeroHots()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroHots();
            }

            if (this.hasType()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUiResult_8302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8302 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_8302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_8302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_8302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_8302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_8302> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_8302> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_8302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_8302OrBuilder {
         private int bitField0_;
         private int likes_;
         private int num_;
         private int click_;
         private List<CommentInfo> infos_;
         private RepeatedFieldBuilderV3<CommentInfo, CommentInfo.Builder, CommentInfoOrBuilder> infosBuilder_;
         private int heroHots_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_8302.class, Builder.class);
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
            if (HeroCommentMsg.S2C_OpenUiResult_8302.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.likes_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.click_ = 0;
            this.bitField0_ &= -5;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.infosBuilder_.clear();
            }

            this.heroHots_ = 0;
            this.bitField0_ &= -17;
            this.type_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_OpenUiResult_8302_descriptor;
         }

         public S2C_OpenUiResult_8302 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_OpenUiResult_8302.getDefaultInstance();
         }

         public S2C_OpenUiResult_8302 build() {
            S2C_OpenUiResult_8302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_8302 buildPartial() {
            S2C_OpenUiResult_8302 result = new S2C_OpenUiResult_8302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.likes_ = this.likes_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.click_ = this.click_;
               to_bitField0_ |= 4;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -9;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.heroHots_ = this.heroHots_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_OpenUiResult_8302) {
               return this.mergeFrom((S2C_OpenUiResult_8302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_8302 other) {
            if (other == HeroCommentMsg.S2C_OpenUiResult_8302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLikes()) {
                  this.setLikes(other.getLikes());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasClick()) {
                  this.setClick(other.getClick());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.infosBuilder_ = HeroCommentMsg.S2C_OpenUiResult_8302.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasHeroHots()) {
                  this.setHeroHots(other.getHeroHots());
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
            if (!this.hasLikes()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else if (!this.hasClick()) {
               return false;
            } else if (!this.hasHeroHots()) {
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
            S2C_OpenUiResult_8302 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_8302)HeroCommentMsg.S2C_OpenUiResult_8302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_8302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLikes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLikes() {
            return this.likes_;
         }

         public Builder setLikes(int value) {
            this.bitField0_ |= 1;
            this.likes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLikes() {
            this.bitField0_ &= -2;
            this.likes_ = 0;
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

         public boolean hasClick() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getClick() {
            return this.click_;
         }

         public Builder setClick(int value) {
            this.bitField0_ |= 4;
            this.click_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearClick() {
            this.bitField0_ &= -5;
            this.click_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommentInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CommentInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CommentInfo)this.infos_.get(index) : (CommentInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CommentInfo value) {
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

         public Builder setInfos(int index, CommentInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CommentInfo value) {
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

         public Builder addInfos(int index, CommentInfo value) {
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

         public Builder addInfos(CommentInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CommentInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CommentInfo> values) {
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
               this.bitField0_ &= -9;
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

         public CommentInfo.Builder getInfosBuilder(int index) {
            return (CommentInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CommentInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CommentInfoOrBuilder)this.infos_.get(index) : (CommentInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommentInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CommentInfo.Builder addInfosBuilder() {
            return (CommentInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroCommentMsg.CommentInfo.getDefaultInstance());
         }

         public CommentInfo.Builder addInfosBuilder(int index) {
            return (CommentInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroCommentMsg.CommentInfo.getDefaultInstance());
         }

         public List<CommentInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommentInfo, CommentInfo.Builder, CommentInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasHeroHots() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeroHots() {
            return this.heroHots_;
         }

         public Builder setHeroHots(int value) {
            this.bitField0_ |= 16;
            this.heroHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroHots() {
            this.bitField0_ &= -17;
            this.heroHots_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 32;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -33;
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

   public static final class C2S_Click_8303 extends GeneratedMessageV3 implements C2S_Click_8303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final C2S_Click_8303 DEFAULT_INSTANCE = new C2S_Click_8303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Click_8303> PARSER = new AbstractParser<C2S_Click_8303>() {
         public C2S_Click_8303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Click_8303(input, extensionRegistry);
         }
      };

      private C2S_Click_8303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Click_8303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Click_8303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Click_8303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Click_8303.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Click_8303)) {
            return super.equals(obj);
         } else {
            C2S_Click_8303 other = (C2S_Click_8303)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Click_8303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data);
      }

      public static C2S_Click_8303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data);
      }

      public static C2S_Click_8303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data);
      }

      public static C2S_Click_8303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8303 parseFrom(InputStream input) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Click_8303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Click_8303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Click_8303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Click_8303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Click_8303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Click_8303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Click_8303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Click_8303> parser() {
         return PARSER;
      }

      public Parser<C2S_Click_8303> getParserForType() {
         return PARSER;
      }

      public C2S_Click_8303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Click_8303OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Click_8303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_Click_8303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Click_8303_descriptor;
         }

         public C2S_Click_8303 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_Click_8303.getDefaultInstance();
         }

         public C2S_Click_8303 build() {
            C2S_Click_8303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Click_8303 buildPartial() {
            C2S_Click_8303 result = new C2S_Click_8303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof C2S_Click_8303) {
               return this.mergeFrom((C2S_Click_8303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Click_8303 other) {
            if (other == HeroCommentMsg.C2S_Click_8303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Click_8303 parsedMessage = null;

            try {
               parsedMessage = (C2S_Click_8303)HeroCommentMsg.C2S_Click_8303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Click_8303)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

   public static final class S2C_ClickResult_8304 extends GeneratedMessageV3 implements S2C_ClickResult_8304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int LIKES_FIELD_NUMBER = 2;
      private int likes_;
      public static final int HEROHOTS_FIELD_NUMBER = 3;
      private int heroHots_;
      private byte memoizedIsInitialized;
      private static final S2C_ClickResult_8304 DEFAULT_INSTANCE = new S2C_ClickResult_8304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ClickResult_8304> PARSER = new AbstractParser<S2C_ClickResult_8304>() {
         public S2C_ClickResult_8304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ClickResult_8304(input, extensionRegistry);
         }
      };

      private S2C_ClickResult_8304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ClickResult_8304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ClickResult_8304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ClickResult_8304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.likes_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroHots_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ClickResult_8304.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasLikes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLikes() {
         return this.likes_;
      }

      public boolean hasHeroHots() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroHots() {
         return this.heroHots_;
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
         } else if (!this.hasLikes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHots()) {
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
            output.writeInt32(2, this.likes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroHots_);
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
               size += CodedOutputStream.computeInt32Size(2, this.likes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroHots_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ClickResult_8304)) {
            return super.equals(obj);
         } else {
            S2C_ClickResult_8304 other = (S2C_ClickResult_8304)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasLikes() != other.hasLikes()) {
               return false;
            } else if (this.hasLikes() && this.getLikes() != other.getLikes()) {
               return false;
            } else if (this.hasHeroHots() != other.hasHeroHots()) {
               return false;
            } else if (this.hasHeroHots() && this.getHeroHots() != other.getHeroHots()) {
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

            if (this.hasLikes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLikes();
            }

            if (this.hasHeroHots()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroHots();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ClickResult_8304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8304 parseFrom(InputStream input) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ClickResult_8304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ClickResult_8304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ClickResult_8304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ClickResult_8304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ClickResult_8304> parser() {
         return PARSER;
      }

      public Parser<S2C_ClickResult_8304> getParserForType() {
         return PARSER;
      }

      public S2C_ClickResult_8304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ClickResult_8304OrBuilder {
         private int bitField0_;
         private int result_;
         private int likes_;
         private int heroHots_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ClickResult_8304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2C_ClickResult_8304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.likes_ = 0;
            this.bitField0_ &= -3;
            this.heroHots_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ClickResult_8304_descriptor;
         }

         public S2C_ClickResult_8304 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_ClickResult_8304.getDefaultInstance();
         }

         public S2C_ClickResult_8304 build() {
            S2C_ClickResult_8304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ClickResult_8304 buildPartial() {
            S2C_ClickResult_8304 result = new S2C_ClickResult_8304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.likes_ = this.likes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroHots_ = this.heroHots_;
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
            if (other instanceof S2C_ClickResult_8304) {
               return this.mergeFrom((S2C_ClickResult_8304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ClickResult_8304 other) {
            if (other == HeroCommentMsg.S2C_ClickResult_8304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasLikes()) {
                  this.setLikes(other.getLikes());
               }

               if (other.hasHeroHots()) {
                  this.setHeroHots(other.getHeroHots());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasLikes()) {
               return false;
            } else {
               return this.hasHeroHots();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ClickResult_8304 parsedMessage = null;

            try {
               parsedMessage = (S2C_ClickResult_8304)HeroCommentMsg.S2C_ClickResult_8304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ClickResult_8304)e.getUnfinishedMessage();
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

         public boolean hasLikes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLikes() {
            return this.likes_;
         }

         public Builder setLikes(int value) {
            this.bitField0_ |= 2;
            this.likes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLikes() {
            this.bitField0_ &= -3;
            this.likes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroHots() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroHots() {
            return this.heroHots_;
         }

         public Builder setHeroHots(int value) {
            this.bitField0_ |= 4;
            this.heroHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroHots() {
            this.bitField0_ &= -5;
            this.heroHots_ = 0;
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

   public static final class C2S_Comment_8305 extends GeneratedMessageV3 implements C2S_Comment_8305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CONTEXT_FIELD_NUMBER = 2;
      private volatile Object context_;
      private byte memoizedIsInitialized;
      private static final C2S_Comment_8305 DEFAULT_INSTANCE = new C2S_Comment_8305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Comment_8305> PARSER = new AbstractParser<C2S_Comment_8305>() {
         public C2S_Comment_8305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Comment_8305(input, extensionRegistry);
         }
      };

      private C2S_Comment_8305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Comment_8305() {
         this.memoizedIsInitialized = -1;
         this.context_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Comment_8305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Comment_8305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.context_ = bs;
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Comment_8305.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasContext() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContext() {
         Object ref = this.context_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.context_ = s;
            }

            return s;
         }
      }

      public ByteString getContextBytes() {
         Object ref = this.context_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.context_ = b;
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
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContext()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.context_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.context_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Comment_8305)) {
            return super.equals(obj);
         } else {
            C2S_Comment_8305 other = (C2S_Comment_8305)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasContext() != other.hasContext()) {
               return false;
            } else if (this.hasContext() && !this.getContext().equals(other.getContext())) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasContext()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContext().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Comment_8305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data);
      }

      public static C2S_Comment_8305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Comment_8305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data);
      }

      public static C2S_Comment_8305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Comment_8305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data);
      }

      public static C2S_Comment_8305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Comment_8305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Comment_8305 parseFrom(InputStream input) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Comment_8305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Comment_8305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Comment_8305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Comment_8305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Comment_8305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Comment_8305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Comment_8305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Comment_8305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Comment_8305> parser() {
         return PARSER;
      }

      public Parser<C2S_Comment_8305> getParserForType() {
         return PARSER;
      }

      public C2S_Comment_8305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Comment_8305OrBuilder {
         private int bitField0_;
         private int heroId_;
         private Object context_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Comment_8305.class, Builder.class);
         }

         private Builder() {
            this.context_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.context_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_Comment_8305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.context_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_Comment_8305_descriptor;
         }

         public C2S_Comment_8305 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_Comment_8305.getDefaultInstance();
         }

         public C2S_Comment_8305 build() {
            C2S_Comment_8305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Comment_8305 buildPartial() {
            C2S_Comment_8305 result = new C2S_Comment_8305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.context_ = this.context_;
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
            if (other instanceof C2S_Comment_8305) {
               return this.mergeFrom((C2S_Comment_8305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Comment_8305 other) {
            if (other == HeroCommentMsg.C2S_Comment_8305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasContext()) {
                  this.bitField0_ |= 2;
                  this.context_ = other.context_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else {
               return this.hasContext();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Comment_8305 parsedMessage = null;

            try {
               parsedMessage = (C2S_Comment_8305)HeroCommentMsg.C2S_Comment_8305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Comment_8305)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasContext() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContext() {
            Object ref = this.context_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.context_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContextBytes() {
            Object ref = this.context_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.context_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContext(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContext() {
            this.bitField0_ &= -3;
            this.context_ = HeroCommentMsg.C2S_Comment_8305.getDefaultInstance().getContext();
            this.onChanged();
            return this;
         }

         public Builder setContextBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
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

   public static final class S2C_CommentResult_8306 extends GeneratedMessageV3 implements S2C_CommentResult_8306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CONTEXT_FIELD_NUMBER = 2;
      private volatile Object context_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      public static final int HEROHOTS_FIELD_NUMBER = 4;
      private int heroHots_;
      private byte memoizedIsInitialized;
      private static final S2C_CommentResult_8306 DEFAULT_INSTANCE = new S2C_CommentResult_8306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommentResult_8306> PARSER = new AbstractParser<S2C_CommentResult_8306>() {
         public S2C_CommentResult_8306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommentResult_8306(input, extensionRegistry);
         }
      };

      private S2C_CommentResult_8306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommentResult_8306() {
         this.memoizedIsInitialized = -1;
         this.context_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommentResult_8306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommentResult_8306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.context_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.code_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.heroHots_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommentResult_8306.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasContext() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContext() {
         Object ref = this.context_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.context_ = s;
            }

            return s;
         }
      }

      public ByteString getContextBytes() {
         Object ref = this.context_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.context_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroHots() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroHots() {
         return this.heroHots_;
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
         } else if (!this.hasContext()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHots()) {
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
            GeneratedMessageV3.writeString(output, 2, this.context_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.heroHots_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.context_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroHots_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommentResult_8306)) {
            return super.equals(obj);
         } else {
            S2C_CommentResult_8306 other = (S2C_CommentResult_8306)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasContext() != other.hasContext()) {
               return false;
            } else if (this.hasContext() && !this.getContext().equals(other.getContext())) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroHots() != other.hasHeroHots()) {
               return false;
            } else if (this.hasHeroHots() && this.getHeroHots() != other.getHeroHots()) {
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

            if (this.hasContext()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContext().hashCode();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroHots()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroHots();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommentResult_8306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data);
      }

      public static S2C_CommentResult_8306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommentResult_8306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data);
      }

      public static S2C_CommentResult_8306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommentResult_8306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data);
      }

      public static S2C_CommentResult_8306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommentResult_8306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommentResult_8306 parseFrom(InputStream input) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommentResult_8306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommentResult_8306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommentResult_8306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommentResult_8306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommentResult_8306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommentResult_8306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommentResult_8306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommentResult_8306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommentResult_8306> parser() {
         return PARSER;
      }

      public Parser<S2C_CommentResult_8306> getParserForType() {
         return PARSER;
      }

      public S2C_CommentResult_8306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommentResult_8306OrBuilder {
         private int bitField0_;
         private int result_;
         private Object context_;
         private int code_;
         private int heroHots_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommentResult_8306.class, Builder.class);
         }

         private Builder() {
            this.context_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.context_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2C_CommentResult_8306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.context_ = "";
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            this.heroHots_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_CommentResult_8306_descriptor;
         }

         public S2C_CommentResult_8306 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_CommentResult_8306.getDefaultInstance();
         }

         public S2C_CommentResult_8306 build() {
            S2C_CommentResult_8306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommentResult_8306 buildPartial() {
            S2C_CommentResult_8306 result = new S2C_CommentResult_8306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.context_ = this.context_;
            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.heroHots_ = this.heroHots_;
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
            if (other instanceof S2C_CommentResult_8306) {
               return this.mergeFrom((S2C_CommentResult_8306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommentResult_8306 other) {
            if (other == HeroCommentMsg.S2C_CommentResult_8306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasContext()) {
                  this.bitField0_ |= 2;
                  this.context_ = other.context_;
                  this.onChanged();
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroHots()) {
                  this.setHeroHots(other.getHeroHots());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasContext()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroHots();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommentResult_8306 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommentResult_8306)HeroCommentMsg.S2C_CommentResult_8306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommentResult_8306)e.getUnfinishedMessage();
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

         public boolean hasContext() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContext() {
            Object ref = this.context_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.context_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContextBytes() {
            Object ref = this.context_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.context_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContext(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContext() {
            this.bitField0_ &= -3;
            this.context_ = HeroCommentMsg.S2C_CommentResult_8306.getDefaultInstance().getContext();
            this.onChanged();
            return this;
         }

         public Builder setContextBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroHots() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroHots() {
            return this.heroHots_;
         }

         public Builder setHeroHots(int value) {
            this.bitField0_ |= 8;
            this.heroHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroHots() {
            this.bitField0_ &= -9;
            this.heroHots_ = 0;
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

   public static final class C2S_ThumbsUp_8307 extends GeneratedMessageV3 implements C2S_ThumbsUp_8307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int OPERATION_FIELD_NUMBER = 3;
      private int operation_;
      private byte memoizedIsInitialized;
      private static final C2S_ThumbsUp_8307 DEFAULT_INSTANCE = new C2S_ThumbsUp_8307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ThumbsUp_8307> PARSER = new AbstractParser<C2S_ThumbsUp_8307>() {
         public C2S_ThumbsUp_8307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ThumbsUp_8307(input, extensionRegistry);
         }
      };

      private C2S_ThumbsUp_8307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ThumbsUp_8307() {
         this.memoizedIsInitialized = -1;
         this.operation_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ThumbsUp_8307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ThumbsUp_8307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommentOperation value = HeroCommentMsg.CommentOperation.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.operation_ = rawValue;
                        }
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ThumbsUp_8307.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasOperation() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommentOperation getOperation() {
         CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
         return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.operation_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.operation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ThumbsUp_8307)) {
            return super.equals(obj);
         } else {
            C2S_ThumbsUp_8307 other = (C2S_ThumbsUp_8307)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasOperation() != other.hasOperation()) {
               return false;
            } else if (this.hasOperation() && this.operation_ != other.operation_) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasOperation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.operation_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ThumbsUp_8307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUp_8307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUp_8307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUp_8307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUp_8307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data);
      }

      public static C2S_ThumbsUp_8307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ThumbsUp_8307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ThumbsUp_8307 parseFrom(InputStream input) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUp_8307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ThumbsUp_8307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUp_8307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ThumbsUp_8307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ThumbsUp_8307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ThumbsUp_8307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ThumbsUp_8307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ThumbsUp_8307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ThumbsUp_8307> parser() {
         return PARSER;
      }

      public Parser<C2S_ThumbsUp_8307> getParserForType() {
         return PARSER;
      }

      public C2S_ThumbsUp_8307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ThumbsUp_8307OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int code_;
         private int operation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ThumbsUp_8307.class, Builder.class);
         }

         private Builder() {
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_ThumbsUp_8307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.operation_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ThumbsUp_8307_descriptor;
         }

         public C2S_ThumbsUp_8307 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_ThumbsUp_8307.getDefaultInstance();
         }

         public C2S_ThumbsUp_8307 build() {
            C2S_ThumbsUp_8307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ThumbsUp_8307 buildPartial() {
            C2S_ThumbsUp_8307 result = new C2S_ThumbsUp_8307(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.operation_ = this.operation_;
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
            if (other instanceof C2S_ThumbsUp_8307) {
               return this.mergeFrom((C2S_ThumbsUp_8307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ThumbsUp_8307 other) {
            if (other == HeroCommentMsg.C2S_ThumbsUp_8307.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasOperation();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ThumbsUp_8307 parsedMessage = null;

            try {
               parsedMessage = (C2S_ThumbsUp_8307)HeroCommentMsg.C2S_ThumbsUp_8307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ThumbsUp_8307)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

         public boolean hasOperation() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommentOperation getOperation() {
            CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
            return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
         }

         public Builder setOperation(CommentOperation value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.operation_ = value.getNumber();
               this.onChanged();
               return this;
            }
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

   public static final class S2C_ThumbsUpResult_8308 extends GeneratedMessageV3 implements S2C_ThumbsUpResult_8308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int OPERATION_FIELD_NUMBER = 3;
      private int operation_;
      public static final int COMMENTHOTS_FIELD_NUMBER = 4;
      private int commentHots_;
      public static final int HEROHOTS_FIELD_NUMBER = 5;
      private int heroHots_;
      private byte memoizedIsInitialized;
      private static final S2C_ThumbsUpResult_8308 DEFAULT_INSTANCE = new S2C_ThumbsUpResult_8308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ThumbsUpResult_8308> PARSER = new AbstractParser<S2C_ThumbsUpResult_8308>() {
         public S2C_ThumbsUpResult_8308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ThumbsUpResult_8308(input, extensionRegistry);
         }
      };

      private S2C_ThumbsUpResult_8308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ThumbsUpResult_8308() {
         this.memoizedIsInitialized = -1;
         this.operation_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ThumbsUpResult_8308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ThumbsUpResult_8308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommentOperation value = HeroCommentMsg.CommentOperation.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.operation_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.commentHots_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.heroHots_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ThumbsUpResult_8308.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasOperation() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommentOperation getOperation() {
         CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
         return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
      }

      public boolean hasCommentHots() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCommentHots() {
         return this.commentHots_;
      }

      public boolean hasHeroHots() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeroHots() {
         return this.heroHots_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOperation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCommentHots()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHots()) {
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
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.operation_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.commentHots_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.heroHots_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.operation_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.commentHots_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.heroHots_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ThumbsUpResult_8308)) {
            return super.equals(obj);
         } else {
            S2C_ThumbsUpResult_8308 other = (S2C_ThumbsUpResult_8308)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasOperation() != other.hasOperation()) {
               return false;
            } else if (this.hasOperation() && this.operation_ != other.operation_) {
               return false;
            } else if (this.hasCommentHots() != other.hasCommentHots()) {
               return false;
            } else if (this.hasCommentHots() && this.getCommentHots() != other.getCommentHots()) {
               return false;
            } else if (this.hasHeroHots() != other.hasHeroHots()) {
               return false;
            } else if (this.hasHeroHots() && this.getHeroHots() != other.getHeroHots()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasOperation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.operation_;
            }

            if (this.hasCommentHots()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCommentHots();
            }

            if (this.hasHeroHots()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroHots();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ThumbsUpResult_8308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(InputStream input) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ThumbsUpResult_8308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpResult_8308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ThumbsUpResult_8308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ThumbsUpResult_8308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ThumbsUpResult_8308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ThumbsUpResult_8308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ThumbsUpResult_8308> parser() {
         return PARSER;
      }

      public Parser<S2C_ThumbsUpResult_8308> getParserForType() {
         return PARSER;
      }

      public S2C_ThumbsUpResult_8308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ThumbsUpResult_8308OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int operation_;
         private int commentHots_;
         private int heroHots_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ThumbsUpResult_8308.class, Builder.class);
         }

         private Builder() {
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2C_ThumbsUpResult_8308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.operation_ = 0;
            this.bitField0_ &= -5;
            this.commentHots_ = 0;
            this.bitField0_ &= -9;
            this.heroHots_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ThumbsUpResult_8308_descriptor;
         }

         public S2C_ThumbsUpResult_8308 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_ThumbsUpResult_8308.getDefaultInstance();
         }

         public S2C_ThumbsUpResult_8308 build() {
            S2C_ThumbsUpResult_8308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ThumbsUpResult_8308 buildPartial() {
            S2C_ThumbsUpResult_8308 result = new S2C_ThumbsUpResult_8308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.operation_ = this.operation_;
            if ((from_bitField0_ & 8) != 0) {
               result.commentHots_ = this.commentHots_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.heroHots_ = this.heroHots_;
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
            if (other instanceof S2C_ThumbsUpResult_8308) {
               return this.mergeFrom((S2C_ThumbsUpResult_8308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ThumbsUpResult_8308 other) {
            if (other == HeroCommentMsg.S2C_ThumbsUpResult_8308.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasOperation()) {
                  this.setOperation(other.getOperation());
               }

               if (other.hasCommentHots()) {
                  this.setCommentHots(other.getCommentHots());
               }

               if (other.hasHeroHots()) {
                  this.setHeroHots(other.getHeroHots());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else if (!this.hasOperation()) {
               return false;
            } else if (!this.hasCommentHots()) {
               return false;
            } else {
               return this.hasHeroHots();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ThumbsUpResult_8308 parsedMessage = null;

            try {
               parsedMessage = (S2C_ThumbsUpResult_8308)HeroCommentMsg.S2C_ThumbsUpResult_8308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ThumbsUpResult_8308)e.getUnfinishedMessage();
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

         public boolean hasOperation() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommentOperation getOperation() {
            CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
            return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
         }

         public Builder setOperation(CommentOperation value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.operation_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearOperation() {
            this.bitField0_ &= -5;
            this.operation_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCommentHots() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCommentHots() {
            return this.commentHots_;
         }

         public Builder setCommentHots(int value) {
            this.bitField0_ |= 8;
            this.commentHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommentHots() {
            this.bitField0_ &= -9;
            this.commentHots_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroHots() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeroHots() {
            return this.heroHots_;
         }

         public Builder setHeroHots(int value) {
            this.bitField0_ |= 16;
            this.heroHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroHots() {
            this.bitField0_ &= -17;
            this.heroHots_ = 0;
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

   public static final class C2S_DelComment_8309 extends GeneratedMessageV3 implements C2S_DelComment_8309OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_DelComment_8309 DEFAULT_INSTANCE = new C2S_DelComment_8309();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DelComment_8309> PARSER = new AbstractParser<C2S_DelComment_8309>() {
         public C2S_DelComment_8309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DelComment_8309(input, extensionRegistry);
         }
      };

      private C2S_DelComment_8309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DelComment_8309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DelComment_8309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DelComment_8309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelComment_8309.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
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
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DelComment_8309)) {
            return super.equals(obj);
         } else {
            C2S_DelComment_8309 other = (C2S_DelComment_8309)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DelComment_8309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data);
      }

      public static C2S_DelComment_8309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelComment_8309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data);
      }

      public static C2S_DelComment_8309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelComment_8309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data);
      }

      public static C2S_DelComment_8309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelComment_8309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelComment_8309 parseFrom(InputStream input) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelComment_8309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelComment_8309 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DelComment_8309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelComment_8309 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelComment_8309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelComment_8309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DelComment_8309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DelComment_8309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DelComment_8309> parser() {
         return PARSER;
      }

      public Parser<C2S_DelComment_8309> getParserForType() {
         return PARSER;
      }

      public C2S_DelComment_8309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DelComment_8309OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelComment_8309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_DelComment_8309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_DelComment_8309_descriptor;
         }

         public C2S_DelComment_8309 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_DelComment_8309.getDefaultInstance();
         }

         public C2S_DelComment_8309 build() {
            C2S_DelComment_8309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DelComment_8309 buildPartial() {
            C2S_DelComment_8309 result = new C2S_DelComment_8309(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_DelComment_8309) {
               return this.mergeFrom((C2S_DelComment_8309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DelComment_8309 other) {
            if (other == HeroCommentMsg.C2S_DelComment_8309.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DelComment_8309 parsedMessage = null;

            try {
               parsedMessage = (C2S_DelComment_8309)HeroCommentMsg.C2S_DelComment_8309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DelComment_8309)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_DelComment_8310 extends GeneratedMessageV3 implements S2C_DelComment_8310OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROID_FIELD_NUMBER = 2;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      public static final int HEROHOTS_FIELD_NUMBER = 4;
      private int heroHots_;
      private byte memoizedIsInitialized;
      private static final S2C_DelComment_8310 DEFAULT_INSTANCE = new S2C_DelComment_8310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelComment_8310> PARSER = new AbstractParser<S2C_DelComment_8310>() {
         public S2C_DelComment_8310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelComment_8310(input, extensionRegistry);
         }
      };

      private S2C_DelComment_8310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelComment_8310() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelComment_8310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelComment_8310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.code_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.heroHots_ = input.readInt32();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelComment_8310.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroHots() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroHots() {
         return this.heroHots_;
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
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHots()) {
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
            output.writeInt32(2, this.heroId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.heroHots_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroHots_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DelComment_8310)) {
            return super.equals(obj);
         } else {
            S2C_DelComment_8310 other = (S2C_DelComment_8310)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroHots() != other.hasHeroHots()) {
               return false;
            } else if (this.hasHeroHots() && this.getHeroHots() != other.getHeroHots()) {
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

            if (this.hasHeroId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroHots()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroHots();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DelComment_8310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data);
      }

      public static S2C_DelComment_8310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelComment_8310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data);
      }

      public static S2C_DelComment_8310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelComment_8310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data);
      }

      public static S2C_DelComment_8310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelComment_8310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelComment_8310 parseFrom(InputStream input) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelComment_8310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelComment_8310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelComment_8310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelComment_8310 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelComment_8310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelComment_8310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelComment_8310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelComment_8310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelComment_8310> parser() {
         return PARSER;
      }

      public Parser<S2C_DelComment_8310> getParserForType() {
         return PARSER;
      }

      public S2C_DelComment_8310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelComment_8310OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroId_;
         private int code_;
         private int heroHots_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelComment_8310.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2C_DelComment_8310.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroId_ = 0;
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            this.heroHots_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_DelComment_8310_descriptor;
         }

         public S2C_DelComment_8310 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_DelComment_8310.getDefaultInstance();
         }

         public S2C_DelComment_8310 build() {
            S2C_DelComment_8310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelComment_8310 buildPartial() {
            S2C_DelComment_8310 result = new S2C_DelComment_8310(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.heroHots_ = this.heroHots_;
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
            if (other instanceof S2C_DelComment_8310) {
               return this.mergeFrom((S2C_DelComment_8310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelComment_8310 other) {
            if (other == HeroCommentMsg.S2C_DelComment_8310.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroHots()) {
                  this.setHeroHots(other.getHeroHots());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroHots();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DelComment_8310 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelComment_8310)HeroCommentMsg.S2C_DelComment_8310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelComment_8310)e.getUnfinishedMessage();
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

         public boolean hasHeroId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 2;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -3;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroHots() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroHots() {
            return this.heroHots_;
         }

         public Builder setHeroHots(int value) {
            this.bitField0_ |= 8;
            this.heroHots_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroHots() {
            this.bitField0_ &= -9;
            this.heroHots_ = 0;
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

   public static final class C2S_ReportComment_8311 extends GeneratedMessageV3 implements C2S_ReportComment_8311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int ISSUCCESS_FIELD_NUMBER = 3;
      private boolean isSuccess_;
      private byte memoizedIsInitialized;
      private static final C2S_ReportComment_8311 DEFAULT_INSTANCE = new C2S_ReportComment_8311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReportComment_8311> PARSER = new AbstractParser<C2S_ReportComment_8311>() {
         public C2S_ReportComment_8311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReportComment_8311(input, extensionRegistry);
         }
      };

      private C2S_ReportComment_8311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReportComment_8311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReportComment_8311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReportComment_8311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isSuccess_ = input.readBool();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReportComment_8311.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsSuccess() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsSuccess() {
         return this.isSuccess_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
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
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isSuccess_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isSuccess_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReportComment_8311)) {
            return super.equals(obj);
         } else {
            C2S_ReportComment_8311 other = (C2S_ReportComment_8311)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsSuccess() != other.hasIsSuccess()) {
               return false;
            } else if (this.hasIsSuccess() && this.getIsSuccess() != other.getIsSuccess()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasIsSuccess()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReportComment_8311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data);
      }

      public static C2S_ReportComment_8311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportComment_8311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data);
      }

      public static C2S_ReportComment_8311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportComment_8311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data);
      }

      public static C2S_ReportComment_8311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportComment_8311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportComment_8311 parseFrom(InputStream input) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReportComment_8311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReportComment_8311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReportComment_8311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReportComment_8311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReportComment_8311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportComment_8311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReportComment_8311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReportComment_8311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReportComment_8311> parser() {
         return PARSER;
      }

      public Parser<C2S_ReportComment_8311> getParserForType() {
         return PARSER;
      }

      public C2S_ReportComment_8311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReportComment_8311OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int code_;
         private boolean isSuccess_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReportComment_8311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.C2S_ReportComment_8311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.isSuccess_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_C2S_ReportComment_8311_descriptor;
         }

         public C2S_ReportComment_8311 getDefaultInstanceForType() {
            return HeroCommentMsg.C2S_ReportComment_8311.getDefaultInstance();
         }

         public C2S_ReportComment_8311 build() {
            C2S_ReportComment_8311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReportComment_8311 buildPartial() {
            C2S_ReportComment_8311 result = new C2S_ReportComment_8311(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isSuccess_ = this.isSuccess_;
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
            if (other instanceof C2S_ReportComment_8311) {
               return this.mergeFrom((C2S_ReportComment_8311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReportComment_8311 other) {
            if (other == HeroCommentMsg.C2S_ReportComment_8311.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsSuccess()) {
                  this.setIsSuccess(other.getIsSuccess());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReportComment_8311 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReportComment_8311)HeroCommentMsg.C2S_ReportComment_8311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReportComment_8311)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

         public boolean hasIsSuccess() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsSuccess() {
            return this.isSuccess_;
         }

         public Builder setIsSuccess(boolean value) {
            this.bitField0_ |= 4;
            this.isSuccess_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSuccess() {
            this.bitField0_ &= -5;
            this.isSuccess_ = false;
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

   public static final class S2C_ReportResult_8312 extends GeneratedMessageV3 implements S2C_ReportResult_8312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private CommentInfo infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ReportResult_8312 DEFAULT_INSTANCE = new S2C_ReportResult_8312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReportResult_8312> PARSER = new AbstractParser<S2C_ReportResult_8312>() {
         public S2C_ReportResult_8312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReportResult_8312(input, extensionRegistry);
         }
      };

      private S2C_ReportResult_8312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReportResult_8312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReportResult_8312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReportResult_8312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommentInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.infos_.toBuilder();
                        }

                        this.infos_ = (CommentInfo)input.readMessage(HeroCommentMsg.CommentInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.infos_);
                           this.infos_ = subBuilder.buildPartial();
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReportResult_8312.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfos() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommentInfo getInfos() {
         return this.infos_ == null ? HeroCommentMsg.CommentInfo.getDefaultInstance() : this.infos_;
      }

      public CommentInfoOrBuilder getInfosOrBuilder() {
         return this.infos_ == null ? HeroCommentMsg.CommentInfo.getDefaultInstance() : this.infos_;
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
         } else if (this.hasInfos() && !this.getInfos().isInitialized()) {
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
            output.writeMessage(2, this.getInfos());
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
               size += CodedOutputStream.computeMessageSize(2, this.getInfos());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReportResult_8312)) {
            return super.equals(obj);
         } else {
            S2C_ReportResult_8312 other = (S2C_ReportResult_8312)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfos() != other.hasInfos()) {
               return false;
            } else if (this.hasInfos() && !this.getInfos().equals(other.getInfos())) {
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

            if (this.hasInfos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfos().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReportResult_8312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data);
      }

      public static S2C_ReportResult_8312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportResult_8312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data);
      }

      public static S2C_ReportResult_8312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportResult_8312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data);
      }

      public static S2C_ReportResult_8312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportResult_8312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportResult_8312 parseFrom(InputStream input) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReportResult_8312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReportResult_8312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReportResult_8312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReportResult_8312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReportResult_8312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportResult_8312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReportResult_8312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReportResult_8312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReportResult_8312> parser() {
         return PARSER;
      }

      public Parser<S2C_ReportResult_8312> getParserForType() {
         return PARSER;
      }

      public S2C_ReportResult_8312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReportResult_8312OrBuilder {
         private int bitField0_;
         private int result_;
         private CommentInfo infos_;
         private SingleFieldBuilderV3<CommentInfo, CommentInfo.Builder, CommentInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReportResult_8312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2C_ReportResult_8312.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = null;
            } else {
               this.infosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2C_ReportResult_8312_descriptor;
         }

         public S2C_ReportResult_8312 getDefaultInstanceForType() {
            return HeroCommentMsg.S2C_ReportResult_8312.getDefaultInstance();
         }

         public S2C_ReportResult_8312 build() {
            S2C_ReportResult_8312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReportResult_8312 buildPartial() {
            S2C_ReportResult_8312 result = new S2C_ReportResult_8312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infosBuilder_ == null) {
                  result.infos_ = this.infos_;
               } else {
                  result.infos_ = (CommentInfo)this.infosBuilder_.build();
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
            if (other instanceof S2C_ReportResult_8312) {
               return this.mergeFrom((S2C_ReportResult_8312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReportResult_8312 other) {
            if (other == HeroCommentMsg.S2C_ReportResult_8312.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfos()) {
                  this.mergeInfos(other.getInfos());
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
               return !this.hasInfos() || this.getInfos().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReportResult_8312 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReportResult_8312)HeroCommentMsg.S2C_ReportResult_8312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReportResult_8312)e.getUnfinishedMessage();
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

         public boolean hasInfos() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommentInfo getInfos() {
            if (this.infosBuilder_ == null) {
               return this.infos_ == null ? HeroCommentMsg.CommentInfo.getDefaultInstance() : this.infos_;
            } else {
               return (CommentInfo)this.infosBuilder_.getMessage();
            }
         }

         public Builder setInfos(CommentInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.infos_ = value;
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfos(CommentInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.infos_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfos(CommentInfo value) {
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.infos_ != null && this.infos_ != HeroCommentMsg.CommentInfo.getDefaultInstance()) {
                  this.infos_ = HeroCommentMsg.CommentInfo.newBuilder(this.infos_).mergeFrom(value).buildPartial();
               } else {
                  this.infos_ = value;
               }

               this.onChanged();
            } else {
               this.infosBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = null;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommentInfo.Builder getInfosBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommentInfo.Builder)this.getInfosFieldBuilder().getBuilder();
         }

         public CommentInfoOrBuilder getInfosOrBuilder() {
            if (this.infosBuilder_ != null) {
               return (CommentInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder();
            } else {
               return this.infos_ == null ? HeroCommentMsg.CommentInfo.getDefaultInstance() : this.infos_;
            }
         }

         private SingleFieldBuilderV3<CommentInfo, CommentInfo.Builder, CommentInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new SingleFieldBuilderV3(this.getInfos(), this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_ReportResult_8313 extends GeneratedMessageV3 implements S2S_ReportResult_8313OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_ReportResult_8313 DEFAULT_INSTANCE = new S2S_ReportResult_8313();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_ReportResult_8313> PARSER = new AbstractParser<S2S_ReportResult_8313>() {
         public S2S_ReportResult_8313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_ReportResult_8313(input, extensionRegistry);
         }
      };

      private S2S_ReportResult_8313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_ReportResult_8313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_ReportResult_8313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_ReportResult_8313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportResult_8313.class, Builder.class);
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
         } else if (!(obj instanceof S2S_ReportResult_8313)) {
            return super.equals(obj);
         } else {
            S2S_ReportResult_8313 other = (S2S_ReportResult_8313)obj;
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

      public static S2S_ReportResult_8313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_8313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_8313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_8313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_8313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_8313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_8313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_8313 parseFrom(InputStream input) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_8313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportResult_8313 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_8313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportResult_8313 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_8313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_8313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_ReportResult_8313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_ReportResult_8313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_ReportResult_8313> parser() {
         return PARSER;
      }

      public Parser<S2S_ReportResult_8313> getParserForType() {
         return PARSER;
      }

      public S2S_ReportResult_8313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_ReportResult_8313OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportResult_8313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCommentMsg.S2S_ReportResult_8313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCommentMsg.internal_static_herocomment_com_gzbz_protobuf_S2S_ReportResult_8313_descriptor;
         }

         public S2S_ReportResult_8313 getDefaultInstanceForType() {
            return HeroCommentMsg.S2S_ReportResult_8313.getDefaultInstance();
         }

         public S2S_ReportResult_8313 build() {
            S2S_ReportResult_8313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_ReportResult_8313 buildPartial() {
            S2S_ReportResult_8313 result = new S2S_ReportResult_8313(this);
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
            if (other instanceof S2S_ReportResult_8313) {
               return this.mergeFrom((S2S_ReportResult_8313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_ReportResult_8313 other) {
            if (other == HeroCommentMsg.S2S_ReportResult_8313.getDefaultInstance()) {
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
            S2S_ReportResult_8313 parsedMessage = null;

            try {
               parsedMessage = (S2S_ReportResult_8313)HeroCommentMsg.S2S_ReportResult_8313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_ReportResult_8313)e.getUnfinishedMessage();
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

   public interface C2S_Click_8303OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface C2S_Comment_8305OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasContext();

      String getContext();

      ByteString getContextBytes();
   }

   public interface C2S_DelComment_8309OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();
   }

   public interface C2S_OpenUi_8301OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasType();

      int getType();
   }

   public interface C2S_ReportComment_8311OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();

      boolean hasIsSuccess();

      boolean getIsSuccess();
   }

   public interface C2S_ThumbsUp_8307OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();

      boolean hasOperation();

      CommentOperation getOperation();
   }

   public interface CommentInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasContent();

      String getContent();

      ByteString getContentBytes();

      boolean hasLikeNum();

      int getLikeNum();

      boolean hasHateNum();

      int getHateNum();

      boolean hasMyOperation();

      CommentOperation getMyOperation();

      boolean hasCreateTime();

      int getCreateTime();

      boolean hasCommentHots();

      int getCommentHots();

      boolean hasIsReport();

      boolean getIsReport();
   }

   public interface S2C_ClickResult_8304OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasLikes();

      int getLikes();

      boolean hasHeroHots();

      int getHeroHots();
   }

   public interface S2C_CommentResult_8306OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasContext();

      String getContext();

      ByteString getContextBytes();

      boolean hasCode();

      int getCode();

      boolean hasHeroHots();

      int getHeroHots();
   }

   public interface S2C_DelComment_8310OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();

      boolean hasHeroHots();

      int getHeroHots();
   }

   public interface S2C_OpenUiResult_8302OrBuilder extends MessageOrBuilder {
      boolean hasLikes();

      int getLikes();

      boolean hasNum();

      int getNum();

      boolean hasClick();

      int getClick();

      List<CommentInfo> getInfosList();

      CommentInfo getInfos(int index);

      int getInfosCount();

      List<? extends CommentInfoOrBuilder> getInfosOrBuilderList();

      CommentInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasHeroHots();

      int getHeroHots();

      boolean hasType();

      int getType();
   }

   public interface S2C_ReportResult_8312OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfos();

      CommentInfo getInfos();

      CommentInfoOrBuilder getInfosOrBuilder();
   }

   public interface S2C_ThumbsUpResult_8308OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasOperation();

      CommentOperation getOperation();

      boolean hasCommentHots();

      int getCommentHots();

      boolean hasHeroHots();

      int getHeroHots();
   }

   public interface S2S_ReportResult_8313OrBuilder extends MessageOrBuilder {
   }
}
