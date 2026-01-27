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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HeroClubMsg {
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroClubMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eHeroClub.proto\u0012\u001aheroClub.com.gzbz.protobuf\"I\n\u0010C2S_Recruit_8901\u00125\n\u0004type\u0018\u0001 \u0002(\u000e2'.heroClub.com.gzbz.protobuf.RecruitType\"\u0018\n\u0016S2C_RecruitResult_8902\"!\n\u0011C2S_Exchange_8903\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"3\n\u0017S2C_ExchangeResult_8904\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_ConfirmExchange_8905\".\n\u001eS2C_ConfirmExchangeResult_8906\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_CancelExchange_8907\"-\n\u001bS2C_ExchangeInfoResult_8908\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_ExchangeInfo_8909\")\n\u001bS2C_ExchangeInfoResult_8910\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"'\n\fC2S_Buy_8911\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"$\n\u0012S2C_BuyResult_8912\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\".\n\u000eDrawRecordInfo\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0002 \u0002(\u0005\"\u0011\n\u000fC2S_Record_8913\"\u0093\u0001\n\u000fS2C_Record_8914\u0012=\n\tdrawInfos\u0018\u0001 \u0003(\u000b2*.heroClub.com.gzbz.protobuf.DrawRecordInfo\u0012A\n\rexchangeInfos\u0018\u0002 \u0003(\u000b2*.heroClub.com.gzbz.protobuf.DrawRecordInfo*c\n\u000bRecruitType\u0012\u0013\n\u000fRecruitType_Wei\u0010\u0001\u0012\u0013\n\u000fRecruitType_Shu\u0010\u0002\u0012\u0012\n\u000eRecruitType_Wu\u0010\u0003\u0012\u0016\n\u0012RecruitType_ShenMo\u0010\u0004B\"\n\u0011com.gzbz.protobufB\u000bHeroClubMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor, new String[]{"Type"});
      internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor, new String[0]);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor, new String[]{"Code"});
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor, new String[]{"Code", "Id"});
      internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor, new String[0]);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor, new String[]{"Code"});
      internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor, new String[0]);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor, new String[]{"Result"});
      internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor, new String[0]);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor, new String[]{"Id"});
      internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor, new String[]{"Id", "Num"});
      internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor, new String[]{"Result"});
      internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor, new String[]{"HeroId", "Time"});
      internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor, new String[0]);
      internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor, new String[]{"DrawInfos", "ExchangeInfos"});
   }

   public static enum RecruitType implements ProtocolMessageEnum {
      RecruitType_Wei(1),
      RecruitType_Shu(2),
      RecruitType_Wu(3),
      RecruitType_ShenMo(4);

      public static final int RecruitType_Wei_VALUE = 1;
      public static final int RecruitType_Shu_VALUE = 2;
      public static final int RecruitType_Wu_VALUE = 3;
      public static final int RecruitType_ShenMo_VALUE = 4;
      private static final Internal.EnumLiteMap<RecruitType> internalValueMap = new Internal.EnumLiteMap<RecruitType>() {
         public RecruitType findValueByNumber(int number) {
            return HeroClubMsg.RecruitType.forNumber(number);
         }
      };
      private static final RecruitType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static RecruitType valueOf(int value) {
         return forNumber(value);
      }

      public static RecruitType forNumber(int value) {
         switch (value) {
            case 1:
               return RecruitType_Wei;
            case 2:
               return RecruitType_Shu;
            case 3:
               return RecruitType_Wu;
            case 4:
               return RecruitType_ShenMo;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecruitType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)HeroClubMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static RecruitType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private RecruitType(int value) {
         this.value = value;
      }
   }

   public static final class C2S_Recruit_8901 extends GeneratedMessageV3 implements C2S_Recruit_8901OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Recruit_8901 DEFAULT_INSTANCE = new C2S_Recruit_8901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Recruit_8901> PARSER = new AbstractParser<C2S_Recruit_8901>() {
         public C2S_Recruit_8901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Recruit_8901(input, extensionRegistry);
         }
      };

      private C2S_Recruit_8901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Recruit_8901() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Recruit_8901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Recruit_8901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        RecruitType value = HeroClubMsg.RecruitType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Recruit_8901.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RecruitType getType() {
         RecruitType result = HeroClubMsg.RecruitType.valueOf(this.type_);
         return result == null ? HeroClubMsg.RecruitType.RecruitType_Wei : result;
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Recruit_8901)) {
            return super.equals(obj);
         } else {
            C2S_Recruit_8901 other = (C2S_Recruit_8901)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Recruit_8901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data);
      }

      public static C2S_Recruit_8901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recruit_8901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data);
      }

      public static C2S_Recruit_8901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recruit_8901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data);
      }

      public static C2S_Recruit_8901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recruit_8901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recruit_8901 parseFrom(InputStream input) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Recruit_8901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Recruit_8901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Recruit_8901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Recruit_8901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Recruit_8901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recruit_8901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Recruit_8901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Recruit_8901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Recruit_8901> parser() {
         return PARSER;
      }

      public Parser<C2S_Recruit_8901> getParserForType() {
         return PARSER;
      }

      public C2S_Recruit_8901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Recruit_8901OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Recruit_8901.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_Recruit_8901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Recruit_8901_descriptor;
         }

         public C2S_Recruit_8901 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_Recruit_8901.getDefaultInstance();
         }

         public C2S_Recruit_8901 build() {
            C2S_Recruit_8901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Recruit_8901 buildPartial() {
            C2S_Recruit_8901 result = new C2S_Recruit_8901(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_Recruit_8901) {
               return this.mergeFrom((C2S_Recruit_8901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Recruit_8901 other) {
            if (other == HeroClubMsg.C2S_Recruit_8901.getDefaultInstance()) {
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
            C2S_Recruit_8901 parsedMessage = null;

            try {
               parsedMessage = (C2S_Recruit_8901)HeroClubMsg.C2S_Recruit_8901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Recruit_8901)e.getUnfinishedMessage();
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

         public RecruitType getType() {
            RecruitType result = HeroClubMsg.RecruitType.valueOf(this.type_);
            return result == null ? HeroClubMsg.RecruitType.RecruitType_Wei : result;
         }

         public Builder setType(RecruitType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
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

   public static final class S2C_RecruitResult_8902 extends GeneratedMessageV3 implements S2C_RecruitResult_8902OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitResult_8902 DEFAULT_INSTANCE = new S2C_RecruitResult_8902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitResult_8902> PARSER = new AbstractParser<S2C_RecruitResult_8902>() {
         public S2C_RecruitResult_8902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitResult_8902(input, extensionRegistry);
         }
      };

      private S2C_RecruitResult_8902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitResult_8902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitResult_8902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitResult_8902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_8902.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecruitResult_8902)) {
            return super.equals(obj);
         } else {
            S2C_RecruitResult_8902 other = (S2C_RecruitResult_8902)obj;
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

      public static S2C_RecruitResult_8902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_8902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_8902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_8902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_8902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_8902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_8902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_8902 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_8902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_8902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_8902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_8902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_8902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_8902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitResult_8902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitResult_8902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitResult_8902> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitResult_8902> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitResult_8902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitResult_8902OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_8902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_RecruitResult_8902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_RecruitResult_8902_descriptor;
         }

         public S2C_RecruitResult_8902 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_RecruitResult_8902.getDefaultInstance();
         }

         public S2C_RecruitResult_8902 build() {
            S2C_RecruitResult_8902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitResult_8902 buildPartial() {
            S2C_RecruitResult_8902 result = new S2C_RecruitResult_8902(this);
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
            if (other instanceof S2C_RecruitResult_8902) {
               return this.mergeFrom((S2C_RecruitResult_8902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitResult_8902 other) {
            if (other == HeroClubMsg.S2C_RecruitResult_8902.getDefaultInstance()) {
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
            S2C_RecruitResult_8902 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitResult_8902)HeroClubMsg.S2C_RecruitResult_8902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitResult_8902)e.getUnfinishedMessage();
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

   public static final class C2S_Exchange_8903 extends GeneratedMessageV3 implements C2S_Exchange_8903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Exchange_8903 DEFAULT_INSTANCE = new C2S_Exchange_8903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Exchange_8903> PARSER = new AbstractParser<C2S_Exchange_8903>() {
         public C2S_Exchange_8903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Exchange_8903(input, extensionRegistry);
         }
      };

      private C2S_Exchange_8903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Exchange_8903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Exchange_8903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Exchange_8903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Exchange_8903.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.code_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Exchange_8903)) {
            return super.equals(obj);
         } else {
            C2S_Exchange_8903 other = (C2S_Exchange_8903)obj;
            if (this.hasCode() != other.hasCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Exchange_8903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8903 parseFrom(InputStream input) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Exchange_8903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Exchange_8903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Exchange_8903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Exchange_8903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Exchange_8903> parser() {
         return PARSER;
      }

      public Parser<C2S_Exchange_8903> getParserForType() {
         return PARSER;
      }

      public C2S_Exchange_8903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Exchange_8903OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Exchange_8903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_Exchange_8903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Exchange_8903_descriptor;
         }

         public C2S_Exchange_8903 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_Exchange_8903.getDefaultInstance();
         }

         public C2S_Exchange_8903 build() {
            C2S_Exchange_8903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Exchange_8903 buildPartial() {
            C2S_Exchange_8903 result = new C2S_Exchange_8903(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_Exchange_8903) {
               return this.mergeFrom((C2S_Exchange_8903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Exchange_8903 other) {
            if (other == HeroClubMsg.C2S_Exchange_8903.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Exchange_8903 parsedMessage = null;

            try {
               parsedMessage = (C2S_Exchange_8903)HeroClubMsg.C2S_Exchange_8903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Exchange_8903)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ExchangeResult_8904 extends GeneratedMessageV3 implements S2C_ExchangeResult_8904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_ExchangeResult_8904 DEFAULT_INSTANCE = new S2C_ExchangeResult_8904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExchangeResult_8904> PARSER = new AbstractParser<S2C_ExchangeResult_8904>() {
         public S2C_ExchangeResult_8904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExchangeResult_8904(input, extensionRegistry);
         }
      };

      private S2C_ExchangeResult_8904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExchangeResult_8904() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExchangeResult_8904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExchangeResult_8904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeResult_8904.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExchangeResult_8904)) {
            return super.equals(obj);
         } else {
            S2C_ExchangeResult_8904 other = (S2C_ExchangeResult_8904)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExchangeResult_8904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeResult_8904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeResult_8904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeResult_8904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeResult_8904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeResult_8904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeResult_8904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeResult_8904 parseFrom(InputStream input) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeResult_8904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeResult_8904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExchangeResult_8904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeResult_8904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeResult_8904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeResult_8904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExchangeResult_8904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExchangeResult_8904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExchangeResult_8904> parser() {
         return PARSER;
      }

      public Parser<S2C_ExchangeResult_8904> getParserForType() {
         return PARSER;
      }

      public S2C_ExchangeResult_8904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExchangeResult_8904OrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeResult_8904.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_ExchangeResult_8904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeResult_8904_descriptor;
         }

         public S2C_ExchangeResult_8904 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_ExchangeResult_8904.getDefaultInstance();
         }

         public S2C_ExchangeResult_8904 build() {
            S2C_ExchangeResult_8904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExchangeResult_8904 buildPartial() {
            S2C_ExchangeResult_8904 result = new S2C_ExchangeResult_8904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof S2C_ExchangeResult_8904) {
               return this.mergeFrom((S2C_ExchangeResult_8904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExchangeResult_8904 other) {
            if (other == HeroClubMsg.S2C_ExchangeResult_8904.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExchangeResult_8904 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExchangeResult_8904)HeroClubMsg.S2C_ExchangeResult_8904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExchangeResult_8904)e.getUnfinishedMessage();
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

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
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

   public static final class C2S_ConfirmExchange_8905 extends GeneratedMessageV3 implements C2S_ConfirmExchange_8905OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ConfirmExchange_8905 DEFAULT_INSTANCE = new C2S_ConfirmExchange_8905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ConfirmExchange_8905> PARSER = new AbstractParser<C2S_ConfirmExchange_8905>() {
         public C2S_ConfirmExchange_8905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ConfirmExchange_8905(input, extensionRegistry);
         }
      };

      private C2S_ConfirmExchange_8905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ConfirmExchange_8905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ConfirmExchange_8905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ConfirmExchange_8905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ConfirmExchange_8905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ConfirmExchange_8905)) {
            return super.equals(obj);
         } else {
            C2S_ConfirmExchange_8905 other = (C2S_ConfirmExchange_8905)obj;
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

      public static C2S_ConfirmExchange_8905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConfirmExchange_8905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(InputStream input) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ConfirmExchange_8905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ConfirmExchange_8905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ConfirmExchange_8905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConfirmExchange_8905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ConfirmExchange_8905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ConfirmExchange_8905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ConfirmExchange_8905> parser() {
         return PARSER;
      }

      public Parser<C2S_ConfirmExchange_8905> getParserForType() {
         return PARSER;
      }

      public C2S_ConfirmExchange_8905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ConfirmExchange_8905OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ConfirmExchange_8905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_ConfirmExchange_8905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ConfirmExchange_8905_descriptor;
         }

         public C2S_ConfirmExchange_8905 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_ConfirmExchange_8905.getDefaultInstance();
         }

         public C2S_ConfirmExchange_8905 build() {
            C2S_ConfirmExchange_8905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ConfirmExchange_8905 buildPartial() {
            C2S_ConfirmExchange_8905 result = new C2S_ConfirmExchange_8905(this);
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
            if (other instanceof C2S_ConfirmExchange_8905) {
               return this.mergeFrom((C2S_ConfirmExchange_8905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ConfirmExchange_8905 other) {
            if (other == HeroClubMsg.C2S_ConfirmExchange_8905.getDefaultInstance()) {
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
            C2S_ConfirmExchange_8905 parsedMessage = null;

            try {
               parsedMessage = (C2S_ConfirmExchange_8905)HeroClubMsg.C2S_ConfirmExchange_8905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ConfirmExchange_8905)e.getUnfinishedMessage();
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

   public static final class S2C_ConfirmExchangeResult_8906 extends GeneratedMessageV3 implements S2C_ConfirmExchangeResult_8906OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_ConfirmExchangeResult_8906 DEFAULT_INSTANCE = new S2C_ConfirmExchangeResult_8906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ConfirmExchangeResult_8906> PARSER = new AbstractParser<S2C_ConfirmExchangeResult_8906>() {
         public S2C_ConfirmExchangeResult_8906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ConfirmExchangeResult_8906(input, extensionRegistry);
         }
      };

      private S2C_ConfirmExchangeResult_8906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ConfirmExchangeResult_8906() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ConfirmExchangeResult_8906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ConfirmExchangeResult_8906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ConfirmExchangeResult_8906.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.code_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ConfirmExchangeResult_8906)) {
            return super.equals(obj);
         } else {
            S2C_ConfirmExchangeResult_8906 other = (S2C_ConfirmExchangeResult_8906)obj;
            if (this.hasCode() != other.hasCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConfirmExchangeResult_8906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(InputStream input) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ConfirmExchangeResult_8906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ConfirmExchangeResult_8906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ConfirmExchangeResult_8906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConfirmExchangeResult_8906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ConfirmExchangeResult_8906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ConfirmExchangeResult_8906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ConfirmExchangeResult_8906> parser() {
         return PARSER;
      }

      public Parser<S2C_ConfirmExchangeResult_8906> getParserForType() {
         return PARSER;
      }

      public S2C_ConfirmExchangeResult_8906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ConfirmExchangeResult_8906OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ConfirmExchangeResult_8906.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_ConfirmExchangeResult_8906.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ConfirmExchangeResult_8906_descriptor;
         }

         public S2C_ConfirmExchangeResult_8906 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_ConfirmExchangeResult_8906.getDefaultInstance();
         }

         public S2C_ConfirmExchangeResult_8906 build() {
            S2C_ConfirmExchangeResult_8906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ConfirmExchangeResult_8906 buildPartial() {
            S2C_ConfirmExchangeResult_8906 result = new S2C_ConfirmExchangeResult_8906(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_ConfirmExchangeResult_8906) {
               return this.mergeFrom((S2C_ConfirmExchangeResult_8906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ConfirmExchangeResult_8906 other) {
            if (other == HeroClubMsg.S2C_ConfirmExchangeResult_8906.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ConfirmExchangeResult_8906 parsedMessage = null;

            try {
               parsedMessage = (S2C_ConfirmExchangeResult_8906)HeroClubMsg.S2C_ConfirmExchangeResult_8906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ConfirmExchangeResult_8906)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CancelExchange_8907 extends GeneratedMessageV3 implements C2S_CancelExchange_8907OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CancelExchange_8907 DEFAULT_INSTANCE = new C2S_CancelExchange_8907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CancelExchange_8907> PARSER = new AbstractParser<C2S_CancelExchange_8907>() {
         public C2S_CancelExchange_8907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CancelExchange_8907(input, extensionRegistry);
         }
      };

      private C2S_CancelExchange_8907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CancelExchange_8907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CancelExchange_8907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CancelExchange_8907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CancelExchange_8907.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CancelExchange_8907)) {
            return super.equals(obj);
         } else {
            C2S_CancelExchange_8907 other = (C2S_CancelExchange_8907)obj;
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

      public static C2S_CancelExchange_8907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data);
      }

      public static C2S_CancelExchange_8907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CancelExchange_8907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data);
      }

      public static C2S_CancelExchange_8907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CancelExchange_8907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data);
      }

      public static C2S_CancelExchange_8907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CancelExchange_8907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CancelExchange_8907 parseFrom(InputStream input) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CancelExchange_8907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CancelExchange_8907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CancelExchange_8907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CancelExchange_8907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CancelExchange_8907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CancelExchange_8907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CancelExchange_8907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CancelExchange_8907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CancelExchange_8907> parser() {
         return PARSER;
      }

      public Parser<C2S_CancelExchange_8907> getParserForType() {
         return PARSER;
      }

      public C2S_CancelExchange_8907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CancelExchange_8907OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CancelExchange_8907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_CancelExchange_8907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_CancelExchange_8907_descriptor;
         }

         public C2S_CancelExchange_8907 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_CancelExchange_8907.getDefaultInstance();
         }

         public C2S_CancelExchange_8907 build() {
            C2S_CancelExchange_8907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CancelExchange_8907 buildPartial() {
            C2S_CancelExchange_8907 result = new C2S_CancelExchange_8907(this);
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
            if (other instanceof C2S_CancelExchange_8907) {
               return this.mergeFrom((C2S_CancelExchange_8907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CancelExchange_8907 other) {
            if (other == HeroClubMsg.C2S_CancelExchange_8907.getDefaultInstance()) {
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
            C2S_CancelExchange_8907 parsedMessage = null;

            try {
               parsedMessage = (C2S_CancelExchange_8907)HeroClubMsg.C2S_CancelExchange_8907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CancelExchange_8907)e.getUnfinishedMessage();
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

   public static final class S2C_ExchangeInfoResult_8908 extends GeneratedMessageV3 implements S2C_ExchangeInfoResult_8908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ExchangeInfoResult_8908 DEFAULT_INSTANCE = new S2C_ExchangeInfoResult_8908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExchangeInfoResult_8908> PARSER = new AbstractParser<S2C_ExchangeInfoResult_8908>() {
         public S2C_ExchangeInfoResult_8908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExchangeInfoResult_8908(input, extensionRegistry);
         }
      };

      private S2C_ExchangeInfoResult_8908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExchangeInfoResult_8908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExchangeInfoResult_8908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExchangeInfoResult_8908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeInfoResult_8908.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExchangeInfoResult_8908)) {
            return super.equals(obj);
         } else {
            S2C_ExchangeInfoResult_8908 other = (S2C_ExchangeInfoResult_8908)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(InputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExchangeInfoResult_8908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExchangeInfoResult_8908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExchangeInfoResult_8908> parser() {
         return PARSER;
      }

      public Parser<S2C_ExchangeInfoResult_8908> getParserForType() {
         return PARSER;
      }

      public S2C_ExchangeInfoResult_8908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExchangeInfoResult_8908OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeInfoResult_8908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_ExchangeInfoResult_8908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8908_descriptor;
         }

         public S2C_ExchangeInfoResult_8908 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_ExchangeInfoResult_8908.getDefaultInstance();
         }

         public S2C_ExchangeInfoResult_8908 build() {
            S2C_ExchangeInfoResult_8908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExchangeInfoResult_8908 buildPartial() {
            S2C_ExchangeInfoResult_8908 result = new S2C_ExchangeInfoResult_8908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ExchangeInfoResult_8908) {
               return this.mergeFrom((S2C_ExchangeInfoResult_8908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExchangeInfoResult_8908 other) {
            if (other == HeroClubMsg.S2C_ExchangeInfoResult_8908.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExchangeInfoResult_8908 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExchangeInfoResult_8908)HeroClubMsg.S2C_ExchangeInfoResult_8908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExchangeInfoResult_8908)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ExchangeInfo_8909 extends GeneratedMessageV3 implements C2S_ExchangeInfo_8909OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ExchangeInfo_8909 DEFAULT_INSTANCE = new C2S_ExchangeInfo_8909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExchangeInfo_8909> PARSER = new AbstractParser<C2S_ExchangeInfo_8909>() {
         public C2S_ExchangeInfo_8909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExchangeInfo_8909(input, extensionRegistry);
         }
      };

      private C2S_ExchangeInfo_8909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExchangeInfo_8909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExchangeInfo_8909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExchangeInfo_8909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExchangeInfo_8909.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ExchangeInfo_8909)) {
            return super.equals(obj);
         } else {
            C2S_ExchangeInfo_8909 other = (C2S_ExchangeInfo_8909)obj;
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

      public static C2S_ExchangeInfo_8909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeInfo_8909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(InputStream input) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExchangeInfo_8909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExchangeInfo_8909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExchangeInfo_8909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeInfo_8909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExchangeInfo_8909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExchangeInfo_8909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExchangeInfo_8909> parser() {
         return PARSER;
      }

      public Parser<C2S_ExchangeInfo_8909> getParserForType() {
         return PARSER;
      }

      public C2S_ExchangeInfo_8909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExchangeInfo_8909OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExchangeInfo_8909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_ExchangeInfo_8909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_ExchangeInfo_8909_descriptor;
         }

         public C2S_ExchangeInfo_8909 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_ExchangeInfo_8909.getDefaultInstance();
         }

         public C2S_ExchangeInfo_8909 build() {
            C2S_ExchangeInfo_8909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExchangeInfo_8909 buildPartial() {
            C2S_ExchangeInfo_8909 result = new C2S_ExchangeInfo_8909(this);
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
            if (other instanceof C2S_ExchangeInfo_8909) {
               return this.mergeFrom((C2S_ExchangeInfo_8909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExchangeInfo_8909 other) {
            if (other == HeroClubMsg.C2S_ExchangeInfo_8909.getDefaultInstance()) {
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
            C2S_ExchangeInfo_8909 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExchangeInfo_8909)HeroClubMsg.C2S_ExchangeInfo_8909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExchangeInfo_8909)e.getUnfinishedMessage();
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

   public static final class S2C_ExchangeInfoResult_8910 extends GeneratedMessageV3 implements S2C_ExchangeInfoResult_8910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_ExchangeInfoResult_8910 DEFAULT_INSTANCE = new S2C_ExchangeInfoResult_8910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExchangeInfoResult_8910> PARSER = new AbstractParser<S2C_ExchangeInfoResult_8910>() {
         public S2C_ExchangeInfoResult_8910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExchangeInfoResult_8910(input, extensionRegistry);
         }
      };

      private S2C_ExchangeInfoResult_8910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExchangeInfoResult_8910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExchangeInfoResult_8910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExchangeInfoResult_8910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeInfoResult_8910.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ExchangeInfoResult_8910)) {
            return super.equals(obj);
         } else {
            S2C_ExchangeInfoResult_8910 other = (S2C_ExchangeInfoResult_8910)obj;
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

      public static S2C_ExchangeInfoResult_8910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeInfoResult_8910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(InputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeInfoResult_8910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeInfoResult_8910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExchangeInfoResult_8910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExchangeInfoResult_8910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExchangeInfoResult_8910> parser() {
         return PARSER;
      }

      public Parser<S2C_ExchangeInfoResult_8910> getParserForType() {
         return PARSER;
      }

      public S2C_ExchangeInfoResult_8910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExchangeInfoResult_8910OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeInfoResult_8910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_ExchangeInfoResult_8910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_ExchangeInfoResult_8910_descriptor;
         }

         public S2C_ExchangeInfoResult_8910 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_ExchangeInfoResult_8910.getDefaultInstance();
         }

         public S2C_ExchangeInfoResult_8910 build() {
            S2C_ExchangeInfoResult_8910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExchangeInfoResult_8910 buildPartial() {
            S2C_ExchangeInfoResult_8910 result = new S2C_ExchangeInfoResult_8910(this);
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
            if (other instanceof S2C_ExchangeInfoResult_8910) {
               return this.mergeFrom((S2C_ExchangeInfoResult_8910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExchangeInfoResult_8910 other) {
            if (other == HeroClubMsg.S2C_ExchangeInfoResult_8910.getDefaultInstance()) {
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
            S2C_ExchangeInfoResult_8910 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExchangeInfoResult_8910)HeroClubMsg.S2C_ExchangeInfoResult_8910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExchangeInfoResult_8910)e.getUnfinishedMessage();
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

   public static final class C2S_Buy_8911 extends GeneratedMessageV3 implements C2S_Buy_8911OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_Buy_8911 DEFAULT_INSTANCE = new C2S_Buy_8911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Buy_8911> PARSER = new AbstractParser<C2S_Buy_8911>() {
         public C2S_Buy_8911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Buy_8911(input, extensionRegistry);
         }
      };

      private C2S_Buy_8911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Buy_8911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Buy_8911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Buy_8911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Buy_8911.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Buy_8911)) {
            return super.equals(obj);
         } else {
            C2S_Buy_8911 other = (C2S_Buy_8911)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Buy_8911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data);
      }

      public static C2S_Buy_8911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_8911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data);
      }

      public static C2S_Buy_8911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_8911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data);
      }

      public static C2S_Buy_8911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_8911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_8911 parseFrom(InputStream input) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Buy_8911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Buy_8911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Buy_8911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Buy_8911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Buy_8911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_8911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Buy_8911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Buy_8911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Buy_8911> parser() {
         return PARSER;
      }

      public Parser<C2S_Buy_8911> getParserForType() {
         return PARSER;
      }

      public C2S_Buy_8911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Buy_8911OrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Buy_8911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_Buy_8911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Buy_8911_descriptor;
         }

         public C2S_Buy_8911 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_Buy_8911.getDefaultInstance();
         }

         public C2S_Buy_8911 build() {
            C2S_Buy_8911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Buy_8911 buildPartial() {
            C2S_Buy_8911 result = new C2S_Buy_8911(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_Buy_8911) {
               return this.mergeFrom((C2S_Buy_8911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Buy_8911 other) {
            if (other == HeroClubMsg.C2S_Buy_8911.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
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
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Buy_8911 parsedMessage = null;

            try {
               parsedMessage = (C2S_Buy_8911)HeroClubMsg.C2S_Buy_8911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Buy_8911)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_BuyResult_8912 extends GeneratedMessageV3 implements S2C_BuyResult_8912OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyResult_8912 DEFAULT_INSTANCE = new S2C_BuyResult_8912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyResult_8912> PARSER = new AbstractParser<S2C_BuyResult_8912>() {
         public S2C_BuyResult_8912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyResult_8912(input, extensionRegistry);
         }
      };

      private S2C_BuyResult_8912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyResult_8912() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyResult_8912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyResult_8912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyResult_8912.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyResult_8912)) {
            return super.equals(obj);
         } else {
            S2C_BuyResult_8912 other = (S2C_BuyResult_8912)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyResult_8912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data);
      }

      public static S2C_BuyResult_8912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyResult_8912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data);
      }

      public static S2C_BuyResult_8912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyResult_8912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data);
      }

      public static S2C_BuyResult_8912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyResult_8912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyResult_8912 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyResult_8912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyResult_8912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyResult_8912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyResult_8912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyResult_8912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyResult_8912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyResult_8912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyResult_8912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyResult_8912> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyResult_8912> getParserForType() {
         return PARSER;
      }

      public S2C_BuyResult_8912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyResult_8912OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyResult_8912.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_BuyResult_8912.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_BuyResult_8912_descriptor;
         }

         public S2C_BuyResult_8912 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_BuyResult_8912.getDefaultInstance();
         }

         public S2C_BuyResult_8912 build() {
            S2C_BuyResult_8912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyResult_8912 buildPartial() {
            S2C_BuyResult_8912 result = new S2C_BuyResult_8912(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_BuyResult_8912) {
               return this.mergeFrom((S2C_BuyResult_8912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyResult_8912 other) {
            if (other == HeroClubMsg.S2C_BuyResult_8912.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyResult_8912 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyResult_8912)HeroClubMsg.S2C_BuyResult_8912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyResult_8912)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class DrawRecordInfo extends GeneratedMessageV3 implements DrawRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int TIME_FIELD_NUMBER = 2;
      private int time_;
      private byte memoizedIsInitialized;
      private static final DrawRecordInfo DEFAULT_INSTANCE = new DrawRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<DrawRecordInfo> PARSER = new AbstractParser<DrawRecordInfo>() {
         public DrawRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DrawRecordInfo(input, extensionRegistry);
         }
      };

      private DrawRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DrawRecordInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DrawRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DrawRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.time_ = input.readInt32();
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecordInfo.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
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
         } else if (!this.hasTime()) {
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
            output.writeInt32(2, this.time_);
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
               size += CodedOutputStream.computeInt32Size(2, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DrawRecordInfo)) {
            return super.equals(obj);
         } else {
            DrawRecordInfo other = (DrawRecordInfo)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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

            if (this.hasTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DrawRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data);
      }

      public static DrawRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data);
      }

      public static DrawRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data);
      }

      public static DrawRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecordInfo parseFrom(InputStream input) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DrawRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DrawRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DrawRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DrawRecordInfo> parser() {
         return PARSER;
      }

      public Parser<DrawRecordInfo> getParserForType() {
         return PARSER;
      }

      public DrawRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawRecordInfoOrBuilder {
         private int bitField0_;
         private int heroId_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.DrawRecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_DrawRecordInfo_descriptor;
         }

         public DrawRecordInfo getDefaultInstanceForType() {
            return HeroClubMsg.DrawRecordInfo.getDefaultInstance();
         }

         public DrawRecordInfo build() {
            DrawRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DrawRecordInfo buildPartial() {
            DrawRecordInfo result = new DrawRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof DrawRecordInfo) {
               return this.mergeFrom((DrawRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DrawRecordInfo other) {
            if (other == HeroClubMsg.DrawRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
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
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DrawRecordInfo parsedMessage = null;

            try {
               parsedMessage = (DrawRecordInfo)HeroClubMsg.DrawRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DrawRecordInfo)e.getUnfinishedMessage();
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

         public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 2;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
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

   public static final class C2S_Record_8913 extends GeneratedMessageV3 implements C2S_Record_8913OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Record_8913 DEFAULT_INSTANCE = new C2S_Record_8913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Record_8913> PARSER = new AbstractParser<C2S_Record_8913>() {
         public C2S_Record_8913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Record_8913(input, extensionRegistry);
         }
      };

      private C2S_Record_8913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Record_8913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Record_8913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Record_8913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_8913.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Record_8913)) {
            return super.equals(obj);
         } else {
            C2S_Record_8913 other = (C2S_Record_8913)obj;
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

      public static C2S_Record_8913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data);
      }

      public static C2S_Record_8913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_8913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data);
      }

      public static C2S_Record_8913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_8913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data);
      }

      public static C2S_Record_8913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_8913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_8913 parseFrom(InputStream input) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_8913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_8913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Record_8913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_8913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_8913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_8913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Record_8913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Record_8913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Record_8913> parser() {
         return PARSER;
      }

      public Parser<C2S_Record_8913> getParserForType() {
         return PARSER;
      }

      public C2S_Record_8913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Record_8913OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_8913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.C2S_Record_8913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_C2S_Record_8913_descriptor;
         }

         public C2S_Record_8913 getDefaultInstanceForType() {
            return HeroClubMsg.C2S_Record_8913.getDefaultInstance();
         }

         public C2S_Record_8913 build() {
            C2S_Record_8913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Record_8913 buildPartial() {
            C2S_Record_8913 result = new C2S_Record_8913(this);
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
            if (other instanceof C2S_Record_8913) {
               return this.mergeFrom((C2S_Record_8913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Record_8913 other) {
            if (other == HeroClubMsg.C2S_Record_8913.getDefaultInstance()) {
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
            C2S_Record_8913 parsedMessage = null;

            try {
               parsedMessage = (C2S_Record_8913)HeroClubMsg.C2S_Record_8913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Record_8913)e.getUnfinishedMessage();
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

   public static final class S2C_Record_8914 extends GeneratedMessageV3 implements S2C_Record_8914OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DRAWINFOS_FIELD_NUMBER = 1;
      private List<DrawRecordInfo> drawInfos_;
      public static final int EXCHANGEINFOS_FIELD_NUMBER = 2;
      private List<DrawRecordInfo> exchangeInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_Record_8914 DEFAULT_INSTANCE = new S2C_Record_8914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Record_8914> PARSER = new AbstractParser<S2C_Record_8914>() {
         public S2C_Record_8914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Record_8914(input, extensionRegistry);
         }
      };

      private S2C_Record_8914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Record_8914() {
         this.memoizedIsInitialized = -1;
         this.drawInfos_ = Collections.emptyList();
         this.exchangeInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Record_8914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Record_8914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.drawInfos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.drawInfos_.add(input.readMessage(HeroClubMsg.DrawRecordInfo.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.exchangeInfos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.exchangeInfos_.add(input.readMessage(HeroClubMsg.DrawRecordInfo.PARSER, extensionRegistry));
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
                  this.drawInfos_ = Collections.unmodifiableList(this.drawInfos_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.exchangeInfos_ = Collections.unmodifiableList(this.exchangeInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_8914.class, Builder.class);
      }

      public List<DrawRecordInfo> getDrawInfosList() {
         return this.drawInfos_;
      }

      public List<? extends DrawRecordInfoOrBuilder> getDrawInfosOrBuilderList() {
         return this.drawInfos_;
      }

      public int getDrawInfosCount() {
         return this.drawInfos_.size();
      }

      public DrawRecordInfo getDrawInfos(int index) {
         return (DrawRecordInfo)this.drawInfos_.get(index);
      }

      public DrawRecordInfoOrBuilder getDrawInfosOrBuilder(int index) {
         return (DrawRecordInfoOrBuilder)this.drawInfos_.get(index);
      }

      public List<DrawRecordInfo> getExchangeInfosList() {
         return this.exchangeInfos_;
      }

      public List<? extends DrawRecordInfoOrBuilder> getExchangeInfosOrBuilderList() {
         return this.exchangeInfos_;
      }

      public int getExchangeInfosCount() {
         return this.exchangeInfos_.size();
      }

      public DrawRecordInfo getExchangeInfos(int index) {
         return (DrawRecordInfo)this.exchangeInfos_.get(index);
      }

      public DrawRecordInfoOrBuilder getExchangeInfosOrBuilder(int index) {
         return (DrawRecordInfoOrBuilder)this.exchangeInfos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDrawInfosCount(); ++i) {
               if (!this.getDrawInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getExchangeInfosCount(); ++i) {
               if (!this.getExchangeInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.drawInfos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.drawInfos_.get(i));
         }

         for(int i = 0; i < this.exchangeInfos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.exchangeInfos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.drawInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.drawInfos_.get(i));
            }

            for(int i = 0; i < this.exchangeInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.exchangeInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Record_8914)) {
            return super.equals(obj);
         } else {
            S2C_Record_8914 other = (S2C_Record_8914)obj;
            if (!this.getDrawInfosList().equals(other.getDrawInfosList())) {
               return false;
            } else if (!this.getExchangeInfosList().equals(other.getExchangeInfosList())) {
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
            if (this.getDrawInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawInfosList().hashCode();
            }

            if (this.getExchangeInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExchangeInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Record_8914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data);
      }

      public static S2C_Record_8914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_8914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data);
      }

      public static S2C_Record_8914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_8914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data);
      }

      public static S2C_Record_8914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_8914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_8914 parseFrom(InputStream input) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_8914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_8914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Record_8914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_8914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_8914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_8914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Record_8914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Record_8914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Record_8914> parser() {
         return PARSER;
      }

      public Parser<S2C_Record_8914> getParserForType() {
         return PARSER;
      }

      public S2C_Record_8914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Record_8914OrBuilder {
         private int bitField0_;
         private List<DrawRecordInfo> drawInfos_;
         private RepeatedFieldBuilderV3<DrawRecordInfo, DrawRecordInfo.Builder, DrawRecordInfoOrBuilder> drawInfosBuilder_;
         private List<DrawRecordInfo> exchangeInfos_;
         private RepeatedFieldBuilderV3<DrawRecordInfo, DrawRecordInfo.Builder, DrawRecordInfoOrBuilder> exchangeInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_8914.class, Builder.class);
         }

         private Builder() {
            this.drawInfos_ = Collections.emptyList();
            this.exchangeInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.drawInfos_ = Collections.emptyList();
            this.exchangeInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroClubMsg.S2C_Record_8914.alwaysUseFieldBuilders) {
               this.getDrawInfosFieldBuilder();
               this.getExchangeInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.drawInfosBuilder_ == null) {
               this.drawInfos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.drawInfosBuilder_.clear();
            }

            if (this.exchangeInfosBuilder_ == null) {
               this.exchangeInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.exchangeInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroClubMsg.internal_static_heroClub_com_gzbz_protobuf_S2C_Record_8914_descriptor;
         }

         public S2C_Record_8914 getDefaultInstanceForType() {
            return HeroClubMsg.S2C_Record_8914.getDefaultInstance();
         }

         public S2C_Record_8914 build() {
            S2C_Record_8914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Record_8914 buildPartial() {
            S2C_Record_8914 result = new S2C_Record_8914(this);
            int from_bitField0_ = this.bitField0_;
            if (this.drawInfosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.drawInfos_ = Collections.unmodifiableList(this.drawInfos_);
                  this.bitField0_ &= -2;
               }

               result.drawInfos_ = this.drawInfos_;
            } else {
               result.drawInfos_ = this.drawInfosBuilder_.build();
            }

            if (this.exchangeInfosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.exchangeInfos_ = Collections.unmodifiableList(this.exchangeInfos_);
                  this.bitField0_ &= -3;
               }

               result.exchangeInfos_ = this.exchangeInfos_;
            } else {
               result.exchangeInfos_ = this.exchangeInfosBuilder_.build();
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
            if (other instanceof S2C_Record_8914) {
               return this.mergeFrom((S2C_Record_8914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Record_8914 other) {
            if (other == HeroClubMsg.S2C_Record_8914.getDefaultInstance()) {
               return this;
            } else {
               if (this.drawInfosBuilder_ == null) {
                  if (!other.drawInfos_.isEmpty()) {
                     if (this.drawInfos_.isEmpty()) {
                        this.drawInfos_ = other.drawInfos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDrawInfosIsMutable();
                        this.drawInfos_.addAll(other.drawInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.drawInfos_.isEmpty()) {
                  if (this.drawInfosBuilder_.isEmpty()) {
                     this.drawInfosBuilder_.dispose();
                     this.drawInfosBuilder_ = null;
                     this.drawInfos_ = other.drawInfos_;
                     this.bitField0_ &= -2;
                     this.drawInfosBuilder_ = HeroClubMsg.S2C_Record_8914.alwaysUseFieldBuilders ? this.getDrawInfosFieldBuilder() : null;
                  } else {
                     this.drawInfosBuilder_.addAllMessages(other.drawInfos_);
                  }
               }

               if (this.exchangeInfosBuilder_ == null) {
                  if (!other.exchangeInfos_.isEmpty()) {
                     if (this.exchangeInfos_.isEmpty()) {
                        this.exchangeInfos_ = other.exchangeInfos_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureExchangeInfosIsMutable();
                        this.exchangeInfos_.addAll(other.exchangeInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.exchangeInfos_.isEmpty()) {
                  if (this.exchangeInfosBuilder_.isEmpty()) {
                     this.exchangeInfosBuilder_.dispose();
                     this.exchangeInfosBuilder_ = null;
                     this.exchangeInfos_ = other.exchangeInfos_;
                     this.bitField0_ &= -3;
                     this.exchangeInfosBuilder_ = HeroClubMsg.S2C_Record_8914.alwaysUseFieldBuilders ? this.getExchangeInfosFieldBuilder() : null;
                  } else {
                     this.exchangeInfosBuilder_.addAllMessages(other.exchangeInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDrawInfosCount(); ++i) {
               if (!this.getDrawInfos(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getExchangeInfosCount(); ++i) {
               if (!this.getExchangeInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Record_8914 parsedMessage = null;

            try {
               parsedMessage = (S2C_Record_8914)HeroClubMsg.S2C_Record_8914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Record_8914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDrawInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.drawInfos_ = new ArrayList(this.drawInfos_);
               this.bitField0_ |= 1;
            }

         }

         public List<DrawRecordInfo> getDrawInfosList() {
            return this.drawInfosBuilder_ == null ? Collections.unmodifiableList(this.drawInfos_) : this.drawInfosBuilder_.getMessageList();
         }

         public int getDrawInfosCount() {
            return this.drawInfosBuilder_ == null ? this.drawInfos_.size() : this.drawInfosBuilder_.getCount();
         }

         public DrawRecordInfo getDrawInfos(int index) {
            return this.drawInfosBuilder_ == null ? (DrawRecordInfo)this.drawInfos_.get(index) : (DrawRecordInfo)this.drawInfosBuilder_.getMessage(index);
         }

         public Builder setDrawInfos(int index, DrawRecordInfo value) {
            if (this.drawInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawInfosIsMutable();
               this.drawInfos_.set(index, value);
               this.onChanged();
            } else {
               this.drawInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDrawInfos(int index, DrawRecordInfo.Builder builderForValue) {
            if (this.drawInfosBuilder_ == null) {
               this.ensureDrawInfosIsMutable();
               this.drawInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.drawInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDrawInfos(DrawRecordInfo value) {
            if (this.drawInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawInfosIsMutable();
               this.drawInfos_.add(value);
               this.onChanged();
            } else {
               this.drawInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDrawInfos(int index, DrawRecordInfo value) {
            if (this.drawInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawInfosIsMutable();
               this.drawInfos_.add(index, value);
               this.onChanged();
            } else {
               this.drawInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDrawInfos(DrawRecordInfo.Builder builderForValue) {
            if (this.drawInfosBuilder_ == null) {
               this.ensureDrawInfosIsMutable();
               this.drawInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.drawInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDrawInfos(int index, DrawRecordInfo.Builder builderForValue) {
            if (this.drawInfosBuilder_ == null) {
               this.ensureDrawInfosIsMutable();
               this.drawInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.drawInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDrawInfos(Iterable<? extends DrawRecordInfo> values) {
            if (this.drawInfosBuilder_ == null) {
               this.ensureDrawInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.drawInfos_);
               this.onChanged();
            } else {
               this.drawInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDrawInfos() {
            if (this.drawInfosBuilder_ == null) {
               this.drawInfos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.drawInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeDrawInfos(int index) {
            if (this.drawInfosBuilder_ == null) {
               this.ensureDrawInfosIsMutable();
               this.drawInfos_.remove(index);
               this.onChanged();
            } else {
               this.drawInfosBuilder_.remove(index);
            }

            return this;
         }

         public DrawRecordInfo.Builder getDrawInfosBuilder(int index) {
            return (DrawRecordInfo.Builder)this.getDrawInfosFieldBuilder().getBuilder(index);
         }

         public DrawRecordInfoOrBuilder getDrawInfosOrBuilder(int index) {
            return this.drawInfosBuilder_ == null ? (DrawRecordInfoOrBuilder)this.drawInfos_.get(index) : (DrawRecordInfoOrBuilder)this.drawInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DrawRecordInfoOrBuilder> getDrawInfosOrBuilderList() {
            return this.drawInfosBuilder_ != null ? this.drawInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.drawInfos_);
         }

         public DrawRecordInfo.Builder addDrawInfosBuilder() {
            return (DrawRecordInfo.Builder)this.getDrawInfosFieldBuilder().addBuilder(HeroClubMsg.DrawRecordInfo.getDefaultInstance());
         }

         public DrawRecordInfo.Builder addDrawInfosBuilder(int index) {
            return (DrawRecordInfo.Builder)this.getDrawInfosFieldBuilder().addBuilder(index, HeroClubMsg.DrawRecordInfo.getDefaultInstance());
         }

         public List<DrawRecordInfo.Builder> getDrawInfosBuilderList() {
            return this.getDrawInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DrawRecordInfo, DrawRecordInfo.Builder, DrawRecordInfoOrBuilder> getDrawInfosFieldBuilder() {
            if (this.drawInfosBuilder_ == null) {
               this.drawInfosBuilder_ = new RepeatedFieldBuilderV3(this.drawInfos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.drawInfos_ = null;
            }

            return this.drawInfosBuilder_;
         }

         private void ensureExchangeInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.exchangeInfos_ = new ArrayList(this.exchangeInfos_);
               this.bitField0_ |= 2;
            }

         }

         public List<DrawRecordInfo> getExchangeInfosList() {
            return this.exchangeInfosBuilder_ == null ? Collections.unmodifiableList(this.exchangeInfos_) : this.exchangeInfosBuilder_.getMessageList();
         }

         public int getExchangeInfosCount() {
            return this.exchangeInfosBuilder_ == null ? this.exchangeInfos_.size() : this.exchangeInfosBuilder_.getCount();
         }

         public DrawRecordInfo getExchangeInfos(int index) {
            return this.exchangeInfosBuilder_ == null ? (DrawRecordInfo)this.exchangeInfos_.get(index) : (DrawRecordInfo)this.exchangeInfosBuilder_.getMessage(index);
         }

         public Builder setExchangeInfos(int index, DrawRecordInfo value) {
            if (this.exchangeInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.set(index, value);
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setExchangeInfos(int index, DrawRecordInfo.Builder builderForValue) {
            if (this.exchangeInfosBuilder_ == null) {
               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addExchangeInfos(DrawRecordInfo value) {
            if (this.exchangeInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.add(value);
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addExchangeInfos(int index, DrawRecordInfo value) {
            if (this.exchangeInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.add(index, value);
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addExchangeInfos(DrawRecordInfo.Builder builderForValue) {
            if (this.exchangeInfosBuilder_ == null) {
               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addExchangeInfos(int index, DrawRecordInfo.Builder builderForValue) {
            if (this.exchangeInfosBuilder_ == null) {
               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllExchangeInfos(Iterable<? extends DrawRecordInfo> values) {
            if (this.exchangeInfosBuilder_ == null) {
               this.ensureExchangeInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.exchangeInfos_);
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearExchangeInfos() {
            if (this.exchangeInfosBuilder_ == null) {
               this.exchangeInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeExchangeInfos(int index) {
            if (this.exchangeInfosBuilder_ == null) {
               this.ensureExchangeInfosIsMutable();
               this.exchangeInfos_.remove(index);
               this.onChanged();
            } else {
               this.exchangeInfosBuilder_.remove(index);
            }

            return this;
         }

         public DrawRecordInfo.Builder getExchangeInfosBuilder(int index) {
            return (DrawRecordInfo.Builder)this.getExchangeInfosFieldBuilder().getBuilder(index);
         }

         public DrawRecordInfoOrBuilder getExchangeInfosOrBuilder(int index) {
            return this.exchangeInfosBuilder_ == null ? (DrawRecordInfoOrBuilder)this.exchangeInfos_.get(index) : (DrawRecordInfoOrBuilder)this.exchangeInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DrawRecordInfoOrBuilder> getExchangeInfosOrBuilderList() {
            return this.exchangeInfosBuilder_ != null ? this.exchangeInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.exchangeInfos_);
         }

         public DrawRecordInfo.Builder addExchangeInfosBuilder() {
            return (DrawRecordInfo.Builder)this.getExchangeInfosFieldBuilder().addBuilder(HeroClubMsg.DrawRecordInfo.getDefaultInstance());
         }

         public DrawRecordInfo.Builder addExchangeInfosBuilder(int index) {
            return (DrawRecordInfo.Builder)this.getExchangeInfosFieldBuilder().addBuilder(index, HeroClubMsg.DrawRecordInfo.getDefaultInstance());
         }

         public List<DrawRecordInfo.Builder> getExchangeInfosBuilderList() {
            return this.getExchangeInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DrawRecordInfo, DrawRecordInfo.Builder, DrawRecordInfoOrBuilder> getExchangeInfosFieldBuilder() {
            if (this.exchangeInfosBuilder_ == null) {
               this.exchangeInfosBuilder_ = new RepeatedFieldBuilderV3(this.exchangeInfos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.exchangeInfos_ = null;
            }

            return this.exchangeInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_Buy_8911OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_CancelExchange_8907OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ConfirmExchange_8905OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ExchangeInfo_8909OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Exchange_8903OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_Record_8913OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Recruit_8901OrBuilder extends MessageOrBuilder {
      boolean hasType();

      RecruitType getType();
   }

   public interface DrawRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_BuyResult_8912OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ConfirmExchangeResult_8906OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2C_ExchangeInfoResult_8908OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ExchangeInfoResult_8910OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ExchangeResult_8904OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();
   }

   public interface S2C_Record_8914OrBuilder extends MessageOrBuilder {
      List<DrawRecordInfo> getDrawInfosList();

      DrawRecordInfo getDrawInfos(int index);

      int getDrawInfosCount();

      List<? extends DrawRecordInfoOrBuilder> getDrawInfosOrBuilderList();

      DrawRecordInfoOrBuilder getDrawInfosOrBuilder(int index);

      List<DrawRecordInfo> getExchangeInfosList();

      DrawRecordInfo getExchangeInfos(int index);

      int getExchangeInfosCount();

      List<? extends DrawRecordInfoOrBuilder> getExchangeInfosOrBuilderList();

      DrawRecordInfoOrBuilder getExchangeInfosOrBuilder(int index);
   }

   public interface S2C_RecruitResult_8902OrBuilder extends MessageOrBuilder {
   }
}
