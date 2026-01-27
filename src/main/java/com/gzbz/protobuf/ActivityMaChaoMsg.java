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

public final class ActivityMaChaoMsg {
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityMaChaoMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014ActivityMaChao.proto\u0012 activityMaChao.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0019\n\u0017C2S_HeroThemeInfo_20201\"Ë\u0001\n\u0017S2C_HeroThemeInfo_20202\u0012\r\n\u0005fight\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bfightReward\u0018\u0003 \u0003(\u0005\u0012\u0012\n\ntotalPoint\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0005 \u0003(\u0005\u0012\u0011\n\tstartTime\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0007 \u0002(\u0005\u0012\u0015\n\rserverOpenDay\u0018\b \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\t \u0002(\u0005\"\u0010\n\u000eC2S_Mate_20203\"\u0081\u0001\n\u000eS2C_Mate_20204\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012,\n\barraying\u0018\u0002 \u0002(\u000b2\u001a.common.PlayerArrayingInfo\u0012\u0011\n\tmonarchId\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0006 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0007 \u0002(\u0005\"#\n\u0015C2S_PointReward_20207\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0015S2C_PointReward_20208\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_MatchBattle_20211\"b\n\u0015S2C_MatchBattle_20212\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0004 \u0002(\u0003\u0012\u0012\n\ntotalPoint\u0018\u0005 \u0002(\u0005\"J\n\u0014S2C_TaskModify_20216\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0014\n\u0012C2S_LootInfo_20221\"a\n\u0012S2C_LootInfo_20222\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fdailyDrawNum\u0018\u0004 \u0002(\u0005\"#\n\u0014C2S_LootReward_20223\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"d\n\u0014S2C_LootReward_20224\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadEnjoy\u0018\u0003 \u0002(\b\u0012\u0014\n\fdailyDrawNum\u0018\u0004 \u0002(\u0005\"!\n\u0013C2S_LootEnjoy_20225\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_20226\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005B(\n\u0011com.gzbz.protobufB\u0011ActivityMaChaoMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor, new String[0]);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor, new String[]{"Fight", "TotalDamage", "FightReward", "TotalPoint", "PointReward", "StartTime", "EndTime", "ServerOpenDay", "ActivityDay"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor, new String[0]);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor, new String[]{"Power", "Arraying", "MonarchId", "PlayerName", "Sex"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor, new String[]{"Id"});
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor, new String[]{"Id"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor, new String[0]);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor, new String[]{"Damage", "FightNum", "TotalDamage", "TotalPoint"});
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor, new String[]{"Task"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor, new String[0]);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor, new String[]{"EnjoyId", "RewardId", "CurLootNum", "DailyDrawNum"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor, new String[]{"Num"});
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor, new String[]{"RewardId", "CurLootNum", "HadEnjoy", "DailyDrawNum"});
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor, new String[]{"Id"});
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor, new String[]{"Id"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_HeroThemeInfo_20201 extends GeneratedMessageV3 implements C2S_HeroThemeInfo_20201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroThemeInfo_20201 DEFAULT_INSTANCE = new C2S_HeroThemeInfo_20201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroThemeInfo_20201> PARSER = new AbstractParser<C2S_HeroThemeInfo_20201>() {
         public C2S_HeroThemeInfo_20201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroThemeInfo_20201(input, extensionRegistry);
         }
      };

      private C2S_HeroThemeInfo_20201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroThemeInfo_20201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroThemeInfo_20201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroThemeInfo_20201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_20201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroThemeInfo_20201)) {
            return super.equals(obj);
         } else {
            C2S_HeroThemeInfo_20201 other = (C2S_HeroThemeInfo_20201)obj;
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

      public static C2S_HeroThemeInfo_20201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroThemeInfo_20201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroThemeInfo_20201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroThemeInfo_20201> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroThemeInfo_20201> getParserForType() {
         return PARSER;
      }

      public C2S_HeroThemeInfo_20201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroThemeInfo_20201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_20201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_HeroThemeInfo_20201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_HeroThemeInfo_20201_descriptor;
         }

         public C2S_HeroThemeInfo_20201 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_HeroThemeInfo_20201.getDefaultInstance();
         }

         public C2S_HeroThemeInfo_20201 build() {
            C2S_HeroThemeInfo_20201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroThemeInfo_20201 buildPartial() {
            C2S_HeroThemeInfo_20201 result = new C2S_HeroThemeInfo_20201(this);
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
            if (other instanceof C2S_HeroThemeInfo_20201) {
               return this.mergeFrom((C2S_HeroThemeInfo_20201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroThemeInfo_20201 other) {
            if (other == ActivityMaChaoMsg.C2S_HeroThemeInfo_20201.getDefaultInstance()) {
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
            C2S_HeroThemeInfo_20201 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroThemeInfo_20201)ActivityMaChaoMsg.C2S_HeroThemeInfo_20201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroThemeInfo_20201)e.getUnfinishedMessage();
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

   public static final class S2C_HeroThemeInfo_20202 extends GeneratedMessageV3 implements S2C_HeroThemeInfo_20202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHT_FIELD_NUMBER = 1;
      private int fight_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 2;
      private long totalDamage_;
      public static final int FIGHTREWARD_FIELD_NUMBER = 3;
      private Internal.IntList fightReward_;
      public static final int TOTALPOINT_FIELD_NUMBER = 4;
      private int totalPoint_;
      public static final int POINTREWARD_FIELD_NUMBER = 5;
      private Internal.IntList pointReward_;
      public static final int STARTTIME_FIELD_NUMBER = 6;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 7;
      private int endTime_;
      public static final int SERVEROPENDAY_FIELD_NUMBER = 8;
      private int serverOpenDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 9;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroThemeInfo_20202 DEFAULT_INSTANCE = new S2C_HeroThemeInfo_20202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroThemeInfo_20202> PARSER = new AbstractParser<S2C_HeroThemeInfo_20202>() {
         public S2C_HeroThemeInfo_20202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroThemeInfo_20202(input, extensionRegistry);
         }
      };

      private S2C_HeroThemeInfo_20202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroThemeInfo_20202() {
         this.memoizedIsInitialized = -1;
         this.fightReward_ = emptyIntList();
         this.pointReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroThemeInfo_20202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroThemeInfo_20202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fight_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalDamage_ = input.readInt64();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.fightReward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalPoint_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pointReward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.endTime_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.serverOpenDay_ = input.readInt32();
                        continue;
                     case 72:
                        this.bitField0_ |= 64;
                        this.activityDay_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.fightReward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.fightReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.pointReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_20202.class, Builder.class);
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFight() {
         return this.fight_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public List<Integer> getFightRewardList() {
         return this.fightReward_;
      }

      public int getFightRewardCount() {
         return this.fightReward_.size();
      }

      public int getFightReward(int index) {
         return this.fightReward_.getInt(index);
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
      }

      public List<Integer> getPointRewardList() {
         return this.pointReward_;
      }

      public int getPointRewardCount() {
         return this.pointReward_.size();
      }

      public int getPointReward(int index) {
         return this.pointReward_.getInt(index);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasServerOpenDay() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getServerOpenDay() {
         return this.serverOpenDay_;
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerOpenDay()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.fight_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.totalDamage_);
         }

         for(int i = 0; i < this.fightReward_.size(); ++i) {
            output.writeInt32(3, this.fightReward_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.totalPoint_);
         }

         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(5, this.pointReward_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.endTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.serverOpenDay_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.activityDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fight_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.totalDamage_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.fightReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.fightReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFightRewardList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalPoint_);
            }

            dataSize = 0;

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.endTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverOpenDay_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.activityDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroThemeInfo_20202)) {
            return super.equals(obj);
         } else {
            S2C_HeroThemeInfo_20202 other = (S2C_HeroThemeInfo_20202)obj;
            if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (!this.getFightRewardList().equals(other.getFightRewardList())) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
               return false;
            } else if (!this.getPointRewardList().equals(other.getPointRewardList())) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasServerOpenDay() != other.hasServerOpenDay()) {
               return false;
            } else if (this.hasServerOpenDay() && this.getServerOpenDay() != other.getServerOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
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
            if (this.hasFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.getFightRewardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightRewardList().hashCode();
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalPoint();
            }

            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasServerOpenDay()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerOpenDay();
            }

            if (this.hasActivityDay()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getActivityDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroThemeInfo_20202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroThemeInfo_20202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroThemeInfo_20202> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroThemeInfo_20202> getParserForType() {
         return PARSER;
      }

      public S2C_HeroThemeInfo_20202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroThemeInfo_20202OrBuilder {
         private int bitField0_;
         private int fight_;
         private long totalDamage_;
         private Internal.IntList fightReward_;
         private int totalPoint_;
         private Internal.IntList pointReward_;
         private int startTime_;
         private int endTime_;
         private int serverOpenDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_20202.class, Builder.class);
         }

         private Builder() {
            this.fightReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.pointReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.pointReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fight_ = 0;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.fightReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            this.pointReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.bitField0_ &= -17;
            this.startTime_ = 0;
            this.bitField0_ &= -33;
            this.endTime_ = 0;
            this.bitField0_ &= -65;
            this.serverOpenDay_ = 0;
            this.bitField0_ &= -129;
            this.activityDay_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_HeroThemeInfo_20202_descriptor;
         }

         public S2C_HeroThemeInfo_20202 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.getDefaultInstance();
         }

         public S2C_HeroThemeInfo_20202 build() {
            S2C_HeroThemeInfo_20202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroThemeInfo_20202 buildPartial() {
            S2C_HeroThemeInfo_20202 result = new S2C_HeroThemeInfo_20202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.fightReward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.fightReward_ = this.fightReward_;
            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.pointReward_ = this.pointReward_;
            if ((from_bitField0_ & 32) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverOpenDay_ = this.serverOpenDay_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.activityDay_ = this.activityDay_;
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
            if (other instanceof S2C_HeroThemeInfo_20202) {
               return this.mergeFrom((S2C_HeroThemeInfo_20202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroThemeInfo_20202 other) {
            if (other == ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (!other.fightReward_.isEmpty()) {
                  if (this.fightReward_.isEmpty()) {
                     this.fightReward_ = other.fightReward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureFightRewardIsMutable();
                     this.fightReward_.addAll(other.fightReward_);
                  }

                  this.onChanged();
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
                  }

                  this.onChanged();
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasServerOpenDay()) {
                  this.setServerOpenDay(other.getServerOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFight()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else if (!this.hasTotalPoint()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasServerOpenDay()) {
               return false;
            } else {
               return this.hasActivityDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroThemeInfo_20202 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroThemeInfo_20202)ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroThemeInfo_20202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFight() {
            return this.fight_;
         }

         public Builder setFight(int value) {
            this.bitField0_ |= 1;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -2;
            this.fight_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 2;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureFightRewardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.fightReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.mutableCopy(this.fightReward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getFightRewardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.fightReward_) : this.fightReward_);
         }

         public int getFightRewardCount() {
            return this.fightReward_.size();
         }

         public int getFightReward(int index) {
            return this.fightReward_.getInt(index);
         }

         public Builder setFightReward(int index, int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFightReward(int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFightReward(Iterable<? extends Integer> values) {
            this.ensureFightRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fightReward_);
            this.onChanged();
            return this;
         }

         public Builder clearFightReward() {
            this.fightReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.pointReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.mutableCopy(this.pointReward_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
         }

         public int getPointRewardCount() {
            return this.pointReward_.size();
         }

         public int getPointReward(int index) {
            return this.pointReward_.getInt(index);
         }

         public Builder setPointReward(int index, int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPointReward(int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPointReward(Iterable<? extends Integer> values) {
            this.ensurePointRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pointReward_);
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.pointReward_ = ActivityMaChaoMsg.S2C_HeroThemeInfo_20202.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 32;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -33;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 64;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -65;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerOpenDay() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerOpenDay() {
            return this.serverOpenDay_;
         }

         public Builder setServerOpenDay(int value) {
            this.bitField0_ |= 128;
            this.serverOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerOpenDay() {
            this.bitField0_ &= -129;
            this.serverOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 256;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -257;
            this.activityDay_ = 0;
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

   public static final class C2S_Mate_20203 extends GeneratedMessageV3 implements C2S_Mate_20203OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Mate_20203 DEFAULT_INSTANCE = new C2S_Mate_20203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Mate_20203> PARSER = new AbstractParser<C2S_Mate_20203>() {
         public C2S_Mate_20203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Mate_20203(input, extensionRegistry);
         }
      };

      private C2S_Mate_20203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Mate_20203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Mate_20203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Mate_20203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_20203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Mate_20203)) {
            return super.equals(obj);
         } else {
            C2S_Mate_20203 other = (C2S_Mate_20203)obj;
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

      public static C2S_Mate_20203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20203 parseFrom(InputStream input) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_20203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_20203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Mate_20203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_20203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_20203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Mate_20203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Mate_20203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Mate_20203> parser() {
         return PARSER;
      }

      public Parser<C2S_Mate_20203> getParserForType() {
         return PARSER;
      }

      public C2S_Mate_20203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Mate_20203OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_20203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_Mate_20203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_Mate_20203_descriptor;
         }

         public C2S_Mate_20203 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_Mate_20203.getDefaultInstance();
         }

         public C2S_Mate_20203 build() {
            C2S_Mate_20203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Mate_20203 buildPartial() {
            C2S_Mate_20203 result = new C2S_Mate_20203(this);
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
            if (other instanceof C2S_Mate_20203) {
               return this.mergeFrom((C2S_Mate_20203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Mate_20203 other) {
            if (other == ActivityMaChaoMsg.C2S_Mate_20203.getDefaultInstance()) {
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
            C2S_Mate_20203 parsedMessage = null;

            try {
               parsedMessage = (C2S_Mate_20203)ActivityMaChaoMsg.C2S_Mate_20203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Mate_20203)e.getUnfinishedMessage();
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

   public static final class S2C_Mate_20204 extends GeneratedMessageV3 implements S2C_Mate_20204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private CommonMsg.PlayerArrayingInfo arraying_;
      public static final int MONARCHID_FIELD_NUMBER = 5;
      private int monarchId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 6;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 7;
      private int sex_;
      private byte memoizedIsInitialized;
      private static final S2C_Mate_20204 DEFAULT_INSTANCE = new S2C_Mate_20204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Mate_20204> PARSER = new AbstractParser<S2C_Mate_20204>() {
         public S2C_Mate_20204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Mate_20204(input, extensionRegistry);
         }
      };

      private S2C_Mate_20204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Mate_20204() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Mate_20204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Mate_20204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.power_ = input.readInt64();
                        break;
                     case 18:
                        CommonMsg.PlayerArrayingInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.arraying_.toBuilder();
                        }

                        this.arraying_ = (CommonMsg.PlayerArrayingInfo)input.readMessage(CommonMsg.PlayerArrayingInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.arraying_);
                           this.arraying_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.sex_ = input.readInt32();
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_20204.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerArrayingInfo getArraying() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
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

      public boolean hasSex() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMonarchId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getArraying().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getArraying());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.monarchId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.sex_);
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
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getArraying());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.monarchId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.sex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Mate_20204)) {
            return super.equals(obj);
         } else {
            S2C_Mate_20204 other = (S2C_Mate_20204)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
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
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Mate_20204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20204 parseFrom(InputStream input) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_20204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_20204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Mate_20204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_20204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_20204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Mate_20204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Mate_20204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Mate_20204> parser() {
         return PARSER;
      }

      public Parser<S2C_Mate_20204> getParserForType() {
         return PARSER;
      }

      public S2C_Mate_20204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Mate_20204OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PlayerArrayingInfo arraying_;
         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> arrayingBuilder_;
         private int monarchId_;
         private Object playerName_;
         private int sex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_20204.class, Builder.class);
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
            if (ActivityMaChaoMsg.S2C_Mate_20204.alwaysUseFieldBuilders) {
               this.getArrayingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.monarchId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_Mate_20204_descriptor;
         }

         public S2C_Mate_20204 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_Mate_20204.getDefaultInstance();
         }

         public S2C_Mate_20204 build() {
            S2C_Mate_20204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Mate_20204 buildPartial() {
            S2C_Mate_20204 result = new S2C_Mate_20204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.arrayingBuilder_ == null) {
                  result.arraying_ = this.arraying_;
               } else {
                  result.arraying_ = (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.sex_ = this.sex_;
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
            if (other instanceof S2C_Mate_20204) {
               return this.mergeFrom((S2C_Mate_20204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Mate_20204 other) {
            if (other == ActivityMaChaoMsg.S2C_Mate_20204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasArraying()) {
                  this.mergeArraying(other.getArraying());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPower()) {
               return false;
            } else if (!this.hasArraying()) {
               return false;
            } else if (!this.hasMonarchId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasSex()) {
               return false;
            } else {
               return this.getArraying().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Mate_20204 parsedMessage = null;

            try {
               parsedMessage = (S2C_Mate_20204)ActivityMaChaoMsg.S2C_Mate_20204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Mate_20204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerArrayingInfo getArraying() {
            if (this.arrayingBuilder_ == null) {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            } else {
               return (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.getMessage();
            }
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.arraying_ = value;
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = builderForValue.build();
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.arraying_ != null && this.arraying_ != CommonMsg.PlayerArrayingInfo.getDefaultInstance()) {
                  this.arraying_ = CommonMsg.PlayerArrayingInfo.newBuilder(this.arraying_).mergeFrom(value).buildPartial();
               } else {
                  this.arraying_ = value;
               }

               this.onChanged();
            } else {
               this.arrayingBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearArraying() {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
               this.onChanged();
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerArrayingInfo.Builder getArrayingBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerArrayingInfo.Builder)this.getArrayingFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
            if (this.arrayingBuilder_ != null) {
               return (CommonMsg.PlayerArrayingInfoOrBuilder)this.arrayingBuilder_.getMessageOrBuilder();
            } else {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> getArrayingFieldBuilder() {
            if (this.arrayingBuilder_ == null) {
               this.arrayingBuilder_ = new SingleFieldBuilderV3(this.getArraying(), this.getParentForChildren(), this.isClean());
               this.arraying_ = null;
            }

            return this.arrayingBuilder_;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 4;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -5;
            this.monarchId_ = 0;
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
            this.playerName_ = ActivityMaChaoMsg.S2C_Mate_20204.getDefaultInstance().getPlayerName();
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

         public boolean hasSex() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 16;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -17;
            this.sex_ = 0;
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

   public static final class C2S_PointReward_20207 extends GeneratedMessageV3 implements C2S_PointReward_20207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PointReward_20207 DEFAULT_INSTANCE = new C2S_PointReward_20207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointReward_20207> PARSER = new AbstractParser<C2S_PointReward_20207>() {
         public C2S_PointReward_20207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointReward_20207(input, extensionRegistry);
         }
      };

      private C2S_PointReward_20207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointReward_20207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointReward_20207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointReward_20207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_20207.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointReward_20207)) {
            return super.equals(obj);
         } else {
            C2S_PointReward_20207 other = (C2S_PointReward_20207)obj;
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

      public static C2S_PointReward_20207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20207 parseFrom(InputStream input) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_20207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_20207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointReward_20207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointReward_20207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointReward_20207> parser() {
         return PARSER;
      }

      public Parser<C2S_PointReward_20207> getParserForType() {
         return PARSER;
      }

      public C2S_PointReward_20207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointReward_20207OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_20207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_PointReward_20207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_PointReward_20207_descriptor;
         }

         public C2S_PointReward_20207 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_PointReward_20207.getDefaultInstance();
         }

         public C2S_PointReward_20207 build() {
            C2S_PointReward_20207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointReward_20207 buildPartial() {
            C2S_PointReward_20207 result = new C2S_PointReward_20207(this);
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
            if (other instanceof C2S_PointReward_20207) {
               return this.mergeFrom((C2S_PointReward_20207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointReward_20207 other) {
            if (other == ActivityMaChaoMsg.C2S_PointReward_20207.getDefaultInstance()) {
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
            C2S_PointReward_20207 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointReward_20207)ActivityMaChaoMsg.C2S_PointReward_20207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointReward_20207)e.getUnfinishedMessage();
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

   public static final class S2C_PointReward_20208 extends GeneratedMessageV3 implements S2C_PointReward_20208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PointReward_20208 DEFAULT_INSTANCE = new S2C_PointReward_20208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointReward_20208> PARSER = new AbstractParser<S2C_PointReward_20208>() {
         public S2C_PointReward_20208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointReward_20208(input, extensionRegistry);
         }
      };

      private S2C_PointReward_20208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointReward_20208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointReward_20208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointReward_20208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_20208.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PointReward_20208)) {
            return super.equals(obj);
         } else {
            S2C_PointReward_20208 other = (S2C_PointReward_20208)obj;
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

      public static S2C_PointReward_20208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20208 parseFrom(InputStream input) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_20208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_20208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointReward_20208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointReward_20208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointReward_20208> parser() {
         return PARSER;
      }

      public Parser<S2C_PointReward_20208> getParserForType() {
         return PARSER;
      }

      public S2C_PointReward_20208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointReward_20208OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_20208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_PointReward_20208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_PointReward_20208_descriptor;
         }

         public S2C_PointReward_20208 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_PointReward_20208.getDefaultInstance();
         }

         public S2C_PointReward_20208 build() {
            S2C_PointReward_20208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointReward_20208 buildPartial() {
            S2C_PointReward_20208 result = new S2C_PointReward_20208(this);
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
            if (other instanceof S2C_PointReward_20208) {
               return this.mergeFrom((S2C_PointReward_20208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointReward_20208 other) {
            if (other == ActivityMaChaoMsg.S2C_PointReward_20208.getDefaultInstance()) {
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
            S2C_PointReward_20208 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointReward_20208)ActivityMaChaoMsg.S2C_PointReward_20208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointReward_20208)e.getUnfinishedMessage();
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

   public static final class C2S_MatchBattle_20211 extends GeneratedMessageV3 implements C2S_MatchBattle_20211OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MatchBattle_20211 DEFAULT_INSTANCE = new C2S_MatchBattle_20211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchBattle_20211> PARSER = new AbstractParser<C2S_MatchBattle_20211>() {
         public C2S_MatchBattle_20211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchBattle_20211(input, extensionRegistry);
         }
      };

      private C2S_MatchBattle_20211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchBattle_20211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchBattle_20211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchBattle_20211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_20211.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchBattle_20211)) {
            return super.equals(obj);
         } else {
            C2S_MatchBattle_20211 other = (C2S_MatchBattle_20211)obj;
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

      public static C2S_MatchBattle_20211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20211 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_20211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_20211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchBattle_20211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchBattle_20211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchBattle_20211> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchBattle_20211> getParserForType() {
         return PARSER;
      }

      public C2S_MatchBattle_20211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchBattle_20211OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_20211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_MatchBattle_20211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_MatchBattle_20211_descriptor;
         }

         public C2S_MatchBattle_20211 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_MatchBattle_20211.getDefaultInstance();
         }

         public C2S_MatchBattle_20211 build() {
            C2S_MatchBattle_20211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchBattle_20211 buildPartial() {
            C2S_MatchBattle_20211 result = new C2S_MatchBattle_20211(this);
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
            if (other instanceof C2S_MatchBattle_20211) {
               return this.mergeFrom((C2S_MatchBattle_20211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchBattle_20211 other) {
            if (other == ActivityMaChaoMsg.C2S_MatchBattle_20211.getDefaultInstance()) {
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
            C2S_MatchBattle_20211 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchBattle_20211)ActivityMaChaoMsg.C2S_MatchBattle_20211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchBattle_20211)e.getUnfinishedMessage();
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

   public static final class S2C_MatchBattle_20212 extends GeneratedMessageV3 implements S2C_MatchBattle_20212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAMAGE_FIELD_NUMBER = 2;
      private long damage_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 4;
      private long totalDamage_;
      public static final int TOTALPOINT_FIELD_NUMBER = 5;
      private int totalPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_MatchBattle_20212 DEFAULT_INSTANCE = new S2C_MatchBattle_20212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchBattle_20212> PARSER = new AbstractParser<S2C_MatchBattle_20212>() {
         public S2C_MatchBattle_20212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchBattle_20212(input, extensionRegistry);
         }
      };

      private S2C_MatchBattle_20212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchBattle_20212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchBattle_20212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchBattle_20212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.damage_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalDamage_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.totalPoint_ = input.readInt32();
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_20212.class, Builder.class);
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.damage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.totalDamage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.totalPoint_);
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
               size += CodedOutputStream.computeInt64Size(2, this.damage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.totalDamage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.totalPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MatchBattle_20212)) {
            return super.equals(obj);
         } else {
            S2C_MatchBattle_20212 other = (S2C_MatchBattle_20212)obj;
            if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
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
            if (this.hasDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTotalPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MatchBattle_20212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20212 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_20212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_20212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchBattle_20212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchBattle_20212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchBattle_20212> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchBattle_20212> getParserForType() {
         return PARSER;
      }

      public S2C_MatchBattle_20212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchBattle_20212OrBuilder {
         private int bitField0_;
         private long damage_;
         private int fightNum_;
         private long totalDamage_;
         private int totalPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_20212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_MatchBattle_20212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.damage_ = 0L;
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_MatchBattle_20212_descriptor;
         }

         public S2C_MatchBattle_20212 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_MatchBattle_20212.getDefaultInstance();
         }

         public S2C_MatchBattle_20212 build() {
            S2C_MatchBattle_20212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchBattle_20212 buildPartial() {
            S2C_MatchBattle_20212 result = new S2C_MatchBattle_20212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
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
            if (other instanceof S2C_MatchBattle_20212) {
               return this.mergeFrom((S2C_MatchBattle_20212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchBattle_20212 other) {
            if (other == ActivityMaChaoMsg.S2C_MatchBattle_20212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDamage()) {
               return false;
            } else if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else {
               return this.hasTotalPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MatchBattle_20212 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchBattle_20212)ActivityMaChaoMsg.S2C_MatchBattle_20212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchBattle_20212)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 1;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -2;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 2;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 4;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -5;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
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

   public static final class S2C_TaskModify_20216 extends GeneratedMessageV3 implements S2C_TaskModify_20216OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskModify_20216 DEFAULT_INSTANCE = new S2C_TaskModify_20216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskModify_20216> PARSER = new AbstractParser<S2C_TaskModify_20216>() {
         public S2C_TaskModify_20216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskModify_20216(input, extensionRegistry);
         }
      };

      private S2C_TaskModify_20216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskModify_20216() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskModify_20216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskModify_20216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_20216.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskModify_20216)) {
            return super.equals(obj);
         } else {
            S2C_TaskModify_20216 other = (S2C_TaskModify_20216)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskModify_20216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_20216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_20216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_20216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_20216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_20216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_20216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_20216 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_20216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_20216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_20216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_20216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_20216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_20216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskModify_20216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskModify_20216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskModify_20216> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskModify_20216> getParserForType() {
         return PARSER;
      }

      public S2C_TaskModify_20216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskModify_20216OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_20216.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_TaskModify_20216.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_TaskModify_20216_descriptor;
         }

         public S2C_TaskModify_20216 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_TaskModify_20216.getDefaultInstance();
         }

         public S2C_TaskModify_20216 build() {
            S2C_TaskModify_20216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskModify_20216 buildPartial() {
            S2C_TaskModify_20216 result = new S2C_TaskModify_20216(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_TaskModify_20216) {
               return this.mergeFrom((S2C_TaskModify_20216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskModify_20216 other) {
            if (other == ActivityMaChaoMsg.S2C_TaskModify_20216.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = ActivityMaChaoMsg.S2C_TaskModify_20216.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskModify_20216 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskModify_20216)ActivityMaChaoMsg.S2C_TaskModify_20216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskModify_20216)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LootInfo_20221 extends GeneratedMessageV3 implements C2S_LootInfo_20221OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_20221 DEFAULT_INSTANCE = new C2S_LootInfo_20221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_20221> PARSER = new AbstractParser<C2S_LootInfo_20221>() {
         public C2S_LootInfo_20221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_20221(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_20221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_20221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_20221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_20221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20221.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_20221)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_20221 other = (C2S_LootInfo_20221)obj;
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

      public static C2S_LootInfo_20221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20221 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_20221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_20221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_20221> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_20221> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_20221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_20221OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_LootInfo_20221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootInfo_20221_descriptor;
         }

         public C2S_LootInfo_20221 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_LootInfo_20221.getDefaultInstance();
         }

         public C2S_LootInfo_20221 build() {
            C2S_LootInfo_20221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_20221 buildPartial() {
            C2S_LootInfo_20221 result = new C2S_LootInfo_20221(this);
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
            if (other instanceof C2S_LootInfo_20221) {
               return this.mergeFrom((C2S_LootInfo_20221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_20221 other) {
            if (other == ActivityMaChaoMsg.C2S_LootInfo_20221.getDefaultInstance()) {
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
            C2S_LootInfo_20221 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_20221)ActivityMaChaoMsg.C2S_LootInfo_20221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_20221)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_20222 extends GeneratedMessageV3 implements S2C_LootInfo_20222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOYID_FIELD_NUMBER = 1;
      private int enjoyId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 4;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootInfo_20222 DEFAULT_INSTANCE = new S2C_LootInfo_20222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_20222> PARSER = new AbstractParser<S2C_LootInfo_20222>() {
         public S2C_LootInfo_20222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_20222(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_20222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_20222() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_20222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_20222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.enjoyId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.curLootNum_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.dailyDrawNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20222.class, Builder.class);
      }

      public boolean hasEnjoyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnjoyId() {
         return this.enjoyId_;
      }

      public List<Integer> getRewardIdList() {
         return this.rewardId_;
      }

      public int getRewardIdCount() {
         return this.rewardId_.size();
      }

      public int getRewardId(int index) {
         return this.rewardId_.getInt(index);
      }

      public boolean hasCurLootNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurLootNum() {
         return this.curLootNum_;
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasEnjoyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurLootNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enjoyId_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(2, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.curLootNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.dailyDrawNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enjoyId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.curLootNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootInfo_20222)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_20222 other = (S2C_LootInfo_20222)obj;
            if (this.hasEnjoyId() != other.hasEnjoyId()) {
               return false;
            } else if (this.hasEnjoyId() && this.getEnjoyId() != other.getEnjoyId()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasCurLootNum() != other.hasCurLootNum()) {
               return false;
            } else if (this.hasCurLootNum() && this.getCurLootNum() != other.getCurLootNum()) {
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
            if (this.hasEnjoyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnjoyId();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasCurLootNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCurLootNum();
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootInfo_20222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20222 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_20222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_20222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_20222> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_20222> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_20222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_20222OrBuilder {
         private int bitField0_;
         private int enjoyId_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20222.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootInfo_20222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootInfo_20222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_LootInfo_20222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootInfo_20222.emptyIntList();
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootInfo_20222_descriptor;
         }

         public S2C_LootInfo_20222 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_LootInfo_20222.getDefaultInstance();
         }

         public S2C_LootInfo_20222 build() {
            S2C_LootInfo_20222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_20222 buildPartial() {
            S2C_LootInfo_20222 result = new S2C_LootInfo_20222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enjoyId_ = this.enjoyId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 4) != 0) {
               result.curLootNum_ = this.curLootNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_LootInfo_20222) {
               return this.mergeFrom((S2C_LootInfo_20222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_20222 other) {
            if (other == ActivityMaChaoMsg.S2C_LootInfo_20222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnjoyId()) {
                  this.setEnjoyId(other.getEnjoyId());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasCurLootNum()) {
                  this.setCurLootNum(other.getCurLootNum());
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
            if (!this.hasEnjoyId()) {
               return false;
            } else if (!this.hasCurLootNum()) {
               return false;
            } else {
               return this.hasDailyDrawNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootInfo_20222 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_20222)ActivityMaChaoMsg.S2C_LootInfo_20222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_20222)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnjoyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnjoyId() {
            return this.enjoyId_;
         }

         public Builder setEnjoyId(int value) {
            this.bitField0_ |= 1;
            this.enjoyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoyId() {
            this.bitField0_ &= -2;
            this.enjoyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardId_ = ActivityMaChaoMsg.S2C_LootInfo_20222.mutableCopy(this.rewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
         }

         public int getRewardIdCount() {
            return this.rewardId_.size();
         }

         public int getRewardId(int index) {
            return this.rewardId_.getInt(index);
         }

         public Builder setRewardId(int index, int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardId(int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardId(Iterable<? extends Integer> values) {
            this.ensureRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootInfo_20222.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasCurLootNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCurLootNum() {
            return this.curLootNum_;
         }

         public Builder setCurLootNum(int value) {
            this.bitField0_ |= 4;
            this.curLootNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurLootNum() {
            this.bitField0_ &= -5;
            this.curLootNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 8;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -9;
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

   public static final class C2S_LootReward_20223 extends GeneratedMessageV3 implements C2S_LootReward_20223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_20223 DEFAULT_INSTANCE = new C2S_LootReward_20223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_20223> PARSER = new AbstractParser<C2S_LootReward_20223>() {
         public C2S_LootReward_20223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_20223(input, extensionRegistry);
         }
      };

      private C2S_LootReward_20223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_20223() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_20223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_20223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20223.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_20223)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_20223 other = (C2S_LootReward_20223)obj;
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

      public static C2S_LootReward_20223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20223 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_20223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_20223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_20223> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_20223> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_20223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_20223OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20223.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_LootReward_20223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootReward_20223_descriptor;
         }

         public C2S_LootReward_20223 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_LootReward_20223.getDefaultInstance();
         }

         public C2S_LootReward_20223 build() {
            C2S_LootReward_20223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_20223 buildPartial() {
            C2S_LootReward_20223 result = new C2S_LootReward_20223(this);
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
            if (other instanceof C2S_LootReward_20223) {
               return this.mergeFrom((C2S_LootReward_20223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_20223 other) {
            if (other == ActivityMaChaoMsg.C2S_LootReward_20223.getDefaultInstance()) {
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
            C2S_LootReward_20223 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_20223)ActivityMaChaoMsg.C2S_LootReward_20223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_20223)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_20224 extends GeneratedMessageV3 implements S2C_LootReward_20224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 2;
      private int curLootNum_;
      public static final int HADENJOY_FIELD_NUMBER = 3;
      private boolean hadEnjoy_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 4;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_20224 DEFAULT_INSTANCE = new S2C_LootReward_20224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_20224> PARSER = new AbstractParser<S2C_LootReward_20224>() {
         public S2C_LootReward_20224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_20224(input, extensionRegistry);
         }
      };

      private S2C_LootReward_20224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_20224() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_20224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_20224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.curLootNum_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.hadEnjoy_ = input.readBool();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.dailyDrawNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20224.class, Builder.class);
      }

      public List<Integer> getRewardIdList() {
         return this.rewardId_;
      }

      public int getRewardIdCount() {
         return this.rewardId_.size();
      }

      public int getRewardId(int index) {
         return this.rewardId_.getInt(index);
      }

      public boolean hasCurLootNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurLootNum() {
         return this.curLootNum_;
      }

      public boolean hasHadEnjoy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getHadEnjoy() {
         return this.hadEnjoy_;
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCurLootNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHadEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(1, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.curLootNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.hadEnjoy_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.dailyDrawNum_);
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

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.curLootNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.hadEnjoy_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootReward_20224)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_20224 other = (S2C_LootReward_20224)obj;
            if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasCurLootNum() != other.hasCurLootNum()) {
               return false;
            } else if (this.hasCurLootNum() && this.getCurLootNum() != other.getCurLootNum()) {
               return false;
            } else if (this.hasHadEnjoy() != other.hasHadEnjoy()) {
               return false;
            } else if (this.hasHadEnjoy() && this.getHadEnjoy() != other.getHadEnjoy()) {
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
            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasCurLootNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurLootNum();
            }

            if (this.hasHadEnjoy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getHadEnjoy());
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootReward_20224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20224 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_20224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_20224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_20224> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_20224> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_20224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_20224OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private boolean hadEnjoy_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20224.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootReward_20224.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootReward_20224.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_LootReward_20224.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootReward_20224.emptyIntList();
            this.bitField0_ &= -2;
            this.curLootNum_ = 0;
            this.bitField0_ &= -3;
            this.hadEnjoy_ = false;
            this.bitField0_ &= -5;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootReward_20224_descriptor;
         }

         public S2C_LootReward_20224 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_LootReward_20224.getDefaultInstance();
         }

         public S2C_LootReward_20224 build() {
            S2C_LootReward_20224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_20224 buildPartial() {
            S2C_LootReward_20224 result = new S2C_LootReward_20224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 2) != 0) {
               result.curLootNum_ = this.curLootNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hadEnjoy_ = this.hadEnjoy_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_LootReward_20224) {
               return this.mergeFrom((S2C_LootReward_20224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_20224 other) {
            if (other == ActivityMaChaoMsg.S2C_LootReward_20224.getDefaultInstance()) {
               return this;
            } else {
               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasCurLootNum()) {
                  this.setCurLootNum(other.getCurLootNum());
               }

               if (other.hasHadEnjoy()) {
                  this.setHadEnjoy(other.getHadEnjoy());
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
            if (!this.hasCurLootNum()) {
               return false;
            } else if (!this.hasHadEnjoy()) {
               return false;
            } else {
               return this.hasDailyDrawNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootReward_20224 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_20224)ActivityMaChaoMsg.S2C_LootReward_20224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_20224)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewardId_ = ActivityMaChaoMsg.S2C_LootReward_20224.mutableCopy(this.rewardId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
         }

         public int getRewardIdCount() {
            return this.rewardId_.size();
         }

         public int getRewardId(int index) {
            return this.rewardId_.getInt(index);
         }

         public Builder setRewardId(int index, int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardId(int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardId(Iterable<? extends Integer> values) {
            this.ensureRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.rewardId_ = ActivityMaChaoMsg.S2C_LootReward_20224.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasCurLootNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCurLootNum() {
            return this.curLootNum_;
         }

         public Builder setCurLootNum(int value) {
            this.bitField0_ |= 2;
            this.curLootNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurLootNum() {
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHadEnjoy() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getHadEnjoy() {
            return this.hadEnjoy_;
         }

         public Builder setHadEnjoy(boolean value) {
            this.bitField0_ |= 4;
            this.hadEnjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHadEnjoy() {
            this.bitField0_ &= -5;
            this.hadEnjoy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 8;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -9;
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

   public static final class C2S_LootEnjoy_20225 extends GeneratedMessageV3 implements C2S_LootEnjoy_20225OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_20225 DEFAULT_INSTANCE = new C2S_LootEnjoy_20225();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_20225> PARSER = new AbstractParser<C2S_LootEnjoy_20225>() {
         public C2S_LootEnjoy_20225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_20225(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_20225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_20225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_20225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_20225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20225.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_20225)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_20225 other = (C2S_LootEnjoy_20225)obj;
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

      public static C2S_LootEnjoy_20225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20225 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20225 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20225 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_20225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_20225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_20225> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_20225> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_20225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_20225OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.C2S_LootEnjoy_20225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_C2S_LootEnjoy_20225_descriptor;
         }

         public C2S_LootEnjoy_20225 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.C2S_LootEnjoy_20225.getDefaultInstance();
         }

         public C2S_LootEnjoy_20225 build() {
            C2S_LootEnjoy_20225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_20225 buildPartial() {
            C2S_LootEnjoy_20225 result = new C2S_LootEnjoy_20225(this);
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
            if (other instanceof C2S_LootEnjoy_20225) {
               return this.mergeFrom((C2S_LootEnjoy_20225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_20225 other) {
            if (other == ActivityMaChaoMsg.C2S_LootEnjoy_20225.getDefaultInstance()) {
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
            C2S_LootEnjoy_20225 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_20225)ActivityMaChaoMsg.C2S_LootEnjoy_20225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_20225)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_20226 extends GeneratedMessageV3 implements S2C_LootEnjoy_20226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_20226 DEFAULT_INSTANCE = new S2C_LootEnjoy_20226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_20226> PARSER = new AbstractParser<S2C_LootEnjoy_20226>() {
         public S2C_LootEnjoy_20226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_20226(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_20226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_20226() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_20226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_20226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20226.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_20226)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_20226 other = (S2C_LootEnjoy_20226)obj;
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

      public static S2C_LootEnjoy_20226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20226 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20226 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_20226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_20226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_20226> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_20226> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_20226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_20226OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20226.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityMaChaoMsg.S2C_LootEnjoy_20226.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityMaChaoMsg.internal_static_activityMaChao_com_gzbz_protobuf_S2C_LootEnjoy_20226_descriptor;
         }

         public S2C_LootEnjoy_20226 getDefaultInstanceForType() {
            return ActivityMaChaoMsg.S2C_LootEnjoy_20226.getDefaultInstance();
         }

         public S2C_LootEnjoy_20226 build() {
            S2C_LootEnjoy_20226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_20226 buildPartial() {
            S2C_LootEnjoy_20226 result = new S2C_LootEnjoy_20226(this);
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
            if (other instanceof S2C_LootEnjoy_20226) {
               return this.mergeFrom((S2C_LootEnjoy_20226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_20226 other) {
            if (other == ActivityMaChaoMsg.S2C_LootEnjoy_20226.getDefaultInstance()) {
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
            S2C_LootEnjoy_20226 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_20226)ActivityMaChaoMsg.S2C_LootEnjoy_20226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_20226)e.getUnfinishedMessage();
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

   public interface C2S_HeroThemeInfo_20201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootEnjoy_20225OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_20221OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_20223OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_MatchBattle_20211OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Mate_20203OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PointReward_20207OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_HeroThemeInfo_20202OrBuilder extends MessageOrBuilder {
      boolean hasFight();

      int getFight();

      boolean hasTotalDamage();

      long getTotalDamage();

      List<Integer> getFightRewardList();

      int getFightRewardCount();

      int getFightReward(int index);

      boolean hasTotalPoint();

      int getTotalPoint();

      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasServerOpenDay();

      int getServerOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_LootEnjoy_20226OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_20222OrBuilder extends MessageOrBuilder {
      boolean hasEnjoyId();

      int getEnjoyId();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_LootReward_20224OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasHadEnjoy();

      boolean getHadEnjoy();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_MatchBattle_20212OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasFightNum();

      int getFightNum();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasTotalPoint();

      int getTotalPoint();
   }

   public interface S2C_Mate_20204OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();

      boolean hasArraying();

      CommonMsg.PlayerArrayingInfo getArraying();

      CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();
   }

   public interface S2C_PointReward_20208OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TaskModify_20216OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }
}
