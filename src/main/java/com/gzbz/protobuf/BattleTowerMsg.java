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

public final class BattleTowerMsg {
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_RecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_WaveInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BattleTowerMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011BattleTower.proto\u0012\u001dbattletower.com.gzbz.protobuf\u001a\nRank.proto\"\u0017\n\u0015C2S_GetTowerInfo_7401\"\u008c\u0001\n\u0015S2C_GetTowerInfo_7402\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0003 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0004 \u0003(\u0005\u0012/\n\u0005ranks\u0018\u0005 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\"5\n\u0013C2S_EnterTower_7403\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005sweep\u0018\u0002 \u0002(\b\"%\n\u0017C2S_GetTowerReward_7405\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"%\n\u0017S2C_GetTowerReward_7406\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0013\n\u0011C2S_BuyTimes_7407\"%\n\u0011S2C_BuyTimes_7408\u0012\u0010\n\bbuyTimes\u0018\u0001 \u0002(\u0005\"'\n\u0014C2S_TowerReport_7409\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\"\u009c\u0001\n\nRecordInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\f\n\u0004head\u0018\u0003 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0005 \u0002(\u0005\u00129\n\bwaveInfo\u0018\u0006 \u0003(\u000b2'.battletower.com.gzbz.protobuf.WaveInfo\"n\n\bWaveInfo\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ncrossPower\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tcrossTime\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0004 \u0002(\u0005\u0012\u0016\n\u000eheroArrayState\u0018\u0005 \u0002(\u0005\"m\n\u0014S2C_TowerRecord_7410\u0012=\n\nrecordInfo\u0018\u0001 \u0003(\u000b2).battletower.com.gzbz.protobuf.RecordInfo\u0012\u0016\n\u000erecommendFight\u0018\u0002 \u0002(\u0003B%\n\u0011com.gzbz.protobufB\u000eBattleTowerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor, new String[0]);
      internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor, new String[]{"TowerId", "Count", "BuyTimes", "RewardId", "Ranks"});
      internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor, new String[]{"TowerId", "Sweep"});
      internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor, new String[]{"Id"});
      internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor, new String[]{"Id"});
      internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor, new String[0]);
      internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor, new String[]{"BuyTimes"});
      internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor, new String[]{"TowerId"});
      internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_battletower_com_gzbz_protobuf_RecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor, new String[]{"PlayerId", "PlayerName", "Head", "HeadFrame", "Type", "WaveInfo"});
      internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_battletower_com_gzbz_protobuf_WaveInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor, new String[]{"RecordId", "CrossPower", "CrossTime", "StartTime", "HeroArrayState"});
      internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor, new String[]{"RecordInfo", "RecommendFight"});
      RankMsg.getDescriptor();
   }

   public static final class C2S_GetTowerInfo_7401 extends GeneratedMessageV3 implements C2S_GetTowerInfo_7401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetTowerInfo_7401 DEFAULT_INSTANCE = new C2S_GetTowerInfo_7401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetTowerInfo_7401> PARSER = new AbstractParser<C2S_GetTowerInfo_7401>() {
         public C2S_GetTowerInfo_7401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetTowerInfo_7401(input, extensionRegistry);
         }
      };

      private C2S_GetTowerInfo_7401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetTowerInfo_7401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetTowerInfo_7401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetTowerInfo_7401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerInfo_7401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetTowerInfo_7401)) {
            return super.equals(obj);
         } else {
            C2S_GetTowerInfo_7401 other = (C2S_GetTowerInfo_7401)obj;
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

      public static C2S_GetTowerInfo_7401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_7401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(InputStream input) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerInfo_7401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_7401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_7401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_7401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetTowerInfo_7401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetTowerInfo_7401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetTowerInfo_7401> parser() {
         return PARSER;
      }

      public Parser<C2S_GetTowerInfo_7401> getParserForType() {
         return PARSER;
      }

      public C2S_GetTowerInfo_7401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetTowerInfo_7401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerInfo_7401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.C2S_GetTowerInfo_7401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerInfo_7401_descriptor;
         }

         public C2S_GetTowerInfo_7401 getDefaultInstanceForType() {
            return BattleTowerMsg.C2S_GetTowerInfo_7401.getDefaultInstance();
         }

         public C2S_GetTowerInfo_7401 build() {
            C2S_GetTowerInfo_7401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetTowerInfo_7401 buildPartial() {
            C2S_GetTowerInfo_7401 result = new C2S_GetTowerInfo_7401(this);
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
            if (other instanceof C2S_GetTowerInfo_7401) {
               return this.mergeFrom((C2S_GetTowerInfo_7401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetTowerInfo_7401 other) {
            if (other == BattleTowerMsg.C2S_GetTowerInfo_7401.getDefaultInstance()) {
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
            C2S_GetTowerInfo_7401 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetTowerInfo_7401)BattleTowerMsg.C2S_GetTowerInfo_7401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetTowerInfo_7401)e.getUnfinishedMessage();
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

   public static final class S2C_GetTowerInfo_7402 extends GeneratedMessageV3 implements S2C_GetTowerInfo_7402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int BUYTIMES_FIELD_NUMBER = 3;
      private int buyTimes_;
      public static final int REWARDID_FIELD_NUMBER = 4;
      private Internal.IntList rewardId_;
      public static final int RANKS_FIELD_NUMBER = 5;
      private List<RankMsg.RankData> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_GetTowerInfo_7402 DEFAULT_INSTANCE = new S2C_GetTowerInfo_7402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetTowerInfo_7402> PARSER = new AbstractParser<S2C_GetTowerInfo_7402>() {
         public S2C_GetTowerInfo_7402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetTowerInfo_7402(input, extensionRegistry);
         }
      };

      private S2C_GetTowerInfo_7402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetTowerInfo_7402() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetTowerInfo_7402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetTowerInfo_7402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buyTimes_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.rewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerInfo_7402.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
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

      public List<RankMsg.RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankMsg.RankData getRanks(int index) {
         return (RankMsg.RankData)this.ranks_.get(index);
      }

      public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankMsg.RankDataOrBuilder)this.ranks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTimes()) {
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
            output.writeInt32(1, this.towerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buyTimes_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(4, this.rewardId_.getInt(i));
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.ranks_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetTowerInfo_7402)) {
            return super.equals(obj);
         } else {
            S2C_GetTowerInfo_7402 other = (S2C_GetTowerInfo_7402)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyTimes();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetTowerInfo_7402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_7402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(InputStream input) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerInfo_7402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_7402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_7402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_7402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetTowerInfo_7402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetTowerInfo_7402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetTowerInfo_7402> parser() {
         return PARSER;
      }

      public Parser<S2C_GetTowerInfo_7402> getParserForType() {
         return PARSER;
      }

      public S2C_GetTowerInfo_7402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetTowerInfo_7402OrBuilder {
         private int bitField0_;
         private int towerId_;
         private int count_;
         private int buyTimes_;
         private Internal.IntList rewardId_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerInfo_7402.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = BattleTowerMsg.S2C_GetTowerInfo_7402.emptyIntList();
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = BattleTowerMsg.S2C_GetTowerInfo_7402.emptyIntList();
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.S2C_GetTowerInfo_7402.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
            this.bitField0_ &= -5;
            this.rewardId_ = BattleTowerMsg.S2C_GetTowerInfo_7402.emptyIntList();
            this.bitField0_ &= -9;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerInfo_7402_descriptor;
         }

         public S2C_GetTowerInfo_7402 getDefaultInstanceForType() {
            return BattleTowerMsg.S2C_GetTowerInfo_7402.getDefaultInstance();
         }

         public S2C_GetTowerInfo_7402 build() {
            S2C_GetTowerInfo_7402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetTowerInfo_7402 buildPartial() {
            S2C_GetTowerInfo_7402 result = new S2C_GetTowerInfo_7402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyTimes_ = this.buyTimes_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.rewardId_ = this.rewardId_;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -17;
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
            if (other instanceof S2C_GetTowerInfo_7402) {
               return this.mergeFrom((S2C_GetTowerInfo_7402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetTowerInfo_7402 other) {
            if (other == BattleTowerMsg.S2C_GetTowerInfo_7402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -17;
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
                     this.bitField0_ &= -17;
                     this.ranksBuilder_ = BattleTowerMsg.S2C_GetTowerInfo_7402.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
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
            if (!this.hasTowerId()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else if (!this.hasBuyTimes()) {
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
            S2C_GetTowerInfo_7402 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetTowerInfo_7402)BattleTowerMsg.S2C_GetTowerInfo_7402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetTowerInfo_7402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 4;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -5;
            this.buyTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.rewardId_ = BattleTowerMsg.S2C_GetTowerInfo_7402.mutableCopy(this.rewardId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
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
            this.rewardId_ = BattleTowerMsg.S2C_GetTowerInfo_7402.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 16;
            }

         }

         public List<RankMsg.RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankMsg.RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankData)this.ranks_.get(index) : (RankMsg.RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankMsg.RankData value) {
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

         public Builder setRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankMsg.RankData value) {
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

         public Builder addRanks(int index, RankMsg.RankData value) {
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

         public Builder addRanks(RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankMsg.RankData> values) {
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
               this.bitField0_ &= -17;
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

         public RankMsg.RankData.Builder getRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankDataOrBuilder)this.ranks_.get(index) : (RankMsg.RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankMsg.RankData.Builder addRanksBuilder() {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankMsg.RankData.Builder addRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankMsg.RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_EnterTower_7403 extends GeneratedMessageV3 implements C2S_EnterTower_7403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int SWEEP_FIELD_NUMBER = 2;
      private boolean sweep_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterTower_7403 DEFAULT_INSTANCE = new C2S_EnterTower_7403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterTower_7403> PARSER = new AbstractParser<C2S_EnterTower_7403>() {
         public C2S_EnterTower_7403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterTower_7403(input, extensionRegistry);
         }
      };

      private C2S_EnterTower_7403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterTower_7403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterTower_7403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterTower_7403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sweep_ = input.readBool();
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterTower_7403.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public boolean hasSweep() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getSweep() {
         return this.sweep_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSweep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.sweep_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.sweep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnterTower_7403)) {
            return super.equals(obj);
         } else {
            C2S_EnterTower_7403 other = (C2S_EnterTower_7403)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (this.hasSweep() != other.hasSweep()) {
               return false;
            } else if (this.hasSweep() && this.getSweep() != other.getSweep()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.hasSweep()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getSweep());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnterTower_7403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data);
      }

      public static C2S_EnterTower_7403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterTower_7403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data);
      }

      public static C2S_EnterTower_7403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterTower_7403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data);
      }

      public static C2S_EnterTower_7403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterTower_7403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterTower_7403 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterTower_7403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterTower_7403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterTower_7403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterTower_7403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterTower_7403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterTower_7403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterTower_7403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterTower_7403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterTower_7403> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterTower_7403> getParserForType() {
         return PARSER;
      }

      public C2S_EnterTower_7403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterTower_7403OrBuilder {
         private int bitField0_;
         private int towerId_;
         private boolean sweep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterTower_7403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.C2S_EnterTower_7403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.sweep_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_EnterTower_7403_descriptor;
         }

         public C2S_EnterTower_7403 getDefaultInstanceForType() {
            return BattleTowerMsg.C2S_EnterTower_7403.getDefaultInstance();
         }

         public C2S_EnterTower_7403 build() {
            C2S_EnterTower_7403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterTower_7403 buildPartial() {
            C2S_EnterTower_7403 result = new C2S_EnterTower_7403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sweep_ = this.sweep_;
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
            if (other instanceof C2S_EnterTower_7403) {
               return this.mergeFrom((C2S_EnterTower_7403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterTower_7403 other) {
            if (other == BattleTowerMsg.C2S_EnterTower_7403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (other.hasSweep()) {
                  this.setSweep(other.getSweep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTowerId()) {
               return false;
            } else {
               return this.hasSweep();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnterTower_7403 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterTower_7403)BattleTowerMsg.C2S_EnterTower_7403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterTower_7403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSweep() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getSweep() {
            return this.sweep_;
         }

         public Builder setSweep(boolean value) {
            this.bitField0_ |= 2;
            this.sweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSweep() {
            this.bitField0_ &= -3;
            this.sweep_ = false;
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

   public static final class C2S_GetTowerReward_7405 extends GeneratedMessageV3 implements C2S_GetTowerReward_7405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GetTowerReward_7405 DEFAULT_INSTANCE = new C2S_GetTowerReward_7405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetTowerReward_7405> PARSER = new AbstractParser<C2S_GetTowerReward_7405>() {
         public C2S_GetTowerReward_7405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetTowerReward_7405(input, extensionRegistry);
         }
      };

      private C2S_GetTowerReward_7405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetTowerReward_7405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetTowerReward_7405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetTowerReward_7405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerReward_7405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetTowerReward_7405)) {
            return super.equals(obj);
         } else {
            C2S_GetTowerReward_7405 other = (C2S_GetTowerReward_7405)obj;
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

      public static C2S_GetTowerReward_7405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_7405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_7405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_7405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_7405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_7405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_7405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_7405 parseFrom(InputStream input) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_7405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerReward_7405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_7405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerReward_7405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_7405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_7405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetTowerReward_7405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetTowerReward_7405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetTowerReward_7405> parser() {
         return PARSER;
      }

      public Parser<C2S_GetTowerReward_7405> getParserForType() {
         return PARSER;
      }

      public C2S_GetTowerReward_7405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetTowerReward_7405OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerReward_7405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.C2S_GetTowerReward_7405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_GetTowerReward_7405_descriptor;
         }

         public C2S_GetTowerReward_7405 getDefaultInstanceForType() {
            return BattleTowerMsg.C2S_GetTowerReward_7405.getDefaultInstance();
         }

         public C2S_GetTowerReward_7405 build() {
            C2S_GetTowerReward_7405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetTowerReward_7405 buildPartial() {
            C2S_GetTowerReward_7405 result = new C2S_GetTowerReward_7405(this);
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
            if (other instanceof C2S_GetTowerReward_7405) {
               return this.mergeFrom((C2S_GetTowerReward_7405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetTowerReward_7405 other) {
            if (other == BattleTowerMsg.C2S_GetTowerReward_7405.getDefaultInstance()) {
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
            C2S_GetTowerReward_7405 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetTowerReward_7405)BattleTowerMsg.C2S_GetTowerReward_7405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetTowerReward_7405)e.getUnfinishedMessage();
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

   public static final class S2C_GetTowerReward_7406 extends GeneratedMessageV3 implements S2C_GetTowerReward_7406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_GetTowerReward_7406 DEFAULT_INSTANCE = new S2C_GetTowerReward_7406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetTowerReward_7406> PARSER = new AbstractParser<S2C_GetTowerReward_7406>() {
         public S2C_GetTowerReward_7406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetTowerReward_7406(input, extensionRegistry);
         }
      };

      private S2C_GetTowerReward_7406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetTowerReward_7406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetTowerReward_7406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetTowerReward_7406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerReward_7406.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GetTowerReward_7406)) {
            return super.equals(obj);
         } else {
            S2C_GetTowerReward_7406 other = (S2C_GetTowerReward_7406)obj;
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

      public static S2C_GetTowerReward_7406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_7406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_7406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_7406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_7406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_7406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_7406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_7406 parseFrom(InputStream input) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_7406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerReward_7406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_7406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerReward_7406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_7406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_7406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetTowerReward_7406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetTowerReward_7406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetTowerReward_7406> parser() {
         return PARSER;
      }

      public Parser<S2C_GetTowerReward_7406> getParserForType() {
         return PARSER;
      }

      public S2C_GetTowerReward_7406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetTowerReward_7406OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerReward_7406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.S2C_GetTowerReward_7406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_GetTowerReward_7406_descriptor;
         }

         public S2C_GetTowerReward_7406 getDefaultInstanceForType() {
            return BattleTowerMsg.S2C_GetTowerReward_7406.getDefaultInstance();
         }

         public S2C_GetTowerReward_7406 build() {
            S2C_GetTowerReward_7406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetTowerReward_7406 buildPartial() {
            S2C_GetTowerReward_7406 result = new S2C_GetTowerReward_7406(this);
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
            if (other instanceof S2C_GetTowerReward_7406) {
               return this.mergeFrom((S2C_GetTowerReward_7406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetTowerReward_7406 other) {
            if (other == BattleTowerMsg.S2C_GetTowerReward_7406.getDefaultInstance()) {
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
            S2C_GetTowerReward_7406 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetTowerReward_7406)BattleTowerMsg.S2C_GetTowerReward_7406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetTowerReward_7406)e.getUnfinishedMessage();
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

   public static final class C2S_BuyTimes_7407 extends GeneratedMessageV3 implements C2S_BuyTimes_7407OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyTimes_7407 DEFAULT_INSTANCE = new C2S_BuyTimes_7407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyTimes_7407> PARSER = new AbstractParser<C2S_BuyTimes_7407>() {
         public C2S_BuyTimes_7407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyTimes_7407(input, extensionRegistry);
         }
      };

      private C2S_BuyTimes_7407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyTimes_7407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyTimes_7407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyTimes_7407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTimes_7407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyTimes_7407)) {
            return super.equals(obj);
         } else {
            C2S_BuyTimes_7407 other = (C2S_BuyTimes_7407)obj;
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

      public static C2S_BuyTimes_7407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_7407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_7407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_7407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_7407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_7407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_7407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_7407 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_7407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTimes_7407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_7407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTimes_7407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_7407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_7407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyTimes_7407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyTimes_7407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyTimes_7407> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyTimes_7407> getParserForType() {
         return PARSER;
      }

      public C2S_BuyTimes_7407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyTimes_7407OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTimes_7407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.C2S_BuyTimes_7407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_BuyTimes_7407_descriptor;
         }

         public C2S_BuyTimes_7407 getDefaultInstanceForType() {
            return BattleTowerMsg.C2S_BuyTimes_7407.getDefaultInstance();
         }

         public C2S_BuyTimes_7407 build() {
            C2S_BuyTimes_7407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyTimes_7407 buildPartial() {
            C2S_BuyTimes_7407 result = new C2S_BuyTimes_7407(this);
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
            if (other instanceof C2S_BuyTimes_7407) {
               return this.mergeFrom((C2S_BuyTimes_7407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyTimes_7407 other) {
            if (other == BattleTowerMsg.C2S_BuyTimes_7407.getDefaultInstance()) {
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
            C2S_BuyTimes_7407 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyTimes_7407)BattleTowerMsg.C2S_BuyTimes_7407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyTimes_7407)e.getUnfinishedMessage();
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

   public static final class S2C_BuyTimes_7408 extends GeneratedMessageV3 implements S2C_BuyTimes_7408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYTIMES_FIELD_NUMBER = 1;
      private int buyTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyTimes_7408 DEFAULT_INSTANCE = new S2C_BuyTimes_7408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyTimes_7408> PARSER = new AbstractParser<S2C_BuyTimes_7408>() {
         public S2C_BuyTimes_7408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyTimes_7408(input, extensionRegistry);
         }
      };

      private S2C_BuyTimes_7408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyTimes_7408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyTimes_7408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyTimes_7408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyTimes_7408.class, Builder.class);
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.buyTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyTimes_7408)) {
            return super.equals(obj);
         } else {
            S2C_BuyTimes_7408 other = (S2C_BuyTimes_7408)obj;
            if (this.hasBuyTimes() != other.hasBuyTimes()) {
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
            if (this.hasBuyTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyTimes_7408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_7408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_7408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_7408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_7408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_7408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_7408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_7408 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_7408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyTimes_7408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_7408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyTimes_7408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_7408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_7408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyTimes_7408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyTimes_7408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyTimes_7408> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyTimes_7408> getParserForType() {
         return PARSER;
      }

      public S2C_BuyTimes_7408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyTimes_7408OrBuilder {
         private int bitField0_;
         private int buyTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyTimes_7408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.S2C_BuyTimes_7408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyTimes_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_BuyTimes_7408_descriptor;
         }

         public S2C_BuyTimes_7408 getDefaultInstanceForType() {
            return BattleTowerMsg.S2C_BuyTimes_7408.getDefaultInstance();
         }

         public S2C_BuyTimes_7408 build() {
            S2C_BuyTimes_7408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyTimes_7408 buildPartial() {
            S2C_BuyTimes_7408 result = new S2C_BuyTimes_7408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyTimes_ = this.buyTimes_;
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
            if (other instanceof S2C_BuyTimes_7408) {
               return this.mergeFrom((S2C_BuyTimes_7408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyTimes_7408 other) {
            if (other == BattleTowerMsg.S2C_BuyTimes_7408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyTimes_7408 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyTimes_7408)BattleTowerMsg.S2C_BuyTimes_7408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyTimes_7408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 1;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -2;
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

   public static final class C2S_TowerReport_7409 extends GeneratedMessageV3 implements C2S_TowerReport_7409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      private byte memoizedIsInitialized;
      private static final C2S_TowerReport_7409 DEFAULT_INSTANCE = new C2S_TowerReport_7409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TowerReport_7409> PARSER = new AbstractParser<C2S_TowerReport_7409>() {
         public C2S_TowerReport_7409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TowerReport_7409(input, extensionRegistry);
         }
      };

      private C2S_TowerReport_7409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TowerReport_7409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TowerReport_7409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TowerReport_7409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TowerReport_7409.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TowerReport_7409)) {
            return super.equals(obj);
         } else {
            C2S_TowerReport_7409 other = (C2S_TowerReport_7409)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TowerReport_7409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_7409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_7409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_7409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_7409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_7409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_7409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_7409 parseFrom(InputStream input) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_7409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TowerReport_7409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_7409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TowerReport_7409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_7409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_7409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TowerReport_7409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TowerReport_7409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TowerReport_7409> parser() {
         return PARSER;
      }

      public Parser<C2S_TowerReport_7409> getParserForType() {
         return PARSER;
      }

      public C2S_TowerReport_7409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TowerReport_7409OrBuilder {
         private int bitField0_;
         private int towerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TowerReport_7409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.C2S_TowerReport_7409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_C2S_TowerReport_7409_descriptor;
         }

         public C2S_TowerReport_7409 getDefaultInstanceForType() {
            return BattleTowerMsg.C2S_TowerReport_7409.getDefaultInstance();
         }

         public C2S_TowerReport_7409 build() {
            C2S_TowerReport_7409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TowerReport_7409 buildPartial() {
            C2S_TowerReport_7409 result = new C2S_TowerReport_7409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
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
            if (other instanceof C2S_TowerReport_7409) {
               return this.mergeFrom((C2S_TowerReport_7409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TowerReport_7409 other) {
            if (other == BattleTowerMsg.C2S_TowerReport_7409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTowerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TowerReport_7409 parsedMessage = null;

            try {
               parsedMessage = (C2S_TowerReport_7409)BattleTowerMsg.C2S_TowerReport_7409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TowerReport_7409)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
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

   public static final class RecordInfo extends GeneratedMessageV3 implements RecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 3;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 4;
      private int headFrame_;
      public static final int TYPE_FIELD_NUMBER = 5;
      private int type_;
      public static final int WAVEINFO_FIELD_NUMBER = 6;
      private List<WaveInfo> waveInfo_;
      private byte memoizedIsInitialized;
      private static final RecordInfo DEFAULT_INSTANCE = new RecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecordInfo> PARSER = new AbstractParser<RecordInfo>() {
         public RecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecordInfo(input, extensionRegistry);
         }
      };

      private RecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecordInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.waveInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.head_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.type_ = input.readInt32();
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.waveInfo_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.waveInfo_.add(input.readMessage(BattleTowerMsg.WaveInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 32) != 0) {
                  this.waveInfo_ = Collections.unmodifiableList(this.waveInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
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

      public boolean hasHead() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<WaveInfo> getWaveInfoList() {
         return this.waveInfo_;
      }

      public List<? extends WaveInfoOrBuilder> getWaveInfoOrBuilderList() {
         return this.waveInfo_;
      }

      public int getWaveInfoCount() {
         return this.waveInfo_.size();
      }

      public WaveInfo getWaveInfo(int index) {
         return (WaveInfo)this.waveInfo_.get(index);
      }

      public WaveInfoOrBuilder getWaveInfoOrBuilder(int index) {
         return (WaveInfoOrBuilder)this.waveInfo_.get(index);
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getWaveInfoCount(); ++i) {
               if (!this.getWaveInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.head_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.headFrame_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.type_);
         }

         for(int i = 0; i < this.waveInfo_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.waveInfo_.get(i));
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.head_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.headFrame_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.type_);
            }

            for(int i = 0; i < this.waveInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.waveInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecordInfo)) {
            return super.equals(obj);
         } else {
            RecordInfo other = (RecordInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getWaveInfoList().equals(other.getWaveInfoList())) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getType();
            }

            if (this.getWaveInfoCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getWaveInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordInfo> parser() {
         return PARSER;
      }

      public Parser<RecordInfo> getParserForType() {
         return PARSER;
      }

      public RecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecordInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int type_;
         private List<WaveInfo> waveInfo_;
         private RepeatedFieldBuilderV3<WaveInfo, WaveInfo.Builder, WaveInfoOrBuilder> waveInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.waveInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.waveInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.RecordInfo.alwaysUseFieldBuilders) {
               this.getWaveInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.head_ = 0;
            this.bitField0_ &= -5;
            this.headFrame_ = 0;
            this.bitField0_ &= -9;
            this.type_ = 0;
            this.bitField0_ &= -17;
            if (this.waveInfoBuilder_ == null) {
               this.waveInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.waveInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         public RecordInfo getDefaultInstanceForType() {
            return BattleTowerMsg.RecordInfo.getDefaultInstance();
         }

         public RecordInfo build() {
            RecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecordInfo buildPartial() {
            RecordInfo result = new RecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 16;
            }

            if (this.waveInfoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.waveInfo_ = Collections.unmodifiableList(this.waveInfo_);
                  this.bitField0_ &= -33;
               }

               result.waveInfo_ = this.waveInfo_;
            } else {
               result.waveInfo_ = this.waveInfoBuilder_.build();
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
            if (other instanceof RecordInfo) {
               return this.mergeFrom((RecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecordInfo other) {
            if (other == BattleTowerMsg.RecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.waveInfoBuilder_ == null) {
                  if (!other.waveInfo_.isEmpty()) {
                     if (this.waveInfo_.isEmpty()) {
                        this.waveInfo_ = other.waveInfo_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureWaveInfoIsMutable();
                        this.waveInfo_.addAll(other.waveInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.waveInfo_.isEmpty()) {
                  if (this.waveInfoBuilder_.isEmpty()) {
                     this.waveInfoBuilder_.dispose();
                     this.waveInfoBuilder_ = null;
                     this.waveInfo_ = other.waveInfo_;
                     this.bitField0_ &= -33;
                     this.waveInfoBuilder_ = BattleTowerMsg.RecordInfo.alwaysUseFieldBuilders ? this.getWaveInfoFieldBuilder() : null;
                  } else {
                     this.waveInfoBuilder_.addAllMessages(other.waveInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getWaveInfoCount(); ++i) {
                  if (!this.getWaveInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecordInfo parsedMessage = null;

            try {
               parsedMessage = (RecordInfo)BattleTowerMsg.RecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecordInfo)e.getUnfinishedMessage();
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

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
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
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = BattleTowerMsg.RecordInfo.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHead() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 4;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 8;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 16;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -17;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureWaveInfoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.waveInfo_ = new ArrayList(this.waveInfo_);
               this.bitField0_ |= 32;
            }

         }

         public List<WaveInfo> getWaveInfoList() {
            return this.waveInfoBuilder_ == null ? Collections.unmodifiableList(this.waveInfo_) : this.waveInfoBuilder_.getMessageList();
         }

         public int getWaveInfoCount() {
            return this.waveInfoBuilder_ == null ? this.waveInfo_.size() : this.waveInfoBuilder_.getCount();
         }

         public WaveInfo getWaveInfo(int index) {
            return this.waveInfoBuilder_ == null ? (WaveInfo)this.waveInfo_.get(index) : (WaveInfo)this.waveInfoBuilder_.getMessage(index);
         }

         public Builder setWaveInfo(int index, WaveInfo value) {
            if (this.waveInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWaveInfoIsMutable();
               this.waveInfo_.set(index, value);
               this.onChanged();
            } else {
               this.waveInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWaveInfo(int index, WaveInfo.Builder builderForValue) {
            if (this.waveInfoBuilder_ == null) {
               this.ensureWaveInfoIsMutable();
               this.waveInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.waveInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWaveInfo(WaveInfo value) {
            if (this.waveInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWaveInfoIsMutable();
               this.waveInfo_.add(value);
               this.onChanged();
            } else {
               this.waveInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWaveInfo(int index, WaveInfo value) {
            if (this.waveInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWaveInfoIsMutable();
               this.waveInfo_.add(index, value);
               this.onChanged();
            } else {
               this.waveInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWaveInfo(WaveInfo.Builder builderForValue) {
            if (this.waveInfoBuilder_ == null) {
               this.ensureWaveInfoIsMutable();
               this.waveInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.waveInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWaveInfo(int index, WaveInfo.Builder builderForValue) {
            if (this.waveInfoBuilder_ == null) {
               this.ensureWaveInfoIsMutable();
               this.waveInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.waveInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWaveInfo(Iterable<? extends WaveInfo> values) {
            if (this.waveInfoBuilder_ == null) {
               this.ensureWaveInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.waveInfo_);
               this.onChanged();
            } else {
               this.waveInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWaveInfo() {
            if (this.waveInfoBuilder_ == null) {
               this.waveInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.waveInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeWaveInfo(int index) {
            if (this.waveInfoBuilder_ == null) {
               this.ensureWaveInfoIsMutable();
               this.waveInfo_.remove(index);
               this.onChanged();
            } else {
               this.waveInfoBuilder_.remove(index);
            }

            return this;
         }

         public WaveInfo.Builder getWaveInfoBuilder(int index) {
            return (WaveInfo.Builder)this.getWaveInfoFieldBuilder().getBuilder(index);
         }

         public WaveInfoOrBuilder getWaveInfoOrBuilder(int index) {
            return this.waveInfoBuilder_ == null ? (WaveInfoOrBuilder)this.waveInfo_.get(index) : (WaveInfoOrBuilder)this.waveInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WaveInfoOrBuilder> getWaveInfoOrBuilderList() {
            return this.waveInfoBuilder_ != null ? this.waveInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.waveInfo_);
         }

         public WaveInfo.Builder addWaveInfoBuilder() {
            return (WaveInfo.Builder)this.getWaveInfoFieldBuilder().addBuilder(BattleTowerMsg.WaveInfo.getDefaultInstance());
         }

         public WaveInfo.Builder addWaveInfoBuilder(int index) {
            return (WaveInfo.Builder)this.getWaveInfoFieldBuilder().addBuilder(index, BattleTowerMsg.WaveInfo.getDefaultInstance());
         }

         public List<WaveInfo.Builder> getWaveInfoBuilderList() {
            return this.getWaveInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WaveInfo, WaveInfo.Builder, WaveInfoOrBuilder> getWaveInfoFieldBuilder() {
            if (this.waveInfoBuilder_ == null) {
               this.waveInfoBuilder_ = new RepeatedFieldBuilderV3(this.waveInfo_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.waveInfo_ = null;
            }

            return this.waveInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class WaveInfo extends GeneratedMessageV3 implements WaveInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int CROSSPOWER_FIELD_NUMBER = 2;
      private long crossPower_;
      public static final int CROSSTIME_FIELD_NUMBER = 3;
      private int crossTime_;
      public static final int STARTTIME_FIELD_NUMBER = 4;
      private int startTime_;
      public static final int HEROARRAYSTATE_FIELD_NUMBER = 5;
      private int heroArrayState_;
      private byte memoizedIsInitialized;
      private static final WaveInfo DEFAULT_INSTANCE = new WaveInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<WaveInfo> PARSER = new AbstractParser<WaveInfo>() {
         public WaveInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WaveInfo(input, extensionRegistry);
         }
      };

      private WaveInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WaveInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WaveInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WaveInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.crossPower_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.crossTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.heroArrayState_ = input.readInt32();
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
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_WaveInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WaveInfo.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasCrossPower() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getCrossPower() {
         return this.crossPower_;
      }

      public boolean hasCrossTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCrossTime() {
         return this.crossTime_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasHeroArrayState() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeroArrayState() {
         return this.heroArrayState_;
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
         } else if (!this.hasCrossPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCrossTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayState()) {
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
            output.writeInt64(2, this.crossPower_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.crossTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.heroArrayState_);
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
               size += CodedOutputStream.computeInt64Size(2, this.crossPower_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.crossTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.heroArrayState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WaveInfo)) {
            return super.equals(obj);
         } else {
            WaveInfo other = (WaveInfo)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasCrossPower() != other.hasCrossPower()) {
               return false;
            } else if (this.hasCrossPower() && this.getCrossPower() != other.getCrossPower()) {
               return false;
            } else if (this.hasCrossTime() != other.hasCrossTime()) {
               return false;
            } else if (this.hasCrossTime() && this.getCrossTime() != other.getCrossTime()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasHeroArrayState() != other.hasHeroArrayState()) {
               return false;
            } else if (this.hasHeroArrayState() && this.getHeroArrayState() != other.getHeroArrayState()) {
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

            if (this.hasCrossPower()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getCrossPower());
            }

            if (this.hasCrossTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCrossTime();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasHeroArrayState()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroArrayState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WaveInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data);
      }

      public static WaveInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WaveInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data);
      }

      public static WaveInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WaveInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data);
      }

      public static WaveInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WaveInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WaveInfo parseFrom(InputStream input) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WaveInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WaveInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WaveInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WaveInfo parseFrom(CodedInputStream input) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WaveInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WaveInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WaveInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WaveInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WaveInfo> parser() {
         return PARSER;
      }

      public Parser<WaveInfo> getParserForType() {
         return PARSER;
      }

      public WaveInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WaveInfoOrBuilder {
         private int bitField0_;
         private int recordId_;
         private long crossPower_;
         private int crossTime_;
         private int startTime_;
         private int heroArrayState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_WaveInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WaveInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.WaveInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.crossPower_ = 0L;
            this.bitField0_ &= -3;
            this.crossTime_ = 0;
            this.bitField0_ &= -5;
            this.startTime_ = 0;
            this.bitField0_ &= -9;
            this.heroArrayState_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_WaveInfo_descriptor;
         }

         public WaveInfo getDefaultInstanceForType() {
            return BattleTowerMsg.WaveInfo.getDefaultInstance();
         }

         public WaveInfo build() {
            WaveInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WaveInfo buildPartial() {
            WaveInfo result = new WaveInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.crossPower_ = this.crossPower_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.crossTime_ = this.crossTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.heroArrayState_ = this.heroArrayState_;
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
            if (other instanceof WaveInfo) {
               return this.mergeFrom((WaveInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WaveInfo other) {
            if (other == BattleTowerMsg.WaveInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasCrossPower()) {
                  this.setCrossPower(other.getCrossPower());
               }

               if (other.hasCrossTime()) {
                  this.setCrossTime(other.getCrossTime());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasHeroArrayState()) {
                  this.setHeroArrayState(other.getHeroArrayState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasCrossPower()) {
               return false;
            } else if (!this.hasCrossTime()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else {
               return this.hasHeroArrayState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WaveInfo parsedMessage = null;

            try {
               parsedMessage = (WaveInfo)BattleTowerMsg.WaveInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WaveInfo)e.getUnfinishedMessage();
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

         public boolean hasCrossPower() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getCrossPower() {
            return this.crossPower_;
         }

         public Builder setCrossPower(long value) {
            this.bitField0_ |= 2;
            this.crossPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossPower() {
            this.bitField0_ &= -3;
            this.crossPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCrossTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCrossTime() {
            return this.crossTime_;
         }

         public Builder setCrossTime(int value) {
            this.bitField0_ |= 4;
            this.crossTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossTime() {
            this.bitField0_ &= -5;
            this.crossTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 8;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroArrayState() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeroArrayState() {
            return this.heroArrayState_;
         }

         public Builder setHeroArrayState(int value) {
            this.bitField0_ |= 16;
            this.heroArrayState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroArrayState() {
            this.bitField0_ &= -17;
            this.heroArrayState_ = 0;
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

   public static final class S2C_TowerRecord_7410 extends GeneratedMessageV3 implements S2C_TowerRecord_7410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDINFO_FIELD_NUMBER = 1;
      private List<RecordInfo> recordInfo_;
      public static final int RECOMMENDFIGHT_FIELD_NUMBER = 2;
      private long recommendFight_;
      private byte memoizedIsInitialized;
      private static final S2C_TowerRecord_7410 DEFAULT_INSTANCE = new S2C_TowerRecord_7410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TowerRecord_7410> PARSER = new AbstractParser<S2C_TowerRecord_7410>() {
         public S2C_TowerRecord_7410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TowerRecord_7410(input, extensionRegistry);
         }
      };

      private S2C_TowerRecord_7410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TowerRecord_7410() {
         this.memoizedIsInitialized = -1;
         this.recordInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TowerRecord_7410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TowerRecord_7410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recordInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordInfo_.add(input.readMessage(BattleTowerMsg.RecordInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.recommendFight_ = input.readInt64();
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
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TowerRecord_7410.class, Builder.class);
      }

      public List<RecordInfo> getRecordInfoList() {
         return this.recordInfo_;
      }

      public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
         return this.recordInfo_;
      }

      public int getRecordInfoCount() {
         return this.recordInfo_.size();
      }

      public RecordInfo getRecordInfo(int index) {
         return (RecordInfo)this.recordInfo_.get(index);
      }

      public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
         return (RecordInfoOrBuilder)this.recordInfo_.get(index);
      }

      public boolean hasRecommendFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getRecommendFight() {
         return this.recommendFight_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecommendFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRecordInfoCount(); ++i) {
               if (!this.getRecordInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.recordInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.recordInfo_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.recommendFight_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.recordInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.recordInfo_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.recommendFight_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TowerRecord_7410)) {
            return super.equals(obj);
         } else {
            S2C_TowerRecord_7410 other = (S2C_TowerRecord_7410)obj;
            if (!this.getRecordInfoList().equals(other.getRecordInfoList())) {
               return false;
            } else if (this.hasRecommendFight() != other.hasRecommendFight()) {
               return false;
            } else if (this.hasRecommendFight() && this.getRecommendFight() != other.getRecommendFight()) {
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
            if (this.getRecordInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordInfoList().hashCode();
            }

            if (this.hasRecommendFight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getRecommendFight());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TowerRecord_7410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data);
      }

      public static S2C_TowerRecord_7410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TowerRecord_7410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data);
      }

      public static S2C_TowerRecord_7410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TowerRecord_7410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data);
      }

      public static S2C_TowerRecord_7410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TowerRecord_7410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TowerRecord_7410 parseFrom(InputStream input) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TowerRecord_7410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TowerRecord_7410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TowerRecord_7410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TowerRecord_7410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TowerRecord_7410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TowerRecord_7410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TowerRecord_7410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TowerRecord_7410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TowerRecord_7410> parser() {
         return PARSER;
      }

      public Parser<S2C_TowerRecord_7410> getParserForType() {
         return PARSER;
      }

      public S2C_TowerRecord_7410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TowerRecord_7410OrBuilder {
         private int bitField0_;
         private List<RecordInfo> recordInfo_;
         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> recordInfoBuilder_;
         private long recommendFight_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TowerRecord_7410.class, Builder.class);
         }

         private Builder() {
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleTowerMsg.S2C_TowerRecord_7410.alwaysUseFieldBuilders) {
               this.getRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordInfoBuilder_.clear();
            }

            this.recommendFight_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleTowerMsg.internal_static_battletower_com_gzbz_protobuf_S2C_TowerRecord_7410_descriptor;
         }

         public S2C_TowerRecord_7410 getDefaultInstanceForType() {
            return BattleTowerMsg.S2C_TowerRecord_7410.getDefaultInstance();
         }

         public S2C_TowerRecord_7410 build() {
            S2C_TowerRecord_7410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TowerRecord_7410 buildPartial() {
            S2C_TowerRecord_7410 result = new S2C_TowerRecord_7410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.recordInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
                  this.bitField0_ &= -2;
               }

               result.recordInfo_ = this.recordInfo_;
            } else {
               result.recordInfo_ = this.recordInfoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recommendFight_ = this.recommendFight_;
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
            if (other instanceof S2C_TowerRecord_7410) {
               return this.mergeFrom((S2C_TowerRecord_7410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TowerRecord_7410 other) {
            if (other == BattleTowerMsg.S2C_TowerRecord_7410.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordInfoBuilder_ == null) {
                  if (!other.recordInfo_.isEmpty()) {
                     if (this.recordInfo_.isEmpty()) {
                        this.recordInfo_ = other.recordInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordInfoIsMutable();
                        this.recordInfo_.addAll(other.recordInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordInfo_.isEmpty()) {
                  if (this.recordInfoBuilder_.isEmpty()) {
                     this.recordInfoBuilder_.dispose();
                     this.recordInfoBuilder_ = null;
                     this.recordInfo_ = other.recordInfo_;
                     this.bitField0_ &= -2;
                     this.recordInfoBuilder_ = BattleTowerMsg.S2C_TowerRecord_7410.alwaysUseFieldBuilders ? this.getRecordInfoFieldBuilder() : null;
                  } else {
                     this.recordInfoBuilder_.addAllMessages(other.recordInfo_);
                  }
               }

               if (other.hasRecommendFight()) {
                  this.setRecommendFight(other.getRecommendFight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecommendFight()) {
               return false;
            } else {
               for(int i = 0; i < this.getRecordInfoCount(); ++i) {
                  if (!this.getRecordInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TowerRecord_7410 parsedMessage = null;

            try {
               parsedMessage = (S2C_TowerRecord_7410)BattleTowerMsg.S2C_TowerRecord_7410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TowerRecord_7410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordInfo_ = new ArrayList(this.recordInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecordInfo> getRecordInfoList() {
            return this.recordInfoBuilder_ == null ? Collections.unmodifiableList(this.recordInfo_) : this.recordInfoBuilder_.getMessageList();
         }

         public int getRecordInfoCount() {
            return this.recordInfoBuilder_ == null ? this.recordInfo_.size() : this.recordInfoBuilder_.getCount();
         }

         public RecordInfo getRecordInfo(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfo)this.recordInfo_.get(index) : (RecordInfo)this.recordInfoBuilder_.getMessage(index);
         }

         public Builder setRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordInfo(Iterable<? extends RecordInfo> values) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordInfo_);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordInfo(int index) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.remove(index);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.remove(index);
            }

            return this;
         }

         public RecordInfo.Builder getRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().getBuilder(index);
         }

         public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfoOrBuilder)this.recordInfo_.get(index) : (RecordInfoOrBuilder)this.recordInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
            return this.recordInfoBuilder_ != null ? this.recordInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordInfo_);
         }

         public RecordInfo.Builder addRecordInfoBuilder() {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(BattleTowerMsg.RecordInfo.getDefaultInstance());
         }

         public RecordInfo.Builder addRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(index, BattleTowerMsg.RecordInfo.getDefaultInstance());
         }

         public List<RecordInfo.Builder> getRecordInfoBuilderList() {
            return this.getRecordInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> getRecordInfoFieldBuilder() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfoBuilder_ = new RepeatedFieldBuilderV3(this.recordInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.recordInfo_ = null;
            }

            return this.recordInfoBuilder_;
         }

         public boolean hasRecommendFight() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getRecommendFight() {
            return this.recommendFight_;
         }

         public Builder setRecommendFight(long value) {
            this.bitField0_ |= 2;
            this.recommendFight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecommendFight() {
            this.bitField0_ &= -3;
            this.recommendFight_ = 0L;
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

   public interface C2S_BuyTimes_7407OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EnterTower_7403OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      boolean hasSweep();

      boolean getSweep();
   }

   public interface C2S_GetTowerInfo_7401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GetTowerReward_7405OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TowerReport_7409OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();
   }

   public interface RecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasType();

      int getType();

      List<WaveInfo> getWaveInfoList();

      WaveInfo getWaveInfo(int index);

      int getWaveInfoCount();

      List<? extends WaveInfoOrBuilder> getWaveInfoOrBuilderList();

      WaveInfoOrBuilder getWaveInfoOrBuilder(int index);
   }

   public interface S2C_BuyTimes_7408OrBuilder extends MessageOrBuilder {
      boolean hasBuyTimes();

      int getBuyTimes();
   }

   public interface S2C_GetTowerInfo_7402OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      boolean hasCount();

      int getCount();

      boolean hasBuyTimes();

      int getBuyTimes();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_GetTowerReward_7406OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TowerRecord_7410OrBuilder extends MessageOrBuilder {
      List<RecordInfo> getRecordInfoList();

      RecordInfo getRecordInfo(int index);

      int getRecordInfoCount();

      List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList();

      RecordInfoOrBuilder getRecordInfoOrBuilder(int index);

      boolean hasRecommendFight();

      long getRecommendFight();
   }

   public interface WaveInfoOrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasCrossPower();

      long getCrossPower();

      boolean hasCrossTime();

      int getCrossTime();

      boolean hasStartTime();

      int getStartTime();

      boolean hasHeroArrayState();

      int getHeroArrayState();
   }
}
