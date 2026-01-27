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

public final class CastSoulMsg {
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CastSoulMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eCastSoul.proto\u0012\u001acastSoul.com.gzbz.protobuf\u001a\fcommon.proto\"e\n\u0010C2S_Unlock_10801\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0017\n\u000fsurmiseHeroCode\u0018\u0003 \u0003(\u0005\"q\n\u0016S2C_OpenUiResult_10802\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.WearPosition\u0012\r\n\u0005state\u0018\u0004 \u0002(\u0005\"N\n\u0012C2S_CastSoul_10803\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\"s\n\u0018S2C_CastSoulResult_10804\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.WearPosition\u0012\r\n\u0005state\u0018\u0004 \u0002(\u0005\"S\n\u0017C2S_ResetCastSoul_10805\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\"x\n\u001dS2C_ResetCastSoulResult_10806\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.WearPosition\u0012\r\n\u0005state\u0018\u0004 \u0002(\u0005\"1\n\u001dC2S_OneKeyResetCastSoul_10807\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"G\n#S2C_OneKeyResetCastSoulResult_10808\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005B\"\n\u0011com.gzbz.protobufB\u000bCastSoulMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor, new String[]{"HeroCode", "Position", "SurmiseHeroCode"});
      internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor, new String[]{"Result", "HeroCode", "Position", "State"});
      internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor, new String[]{"Result", "HeroCode", "Position", "State"});
      internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor, new String[]{"Result", "HeroCode", "Position", "State"});
      internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor, new String[]{"HeroCode"});
      internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor, new String[]{"Result", "HeroCode"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_Unlock_10801 extends GeneratedMessageV3 implements C2S_Unlock_10801OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int SURMISEHEROCODE_FIELD_NUMBER = 3;
      private Internal.IntList surmiseHeroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Unlock_10801 DEFAULT_INSTANCE = new C2S_Unlock_10801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Unlock_10801> PARSER = new AbstractParser<C2S_Unlock_10801>() {
         public C2S_Unlock_10801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Unlock_10801(input, extensionRegistry);
         }
      };

      private C2S_Unlock_10801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Unlock_10801() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.surmiseHeroCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Unlock_10801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Unlock_10801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.surmiseHeroCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.surmiseHeroCode_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.surmiseHeroCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.surmiseHeroCode_.addInt(input.readInt32());
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
                  this.surmiseHeroCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_10801.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public List<Integer> getSurmiseHeroCodeList() {
         return this.surmiseHeroCode_;
      }

      public int getSurmiseHeroCodeCount() {
         return this.surmiseHeroCode_.size();
      }

      public int getSurmiseHeroCode(int index) {
         return this.surmiseHeroCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         for(int i = 0; i < this.surmiseHeroCode_.size(); ++i) {
            output.writeInt32(3, this.surmiseHeroCode_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.surmiseHeroCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.surmiseHeroCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSurmiseHeroCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Unlock_10801)) {
            return super.equals(obj);
         } else {
            C2S_Unlock_10801 other = (C2S_Unlock_10801)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (!this.getSurmiseHeroCodeList().equals(other.getSurmiseHeroCodeList())) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.getSurmiseHeroCodeCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSurmiseHeroCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Unlock_10801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_10801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_10801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_10801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_10801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_10801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_10801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_10801 parseFrom(InputStream input) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_10801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_10801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Unlock_10801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_10801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_10801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_10801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Unlock_10801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Unlock_10801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Unlock_10801> parser() {
         return PARSER;
      }

      public Parser<C2S_Unlock_10801> getParserForType() {
         return PARSER;
      }

      public C2S_Unlock_10801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Unlock_10801OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private Internal.IntList surmiseHeroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_10801.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.surmiseHeroCode_ = CastSoulMsg.C2S_Unlock_10801.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.surmiseHeroCode_ = CastSoulMsg.C2S_Unlock_10801.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.C2S_Unlock_10801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.surmiseHeroCode_ = CastSoulMsg.C2S_Unlock_10801.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_Unlock_10801_descriptor;
         }

         public C2S_Unlock_10801 getDefaultInstanceForType() {
            return CastSoulMsg.C2S_Unlock_10801.getDefaultInstance();
         }

         public C2S_Unlock_10801 build() {
            C2S_Unlock_10801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Unlock_10801 buildPartial() {
            C2S_Unlock_10801 result = new C2S_Unlock_10801(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((this.bitField0_ & 4) != 0) {
               this.surmiseHeroCode_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.surmiseHeroCode_ = this.surmiseHeroCode_;
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
            if (other instanceof C2S_Unlock_10801) {
               return this.mergeFrom((C2S_Unlock_10801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Unlock_10801 other) {
            if (other == CastSoulMsg.C2S_Unlock_10801.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (!other.surmiseHeroCode_.isEmpty()) {
                  if (this.surmiseHeroCode_.isEmpty()) {
                     this.surmiseHeroCode_ = other.surmiseHeroCode_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureSurmiseHeroCodeIsMutable();
                     this.surmiseHeroCode_.addAll(other.surmiseHeroCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Unlock_10801 parsedMessage = null;

            try {
               parsedMessage = (C2S_Unlock_10801)CastSoulMsg.C2S_Unlock_10801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Unlock_10801)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureSurmiseHeroCodeIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.surmiseHeroCode_ = CastSoulMsg.C2S_Unlock_10801.mutableCopy(this.surmiseHeroCode_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getSurmiseHeroCodeList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.surmiseHeroCode_) : this.surmiseHeroCode_);
         }

         public int getSurmiseHeroCodeCount() {
            return this.surmiseHeroCode_.size();
         }

         public int getSurmiseHeroCode(int index) {
            return this.surmiseHeroCode_.getInt(index);
         }

         public Builder setSurmiseHeroCode(int index, int value) {
            this.ensureSurmiseHeroCodeIsMutable();
            this.surmiseHeroCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSurmiseHeroCode(int value) {
            this.ensureSurmiseHeroCodeIsMutable();
            this.surmiseHeroCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSurmiseHeroCode(Iterable<? extends Integer> values) {
            this.ensureSurmiseHeroCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surmiseHeroCode_);
            this.onChanged();
            return this;
         }

         public Builder clearSurmiseHeroCode() {
            this.surmiseHeroCode_ = CastSoulMsg.C2S_Unlock_10801.emptyIntList();
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

   public static final class S2C_OpenUiResult_10802 extends GeneratedMessageV3 implements S2C_OpenUiResult_10802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int STATE_FIELD_NUMBER = 4;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_10802 DEFAULT_INSTANCE = new S2C_OpenUiResult_10802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_10802> PARSER = new AbstractParser<S2C_OpenUiResult_10802>() {
         public S2C_OpenUiResult_10802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_10802(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_10802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_10802() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_10802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_10802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.state_ = input.readInt32();
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_10802.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasState() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getState() {
         return this.state_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
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
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.state_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUiResult_10802)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_10802 other = (S2C_OpenUiResult_10802)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasState()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUiResult_10802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_10802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_10802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_10802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_10802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_10802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_10802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_10802 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_10802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_10802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_10802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_10802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_10802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_10802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_10802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_10802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_10802> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_10802> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_10802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_10802OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;
         private int position_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_10802.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.S2C_OpenUiResult_10802.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OpenUiResult_10802_descriptor;
         }

         public S2C_OpenUiResult_10802 getDefaultInstanceForType() {
            return CastSoulMsg.S2C_OpenUiResult_10802.getDefaultInstance();
         }

         public S2C_OpenUiResult_10802 build() {
            S2C_OpenUiResult_10802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_10802 buildPartial() {
            S2C_OpenUiResult_10802 result = new S2C_OpenUiResult_10802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 8) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_OpenUiResult_10802) {
               return this.mergeFrom((S2C_OpenUiResult_10802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_10802 other) {
            if (other == CastSoulMsg.S2C_OpenUiResult_10802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUiResult_10802 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_10802)CastSoulMsg.S2C_OpenUiResult_10802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_10802)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 8;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -9;
            this.state_ = 0;
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

   public static final class C2S_CastSoul_10803 extends GeneratedMessageV3 implements C2S_CastSoul_10803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_CastSoul_10803 DEFAULT_INSTANCE = new C2S_CastSoul_10803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CastSoul_10803> PARSER = new AbstractParser<C2S_CastSoul_10803>() {
         public C2S_CastSoul_10803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CastSoul_10803(input, extensionRegistry);
         }
      };

      private C2S_CastSoul_10803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CastSoul_10803() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CastSoul_10803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CastSoul_10803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CastSoul_10803.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CastSoul_10803)) {
            return super.equals(obj);
         } else {
            C2S_CastSoul_10803 other = (C2S_CastSoul_10803)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CastSoul_10803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_10803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_10803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_10803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_10803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_10803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_10803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_10803 parseFrom(InputStream input) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_10803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CastSoul_10803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_10803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CastSoul_10803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_10803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_10803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CastSoul_10803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CastSoul_10803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CastSoul_10803> parser() {
         return PARSER;
      }

      public Parser<C2S_CastSoul_10803> getParserForType() {
         return PARSER;
      }

      public C2S_CastSoul_10803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CastSoul_10803OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CastSoul_10803.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.C2S_CastSoul_10803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_CastSoul_10803_descriptor;
         }

         public C2S_CastSoul_10803 getDefaultInstanceForType() {
            return CastSoulMsg.C2S_CastSoul_10803.getDefaultInstance();
         }

         public C2S_CastSoul_10803 build() {
            C2S_CastSoul_10803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CastSoul_10803 buildPartial() {
            C2S_CastSoul_10803 result = new C2S_CastSoul_10803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_CastSoul_10803) {
               return this.mergeFrom((C2S_CastSoul_10803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CastSoul_10803 other) {
            if (other == CastSoulMsg.C2S_CastSoul_10803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CastSoul_10803 parsedMessage = null;

            try {
               parsedMessage = (C2S_CastSoul_10803)CastSoulMsg.C2S_CastSoul_10803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CastSoul_10803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_CastSoulResult_10804 extends GeneratedMessageV3 implements S2C_CastSoulResult_10804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int STATE_FIELD_NUMBER = 4;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_CastSoulResult_10804 DEFAULT_INSTANCE = new S2C_CastSoulResult_10804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CastSoulResult_10804> PARSER = new AbstractParser<S2C_CastSoulResult_10804>() {
         public S2C_CastSoulResult_10804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CastSoulResult_10804(input, extensionRegistry);
         }
      };

      private S2C_CastSoulResult_10804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CastSoulResult_10804() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CastSoulResult_10804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CastSoulResult_10804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.state_ = input.readInt32();
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CastSoulResult_10804.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasState() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getState() {
         return this.state_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
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
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.state_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CastSoulResult_10804)) {
            return super.equals(obj);
         } else {
            S2C_CastSoulResult_10804 other = (S2C_CastSoulResult_10804)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasState()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CastSoulResult_10804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_10804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_10804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_10804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_10804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_10804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_10804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_10804 parseFrom(InputStream input) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_10804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CastSoulResult_10804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_10804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CastSoulResult_10804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_10804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_10804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CastSoulResult_10804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CastSoulResult_10804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CastSoulResult_10804> parser() {
         return PARSER;
      }

      public Parser<S2C_CastSoulResult_10804> getParserForType() {
         return PARSER;
      }

      public S2C_CastSoulResult_10804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CastSoulResult_10804OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;
         private int position_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CastSoulResult_10804.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.S2C_CastSoulResult_10804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_CastSoulResult_10804_descriptor;
         }

         public S2C_CastSoulResult_10804 getDefaultInstanceForType() {
            return CastSoulMsg.S2C_CastSoulResult_10804.getDefaultInstance();
         }

         public S2C_CastSoulResult_10804 build() {
            S2C_CastSoulResult_10804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CastSoulResult_10804 buildPartial() {
            S2C_CastSoulResult_10804 result = new S2C_CastSoulResult_10804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 8) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_CastSoulResult_10804) {
               return this.mergeFrom((S2C_CastSoulResult_10804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CastSoulResult_10804 other) {
            if (other == CastSoulMsg.S2C_CastSoulResult_10804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CastSoulResult_10804 parsedMessage = null;

            try {
               parsedMessage = (S2C_CastSoulResult_10804)CastSoulMsg.S2C_CastSoulResult_10804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CastSoulResult_10804)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 8;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -9;
            this.state_ = 0;
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

   public static final class C2S_ResetCastSoul_10805 extends GeneratedMessageV3 implements C2S_ResetCastSoul_10805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetCastSoul_10805 DEFAULT_INSTANCE = new C2S_ResetCastSoul_10805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetCastSoul_10805> PARSER = new AbstractParser<C2S_ResetCastSoul_10805>() {
         public C2S_ResetCastSoul_10805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetCastSoul_10805(input, extensionRegistry);
         }
      };

      private C2S_ResetCastSoul_10805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetCastSoul_10805() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetCastSoul_10805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetCastSoul_10805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetCastSoul_10805.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetCastSoul_10805)) {
            return super.equals(obj);
         } else {
            C2S_ResetCastSoul_10805 other = (C2S_ResetCastSoul_10805)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetCastSoul_10805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetCastSoul_10805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetCastSoul_10805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetCastSoul_10805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetCastSoul_10805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetCastSoul_10805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetCastSoul_10805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetCastSoul_10805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetCastSoul_10805> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetCastSoul_10805> getParserForType() {
         return PARSER;
      }

      public C2S_ResetCastSoul_10805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetCastSoul_10805OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetCastSoul_10805.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.C2S_ResetCastSoul_10805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_ResetCastSoul_10805_descriptor;
         }

         public C2S_ResetCastSoul_10805 getDefaultInstanceForType() {
            return CastSoulMsg.C2S_ResetCastSoul_10805.getDefaultInstance();
         }

         public C2S_ResetCastSoul_10805 build() {
            C2S_ResetCastSoul_10805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetCastSoul_10805 buildPartial() {
            C2S_ResetCastSoul_10805 result = new C2S_ResetCastSoul_10805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_ResetCastSoul_10805) {
               return this.mergeFrom((C2S_ResetCastSoul_10805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetCastSoul_10805 other) {
            if (other == CastSoulMsg.C2S_ResetCastSoul_10805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetCastSoul_10805 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetCastSoul_10805)CastSoulMsg.C2S_ResetCastSoul_10805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetCastSoul_10805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_ResetCastSoulResult_10806 extends GeneratedMessageV3 implements S2C_ResetCastSoulResult_10806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int STATE_FIELD_NUMBER = 4;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetCastSoulResult_10806 DEFAULT_INSTANCE = new S2C_ResetCastSoulResult_10806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetCastSoulResult_10806> PARSER = new AbstractParser<S2C_ResetCastSoulResult_10806>() {
         public S2C_ResetCastSoulResult_10806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetCastSoulResult_10806(input, extensionRegistry);
         }
      };

      private S2C_ResetCastSoulResult_10806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetCastSoulResult_10806() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetCastSoulResult_10806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetCastSoulResult_10806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.state_ = input.readInt32();
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetCastSoulResult_10806.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.WearPosition getPosition() {
         CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
         return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
      }

      public boolean hasState() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getState() {
         return this.state_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
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
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.state_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetCastSoulResult_10806)) {
            return super.equals(obj);
         } else {
            S2C_ResetCastSoulResult_10806 other = (S2C_ResetCastSoulResult_10806)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasState()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetCastSoulResult_10806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetCastSoulResult_10806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetCastSoulResult_10806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetCastSoulResult_10806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetCastSoulResult_10806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetCastSoulResult_10806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetCastSoulResult_10806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetCastSoulResult_10806> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetCastSoulResult_10806> getParserForType() {
         return PARSER;
      }

      public S2C_ResetCastSoulResult_10806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetCastSoulResult_10806OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;
         private int position_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetCastSoulResult_10806.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.S2C_ResetCastSoulResult_10806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_ResetCastSoulResult_10806_descriptor;
         }

         public S2C_ResetCastSoulResult_10806 getDefaultInstanceForType() {
            return CastSoulMsg.S2C_ResetCastSoulResult_10806.getDefaultInstance();
         }

         public S2C_ResetCastSoulResult_10806 build() {
            S2C_ResetCastSoulResult_10806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetCastSoulResult_10806 buildPartial() {
            S2C_ResetCastSoulResult_10806 result = new S2C_ResetCastSoulResult_10806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 8) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_ResetCastSoulResult_10806) {
               return this.mergeFrom((S2C_ResetCastSoulResult_10806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetCastSoulResult_10806 other) {
            if (other == CastSoulMsg.S2C_ResetCastSoulResult_10806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetCastSoulResult_10806 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetCastSoulResult_10806)CastSoulMsg.S2C_ResetCastSoulResult_10806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetCastSoulResult_10806)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.WearPosition getPosition() {
            CommonMsg.WearPosition result = CommonMsg.WearPosition.valueOf(this.position_);
            return result == null ? CommonMsg.WearPosition.WEARPOSITION_EQUIP_1 : result;
         }

         public Builder setPosition(CommonMsg.WearPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 8;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -9;
            this.state_ = 0;
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

   public static final class C2S_OneKeyResetCastSoul_10807 extends GeneratedMessageV3 implements C2S_OneKeyResetCastSoul_10807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyResetCastSoul_10807 DEFAULT_INSTANCE = new C2S_OneKeyResetCastSoul_10807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyResetCastSoul_10807> PARSER = new AbstractParser<C2S_OneKeyResetCastSoul_10807>() {
         public C2S_OneKeyResetCastSoul_10807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyResetCastSoul_10807(input, extensionRegistry);
         }
      };

      private C2S_OneKeyResetCastSoul_10807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyResetCastSoul_10807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyResetCastSoul_10807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyResetCastSoul_10807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyResetCastSoul_10807.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OneKeyResetCastSoul_10807)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyResetCastSoul_10807 other = (C2S_OneKeyResetCastSoul_10807)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyResetCastSoul_10807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyResetCastSoul_10807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyResetCastSoul_10807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyResetCastSoul_10807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyResetCastSoul_10807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyResetCastSoul_10807> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyResetCastSoul_10807> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyResetCastSoul_10807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyResetCastSoul_10807OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyResetCastSoul_10807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.C2S_OneKeyResetCastSoul_10807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_C2S_OneKeyResetCastSoul_10807_descriptor;
         }

         public C2S_OneKeyResetCastSoul_10807 getDefaultInstanceForType() {
            return CastSoulMsg.C2S_OneKeyResetCastSoul_10807.getDefaultInstance();
         }

         public C2S_OneKeyResetCastSoul_10807 build() {
            C2S_OneKeyResetCastSoul_10807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyResetCastSoul_10807 buildPartial() {
            C2S_OneKeyResetCastSoul_10807 result = new C2S_OneKeyResetCastSoul_10807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_OneKeyResetCastSoul_10807) {
               return this.mergeFrom((C2S_OneKeyResetCastSoul_10807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyResetCastSoul_10807 other) {
            if (other == CastSoulMsg.C2S_OneKeyResetCastSoul_10807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OneKeyResetCastSoul_10807 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyResetCastSoul_10807)CastSoulMsg.C2S_OneKeyResetCastSoul_10807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyResetCastSoul_10807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
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

   public static final class S2C_OneKeyResetCastSoulResult_10808 extends GeneratedMessageV3 implements S2C_OneKeyResetCastSoulResult_10808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyResetCastSoulResult_10808 DEFAULT_INSTANCE = new S2C_OneKeyResetCastSoulResult_10808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyResetCastSoulResult_10808> PARSER = new AbstractParser<S2C_OneKeyResetCastSoulResult_10808>() {
         public S2C_OneKeyResetCastSoulResult_10808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyResetCastSoulResult_10808(input, extensionRegistry);
         }
      };

      private S2C_OneKeyResetCastSoulResult_10808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyResetCastSoulResult_10808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyResetCastSoulResult_10808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyResetCastSoulResult_10808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
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
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyResetCastSoulResult_10808.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
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
         } else if (!this.hasHeroCode()) {
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
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OneKeyResetCastSoulResult_10808)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyResetCastSoulResult_10808 other = (S2C_OneKeyResetCastSoulResult_10808)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyResetCastSoulResult_10808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyResetCastSoulResult_10808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyResetCastSoulResult_10808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyResetCastSoulResult_10808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyResetCastSoulResult_10808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyResetCastSoulResult_10808> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyResetCastSoulResult_10808> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyResetCastSoulResult_10808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyResetCastSoulResult_10808OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyResetCastSoulResult_10808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CastSoulMsg.internal_static_castSoul_com_gzbz_protobuf_S2C_OneKeyResetCastSoulResult_10808_descriptor;
         }

         public S2C_OneKeyResetCastSoulResult_10808 getDefaultInstanceForType() {
            return CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.getDefaultInstance();
         }

         public S2C_OneKeyResetCastSoulResult_10808 build() {
            S2C_OneKeyResetCastSoulResult_10808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyResetCastSoulResult_10808 buildPartial() {
            S2C_OneKeyResetCastSoulResult_10808 result = new S2C_OneKeyResetCastSoulResult_10808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof S2C_OneKeyResetCastSoulResult_10808) {
               return this.mergeFrom((S2C_OneKeyResetCastSoulResult_10808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyResetCastSoulResult_10808 other) {
            if (other == CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
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
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OneKeyResetCastSoulResult_10808 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyResetCastSoulResult_10808)CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyResetCastSoulResult_10808)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
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

   public interface C2S_CastSoul_10803OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();
   }

   public interface C2S_OneKeyResetCastSoul_10807OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_ResetCastSoul_10805OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();
   }

   public interface C2S_Unlock_10801OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      List<Integer> getSurmiseHeroCodeList();

      int getSurmiseHeroCodeCount();

      int getSurmiseHeroCode(int index);
   }

   public interface S2C_CastSoulResult_10804OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasState();

      int getState();
   }

   public interface S2C_OneKeyResetCastSoulResult_10808OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_OpenUiResult_10802OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasState();

      int getState();
   }

   public interface S2C_ResetCastSoulResult_10806OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasState();

      int getState();
   }
}
