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

public final class MergeWarBossMsg {
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MergeWarBossMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012MergeWarBoss.proto\u0012\u001emergeWarBoss.com.gzbz.protobuf\u001a\nRank.proto\u001a\fcommon.proto\"\u0014\n\u0012C2S_BossInfo_19401\"D\n\u0012S2C_BossInfo_19402\u0012\r\n\u0005figth\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003buy\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ntotalFight\u0018\u0003 \u0002(\u0005\"\u0017\n\u0015C2S_BuyFightNum_19403\"$\n\u0015S2C_BuyFightNum_19404\u0012\u000b\n\u0003buy\u0018\u0001 \u0002(\u0005\"¡\u0001\n\u0016S2C_ActivityInfo_19408\u0012\u0012\n\ncreateType\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bsubState\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rfirstOpenTime\u0018\u0004 \u0002(\u0005\u0012\u0016\n\u000esecondOpenTime\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nmodelGroup\u0018\u0007 \u0002(\u0005\"8\n\u0015S2C_UpdateState_19410\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsubState\u0018\u0002 \u0002(\u0005\"J\n\u0012S2C_HurtRank_19412\u00124\n\u0005ranks\u0018\u0003 \u0003(\u000b2%.rank.com.gzbz.protobuf.RankUnionData\" \n\u000fC2S_Enter_19413\u0012\r\n\u0005leave\u0018\u0001 \u0001(\b\"\u0014\n\u0012C2S_TaskList_19415\"4\n\u0012S2C_TaskList_19416\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\"&\n\u0014C2S_CommitTask_19417\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_19418\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"6\n\u0014S2C_UpdateTask_19420\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\":\n\u0017S2C_CloseEntrance_19422\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsubState\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_EntranceInfo_19423\".\n\u0016S2C_EntranceInfo_19424\u0012\u0014\n\fopenEntrance\u0018\u0001 \u0002(\b\"\u0016\n\u0014C2S_QuickFight_19425B&\n\u0011com.gzbz.protobufB\u000fMergeWarBossMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor, new String[0]);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor, new String[]{"Figth", "Buy", "TotalFight"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor, new String[0]);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor, new String[]{"Buy"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor, new String[]{"CreateType", "Stage", "SubState", "FirstOpenTime", "SecondOpenTime", "EndTime", "ModelGroup"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor, new String[]{"Stage", "SubState"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor, new String[]{"Ranks"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor, new String[]{"Leave"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor, new String[0]);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor, new String[]{"TaskList"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor, new String[]{"TaskId"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor, new String[]{"TaskId"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor, new String[]{"TaskList"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor, new String[]{"Stage", "SubState"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor, new String[0]);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor, new String[]{"OpenEntrance"});
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor, new String[0]);
      RankMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_BossInfo_19401 extends GeneratedMessageV3 implements C2S_BossInfo_19401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BossInfo_19401 DEFAULT_INSTANCE = new C2S_BossInfo_19401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BossInfo_19401> PARSER = new AbstractParser<C2S_BossInfo_19401>() {
         public C2S_BossInfo_19401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BossInfo_19401(input, extensionRegistry);
         }
      };

      private C2S_BossInfo_19401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BossInfo_19401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BossInfo_19401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BossInfo_19401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BossInfo_19401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BossInfo_19401)) {
            return super.equals(obj);
         } else {
            C2S_BossInfo_19401 other = (C2S_BossInfo_19401)obj;
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

      public static C2S_BossInfo_19401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data);
      }

      public static C2S_BossInfo_19401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BossInfo_19401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data);
      }

      public static C2S_BossInfo_19401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BossInfo_19401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data);
      }

      public static C2S_BossInfo_19401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BossInfo_19401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BossInfo_19401 parseFrom(InputStream input) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BossInfo_19401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BossInfo_19401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BossInfo_19401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BossInfo_19401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BossInfo_19401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BossInfo_19401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BossInfo_19401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BossInfo_19401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BossInfo_19401> parser() {
         return PARSER;
      }

      public Parser<C2S_BossInfo_19401> getParserForType() {
         return PARSER;
      }

      public C2S_BossInfo_19401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BossInfo_19401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BossInfo_19401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_BossInfo_19401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BossInfo_19401_descriptor;
         }

         public C2S_BossInfo_19401 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_BossInfo_19401.getDefaultInstance();
         }

         public C2S_BossInfo_19401 build() {
            C2S_BossInfo_19401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BossInfo_19401 buildPartial() {
            C2S_BossInfo_19401 result = new C2S_BossInfo_19401(this);
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
            if (other instanceof C2S_BossInfo_19401) {
               return this.mergeFrom((C2S_BossInfo_19401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BossInfo_19401 other) {
            if (other == MergeWarBossMsg.C2S_BossInfo_19401.getDefaultInstance()) {
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
            C2S_BossInfo_19401 parsedMessage = null;

            try {
               parsedMessage = (C2S_BossInfo_19401)MergeWarBossMsg.C2S_BossInfo_19401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BossInfo_19401)e.getUnfinishedMessage();
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

   public static final class S2C_BossInfo_19402 extends GeneratedMessageV3 implements S2C_BossInfo_19402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGTH_FIELD_NUMBER = 1;
      private int figth_;
      public static final int BUY_FIELD_NUMBER = 2;
      private int buy_;
      public static final int TOTALFIGHT_FIELD_NUMBER = 3;
      private int totalFight_;
      private byte memoizedIsInitialized;
      private static final S2C_BossInfo_19402 DEFAULT_INSTANCE = new S2C_BossInfo_19402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BossInfo_19402> PARSER = new AbstractParser<S2C_BossInfo_19402>() {
         public S2C_BossInfo_19402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BossInfo_19402(input, extensionRegistry);
         }
      };

      private S2C_BossInfo_19402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BossInfo_19402() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BossInfo_19402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BossInfo_19402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.figth_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buy_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.totalFight_ = input.readInt32();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BossInfo_19402.class, Builder.class);
      }

      public boolean hasFigth() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFigth() {
         return this.figth_;
      }

      public boolean hasBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuy() {
         return this.buy_;
      }

      public boolean hasTotalFight() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTotalFight() {
         return this.totalFight_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFigth()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.figth_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buy_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.totalFight_);
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
               size += CodedOutputStream.computeInt32Size(1, this.figth_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buy_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.totalFight_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BossInfo_19402)) {
            return super.equals(obj);
         } else {
            S2C_BossInfo_19402 other = (S2C_BossInfo_19402)obj;
            if (this.hasFigth() != other.hasFigth()) {
               return false;
            } else if (this.hasFigth() && this.getFigth() != other.getFigth()) {
               return false;
            } else if (this.hasBuy() != other.hasBuy()) {
               return false;
            } else if (this.hasBuy() && this.getBuy() != other.getBuy()) {
               return false;
            } else if (this.hasTotalFight() != other.hasTotalFight()) {
               return false;
            } else if (this.hasTotalFight() && this.getTotalFight() != other.getTotalFight()) {
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
            if (this.hasFigth()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFigth();
            }

            if (this.hasBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuy();
            }

            if (this.hasTotalFight()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTotalFight();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BossInfo_19402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data);
      }

      public static S2C_BossInfo_19402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BossInfo_19402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data);
      }

      public static S2C_BossInfo_19402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BossInfo_19402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data);
      }

      public static S2C_BossInfo_19402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BossInfo_19402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BossInfo_19402 parseFrom(InputStream input) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BossInfo_19402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BossInfo_19402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BossInfo_19402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BossInfo_19402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BossInfo_19402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BossInfo_19402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BossInfo_19402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BossInfo_19402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BossInfo_19402> parser() {
         return PARSER;
      }

      public Parser<S2C_BossInfo_19402> getParserForType() {
         return PARSER;
      }

      public S2C_BossInfo_19402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BossInfo_19402OrBuilder {
         private int bitField0_;
         private int figth_;
         private int buy_;
         private int totalFight_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BossInfo_19402.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_BossInfo_19402.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.figth_ = 0;
            this.bitField0_ &= -2;
            this.buy_ = 0;
            this.bitField0_ &= -3;
            this.totalFight_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BossInfo_19402_descriptor;
         }

         public S2C_BossInfo_19402 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_BossInfo_19402.getDefaultInstance();
         }

         public S2C_BossInfo_19402 build() {
            S2C_BossInfo_19402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BossInfo_19402 buildPartial() {
            S2C_BossInfo_19402 result = new S2C_BossInfo_19402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.figth_ = this.figth_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buy_ = this.buy_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalFight_ = this.totalFight_;
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
            if (other instanceof S2C_BossInfo_19402) {
               return this.mergeFrom((S2C_BossInfo_19402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BossInfo_19402 other) {
            if (other == MergeWarBossMsg.S2C_BossInfo_19402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFigth()) {
                  this.setFigth(other.getFigth());
               }

               if (other.hasBuy()) {
                  this.setBuy(other.getBuy());
               }

               if (other.hasTotalFight()) {
                  this.setTotalFight(other.getTotalFight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFigth()) {
               return false;
            } else if (!this.hasBuy()) {
               return false;
            } else {
               return this.hasTotalFight();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BossInfo_19402 parsedMessage = null;

            try {
               parsedMessage = (S2C_BossInfo_19402)MergeWarBossMsg.S2C_BossInfo_19402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BossInfo_19402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFigth() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFigth() {
            return this.figth_;
         }

         public Builder setFigth(int value) {
            this.bitField0_ |= 1;
            this.figth_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFigth() {
            this.bitField0_ &= -2;
            this.figth_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuy() {
            return this.buy_;
         }

         public Builder setBuy(int value) {
            this.bitField0_ |= 2;
            this.buy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuy() {
            this.bitField0_ &= -3;
            this.buy_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalFight() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTotalFight() {
            return this.totalFight_;
         }

         public Builder setTotalFight(int value) {
            this.bitField0_ |= 4;
            this.totalFight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalFight() {
            this.bitField0_ &= -5;
            this.totalFight_ = 0;
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

   public static final class C2S_BuyFightNum_19403 extends GeneratedMessageV3 implements C2S_BuyFightNum_19403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyFightNum_19403 DEFAULT_INSTANCE = new C2S_BuyFightNum_19403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyFightNum_19403> PARSER = new AbstractParser<C2S_BuyFightNum_19403>() {
         public C2S_BuyFightNum_19403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyFightNum_19403(input, extensionRegistry);
         }
      };

      private C2S_BuyFightNum_19403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyFightNum_19403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyFightNum_19403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyFightNum_19403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFightNum_19403.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyFightNum_19403)) {
            return super.equals(obj);
         } else {
            C2S_BuyFightNum_19403 other = (C2S_BuyFightNum_19403)obj;
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

      public static C2S_BuyFightNum_19403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data);
      }

      public static C2S_BuyFightNum_19403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFightNum_19403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data);
      }

      public static C2S_BuyFightNum_19403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFightNum_19403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data);
      }

      public static C2S_BuyFightNum_19403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFightNum_19403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFightNum_19403 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFightNum_19403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFightNum_19403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyFightNum_19403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFightNum_19403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFightNum_19403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFightNum_19403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyFightNum_19403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyFightNum_19403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyFightNum_19403> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyFightNum_19403> getParserForType() {
         return PARSER;
      }

      public C2S_BuyFightNum_19403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyFightNum_19403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFightNum_19403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_BuyFightNum_19403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_BuyFightNum_19403_descriptor;
         }

         public C2S_BuyFightNum_19403 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_BuyFightNum_19403.getDefaultInstance();
         }

         public C2S_BuyFightNum_19403 build() {
            C2S_BuyFightNum_19403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyFightNum_19403 buildPartial() {
            C2S_BuyFightNum_19403 result = new C2S_BuyFightNum_19403(this);
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
            if (other instanceof C2S_BuyFightNum_19403) {
               return this.mergeFrom((C2S_BuyFightNum_19403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyFightNum_19403 other) {
            if (other == MergeWarBossMsg.C2S_BuyFightNum_19403.getDefaultInstance()) {
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
            C2S_BuyFightNum_19403 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyFightNum_19403)MergeWarBossMsg.C2S_BuyFightNum_19403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyFightNum_19403)e.getUnfinishedMessage();
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

   public static final class S2C_BuyFightNum_19404 extends GeneratedMessageV3 implements S2C_BuyFightNum_19404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUY_FIELD_NUMBER = 1;
      private int buy_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyFightNum_19404 DEFAULT_INSTANCE = new S2C_BuyFightNum_19404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyFightNum_19404> PARSER = new AbstractParser<S2C_BuyFightNum_19404>() {
         public S2C_BuyFightNum_19404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyFightNum_19404(input, extensionRegistry);
         }
      };

      private S2C_BuyFightNum_19404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyFightNum_19404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyFightNum_19404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyFightNum_19404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buy_ = input.readInt32();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFightNum_19404.class, Builder.class);
      }

      public boolean hasBuy() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuy() {
         return this.buy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyFightNum_19404)) {
            return super.equals(obj);
         } else {
            S2C_BuyFightNum_19404 other = (S2C_BuyFightNum_19404)obj;
            if (this.hasBuy() != other.hasBuy()) {
               return false;
            } else if (this.hasBuy() && this.getBuy() != other.getBuy()) {
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
            if (this.hasBuy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyFightNum_19404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data);
      }

      public static S2C_BuyFightNum_19404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFightNum_19404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data);
      }

      public static S2C_BuyFightNum_19404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFightNum_19404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data);
      }

      public static S2C_BuyFightNum_19404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFightNum_19404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFightNum_19404 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFightNum_19404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFightNum_19404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyFightNum_19404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFightNum_19404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFightNum_19404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFightNum_19404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyFightNum_19404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyFightNum_19404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyFightNum_19404> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyFightNum_19404> getParserForType() {
         return PARSER;
      }

      public S2C_BuyFightNum_19404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyFightNum_19404OrBuilder {
         private int bitField0_;
         private int buy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFightNum_19404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_BuyFightNum_19404.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_BuyFightNum_19404_descriptor;
         }

         public S2C_BuyFightNum_19404 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_BuyFightNum_19404.getDefaultInstance();
         }

         public S2C_BuyFightNum_19404 build() {
            S2C_BuyFightNum_19404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyFightNum_19404 buildPartial() {
            S2C_BuyFightNum_19404 result = new S2C_BuyFightNum_19404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buy_ = this.buy_;
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
            if (other instanceof S2C_BuyFightNum_19404) {
               return this.mergeFrom((S2C_BuyFightNum_19404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyFightNum_19404 other) {
            if (other == MergeWarBossMsg.S2C_BuyFightNum_19404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuy()) {
                  this.setBuy(other.getBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuy();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyFightNum_19404 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyFightNum_19404)MergeWarBossMsg.S2C_BuyFightNum_19404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyFightNum_19404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuy() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuy() {
            return this.buy_;
         }

         public Builder setBuy(int value) {
            this.bitField0_ |= 1;
            this.buy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuy() {
            this.bitField0_ &= -2;
            this.buy_ = 0;
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

   public static final class S2C_ActivityInfo_19408 extends GeneratedMessageV3 implements S2C_ActivityInfo_19408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETYPE_FIELD_NUMBER = 1;
      private int createType_;
      public static final int STAGE_FIELD_NUMBER = 2;
      private int stage_;
      public static final int SUBSTATE_FIELD_NUMBER = 3;
      private int subState_;
      public static final int FIRSTOPENTIME_FIELD_NUMBER = 4;
      private int firstOpenTime_;
      public static final int SECONDOPENTIME_FIELD_NUMBER = 5;
      private int secondOpenTime_;
      public static final int ENDTIME_FIELD_NUMBER = 6;
      private int endTime_;
      public static final int MODELGROUP_FIELD_NUMBER = 7;
      private int modelGroup_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_19408 DEFAULT_INSTANCE = new S2C_ActivityInfo_19408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_19408> PARSER = new AbstractParser<S2C_ActivityInfo_19408>() {
         public S2C_ActivityInfo_19408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_19408(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_19408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_19408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_19408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_19408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.createType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stage_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.subState_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.firstOpenTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.secondOpenTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.endTime_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.modelGroup_ = input.readInt32();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_19408.class, Builder.class);
      }

      public boolean hasCreateType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCreateType() {
         return this.createType_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSubState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSubState() {
         return this.subState_;
      }

      public boolean hasFirstOpenTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFirstOpenTime() {
         return this.firstOpenTime_;
      }

      public boolean hasSecondOpenTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSecondOpenTime() {
         return this.secondOpenTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasModelGroup() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getModelGroup() {
         return this.modelGroup_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCreateType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSubState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFirstOpenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSecondOpenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasModelGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.createType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stage_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.subState_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.firstOpenTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.secondOpenTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.endTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.modelGroup_);
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
               size += CodedOutputStream.computeInt32Size(1, this.createType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stage_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.subState_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.firstOpenTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.secondOpenTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.endTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.modelGroup_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_19408)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_19408 other = (S2C_ActivityInfo_19408)obj;
            if (this.hasCreateType() != other.hasCreateType()) {
               return false;
            } else if (this.hasCreateType() && this.getCreateType() != other.getCreateType()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSubState() != other.hasSubState()) {
               return false;
            } else if (this.hasSubState() && this.getSubState() != other.getSubState()) {
               return false;
            } else if (this.hasFirstOpenTime() != other.hasFirstOpenTime()) {
               return false;
            } else if (this.hasFirstOpenTime() && this.getFirstOpenTime() != other.getFirstOpenTime()) {
               return false;
            } else if (this.hasSecondOpenTime() != other.hasSecondOpenTime()) {
               return false;
            } else if (this.hasSecondOpenTime() && this.getSecondOpenTime() != other.getSecondOpenTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasModelGroup() != other.hasModelGroup()) {
               return false;
            } else if (this.hasModelGroup() && this.getModelGroup() != other.getModelGroup()) {
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
            if (this.hasCreateType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCreateType();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSubState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSubState();
            }

            if (this.hasFirstOpenTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFirstOpenTime();
            }

            if (this.hasSecondOpenTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSecondOpenTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasModelGroup()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getModelGroup();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_19408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_19408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_19408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_19408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_19408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_19408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_19408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_19408 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_19408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_19408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_19408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_19408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_19408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_19408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_19408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_19408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_19408> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_19408> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_19408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_19408OrBuilder {
         private int bitField0_;
         private int createType_;
         private int stage_;
         private int subState_;
         private int firstOpenTime_;
         private int secondOpenTime_;
         private int endTime_;
         private int modelGroup_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_19408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_ActivityInfo_19408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.createType_ = 0;
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.bitField0_ &= -3;
            this.subState_ = 0;
            this.bitField0_ &= -5;
            this.firstOpenTime_ = 0;
            this.bitField0_ &= -9;
            this.secondOpenTime_ = 0;
            this.bitField0_ &= -17;
            this.endTime_ = 0;
            this.bitField0_ &= -33;
            this.modelGroup_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_ActivityInfo_19408_descriptor;
         }

         public S2C_ActivityInfo_19408 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_ActivityInfo_19408.getDefaultInstance();
         }

         public S2C_ActivityInfo_19408 build() {
            S2C_ActivityInfo_19408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_19408 buildPartial() {
            S2C_ActivityInfo_19408 result = new S2C_ActivityInfo_19408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.createType_ = this.createType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.subState_ = this.subState_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.firstOpenTime_ = this.firstOpenTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.secondOpenTime_ = this.secondOpenTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.modelGroup_ = this.modelGroup_;
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
            if (other instanceof S2C_ActivityInfo_19408) {
               return this.mergeFrom((S2C_ActivityInfo_19408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_19408 other) {
            if (other == MergeWarBossMsg.S2C_ActivityInfo_19408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCreateType()) {
                  this.setCreateType(other.getCreateType());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSubState()) {
                  this.setSubState(other.getSubState());
               }

               if (other.hasFirstOpenTime()) {
                  this.setFirstOpenTime(other.getFirstOpenTime());
               }

               if (other.hasSecondOpenTime()) {
                  this.setSecondOpenTime(other.getSecondOpenTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasModelGroup()) {
                  this.setModelGroup(other.getModelGroup());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCreateType()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else if (!this.hasSubState()) {
               return false;
            } else if (!this.hasFirstOpenTime()) {
               return false;
            } else if (!this.hasSecondOpenTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasModelGroup();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_19408 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_19408)MergeWarBossMsg.S2C_ActivityInfo_19408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_19408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCreateType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCreateType() {
            return this.createType_;
         }

         public Builder setCreateType(int value) {
            this.bitField0_ |= 1;
            this.createType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateType() {
            this.bitField0_ &= -2;
            this.createType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 2;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSubState() {
            return this.subState_;
         }

         public Builder setSubState(int value) {
            this.bitField0_ |= 4;
            this.subState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubState() {
            this.bitField0_ &= -5;
            this.subState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstOpenTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFirstOpenTime() {
            return this.firstOpenTime_;
         }

         public Builder setFirstOpenTime(int value) {
            this.bitField0_ |= 8;
            this.firstOpenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstOpenTime() {
            this.bitField0_ &= -9;
            this.firstOpenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSecondOpenTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSecondOpenTime() {
            return this.secondOpenTime_;
         }

         public Builder setSecondOpenTime(int value) {
            this.bitField0_ |= 16;
            this.secondOpenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSecondOpenTime() {
            this.bitField0_ &= -17;
            this.secondOpenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 32;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -33;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasModelGroup() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getModelGroup() {
            return this.modelGroup_;
         }

         public Builder setModelGroup(int value) {
            this.bitField0_ |= 64;
            this.modelGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelGroup() {
            this.bitField0_ &= -65;
            this.modelGroup_ = 0;
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

   public static final class S2C_UpdateState_19410 extends GeneratedMessageV3 implements S2C_UpdateState_19410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      public static final int SUBSTATE_FIELD_NUMBER = 2;
      private int subState_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateState_19410 DEFAULT_INSTANCE = new S2C_UpdateState_19410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateState_19410> PARSER = new AbstractParser<S2C_UpdateState_19410>() {
         public S2C_UpdateState_19410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateState_19410(input, extensionRegistry);
         }
      };

      private S2C_UpdateState_19410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateState_19410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateState_19410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateState_19410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.subState_ = input.readInt32();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateState_19410.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSubState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSubState() {
         return this.subState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSubState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.subState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.subState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateState_19410)) {
            return super.equals(obj);
         } else {
            S2C_UpdateState_19410 other = (S2C_UpdateState_19410)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSubState() != other.hasSubState()) {
               return false;
            } else if (this.hasSubState() && this.getSubState() != other.getSubState()) {
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
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSubState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSubState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateState_19410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data);
      }

      public static S2C_UpdateState_19410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateState_19410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data);
      }

      public static S2C_UpdateState_19410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateState_19410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data);
      }

      public static S2C_UpdateState_19410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateState_19410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateState_19410 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateState_19410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateState_19410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateState_19410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateState_19410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateState_19410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateState_19410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateState_19410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateState_19410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateState_19410> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateState_19410> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateState_19410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateState_19410OrBuilder {
         private int bitField0_;
         private int stage_;
         private int subState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateState_19410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_UpdateState_19410.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            this.subState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateState_19410_descriptor;
         }

         public S2C_UpdateState_19410 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_UpdateState_19410.getDefaultInstance();
         }

         public S2C_UpdateState_19410 build() {
            S2C_UpdateState_19410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateState_19410 buildPartial() {
            S2C_UpdateState_19410 result = new S2C_UpdateState_19410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.subState_ = this.subState_;
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
            if (other instanceof S2C_UpdateState_19410) {
               return this.mergeFrom((S2C_UpdateState_19410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateState_19410 other) {
            if (other == MergeWarBossMsg.S2C_UpdateState_19410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSubState()) {
                  this.setSubState(other.getSubState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else {
               return this.hasSubState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateState_19410 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateState_19410)MergeWarBossMsg.S2C_UpdateState_19410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateState_19410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSubState() {
            return this.subState_;
         }

         public Builder setSubState(int value) {
            this.bitField0_ |= 2;
            this.subState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubState() {
            this.bitField0_ &= -3;
            this.subState_ = 0;
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

   public static final class S2C_HurtRank_19412 extends GeneratedMessageV3 implements S2C_HurtRank_19412OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKS_FIELD_NUMBER = 3;
      private List<RankMsg.RankUnionData> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_HurtRank_19412 DEFAULT_INSTANCE = new S2C_HurtRank_19412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HurtRank_19412> PARSER = new AbstractParser<S2C_HurtRank_19412>() {
         public S2C_HurtRank_19412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HurtRank_19412(input, extensionRegistry);
         }
      };

      private S2C_HurtRank_19412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HurtRank_19412() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HurtRank_19412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HurtRank_19412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankUnionData.PARSER, extensionRegistry));
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HurtRank_19412.class, Builder.class);
      }

      public List<RankMsg.RankUnionData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankMsg.RankUnionDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankMsg.RankUnionData getRanks(int index) {
         return (RankMsg.RankUnionData)this.ranks_.get(index);
      }

      public RankMsg.RankUnionDataOrBuilder getRanksOrBuilder(int index) {
         return (RankMsg.RankUnionDataOrBuilder)this.ranks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.ranks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HurtRank_19412)) {
            return super.equals(obj);
         } else {
            S2C_HurtRank_19412 other = (S2C_HurtRank_19412)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HurtRank_19412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data);
      }

      public static S2C_HurtRank_19412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HurtRank_19412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data);
      }

      public static S2C_HurtRank_19412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HurtRank_19412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data);
      }

      public static S2C_HurtRank_19412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HurtRank_19412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HurtRank_19412 parseFrom(InputStream input) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HurtRank_19412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HurtRank_19412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HurtRank_19412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HurtRank_19412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HurtRank_19412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HurtRank_19412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HurtRank_19412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HurtRank_19412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HurtRank_19412> parser() {
         return PARSER;
      }

      public Parser<S2C_HurtRank_19412> getParserForType() {
         return PARSER;
      }

      public S2C_HurtRank_19412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HurtRank_19412OrBuilder {
         private int bitField0_;
         private List<RankMsg.RankUnionData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankUnionData, RankMsg.RankUnionData.Builder, RankMsg.RankUnionDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HurtRank_19412.class, Builder.class);
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
            if (MergeWarBossMsg.S2C_HurtRank_19412.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_HurtRank_19412_descriptor;
         }

         public S2C_HurtRank_19412 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_HurtRank_19412.getDefaultInstance();
         }

         public S2C_HurtRank_19412 build() {
            S2C_HurtRank_19412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HurtRank_19412 buildPartial() {
            S2C_HurtRank_19412 result = new S2C_HurtRank_19412(this);
            int from_bitField0_ = this.bitField0_;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
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
            if (other instanceof S2C_HurtRank_19412) {
               return this.mergeFrom((S2C_HurtRank_19412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HurtRank_19412 other) {
            if (other == MergeWarBossMsg.S2C_HurtRank_19412.getDefaultInstance()) {
               return this;
            } else {
               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.ranksBuilder_ = MergeWarBossMsg.S2C_HurtRank_19412.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
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
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HurtRank_19412 parsedMessage = null;

            try {
               parsedMessage = (S2C_HurtRank_19412)MergeWarBossMsg.S2C_HurtRank_19412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HurtRank_19412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 1;
            }

         }

         public List<RankMsg.RankUnionData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankMsg.RankUnionData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankUnionData)this.ranks_.get(index) : (RankMsg.RankUnionData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankMsg.RankUnionData value) {
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

         public Builder setRanks(int index, RankMsg.RankUnionData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankMsg.RankUnionData value) {
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

         public Builder addRanks(int index, RankMsg.RankUnionData value) {
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

         public Builder addRanks(RankMsg.RankUnionData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankMsg.RankUnionData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankMsg.RankUnionData> values) {
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
               this.bitField0_ &= -2;
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

         public RankMsg.RankUnionData.Builder getRanksBuilder(int index) {
            return (RankMsg.RankUnionData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankUnionDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankUnionDataOrBuilder)this.ranks_.get(index) : (RankMsg.RankUnionDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankUnionDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankMsg.RankUnionData.Builder addRanksBuilder() {
            return (RankMsg.RankUnionData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankUnionData.getDefaultInstance());
         }

         public RankMsg.RankUnionData.Builder addRanksBuilder(int index) {
            return (RankMsg.RankUnionData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankUnionData.getDefaultInstance());
         }

         public List<RankMsg.RankUnionData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankUnionData, RankMsg.RankUnionData.Builder, RankMsg.RankUnionDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_Enter_19413 extends GeneratedMessageV3 implements C2S_Enter_19413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEAVE_FIELD_NUMBER = 1;
      private boolean leave_;
      private byte memoizedIsInitialized;
      private static final C2S_Enter_19413 DEFAULT_INSTANCE = new C2S_Enter_19413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Enter_19413> PARSER = new AbstractParser<C2S_Enter_19413>() {
         public C2S_Enter_19413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Enter_19413(input, extensionRegistry);
         }
      };

      private C2S_Enter_19413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Enter_19413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Enter_19413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Enter_19413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.leave_ = input.readBool();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Enter_19413.class, Builder.class);
      }

      public boolean hasLeave() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getLeave() {
         return this.leave_;
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
            output.writeBool(1, this.leave_);
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
               size += CodedOutputStream.computeBoolSize(1, this.leave_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Enter_19413)) {
            return super.equals(obj);
         } else {
            C2S_Enter_19413 other = (C2S_Enter_19413)obj;
            if (this.hasLeave() != other.hasLeave()) {
               return false;
            } else if (this.hasLeave() && this.getLeave() != other.getLeave()) {
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
            if (this.hasLeave()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getLeave());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Enter_19413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data);
      }

      public static C2S_Enter_19413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Enter_19413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data);
      }

      public static C2S_Enter_19413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Enter_19413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data);
      }

      public static C2S_Enter_19413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Enter_19413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Enter_19413 parseFrom(InputStream input) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Enter_19413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Enter_19413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Enter_19413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Enter_19413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Enter_19413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Enter_19413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Enter_19413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Enter_19413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Enter_19413> parser() {
         return PARSER;
      }

      public Parser<C2S_Enter_19413> getParserForType() {
         return PARSER;
      }

      public C2S_Enter_19413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Enter_19413OrBuilder {
         private int bitField0_;
         private boolean leave_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Enter_19413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_Enter_19413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.leave_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_Enter_19413_descriptor;
         }

         public C2S_Enter_19413 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_Enter_19413.getDefaultInstance();
         }

         public C2S_Enter_19413 build() {
            C2S_Enter_19413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Enter_19413 buildPartial() {
            C2S_Enter_19413 result = new C2S_Enter_19413(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.leave_ = this.leave_;
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
            if (other instanceof C2S_Enter_19413) {
               return this.mergeFrom((C2S_Enter_19413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Enter_19413 other) {
            if (other == MergeWarBossMsg.C2S_Enter_19413.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeave()) {
                  this.setLeave(other.getLeave());
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
            C2S_Enter_19413 parsedMessage = null;

            try {
               parsedMessage = (C2S_Enter_19413)MergeWarBossMsg.C2S_Enter_19413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Enter_19413)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeave() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getLeave() {
            return this.leave_;
         }

         public Builder setLeave(boolean value) {
            this.bitField0_ |= 1;
            this.leave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeave() {
            this.bitField0_ &= -2;
            this.leave_ = false;
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

   public static final class C2S_TaskList_19415 extends GeneratedMessageV3 implements C2S_TaskList_19415OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TaskList_19415 DEFAULT_INSTANCE = new C2S_TaskList_19415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskList_19415> PARSER = new AbstractParser<C2S_TaskList_19415>() {
         public C2S_TaskList_19415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskList_19415(input, extensionRegistry);
         }
      };

      private C2S_TaskList_19415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskList_19415() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskList_19415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskList_19415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_19415.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskList_19415)) {
            return super.equals(obj);
         } else {
            C2S_TaskList_19415 other = (C2S_TaskList_19415)obj;
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

      public static C2S_TaskList_19415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_19415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_19415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_19415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_19415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_19415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_19415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_19415 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_19415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_19415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskList_19415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_19415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_19415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_19415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskList_19415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskList_19415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskList_19415> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskList_19415> getParserForType() {
         return PARSER;
      }

      public C2S_TaskList_19415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskList_19415OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_19415.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_TaskList_19415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_TaskList_19415_descriptor;
         }

         public C2S_TaskList_19415 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_TaskList_19415.getDefaultInstance();
         }

         public C2S_TaskList_19415 build() {
            C2S_TaskList_19415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskList_19415 buildPartial() {
            C2S_TaskList_19415 result = new C2S_TaskList_19415(this);
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
            if (other instanceof C2S_TaskList_19415) {
               return this.mergeFrom((C2S_TaskList_19415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskList_19415 other) {
            if (other == MergeWarBossMsg.C2S_TaskList_19415.getDefaultInstance()) {
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
            C2S_TaskList_19415 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskList_19415)MergeWarBossMsg.C2S_TaskList_19415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskList_19415)e.getUnfinishedMessage();
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

   public static final class S2C_TaskList_19416 extends GeneratedMessageV3 implements S2C_TaskList_19416OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskList_19416 DEFAULT_INSTANCE = new S2C_TaskList_19416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskList_19416> PARSER = new AbstractParser<S2C_TaskList_19416>() {
         public S2C_TaskList_19416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskList_19416(input, extensionRegistry);
         }
      };

      private S2C_TaskList_19416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskList_19416() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskList_19416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskList_19416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_19416.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
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
         } else if (!(obj instanceof S2C_TaskList_19416)) {
            return super.equals(obj);
         } else {
            S2C_TaskList_19416 other = (S2C_TaskList_19416)obj;
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

      public static S2C_TaskList_19416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_19416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_19416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_19416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_19416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_19416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_19416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_19416 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_19416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_19416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskList_19416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_19416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_19416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_19416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskList_19416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskList_19416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskList_19416> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskList_19416> getParserForType() {
         return PARSER;
      }

      public S2C_TaskList_19416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskList_19416OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_19416.class, Builder.class);
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
            if (MergeWarBossMsg.S2C_TaskList_19416.alwaysUseFieldBuilders) {
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
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_TaskList_19416_descriptor;
         }

         public S2C_TaskList_19416 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_TaskList_19416.getDefaultInstance();
         }

         public S2C_TaskList_19416 build() {
            S2C_TaskList_19416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskList_19416 buildPartial() {
            S2C_TaskList_19416 result = new S2C_TaskList_19416(this);
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
            if (other instanceof S2C_TaskList_19416) {
               return this.mergeFrom((S2C_TaskList_19416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskList_19416 other) {
            if (other == MergeWarBossMsg.S2C_TaskList_19416.getDefaultInstance()) {
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
                     this.taskListBuilder_ = MergeWarBossMsg.S2C_TaskList_19416.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_TaskList_19416 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskList_19416)MergeWarBossMsg.S2C_TaskList_19416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskList_19416)e.getUnfinishedMessage();
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

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
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

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
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

         public Builder addTaskList(int index, CommonMsg.Task value) {
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

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
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

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
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

   public static final class C2S_CommitTask_19417 extends GeneratedMessageV3 implements C2S_CommitTask_19417OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_19417 DEFAULT_INSTANCE = new C2S_CommitTask_19417();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_19417> PARSER = new AbstractParser<C2S_CommitTask_19417>() {
         public C2S_CommitTask_19417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_19417(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_19417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_19417() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_19417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_19417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_19417.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_19417)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_19417 other = (C2S_CommitTask_19417)obj;
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

      public static C2S_CommitTask_19417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_19417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_19417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_19417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_19417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_19417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_19417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_19417 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_19417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_19417 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_19417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_19417 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_19417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_19417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_19417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_19417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_19417> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_19417> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_19417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_19417OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_19417.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_CommitTask_19417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_CommitTask_19417_descriptor;
         }

         public C2S_CommitTask_19417 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_CommitTask_19417.getDefaultInstance();
         }

         public C2S_CommitTask_19417 build() {
            C2S_CommitTask_19417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_19417 buildPartial() {
            C2S_CommitTask_19417 result = new C2S_CommitTask_19417(this);
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
            if (other instanceof C2S_CommitTask_19417) {
               return this.mergeFrom((C2S_CommitTask_19417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_19417 other) {
            if (other == MergeWarBossMsg.C2S_CommitTask_19417.getDefaultInstance()) {
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
            C2S_CommitTask_19417 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_19417)MergeWarBossMsg.C2S_CommitTask_19417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_19417)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_19418 extends GeneratedMessageV3 implements S2C_CommitTask_19418OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_19418 DEFAULT_INSTANCE = new S2C_CommitTask_19418();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_19418> PARSER = new AbstractParser<S2C_CommitTask_19418>() {
         public S2C_CommitTask_19418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_19418(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_19418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_19418() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_19418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_19418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_19418.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_19418)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_19418 other = (S2C_CommitTask_19418)obj;
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

      public static S2C_CommitTask_19418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_19418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_19418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_19418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_19418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_19418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_19418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_19418 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_19418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_19418 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_19418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_19418 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_19418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_19418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_19418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_19418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_19418> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_19418> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_19418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_19418OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_19418.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_CommitTask_19418.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CommitTask_19418_descriptor;
         }

         public S2C_CommitTask_19418 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_CommitTask_19418.getDefaultInstance();
         }

         public S2C_CommitTask_19418 build() {
            S2C_CommitTask_19418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_19418 buildPartial() {
            S2C_CommitTask_19418 result = new S2C_CommitTask_19418(this);
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
            if (other instanceof S2C_CommitTask_19418) {
               return this.mergeFrom((S2C_CommitTask_19418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_19418 other) {
            if (other == MergeWarBossMsg.S2C_CommitTask_19418.getDefaultInstance()) {
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
            S2C_CommitTask_19418 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_19418)MergeWarBossMsg.S2C_CommitTask_19418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_19418)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateTask_19420 extends GeneratedMessageV3 implements S2C_UpdateTask_19420OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTask_19420 DEFAULT_INSTANCE = new S2C_UpdateTask_19420();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTask_19420> PARSER = new AbstractParser<S2C_UpdateTask_19420>() {
         public S2C_UpdateTask_19420 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTask_19420(input, extensionRegistry);
         }
      };

      private S2C_UpdateTask_19420(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTask_19420() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTask_19420();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTask_19420(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_19420.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
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
         } else if (!(obj instanceof S2C_UpdateTask_19420)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTask_19420 other = (S2C_UpdateTask_19420)obj;
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

      public static S2C_UpdateTask_19420 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_19420 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_19420 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_19420 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_19420 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_19420 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_19420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_19420 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_19420 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_19420 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_19420 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_19420 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_19420 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_19420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTask_19420 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTask_19420 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTask_19420> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTask_19420> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTask_19420 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTask_19420OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_19420.class, Builder.class);
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
            if (MergeWarBossMsg.S2C_UpdateTask_19420.alwaysUseFieldBuilders) {
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
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_UpdateTask_19420_descriptor;
         }

         public S2C_UpdateTask_19420 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_UpdateTask_19420.getDefaultInstance();
         }

         public S2C_UpdateTask_19420 build() {
            S2C_UpdateTask_19420 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTask_19420 buildPartial() {
            S2C_UpdateTask_19420 result = new S2C_UpdateTask_19420(this);
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
            if (other instanceof S2C_UpdateTask_19420) {
               return this.mergeFrom((S2C_UpdateTask_19420)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTask_19420 other) {
            if (other == MergeWarBossMsg.S2C_UpdateTask_19420.getDefaultInstance()) {
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
                     this.taskListBuilder_ = MergeWarBossMsg.S2C_UpdateTask_19420.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_UpdateTask_19420 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTask_19420)MergeWarBossMsg.S2C_UpdateTask_19420.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTask_19420)e.getUnfinishedMessage();
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

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
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

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
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

         public Builder addTaskList(int index, CommonMsg.Task value) {
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

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
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

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
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

   public static final class S2C_CloseEntrance_19422 extends GeneratedMessageV3 implements S2C_CloseEntrance_19422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      public static final int SUBSTATE_FIELD_NUMBER = 2;
      private int subState_;
      private byte memoizedIsInitialized;
      private static final S2C_CloseEntrance_19422 DEFAULT_INSTANCE = new S2C_CloseEntrance_19422();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CloseEntrance_19422> PARSER = new AbstractParser<S2C_CloseEntrance_19422>() {
         public S2C_CloseEntrance_19422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CloseEntrance_19422(input, extensionRegistry);
         }
      };

      private S2C_CloseEntrance_19422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CloseEntrance_19422() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CloseEntrance_19422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CloseEntrance_19422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.subState_ = input.readInt32();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CloseEntrance_19422.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSubState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSubState() {
         return this.subState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSubState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.subState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.subState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CloseEntrance_19422)) {
            return super.equals(obj);
         } else {
            S2C_CloseEntrance_19422 other = (S2C_CloseEntrance_19422)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSubState() != other.hasSubState()) {
               return false;
            } else if (this.hasSubState() && this.getSubState() != other.getSubState()) {
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
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSubState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSubState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CloseEntrance_19422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data);
      }

      public static S2C_CloseEntrance_19422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseEntrance_19422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data);
      }

      public static S2C_CloseEntrance_19422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseEntrance_19422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data);
      }

      public static S2C_CloseEntrance_19422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseEntrance_19422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseEntrance_19422 parseFrom(InputStream input) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CloseEntrance_19422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CloseEntrance_19422 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CloseEntrance_19422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CloseEntrance_19422 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CloseEntrance_19422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseEntrance_19422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CloseEntrance_19422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CloseEntrance_19422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CloseEntrance_19422> parser() {
         return PARSER;
      }

      public Parser<S2C_CloseEntrance_19422> getParserForType() {
         return PARSER;
      }

      public S2C_CloseEntrance_19422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CloseEntrance_19422OrBuilder {
         private int bitField0_;
         private int stage_;
         private int subState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CloseEntrance_19422.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_CloseEntrance_19422.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            this.subState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_CloseEntrance_19422_descriptor;
         }

         public S2C_CloseEntrance_19422 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_CloseEntrance_19422.getDefaultInstance();
         }

         public S2C_CloseEntrance_19422 build() {
            S2C_CloseEntrance_19422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CloseEntrance_19422 buildPartial() {
            S2C_CloseEntrance_19422 result = new S2C_CloseEntrance_19422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.subState_ = this.subState_;
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
            if (other instanceof S2C_CloseEntrance_19422) {
               return this.mergeFrom((S2C_CloseEntrance_19422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CloseEntrance_19422 other) {
            if (other == MergeWarBossMsg.S2C_CloseEntrance_19422.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSubState()) {
                  this.setSubState(other.getSubState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else {
               return this.hasSubState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CloseEntrance_19422 parsedMessage = null;

            try {
               parsedMessage = (S2C_CloseEntrance_19422)MergeWarBossMsg.S2C_CloseEntrance_19422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CloseEntrance_19422)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSubState() {
            return this.subState_;
         }

         public Builder setSubState(int value) {
            this.bitField0_ |= 2;
            this.subState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubState() {
            this.bitField0_ &= -3;
            this.subState_ = 0;
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

   public static final class C2S_EntranceInfo_19423 extends GeneratedMessageV3 implements C2S_EntranceInfo_19423OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EntranceInfo_19423 DEFAULT_INSTANCE = new C2S_EntranceInfo_19423();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EntranceInfo_19423> PARSER = new AbstractParser<C2S_EntranceInfo_19423>() {
         public C2S_EntranceInfo_19423 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EntranceInfo_19423(input, extensionRegistry);
         }
      };

      private C2S_EntranceInfo_19423(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EntranceInfo_19423() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EntranceInfo_19423();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EntranceInfo_19423(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EntranceInfo_19423.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EntranceInfo_19423)) {
            return super.equals(obj);
         } else {
            C2S_EntranceInfo_19423 other = (C2S_EntranceInfo_19423)obj;
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

      public static C2S_EntranceInfo_19423 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data);
      }

      public static C2S_EntranceInfo_19423 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EntranceInfo_19423 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data);
      }

      public static C2S_EntranceInfo_19423 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EntranceInfo_19423 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data);
      }

      public static C2S_EntranceInfo_19423 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EntranceInfo_19423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EntranceInfo_19423 parseFrom(InputStream input) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EntranceInfo_19423 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EntranceInfo_19423 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EntranceInfo_19423 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EntranceInfo_19423 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EntranceInfo_19423 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EntranceInfo_19423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EntranceInfo_19423 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EntranceInfo_19423 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EntranceInfo_19423> parser() {
         return PARSER;
      }

      public Parser<C2S_EntranceInfo_19423> getParserForType() {
         return PARSER;
      }

      public C2S_EntranceInfo_19423 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EntranceInfo_19423OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EntranceInfo_19423.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_EntranceInfo_19423.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_EntranceInfo_19423_descriptor;
         }

         public C2S_EntranceInfo_19423 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_EntranceInfo_19423.getDefaultInstance();
         }

         public C2S_EntranceInfo_19423 build() {
            C2S_EntranceInfo_19423 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EntranceInfo_19423 buildPartial() {
            C2S_EntranceInfo_19423 result = new C2S_EntranceInfo_19423(this);
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
            if (other instanceof C2S_EntranceInfo_19423) {
               return this.mergeFrom((C2S_EntranceInfo_19423)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EntranceInfo_19423 other) {
            if (other == MergeWarBossMsg.C2S_EntranceInfo_19423.getDefaultInstance()) {
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
            C2S_EntranceInfo_19423 parsedMessage = null;

            try {
               parsedMessage = (C2S_EntranceInfo_19423)MergeWarBossMsg.C2S_EntranceInfo_19423.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EntranceInfo_19423)e.getUnfinishedMessage();
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

   public static final class S2C_EntranceInfo_19424 extends GeneratedMessageV3 implements S2C_EntranceInfo_19424OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENENTRANCE_FIELD_NUMBER = 1;
      private boolean openEntrance_;
      private byte memoizedIsInitialized;
      private static final S2C_EntranceInfo_19424 DEFAULT_INSTANCE = new S2C_EntranceInfo_19424();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EntranceInfo_19424> PARSER = new AbstractParser<S2C_EntranceInfo_19424>() {
         public S2C_EntranceInfo_19424 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EntranceInfo_19424(input, extensionRegistry);
         }
      };

      private S2C_EntranceInfo_19424(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EntranceInfo_19424() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EntranceInfo_19424();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EntranceInfo_19424(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openEntrance_ = input.readBool();
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EntranceInfo_19424.class, Builder.class);
      }

      public boolean hasOpenEntrance() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getOpenEntrance() {
         return this.openEntrance_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenEntrance()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.openEntrance_);
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
               size += CodedOutputStream.computeBoolSize(1, this.openEntrance_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EntranceInfo_19424)) {
            return super.equals(obj);
         } else {
            S2C_EntranceInfo_19424 other = (S2C_EntranceInfo_19424)obj;
            if (this.hasOpenEntrance() != other.hasOpenEntrance()) {
               return false;
            } else if (this.hasOpenEntrance() && this.getOpenEntrance() != other.getOpenEntrance()) {
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
            if (this.hasOpenEntrance()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getOpenEntrance());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EntranceInfo_19424 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data);
      }

      public static S2C_EntranceInfo_19424 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EntranceInfo_19424 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data);
      }

      public static S2C_EntranceInfo_19424 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EntranceInfo_19424 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data);
      }

      public static S2C_EntranceInfo_19424 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EntranceInfo_19424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EntranceInfo_19424 parseFrom(InputStream input) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EntranceInfo_19424 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EntranceInfo_19424 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EntranceInfo_19424 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EntranceInfo_19424 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EntranceInfo_19424 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EntranceInfo_19424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EntranceInfo_19424 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EntranceInfo_19424 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EntranceInfo_19424> parser() {
         return PARSER;
      }

      public Parser<S2C_EntranceInfo_19424> getParserForType() {
         return PARSER;
      }

      public S2C_EntranceInfo_19424 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EntranceInfo_19424OrBuilder {
         private int bitField0_;
         private boolean openEntrance_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EntranceInfo_19424.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.S2C_EntranceInfo_19424.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openEntrance_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_S2C_EntranceInfo_19424_descriptor;
         }

         public S2C_EntranceInfo_19424 getDefaultInstanceForType() {
            return MergeWarBossMsg.S2C_EntranceInfo_19424.getDefaultInstance();
         }

         public S2C_EntranceInfo_19424 build() {
            S2C_EntranceInfo_19424 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EntranceInfo_19424 buildPartial() {
            S2C_EntranceInfo_19424 result = new S2C_EntranceInfo_19424(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openEntrance_ = this.openEntrance_;
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
            if (other instanceof S2C_EntranceInfo_19424) {
               return this.mergeFrom((S2C_EntranceInfo_19424)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EntranceInfo_19424 other) {
            if (other == MergeWarBossMsg.S2C_EntranceInfo_19424.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenEntrance()) {
                  this.setOpenEntrance(other.getOpenEntrance());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOpenEntrance();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EntranceInfo_19424 parsedMessage = null;

            try {
               parsedMessage = (S2C_EntranceInfo_19424)MergeWarBossMsg.S2C_EntranceInfo_19424.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EntranceInfo_19424)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenEntrance() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getOpenEntrance() {
            return this.openEntrance_;
         }

         public Builder setOpenEntrance(boolean value) {
            this.bitField0_ |= 1;
            this.openEntrance_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenEntrance() {
            this.bitField0_ &= -2;
            this.openEntrance_ = false;
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

   public static final class C2S_QuickFight_19425 extends GeneratedMessageV3 implements C2S_QuickFight_19425OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_QuickFight_19425 DEFAULT_INSTANCE = new C2S_QuickFight_19425();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_QuickFight_19425> PARSER = new AbstractParser<C2S_QuickFight_19425>() {
         public C2S_QuickFight_19425 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_QuickFight_19425(input, extensionRegistry);
         }
      };

      private C2S_QuickFight_19425(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_QuickFight_19425() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_QuickFight_19425();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_QuickFight_19425(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QuickFight_19425.class, Builder.class);
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
         } else if (!(obj instanceof C2S_QuickFight_19425)) {
            return super.equals(obj);
         } else {
            C2S_QuickFight_19425 other = (C2S_QuickFight_19425)obj;
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

      public static C2S_QuickFight_19425 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data);
      }

      public static C2S_QuickFight_19425 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickFight_19425 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data);
      }

      public static C2S_QuickFight_19425 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickFight_19425 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data);
      }

      public static C2S_QuickFight_19425 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickFight_19425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickFight_19425 parseFrom(InputStream input) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QuickFight_19425 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QuickFight_19425 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_QuickFight_19425 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QuickFight_19425 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QuickFight_19425 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickFight_19425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_QuickFight_19425 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_QuickFight_19425 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_QuickFight_19425> parser() {
         return PARSER;
      }

      public Parser<C2S_QuickFight_19425> getParserForType() {
         return PARSER;
      }

      public C2S_QuickFight_19425 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_QuickFight_19425OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QuickFight_19425.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeWarBossMsg.C2S_QuickFight_19425.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeWarBossMsg.internal_static_mergeWarBoss_com_gzbz_protobuf_C2S_QuickFight_19425_descriptor;
         }

         public C2S_QuickFight_19425 getDefaultInstanceForType() {
            return MergeWarBossMsg.C2S_QuickFight_19425.getDefaultInstance();
         }

         public C2S_QuickFight_19425 build() {
            C2S_QuickFight_19425 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_QuickFight_19425 buildPartial() {
            C2S_QuickFight_19425 result = new C2S_QuickFight_19425(this);
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
            if (other instanceof C2S_QuickFight_19425) {
               return this.mergeFrom((C2S_QuickFight_19425)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_QuickFight_19425 other) {
            if (other == MergeWarBossMsg.C2S_QuickFight_19425.getDefaultInstance()) {
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
            C2S_QuickFight_19425 parsedMessage = null;

            try {
               parsedMessage = (C2S_QuickFight_19425)MergeWarBossMsg.C2S_QuickFight_19425.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_QuickFight_19425)e.getUnfinishedMessage();
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

   public interface C2S_BossInfo_19401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BuyFightNum_19403OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_19417OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_Enter_19413OrBuilder extends MessageOrBuilder {
      boolean hasLeave();

      boolean getLeave();
   }

   public interface C2S_EntranceInfo_19423OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_QuickFight_19425OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TaskList_19415OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ActivityInfo_19408OrBuilder extends MessageOrBuilder {
      boolean hasCreateType();

      int getCreateType();

      boolean hasStage();

      int getStage();

      boolean hasSubState();

      int getSubState();

      boolean hasFirstOpenTime();

      int getFirstOpenTime();

      boolean hasSecondOpenTime();

      int getSecondOpenTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasModelGroup();

      int getModelGroup();
   }

   public interface S2C_BossInfo_19402OrBuilder extends MessageOrBuilder {
      boolean hasFigth();

      int getFigth();

      boolean hasBuy();

      int getBuy();

      boolean hasTotalFight();

      int getTotalFight();
   }

   public interface S2C_BuyFightNum_19404OrBuilder extends MessageOrBuilder {
      boolean hasBuy();

      int getBuy();
   }

   public interface S2C_CloseEntrance_19422OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();

      boolean hasSubState();

      int getSubState();
   }

   public interface S2C_CommitTask_19418OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_EntranceInfo_19424OrBuilder extends MessageOrBuilder {
      boolean hasOpenEntrance();

      boolean getOpenEntrance();
   }

   public interface S2C_HurtRank_19412OrBuilder extends MessageOrBuilder {
      List<RankMsg.RankUnionData> getRanksList();

      RankMsg.RankUnionData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankUnionDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankUnionDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_TaskList_19416OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_UpdateState_19410OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();

      boolean hasSubState();

      int getSubState();
   }

   public interface S2C_UpdateTask_19420OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);
   }
}
