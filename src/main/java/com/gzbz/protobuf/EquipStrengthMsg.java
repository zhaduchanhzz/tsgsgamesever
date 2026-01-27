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

public final class EquipStrengthMsg {
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private EquipStrengthMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013EquipStrength.proto\u0012\u001fequipStrength.com.gzbz.protobuf\u001a\fcommon.proto\"¢\u0001\n\u0017C2S_EquipStrength_18501\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\u0012:\n\u0004item\u0018\u0003 \u0002(\u000e2,.equipStrength.com.gzbz.protobuf.ConsumeItem\u0012\u0011\n\ttargetLev\u0018\u0004 \u0002(\u0005\"x\n\u0017S2C_EquipStrength_18502\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0013\n\u000bstrengthLev\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0005 \u0002(\u0005\"S\n\u0017C2S_ResetStrength_18503\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.WearPosition\"h\n\u0017S2C_ResetStrength_18504\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.WearPosition\u0012\u0013\n\u000bstrengthLev\u0018\u0004 \u0002(\u0005\"0\n\u001cC2S_ResetStrengthSkill_18505\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"|\n\u001dC2S_AttackStrengthSkill_18507\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bstrengthLev\u0018\u0003 \u0002(\u0005\u00124\n\rskillPosition\u0018\u0004 \u0002(\u000e2\u001d.common.StrengthSkillPosition\"|\n\u001dS2C_AttackStrengthSkill_18508\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u00129\n\u0011strengthSkillInfo\u0018\u0002 \u0003(\u000b2\u001e.common.EquipStrengthSkillInfo\u0012\u000e\n\u0006result\u0018\u0003 \u0002(\u0005*D\n\u000bConsumeItem\u0012\u000b\n\u0007NO_ITEM\u0010\u0000\u0012\f\n\bADD_ITEM\u0010\u0001\u0012\r\n\tKEEP_ITEM\u0010\u0002\u0012\u000b\n\u0007UP_ITEM\u0010\u0003B'\n\u0011com.gzbz.protobufB\u0010EquipStrengthMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor, new String[]{"HeroCode", "Position", "Item", "TargetLev"});
      internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor, new String[]{"HeroCode", "Position", "StrengthLev", "Result"});
      internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor, new String[]{"HeroCode", "Position", "StrengthLev"});
      internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor, new String[]{"HeroCode"});
      internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor, new String[]{"HeroCode", "StrengthLev", "SkillPosition"});
      internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor, new String[]{"HeroCode", "StrengthSkillInfo", "Result"});
      CommonMsg.getDescriptor();
   }

   public static enum ConsumeItem implements ProtocolMessageEnum {
      NO_ITEM(0),
      ADD_ITEM(1),
      KEEP_ITEM(2),
      UP_ITEM(3);

      public static final int NO_ITEM_VALUE = 0;
      public static final int ADD_ITEM_VALUE = 1;
      public static final int KEEP_ITEM_VALUE = 2;
      public static final int UP_ITEM_VALUE = 3;
      private static final Internal.EnumLiteMap<ConsumeItem> internalValueMap = new Internal.EnumLiteMap<ConsumeItem>() {
         public ConsumeItem findValueByNumber(int number) {
            return EquipStrengthMsg.ConsumeItem.forNumber(number);
         }
      };
      private static final ConsumeItem[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static ConsumeItem valueOf(int value) {
         return forNumber(value);
      }

      public static ConsumeItem forNumber(int value) {
         switch (value) {
            case 0:
               return NO_ITEM;
            case 1:
               return ADD_ITEM;
            case 2:
               return KEEP_ITEM;
            case 3:
               return UP_ITEM;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ConsumeItem> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)EquipStrengthMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static ConsumeItem valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private ConsumeItem(int value) {
         this.value = value;
      }
   }

   public static final class C2S_EquipStrength_18501 extends GeneratedMessageV3 implements C2S_EquipStrength_18501OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEM_FIELD_NUMBER = 3;
      private int item_;
      public static final int TARGETLEV_FIELD_NUMBER = 4;
      private int targetLev_;
      private byte memoizedIsInitialized;
      private static final C2S_EquipStrength_18501 DEFAULT_INSTANCE = new C2S_EquipStrength_18501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EquipStrength_18501> PARSER = new AbstractParser<C2S_EquipStrength_18501>() {
         public C2S_EquipStrength_18501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EquipStrength_18501(input, extensionRegistry);
         }
      };

      private C2S_EquipStrength_18501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EquipStrength_18501() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.item_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EquipStrength_18501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EquipStrength_18501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        ConsumeItem value = EquipStrengthMsg.ConsumeItem.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.item_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.targetLev_ = input.readInt32();
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EquipStrength_18501.class, Builder.class);
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

      public boolean hasItem() {
         return (this.bitField0_ & 4) != 0;
      }

      public ConsumeItem getItem() {
         ConsumeItem result = EquipStrengthMsg.ConsumeItem.valueOf(this.item_);
         return result == null ? EquipStrengthMsg.ConsumeItem.NO_ITEM : result;
      }

      public boolean hasTargetLev() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTargetLev() {
         return this.targetLev_;
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
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetLev()) {
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

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.item_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.targetLev_);
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

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.item_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.targetLev_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EquipStrength_18501)) {
            return super.equals(obj);
         } else {
            C2S_EquipStrength_18501 other = (C2S_EquipStrength_18501)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && this.item_ != other.item_) {
               return false;
            } else if (this.hasTargetLev() != other.hasTargetLev()) {
               return false;
            } else if (this.hasTargetLev() && this.getTargetLev() != other.getTargetLev()) {
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

            if (this.hasItem()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.item_;
            }

            if (this.hasTargetLev()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTargetLev();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EquipStrength_18501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data);
      }

      public static C2S_EquipStrength_18501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipStrength_18501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data);
      }

      public static C2S_EquipStrength_18501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipStrength_18501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data);
      }

      public static C2S_EquipStrength_18501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EquipStrength_18501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EquipStrength_18501 parseFrom(InputStream input) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EquipStrength_18501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EquipStrength_18501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EquipStrength_18501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EquipStrength_18501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EquipStrength_18501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EquipStrength_18501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EquipStrength_18501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EquipStrength_18501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EquipStrength_18501> parser() {
         return PARSER;
      }

      public Parser<C2S_EquipStrength_18501> getParserForType() {
         return PARSER;
      }

      public C2S_EquipStrength_18501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EquipStrength_18501OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int item_;
         private int targetLev_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EquipStrength_18501.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.item_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.item_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EquipStrengthMsg.C2S_EquipStrength_18501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.item_ = 0;
            this.bitField0_ &= -5;
            this.targetLev_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_EquipStrength_18501_descriptor;
         }

         public C2S_EquipStrength_18501 getDefaultInstanceForType() {
            return EquipStrengthMsg.C2S_EquipStrength_18501.getDefaultInstance();
         }

         public C2S_EquipStrength_18501 build() {
            C2S_EquipStrength_18501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EquipStrength_18501 buildPartial() {
            C2S_EquipStrength_18501 result = new C2S_EquipStrength_18501(this);
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
            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.item_ = this.item_;
            if ((from_bitField0_ & 8) != 0) {
               result.targetLev_ = this.targetLev_;
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
            if (other instanceof C2S_EquipStrength_18501) {
               return this.mergeFrom((C2S_EquipStrength_18501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EquipStrength_18501 other) {
            if (other == EquipStrengthMsg.C2S_EquipStrength_18501.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasItem()) {
                  this.setItem(other.getItem());
               }

               if (other.hasTargetLev()) {
                  this.setTargetLev(other.getTargetLev());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else {
               return this.hasTargetLev();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EquipStrength_18501 parsedMessage = null;

            try {
               parsedMessage = (C2S_EquipStrength_18501)EquipStrengthMsg.C2S_EquipStrength_18501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EquipStrength_18501)e.getUnfinishedMessage();
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

         public boolean hasItem() {
            return (this.bitField0_ & 4) != 0;
         }

         public ConsumeItem getItem() {
            ConsumeItem result = EquipStrengthMsg.ConsumeItem.valueOf(this.item_);
            return result == null ? EquipStrengthMsg.ConsumeItem.NO_ITEM : result;
         }

         public Builder setItem(ConsumeItem value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.item_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearItem() {
            this.bitField0_ &= -5;
            this.item_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTargetLev() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTargetLev() {
            return this.targetLev_;
         }

         public Builder setTargetLev(int value) {
            this.bitField0_ |= 8;
            this.targetLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetLev() {
            this.bitField0_ &= -9;
            this.targetLev_ = 0;
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

   public static final class S2C_EquipStrength_18502 extends GeneratedMessageV3 implements S2C_EquipStrength_18502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int STRENGTHLEV_FIELD_NUMBER = 4;
      private int strengthLev_;
      public static final int RESULT_FIELD_NUMBER = 5;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_EquipStrength_18502 DEFAULT_INSTANCE = new S2C_EquipStrength_18502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EquipStrength_18502> PARSER = new AbstractParser<S2C_EquipStrength_18502>() {
         public S2C_EquipStrength_18502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EquipStrength_18502(input, extensionRegistry);
         }
      };

      private S2C_EquipStrength_18502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EquipStrength_18502() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EquipStrength_18502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EquipStrength_18502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.strengthLev_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EquipStrength_18502.class, Builder.class);
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

      public boolean hasStrengthLev() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStrengthLev() {
         return this.strengthLev_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStrengthLev()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.strengthLev_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.result_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.strengthLev_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EquipStrength_18502)) {
            return super.equals(obj);
         } else {
            S2C_EquipStrength_18502 other = (S2C_EquipStrength_18502)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasStrengthLev() != other.hasStrengthLev()) {
               return false;
            } else if (this.hasStrengthLev() && this.getStrengthLev() != other.getStrengthLev()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasStrengthLev()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStrengthLev();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EquipStrength_18502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data);
      }

      public static S2C_EquipStrength_18502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipStrength_18502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data);
      }

      public static S2C_EquipStrength_18502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipStrength_18502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data);
      }

      public static S2C_EquipStrength_18502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EquipStrength_18502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EquipStrength_18502 parseFrom(InputStream input) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EquipStrength_18502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EquipStrength_18502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EquipStrength_18502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EquipStrength_18502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EquipStrength_18502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EquipStrength_18502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EquipStrength_18502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EquipStrength_18502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EquipStrength_18502> parser() {
         return PARSER;
      }

      public Parser<S2C_EquipStrength_18502> getParserForType() {
         return PARSER;
      }

      public S2C_EquipStrength_18502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EquipStrength_18502OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int strengthLev_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EquipStrength_18502.class, Builder.class);
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
            if (EquipStrengthMsg.S2C_EquipStrength_18502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.strengthLev_ = 0;
            this.bitField0_ &= -5;
            this.result_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_EquipStrength_18502_descriptor;
         }

         public S2C_EquipStrength_18502 getDefaultInstanceForType() {
            return EquipStrengthMsg.S2C_EquipStrength_18502.getDefaultInstance();
         }

         public S2C_EquipStrength_18502 build() {
            S2C_EquipStrength_18502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EquipStrength_18502 buildPartial() {
            S2C_EquipStrength_18502 result = new S2C_EquipStrength_18502(this);
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
            if ((from_bitField0_ & 4) != 0) {
               result.strengthLev_ = this.strengthLev_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_EquipStrength_18502) {
               return this.mergeFrom((S2C_EquipStrength_18502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EquipStrength_18502 other) {
            if (other == EquipStrengthMsg.S2C_EquipStrength_18502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasStrengthLev()) {
                  this.setStrengthLev(other.getStrengthLev());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else if (!this.hasStrengthLev()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EquipStrength_18502 parsedMessage = null;

            try {
               parsedMessage = (S2C_EquipStrength_18502)EquipStrengthMsg.S2C_EquipStrength_18502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EquipStrength_18502)e.getUnfinishedMessage();
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

         public boolean hasStrengthLev() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStrengthLev() {
            return this.strengthLev_;
         }

         public Builder setStrengthLev(int value) {
            this.bitField0_ |= 4;
            this.strengthLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStrengthLev() {
            this.bitField0_ &= -5;
            this.strengthLev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 8;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -9;
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

   public static final class C2S_ResetStrength_18503 extends GeneratedMessageV3 implements C2S_ResetStrength_18503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetStrength_18503 DEFAULT_INSTANCE = new C2S_ResetStrength_18503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetStrength_18503> PARSER = new AbstractParser<C2S_ResetStrength_18503>() {
         public C2S_ResetStrength_18503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetStrength_18503(input, extensionRegistry);
         }
      };

      private C2S_ResetStrength_18503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetStrength_18503() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetStrength_18503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetStrength_18503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetStrength_18503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ResetStrength_18503)) {
            return super.equals(obj);
         } else {
            C2S_ResetStrength_18503 other = (C2S_ResetStrength_18503)obj;
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

      public static C2S_ResetStrength_18503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrength_18503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrength_18503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrength_18503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrength_18503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrength_18503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrength_18503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrength_18503 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetStrength_18503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetStrength_18503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetStrength_18503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetStrength_18503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetStrength_18503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrength_18503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetStrength_18503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetStrength_18503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetStrength_18503> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetStrength_18503> getParserForType() {
         return PARSER;
      }

      public C2S_ResetStrength_18503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetStrength_18503OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetStrength_18503.class, Builder.class);
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
            if (EquipStrengthMsg.C2S_ResetStrength_18503.alwaysUseFieldBuilders) {
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
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrength_18503_descriptor;
         }

         public C2S_ResetStrength_18503 getDefaultInstanceForType() {
            return EquipStrengthMsg.C2S_ResetStrength_18503.getDefaultInstance();
         }

         public C2S_ResetStrength_18503 build() {
            C2S_ResetStrength_18503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetStrength_18503 buildPartial() {
            C2S_ResetStrength_18503 result = new C2S_ResetStrength_18503(this);
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
            if (other instanceof C2S_ResetStrength_18503) {
               return this.mergeFrom((C2S_ResetStrength_18503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetStrength_18503 other) {
            if (other == EquipStrengthMsg.C2S_ResetStrength_18503.getDefaultInstance()) {
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
            C2S_ResetStrength_18503 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetStrength_18503)EquipStrengthMsg.C2S_ResetStrength_18503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetStrength_18503)e.getUnfinishedMessage();
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

   public static final class S2C_ResetStrength_18504 extends GeneratedMessageV3 implements S2C_ResetStrength_18504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int STRENGTHLEV_FIELD_NUMBER = 4;
      private int strengthLev_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetStrength_18504 DEFAULT_INSTANCE = new S2C_ResetStrength_18504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetStrength_18504> PARSER = new AbstractParser<S2C_ResetStrength_18504>() {
         public S2C_ResetStrength_18504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetStrength_18504(input, extensionRegistry);
         }
      };

      private S2C_ResetStrength_18504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetStrength_18504() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetStrength_18504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetStrength_18504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.WearPosition value = CommonMsg.WearPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.strengthLev_ = input.readInt32();
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetStrength_18504.class, Builder.class);
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

      public boolean hasStrengthLev() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStrengthLev() {
         return this.strengthLev_;
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
         } else if (!this.hasStrengthLev()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.strengthLev_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.strengthLev_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetStrength_18504)) {
            return super.equals(obj);
         } else {
            S2C_ResetStrength_18504 other = (S2C_ResetStrength_18504)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasStrengthLev() != other.hasStrengthLev()) {
               return false;
            } else if (this.hasStrengthLev() && this.getStrengthLev() != other.getStrengthLev()) {
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasStrengthLev()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStrengthLev();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetStrength_18504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data);
      }

      public static S2C_ResetStrength_18504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetStrength_18504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data);
      }

      public static S2C_ResetStrength_18504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetStrength_18504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data);
      }

      public static S2C_ResetStrength_18504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetStrength_18504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetStrength_18504 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetStrength_18504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetStrength_18504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetStrength_18504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetStrength_18504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetStrength_18504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetStrength_18504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetStrength_18504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetStrength_18504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetStrength_18504> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetStrength_18504> getParserForType() {
         return PARSER;
      }

      public S2C_ResetStrength_18504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetStrength_18504OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int strengthLev_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetStrength_18504.class, Builder.class);
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
            if (EquipStrengthMsg.S2C_ResetStrength_18504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.strengthLev_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_ResetStrength_18504_descriptor;
         }

         public S2C_ResetStrength_18504 getDefaultInstanceForType() {
            return EquipStrengthMsg.S2C_ResetStrength_18504.getDefaultInstance();
         }

         public S2C_ResetStrength_18504 build() {
            S2C_ResetStrength_18504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetStrength_18504 buildPartial() {
            S2C_ResetStrength_18504 result = new S2C_ResetStrength_18504(this);
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
            if ((from_bitField0_ & 4) != 0) {
               result.strengthLev_ = this.strengthLev_;
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
            if (other instanceof S2C_ResetStrength_18504) {
               return this.mergeFrom((S2C_ResetStrength_18504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetStrength_18504 other) {
            if (other == EquipStrengthMsg.S2C_ResetStrength_18504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasStrengthLev()) {
                  this.setStrengthLev(other.getStrengthLev());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasStrengthLev();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetStrength_18504 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetStrength_18504)EquipStrengthMsg.S2C_ResetStrength_18504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetStrength_18504)e.getUnfinishedMessage();
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

         public boolean hasStrengthLev() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStrengthLev() {
            return this.strengthLev_;
         }

         public Builder setStrengthLev(int value) {
            this.bitField0_ |= 4;
            this.strengthLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStrengthLev() {
            this.bitField0_ &= -5;
            this.strengthLev_ = 0;
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

   public static final class C2S_ResetStrengthSkill_18505 extends GeneratedMessageV3 implements C2S_ResetStrengthSkill_18505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetStrengthSkill_18505 DEFAULT_INSTANCE = new C2S_ResetStrengthSkill_18505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetStrengthSkill_18505> PARSER = new AbstractParser<C2S_ResetStrengthSkill_18505>() {
         public C2S_ResetStrengthSkill_18505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetStrengthSkill_18505(input, extensionRegistry);
         }
      };

      private C2S_ResetStrengthSkill_18505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetStrengthSkill_18505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetStrengthSkill_18505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetStrengthSkill_18505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetStrengthSkill_18505.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ResetStrengthSkill_18505)) {
            return super.equals(obj);
         } else {
            C2S_ResetStrengthSkill_18505 other = (C2S_ResetStrengthSkill_18505)obj;
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

      public static C2S_ResetStrengthSkill_18505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetStrengthSkill_18505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetStrengthSkill_18505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetStrengthSkill_18505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetStrengthSkill_18505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetStrengthSkill_18505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetStrengthSkill_18505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetStrengthSkill_18505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetStrengthSkill_18505> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetStrengthSkill_18505> getParserForType() {
         return PARSER;
      }

      public C2S_ResetStrengthSkill_18505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetStrengthSkill_18505OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetStrengthSkill_18505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EquipStrengthMsg.C2S_ResetStrengthSkill_18505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_ResetStrengthSkill_18505_descriptor;
         }

         public C2S_ResetStrengthSkill_18505 getDefaultInstanceForType() {
            return EquipStrengthMsg.C2S_ResetStrengthSkill_18505.getDefaultInstance();
         }

         public C2S_ResetStrengthSkill_18505 build() {
            C2S_ResetStrengthSkill_18505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetStrengthSkill_18505 buildPartial() {
            C2S_ResetStrengthSkill_18505 result = new C2S_ResetStrengthSkill_18505(this);
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
            if (other instanceof C2S_ResetStrengthSkill_18505) {
               return this.mergeFrom((C2S_ResetStrengthSkill_18505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetStrengthSkill_18505 other) {
            if (other == EquipStrengthMsg.C2S_ResetStrengthSkill_18505.getDefaultInstance()) {
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
            C2S_ResetStrengthSkill_18505 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetStrengthSkill_18505)EquipStrengthMsg.C2S_ResetStrengthSkill_18505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetStrengthSkill_18505)e.getUnfinishedMessage();
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

   public static final class C2S_AttackStrengthSkill_18507 extends GeneratedMessageV3 implements C2S_AttackStrengthSkill_18507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STRENGTHLEV_FIELD_NUMBER = 3;
      private int strengthLev_;
      public static final int SKILLPOSITION_FIELD_NUMBER = 4;
      private int skillPosition_;
      private byte memoizedIsInitialized;
      private static final C2S_AttackStrengthSkill_18507 DEFAULT_INSTANCE = new C2S_AttackStrengthSkill_18507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AttackStrengthSkill_18507> PARSER = new AbstractParser<C2S_AttackStrengthSkill_18507>() {
         public C2S_AttackStrengthSkill_18507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AttackStrengthSkill_18507(input, extensionRegistry);
         }
      };

      private C2S_AttackStrengthSkill_18507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AttackStrengthSkill_18507() {
         this.memoizedIsInitialized = -1;
         this.skillPosition_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AttackStrengthSkill_18507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AttackStrengthSkill_18507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 2;
                        this.strengthLev_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.StrengthSkillPosition value = CommonMsg.StrengthSkillPosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.skillPosition_ = rawValue;
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
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AttackStrengthSkill_18507.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasStrengthLev() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStrengthLev() {
         return this.strengthLev_;
      }

      public boolean hasSkillPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.StrengthSkillPosition getSkillPosition() {
         CommonMsg.StrengthSkillPosition result = CommonMsg.StrengthSkillPosition.valueOf(this.skillPosition_);
         return result == null ? CommonMsg.StrengthSkillPosition.SKILL_POSITION_1 : result;
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
         } else if (!this.hasStrengthLev()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillPosition()) {
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
            output.writeInt32(3, this.strengthLev_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(4, this.skillPosition_);
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
               size += CodedOutputStream.computeInt32Size(3, this.strengthLev_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.skillPosition_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AttackStrengthSkill_18507)) {
            return super.equals(obj);
         } else {
            C2S_AttackStrengthSkill_18507 other = (C2S_AttackStrengthSkill_18507)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasStrengthLev() != other.hasStrengthLev()) {
               return false;
            } else if (this.hasStrengthLev() && this.getStrengthLev() != other.getStrengthLev()) {
               return false;
            } else if (this.hasSkillPosition() != other.hasSkillPosition()) {
               return false;
            } else if (this.hasSkillPosition() && this.skillPosition_ != other.skillPosition_) {
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

            if (this.hasStrengthLev()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStrengthLev();
            }

            if (this.hasSkillPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.skillPosition_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AttackStrengthSkill_18507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(InputStream input) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AttackStrengthSkill_18507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AttackStrengthSkill_18507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AttackStrengthSkill_18507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AttackStrengthSkill_18507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AttackStrengthSkill_18507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AttackStrengthSkill_18507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AttackStrengthSkill_18507> parser() {
         return PARSER;
      }

      public Parser<C2S_AttackStrengthSkill_18507> getParserForType() {
         return PARSER;
      }

      public C2S_AttackStrengthSkill_18507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AttackStrengthSkill_18507OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int strengthLev_;
         private int skillPosition_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AttackStrengthSkill_18507.class, Builder.class);
         }

         private Builder() {
            this.skillPosition_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.skillPosition_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EquipStrengthMsg.C2S_AttackStrengthSkill_18507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.strengthLev_ = 0;
            this.bitField0_ &= -3;
            this.skillPosition_ = 1;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_C2S_AttackStrengthSkill_18507_descriptor;
         }

         public C2S_AttackStrengthSkill_18507 getDefaultInstanceForType() {
            return EquipStrengthMsg.C2S_AttackStrengthSkill_18507.getDefaultInstance();
         }

         public C2S_AttackStrengthSkill_18507 build() {
            C2S_AttackStrengthSkill_18507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AttackStrengthSkill_18507 buildPartial() {
            C2S_AttackStrengthSkill_18507 result = new C2S_AttackStrengthSkill_18507(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.strengthLev_ = this.strengthLev_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.skillPosition_ = this.skillPosition_;
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
            if (other instanceof C2S_AttackStrengthSkill_18507) {
               return this.mergeFrom((C2S_AttackStrengthSkill_18507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AttackStrengthSkill_18507 other) {
            if (other == EquipStrengthMsg.C2S_AttackStrengthSkill_18507.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasStrengthLev()) {
                  this.setStrengthLev(other.getStrengthLev());
               }

               if (other.hasSkillPosition()) {
                  this.setSkillPosition(other.getSkillPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasStrengthLev()) {
               return false;
            } else {
               return this.hasSkillPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AttackStrengthSkill_18507 parsedMessage = null;

            try {
               parsedMessage = (C2S_AttackStrengthSkill_18507)EquipStrengthMsg.C2S_AttackStrengthSkill_18507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AttackStrengthSkill_18507)e.getUnfinishedMessage();
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

         public boolean hasStrengthLev() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStrengthLev() {
            return this.strengthLev_;
         }

         public Builder setStrengthLev(int value) {
            this.bitField0_ |= 2;
            this.strengthLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStrengthLev() {
            this.bitField0_ &= -3;
            this.strengthLev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.StrengthSkillPosition getSkillPosition() {
            CommonMsg.StrengthSkillPosition result = CommonMsg.StrengthSkillPosition.valueOf(this.skillPosition_);
            return result == null ? CommonMsg.StrengthSkillPosition.SKILL_POSITION_1 : result;
         }

         public Builder setSkillPosition(CommonMsg.StrengthSkillPosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.skillPosition_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearSkillPosition() {
            this.bitField0_ &= -5;
            this.skillPosition_ = 1;
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

   public static final class S2C_AttackStrengthSkill_18508 extends GeneratedMessageV3 implements S2C_AttackStrengthSkill_18508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STRENGTHSKILLINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.EquipStrengthSkillInfo> strengthSkillInfo_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_AttackStrengthSkill_18508 DEFAULT_INSTANCE = new S2C_AttackStrengthSkill_18508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AttackStrengthSkill_18508> PARSER = new AbstractParser<S2C_AttackStrengthSkill_18508>() {
         public S2C_AttackStrengthSkill_18508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AttackStrengthSkill_18508(input, extensionRegistry);
         }
      };

      private S2C_AttackStrengthSkill_18508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AttackStrengthSkill_18508() {
         this.memoizedIsInitialized = -1;
         this.strengthSkillInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AttackStrengthSkill_18508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AttackStrengthSkill_18508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.strengthSkillInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.strengthSkillInfo_.add(input.readMessage(CommonMsg.EquipStrengthSkillInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.strengthSkillInfo_ = Collections.unmodifiableList(this.strengthSkillInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AttackStrengthSkill_18508.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public List<CommonMsg.EquipStrengthSkillInfo> getStrengthSkillInfoList() {
         return this.strengthSkillInfo_;
      }

      public List<? extends CommonMsg.EquipStrengthSkillInfoOrBuilder> getStrengthSkillInfoOrBuilderList() {
         return this.strengthSkillInfo_;
      }

      public int getStrengthSkillInfoCount() {
         return this.strengthSkillInfo_.size();
      }

      public CommonMsg.EquipStrengthSkillInfo getStrengthSkillInfo(int index) {
         return (CommonMsg.EquipStrengthSkillInfo)this.strengthSkillInfo_.get(index);
      }

      public CommonMsg.EquipStrengthSkillInfoOrBuilder getStrengthSkillInfoOrBuilder(int index) {
         return (CommonMsg.EquipStrengthSkillInfoOrBuilder)this.strengthSkillInfo_.get(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStrengthSkillInfoCount(); ++i) {
               if (!this.getStrengthSkillInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         for(int i = 0; i < this.strengthSkillInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.strengthSkillInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.result_);
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

            for(int i = 0; i < this.strengthSkillInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.strengthSkillInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AttackStrengthSkill_18508)) {
            return super.equals(obj);
         } else {
            S2C_AttackStrengthSkill_18508 other = (S2C_AttackStrengthSkill_18508)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (!this.getStrengthSkillInfoList().equals(other.getStrengthSkillInfoList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.getStrengthSkillInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStrengthSkillInfoList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AttackStrengthSkill_18508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(InputStream input) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AttackStrengthSkill_18508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AttackStrengthSkill_18508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AttackStrengthSkill_18508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AttackStrengthSkill_18508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AttackStrengthSkill_18508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AttackStrengthSkill_18508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AttackStrengthSkill_18508> parser() {
         return PARSER;
      }

      public Parser<S2C_AttackStrengthSkill_18508> getParserForType() {
         return PARSER;
      }

      public S2C_AttackStrengthSkill_18508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AttackStrengthSkill_18508OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private List<CommonMsg.EquipStrengthSkillInfo> strengthSkillInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.EquipStrengthSkillInfo, CommonMsg.EquipStrengthSkillInfo.Builder, CommonMsg.EquipStrengthSkillInfoOrBuilder> strengthSkillInfoBuilder_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AttackStrengthSkill_18508.class, Builder.class);
         }

         private Builder() {
            this.strengthSkillInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.strengthSkillInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (EquipStrengthMsg.S2C_AttackStrengthSkill_18508.alwaysUseFieldBuilders) {
               this.getStrengthSkillInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.strengthSkillInfoBuilder_ == null) {
               this.strengthSkillInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.strengthSkillInfoBuilder_.clear();
            }

            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return EquipStrengthMsg.internal_static_equipStrength_com_gzbz_protobuf_S2C_AttackStrengthSkill_18508_descriptor;
         }

         public S2C_AttackStrengthSkill_18508 getDefaultInstanceForType() {
            return EquipStrengthMsg.S2C_AttackStrengthSkill_18508.getDefaultInstance();
         }

         public S2C_AttackStrengthSkill_18508 build() {
            S2C_AttackStrengthSkill_18508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AttackStrengthSkill_18508 buildPartial() {
            S2C_AttackStrengthSkill_18508 result = new S2C_AttackStrengthSkill_18508(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if (this.strengthSkillInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.strengthSkillInfo_ = Collections.unmodifiableList(this.strengthSkillInfo_);
                  this.bitField0_ &= -3;
               }

               result.strengthSkillInfo_ = this.strengthSkillInfo_;
            } else {
               result.strengthSkillInfo_ = this.strengthSkillInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_AttackStrengthSkill_18508) {
               return this.mergeFrom((S2C_AttackStrengthSkill_18508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AttackStrengthSkill_18508 other) {
            if (other == EquipStrengthMsg.S2C_AttackStrengthSkill_18508.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (this.strengthSkillInfoBuilder_ == null) {
                  if (!other.strengthSkillInfo_.isEmpty()) {
                     if (this.strengthSkillInfo_.isEmpty()) {
                        this.strengthSkillInfo_ = other.strengthSkillInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureStrengthSkillInfoIsMutable();
                        this.strengthSkillInfo_.addAll(other.strengthSkillInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.strengthSkillInfo_.isEmpty()) {
                  if (this.strengthSkillInfoBuilder_.isEmpty()) {
                     this.strengthSkillInfoBuilder_.dispose();
                     this.strengthSkillInfoBuilder_ = null;
                     this.strengthSkillInfo_ = other.strengthSkillInfo_;
                     this.bitField0_ &= -3;
                     this.strengthSkillInfoBuilder_ = EquipStrengthMsg.S2C_AttackStrengthSkill_18508.alwaysUseFieldBuilders ? this.getStrengthSkillInfoFieldBuilder() : null;
                  } else {
                     this.strengthSkillInfoBuilder_.addAllMessages(other.strengthSkillInfo_);
                  }
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               for(int i = 0; i < this.getStrengthSkillInfoCount(); ++i) {
                  if (!this.getStrengthSkillInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AttackStrengthSkill_18508 parsedMessage = null;

            try {
               parsedMessage = (S2C_AttackStrengthSkill_18508)EquipStrengthMsg.S2C_AttackStrengthSkill_18508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AttackStrengthSkill_18508)e.getUnfinishedMessage();
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

         private void ensureStrengthSkillInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.strengthSkillInfo_ = new ArrayList(this.strengthSkillInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.EquipStrengthSkillInfo> getStrengthSkillInfoList() {
            return this.strengthSkillInfoBuilder_ == null ? Collections.unmodifiableList(this.strengthSkillInfo_) : this.strengthSkillInfoBuilder_.getMessageList();
         }

         public int getStrengthSkillInfoCount() {
            return this.strengthSkillInfoBuilder_ == null ? this.strengthSkillInfo_.size() : this.strengthSkillInfoBuilder_.getCount();
         }

         public CommonMsg.EquipStrengthSkillInfo getStrengthSkillInfo(int index) {
            return this.strengthSkillInfoBuilder_ == null ? (CommonMsg.EquipStrengthSkillInfo)this.strengthSkillInfo_.get(index) : (CommonMsg.EquipStrengthSkillInfo)this.strengthSkillInfoBuilder_.getMessage(index);
         }

         public Builder setStrengthSkillInfo(int index, CommonMsg.EquipStrengthSkillInfo value) {
            if (this.strengthSkillInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.set(index, value);
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStrengthSkillInfo(int index, CommonMsg.EquipStrengthSkillInfo.Builder builderForValue) {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStrengthSkillInfo(CommonMsg.EquipStrengthSkillInfo value) {
            if (this.strengthSkillInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.add(value);
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStrengthSkillInfo(int index, CommonMsg.EquipStrengthSkillInfo value) {
            if (this.strengthSkillInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.add(index, value);
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStrengthSkillInfo(CommonMsg.EquipStrengthSkillInfo.Builder builderForValue) {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStrengthSkillInfo(int index, CommonMsg.EquipStrengthSkillInfo.Builder builderForValue) {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStrengthSkillInfo(Iterable<? extends CommonMsg.EquipStrengthSkillInfo> values) {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.ensureStrengthSkillInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.strengthSkillInfo_);
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStrengthSkillInfo() {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.strengthSkillInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeStrengthSkillInfo(int index) {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.ensureStrengthSkillInfoIsMutable();
               this.strengthSkillInfo_.remove(index);
               this.onChanged();
            } else {
               this.strengthSkillInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.EquipStrengthSkillInfo.Builder getStrengthSkillInfoBuilder(int index) {
            return (CommonMsg.EquipStrengthSkillInfo.Builder)this.getStrengthSkillInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.EquipStrengthSkillInfoOrBuilder getStrengthSkillInfoOrBuilder(int index) {
            return this.strengthSkillInfoBuilder_ == null ? (CommonMsg.EquipStrengthSkillInfoOrBuilder)this.strengthSkillInfo_.get(index) : (CommonMsg.EquipStrengthSkillInfoOrBuilder)this.strengthSkillInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.EquipStrengthSkillInfoOrBuilder> getStrengthSkillInfoOrBuilderList() {
            return this.strengthSkillInfoBuilder_ != null ? this.strengthSkillInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.strengthSkillInfo_);
         }

         public CommonMsg.EquipStrengthSkillInfo.Builder addStrengthSkillInfoBuilder() {
            return (CommonMsg.EquipStrengthSkillInfo.Builder)this.getStrengthSkillInfoFieldBuilder().addBuilder(CommonMsg.EquipStrengthSkillInfo.getDefaultInstance());
         }

         public CommonMsg.EquipStrengthSkillInfo.Builder addStrengthSkillInfoBuilder(int index) {
            return (CommonMsg.EquipStrengthSkillInfo.Builder)this.getStrengthSkillInfoFieldBuilder().addBuilder(index, CommonMsg.EquipStrengthSkillInfo.getDefaultInstance());
         }

         public List<CommonMsg.EquipStrengthSkillInfo.Builder> getStrengthSkillInfoBuilderList() {
            return this.getStrengthSkillInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.EquipStrengthSkillInfo, CommonMsg.EquipStrengthSkillInfo.Builder, CommonMsg.EquipStrengthSkillInfoOrBuilder> getStrengthSkillInfoFieldBuilder() {
            if (this.strengthSkillInfoBuilder_ == null) {
               this.strengthSkillInfoBuilder_ = new RepeatedFieldBuilderV3(this.strengthSkillInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.strengthSkillInfo_ = null;
            }

            return this.strengthSkillInfoBuilder_;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public interface C2S_AttackStrengthSkill_18507OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasStrengthLev();

      int getStrengthLev();

      boolean hasSkillPosition();

      CommonMsg.StrengthSkillPosition getSkillPosition();
   }

   public interface C2S_EquipStrength_18501OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasItem();

      ConsumeItem getItem();

      boolean hasTargetLev();

      int getTargetLev();
   }

   public interface C2S_ResetStrengthSkill_18505OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_ResetStrength_18503OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();
   }

   public interface S2C_AttackStrengthSkill_18508OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      List<CommonMsg.EquipStrengthSkillInfo> getStrengthSkillInfoList();

      CommonMsg.EquipStrengthSkillInfo getStrengthSkillInfo(int index);

      int getStrengthSkillInfoCount();

      List<? extends CommonMsg.EquipStrengthSkillInfoOrBuilder> getStrengthSkillInfoOrBuilderList();

      CommonMsg.EquipStrengthSkillInfoOrBuilder getStrengthSkillInfoOrBuilder(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_EquipStrength_18502OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasStrengthLev();

      int getStrengthLev();

      boolean hasResult();

      int getResult();
   }

   public interface S2C_ResetStrength_18504OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.WearPosition getPosition();

      boolean hasStrengthLev();

      int getStrengthLev();
   }
}
