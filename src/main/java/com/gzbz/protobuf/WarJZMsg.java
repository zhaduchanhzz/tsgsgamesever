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

public final class WarJZMsg {
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_JZInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WarJZMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bWarJZ.proto\u0012\u0017warjz.com.gzbz.protobuf\"+\n\u0015C2S_GetWarJZInfo_9101\u0012\u0012\n\nplayerCode\u0018\u0001 \u0002(\u0005\"\u0080\u0001\n\u0015S2C_GetWarJZInfo_9102\u0012\u0011\n\tbattleNum\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rbuySpecialBag\u0018\u0003 \u0002(\b\u0012-\n\u0004info\u0018\u0004 \u0003(\u000b2\u001f.warjz.com.gzbz.protobuf.JZInfo\"~\n\u0006JZInfo\u0012\u000e\n\u0006nation\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007layerId\u0018\u0002 \u0002(\u0005\u00123\n\npassStatus\u0018\u0003 \u0002(\u000e2\u001f.warjz.com.gzbz.protobuf.Status\u0012\u000e\n\u0006heroId\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006isLock\u0018\u0005 \u0001(\b\"'\n\u0011C2S_WarJZBuy_9105\u0012\u0012\n\nplayerCode\u0018\u0001 \u0002(\u0005\"6\n\u0011S2C_WarJZBuy_9106\u0012\u0011\n\tbattleNum\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\"\u0014\n\u0012C2S_WarJZRank_9107\"u\n\u0012S2C_WarJZRank_9108\u0012-\n\u0002my\u0018\u0001 \u0002(\u000b2!.warjz.com.gzbz.protobuf.RankInfo\u00120\n\u0005infos\u0018\u0002 \u0003(\u000b2!.warjz.com.gzbz.protobuf.RankInfo\"\u009a\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u000f\n\u0007passSum\u0018\u0006 \u0002(\u0005\u0012\u0010\n\bfightVal\u0018\u0007 \u0002(\u0003\u0012\u0011\n\theadFrame\u0018\b \u0002(\u0005\u0012\u0010\n\bserverId\u0018\t \u0002(\u0005\"!\n\u0013C2S_WarJZSweep_9109\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0011C2S_AllSweep_9110\u0012\u000e\n\u0006nation\u0018\u0001 \u0002(\u0005*+\n\u0006Status\u0012\f\n\bNOT_OPEN\u0010\u0000\u0012\b\n\u0004OPEN\u0010\u0001\u0012\t\n\u0005CLOSE\u0010\u0002B\u001f\n\u0011com.gzbz.protobufB\bWarJZMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor, new String[]{"PlayerCode"});
      internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor, new String[]{"BattleNum", "BuyNum", "BuySpecialBag", "Info"});
      internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_warjz_com_gzbz_protobuf_JZInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor, new String[]{"Nation", "LayerId", "PassStatus", "HeroId", "IsLock"});
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor, new String[]{"PlayerCode"});
      internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor, new String[]{"BattleNum", "BuyNum"});
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor, new String[0]);
      internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor, new String[]{"My", "Infos"});
      internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_warjz_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "PlayerId", "Lv", "Head", "Name", "PassSum", "FightVal", "HeadFrame", "ServerId"});
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor, new String[]{"Id"});
      internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor, new String[]{"Nation"});
   }

   public static enum Status implements ProtocolMessageEnum {
      NOT_OPEN(0),
      OPEN(1),
      CLOSE(2);

      public static final int NOT_OPEN_VALUE = 0;
      public static final int OPEN_VALUE = 1;
      public static final int CLOSE_VALUE = 2;
      private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() {
         public Status findValueByNumber(int number) {
            return WarJZMsg.Status.forNumber(number);
         }
      };
      private static final Status[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static Status valueOf(int value) {
         return forNumber(value);
      }

      public static Status forNumber(int value) {
         switch (value) {
            case 0:
               return NOT_OPEN;
            case 1:
               return OPEN;
            case 2:
               return CLOSE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<Status> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)WarJZMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static Status valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private Status(int value) {
         this.value = value;
      }
   }

   public static final class C2S_GetWarJZInfo_9101 extends GeneratedMessageV3 implements C2S_GetWarJZInfo_9101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERCODE_FIELD_NUMBER = 1;
      private int playerCode_;
      private byte memoizedIsInitialized;
      private static final C2S_GetWarJZInfo_9101 DEFAULT_INSTANCE = new C2S_GetWarJZInfo_9101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetWarJZInfo_9101> PARSER = new AbstractParser<C2S_GetWarJZInfo_9101>() {
         public C2S_GetWarJZInfo_9101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetWarJZInfo_9101(input, extensionRegistry);
         }
      };

      private C2S_GetWarJZInfo_9101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetWarJZInfo_9101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetWarJZInfo_9101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetWarJZInfo_9101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerCode_ = input.readInt32();
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWarJZInfo_9101.class, Builder.class);
      }

      public boolean hasPlayerCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerCode() {
         return this.playerCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetWarJZInfo_9101)) {
            return super.equals(obj);
         } else {
            C2S_GetWarJZInfo_9101 other = (C2S_GetWarJZInfo_9101)obj;
            if (this.hasPlayerCode() != other.hasPlayerCode()) {
               return false;
            } else if (this.hasPlayerCode() && this.getPlayerCode() != other.getPlayerCode()) {
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
            if (this.hasPlayerCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarJZInfo_9101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(InputStream input) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWarJZInfo_9101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetWarJZInfo_9101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWarJZInfo_9101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarJZInfo_9101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetWarJZInfo_9101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetWarJZInfo_9101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetWarJZInfo_9101> parser() {
         return PARSER;
      }

      public Parser<C2S_GetWarJZInfo_9101> getParserForType() {
         return PARSER;
      }

      public C2S_GetWarJZInfo_9101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetWarJZInfo_9101OrBuilder {
         private int bitField0_;
         private int playerCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWarJZInfo_9101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.C2S_GetWarJZInfo_9101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_GetWarJZInfo_9101_descriptor;
         }

         public C2S_GetWarJZInfo_9101 getDefaultInstanceForType() {
            return WarJZMsg.C2S_GetWarJZInfo_9101.getDefaultInstance();
         }

         public C2S_GetWarJZInfo_9101 build() {
            C2S_GetWarJZInfo_9101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetWarJZInfo_9101 buildPartial() {
            C2S_GetWarJZInfo_9101 result = new C2S_GetWarJZInfo_9101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerCode_ = this.playerCode_;
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
            if (other instanceof C2S_GetWarJZInfo_9101) {
               return this.mergeFrom((C2S_GetWarJZInfo_9101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetWarJZInfo_9101 other) {
            if (other == WarJZMsg.C2S_GetWarJZInfo_9101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerCode()) {
                  this.setPlayerCode(other.getPlayerCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetWarJZInfo_9101 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetWarJZInfo_9101)WarJZMsg.C2S_GetWarJZInfo_9101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetWarJZInfo_9101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerCode() {
            return this.playerCode_;
         }

         public Builder setPlayerCode(int value) {
            this.bitField0_ |= 1;
            this.playerCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerCode() {
            this.bitField0_ &= -2;
            this.playerCode_ = 0;
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

   public static final class S2C_GetWarJZInfo_9102 extends GeneratedMessageV3 implements S2C_GetWarJZInfo_9102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLENUM_FIELD_NUMBER = 1;
      private int battleNum_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      public static final int BUYSPECIALBAG_FIELD_NUMBER = 3;
      private boolean buySpecialBag_;
      public static final int INFO_FIELD_NUMBER = 4;
      private List<JZInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_GetWarJZInfo_9102 DEFAULT_INSTANCE = new S2C_GetWarJZInfo_9102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetWarJZInfo_9102> PARSER = new AbstractParser<S2C_GetWarJZInfo_9102>() {
         public S2C_GetWarJZInfo_9102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetWarJZInfo_9102(input, extensionRegistry);
         }
      };

      private S2C_GetWarJZInfo_9102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetWarJZInfo_9102() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetWarJZInfo_9102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetWarJZInfo_9102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buySpecialBag_ = input.readBool();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.info_.add(input.readMessage(WarJZMsg.JZInfo.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWarJZInfo_9102.class, Builder.class);
      }

      public boolean hasBattleNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleNum() {
         return this.battleNum_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public boolean hasBuySpecialBag() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getBuySpecialBag() {
         return this.buySpecialBag_;
      }

      public List<JZInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends JZInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public JZInfo getInfo(int index) {
         return (JZInfo)this.info_.get(index);
      }

      public JZInfoOrBuilder getInfoOrBuilder(int index) {
         return (JZInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuySpecialBag()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.battleNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.buySpecialBag_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.info_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.battleNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.buySpecialBag_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetWarJZInfo_9102)) {
            return super.equals(obj);
         } else {
            S2C_GetWarJZInfo_9102 other = (S2C_GetWarJZInfo_9102)obj;
            if (this.hasBattleNum() != other.hasBattleNum()) {
               return false;
            } else if (this.hasBattleNum() && this.getBattleNum() != other.getBattleNum()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else if (this.hasBuySpecialBag() != other.hasBuySpecialBag()) {
               return false;
            } else if (this.hasBuySpecialBag() && this.getBuySpecialBag() != other.getBuySpecialBag()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.hasBattleNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleNum();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            if (this.hasBuySpecialBag()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getBuySpecialBag());
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarJZInfo_9102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(InputStream input) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWarJZInfo_9102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetWarJZInfo_9102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWarJZInfo_9102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarJZInfo_9102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetWarJZInfo_9102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetWarJZInfo_9102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetWarJZInfo_9102> parser() {
         return PARSER;
      }

      public Parser<S2C_GetWarJZInfo_9102> getParserForType() {
         return PARSER;
      }

      public S2C_GetWarJZInfo_9102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetWarJZInfo_9102OrBuilder {
         private int bitField0_;
         private int battleNum_;
         private int buyNum_;
         private boolean buySpecialBag_;
         private List<JZInfo> info_;
         private RepeatedFieldBuilderV3<JZInfo, JZInfo.Builder, JZInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWarJZInfo_9102.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.S2C_GetWarJZInfo_9102.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.battleNum_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            this.buySpecialBag_ = false;
            this.bitField0_ &= -5;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_GetWarJZInfo_9102_descriptor;
         }

         public S2C_GetWarJZInfo_9102 getDefaultInstanceForType() {
            return WarJZMsg.S2C_GetWarJZInfo_9102.getDefaultInstance();
         }

         public S2C_GetWarJZInfo_9102 build() {
            S2C_GetWarJZInfo_9102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetWarJZInfo_9102 buildPartial() {
            S2C_GetWarJZInfo_9102 result = new S2C_GetWarJZInfo_9102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleNum_ = this.battleNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buySpecialBag_ = this.buySpecialBag_;
               to_bitField0_ |= 4;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -9;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_GetWarJZInfo_9102) {
               return this.mergeFrom((S2C_GetWarJZInfo_9102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetWarJZInfo_9102 other) {
            if (other == WarJZMsg.S2C_GetWarJZInfo_9102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleNum()) {
                  this.setBattleNum(other.getBattleNum());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               if (other.hasBuySpecialBag()) {
                  this.setBuySpecialBag(other.getBuySpecialBag());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -9;
                     this.infoBuilder_ = WarJZMsg.S2C_GetWarJZInfo_9102.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleNum()) {
               return false;
            } else if (!this.hasBuyNum()) {
               return false;
            } else if (!this.hasBuySpecialBag()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetWarJZInfo_9102 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetWarJZInfo_9102)WarJZMsg.S2C_GetWarJZInfo_9102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetWarJZInfo_9102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleNum() {
            return this.battleNum_;
         }

         public Builder setBattleNum(int value) {
            this.bitField0_ |= 1;
            this.battleNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleNum() {
            this.bitField0_ &= -2;
            this.battleNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuySpecialBag() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getBuySpecialBag() {
            return this.buySpecialBag_;
         }

         public Builder setBuySpecialBag(boolean value) {
            this.bitField0_ |= 4;
            this.buySpecialBag_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuySpecialBag() {
            this.bitField0_ &= -5;
            this.buySpecialBag_ = false;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 8;
            }

         }

         public List<JZInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public JZInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (JZInfo)this.info_.get(index) : (JZInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, JZInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, JZInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(JZInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, JZInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(JZInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, JZInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends JZInfo> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public JZInfo.Builder getInfoBuilder(int index) {
            return (JZInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public JZInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (JZInfoOrBuilder)this.info_.get(index) : (JZInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends JZInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public JZInfo.Builder addInfoBuilder() {
            return (JZInfo.Builder)this.getInfoFieldBuilder().addBuilder(WarJZMsg.JZInfo.getDefaultInstance());
         }

         public JZInfo.Builder addInfoBuilder(int index) {
            return (JZInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, WarJZMsg.JZInfo.getDefaultInstance());
         }

         public List<JZInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<JZInfo, JZInfo.Builder, JZInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class JZInfo extends GeneratedMessageV3 implements JZInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NATION_FIELD_NUMBER = 1;
      private int nation_;
      public static final int LAYERID_FIELD_NUMBER = 2;
      private int layerId_;
      public static final int PASSSTATUS_FIELD_NUMBER = 3;
      private int passStatus_;
      public static final int HEROID_FIELD_NUMBER = 4;
      private int heroId_;
      public static final int ISLOCK_FIELD_NUMBER = 5;
      private boolean isLock_;
      private byte memoizedIsInitialized;
      private static final JZInfo DEFAULT_INSTANCE = new JZInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<JZInfo> PARSER = new AbstractParser<JZInfo>() {
         public JZInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new JZInfo(input, extensionRegistry);
         }
      };

      private JZInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private JZInfo() {
         this.memoizedIsInitialized = -1;
         this.passStatus_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new JZInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private JZInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.nation_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.layerId_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        Status value = WarJZMsg.Status.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.passStatus_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.heroId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isLock_ = input.readBool();
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_JZInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(JZInfo.class, Builder.class);
      }

      public boolean hasNation() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNation() {
         return this.nation_;
      }

      public boolean hasLayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLayerId() {
         return this.layerId_;
      }

      public boolean hasPassStatus() {
         return (this.bitField0_ & 4) != 0;
      }

      public Status getPassStatus() {
         Status result = WarJZMsg.Status.valueOf(this.passStatus_);
         return result == null ? WarJZMsg.Status.NOT_OPEN : result;
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasIsLock() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsLock() {
         return this.isLock_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassStatus()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.nation_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.layerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.passStatus_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.heroId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isLock_);
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
               size += CodedOutputStream.computeInt32Size(1, this.nation_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.layerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.passStatus_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isLock_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof JZInfo)) {
            return super.equals(obj);
         } else {
            JZInfo other = (JZInfo)obj;
            if (this.hasNation() != other.hasNation()) {
               return false;
            } else if (this.hasNation() && this.getNation() != other.getNation()) {
               return false;
            } else if (this.hasLayerId() != other.hasLayerId()) {
               return false;
            } else if (this.hasLayerId() && this.getLayerId() != other.getLayerId()) {
               return false;
            } else if (this.hasPassStatus() != other.hasPassStatus()) {
               return false;
            } else if (this.hasPassStatus() && this.passStatus_ != other.passStatus_) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasIsLock() != other.hasIsLock()) {
               return false;
            } else if (this.hasIsLock() && this.getIsLock() != other.getIsLock()) {
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
            if (this.hasNation()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNation();
            }

            if (this.hasLayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLayerId();
            }

            if (this.hasPassStatus()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.passStatus_;
            }

            if (this.hasHeroId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasIsLock()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsLock());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static JZInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data);
      }

      public static JZInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static JZInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data);
      }

      public static JZInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static JZInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data);
      }

      public static JZInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (JZInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static JZInfo parseFrom(InputStream input) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static JZInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static JZInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static JZInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static JZInfo parseFrom(CodedInputStream input) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static JZInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (JZInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(JZInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static JZInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<JZInfo> parser() {
         return PARSER;
      }

      public Parser<JZInfo> getParserForType() {
         return PARSER;
      }

      public JZInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements JZInfoOrBuilder {
         private int bitField0_;
         private int nation_;
         private int layerId_;
         private int passStatus_;
         private int heroId_;
         private boolean isLock_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_JZInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(JZInfo.class, Builder.class);
         }

         private Builder() {
            this.passStatus_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passStatus_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.JZInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.nation_ = 0;
            this.bitField0_ &= -2;
            this.layerId_ = 0;
            this.bitField0_ &= -3;
            this.passStatus_ = 0;
            this.bitField0_ &= -5;
            this.heroId_ = 0;
            this.bitField0_ &= -9;
            this.isLock_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_JZInfo_descriptor;
         }

         public JZInfo getDefaultInstanceForType() {
            return WarJZMsg.JZInfo.getDefaultInstance();
         }

         public JZInfo build() {
            JZInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public JZInfo buildPartial() {
            JZInfo result = new JZInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.nation_ = this.nation_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.layerId_ = this.layerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.passStatus_ = this.passStatus_;
            if ((from_bitField0_ & 8) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isLock_ = this.isLock_;
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
            if (other instanceof JZInfo) {
               return this.mergeFrom((JZInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(JZInfo other) {
            if (other == WarJZMsg.JZInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNation()) {
                  this.setNation(other.getNation());
               }

               if (other.hasLayerId()) {
                  this.setLayerId(other.getLayerId());
               }

               if (other.hasPassStatus()) {
                  this.setPassStatus(other.getPassStatus());
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasIsLock()) {
                  this.setIsLock(other.getIsLock());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNation()) {
               return false;
            } else if (!this.hasLayerId()) {
               return false;
            } else if (!this.hasPassStatus()) {
               return false;
            } else {
               return this.hasHeroId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            JZInfo parsedMessage = null;

            try {
               parsedMessage = (JZInfo)WarJZMsg.JZInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (JZInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNation() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNation() {
            return this.nation_;
         }

         public Builder setNation(int value) {
            this.bitField0_ |= 1;
            this.nation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNation() {
            this.bitField0_ &= -2;
            this.nation_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLayerId() {
            return this.layerId_;
         }

         public Builder setLayerId(int value) {
            this.bitField0_ |= 2;
            this.layerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLayerId() {
            this.bitField0_ &= -3;
            this.layerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPassStatus() {
            return (this.bitField0_ & 4) != 0;
         }

         public Status getPassStatus() {
            Status result = WarJZMsg.Status.valueOf(this.passStatus_);
            return result == null ? WarJZMsg.Status.NOT_OPEN : result;
         }

         public Builder setPassStatus(Status value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.passStatus_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPassStatus() {
            this.bitField0_ &= -5;
            this.passStatus_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 8;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -9;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsLock() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsLock() {
            return this.isLock_;
         }

         public Builder setIsLock(boolean value) {
            this.bitField0_ |= 16;
            this.isLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsLock() {
            this.bitField0_ &= -17;
            this.isLock_ = false;
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

   public static final class C2S_WarJZBuy_9105 extends GeneratedMessageV3 implements C2S_WarJZBuy_9105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERCODE_FIELD_NUMBER = 1;
      private int playerCode_;
      private byte memoizedIsInitialized;
      private static final C2S_WarJZBuy_9105 DEFAULT_INSTANCE = new C2S_WarJZBuy_9105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarJZBuy_9105> PARSER = new AbstractParser<C2S_WarJZBuy_9105>() {
         public C2S_WarJZBuy_9105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarJZBuy_9105(input, extensionRegistry);
         }
      };

      private C2S_WarJZBuy_9105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarJZBuy_9105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarJZBuy_9105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarJZBuy_9105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerCode_ = input.readInt32();
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZBuy_9105.class, Builder.class);
      }

      public boolean hasPlayerCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerCode() {
         return this.playerCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarJZBuy_9105)) {
            return super.equals(obj);
         } else {
            C2S_WarJZBuy_9105 other = (C2S_WarJZBuy_9105)obj;
            if (this.hasPlayerCode() != other.hasPlayerCode()) {
               return false;
            } else if (this.hasPlayerCode() && this.getPlayerCode() != other.getPlayerCode()) {
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
            if (this.hasPlayerCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarJZBuy_9105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data);
      }

      public static C2S_WarJZBuy_9105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZBuy_9105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data);
      }

      public static C2S_WarJZBuy_9105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZBuy_9105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data);
      }

      public static C2S_WarJZBuy_9105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZBuy_9105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZBuy_9105 parseFrom(InputStream input) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZBuy_9105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZBuy_9105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarJZBuy_9105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZBuy_9105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZBuy_9105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZBuy_9105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarJZBuy_9105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarJZBuy_9105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarJZBuy_9105> parser() {
         return PARSER;
      }

      public Parser<C2S_WarJZBuy_9105> getParserForType() {
         return PARSER;
      }

      public C2S_WarJZBuy_9105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarJZBuy_9105OrBuilder {
         private int bitField0_;
         private int playerCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZBuy_9105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.C2S_WarJZBuy_9105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZBuy_9105_descriptor;
         }

         public C2S_WarJZBuy_9105 getDefaultInstanceForType() {
            return WarJZMsg.C2S_WarJZBuy_9105.getDefaultInstance();
         }

         public C2S_WarJZBuy_9105 build() {
            C2S_WarJZBuy_9105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarJZBuy_9105 buildPartial() {
            C2S_WarJZBuy_9105 result = new C2S_WarJZBuy_9105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerCode_ = this.playerCode_;
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
            if (other instanceof C2S_WarJZBuy_9105) {
               return this.mergeFrom((C2S_WarJZBuy_9105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarJZBuy_9105 other) {
            if (other == WarJZMsg.C2S_WarJZBuy_9105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerCode()) {
                  this.setPlayerCode(other.getPlayerCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarJZBuy_9105 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarJZBuy_9105)WarJZMsg.C2S_WarJZBuy_9105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarJZBuy_9105)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerCode() {
            return this.playerCode_;
         }

         public Builder setPlayerCode(int value) {
            this.bitField0_ |= 1;
            this.playerCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerCode() {
            this.bitField0_ &= -2;
            this.playerCode_ = 0;
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

   public static final class S2C_WarJZBuy_9106 extends GeneratedMessageV3 implements S2C_WarJZBuy_9106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLENUM_FIELD_NUMBER = 1;
      private int battleNum_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_WarJZBuy_9106 DEFAULT_INSTANCE = new S2C_WarJZBuy_9106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarJZBuy_9106> PARSER = new AbstractParser<S2C_WarJZBuy_9106>() {
         public S2C_WarJZBuy_9106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarJZBuy_9106(input, extensionRegistry);
         }
      };

      private S2C_WarJZBuy_9106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarJZBuy_9106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarJZBuy_9106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarJZBuy_9106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarJZBuy_9106.class, Builder.class);
      }

      public boolean hasBattleNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleNum() {
         return this.battleNum_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarJZBuy_9106)) {
            return super.equals(obj);
         } else {
            S2C_WarJZBuy_9106 other = (S2C_WarJZBuy_9106)obj;
            if (this.hasBattleNum() != other.hasBattleNum()) {
               return false;
            } else if (this.hasBattleNum() && this.getBattleNum() != other.getBattleNum()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
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
            if (this.hasBattleNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleNum();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarJZBuy_9106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data);
      }

      public static S2C_WarJZBuy_9106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZBuy_9106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data);
      }

      public static S2C_WarJZBuy_9106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZBuy_9106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data);
      }

      public static S2C_WarJZBuy_9106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZBuy_9106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZBuy_9106 parseFrom(InputStream input) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarJZBuy_9106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarJZBuy_9106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarJZBuy_9106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarJZBuy_9106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarJZBuy_9106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZBuy_9106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarJZBuy_9106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarJZBuy_9106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarJZBuy_9106> parser() {
         return PARSER;
      }

      public Parser<S2C_WarJZBuy_9106> getParserForType() {
         return PARSER;
      }

      public S2C_WarJZBuy_9106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarJZBuy_9106OrBuilder {
         private int bitField0_;
         private int battleNum_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarJZBuy_9106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.S2C_WarJZBuy_9106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battleNum_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZBuy_9106_descriptor;
         }

         public S2C_WarJZBuy_9106 getDefaultInstanceForType() {
            return WarJZMsg.S2C_WarJZBuy_9106.getDefaultInstance();
         }

         public S2C_WarJZBuy_9106 build() {
            S2C_WarJZBuy_9106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarJZBuy_9106 buildPartial() {
            S2C_WarJZBuy_9106 result = new S2C_WarJZBuy_9106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleNum_ = this.battleNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2C_WarJZBuy_9106) {
               return this.mergeFrom((S2C_WarJZBuy_9106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarJZBuy_9106 other) {
            if (other == WarJZMsg.S2C_WarJZBuy_9106.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleNum()) {
                  this.setBattleNum(other.getBattleNum());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleNum()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarJZBuy_9106 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarJZBuy_9106)WarJZMsg.S2C_WarJZBuy_9106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarJZBuy_9106)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleNum() {
            return this.battleNum_;
         }

         public Builder setBattleNum(int value) {
            this.bitField0_ |= 1;
            this.battleNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleNum() {
            this.bitField0_ &= -2;
            this.battleNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
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

   public static final class C2S_WarJZRank_9107 extends GeneratedMessageV3 implements C2S_WarJZRank_9107OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarJZRank_9107 DEFAULT_INSTANCE = new C2S_WarJZRank_9107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarJZRank_9107> PARSER = new AbstractParser<C2S_WarJZRank_9107>() {
         public C2S_WarJZRank_9107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarJZRank_9107(input, extensionRegistry);
         }
      };

      private C2S_WarJZRank_9107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarJZRank_9107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarJZRank_9107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarJZRank_9107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZRank_9107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarJZRank_9107)) {
            return super.equals(obj);
         } else {
            C2S_WarJZRank_9107 other = (C2S_WarJZRank_9107)obj;
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

      public static C2S_WarJZRank_9107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data);
      }

      public static C2S_WarJZRank_9107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZRank_9107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data);
      }

      public static C2S_WarJZRank_9107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZRank_9107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data);
      }

      public static C2S_WarJZRank_9107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZRank_9107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZRank_9107 parseFrom(InputStream input) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZRank_9107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZRank_9107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarJZRank_9107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZRank_9107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZRank_9107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZRank_9107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarJZRank_9107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarJZRank_9107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarJZRank_9107> parser() {
         return PARSER;
      }

      public Parser<C2S_WarJZRank_9107> getParserForType() {
         return PARSER;
      }

      public C2S_WarJZRank_9107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarJZRank_9107OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZRank_9107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.C2S_WarJZRank_9107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZRank_9107_descriptor;
         }

         public C2S_WarJZRank_9107 getDefaultInstanceForType() {
            return WarJZMsg.C2S_WarJZRank_9107.getDefaultInstance();
         }

         public C2S_WarJZRank_9107 build() {
            C2S_WarJZRank_9107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarJZRank_9107 buildPartial() {
            C2S_WarJZRank_9107 result = new C2S_WarJZRank_9107(this);
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
            if (other instanceof C2S_WarJZRank_9107) {
               return this.mergeFrom((C2S_WarJZRank_9107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarJZRank_9107 other) {
            if (other == WarJZMsg.C2S_WarJZRank_9107.getDefaultInstance()) {
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
            C2S_WarJZRank_9107 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarJZRank_9107)WarJZMsg.C2S_WarJZRank_9107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarJZRank_9107)e.getUnfinishedMessage();
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

   public static final class S2C_WarJZRank_9108 extends GeneratedMessageV3 implements S2C_WarJZRank_9108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MY_FIELD_NUMBER = 1;
      private RankInfo my_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<RankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_WarJZRank_9108 DEFAULT_INSTANCE = new S2C_WarJZRank_9108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarJZRank_9108> PARSER = new AbstractParser<S2C_WarJZRank_9108>() {
         public S2C_WarJZRank_9108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarJZRank_9108(input, extensionRegistry);
         }
      };

      private S2C_WarJZRank_9108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarJZRank_9108() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarJZRank_9108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarJZRank_9108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.my_.toBuilder();
                        }

                        this.my_ = (RankInfo)input.readMessage(WarJZMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.my_);
                           this.my_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(WarJZMsg.RankInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarJZRank_9108.class, Builder.class);
      }

      public boolean hasMy() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankInfo getMy() {
         return this.my_ == null ? WarJZMsg.RankInfo.getDefaultInstance() : this.my_;
      }

      public RankInfoOrBuilder getMyOrBuilder() {
         return this.my_ == null ? WarJZMsg.RankInfo.getDefaultInstance() : this.my_;
      }

      public List<RankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public RankInfo getInfos(int index) {
         return (RankInfo)this.infos_.get(index);
      }

      public RankInfoOrBuilder getInfosOrBuilder(int index) {
         return (RankInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMy().isInitialized()) {
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
            output.writeMessage(1, this.getMy());
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getMy());
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarJZRank_9108)) {
            return super.equals(obj);
         } else {
            S2C_WarJZRank_9108 other = (S2C_WarJZRank_9108)obj;
            if (this.hasMy() != other.hasMy()) {
               return false;
            } else if (this.hasMy() && !this.getMy().equals(other.getMy())) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.hasMy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMy().hashCode();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarJZRank_9108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data);
      }

      public static S2C_WarJZRank_9108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZRank_9108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data);
      }

      public static S2C_WarJZRank_9108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZRank_9108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data);
      }

      public static S2C_WarJZRank_9108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarJZRank_9108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarJZRank_9108 parseFrom(InputStream input) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarJZRank_9108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarJZRank_9108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarJZRank_9108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarJZRank_9108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarJZRank_9108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarJZRank_9108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarJZRank_9108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarJZRank_9108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarJZRank_9108> parser() {
         return PARSER;
      }

      public Parser<S2C_WarJZRank_9108> getParserForType() {
         return PARSER;
      }

      public S2C_WarJZRank_9108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarJZRank_9108OrBuilder {
         private int bitField0_;
         private RankInfo my_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myBuilder_;
         private List<RankInfo> infos_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarJZRank_9108.class, Builder.class);
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
            if (WarJZMsg.S2C_WarJZRank_9108.alwaysUseFieldBuilders) {
               this.getMyFieldBuilder();
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myBuilder_ == null) {
               this.my_ = null;
            } else {
               this.myBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_S2C_WarJZRank_9108_descriptor;
         }

         public S2C_WarJZRank_9108 getDefaultInstanceForType() {
            return WarJZMsg.S2C_WarJZRank_9108.getDefaultInstance();
         }

         public S2C_WarJZRank_9108 build() {
            S2C_WarJZRank_9108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarJZRank_9108 buildPartial() {
            S2C_WarJZRank_9108 result = new S2C_WarJZRank_9108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.myBuilder_ == null) {
                  result.my_ = this.my_;
               } else {
                  result.my_ = (RankInfo)this.myBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_WarJZRank_9108) {
               return this.mergeFrom((S2C_WarJZRank_9108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarJZRank_9108 other) {
            if (other == WarJZMsg.S2C_WarJZRank_9108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMy()) {
                  this.mergeMy(other.getMy());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = WarJZMsg.S2C_WarJZRank_9108.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMy()) {
               return false;
            } else if (!this.getMy().isInitialized()) {
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
            S2C_WarJZRank_9108 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarJZRank_9108)WarJZMsg.S2C_WarJZRank_9108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarJZRank_9108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMy() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankInfo getMy() {
            if (this.myBuilder_ == null) {
               return this.my_ == null ? WarJZMsg.RankInfo.getDefaultInstance() : this.my_;
            } else {
               return (RankInfo)this.myBuilder_.getMessage();
            }
         }

         public Builder setMy(RankInfo value) {
            if (this.myBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.my_ = value;
               this.onChanged();
            } else {
               this.myBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMy(RankInfo.Builder builderForValue) {
            if (this.myBuilder_ == null) {
               this.my_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMy(RankInfo value) {
            if (this.myBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.my_ != null && this.my_ != WarJZMsg.RankInfo.getDefaultInstance()) {
                  this.my_ = WarJZMsg.RankInfo.newBuilder(this.my_).mergeFrom(value).buildPartial();
               } else {
                  this.my_ = value;
               }

               this.onChanged();
            } else {
               this.myBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMy() {
            if (this.myBuilder_ == null) {
               this.my_ = null;
               this.onChanged();
            } else {
               this.myBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public RankInfo.Builder getMyBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (RankInfo.Builder)this.getMyFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyOrBuilder() {
            if (this.myBuilder_ != null) {
               return (RankInfoOrBuilder)this.myBuilder_.getMessageOrBuilder();
            } else {
               return this.my_ == null ? WarJZMsg.RankInfo.getDefaultInstance() : this.my_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyFieldBuilder() {
            if (this.myBuilder_ == null) {
               this.myBuilder_ = new SingleFieldBuilderV3(this.getMy(), this.getParentForChildren(), this.isClean());
               this.my_ = null;
            }

            return this.myBuilder_;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public RankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (RankInfo)this.infos_.get(index) : (RankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, RankInfo value) {
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

         public Builder setInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(RankInfo value) {
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

         public Builder addInfos(int index, RankInfo value) {
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

         public Builder addInfos(RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends RankInfo> values) {
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
               this.bitField0_ &= -3;
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

         public RankInfo.Builder getInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (RankInfoOrBuilder)this.infos_.get(index) : (RankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public RankInfo.Builder addInfosBuilder() {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(WarJZMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, WarJZMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int PASSSUM_FIELD_NUMBER = 6;
      private int passSum_;
      public static final int FIGHTVAL_FIELD_NUMBER = 7;
      private long fightVal_;
      public static final int HEADFRAME_FIELD_NUMBER = 8;
      private int headFrame_;
      public static final int SERVERID_FIELD_NUMBER = 9;
      private int serverId_;
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
         this.name_ = "";
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.name_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.passSum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.fightVal_ = input.readInt64();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 16) != 0;
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

      public boolean hasPassSum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getPassSum() {
         return this.passSum_;
      }

      public boolean hasFightVal() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getFightVal() {
         return this.fightVal_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 256) != 0;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
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
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.passSum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(7, this.fightVal_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.headFrame_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.passSum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.fightVal_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.headFrame_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.serverId_);
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
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasPassSum() != other.hasPassSum()) {
               return false;
            } else if (this.hasPassSum() && this.getPassSum() != other.getPassSum()) {
               return false;
            } else if (this.hasFightVal() != other.hasFightVal()) {
               return false;
            } else if (this.hasFightVal() && this.getFightVal() != other.getFightVal()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasPassSum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPassSum();
            }

            if (this.hasFightVal()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getFightVal());
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServerId();
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
         private int playerId_;
         private int lv_;
         private int head_;
         private Object name_;
         private int passSum_;
         private long fightVal_;
         private int headFrame_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.name_ = "";
            this.bitField0_ &= -17;
            this.passSum_ = 0;
            this.bitField0_ &= -33;
            this.fightVal_ = 0L;
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.bitField0_ &= -129;
            this.serverId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return WarJZMsg.RankInfo.getDefaultInstance();
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
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 32) != 0) {
               result.passSum_ = this.passSum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.fightVal_ = this.fightVal_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 256;
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
            if (other == WarJZMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 16;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasPassSum()) {
                  this.setPassSum(other.getPassSum());
               }

               if (other.hasFightVal()) {
                  this.setFightVal(other.getFightVal());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
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
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasPassSum()) {
               return false;
            } else if (!this.hasFightVal()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)WarJZMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
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

         public boolean hasName() {
            return (this.bitField0_ & 16) != 0;
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
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -17;
            this.name_ = WarJZMsg.RankInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPassSum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getPassSum() {
            return this.passSum_;
         }

         public Builder setPassSum(int value) {
            this.bitField0_ |= 32;
            this.passSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassSum() {
            this.bitField0_ &= -33;
            this.passSum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightVal() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getFightVal() {
            return this.fightVal_;
         }

         public Builder setFightVal(long value) {
            this.bitField0_ |= 64;
            this.fightVal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightVal() {
            this.bitField0_ &= -65;
            this.fightVal_ = 0L;
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

         public boolean hasServerId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 256;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -257;
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

   public static final class C2S_WarJZSweep_9109 extends GeneratedMessageV3 implements C2S_WarJZSweep_9109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_WarJZSweep_9109 DEFAULT_INSTANCE = new C2S_WarJZSweep_9109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarJZSweep_9109> PARSER = new AbstractParser<C2S_WarJZSweep_9109>() {
         public C2S_WarJZSweep_9109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarJZSweep_9109(input, extensionRegistry);
         }
      };

      private C2S_WarJZSweep_9109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarJZSweep_9109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarJZSweep_9109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarJZSweep_9109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZSweep_9109.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarJZSweep_9109)) {
            return super.equals(obj);
         } else {
            C2S_WarJZSweep_9109 other = (C2S_WarJZSweep_9109)obj;
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

      public static C2S_WarJZSweep_9109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data);
      }

      public static C2S_WarJZSweep_9109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZSweep_9109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data);
      }

      public static C2S_WarJZSweep_9109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZSweep_9109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data);
      }

      public static C2S_WarJZSweep_9109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarJZSweep_9109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarJZSweep_9109 parseFrom(InputStream input) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZSweep_9109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZSweep_9109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarJZSweep_9109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarJZSweep_9109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarJZSweep_9109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarJZSweep_9109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarJZSweep_9109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarJZSweep_9109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarJZSweep_9109> parser() {
         return PARSER;
      }

      public Parser<C2S_WarJZSweep_9109> getParserForType() {
         return PARSER;
      }

      public C2S_WarJZSweep_9109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarJZSweep_9109OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarJZSweep_9109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.C2S_WarJZSweep_9109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_WarJZSweep_9109_descriptor;
         }

         public C2S_WarJZSweep_9109 getDefaultInstanceForType() {
            return WarJZMsg.C2S_WarJZSweep_9109.getDefaultInstance();
         }

         public C2S_WarJZSweep_9109 build() {
            C2S_WarJZSweep_9109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarJZSweep_9109 buildPartial() {
            C2S_WarJZSweep_9109 result = new C2S_WarJZSweep_9109(this);
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
            if (other instanceof C2S_WarJZSweep_9109) {
               return this.mergeFrom((C2S_WarJZSweep_9109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarJZSweep_9109 other) {
            if (other == WarJZMsg.C2S_WarJZSweep_9109.getDefaultInstance()) {
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
            C2S_WarJZSweep_9109 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarJZSweep_9109)WarJZMsg.C2S_WarJZSweep_9109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarJZSweep_9109)e.getUnfinishedMessage();
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

   public static final class C2S_AllSweep_9110 extends GeneratedMessageV3 implements C2S_AllSweep_9110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NATION_FIELD_NUMBER = 1;
      private int nation_;
      private byte memoizedIsInitialized;
      private static final C2S_AllSweep_9110 DEFAULT_INSTANCE = new C2S_AllSweep_9110();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AllSweep_9110> PARSER = new AbstractParser<C2S_AllSweep_9110>() {
         public C2S_AllSweep_9110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AllSweep_9110(input, extensionRegistry);
         }
      };

      private C2S_AllSweep_9110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AllSweep_9110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AllSweep_9110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AllSweep_9110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.nation_ = input.readInt32();
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
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AllSweep_9110.class, Builder.class);
      }

      public boolean hasNation() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNation() {
         return this.nation_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.nation_);
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
               size += CodedOutputStream.computeInt32Size(1, this.nation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AllSweep_9110)) {
            return super.equals(obj);
         } else {
            C2S_AllSweep_9110 other = (C2S_AllSweep_9110)obj;
            if (this.hasNation() != other.hasNation()) {
               return false;
            } else if (this.hasNation() && this.getNation() != other.getNation()) {
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
            if (this.hasNation()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNation();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AllSweep_9110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data);
      }

      public static C2S_AllSweep_9110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllSweep_9110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data);
      }

      public static C2S_AllSweep_9110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllSweep_9110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data);
      }

      public static C2S_AllSweep_9110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllSweep_9110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllSweep_9110 parseFrom(InputStream input) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AllSweep_9110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AllSweep_9110 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AllSweep_9110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AllSweep_9110 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AllSweep_9110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllSweep_9110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AllSweep_9110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AllSweep_9110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AllSweep_9110> parser() {
         return PARSER;
      }

      public Parser<C2S_AllSweep_9110> getParserForType() {
         return PARSER;
      }

      public C2S_AllSweep_9110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AllSweep_9110OrBuilder {
         private int bitField0_;
         private int nation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AllSweep_9110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarJZMsg.C2S_AllSweep_9110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.nation_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarJZMsg.internal_static_warjz_com_gzbz_protobuf_C2S_AllSweep_9110_descriptor;
         }

         public C2S_AllSweep_9110 getDefaultInstanceForType() {
            return WarJZMsg.C2S_AllSweep_9110.getDefaultInstance();
         }

         public C2S_AllSweep_9110 build() {
            C2S_AllSweep_9110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AllSweep_9110 buildPartial() {
            C2S_AllSweep_9110 result = new C2S_AllSweep_9110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.nation_ = this.nation_;
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
            if (other instanceof C2S_AllSweep_9110) {
               return this.mergeFrom((C2S_AllSweep_9110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AllSweep_9110 other) {
            if (other == WarJZMsg.C2S_AllSweep_9110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNation()) {
                  this.setNation(other.getNation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNation();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AllSweep_9110 parsedMessage = null;

            try {
               parsedMessage = (C2S_AllSweep_9110)WarJZMsg.C2S_AllSweep_9110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AllSweep_9110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNation() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNation() {
            return this.nation_;
         }

         public Builder setNation(int value) {
            this.bitField0_ |= 1;
            this.nation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNation() {
            this.bitField0_ &= -2;
            this.nation_ = 0;
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

   public interface C2S_AllSweep_9110OrBuilder extends MessageOrBuilder {
      boolean hasNation();

      int getNation();
   }

   public interface C2S_GetWarJZInfo_9101OrBuilder extends MessageOrBuilder {
      boolean hasPlayerCode();

      int getPlayerCode();
   }

   public interface C2S_WarJZBuy_9105OrBuilder extends MessageOrBuilder {
      boolean hasPlayerCode();

      int getPlayerCode();
   }

   public interface C2S_WarJZRank_9107OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarJZSweep_9109OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface JZInfoOrBuilder extends MessageOrBuilder {
      boolean hasNation();

      int getNation();

      boolean hasLayerId();

      int getLayerId();

      boolean hasPassStatus();

      Status getPassStatus();

      boolean hasHeroId();

      int getHeroId();

      boolean hasIsLock();

      boolean getIsLock();
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasLv();

      int getLv();

      boolean hasHead();

      int getHead();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasPassSum();

      int getPassSum();

      boolean hasFightVal();

      long getFightVal();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasServerId();

      int getServerId();
   }

   public interface S2C_GetWarJZInfo_9102OrBuilder extends MessageOrBuilder {
      boolean hasBattleNum();

      int getBattleNum();

      boolean hasBuyNum();

      int getBuyNum();

      boolean hasBuySpecialBag();

      boolean getBuySpecialBag();

      List<JZInfo> getInfoList();

      JZInfo getInfo(int index);

      int getInfoCount();

      List<? extends JZInfoOrBuilder> getInfoOrBuilderList();

      JZInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_WarJZBuy_9106OrBuilder extends MessageOrBuilder {
      boolean hasBattleNum();

      int getBattleNum();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2C_WarJZRank_9108OrBuilder extends MessageOrBuilder {
      boolean hasMy();

      RankInfo getMy();

      RankInfoOrBuilder getMyOrBuilder();

      List<RankInfo> getInfosList();

      RankInfo getInfos(int index);

      int getInfosCount();

      List<? extends RankInfoOrBuilder> getInfosOrBuilderList();

      RankInfoOrBuilder getInfosOrBuilder(int index);
   }
}
