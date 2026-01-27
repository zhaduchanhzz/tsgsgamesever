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

public final class BarbarianMsg {
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BarbarianMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fBarbarian.proto\u0012\u001bbarbarian.com.gzbz.protobuf\u001a\nRank.proto\"\u0018\n\u0016C2S_BarbarianInfo_9301\"É\u0001\n\u0016S2C_BarbarianInfo_9302\u0012\u0011\n\tmaxDamage\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005count\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0004 \u0002(\u0005\u0012/\n\u0005ranks\u0018\u0005 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012\u000e\n\u0006myRank\u0018\u0006 \u0002(\u0005\u0012\u0015\n\rmyTotalDamage\u0018\u0007 \u0002(\u0003\u0012\u000e\n\u0006bossId\u0018\b \u0002(\u0005\"\u001b\n\u0019C2S_BarbarianCrusade_9303\"^\n\u0019S2C_BarbarianCrusade_9304\u0012A\n\u0004info\u0018\u0001 \u0002(\u000b23.barbarian.com.gzbz.protobuf.S2C_BarbarianInfo_9302\"\u0017\n\u0015C2S_BarbarianBuy_9305\"8\n\u0015S2C_BarbarianBuy_9306\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_BarbarianSwapOneKey_9307\"a\n\u001cS2C_BarbarianSwapOneKey_9308\u0012A\n\u0004info\u0018\u0001 \u0002(\u000b23.barbarian.com.gzbz.protobuf.S2C_BarbarianInfo_9302B#\n\u0011com.gzbz.protobufB\fBarbarianMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor, new String[0]);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor, new String[]{"MaxDamage", "TotalDamage", "Count", "BuyCount", "Ranks", "MyRank", "MyTotalDamage", "BossId"});
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor, new String[0]);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor, new String[]{"Info"});
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor, new String[0]);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor, new String[]{"Count", "BuyCount"});
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor, new String[0]);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor, new String[]{"Info"});
      RankMsg.getDescriptor();
   }

   public static final class C2S_BarbarianInfo_9301 extends GeneratedMessageV3 implements C2S_BarbarianInfo_9301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianInfo_9301 DEFAULT_INSTANCE = new C2S_BarbarianInfo_9301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianInfo_9301> PARSER = new AbstractParser<C2S_BarbarianInfo_9301>() {
         public C2S_BarbarianInfo_9301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianInfo_9301(input, extensionRegistry);
         }
      };

      private C2S_BarbarianInfo_9301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianInfo_9301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianInfo_9301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianInfo_9301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_9301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianInfo_9301)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianInfo_9301 other = (C2S_BarbarianInfo_9301)obj;
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

      public static C2S_BarbarianInfo_9301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianInfo_9301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_9301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_9301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianInfo_9301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianInfo_9301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianInfo_9301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianInfo_9301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianInfo_9301> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianInfo_9301> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianInfo_9301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianInfo_9301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianInfo_9301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.C2S_BarbarianInfo_9301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianInfo_9301_descriptor;
         }

         public C2S_BarbarianInfo_9301 getDefaultInstanceForType() {
            return BarbarianMsg.C2S_BarbarianInfo_9301.getDefaultInstance();
         }

         public C2S_BarbarianInfo_9301 build() {
            C2S_BarbarianInfo_9301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianInfo_9301 buildPartial() {
            C2S_BarbarianInfo_9301 result = new C2S_BarbarianInfo_9301(this);
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
            if (other instanceof C2S_BarbarianInfo_9301) {
               return this.mergeFrom((C2S_BarbarianInfo_9301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianInfo_9301 other) {
            if (other == BarbarianMsg.C2S_BarbarianInfo_9301.getDefaultInstance()) {
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
            C2S_BarbarianInfo_9301 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianInfo_9301)BarbarianMsg.C2S_BarbarianInfo_9301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianInfo_9301)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianInfo_9302 extends GeneratedMessageV3 implements S2C_BarbarianInfo_9302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAXDAMAGE_FIELD_NUMBER = 1;
      private long maxDamage_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 2;
      private long totalDamage_;
      public static final int COUNT_FIELD_NUMBER = 3;
      private int count_;
      public static final int BUYCOUNT_FIELD_NUMBER = 4;
      private int buyCount_;
      public static final int RANKS_FIELD_NUMBER = 5;
      private List<RankMsg.RankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 6;
      private int myRank_;
      public static final int MYTOTALDAMAGE_FIELD_NUMBER = 7;
      private long myTotalDamage_;
      public static final int BOSSID_FIELD_NUMBER = 8;
      private int bossId_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianInfo_9302 DEFAULT_INSTANCE = new S2C_BarbarianInfo_9302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianInfo_9302> PARSER = new AbstractParser<S2C_BarbarianInfo_9302>() {
         public S2C_BarbarianInfo_9302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianInfo_9302(input, extensionRegistry);
         }
      };

      private S2C_BarbarianInfo_9302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianInfo_9302() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianInfo_9302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianInfo_9302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.maxDamage_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalDamage_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.count_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.buyCount_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.myRank_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.myTotalDamage_ = input.readInt64();
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.bossId_ = input.readInt32();
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_9302.class, Builder.class);
      }

      public boolean hasMaxDamage() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getMaxDamage() {
         return this.maxDamage_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
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

      public boolean hasMyRank() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getMyRank() {
         return this.myRank_;
      }

      public boolean hasMyTotalDamage() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getMyTotalDamage() {
         return this.myTotalDamage_;
      }

      public boolean hasBossId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getBossId() {
         return this.bossId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMaxDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBossId()) {
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
            output.writeInt64(1, this.maxDamage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.totalDamage_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.count_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.buyCount_);
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.myRank_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(7, this.myTotalDamage_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(8, this.bossId_);
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
               size += CodedOutputStream.computeInt64Size(1, this.maxDamage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.totalDamage_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.count_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.buyCount_);
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.ranks_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.myRank_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.myTotalDamage_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.bossId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianInfo_9302)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianInfo_9302 other = (S2C_BarbarianInfo_9302)obj;
            if (this.hasMaxDamage() != other.hasMaxDamage()) {
               return false;
            } else if (this.hasMaxDamage() && this.getMaxDamage() != other.getMaxDamage()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && this.getMyRank() != other.getMyRank()) {
               return false;
            } else if (this.hasMyTotalDamage() != other.hasMyTotalDamage()) {
               return false;
            } else if (this.hasMyTotalDamage() && this.getMyTotalDamage() != other.getMyTotalDamage()) {
               return false;
            } else if (this.hasBossId() != other.hasBossId()) {
               return false;
            } else if (this.hasBossId() && this.getBossId() != other.getBossId()) {
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
            if (this.hasMaxDamage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getMaxDamage());
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.hasCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuyCount();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getMyRank();
            }

            if (this.hasMyTotalDamage()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getMyTotalDamage());
            }

            if (this.hasBossId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getBossId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianInfo_9302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianInfo_9302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_9302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_9302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianInfo_9302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianInfo_9302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianInfo_9302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianInfo_9302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianInfo_9302> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianInfo_9302> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianInfo_9302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianInfo_9302OrBuilder {
         private int bitField0_;
         private long maxDamage_;
         private long totalDamage_;
         private int count_;
         private int buyCount_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;
         private int myRank_;
         private long myTotalDamage_;
         private int bossId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianInfo_9302.class, Builder.class);
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
            if (BarbarianMsg.S2C_BarbarianInfo_9302.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.maxDamage_ = 0L;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.count_ = 0;
            this.bitField0_ &= -5;
            this.buyCount_ = 0;
            this.bitField0_ &= -9;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.ranksBuilder_.clear();
            }

            this.myRank_ = 0;
            this.bitField0_ &= -33;
            this.myTotalDamage_ = 0L;
            this.bitField0_ &= -65;
            this.bossId_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianInfo_9302_descriptor;
         }

         public S2C_BarbarianInfo_9302 getDefaultInstanceForType() {
            return BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance();
         }

         public S2C_BarbarianInfo_9302 build() {
            S2C_BarbarianInfo_9302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianInfo_9302 buildPartial() {
            S2C_BarbarianInfo_9302 result = new S2C_BarbarianInfo_9302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.maxDamage_ = this.maxDamage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.buyCount_ = this.buyCount_;
               to_bitField0_ |= 8;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -17;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.myRank_ = this.myRank_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.myTotalDamage_ = this.myTotalDamage_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.bossId_ = this.bossId_;
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
            if (other instanceof S2C_BarbarianInfo_9302) {
               return this.mergeFrom((S2C_BarbarianInfo_9302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianInfo_9302 other) {
            if (other == BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMaxDamage()) {
                  this.setMaxDamage(other.getMaxDamage());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
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
                     this.ranksBuilder_ = BarbarianMsg.S2C_BarbarianInfo_9302.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyRank()) {
                  this.setMyRank(other.getMyRank());
               }

               if (other.hasMyTotalDamage()) {
                  this.setMyTotalDamage(other.getMyTotalDamage());
               }

               if (other.hasBossId()) {
                  this.setBossId(other.getBossId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMaxDamage()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else if (!this.hasBuyCount()) {
               return false;
            } else if (!this.hasMyRank()) {
               return false;
            } else if (!this.hasMyTotalDamage()) {
               return false;
            } else if (!this.hasBossId()) {
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
            S2C_BarbarianInfo_9302 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianInfo_9302)BarbarianMsg.S2C_BarbarianInfo_9302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianInfo_9302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMaxDamage() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getMaxDamage() {
            return this.maxDamage_;
         }

         public Builder setMaxDamage(long value) {
            this.bitField0_ |= 1;
            this.maxDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxDamage() {
            this.bitField0_ &= -2;
            this.maxDamage_ = 0L;
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

         public boolean hasCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 4;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -5;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 8;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -9;
            this.buyCount_ = 0;
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

         public boolean hasMyRank() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getMyRank() {
            return this.myRank_;
         }

         public Builder setMyRank(int value) {
            this.bitField0_ |= 32;
            this.myRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyRank() {
            this.bitField0_ &= -33;
            this.myRank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyTotalDamage() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getMyTotalDamage() {
            return this.myTotalDamage_;
         }

         public Builder setMyTotalDamage(long value) {
            this.bitField0_ |= 64;
            this.myTotalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyTotalDamage() {
            this.bitField0_ &= -65;
            this.myTotalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasBossId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getBossId() {
            return this.bossId_;
         }

         public Builder setBossId(int value) {
            this.bitField0_ |= 128;
            this.bossId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBossId() {
            this.bitField0_ &= -129;
            this.bossId_ = 0;
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

   public static final class C2S_BarbarianCrusade_9303 extends GeneratedMessageV3 implements C2S_BarbarianCrusade_9303OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianCrusade_9303 DEFAULT_INSTANCE = new C2S_BarbarianCrusade_9303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianCrusade_9303> PARSER = new AbstractParser<C2S_BarbarianCrusade_9303>() {
         public C2S_BarbarianCrusade_9303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianCrusade_9303(input, extensionRegistry);
         }
      };

      private C2S_BarbarianCrusade_9303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianCrusade_9303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianCrusade_9303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianCrusade_9303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianCrusade_9303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianCrusade_9303)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianCrusade_9303 other = (C2S_BarbarianCrusade_9303)obj;
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

      public static C2S_BarbarianCrusade_9303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianCrusade_9303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianCrusade_9303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianCrusade_9303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianCrusade_9303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianCrusade_9303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianCrusade_9303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianCrusade_9303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianCrusade_9303> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianCrusade_9303> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianCrusade_9303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianCrusade_9303OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianCrusade_9303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.C2S_BarbarianCrusade_9303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianCrusade_9303_descriptor;
         }

         public C2S_BarbarianCrusade_9303 getDefaultInstanceForType() {
            return BarbarianMsg.C2S_BarbarianCrusade_9303.getDefaultInstance();
         }

         public C2S_BarbarianCrusade_9303 build() {
            C2S_BarbarianCrusade_9303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianCrusade_9303 buildPartial() {
            C2S_BarbarianCrusade_9303 result = new C2S_BarbarianCrusade_9303(this);
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
            if (other instanceof C2S_BarbarianCrusade_9303) {
               return this.mergeFrom((C2S_BarbarianCrusade_9303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianCrusade_9303 other) {
            if (other == BarbarianMsg.C2S_BarbarianCrusade_9303.getDefaultInstance()) {
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
            C2S_BarbarianCrusade_9303 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianCrusade_9303)BarbarianMsg.C2S_BarbarianCrusade_9303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianCrusade_9303)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianCrusade_9304 extends GeneratedMessageV3 implements S2C_BarbarianCrusade_9304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private S2C_BarbarianInfo_9302 info_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianCrusade_9304 DEFAULT_INSTANCE = new S2C_BarbarianCrusade_9304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianCrusade_9304> PARSER = new AbstractParser<S2C_BarbarianCrusade_9304>() {
         public S2C_BarbarianCrusade_9304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianCrusade_9304(input, extensionRegistry);
         }
      };

      private S2C_BarbarianCrusade_9304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianCrusade_9304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianCrusade_9304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianCrusade_9304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        S2C_BarbarianInfo_9302.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (S2C_BarbarianInfo_9302)input.readMessage(BarbarianMsg.S2C_BarbarianInfo_9302.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianCrusade_9304.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public S2C_BarbarianInfo_9302 getInfo() {
         return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
      }

      public S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder() {
         return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianCrusade_9304)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianCrusade_9304 other = (S2C_BarbarianCrusade_9304)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianCrusade_9304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianCrusade_9304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianCrusade_9304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianCrusade_9304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianCrusade_9304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianCrusade_9304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianCrusade_9304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianCrusade_9304> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianCrusade_9304> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianCrusade_9304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianCrusade_9304OrBuilder {
         private int bitField0_;
         private S2C_BarbarianInfo_9302 info_;
         private SingleFieldBuilderV3<S2C_BarbarianInfo_9302, S2C_BarbarianInfo_9302.Builder, S2C_BarbarianInfo_9302OrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianCrusade_9304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.S2C_BarbarianCrusade_9304.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianCrusade_9304_descriptor;
         }

         public S2C_BarbarianCrusade_9304 getDefaultInstanceForType() {
            return BarbarianMsg.S2C_BarbarianCrusade_9304.getDefaultInstance();
         }

         public S2C_BarbarianCrusade_9304 build() {
            S2C_BarbarianCrusade_9304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianCrusade_9304 buildPartial() {
            S2C_BarbarianCrusade_9304 result = new S2C_BarbarianCrusade_9304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (S2C_BarbarianInfo_9302)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_BarbarianCrusade_9304) {
               return this.mergeFrom((S2C_BarbarianCrusade_9304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianCrusade_9304 other) {
            if (other == BarbarianMsg.S2C_BarbarianCrusade_9304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BarbarianCrusade_9304 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianCrusade_9304)BarbarianMsg.S2C_BarbarianCrusade_9304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianCrusade_9304)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public S2C_BarbarianInfo_9302 getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
            } else {
               return (S2C_BarbarianInfo_9302)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(S2C_BarbarianInfo_9302 value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(S2C_BarbarianInfo_9302.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(S2C_BarbarianInfo_9302 value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance()) {
                  this.info_ = BarbarianMsg.S2C_BarbarianInfo_9302.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public S2C_BarbarianInfo_9302.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (S2C_BarbarianInfo_9302.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (S2C_BarbarianInfo_9302OrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<S2C_BarbarianInfo_9302, S2C_BarbarianInfo_9302.Builder, S2C_BarbarianInfo_9302OrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
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

   public static final class C2S_BarbarianBuy_9305 extends GeneratedMessageV3 implements C2S_BarbarianBuy_9305OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianBuy_9305 DEFAULT_INSTANCE = new C2S_BarbarianBuy_9305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianBuy_9305> PARSER = new AbstractParser<C2S_BarbarianBuy_9305>() {
         public C2S_BarbarianBuy_9305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianBuy_9305(input, extensionRegistry);
         }
      };

      private C2S_BarbarianBuy_9305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianBuy_9305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianBuy_9305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianBuy_9305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianBuy_9305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianBuy_9305)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianBuy_9305 other = (C2S_BarbarianBuy_9305)obj;
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

      public static C2S_BarbarianBuy_9305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianBuy_9305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianBuy_9305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianBuy_9305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianBuy_9305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianBuy_9305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianBuy_9305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianBuy_9305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianBuy_9305> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianBuy_9305> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianBuy_9305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianBuy_9305OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianBuy_9305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.C2S_BarbarianBuy_9305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianBuy_9305_descriptor;
         }

         public C2S_BarbarianBuy_9305 getDefaultInstanceForType() {
            return BarbarianMsg.C2S_BarbarianBuy_9305.getDefaultInstance();
         }

         public C2S_BarbarianBuy_9305 build() {
            C2S_BarbarianBuy_9305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianBuy_9305 buildPartial() {
            C2S_BarbarianBuy_9305 result = new C2S_BarbarianBuy_9305(this);
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
            if (other instanceof C2S_BarbarianBuy_9305) {
               return this.mergeFrom((C2S_BarbarianBuy_9305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianBuy_9305 other) {
            if (other == BarbarianMsg.C2S_BarbarianBuy_9305.getDefaultInstance()) {
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
            C2S_BarbarianBuy_9305 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianBuy_9305)BarbarianMsg.C2S_BarbarianBuy_9305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianBuy_9305)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianBuy_9306 extends GeneratedMessageV3 implements S2C_BarbarianBuy_9306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      public static final int BUYCOUNT_FIELD_NUMBER = 2;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianBuy_9306 DEFAULT_INSTANCE = new S2C_BarbarianBuy_9306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianBuy_9306> PARSER = new AbstractParser<S2C_BarbarianBuy_9306>() {
         public S2C_BarbarianBuy_9306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianBuy_9306(input, extensionRegistry);
         }
      };

      private S2C_BarbarianBuy_9306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianBuy_9306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianBuy_9306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianBuy_9306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.count_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianBuy_9306.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.count_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianBuy_9306)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianBuy_9306 other = (S2C_BarbarianBuy_9306)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
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
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianBuy_9306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianBuy_9306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianBuy_9306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianBuy_9306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianBuy_9306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianBuy_9306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianBuy_9306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianBuy_9306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianBuy_9306> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianBuy_9306> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianBuy_9306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianBuy_9306OrBuilder {
         private int bitField0_;
         private int count_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianBuy_9306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.S2C_BarbarianBuy_9306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianBuy_9306_descriptor;
         }

         public S2C_BarbarianBuy_9306 getDefaultInstanceForType() {
            return BarbarianMsg.S2C_BarbarianBuy_9306.getDefaultInstance();
         }

         public S2C_BarbarianBuy_9306 build() {
            S2C_BarbarianBuy_9306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianBuy_9306 buildPartial() {
            S2C_BarbarianBuy_9306 result = new S2C_BarbarianBuy_9306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyCount_ = this.buyCount_;
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
            if (other instanceof S2C_BarbarianBuy_9306) {
               return this.mergeFrom((S2C_BarbarianBuy_9306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianBuy_9306 other) {
            if (other == BarbarianMsg.S2C_BarbarianBuy_9306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCount()) {
               return false;
            } else {
               return this.hasBuyCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BarbarianBuy_9306 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianBuy_9306)BarbarianMsg.S2C_BarbarianBuy_9306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianBuy_9306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 2;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
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

   public static final class C2S_BarbarianSwapOneKey_9307 extends GeneratedMessageV3 implements C2S_BarbarianSwapOneKey_9307OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BarbarianSwapOneKey_9307 DEFAULT_INSTANCE = new C2S_BarbarianSwapOneKey_9307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BarbarianSwapOneKey_9307> PARSER = new AbstractParser<C2S_BarbarianSwapOneKey_9307>() {
         public C2S_BarbarianSwapOneKey_9307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BarbarianSwapOneKey_9307(input, extensionRegistry);
         }
      };

      private C2S_BarbarianSwapOneKey_9307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BarbarianSwapOneKey_9307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BarbarianSwapOneKey_9307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BarbarianSwapOneKey_9307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianSwapOneKey_9307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BarbarianSwapOneKey_9307)) {
            return super.equals(obj);
         } else {
            C2S_BarbarianSwapOneKey_9307 other = (C2S_BarbarianSwapOneKey_9307)obj;
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

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BarbarianSwapOneKey_9307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(InputStream input) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BarbarianSwapOneKey_9307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BarbarianSwapOneKey_9307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BarbarianSwapOneKey_9307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BarbarianSwapOneKey_9307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BarbarianSwapOneKey_9307> parser() {
         return PARSER;
      }

      public Parser<C2S_BarbarianSwapOneKey_9307> getParserForType() {
         return PARSER;
      }

      public C2S_BarbarianSwapOneKey_9307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BarbarianSwapOneKey_9307OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BarbarianSwapOneKey_9307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.C2S_BarbarianSwapOneKey_9307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_C2S_BarbarianSwapOneKey_9307_descriptor;
         }

         public C2S_BarbarianSwapOneKey_9307 getDefaultInstanceForType() {
            return BarbarianMsg.C2S_BarbarianSwapOneKey_9307.getDefaultInstance();
         }

         public C2S_BarbarianSwapOneKey_9307 build() {
            C2S_BarbarianSwapOneKey_9307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BarbarianSwapOneKey_9307 buildPartial() {
            C2S_BarbarianSwapOneKey_9307 result = new C2S_BarbarianSwapOneKey_9307(this);
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
            if (other instanceof C2S_BarbarianSwapOneKey_9307) {
               return this.mergeFrom((C2S_BarbarianSwapOneKey_9307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BarbarianSwapOneKey_9307 other) {
            if (other == BarbarianMsg.C2S_BarbarianSwapOneKey_9307.getDefaultInstance()) {
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
            C2S_BarbarianSwapOneKey_9307 parsedMessage = null;

            try {
               parsedMessage = (C2S_BarbarianSwapOneKey_9307)BarbarianMsg.C2S_BarbarianSwapOneKey_9307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BarbarianSwapOneKey_9307)e.getUnfinishedMessage();
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

   public static final class S2C_BarbarianSwapOneKey_9308 extends GeneratedMessageV3 implements S2C_BarbarianSwapOneKey_9308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private S2C_BarbarianInfo_9302 info_;
      private byte memoizedIsInitialized;
      private static final S2C_BarbarianSwapOneKey_9308 DEFAULT_INSTANCE = new S2C_BarbarianSwapOneKey_9308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BarbarianSwapOneKey_9308> PARSER = new AbstractParser<S2C_BarbarianSwapOneKey_9308>() {
         public S2C_BarbarianSwapOneKey_9308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BarbarianSwapOneKey_9308(input, extensionRegistry);
         }
      };

      private S2C_BarbarianSwapOneKey_9308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BarbarianSwapOneKey_9308() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BarbarianSwapOneKey_9308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BarbarianSwapOneKey_9308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        S2C_BarbarianInfo_9302.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (S2C_BarbarianInfo_9302)input.readMessage(BarbarianMsg.S2C_BarbarianInfo_9302.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianSwapOneKey_9308.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public S2C_BarbarianInfo_9302 getInfo() {
         return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
      }

      public S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder() {
         return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BarbarianSwapOneKey_9308)) {
            return super.equals(obj);
         } else {
            S2C_BarbarianSwapOneKey_9308 other = (S2C_BarbarianSwapOneKey_9308)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BarbarianSwapOneKey_9308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(InputStream input) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BarbarianSwapOneKey_9308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BarbarianSwapOneKey_9308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BarbarianSwapOneKey_9308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BarbarianSwapOneKey_9308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BarbarianSwapOneKey_9308> parser() {
         return PARSER;
      }

      public Parser<S2C_BarbarianSwapOneKey_9308> getParserForType() {
         return PARSER;
      }

      public S2C_BarbarianSwapOneKey_9308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BarbarianSwapOneKey_9308OrBuilder {
         private int bitField0_;
         private S2C_BarbarianInfo_9302 info_;
         private SingleFieldBuilderV3<S2C_BarbarianInfo_9302, S2C_BarbarianInfo_9302.Builder, S2C_BarbarianInfo_9302OrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BarbarianSwapOneKey_9308.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BarbarianMsg.S2C_BarbarianSwapOneKey_9308.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BarbarianMsg.internal_static_barbarian_com_gzbz_protobuf_S2C_BarbarianSwapOneKey_9308_descriptor;
         }

         public S2C_BarbarianSwapOneKey_9308 getDefaultInstanceForType() {
            return BarbarianMsg.S2C_BarbarianSwapOneKey_9308.getDefaultInstance();
         }

         public S2C_BarbarianSwapOneKey_9308 build() {
            S2C_BarbarianSwapOneKey_9308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BarbarianSwapOneKey_9308 buildPartial() {
            S2C_BarbarianSwapOneKey_9308 result = new S2C_BarbarianSwapOneKey_9308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (S2C_BarbarianInfo_9302)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_BarbarianSwapOneKey_9308) {
               return this.mergeFrom((S2C_BarbarianSwapOneKey_9308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BarbarianSwapOneKey_9308 other) {
            if (other == BarbarianMsg.S2C_BarbarianSwapOneKey_9308.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BarbarianSwapOneKey_9308 parsedMessage = null;

            try {
               parsedMessage = (S2C_BarbarianSwapOneKey_9308)BarbarianMsg.S2C_BarbarianSwapOneKey_9308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BarbarianSwapOneKey_9308)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public S2C_BarbarianInfo_9302 getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
            } else {
               return (S2C_BarbarianInfo_9302)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(S2C_BarbarianInfo_9302 value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(S2C_BarbarianInfo_9302.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(S2C_BarbarianInfo_9302 value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance()) {
                  this.info_ = BarbarianMsg.S2C_BarbarianInfo_9302.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public S2C_BarbarianInfo_9302.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (S2C_BarbarianInfo_9302.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (S2C_BarbarianInfo_9302OrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? BarbarianMsg.S2C_BarbarianInfo_9302.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<S2C_BarbarianInfo_9302, S2C_BarbarianInfo_9302.Builder, S2C_BarbarianInfo_9302OrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
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

   public interface C2S_BarbarianBuy_9305OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BarbarianCrusade_9303OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BarbarianInfo_9301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BarbarianSwapOneKey_9307OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_BarbarianBuy_9306OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();

      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface S2C_BarbarianCrusade_9304OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      S2C_BarbarianInfo_9302 getInfo();

      S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder();
   }

   public interface S2C_BarbarianInfo_9302OrBuilder extends MessageOrBuilder {
      boolean hasMaxDamage();

      long getMaxDamage();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasCount();

      int getCount();

      boolean hasBuyCount();

      int getBuyCount();

      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      int getMyRank();

      boolean hasMyTotalDamage();

      long getMyTotalDamage();

      boolean hasBossId();

      int getBossId();
   }

   public interface S2C_BarbarianSwapOneKey_9308OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      S2C_BarbarianInfo_9302 getInfo();

      S2C_BarbarianInfo_9302OrBuilder getInfoOrBuilder();
   }
}
