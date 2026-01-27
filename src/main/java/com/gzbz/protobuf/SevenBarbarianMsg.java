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

public final class SevenBarbarianMsg {
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SevenBarbarianMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014SevenBarbarian.proto\u0012 SevenBarbarian.com.gzbz.protobuf\u001a\fcommon.proto\"\u0018\n\u0016C2S_BarbarianInfo_4601\"\\\n\u0016S2C_BarbarianInfo_4602\u0012\u0013\n\u000bbattleTimes\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007maxHurt\u0018\u0004 \u0002(\u0003\"!\n\u0013C2S_FamousInfo_4603\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"c\n\u0013S2C_FamousInfo_4604\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012@\n\nfamousInfo\u0018\u0002 \u0003(\u000b2,.SevenBarbarian.com.gzbz.protobuf.FamousInfo\"M\n\nFamousInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012 \n\u0004data\u0018\u0002 \u0001(\u000b2\u0012.common.PlayerInfo\u0012\u000f\n\u0007maxHurt\u0018\u0003 \u0001(\u0003\"\u001f\n\u0011C2S_RankInfo_4605\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0099\u0001\n\u0011S2C_RankInfo_4606\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012:\n\u0006myInfo\u0018\u0002 \u0001(\u000b2*.SevenBarbarian.com.gzbz.protobuf.RankInfo\u0012<\n\brankInfo\u0018\u0003 \u0003(\u000b2*.SevenBarbarian.com.gzbz.protobuf.RankInfo\"\u0095\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0002(\t\u0012\u000e\n\u0006headId\u0018\u0005 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007maxHurt\u0018\u0007 \u0001(\u0003\u0012\u000f\n\u0007hurtSum\u0018\b \u0001(\u0003\"\u0018\n\u0016C2S_BarbarianInfo_4607\"?\n\u0016S2C_BarbarianInfo_4608\u0012\u0013\n\u000bbattleTimes\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0002 \u0002(\u0005\"\u0088\u0003\n\u0013S2S_BattleInfo_4609\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0004 \u0001(\u0005\u0012\n\n\u0002lv\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006headId\u0018\u0007 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\b \u0001(\u0005\u0012\u0010\n\bprestige\u0018\t \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\n \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u000b \u0001(\u0005\u0012\u0011\n\tunionName\u0018\f \u0001(\t\u0012\u000e\n\u0006vipLev\u0018\u000e \u0001(\u0005\u0012\u0010\n\barraying\u0018\u000f \u0001(\f\u0012\f\n\u0004hurt\u0018\u0010 \u0001(\u0003\u0012\f\n\u0004city\u0018\u0011 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0012 \u0001(\t\u0012\u000e\n\u0006stepId\u0018\u0013 \u0001(\u0005\u0012\n\n\u0002id\u0018\u0014 \u0001(\u0005\u0012\u001e\n\u0004item\u0018\u0015 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0013\n\u000bsecondTitle\u0018\u0016 \u0001(\u0005\"4\n\u0011S2S_SendMail_4610\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tcountHurt\u0018\u0002 \u0002(\u0003\"f\n\u0015S2C_BattleResult_4611\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004hurt\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tcountHurt\u0018\u0003 \u0002(\u0003\u0012\u001e\n\u0004item\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfoB(\n\u0011com.gzbz.protobufB\u0011SevenBarbarianMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor, new String[0]);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor, new String[]{"BattleTimes", "BuyTimes", "Id", "MaxHurt"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor, new String[]{"Id"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor, new String[]{"Id", "FamousInfo"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor, new String[]{"Rank", "Data", "MaxHurt"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor, new String[]{"Id"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor, new String[]{"Id", "MyInfo", "RankInfo"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "ServerId", "PlayerId", "PlayerName", "HeadId", "HeadFrame", "MaxHurt", "HurtSum"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor, new String[0]);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor, new String[]{"BattleTimes", "BuyTimes"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "Sex", "Lv", "CombatPower", "HeadId", "HeadFrame", "Prestige", "MonarchId", "UnionId", "UnionName", "VipLev", "Arraying", "Hurt", "City", "Province", "StepId", "Id", "Item", "SecondTitle"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor, new String[]{"Rank", "CountHurt"});
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor, new String[]{"Rank", "Hurt", "CountHurt", "Item"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_BarbarianInfo_4601 extends GeneratedMessageV3 implements C2S_BarbarianInfo_4601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianInfo_4601 DEFAULT_INSTANCE = new C2S_BarbarianInfo_4601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianInfo_4601> PARSER = new AbstractParser<C2S_BarbarianInfo_4601>() {
         public C2S_BarbarianInfo_4601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianInfo_4601(input, extensionRegistry);
         }
      };

      private C2S_BarbarianInfo_4601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianInfo_4601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianInfo_4601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianInfo_4601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_4601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianInfo_4601)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianInfo_4601 other = (C2S_BarbarianInfo_4601)obj;
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

