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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class KrWelfareMsg {
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private KrWelfareMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fKrWelfare.proto\u0012\u001bKrWelfare.com.gzbz.protobuf\"\u0010\n\u000eC2S_Info_24801\"\u0080\u0001\n\u000eS2C_Info_24802\u0012\u000e\n\u0006curDay\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010recFreeRewardDay\u0018\u0002 \u0003(\u0005\u0012\u0016\n\u000ebuyDiscountDay\u0018\u0003 \u0003(\u0005\u0012\u0019\n\u0011haveRecFreeReward\u0018\u0004 \u0002(\b\u0012\u0011\n\tcountdown\u0018\u0005 \u0002(\u0003\"&\n\u0017C2S_RecFreeReward_24803\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"3\n\u0017S2C_RecFreeReward_24804\u0012\u0018\n\u0010recFreeRewardDay\u0018\u0001 \u0003(\u0005\"$\n\u0015C2S_BuyDiscount_24805\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"/\n\u0015S2C_BuyDiscount_24806\u0012\u0016\n\u000ebuyDiscountDay\u0018\u0001 \u0003(\u0005B#\n\u0011com.gzbz.protobufB\fKrWelfareMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor, new String[0]);
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor, new String[]{"CurDay", "RecFreeRewardDay", "BuyDiscountDay", "HaveRecFreeReward", "Countdown"});
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor, new String[]{"Day"});
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor, new String[]{"RecFreeRewardDay"});
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor, new String[]{"Day"});
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor, new String[]{"BuyDiscountDay"});
   }

   public static final class C2S_Info_24801 extends GeneratedMessageV3 implements C2S_Info_24801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Info_24801 DEFAULT_INSTANCE = new C2S_Info_24801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Info_24801> PARSER = new AbstractParser<C2S_Info_24801>() {
         public C2S_Info_24801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Info_24801(input, extensionRegistry);
         }
      };

      private C2S_Info_24801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Info_24801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Info_24801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Info_24801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_24801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Info_24801)) {
            return super.equals(obj);
         } else {
            C2S_Info_24801 other = (C2S_Info_24801)obj;
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

      public static C2S_Info_24801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data);
      }

      public static C2S_Info_24801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data);
      }

      public static C2S_Info_24801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data);
      }

      public static C2S_Info_24801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24801 parseFrom(InputStream input) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_24801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_24801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Info_24801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_24801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_24801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Info_24801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Info_24801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Info_24801> parser() {
         return PARSER;
      }

      public Parser<C2S_Info_24801> getParserForType() {
         return PARSER;
      }

      public C2S_Info_24801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Info_24801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_24801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.C2S_Info_24801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_Info_24801_descriptor;
         }

         public C2S_Info_24801 getDefaultInstanceForType() {
            return KrWelfareMsg.C2S_Info_24801.getDefaultInstance();
         }

         public C2S_Info_24801 build() {
            C2S_Info_24801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Info_24801 buildPartial() {
            C2S_Info_24801 result = new C2S_Info_24801(this);
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
            if (other instanceof C2S_Info_24801) {
               return this.mergeFrom((C2S_Info_24801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Info_24801 other) {
            if (other == KrWelfareMsg.C2S_Info_24801.getDefaultInstance()) {
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
            C2S_Info_24801 parsedMessage = null;

            try {
               parsedMessage = (C2S_Info_24801)KrWelfareMsg.C2S_Info_24801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Info_24801)e.getUnfinishedMessage();
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

   public static final class S2C_Info_24802 extends GeneratedMessageV3 implements S2C_Info_24802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURDAY_FIELD_NUMBER = 1;
      private int curDay_;
      public static final int RECFREEREWARDDAY_FIELD_NUMBER = 2;
      private Internal.IntList recFreeRewardDay_;
      public static final int BUYDISCOUNTDAY_FIELD_NUMBER = 3;
      private Internal.IntList buyDiscountDay_;
      public static final int HAVERECFREEREWARD_FIELD_NUMBER = 4;
      private boolean haveRecFreeReward_;
      public static final int COUNTDOWN_FIELD_NUMBER = 5;
      private long countdown_;
      private byte memoizedIsInitialized;
      private static final S2C_Info_24802 DEFAULT_INSTANCE = new S2C_Info_24802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Info_24802> PARSER = new AbstractParser<S2C_Info_24802>() {
         public S2C_Info_24802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Info_24802(input, extensionRegistry);
         }
      };

      private S2C_Info_24802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Info_24802() {
         this.memoizedIsInitialized = -1;
         this.recFreeRewardDay_ = emptyIntList();
         this.buyDiscountDay_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Info_24802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Info_24802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curDay_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recFreeRewardDay_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recFreeRewardDay_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recFreeRewardDay_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.buyDiscountDay_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.buyDiscountDay_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buyDiscountDay_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buyDiscountDay_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 32:
                        this.bitField0_ |= 2;
                        this.haveRecFreeReward_ = input.readBool();
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.countdown_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.recFreeRewardDay_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.recFreeRewardDay_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.buyDiscountDay_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_24802.class, Builder.class);
      }

      public boolean hasCurDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurDay() {
         return this.curDay_;
      }

      public List<Integer> getRecFreeRewardDayList() {
         return this.recFreeRewardDay_;
      }

      public int getRecFreeRewardDayCount() {
         return this.recFreeRewardDay_.size();
      }

      public int getRecFreeRewardDay(int index) {
         return this.recFreeRewardDay_.getInt(index);
      }

      public List<Integer> getBuyDiscountDayList() {
         return this.buyDiscountDay_;
      }

      public int getBuyDiscountDayCount() {
         return this.buyDiscountDay_.size();
      }

      public int getBuyDiscountDay(int index) {
         return this.buyDiscountDay_.getInt(index);
      }

      public boolean hasHaveRecFreeReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getHaveRecFreeReward() {
         return this.haveRecFreeReward_;
      }

      public boolean hasCountdown() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getCountdown() {
         return this.countdown_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHaveRecFreeReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCountdown()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curDay_);
         }

         for(int i = 0; i < this.recFreeRewardDay_.size(); ++i) {
            output.writeInt32(2, this.recFreeRewardDay_.getInt(i));
         }

         for(int i = 0; i < this.buyDiscountDay_.size(); ++i) {
            output.writeInt32(3, this.buyDiscountDay_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(4, this.haveRecFreeReward_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(5, this.countdown_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.recFreeRewardDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recFreeRewardDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecFreeRewardDayList().size();
            dataSize = 0;

            for(int i = 0; i < this.buyDiscountDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buyDiscountDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuyDiscountDayList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.haveRecFreeReward_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.countdown_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Info_24802)) {
            return super.equals(obj);
         } else {
            S2C_Info_24802 other = (S2C_Info_24802)obj;
            if (this.hasCurDay() != other.hasCurDay()) {
               return false;
            } else if (this.hasCurDay() && this.getCurDay() != other.getCurDay()) {
               return false;
            } else if (!this.getRecFreeRewardDayList().equals(other.getRecFreeRewardDayList())) {
               return false;
            } else if (!this.getBuyDiscountDayList().equals(other.getBuyDiscountDayList())) {
               return false;
            } else if (this.hasHaveRecFreeReward() != other.hasHaveRecFreeReward()) {
               return false;
            } else if (this.hasHaveRecFreeReward() && this.getHaveRecFreeReward() != other.getHaveRecFreeReward()) {
               return false;
            } else if (this.hasCountdown() != other.hasCountdown()) {
               return false;
            } else if (this.hasCountdown() && this.getCountdown() != other.getCountdown()) {
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
            if (this.hasCurDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurDay();
            }

            if (this.getRecFreeRewardDayCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecFreeRewardDayList().hashCode();
            }

            if (this.getBuyDiscountDayCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyDiscountDayList().hashCode();
            }

            if (this.hasHaveRecFreeReward()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getHaveRecFreeReward());
            }

            if (this.hasCountdown()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getCountdown());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Info_24802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data);
      }

      public static S2C_Info_24802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data);
      }

      public static S2C_Info_24802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data);
      }

      public static S2C_Info_24802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24802 parseFrom(InputStream input) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_24802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_24802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Info_24802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_24802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_24802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Info_24802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Info_24802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Info_24802> parser() {
         return PARSER;
      }

      public Parser<S2C_Info_24802> getParserForType() {
         return PARSER;
      }

      public S2C_Info_24802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Info_24802OrBuilder {
         private int bitField0_;
         private int curDay_;
         private Internal.IntList recFreeRewardDay_;
         private Internal.IntList buyDiscountDay_;
         private boolean haveRecFreeReward_;
         private long countdown_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_24802.class, Builder.class);
         }

         private Builder() {
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.buyDiscountDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.buyDiscountDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.S2C_Info_24802.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curDay_ = 0;
            this.bitField0_ &= -2;
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.bitField0_ &= -3;
            this.buyDiscountDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.bitField0_ &= -5;
            this.haveRecFreeReward_ = false;
            this.bitField0_ &= -9;
            this.countdown_ = 0L;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_Info_24802_descriptor;
         }

         public S2C_Info_24802 getDefaultInstanceForType() {
            return KrWelfareMsg.S2C_Info_24802.getDefaultInstance();
         }

         public S2C_Info_24802 build() {
            S2C_Info_24802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Info_24802 buildPartial() {
            S2C_Info_24802 result = new S2C_Info_24802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curDay_ = this.curDay_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.recFreeRewardDay_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.recFreeRewardDay_ = this.recFreeRewardDay_;
            if ((this.bitField0_ & 4) != 0) {
               this.buyDiscountDay_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.buyDiscountDay_ = this.buyDiscountDay_;
            if ((from_bitField0_ & 8) != 0) {
               result.haveRecFreeReward_ = this.haveRecFreeReward_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.countdown_ = this.countdown_;
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
            if (other instanceof S2C_Info_24802) {
               return this.mergeFrom((S2C_Info_24802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Info_24802 other) {
            if (other == KrWelfareMsg.S2C_Info_24802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurDay()) {
                  this.setCurDay(other.getCurDay());
               }

               if (!other.recFreeRewardDay_.isEmpty()) {
                  if (this.recFreeRewardDay_.isEmpty()) {
                     this.recFreeRewardDay_ = other.recFreeRewardDay_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRecFreeRewardDayIsMutable();
                     this.recFreeRewardDay_.addAll(other.recFreeRewardDay_);
                  }

                  this.onChanged();
               }

               if (!other.buyDiscountDay_.isEmpty()) {
                  if (this.buyDiscountDay_.isEmpty()) {
                     this.buyDiscountDay_ = other.buyDiscountDay_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBuyDiscountDayIsMutable();
                     this.buyDiscountDay_.addAll(other.buyDiscountDay_);
                  }

                  this.onChanged();
               }

               if (other.hasHaveRecFreeReward()) {
                  this.setHaveRecFreeReward(other.getHaveRecFreeReward());
               }

               if (other.hasCountdown()) {
                  this.setCountdown(other.getCountdown());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCurDay()) {
               return false;
            } else if (!this.hasHaveRecFreeReward()) {
               return false;
            } else {
               return this.hasCountdown();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Info_24802 parsedMessage = null;

            try {
               parsedMessage = (S2C_Info_24802)KrWelfareMsg.S2C_Info_24802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Info_24802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurDay() {
            return this.curDay_;
         }

         public Builder setCurDay(int value) {
            this.bitField0_ |= 1;
            this.curDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurDay() {
            this.bitField0_ &= -2;
            this.curDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecFreeRewardDayIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recFreeRewardDay_ = KrWelfareMsg.S2C_Info_24802.mutableCopy(this.recFreeRewardDay_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRecFreeRewardDayList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.recFreeRewardDay_) : this.recFreeRewardDay_);
         }

         public int getRecFreeRewardDayCount() {
            return this.recFreeRewardDay_.size();
         }

         public int getRecFreeRewardDay(int index) {
            return this.recFreeRewardDay_.getInt(index);
         }

         public Builder setRecFreeRewardDay(int index, int value) {
            this.ensureRecFreeRewardDayIsMutable();
            this.recFreeRewardDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecFreeRewardDay(int value) {
            this.ensureRecFreeRewardDayIsMutable();
            this.recFreeRewardDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecFreeRewardDay(Iterable<? extends Integer> values) {
            this.ensureRecFreeRewardDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recFreeRewardDay_);
            this.onChanged();
            return this;
         }

         public Builder clearRecFreeRewardDay() {
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureBuyDiscountDayIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.buyDiscountDay_ = KrWelfareMsg.S2C_Info_24802.mutableCopy(this.buyDiscountDay_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBuyDiscountDayList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.buyDiscountDay_) : this.buyDiscountDay_);
         }

         public int getBuyDiscountDayCount() {
            return this.buyDiscountDay_.size();
         }

         public int getBuyDiscountDay(int index) {
            return this.buyDiscountDay_.getInt(index);
         }

         public Builder setBuyDiscountDay(int index, int value) {
            this.ensureBuyDiscountDayIsMutable();
            this.buyDiscountDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuyDiscountDay(int value) {
            this.ensureBuyDiscountDayIsMutable();
            this.buyDiscountDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuyDiscountDay(Iterable<? extends Integer> values) {
            this.ensureBuyDiscountDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyDiscountDay_);
            this.onChanged();
            return this;
         }

         public Builder clearBuyDiscountDay() {
            this.buyDiscountDay_ = KrWelfareMsg.S2C_Info_24802.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasHaveRecFreeReward() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getHaveRecFreeReward() {
            return this.haveRecFreeReward_;
         }

         public Builder setHaveRecFreeReward(boolean value) {
            this.bitField0_ |= 8;
            this.haveRecFreeReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHaveRecFreeReward() {
            this.bitField0_ &= -9;
            this.haveRecFreeReward_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasCountdown() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getCountdown() {
            return this.countdown_;
         }

         public Builder setCountdown(long value) {
            this.bitField0_ |= 16;
            this.countdown_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCountdown() {
            this.bitField0_ &= -17;
            this.countdown_ = 0L;
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

   public static final class C2S_RecFreeReward_24803 extends GeneratedMessageV3 implements C2S_RecFreeReward_24803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_RecFreeReward_24803 DEFAULT_INSTANCE = new C2S_RecFreeReward_24803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecFreeReward_24803> PARSER = new AbstractParser<C2S_RecFreeReward_24803>() {
         public C2S_RecFreeReward_24803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecFreeReward_24803(input, extensionRegistry);
         }
      };

      private C2S_RecFreeReward_24803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecFreeReward_24803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecFreeReward_24803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecFreeReward_24803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecFreeReward_24803.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecFreeReward_24803)) {
            return super.equals(obj);
         } else {
            C2S_RecFreeReward_24803 other = (C2S_RecFreeReward_24803)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecFreeReward_24803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data);
      }

      public static C2S_RecFreeReward_24803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecFreeReward_24803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data);
      }

      public static C2S_RecFreeReward_24803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecFreeReward_24803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data);
      }

      public static C2S_RecFreeReward_24803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecFreeReward_24803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecFreeReward_24803 parseFrom(InputStream input) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecFreeReward_24803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecFreeReward_24803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecFreeReward_24803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecFreeReward_24803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecFreeReward_24803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecFreeReward_24803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecFreeReward_24803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecFreeReward_24803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecFreeReward_24803> parser() {
         return PARSER;
      }

      public Parser<C2S_RecFreeReward_24803> getParserForType() {
         return PARSER;
      }

      public C2S_RecFreeReward_24803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecFreeReward_24803OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecFreeReward_24803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.C2S_RecFreeReward_24803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_RecFreeReward_24803_descriptor;
         }

         public C2S_RecFreeReward_24803 getDefaultInstanceForType() {
            return KrWelfareMsg.C2S_RecFreeReward_24803.getDefaultInstance();
         }

         public C2S_RecFreeReward_24803 build() {
            C2S_RecFreeReward_24803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecFreeReward_24803 buildPartial() {
            C2S_RecFreeReward_24803 result = new C2S_RecFreeReward_24803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_RecFreeReward_24803) {
               return this.mergeFrom((C2S_RecFreeReward_24803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecFreeReward_24803 other) {
            if (other == KrWelfareMsg.C2S_RecFreeReward_24803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecFreeReward_24803 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecFreeReward_24803)KrWelfareMsg.C2S_RecFreeReward_24803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecFreeReward_24803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
            this.day_ = 0;
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

   public static final class S2C_RecFreeReward_24804 extends GeneratedMessageV3 implements S2C_RecFreeReward_24804OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECFREEREWARDDAY_FIELD_NUMBER = 1;
      private Internal.IntList recFreeRewardDay_;
      private byte memoizedIsInitialized;
      private static final S2C_RecFreeReward_24804 DEFAULT_INSTANCE = new S2C_RecFreeReward_24804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecFreeReward_24804> PARSER = new AbstractParser<S2C_RecFreeReward_24804>() {
         public S2C_RecFreeReward_24804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecFreeReward_24804(input, extensionRegistry);
         }
      };

      private S2C_RecFreeReward_24804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecFreeReward_24804() {
         this.memoizedIsInitialized = -1;
         this.recFreeRewardDay_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecFreeReward_24804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecFreeReward_24804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.recFreeRewardDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recFreeRewardDay_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recFreeRewardDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recFreeRewardDay_.addInt(input.readInt32());
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
                  this.recFreeRewardDay_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecFreeReward_24804.class, Builder.class);
      }

      public List<Integer> getRecFreeRewardDayList() {
         return this.recFreeRewardDay_;
      }

      public int getRecFreeRewardDayCount() {
         return this.recFreeRewardDay_.size();
      }

      public int getRecFreeRewardDay(int index) {
         return this.recFreeRewardDay_.getInt(index);
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
         for(int i = 0; i < this.recFreeRewardDay_.size(); ++i) {
            output.writeInt32(1, this.recFreeRewardDay_.getInt(i));
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

            for(int i = 0; i < this.recFreeRewardDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recFreeRewardDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecFreeRewardDayList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecFreeReward_24804)) {
            return super.equals(obj);
         } else {
            S2C_RecFreeReward_24804 other = (S2C_RecFreeReward_24804)obj;
            if (!this.getRecFreeRewardDayList().equals(other.getRecFreeRewardDayList())) {
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
            if (this.getRecFreeRewardDayCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecFreeRewardDayList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecFreeReward_24804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data);
      }

      public static S2C_RecFreeReward_24804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecFreeReward_24804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data);
      }

      public static S2C_RecFreeReward_24804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecFreeReward_24804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data);
      }

      public static S2C_RecFreeReward_24804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecFreeReward_24804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecFreeReward_24804 parseFrom(InputStream input) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecFreeReward_24804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecFreeReward_24804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecFreeReward_24804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecFreeReward_24804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecFreeReward_24804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecFreeReward_24804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecFreeReward_24804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecFreeReward_24804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecFreeReward_24804> parser() {
         return PARSER;
      }

      public Parser<S2C_RecFreeReward_24804> getParserForType() {
         return PARSER;
      }

      public S2C_RecFreeReward_24804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecFreeReward_24804OrBuilder {
         private int bitField0_;
         private Internal.IntList recFreeRewardDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecFreeReward_24804.class, Builder.class);
         }

         private Builder() {
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_RecFreeReward_24804.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_RecFreeReward_24804.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.S2C_RecFreeReward_24804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_RecFreeReward_24804.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_RecFreeReward_24804_descriptor;
         }

         public S2C_RecFreeReward_24804 getDefaultInstanceForType() {
            return KrWelfareMsg.S2C_RecFreeReward_24804.getDefaultInstance();
         }

         public S2C_RecFreeReward_24804 build() {
            S2C_RecFreeReward_24804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecFreeReward_24804 buildPartial() {
            S2C_RecFreeReward_24804 result = new S2C_RecFreeReward_24804(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.recFreeRewardDay_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.recFreeRewardDay_ = this.recFreeRewardDay_;
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
            if (other instanceof S2C_RecFreeReward_24804) {
               return this.mergeFrom((S2C_RecFreeReward_24804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecFreeReward_24804 other) {
            if (other == KrWelfareMsg.S2C_RecFreeReward_24804.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recFreeRewardDay_.isEmpty()) {
                  if (this.recFreeRewardDay_.isEmpty()) {
                     this.recFreeRewardDay_ = other.recFreeRewardDay_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecFreeRewardDayIsMutable();
                     this.recFreeRewardDay_.addAll(other.recFreeRewardDay_);
                  }

                  this.onChanged();
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
            S2C_RecFreeReward_24804 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecFreeReward_24804)KrWelfareMsg.S2C_RecFreeReward_24804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecFreeReward_24804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecFreeRewardDayIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recFreeRewardDay_ = KrWelfareMsg.S2C_RecFreeReward_24804.mutableCopy(this.recFreeRewardDay_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRecFreeRewardDayList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.recFreeRewardDay_) : this.recFreeRewardDay_);
         }

         public int getRecFreeRewardDayCount() {
            return this.recFreeRewardDay_.size();
         }

         public int getRecFreeRewardDay(int index) {
            return this.recFreeRewardDay_.getInt(index);
         }

         public Builder setRecFreeRewardDay(int index, int value) {
            this.ensureRecFreeRewardDayIsMutable();
            this.recFreeRewardDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecFreeRewardDay(int value) {
            this.ensureRecFreeRewardDayIsMutable();
            this.recFreeRewardDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecFreeRewardDay(Iterable<? extends Integer> values) {
            this.ensureRecFreeRewardDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recFreeRewardDay_);
            this.onChanged();
            return this;
         }

         public Builder clearRecFreeRewardDay() {
            this.recFreeRewardDay_ = KrWelfareMsg.S2C_RecFreeReward_24804.emptyIntList();
            this.bitField0_ &= -2;
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

   public static final class C2S_BuyDiscount_24805 extends GeneratedMessageV3 implements C2S_BuyDiscount_24805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyDiscount_24805 DEFAULT_INSTANCE = new C2S_BuyDiscount_24805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyDiscount_24805> PARSER = new AbstractParser<C2S_BuyDiscount_24805>() {
         public C2S_BuyDiscount_24805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyDiscount_24805(input, extensionRegistry);
         }
      };

      private C2S_BuyDiscount_24805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyDiscount_24805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyDiscount_24805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyDiscount_24805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyDiscount_24805.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyDiscount_24805)) {
            return super.equals(obj);
         } else {
            C2S_BuyDiscount_24805 other = (C2S_BuyDiscount_24805)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyDiscount_24805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data);
      }

      public static C2S_BuyDiscount_24805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyDiscount_24805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data);
      }

      public static C2S_BuyDiscount_24805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyDiscount_24805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data);
      }

      public static C2S_BuyDiscount_24805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyDiscount_24805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyDiscount_24805 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyDiscount_24805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyDiscount_24805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyDiscount_24805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyDiscount_24805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyDiscount_24805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyDiscount_24805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyDiscount_24805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyDiscount_24805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyDiscount_24805> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyDiscount_24805> getParserForType() {
         return PARSER;
      }

      public C2S_BuyDiscount_24805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyDiscount_24805OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyDiscount_24805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.C2S_BuyDiscount_24805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_C2S_BuyDiscount_24805_descriptor;
         }

         public C2S_BuyDiscount_24805 getDefaultInstanceForType() {
            return KrWelfareMsg.C2S_BuyDiscount_24805.getDefaultInstance();
         }

         public C2S_BuyDiscount_24805 build() {
            C2S_BuyDiscount_24805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyDiscount_24805 buildPartial() {
            C2S_BuyDiscount_24805 result = new C2S_BuyDiscount_24805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_BuyDiscount_24805) {
               return this.mergeFrom((C2S_BuyDiscount_24805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyDiscount_24805 other) {
            if (other == KrWelfareMsg.C2S_BuyDiscount_24805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyDiscount_24805 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyDiscount_24805)KrWelfareMsg.C2S_BuyDiscount_24805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyDiscount_24805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
            this.day_ = 0;
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

   public static final class S2C_BuyDiscount_24806 extends GeneratedMessageV3 implements S2C_BuyDiscount_24806OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUYDISCOUNTDAY_FIELD_NUMBER = 1;
      private Internal.IntList buyDiscountDay_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyDiscount_24806 DEFAULT_INSTANCE = new S2C_BuyDiscount_24806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyDiscount_24806> PARSER = new AbstractParser<S2C_BuyDiscount_24806>() {
         public S2C_BuyDiscount_24806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyDiscount_24806(input, extensionRegistry);
         }
      };

      private S2C_BuyDiscount_24806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyDiscount_24806() {
         this.memoizedIsInitialized = -1;
         this.buyDiscountDay_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyDiscount_24806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyDiscount_24806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.buyDiscountDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buyDiscountDay_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buyDiscountDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buyDiscountDay_.addInt(input.readInt32());
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
                  this.buyDiscountDay_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyDiscount_24806.class, Builder.class);
      }

      public List<Integer> getBuyDiscountDayList() {
         return this.buyDiscountDay_;
      }

      public int getBuyDiscountDayCount() {
         return this.buyDiscountDay_.size();
      }

      public int getBuyDiscountDay(int index) {
         return this.buyDiscountDay_.getInt(index);
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
         for(int i = 0; i < this.buyDiscountDay_.size(); ++i) {
            output.writeInt32(1, this.buyDiscountDay_.getInt(i));
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

            for(int i = 0; i < this.buyDiscountDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buyDiscountDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuyDiscountDayList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyDiscount_24806)) {
            return super.equals(obj);
         } else {
            S2C_BuyDiscount_24806 other = (S2C_BuyDiscount_24806)obj;
            if (!this.getBuyDiscountDayList().equals(other.getBuyDiscountDayList())) {
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
            if (this.getBuyDiscountDayCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyDiscountDayList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyDiscount_24806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data);
      }

      public static S2C_BuyDiscount_24806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyDiscount_24806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data);
      }

      public static S2C_BuyDiscount_24806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyDiscount_24806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data);
      }

      public static S2C_BuyDiscount_24806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyDiscount_24806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyDiscount_24806 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyDiscount_24806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyDiscount_24806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyDiscount_24806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyDiscount_24806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyDiscount_24806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyDiscount_24806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyDiscount_24806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyDiscount_24806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyDiscount_24806> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyDiscount_24806> getParserForType() {
         return PARSER;
      }

      public S2C_BuyDiscount_24806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyDiscount_24806OrBuilder {
         private int bitField0_;
         private Internal.IntList buyDiscountDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyDiscount_24806.class, Builder.class);
         }

         private Builder() {
            this.buyDiscountDay_ = KrWelfareMsg.S2C_BuyDiscount_24806.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyDiscountDay_ = KrWelfareMsg.S2C_BuyDiscount_24806.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrWelfareMsg.S2C_BuyDiscount_24806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyDiscountDay_ = KrWelfareMsg.S2C_BuyDiscount_24806.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrWelfareMsg.internal_static_KrWelfare_com_gzbz_protobuf_S2C_BuyDiscount_24806_descriptor;
         }

         public S2C_BuyDiscount_24806 getDefaultInstanceForType() {
            return KrWelfareMsg.S2C_BuyDiscount_24806.getDefaultInstance();
         }

         public S2C_BuyDiscount_24806 build() {
            S2C_BuyDiscount_24806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyDiscount_24806 buildPartial() {
            S2C_BuyDiscount_24806 result = new S2C_BuyDiscount_24806(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.buyDiscountDay_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.buyDiscountDay_ = this.buyDiscountDay_;
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
            if (other instanceof S2C_BuyDiscount_24806) {
               return this.mergeFrom((S2C_BuyDiscount_24806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyDiscount_24806 other) {
            if (other == KrWelfareMsg.S2C_BuyDiscount_24806.getDefaultInstance()) {
               return this;
            } else {
               if (!other.buyDiscountDay_.isEmpty()) {
                  if (this.buyDiscountDay_.isEmpty()) {
                     this.buyDiscountDay_ = other.buyDiscountDay_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureBuyDiscountDayIsMutable();
                     this.buyDiscountDay_.addAll(other.buyDiscountDay_);
                  }

                  this.onChanged();
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
            S2C_BuyDiscount_24806 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyDiscount_24806)KrWelfareMsg.S2C_BuyDiscount_24806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyDiscount_24806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuyDiscountDayIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buyDiscountDay_ = KrWelfareMsg.S2C_BuyDiscount_24806.mutableCopy(this.buyDiscountDay_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getBuyDiscountDayList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.buyDiscountDay_) : this.buyDiscountDay_);
         }

         public int getBuyDiscountDayCount() {
            return this.buyDiscountDay_.size();
         }

         public int getBuyDiscountDay(int index) {
            return this.buyDiscountDay_.getInt(index);
         }

         public Builder setBuyDiscountDay(int index, int value) {
            this.ensureBuyDiscountDayIsMutable();
            this.buyDiscountDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuyDiscountDay(int value) {
            this.ensureBuyDiscountDayIsMutable();
            this.buyDiscountDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuyDiscountDay(Iterable<? extends Integer> values) {
            this.ensureBuyDiscountDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyDiscountDay_);
            this.onChanged();
            return this;
         }

         public Builder clearBuyDiscountDay() {
            this.buyDiscountDay_ = KrWelfareMsg.S2C_BuyDiscount_24806.emptyIntList();
            this.bitField0_ &= -2;
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

   public interface C2S_BuyDiscount_24805OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_Info_24801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecFreeReward_24803OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface S2C_BuyDiscount_24806OrBuilder extends MessageOrBuilder {
      List<Integer> getBuyDiscountDayList();

      int getBuyDiscountDayCount();

      int getBuyDiscountDay(int index);
   }

   public interface S2C_Info_24802OrBuilder extends MessageOrBuilder {
      boolean hasCurDay();

      int getCurDay();

      List<Integer> getRecFreeRewardDayList();

      int getRecFreeRewardDayCount();

      int getRecFreeRewardDay(int index);

      List<Integer> getBuyDiscountDayList();

      int getBuyDiscountDayCount();

      int getBuyDiscountDay(int index);

      boolean hasHaveRecFreeReward();

      boolean getHaveRecFreeReward();

      boolean hasCountdown();

      long getCountdown();
   }

   public interface S2C_RecFreeReward_24804OrBuilder extends MessageOrBuilder {
      List<Integer> getRecFreeRewardDayList();

      int getRecFreeRewardDayCount();

      int getRecFreeRewardDay(int index);
   }
}