      public static C2S_BarbarianInfo_4601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianInfo_4601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianInfo_4601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianInfo_4601> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianInfo_4601> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianInfo_4601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianInfo_4601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_4601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.C2S_BarbarianInfo_4601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4601_descriptor;
         }

         public C2S_BarbarianInfo_4601 getDefaultInstanceForType() {
            return SevenBarbarianMsg.C2S_BarbarianInfo_4601.getDefaultInstance();
         }

         public C2S_BarbarianInfo_4601 build() {
            C2S_BarbarianInfo_4601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianInfo_4601 buildPartial() {
            C2S_BarbarianInfo_4601 result = new C2S_BarbarianInfo_4601(this);
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
            if (other instanceof C2S_BarbarianInfo_4601) {
               return this.mergeFrom((C2S_BarbarianInfo_4601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianInfo_4601 other) {
            if (other == SevenBarbarianMsg.C2S_BarbarianInfo_4601.getDefaultInstance()) {
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
            C2S_BarbarianInfo_4601 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianInfo_4601)SevenBarbarianMsg.C2S_BarbarianInfo_4601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianInfo_4601)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianInfo_4602 extends GeneratedMessageV3 implements S2C_BarbarianInfo_4602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLETIMES_FIELD_NUMBER = 1;
      private int battleTimes_;
      public static final int BUYTIMES_FIELD_NUMBER = 2;
      private int buyTimes_;
      public static final int ID_FIELD_NUMBER = 3;
      private int id_;
      public static final int MAXHURT_FIELD_NUMBER = 4;
      private long maxHurt_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianInfo_4602 DEFAULT_INSTANCE = new S2C_BarbarianInfo_4602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianInfo_4602> PARSER = new AbstractParser<S2C_BarbarianInfo_4602>() {
         public S2C_BarbarianInfo_4602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianInfo_4602(input, extensionRegistry);
         }
      };

      private S2C_BarbarianInfo_4602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianInfo_4602() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianInfo_4602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianInfo_4602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleTimes_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyTimes_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.id_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.maxHurt_ = input.readInt64();
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_4602.class, Builder.class);
      }

      public boolean hasBattleTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleTimes() {
         return this.battleTimes_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasMaxHurt() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getMaxHurt() {
         return this.maxHurt_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxHurt()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleTimes_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyTimes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.id_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.maxHurt_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleTimes_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyTimes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.id_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.maxHurt_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianInfo_4602)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianInfo_4602 other = (S2C_BarbarianInfo_4602)obj;
            if (this.hasBattleTimes() != other.hasBattleTimes()) {
               return false;
            } else if (this.hasBattleTimes() && this.getBattleTimes() != other.getBattleTimes()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasMaxHurt() != other.hasMaxHurt()) {
               return false;
            } else if (this.hasMaxHurt() && this.getMaxHurt() != other.getMaxHurt()) {
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
            if (this.hasBattleTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleTimes();
            }

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyTimes();
            }

            if (this.hasId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getId();
            }

            if (this.hasMaxHurt()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getMaxHurt());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianInfo_4602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianInfo_4602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianInfo_4602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianInfo_4602> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianInfo_4602> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianInfo_4602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianInfo_4602OrBuilder {
         private int bitField0_;
         private int battleTimes_;
         private int buyTimes_;
         private int id_;
         private long maxHurt_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_4602.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2C_BarbarianInfo_4602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battleTimes_ = 0;
            this.bitField0_ &= -2;
            this.buyTimes_ = 0;
            this.bitField0_ &= -3;
            this.id_ = 0;
            this.bitField0_ &= -5;
            this.maxHurt_ = 0L;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4602_descriptor;
         }

         public S2C_BarbarianInfo_4602 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2C_BarbarianInfo_4602.getDefaultInstance();
         }

         public S2C_BarbarianInfo_4602 build() {
            S2C_BarbarianInfo_4602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianInfo_4602 buildPartial() {
            S2C_BarbarianInfo_4602 result = new S2C_BarbarianInfo_4602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleTimes_ = this.battleTimes_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyTimes_ = this.buyTimes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.maxHurt_ = this.maxHurt_;
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
            if (other instanceof S2C_BarbarianInfo_4602) {
               return this.mergeFrom((S2C_BarbarianInfo_4602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianInfo_4602 other) {
            if (other == SevenBarbarianMsg.S2C_BarbarianInfo_4602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleTimes()) {
                  this.setBattleTimes(other.getBattleTimes());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasMaxHurt()) {
                  this.setMaxHurt(other.getMaxHurt());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleTimes()) {
               return false;
            } else if (!this.hasBuyTimes()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasMaxHurt();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BarbarianInfo_4602 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianInfo_4602)SevenBarbarianMsg.S2C_BarbarianInfo_4602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianInfo_4602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleTimes() {
            return this.battleTimes_;
         }

         public Builder setBattleTimes(int value) {
            this.bitField0_ |= 1;
            this.battleTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleTimes() {
            this.bitField0_ &= -2;
            this.battleTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 2;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 4;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -5;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxHurt() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getMaxHurt() {
            return this.maxHurt_;
         }

         public Builder setMaxHurt(long value) {
            this.bitField0_ |= 8;
            this.maxHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxHurt() {
            this.bitField0_ &= -9;
            this.maxHurt_ = 0L;
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

   public static final class C2S_FamousInfo_4603 extends GeneratedMessageV3 implements C2S_FamousInfo_4603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_FamousInfo_4603 DEFAULT_INSTANCE = new C2S_FamousInfo_4603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FamousInfo_4603> PARSER = new AbstractParser<C2S_FamousInfo_4603>() {
         public C2S_FamousInfo_4603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FamousInfo_4603(input, extensionRegistry);
         }
      };

      private C2S_FamousInfo_4603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FamousInfo_4603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FamousInfo_4603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FamousInfo_4603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FamousInfo_4603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FamousInfo_4603)) {
            return super.equals(obj);
         } else {
            C2S_FamousInfo_4603 other = (C2S_FamousInfo_4603)obj;
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

      public static C2S_FamousInfo_4603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data);
      }

      public static C2S_FamousInfo_4603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FamousInfo_4603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data);
      }

      public static C2S_FamousInfo_4603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FamousInfo_4603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data);
      }

      public static C2S_FamousInfo_4603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FamousInfo_4603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FamousInfo_4603 parseFrom(InputStream input) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FamousInfo_4603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FamousInfo_4603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FamousInfo_4603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FamousInfo_4603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FamousInfo_4603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FamousInfo_4603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FamousInfo_4603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FamousInfo_4603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FamousInfo_4603> parser() {
         return PARSER;
      }

      public Parser<C2S_FamousInfo_4603> getParserForType() {
         return PARSER;
      }

      public C2S_FamousInfo_4603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FamousInfo_4603OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FamousInfo_4603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.C2S_FamousInfo_4603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_FamousInfo_4603_descriptor;
         }

         public C2S_FamousInfo_4603 getDefaultInstanceForType() {
            return SevenBarbarianMsg.C2S_FamousInfo_4603.getDefaultInstance();
         }

         public C2S_FamousInfo_4603 build() {
            C2S_FamousInfo_4603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FamousInfo_4603 buildPartial() {
            C2S_FamousInfo_4603 result = new C2S_FamousInfo_4603(this);
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
            if (other instanceof C2S_FamousInfo_4603) {
               return this.mergeFrom((C2S_FamousInfo_4603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FamousInfo_4603 other) {
            if (other == SevenBarbarianMsg.C2S_FamousInfo_4603.getDefaultInstance()) {
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
            C2S_FamousInfo_4603 parsedMessage = null;

            try {
               parsedMessage = (C2S_FamousInfo_4603)SevenBarbarianMsg.C2S_FamousInfo_4603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FamousInfo_4603)e.getUnfinishedMessage();
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

   public static final class S2C_FamousInfo_4604 extends GeneratedMessageV3 implements S2C_FamousInfo_4604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int FAMOUSINFO_FIELD_NUMBER = 2;
      private List<FamousInfo> famousInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_FamousInfo_4604 DEFAULT_INSTANCE = new S2C_FamousInfo_4604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FamousInfo_4604> PARSER = new AbstractParser<S2C_FamousInfo_4604>() {
         public S2C_FamousInfo_4604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FamousInfo_4604(input, extensionRegistry);
         }
      };

      private S2C_FamousInfo_4604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FamousInfo_4604() {
         this.memoizedIsInitialized = -1;
         this.famousInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FamousInfo_4604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FamousInfo_4604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.famousInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.famousInfo_.add(input.readMessage(SevenBarbarianMsg.FamousInfo.PARSER, extensionRegistry));
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
                  this.famousInfo_ = Collections.unmodifiableList(this.famousInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FamousInfo_4604.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<FamousInfo> getFamousInfoList() {
         return this.famousInfo_;
      }

      public List<? extends FamousInfoOrBuilder> getFamousInfoOrBuilderList() {
         return this.famousInfo_;
      }

      public int getFamousInfoCount() {
         return this.famousInfo_.size();
      }

      public FamousInfo getFamousInfo(int index) {
         return (FamousInfo)this.famousInfo_.get(index);
      }

      public FamousInfoOrBuilder getFamousInfoOrBuilder(int index) {
         return (FamousInfoOrBuilder)this.famousInfo_.get(index);
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
            for(int i = 0; i < this.getFamousInfoCount(); ++i) {
               if (!this.getFamousInfo(i).isInitialized()) {
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

         for(int i = 0; i < this.famousInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.famousInfo_.get(i));
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

            for(int i = 0; i < this.famousInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.famousInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FamousInfo_4604)) {
            return super.equals(obj);
         } else {
            S2C_FamousInfo_4604 other = (S2C_FamousInfo_4604)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getFamousInfoList().equals(other.getFamousInfoList())) {
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

            if (this.getFamousInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFamousInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FamousInfo_4604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data);
      }

      public static S2C_FamousInfo_4604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FamousInfo_4604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data);
      }

      public static S2C_FamousInfo_4604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FamousInfo_4604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data);
      }

      public static S2C_FamousInfo_4604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FamousInfo_4604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FamousInfo_4604 parseFrom(InputStream input) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FamousInfo_4604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FamousInfo_4604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FamousInfo_4604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FamousInfo_4604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FamousInfo_4604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FamousInfo_4604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FamousInfo_4604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FamousInfo_4604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FamousInfo_4604> parser() {
         return PARSER;
      }

      public Parser<S2C_FamousInfo_4604> getParserForType() {
         return PARSER;
      }

      public S2C_FamousInfo_4604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FamousInfo_4604OrBuilder {
         private int bitField0_;
         private int id_;
         private List<FamousInfo> famousInfo_;
         private RepeatedFieldBuilderV3<FamousInfo, FamousInfo.Builder, FamousInfoOrBuilder> famousInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FamousInfo_4604.class, Builder.class);
         }

         private Builder() {
            this.famousInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.famousInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2C_FamousInfo_4604.alwaysUseFieldBuilders) {
               this.getFamousInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.famousInfoBuilder_ == null) {
               this.famousInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.famousInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_FamousInfo_4604_descriptor;
         }

         public S2C_FamousInfo_4604 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2C_FamousInfo_4604.getDefaultInstance();
         }

         public S2C_FamousInfo_4604 build() {
            S2C_FamousInfo_4604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FamousInfo_4604 buildPartial() {
            S2C_FamousInfo_4604 result = new S2C_FamousInfo_4604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.famousInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.famousInfo_ = Collections.unmodifiableList(this.famousInfo_);
                  this.bitField0_ &= -3;
               }

               result.famousInfo_ = this.famousInfo_;
            } else {
               result.famousInfo_ = this.famousInfoBuilder_.build();
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
            if (other instanceof S2C_FamousInfo_4604) {
               return this.mergeFrom((S2C_FamousInfo_4604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FamousInfo_4604 other) {
            if (other == SevenBarbarianMsg.S2C_FamousInfo_4604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.famousInfoBuilder_ == null) {
                  if (!other.famousInfo_.isEmpty()) {
                     if (this.famousInfo_.isEmpty()) {
                        this.famousInfo_ = other.famousInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureFamousInfoIsMutable();
                        this.famousInfo_.addAll(other.famousInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.famousInfo_.isEmpty()) {
                  if (this.famousInfoBuilder_.isEmpty()) {
                     this.famousInfoBuilder_.dispose();
                     this.famousInfoBuilder_ = null;
                     this.famousInfo_ = other.famousInfo_;
                     this.bitField0_ &= -3;
                     this.famousInfoBuilder_ = SevenBarbarianMsg.S2C_FamousInfo_4604.alwaysUseFieldBuilders ? this.getFamousInfoFieldBuilder() : null;
                  } else {
                     this.famousInfoBuilder_.addAllMessages(other.famousInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               for(int i = 0; i < this.getFamousInfoCount(); ++i) {
                  if (!this.getFamousInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FamousInfo_4604 parsedMessage = null;

            try {
               parsedMessage = (S2C_FamousInfo_4604)SevenBarbarianMsg.S2C_FamousInfo_4604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FamousInfo_4604)e.getUnfinishedMessage();
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

         private void ensureFamousInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.famousInfo_ = new ArrayList(this.famousInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<FamousInfo> getFamousInfoList() {
            return this.famousInfoBuilder_ == null ? Collections.unmodifiableList(this.famousInfo_) : this.famousInfoBuilder_.getMessageList();
         }

         public int getFamousInfoCount() {
            return this.famousInfoBuilder_ == null ? this.famousInfo_.size() : this.famousInfoBuilder_.getCount();
         }

         public FamousInfo getFamousInfo(int index) {
            return this.famousInfoBuilder_ == null ? (FamousInfo)this.famousInfo_.get(index) : (FamousInfo)this.famousInfoBuilder_.getMessage(index);
         }

         public Builder setFamousInfo(int index, FamousInfo value) {
            if (this.famousInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFamousInfoIsMutable();
               this.famousInfo_.set(index, value);
               this.onChanged();
            } else {
               this.famousInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFamousInfo(int index, FamousInfo.Builder builderForValue) {
            if (this.famousInfoBuilder_ == null) {
               this.ensureFamousInfoIsMutable();
               this.famousInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.famousInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFamousInfo(FamousInfo value) {
            if (this.famousInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFamousInfoIsMutable();
               this.famousInfo_.add(value);
               this.onChanged();
            } else {
               this.famousInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFamousInfo(int index, FamousInfo value) {
            if (this.famousInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFamousInfoIsMutable();
               this.famousInfo_.add(index, value);
               this.onChanged();
            } else {
               this.famousInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFamousInfo(FamousInfo.Builder builderForValue) {
            if (this.famousInfoBuilder_ == null) {
               this.ensureFamousInfoIsMutable();
               this.famousInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.famousInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFamousInfo(int index, FamousInfo.Builder builderForValue) {
            if (this.famousInfoBuilder_ == null) {
               this.ensureFamousInfoIsMutable();
               this.famousInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.famousInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFamousInfo(Iterable<? extends FamousInfo> values) {
            if (this.famousInfoBuilder_ == null) {
               this.ensureFamousInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.famousInfo_);
               this.onChanged();
            } else {
               this.famousInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFamousInfo() {
            if (this.famousInfoBuilder_ == null) {
               this.famousInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.famousInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeFamousInfo(int index) {
            if (this.famousInfoBuilder_ == null) {
               this.ensureFamousInfoIsMutable();
               this.famousInfo_.remove(index);
               this.onChanged();
            } else {
               this.famousInfoBuilder_.remove(index);
            }

            return this;
         }

         public FamousInfo.Builder getFamousInfoBuilder(int index) {
            return (FamousInfo.Builder)this.getFamousInfoFieldBuilder().getBuilder(index);
         }

         public FamousInfoOrBuilder getFamousInfoOrBuilder(int index) {
            return this.famousInfoBuilder_ == null ? (FamousInfoOrBuilder)this.famousInfo_.get(index) : (FamousInfoOrBuilder)this.famousInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends FamousInfoOrBuilder> getFamousInfoOrBuilderList() {
            return this.famousInfoBuilder_ != null ? this.famousInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.famousInfo_);
         }

         public FamousInfo.Builder addFamousInfoBuilder() {
            return (FamousInfo.Builder)this.getFamousInfoFieldBuilder().addBuilder(SevenBarbarianMsg.FamousInfo.getDefaultInstance());
         }

         public FamousInfo.Builder addFamousInfoBuilder(int index) {
            return (FamousInfo.Builder)this.getFamousInfoFieldBuilder().addBuilder(index, SevenBarbarianMsg.FamousInfo.getDefaultInstance());
         }

         public List<FamousInfo.Builder> getFamousInfoBuilderList() {
            return this.getFamousInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FamousInfo, FamousInfo.Builder, FamousInfoOrBuilder> getFamousInfoFieldBuilder() {
            if (this.famousInfoBuilder_ == null) {
               this.famousInfoBuilder_ = new RepeatedFieldBuilderV3(this.famousInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.famousInfo_ = null;
            }

            return this.famousInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class FamousInfo extends GeneratedMessageV3 implements FamousInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int DATA_FIELD_NUMBER = 2;
      private CommonMsg.PlayerInfo data_;
      public static final int MAXHURT_FIELD_NUMBER = 3;
      private long maxHurt_;
      private byte memoizedIsInitialized;
      private static final FamousInfo DEFAULT_INSTANCE = new FamousInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<FamousInfo> PARSER = new AbstractParser<FamousInfo>() {
         public FamousInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FamousInfo(input, extensionRegistry);
         }
      };

      private FamousInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FamousInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FamousInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FamousInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.data_.toBuilder();
                        }

                        this.data_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.data_);
                           this.data_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxHurt_ = input.readInt64();
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FamousInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasData() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerInfo getData() {
         return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
      }

      public CommonMsg.PlayerInfoOrBuilder getDataOrBuilder() {
         return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
      }

      public boolean hasMaxHurt() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getMaxHurt() {
         return this.maxHurt_;
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
         } else if (this.hasData() && !this.getData().isInitialized()) {
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
            output.writeMessage(2, this.getData());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.maxHurt_);
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
               size += CodedOutputStream.computeMessageSize(2, this.getData());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.maxHurt_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FamousInfo)) {
            return super.equals(obj);
         } else {
            FamousInfo other = (FamousInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasData() != other.hasData()) {
               return false;
            } else if (this.hasData() && !this.getData().equals(other.getData())) {
               return false;
            } else if (this.hasMaxHurt() != other.hasMaxHurt()) {
               return false;
            } else if (this.hasMaxHurt() && this.getMaxHurt() != other.getMaxHurt()) {
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

            if (this.hasData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getData().hashCode();
            }

            if (this.hasMaxHurt()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getMaxHurt());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FamousInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data);
      }

      public static FamousInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FamousInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data);
      }

      public static FamousInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FamousInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data);
      }

      public static FamousInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FamousInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FamousInfo parseFrom(InputStream input) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FamousInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FamousInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FamousInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FamousInfo parseFrom(CodedInputStream input) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FamousInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FamousInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FamousInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FamousInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FamousInfo> parser() {
         return PARSER;
      }

      public Parser<FamousInfo> getParserForType() {
         return PARSER;
      }

      public FamousInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FamousInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private CommonMsg.PlayerInfo data_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> dataBuilder_;
         private long maxHurt_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FamousInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.FamousInfo.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            if (this.dataBuilder_ == null) {
               this.data_ = null;
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.maxHurt_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_FamousInfo_descriptor;
         }

         public FamousInfo getDefaultInstanceForType() {
            return SevenBarbarianMsg.FamousInfo.getDefaultInstance();
         }

         public FamousInfo build() {
            FamousInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FamousInfo buildPartial() {
            FamousInfo result = new FamousInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.dataBuilder_ == null) {
                  result.data_ = this.data_;
               } else {
                  result.data_ = (CommonMsg.PlayerInfo)this.dataBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxHurt_ = this.maxHurt_;
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
            if (other instanceof FamousInfo) {
               return this.mergeFrom((FamousInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FamousInfo other) {
            if (other == SevenBarbarianMsg.FamousInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasData()) {
                  this.mergeData(other.getData());
               }

               if (other.hasMaxHurt()) {
                  this.setMaxHurt(other.getMaxHurt());
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
               return !this.hasData() || this.getData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FamousInfo parsedMessage = null;

            try {
               parsedMessage = (FamousInfo)SevenBarbarianMsg.FamousInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FamousInfo)e.getUnfinishedMessage();
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

         public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerInfo getData() {
            if (this.dataBuilder_ == null) {
               return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
            } else {
               return (CommonMsg.PlayerInfo)this.dataBuilder_.getMessage();
            }
         }

         public Builder setData(CommonMsg.PlayerInfo value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.data_ = value;
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setData(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.data_ = builderForValue.build();
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeData(CommonMsg.PlayerInfo value) {
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.data_ != null && this.data_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.data_ = CommonMsg.PlayerInfo.newBuilder(this.data_).mergeFrom(value).buildPartial();
               } else {
                  this.data_ = value;
               }

               this.onChanged();
            } else {
               this.dataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = null;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getDataBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getDataFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getDataOrBuilder() {
            if (this.dataBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.dataBuilder_.getMessageOrBuilder();
            } else {
               return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new SingleFieldBuilderV3(this.getData(), this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public boolean hasMaxHurt() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getMaxHurt() {
            return this.maxHurt_;
         }

         public Builder setMaxHurt(long value) {
            this.bitField0_ |= 4;
            this.maxHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxHurt() {
            this.bitField0_ &= -5;
            this.maxHurt_ = 0L;
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

   public static final class C2S_RankInfo_4605 extends GeneratedMessageV3 implements C2S_RankInfo_4605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RankInfo_4605 DEFAULT_INSTANCE = new C2S_RankInfo_4605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankInfo_4605> PARSER = new AbstractParser<C2S_RankInfo_4605>() {
         public C2S_RankInfo_4605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankInfo_4605(input, extensionRegistry);
         }
      };

      private C2S_RankInfo_4605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankInfo_4605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankInfo_4605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankInfo_4605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankInfo_4605.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RankInfo_4605)) {
            return super.equals(obj);
         } else {
            C2S_RankInfo_4605 other = (C2S_RankInfo_4605)obj;
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

      public static C2S_RankInfo_4605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data);
      }

      public static C2S_RankInfo_4605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankInfo_4605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data);
      }

      public static C2S_RankInfo_4605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankInfo_4605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data);
      }

      public static C2S_RankInfo_4605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankInfo_4605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankInfo_4605 parseFrom(InputStream input) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankInfo_4605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankInfo_4605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankInfo_4605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankInfo_4605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankInfo_4605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankInfo_4605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankInfo_4605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankInfo_4605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankInfo_4605> parser() {
         return PARSER;
      }

      public Parser<C2S_RankInfo_4605> getParserForType() {
         return PARSER;
      }

      public C2S_RankInfo_4605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankInfo_4605OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankInfo_4605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.C2S_RankInfo_4605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_RankInfo_4605_descriptor;
         }

         public C2S_RankInfo_4605 getDefaultInstanceForType() {
            return SevenBarbarianMsg.C2S_RankInfo_4605.getDefaultInstance();
         }

         public C2S_RankInfo_4605 build() {
            C2S_RankInfo_4605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankInfo_4605 buildPartial() {
            C2S_RankInfo_4605 result = new C2S_RankInfo_4605(this);
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
            if (other instanceof C2S_RankInfo_4605) {
               return this.mergeFrom((C2S_RankInfo_4605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankInfo_4605 other) {
            if (other == SevenBarbarianMsg.C2S_RankInfo_4605.getDefaultInstance()) {
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
            C2S_RankInfo_4605 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankInfo_4605)SevenBarbarianMsg.C2S_RankInfo_4605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankInfo_4605)e.getUnfinishedMessage();
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

   public static final class S2C_RankInfo_4606 extends GeneratedMessageV3 implements S2C_RankInfo_4606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int MYINFO_FIELD_NUMBER = 2;
      private RankInfo myInfo_;
      public static final int RANKINFO_FIELD_NUMBER = 3;
      private List<RankInfo> rankInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_RankInfo_4606 DEFAULT_INSTANCE = new S2C_RankInfo_4606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankInfo_4606> PARSER = new AbstractParser<S2C_RankInfo_4606>() {
         public S2C_RankInfo_4606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankInfo_4606(input, extensionRegistry);
         }
      };

      private S2C_RankInfo_4606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankInfo_4606() {
         this.memoizedIsInitialized = -1;
         this.rankInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankInfo_4606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankInfo_4606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myInfo_.toBuilder();
                        }

                        this.myInfo_ = (RankInfo)input.readMessage(SevenBarbarianMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myInfo_);
                           this.myInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rankInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rankInfo_.add(input.readMessage(SevenBarbarianMsg.RankInfo.PARSER, extensionRegistry));
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
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankInfo_4606.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasMyInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankInfo getMyInfo() {
         return this.myInfo_ == null ? SevenBarbarianMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public RankInfoOrBuilder getMyInfoOrBuilder() {
         return this.myInfo_ == null ? SevenBarbarianMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public List<RankInfo> getRankInfoList() {
         return this.rankInfo_;
      }

      public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
         return this.rankInfo_;
      }

      public int getRankInfoCount() {
         return this.rankInfo_.size();
      }

      public RankInfo getRankInfo(int index) {
         return (RankInfo)this.rankInfo_.get(index);
      }

      public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
         return (RankInfoOrBuilder)this.rankInfo_.get(index);
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
         } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankInfoCount(); ++i) {
               if (!this.getRankInfo(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyInfo());
         }

         for(int i = 0; i < this.rankInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.rankInfo_.get(i));
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyInfo());
            }

            for(int i = 0; i < this.rankInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.rankInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankInfo_4606)) {
            return super.equals(obj);
         } else {
            S2C_RankInfo_4606 other = (S2C_RankInfo_4606)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasMyInfo() != other.hasMyInfo()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().equals(other.getMyInfo())) {
               return false;
            } else if (!this.getRankInfoList().equals(other.getRankInfoList())) {
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

            if (this.hasMyInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyInfo().hashCode();
            }

            if (this.getRankInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRankInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankInfo_4606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data);
      }

      public static S2C_RankInfo_4606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankInfo_4606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data);
      }

      public static S2C_RankInfo_4606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankInfo_4606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data);
      }

      public static S2C_RankInfo_4606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankInfo_4606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankInfo_4606 parseFrom(InputStream input) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankInfo_4606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankInfo_4606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankInfo_4606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankInfo_4606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankInfo_4606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankInfo_4606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankInfo_4606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankInfo_4606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankInfo_4606> parser() {
         return PARSER;
      }

      public Parser<S2C_RankInfo_4606> getParserForType() {
         return PARSER;
      }

      public S2C_RankInfo_4606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankInfo_4606OrBuilder {
         private int bitField0_;
         private int id_;
         private RankInfo myInfo_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myInfoBuilder_;
         private List<RankInfo> rankInfo_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankInfo_4606.class, Builder.class);
         }

         private Builder() {
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2C_RankInfo_4606.alwaysUseFieldBuilders) {
               this.getMyInfoFieldBuilder();
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_RankInfo_4606_descriptor;
         }

         public S2C_RankInfo_4606 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2C_RankInfo_4606.getDefaultInstance();
         }

         public S2C_RankInfo_4606 build() {
            S2C_RankInfo_4606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankInfo_4606 buildPartial() {
            S2C_RankInfo_4606 result = new S2C_RankInfo_4606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myInfoBuilder_ == null) {
                  result.myInfo_ = this.myInfo_;
               } else {
                  result.myInfo_ = (RankInfo)this.myInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
                  this.bitField0_ &= -5;
               }

               result.rankInfo_ = this.rankInfo_;
            } else {
               result.rankInfo_ = this.rankInfoBuilder_.build();
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
            if (other instanceof S2C_RankInfo_4606) {
               return this.mergeFrom((S2C_RankInfo_4606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankInfo_4606 other) {
            if (other == SevenBarbarianMsg.S2C_RankInfo_4606.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasMyInfo()) {
                  this.mergeMyInfo(other.getMyInfo());
               }

               if (this.rankInfoBuilder_ == null) {
                  if (!other.rankInfo_.isEmpty()) {
                     if (this.rankInfo_.isEmpty()) {
                        this.rankInfo_ = other.rankInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRankInfoIsMutable();
                        this.rankInfo_.addAll(other.rankInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankInfo_.isEmpty()) {
                  if (this.rankInfoBuilder_.isEmpty()) {
                     this.rankInfoBuilder_.dispose();
                     this.rankInfoBuilder_ = null;
                     this.rankInfo_ = other.rankInfo_;
                     this.bitField0_ &= -5;
                     this.rankInfoBuilder_ = SevenBarbarianMsg.S2C_RankInfo_4606.alwaysUseFieldBuilders ? this.getRankInfoFieldBuilder() : null;
                  } else {
                     this.rankInfoBuilder_.addAllMessages(other.rankInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankInfoCount(); ++i) {
                  if (!this.getRankInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RankInfo_4606 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankInfo_4606)SevenBarbarianMsg.S2C_RankInfo_4606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankInfo_4606)e.getUnfinishedMessage();
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

         public boolean hasMyInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankInfo getMyInfo() {
            if (this.myInfoBuilder_ == null) {
               return this.myInfo_ == null ? SevenBarbarianMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            } else {
               return (RankInfo)this.myInfoBuilder_.getMessage();
            }
         }

         public Builder setMyInfo(RankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myInfo_ = value;
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMyInfo(RankInfo.Builder builderForValue) {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyInfo(RankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myInfo_ != null && this.myInfo_ != SevenBarbarianMsg.RankInfo.getDefaultInstance()) {
                  this.myInfo_ = SevenBarbarianMsg.RankInfo.newBuilder(this.myInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.myInfo_ = value;
               }

               this.onChanged();
            } else {
               this.myInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMyInfo() {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
               this.onChanged();
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public RankInfo.Builder getMyInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankInfo.Builder)this.getMyInfoFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyInfoOrBuilder() {
            if (this.myInfoBuilder_ != null) {
               return (RankInfoOrBuilder)this.myInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.myInfo_ == null ? SevenBarbarianMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyInfoFieldBuilder() {
            if (this.myInfoBuilder_ == null) {
               this.myInfoBuilder_ = new SingleFieldBuilderV3(this.getMyInfo(), this.getParentForChildren(), this.isClean());
               this.myInfo_ = null;
            }

            return this.myInfoBuilder_;
         }

         private void ensureRankInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rankInfo_ = new ArrayList(this.rankInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<RankInfo> getRankInfoList() {
            return this.rankInfoBuilder_ == null ? Collections.unmodifiableList(this.rankInfo_) : this.rankInfoBuilder_.getMessageList();
         }

         public int getRankInfoCount() {
            return this.rankInfoBuilder_ == null ? this.rankInfo_.size() : this.rankInfoBuilder_.getCount();
         }

         public RankInfo getRankInfo(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfo)this.rankInfo_.get(index) : (RankInfo)this.rankInfoBuilder_.getMessage(index);
         }

         public Builder setRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankInfo(RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankInfo(Iterable<? extends RankInfo> values) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankInfo_);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankInfo(int index) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.remove(index);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.remove(index);
            }

            return this;
         }

         public RankInfo.Builder getRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfoOrBuilder)this.rankInfo_.get(index) : (RankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
            return this.rankInfoBuilder_ != null ? this.rankInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankInfo_);
         }

         public RankInfo.Builder addRankInfoBuilder() {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(SevenBarbarianMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(index, SevenBarbarianMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getRankInfoBuilderList() {
            return this.getRankInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new RepeatedFieldBuilderV3(this.rankInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int HEADID_FIELD_NUMBER = 5;
      private int headId_;
      public static final int HEADFRAME_FIELD_NUMBER = 6;
      private int headFrame_;
      public static final int MAXHURT_FIELD_NUMBER = 7;
      private long maxHurt_;
      public static final int HURTSUM_FIELD_NUMBER = 8;
      private long hurtSum_;
      private byte memoizedIsInitialized;
      private static final RankInfo DEFAULT_INSTANCE = new RankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankInfo> PARSER = new AbstractParser<RankInfo>() {
         public RankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankInfo(input, extensionRegistry);
         }
      };

      private RankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.maxHurt_ = input.readInt64();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.hurtSum_ = input.readInt64();
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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

      public boolean hasHeadId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasMaxHurt() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getMaxHurt() {
         return this.maxHurt_;
      }

      public boolean hasHurtSum() {
         return (this.bitField0_ & 128) != 0;
      }

      public long getHurtSum() {
         return this.hurtSum_;
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
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
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.headFrame_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(7, this.maxHurt_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt64(8, this.hurtSum_);
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
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.headFrame_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.maxHurt_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt64Size(8, this.hurtSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankInfo)) {
            return super.equals(obj);
         } else {
            RankInfo other = (RankInfo)obj;
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
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasMaxHurt() != other.hasMaxHurt()) {
               return false;
            } else if (this.hasMaxHurt() && this.getMaxHurt() != other.getMaxHurt()) {
               return false;
            } else if (this.hasHurtSum() != other.hasHurtSum()) {
               return false;
            } else if (this.hasHurtSum() && this.getHurtSum() != other.getHurtSum()) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasMaxHurt()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getMaxHurt());
            }

            if (this.hasHurtSum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashLong(this.getHurtSum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseFrom(CodedInputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankInfo> parser() {
         return PARSER;
      }

      public Parser<RankInfo> getParserForType() {
         return PARSER;
      }

      public RankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int headId_;
         private int headFrame_;
         private long maxHurt_;
         private long hurtSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (SevenBarbarianMsg.RankInfo.alwaysUseFieldBuilders) {
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
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.headId_ = 0;
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
            this.bitField0_ &= -33;
            this.maxHurt_ = 0L;
            this.bitField0_ &= -65;
            this.hurtSum_ = 0L;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return SevenBarbarianMsg.RankInfo.getDefaultInstance();
         }

         public RankInfo build() {
            RankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankInfo buildPartial() {
            RankInfo result = new RankInfo(this);
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
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.maxHurt_ = this.maxHurt_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.hurtSum_ = this.hurtSum_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == SevenBarbarianMsg.RankInfo.getDefaultInstance()) {
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

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasMaxHurt()) {
                  this.setMaxHurt(other.getMaxHurt());
               }

               if (other.hasHurtSum()) {
                  this.setHurtSum(other.getHurtSum());
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
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasHeadId()) {
               return false;
            } else {
               return this.hasHeadFrame();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)SevenBarbarianMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankInfo)e.getUnfinishedMessage();
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
            this.playerName_ = SevenBarbarianMsg.RankInfo.getDefaultInstance().getPlayerName();
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

         public boolean hasHeadId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 16;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -17;
            this.headId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 32;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxHurt() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getMaxHurt() {
            return this.maxHurt_;
         }

         public Builder setMaxHurt(long value) {
            this.bitField0_ |= 64;
            this.maxHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxHurt() {
            this.bitField0_ &= -65;
            this.maxHurt_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHurtSum() {
            return (this.bitField0_ & 128) != 0;
         }

         public long getHurtSum() {
            return this.hurtSum_;
         }

         public Builder setHurtSum(long value) {
            this.bitField0_ |= 128;
            this.hurtSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHurtSum() {
            this.bitField0_ &= -129;
            this.hurtSum_ = 0L;
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

   public static final class C2S_BarbarianInfo_4607 extends GeneratedMessageV3 implements C2S_BarbarianInfo_4607OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianInfo_4607 DEFAULT_INSTANCE = new C2S_BarbarianInfo_4607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianInfo_4607> PARSER = new AbstractParser<C2S_BarbarianInfo_4607>() {
         public C2S_BarbarianInfo_4607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianInfo_4607(input, extensionRegistry);
         }
      };

      private C2S_BarbarianInfo_4607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianInfo_4607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianInfo_4607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianInfo_4607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_4607.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianInfo_4607)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianInfo_4607 other = (C2S_BarbarianInfo_4607)obj;
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

      public static C2S_BarbarianInfo_4607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_4607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_4607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_4607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianInfo_4607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianInfo_4607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianInfo_4607> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianInfo_4607> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianInfo_4607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianInfo_4607OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_4607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.C2S_BarbarianInfo_4607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_C2S_BarbarianInfo_4607_descriptor;
         }

         public C2S_BarbarianInfo_4607 getDefaultInstanceForType() {
            return SevenBarbarianMsg.C2S_BarbarianInfo_4607.getDefaultInstance();
         }

         public C2S_BarbarianInfo_4607 build() {
            C2S_BarbarianInfo_4607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianInfo_4607 buildPartial() {
            C2S_BarbarianInfo_4607 result = new C2S_BarbarianInfo_4607(this);
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
            if (other instanceof C2S_BarbarianInfo_4607) {
               return this.mergeFrom((C2S_BarbarianInfo_4607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianInfo_4607 other) {
            if (other == SevenBarbarianMsg.C2S_BarbarianInfo_4607.getDefaultInstance()) {
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
            C2S_BarbarianInfo_4607 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianInfo_4607)SevenBarbarianMsg.C2S_BarbarianInfo_4607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianInfo_4607)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianInfo_4608 extends GeneratedMessageV3 implements S2C_BarbarianInfo_4608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLETIMES_FIELD_NUMBER = 1;
      private int battleTimes_;
      public static final int BUYTIMES_FIELD_NUMBER = 2;
      private int buyTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianInfo_4608 DEFAULT_INSTANCE = new S2C_BarbarianInfo_4608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianInfo_4608> PARSER = new AbstractParser<S2C_BarbarianInfo_4608>() {
         public S2C_BarbarianInfo_4608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianInfo_4608(input, extensionRegistry);
         }
      };

      private S2C_BarbarianInfo_4608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianInfo_4608() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianInfo_4608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianInfo_4608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleTimes_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyTimes_ = input.readInt32();
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_4608.class, Builder.class);
      }

      public boolean hasBattleTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleTimes() {
         return this.battleTimes_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleTimes_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleTimes_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianInfo_4608)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianInfo_4608 other = (S2C_BarbarianInfo_4608)obj;
            if (this.hasBattleTimes() != other.hasBattleTimes()) {
               return false;
            } else if (this.hasBattleTimes() && this.getBattleTimes() != other.getBattleTimes()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
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
            if (this.hasBattleTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleTimes();
            }

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianInfo_4608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_4608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_4608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_4608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianInfo_4608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianInfo_4608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianInfo_4608> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianInfo_4608> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianInfo_4608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianInfo_4608OrBuilder {
         private int bitField0_;
         private int battleTimes_;
         private int buyTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_4608.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2C_BarbarianInfo_4608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battleTimes_ = 0;
            this.bitField0_ &= -2;
            this.buyTimes_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BarbarianInfo_4608_descriptor;
         }

         public S2C_BarbarianInfo_4608 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2C_BarbarianInfo_4608.getDefaultInstance();
         }

         public S2C_BarbarianInfo_4608 build() {
            S2C_BarbarianInfo_4608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianInfo_4608 buildPartial() {
            S2C_BarbarianInfo_4608 result = new S2C_BarbarianInfo_4608(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleTimes_ = this.battleTimes_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyTimes_ = this.buyTimes_;
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
            if (other instanceof S2C_BarbarianInfo_4608) {
               return this.mergeFrom((S2C_BarbarianInfo_4608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianInfo_4608 other) {
            if (other == SevenBarbarianMsg.S2C_BarbarianInfo_4608.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleTimes()) {
                  this.setBattleTimes(other.getBattleTimes());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleTimes()) {
               return false;
            } else {
               return this.hasBuyTimes();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BarbarianInfo_4608 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianInfo_4608)SevenBarbarianMsg.S2C_BarbarianInfo_4608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianInfo_4608)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleTimes() {
            return this.battleTimes_;
         }

         public Builder setBattleTimes(int value) {
            this.bitField0_ |= 1;
            this.battleTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleTimes() {
            this.bitField0_ &= -2;
            this.battleTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 2;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
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

   public static final class S2S_BattleInfo_4609 extends GeneratedMessageV3 implements S2S_BattleInfo_4609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 4;
      private int sex_;
      public static final int LV_FIELD_NUMBER = 5;
      private int lv_;
      public static final int COMBATPOWER_FIELD_NUMBER = 6;
      private long combatPower_;
      public static final int HEADID_FIELD_NUMBER = 7;
      private int headId_;
      public static final int HEADFRAME_FIELD_NUMBER = 8;
      private int headFrame_;
      public static final int PRESTIGE_FIELD_NUMBER = 9;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 10;
      private int monarchId_;
      public static final int UNIONID_FIELD_NUMBER = 11;
      private int unionId_;
      public static final int UNIONNAME_FIELD_NUMBER = 12;
      private volatile Object unionName_;
      public static final int VIPLEV_FIELD_NUMBER = 14;
      private int vipLev_;
      public static final int ARRAYING_FIELD_NUMBER = 15;
      private ByteString arraying_;
      public static final int HURT_FIELD_NUMBER = 16;
      private long hurt_;
      public static final int CITY_FIELD_NUMBER = 17;
      private volatile Object city_;
      public static final int PROVINCE_FIELD_NUMBER = 18;
      private volatile Object province_;
      public static final int STEPID_FIELD_NUMBER = 19;
      private int stepId_;
      public static final int ID_FIELD_NUMBER = 20;
      private int id_;
      public static final int ITEM_FIELD_NUMBER = 21;
      private List<CommonMsg.ItemInfo> item_;
      public static final int SECONDTITLE_FIELD_NUMBER = 22;
      private int secondTitle_;
      private byte memoizedIsInitialized;
      private static final S2S_BattleInfo_4609 DEFAULT_INSTANCE = new S2S_BattleInfo_4609();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_BattleInfo_4609> PARSER = new AbstractParser<S2S_BattleInfo_4609>() {
         public S2S_BattleInfo_4609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_BattleInfo_4609(input, extensionRegistry);
         }
      };

      private S2S_BattleInfo_4609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_BattleInfo_4609() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.unionName_ = "";
         this.arraying_ = ByteString.EMPTY;
         this.city_ = "";
         this.province_ = "";
         this.item_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_BattleInfo_4609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_BattleInfo_4609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sex_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.lv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.prestige_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.unionId_ = input.readInt32();
                        break;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.unionName_ = bs;
                        break;
                     case 112:
                        this.bitField0_ |= 4096;
                        this.vipLev_ = input.readInt32();
                        break;
                     case 122:
                        this.bitField0_ |= 8192;
                        this.arraying_ = input.readBytes();
                        break;
                     case 128:
                        this.bitField0_ |= 16384;
                        this.hurt_ = input.readInt64();
                        break;
                     case 138:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32768;
                        this.city_ = bs;
                        break;
                     case 146:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 65536;
                        this.province_ = bs;
                        break;
                     case 152:
                        this.bitField0_ |= 131072;
                        this.stepId_ = input.readInt32();
                        break;
                     case 160:
                        this.bitField0_ |= 262144;
                        this.id_ = input.readInt32();
                        break;
                     case 170:
                        if ((mutable_bitField0_ & 524288) == 0) {
                           this.item_ = new ArrayList();
                           mutable_bitField0_ |= 524288;
                        }

                        this.item_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 176:
                        this.bitField0_ |= 524288;
                        this.secondTitle_ = input.readInt32();
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
               if ((mutable_bitField0_ & 524288) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleInfo_4609.class, Builder.class);
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

      public boolean hasSex() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasVipLev() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getVipLev() {
         return this.vipLev_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 8192) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public boolean hasHurt() {
         return (this.bitField0_ & 16384) != 0;
      }

      public long getHurt() {
         return this.hurt_;
      }

      public boolean hasCity() {
         return (this.bitField0_ & '耀') != 0;
      }

      public String getCity() {
         Object ref = this.city_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.city_ = s;
            }

            return s;
         }
      }

      public ByteString getCityBytes() {
         Object ref = this.city_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.city_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasProvince() {
         return (this.bitField0_ & 65536) != 0;
      }

      public String getProvince() {
         Object ref = this.province_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.province_ = s;
            }

            return s;
         }
      }

      public ByteString getProvinceBytes() {
         Object ref = this.province_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.province_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasStepId() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getStepId() {
         return this.stepId_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 262144) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<CommonMsg.ItemInfo> getItemList() {
         return this.item_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
         return this.item_;
      }

      public int getItemCount() {
         return this.item_.size();
      }

      public CommonMsg.ItemInfo getItem(int index) {
         return (CommonMsg.ItemInfo)this.item_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.item_.get(index);
      }

      public boolean hasSecondTitle() {
         return (this.bitField0_ & 524288) != 0;
      }

      public int getSecondTitle() {
         return this.secondTitle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sex_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.lv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.combatPower_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.headFrame_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.prestige_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.monarchId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.unionId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.unionName_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(14, this.vipLev_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeBytes(15, this.arraying_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt64(16, this.hurt_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            GeneratedMessageV3.writeString(output, 17, this.city_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            GeneratedMessageV3.writeString(output, 18, this.province_);
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(19, this.stepId_);
         }

         if ((this.bitField0_ & 262144) != 0) {
            output.writeInt32(20, this.id_);
         }

         for(int i = 0; i < this.item_.size(); ++i) {
            output.writeMessage(21, (MessageLite)this.item_.get(i));
         }

         if ((this.bitField0_ & 524288) != 0) {
            output.writeInt32(22, this.secondTitle_);
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
               size += CodedOutputStream.computeInt32Size(4, this.sex_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.lv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.combatPower_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.headFrame_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.prestige_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.monarchId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.unionId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.unionName_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.vipLev_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeBytesSize(15, this.arraying_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt64Size(16, this.hurt_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += GeneratedMessageV3.computeStringSize(17, this.city_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += GeneratedMessageV3.computeStringSize(18, this.province_);
            }

            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(19, this.stepId_);
            }

            if ((this.bitField0_ & 262144) != 0) {
               size += CodedOutputStream.computeInt32Size(20, this.id_);
            }

            for(int i = 0; i < this.item_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(21, (MessageLite)this.item_.get(i));
            }

            if ((this.bitField0_ & 524288) != 0) {
               size += CodedOutputStream.computeInt32Size(22, this.secondTitle_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_BattleInfo_4609)) {
            return super.equals(obj);
         } else {
            S2S_BattleInfo_4609 other = (S2S_BattleInfo_4609)obj;
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
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasVipLev() != other.hasVipLev()) {
               return false;
            } else if (this.hasVipLev() && this.getVipLev() != other.getVipLev()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasHurt() != other.hasHurt()) {
               return false;
            } else if (this.hasHurt() && this.getHurt() != other.getHurt()) {
               return false;
            } else if (this.hasCity() != other.hasCity()) {
               return false;
            } else if (this.hasCity() && !this.getCity().equals(other.getCity())) {
               return false;
            } else if (this.hasProvince() != other.hasProvince()) {
               return false;
            } else if (this.hasProvince() && !this.getProvince().equals(other.getProvince())) {
               return false;
            } else if (this.hasStepId() != other.hasStepId()) {
               return false;
            } else if (this.hasStepId() && this.getStepId() != other.getStepId()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getItemList().equals(other.getItemList())) {
               return false;
            } else if (this.hasSecondTitle() != other.hasSecondTitle()) {
               return false;
            } else if (this.hasSecondTitle() && this.getSecondTitle() != other.getSecondTitle()) {
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

            if (this.hasSex()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasVipLev()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getVipLev();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasHurt()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + Internal.hashLong(this.getHurt());
            }

            if (this.hasCity()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getCity().hashCode();
            }

            if (this.hasProvince()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getProvince().hashCode();
            }

            if (this.hasStepId()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + this.getStepId();
            }

            if (this.hasId()) {
               hash = 37 * hash + 20;
               hash = 53 * hash + this.getId();
            }

            if (this.getItemCount() > 0) {
               hash = 37 * hash + 21;
               hash = 53 * hash + this.getItemList().hashCode();
            }

            if (this.hasSecondTitle()) {
               hash = 37 * hash + 22;
               hash = 53 * hash + this.getSecondTitle();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_BattleInfo_4609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data);
      }

      public static S2S_BattleInfo_4609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleInfo_4609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data);
      }

      public static S2S_BattleInfo_4609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleInfo_4609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data);
      }

      public static S2S_BattleInfo_4609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleInfo_4609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleInfo_4609 parseFrom(InputStream input) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleInfo_4609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleInfo_4609 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_BattleInfo_4609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleInfo_4609 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleInfo_4609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleInfo_4609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_BattleInfo_4609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_BattleInfo_4609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_BattleInfo_4609> parser() {
         return PARSER;
      }

      public Parser<S2S_BattleInfo_4609> getParserForType() {
         return PARSER;
      }

      public S2S_BattleInfo_4609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_BattleInfo_4609OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int sex_;
         private int lv_;
         private long combatPower_;
         private int headId_;
         private int headFrame_;
         private int prestige_;
         private int monarchId_;
         private int unionId_;
         private Object unionName_;
         private int vipLev_;
         private ByteString arraying_;
         private long hurt_;
         private Object city_;
         private Object province_;
         private int stepId_;
         private int id_;
         private List<CommonMsg.ItemInfo> item_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;
         private int secondTitle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleInfo_4609.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.unionName_ = "";
            this.arraying_ = ByteString.EMPTY;
            this.city_ = "";
            this.province_ = "";
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.unionName_ = "";
            this.arraying_ = ByteString.EMPTY;
            this.city_ = "";
            this.province_ = "";
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2S_BattleInfo_4609.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
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
            this.sex_ = 0;
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.bitField0_ &= -17;
            this.combatPower_ = 0L;
            this.bitField0_ &= -33;
            this.headId_ = 0;
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.bitField0_ &= -129;
            this.prestige_ = 0;
            this.bitField0_ &= -257;
            this.monarchId_ = 0;
            this.bitField0_ &= -513;
            this.unionId_ = 0;
            this.bitField0_ &= -1025;
            this.unionName_ = "";
            this.bitField0_ &= -2049;
            this.vipLev_ = 0;
            this.bitField0_ &= -4097;
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -8193;
            this.hurt_ = 0L;
            this.bitField0_ &= -16385;
            this.city_ = "";
            this.bitField0_ &= -32769;
            this.province_ = "";
            this.bitField0_ &= -65537;
            this.stepId_ = 0;
            this.bitField0_ &= -131073;
            this.id_ = 0;
            this.bitField0_ &= -262145;
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -524289;
            } else {
               this.itemBuilder_.clear();
            }

            this.secondTitle_ = 0;
            this.bitField0_ &= -1048577;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_BattleInfo_4609_descriptor;
         }

         public S2S_BattleInfo_4609 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance();
         }

         public S2S_BattleInfo_4609 build() {
            S2S_BattleInfo_4609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_BattleInfo_4609 buildPartial() {
            S2S_BattleInfo_4609 result = new S2S_BattleInfo_4609(this);
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
               result.sex_ = this.sex_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 2048;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 4096) != 0) {
               result.vipLev_ = this.vipLev_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               to_bitField0_ |= 8192;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 16384) != 0) {
               result.hurt_ = this.hurt_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & '耀') != 0) {
               to_bitField0_ |= 32768;
            }

            result.city_ = this.city_;
            if ((from_bitField0_ & 65536) != 0) {
               to_bitField0_ |= 65536;
            }

            result.province_ = this.province_;
            if ((from_bitField0_ & 131072) != 0) {
               result.stepId_ = this.stepId_;
               to_bitField0_ |= 131072;
            }

            if ((from_bitField0_ & 262144) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 262144;
            }

            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 524288) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
                  this.bitField0_ &= -524289;
               }

               result.item_ = this.item_;
            } else {
               result.item_ = this.itemBuilder_.build();
            }

            if ((from_bitField0_ & 1048576) != 0) {
               result.secondTitle_ = this.secondTitle_;
               to_bitField0_ |= 524288;
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
            if (other instanceof S2S_BattleInfo_4609) {
               return this.mergeFrom((S2S_BattleInfo_4609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_BattleInfo_4609 other) {
            if (other == SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance()) {
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

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 2048;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasVipLev()) {
                  this.setVipLev(other.getVipLev());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasHurt()) {
                  this.setHurt(other.getHurt());
               }

               if (other.hasCity()) {
                  this.bitField0_ |= 32768;
                  this.city_ = other.city_;
                  this.onChanged();
               }

               if (other.hasProvince()) {
                  this.bitField0_ |= 65536;
                  this.province_ = other.province_;
                  this.onChanged();
               }

               if (other.hasStepId()) {
                  this.setStepId(other.getStepId());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.itemBuilder_ == null) {
                  if (!other.item_.isEmpty()) {
                     if (this.item_.isEmpty()) {
                        this.item_ = other.item_;
                        this.bitField0_ &= -524289;
                     } else {
                        this.ensureItemIsMutable();
                        this.item_.addAll(other.item_);
                     }

                     this.onChanged();
                  }
               } else if (!other.item_.isEmpty()) {
                  if (this.itemBuilder_.isEmpty()) {
                     this.itemBuilder_.dispose();
                     this.itemBuilder_ = null;
                     this.item_ = other.item_;
                     this.bitField0_ &= -524289;
                     this.itemBuilder_ = SevenBarbarianMsg.S2S_BattleInfo_4609.alwaysUseFieldBuilders ? this.getItemFieldBuilder() : null;
                  } else {
                     this.itemBuilder_.addAllMessages(other.item_);
                  }
               }

               if (other.hasSecondTitle()) {
                  this.setSecondTitle(other.getSecondTitle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_BattleInfo_4609 parsedMessage = null;

            try {
               parsedMessage = (S2S_BattleInfo_4609)SevenBarbarianMsg.S2S_BattleInfo_4609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_BattleInfo_4609)e.getUnfinishedMessage();
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
            this.playerName_ = SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance().getPlayerName();
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

         public boolean hasSex() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 8;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 16;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -17;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 32;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -33;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeadId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 64;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -65;
            this.headId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 128;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 256;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -257;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 512;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -513;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1024;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -1025;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 2048) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -2049;
            this.unionName_ = SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasVipLev() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getVipLev() {
            return this.vipLev_;
         }

         public Builder setVipLev(int value) {
            this.bitField0_ |= 4096;
            this.vipLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLev() {
            this.bitField0_ &= -4097;
            this.vipLev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 8192) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8192;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -8193;
            this.arraying_ = SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance().getArraying();
            this.onChanged();
            return this;
         }

         public boolean hasHurt() {
            return (this.bitField0_ & 16384) != 0;
         }

         public long getHurt() {
            return this.hurt_;
         }

         public Builder setHurt(long value) {
            this.bitField0_ |= 16384;
            this.hurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHurt() {
            this.bitField0_ &= -16385;
            this.hurt_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCity() {
            return (this.bitField0_ & '耀') != 0;
         }

         public String getCity() {
            Object ref = this.city_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.city_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCityBytes() {
            Object ref = this.city_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.city_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCity(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCity() {
            this.bitField0_ &= -32769;
            this.city_ = SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance().getCity();
            this.onChanged();
            return this;
         }

         public Builder setCityBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasProvince() {
            return (this.bitField0_ & 65536) != 0;
         }

         public String getProvince() {
            Object ref = this.province_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.province_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getProvinceBytes() {
            Object ref = this.province_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.province_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setProvince(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 65536;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearProvince() {
            this.bitField0_ &= -65537;
            this.province_ = SevenBarbarianMsg.S2S_BattleInfo_4609.getDefaultInstance().getProvince();
            this.onChanged();
            return this;
         }

         public Builder setProvinceBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 65536;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasStepId() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getStepId() {
            return this.stepId_;
         }

         public Builder setStepId(int value) {
            this.bitField0_ |= 131072;
            this.stepId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStepId() {
            this.bitField0_ &= -131073;
            this.stepId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 262144) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 262144;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -262145;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemIsMutable() {
            if ((this.bitField0_ & 524288) == 0) {
               this.item_ = new ArrayList(this.item_);
               this.bitField0_ |= 524288;
            }

         }

         public List<CommonMsg.ItemInfo> getItemList() {
            return this.itemBuilder_ == null ? Collections.unmodifiableList(this.item_) : this.itemBuilder_.getMessageList();
         }

         public int getItemCount() {
            return this.itemBuilder_ == null ? this.item_.size() : this.itemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItem(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfo)this.item_.get(index) : (CommonMsg.ItemInfo)this.itemBuilder_.getMessage(index);
         }

         public Builder setItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.set(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
               this.onChanged();
            } else {
               this.itemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -524289;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Builder removeItem(int index) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.remove(index);
               this.onChanged();
            } else {
               this.itemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.item_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
            return this.itemBuilder_ != null ? this.itemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemBuilderList() {
            return this.getItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new RepeatedFieldBuilderV3(this.item_, (this.bitField0_ & 524288) != 0, this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasSecondTitle() {
            return (this.bitField0_ & 1048576) != 0;
         }

         public int getSecondTitle() {
            return this.secondTitle_;
         }

         public Builder setSecondTitle(int value) {
            this.bitField0_ |= 1048576;
            this.secondTitle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSecondTitle() {
            this.bitField0_ &= -1048577;
            this.secondTitle_ = 0;
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

   public static final class S2S_SendMail_4610 extends GeneratedMessageV3 implements S2S_SendMail_4610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int COUNTHURT_FIELD_NUMBER = 2;
      private long countHurt_;
      private byte memoizedIsInitialized;
      private static final S2S_SendMail_4610 DEFAULT_INSTANCE = new S2S_SendMail_4610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SendMail_4610> PARSER = new AbstractParser<S2S_SendMail_4610>() {
         public S2S_SendMail_4610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SendMail_4610(input, extensionRegistry);
         }
      };

      private S2S_SendMail_4610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SendMail_4610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SendMail_4610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SendMail_4610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.countHurt_ = input.readInt64();
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
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendMail_4610.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasCountHurt() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getCountHurt() {
         return this.countHurt_;
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
         } else if (!this.hasCountHurt()) {
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
            output.writeInt64(2, this.countHurt_);
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
               size += CodedOutputStream.computeInt64Size(2, this.countHurt_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_SendMail_4610)) {
            return super.equals(obj);
         } else {
            S2S_SendMail_4610 other = (S2S_SendMail_4610)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasCountHurt() != other.hasCountHurt()) {
               return false;
            } else if (this.hasCountHurt() && this.getCountHurt() != other.getCountHurt()) {
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

            if (this.hasCountHurt()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getCountHurt());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_SendMail_4610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data);
      }

      public static S2S_SendMail_4610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendMail_4610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data);
      }

      public static S2S_SendMail_4610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendMail_4610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data);
      }

      public static S2S_SendMail_4610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendMail_4610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendMail_4610 parseFrom(InputStream input) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendMail_4610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendMail_4610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SendMail_4610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendMail_4610 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendMail_4610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendMail_4610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SendMail_4610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SendMail_4610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SendMail_4610> parser() {
         return PARSER;
      }

      public Parser<S2S_SendMail_4610> getParserForType() {
         return PARSER;
      }

      public S2S_SendMail_4610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SendMail_4610OrBuilder {
         private int bitField0_;
         private int rank_;
         private long countHurt_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendMail_4610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2S_SendMail_4610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.countHurt_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2S_SendMail_4610_descriptor;
         }

         public S2S_SendMail_4610 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2S_SendMail_4610.getDefaultInstance();
         }

         public S2S_SendMail_4610 build() {
            S2S_SendMail_4610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SendMail_4610 buildPartial() {
            S2S_SendMail_4610 result = new S2S_SendMail_4610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.countHurt_ = this.countHurt_;
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
            if (other instanceof S2S_SendMail_4610) {
               return this.mergeFrom((S2S_SendMail_4610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SendMail_4610 other) {
            if (other == SevenBarbarianMsg.S2S_SendMail_4610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasCountHurt()) {
                  this.setCountHurt(other.getCountHurt());
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
               return this.hasCountHurt();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_SendMail_4610 parsedMessage = null;

            try {
               parsedMessage = (S2S_SendMail_4610)SevenBarbarianMsg.S2S_SendMail_4610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SendMail_4610)e.getUnfinishedMessage();
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

         public boolean hasCountHurt() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getCountHurt() {
            return this.countHurt_;
         }

         public Builder setCountHurt(long value) {
            this.bitField0_ |= 2;
            this.countHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCountHurt() {
            this.bitField0_ &= -3;
            this.countHurt_ = 0L;
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

   public static final class S2C_BattleResult_4611 extends GeneratedMessageV3 implements S2C_BattleResult_4611OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int HURT_FIELD_NUMBER = 2;
      private long hurt_;
      public static final int COUNTHURT_FIELD_NUMBER = 3;
      private long countHurt_;
      public static final int ITEM_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> item_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleResult_4611 DEFAULT_INSTANCE = new S2C_BattleResult_4611();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleResult_4611> PARSER = new AbstractParser<S2C_BattleResult_4611>() {
         public S2C_BattleResult_4611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleResult_4611(input, extensionRegistry);
         }
      };

      private S2C_BattleResult_4611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleResult_4611() {
         this.memoizedIsInitialized = -1;
         this.item_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleResult_4611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleResult_4611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hurt_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.countHurt_ = input.readInt64();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.item_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.item_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.item_ = Collections.unmodifiableList(this.item_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleResult_4611.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasHurt() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getHurt() {
         return this.hurt_;
      }

      public boolean hasCountHurt() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getCountHurt() {
         return this.countHurt_;
      }

      public List<CommonMsg.ItemInfo> getItemList() {
         return this.item_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
         return this.item_;
      }

      public int getItemCount() {
         return this.item_.size();
      }

      public CommonMsg.ItemInfo getItem(int index) {
         return (CommonMsg.ItemInfo)this.item_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.item_.get(index);
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
         } else if (!this.hasHurt()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCountHurt()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.hurt_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.countHurt_);
         }

         for(int i = 0; i < this.item_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.item_.get(i));
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
               size += CodedOutputStream.computeInt64Size(2, this.hurt_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.countHurt_);
            }

            for(int i = 0; i < this.item_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.item_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleResult_4611)) {
            return super.equals(obj);
         } else {
            S2C_BattleResult_4611 other = (S2C_BattleResult_4611)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasHurt() != other.hasHurt()) {
               return false;
            } else if (this.hasHurt() && this.getHurt() != other.getHurt()) {
               return false;
            } else if (this.hasCountHurt() != other.hasCountHurt()) {
               return false;
            } else if (this.hasCountHurt() && this.getCountHurt() != other.getCountHurt()) {
               return false;
            } else if (!this.getItemList().equals(other.getItemList())) {
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

            if (this.hasHurt()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getHurt());
            }

            if (this.hasCountHurt()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getCountHurt());
            }

            if (this.getItemCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleResult_4611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_4611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_4611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_4611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_4611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_4611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_4611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_4611 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_4611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleResult_4611 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_4611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleResult_4611 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_4611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_4611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleResult_4611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleResult_4611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleResult_4611> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleResult_4611> getParserForType() {
         return PARSER;
      }

      public S2C_BattleResult_4611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleResult_4611OrBuilder {
         private int bitField0_;
         private int rank_;
         private long hurt_;
         private long countHurt_;
         private List<CommonMsg.ItemInfo> item_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleResult_4611.class, Builder.class);
         }

         private Builder() {
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SevenBarbarianMsg.S2C_BattleResult_4611.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.hurt_ = 0L;
            this.bitField0_ &= -3;
            this.countHurt_ = 0L;
            this.bitField0_ &= -5;
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SevenBarbarianMsg.internal_static_SevenBarbarian_com_gzbz_protobuf_S2C_BattleResult_4611_descriptor;
         }

         public S2C_BattleResult_4611 getDefaultInstanceForType() {
            return SevenBarbarianMsg.S2C_BattleResult_4611.getDefaultInstance();
         }

         public S2C_BattleResult_4611 build() {
            S2C_BattleResult_4611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleResult_4611 buildPartial() {
            S2C_BattleResult_4611 result = new S2C_BattleResult_4611(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hurt_ = this.hurt_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.countHurt_ = this.countHurt_;
               to_bitField0_ |= 4;
            }

            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
                  this.bitField0_ &= -9;
               }

               result.item_ = this.item_;
            } else {
               result.item_ = this.itemBuilder_.build();
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
            if (other instanceof S2C_BattleResult_4611) {
               return this.mergeFrom((S2C_BattleResult_4611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleResult_4611 other) {
            if (other == SevenBarbarianMsg.S2C_BattleResult_4611.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasHurt()) {
                  this.setHurt(other.getHurt());
               }

               if (other.hasCountHurt()) {
                  this.setCountHurt(other.getCountHurt());
               }

               if (this.itemBuilder_ == null) {
                  if (!other.item_.isEmpty()) {
                     if (this.item_.isEmpty()) {
                        this.item_ = other.item_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureItemIsMutable();
                        this.item_.addAll(other.item_);
                     }

                     this.onChanged();
                  }
               } else if (!other.item_.isEmpty()) {
                  if (this.itemBuilder_.isEmpty()) {
                     this.itemBuilder_.dispose();
                     this.itemBuilder_ = null;
                     this.item_ = other.item_;
                     this.bitField0_ &= -9;
                     this.itemBuilder_ = SevenBarbarianMsg.S2C_BattleResult_4611.alwaysUseFieldBuilders ? this.getItemFieldBuilder() : null;
                  } else {
                     this.itemBuilder_.addAllMessages(other.item_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasHurt()) {
               return false;
            } else if (!this.hasCountHurt()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemCount(); ++i) {
                  if (!this.getItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleResult_4611 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleResult_4611)SevenBarbarianMsg.S2C_BattleResult_4611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleResult_4611)e.getUnfinishedMessage();
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

         public boolean hasHurt() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getHurt() {
            return this.hurt_;
         }

         public Builder setHurt(long value) {
            this.bitField0_ |= 2;
            this.hurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHurt() {
            this.bitField0_ &= -3;
            this.hurt_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCountHurt() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getCountHurt() {
            return this.countHurt_;
         }

         public Builder setCountHurt(long value) {
            this.bitField0_ |= 4;
            this.countHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCountHurt() {
            this.bitField0_ &= -5;
            this.countHurt_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureItemIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.item_ = new ArrayList(this.item_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.ItemInfo> getItemList() {
            return this.itemBuilder_ == null ? Collections.unmodifiableList(this.item_) : this.itemBuilder_.getMessageList();
         }

         public int getItemCount() {
            return this.itemBuilder_ == null ? this.item_.size() : this.itemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItem(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfo)this.item_.get(index) : (CommonMsg.ItemInfo)this.itemBuilder_.getMessage(index);
         }

         public Builder setItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.set(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
               this.onChanged();
            } else {
               this.itemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Builder removeItem(int index) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.remove(index);
               this.onChanged();
            } else {
               this.itemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.item_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
            return this.itemBuilder_ != null ? this.itemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemBuilderList() {
            return this.getItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new RepeatedFieldBuilderV3(this.item_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_BarbarianInfo_4601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BarbarianInfo_4607OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FamousInfo_4603OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_RankInfo_4605OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface FamousInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasData();

      CommonMsg.PlayerInfo getData();

      CommonMsg.PlayerInfoOrBuilder getDataOrBuilder();

      boolean hasMaxHurt();

      long getMaxHurt();
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHeadId();

      int getHeadId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasMaxHurt();

      long getMaxHurt();

      boolean hasHurtSum();

      long getHurtSum();
   }

   public interface S2C_BarbarianInfo_4602OrBuilder extends MessageOrBuilder {
      boolean hasBattleTimes();

      int getBattleTimes();

      boolean hasBuyTimes();

      int getBuyTimes();

      boolean hasId();

      int getId();

      boolean hasMaxHurt();

      long getMaxHurt();
   }

   public interface S2C_BarbarianInfo_4608OrBuilder extends MessageOrBuilder {
      boolean hasBattleTimes();

      int getBattleTimes();

      boolean hasBuyTimes();

      int getBuyTimes();
   }

   public interface S2C_BattleResult_4611OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasHurt();

      long getHurt();

      boolean hasCountHurt();

      long getCountHurt();

      List<CommonMsg.ItemInfo> getItemList();

      CommonMsg.ItemInfo getItem(int index);

      int getItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index);
   }

   public interface S2C_FamousInfo_4604OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<FamousInfo> getFamousInfoList();

      FamousInfo getFamousInfo(int index);

      int getFamousInfoCount();

      List<? extends FamousInfoOrBuilder> getFamousInfoOrBuilderList();

      FamousInfoOrBuilder getFamousInfoOrBuilder(int index);
   }

   public interface S2C_RankInfo_4606OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasMyInfo();

      RankInfo getMyInfo();

      RankInfoOrBuilder getMyInfoOrBuilder();

      List<RankInfo> getRankInfoList();

      RankInfo getRankInfo(int index);

      int getRankInfoCount();

      List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList();

      RankInfoOrBuilder getRankInfoOrBuilder(int index);
   }

   public interface S2S_BattleInfo_4609OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();

      boolean hasLv();

      int getLv();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasHeadId();

      int getHeadId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasUnionId();

      int getUnionId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasVipLev();

      int getVipLev();

      boolean hasArraying();

      ByteString getArraying();

      boolean hasHurt();

      long getHurt();

      boolean hasCity();

      String getCity();

      ByteString getCityBytes();

      boolean hasProvince();

      String getProvince();

      ByteString getProvinceBytes();

      boolean hasStepId();

      int getStepId();

      boolean hasId();

      int getId();

      List<CommonMsg.ItemInfo> getItemList();

      CommonMsg.ItemInfo getItem(int index);

      int getItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index);

      boolean hasSecondTitle();

      int getSecondTitle();
   }

   public interface S2S_SendMail_4610OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasCountHurt();

      long getCountHurt();
   }
}
