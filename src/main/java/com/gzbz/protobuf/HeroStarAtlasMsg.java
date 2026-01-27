package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class HeroStarAtlasMsg {
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroStarAtlasMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013HeroStarAtlas.proto\u0012\u001fherostaratlas.com.gzbz.protobuf\u001a\fcommon.proto\"R\n\u001aC2S_OptionSkillGroup_21403\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006starId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nskillGroup\u0018\u0003 \u0002(\u0005\"\u001c\n\u001aS2C_OptionSkillGroup_21404\"8\n\u0014C2S_StarIdLvUp_21405\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006starId\u0018\u0002 \u0002(\u0005\"%\n\u0014C2S_StarIdLvUp_21406\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\"*\n\u0016C2S_StarMapReset_21407\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016S2C_StarMapReset_21408\"H\n\u0016C2S_StarMapSkill_21409\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003lev\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0003 \u0002(\u0005\"@\n\u0016S2C_StarMapSkill_21410\u0012&\n\u000bselectSkill\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataIIB'\n\u0011com.gzbz.protobufB\u0010HeroStarAtlasMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor, new String[]{"HeroCode", "StarId", "SkillGroup"});
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor, new String[0]);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor, new String[]{"HeroCode", "StarId"});
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor, new String[]{"Level"});
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor, new String[]{"HeroCode"});
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor, new String[0]);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor, new String[]{"HeroCode", "Lev", "SkillId"});
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor, new String[]{"SelectSkill"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_OptionSkillGroup_21403 extends GeneratedMessageV3 implements C2S_OptionSkillGroup_21403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STARID_FIELD_NUMBER = 2;
      private int starId_;
      public static final int SKILLGROUP_FIELD_NUMBER = 3;
      private int skillGroup_;
      private byte memoizedIsInitialized;
      private static final C2S_OptionSkillGroup_21403 DEFAULT_INSTANCE = new C2S_OptionSkillGroup_21403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionSkillGroup_21403> PARSER = new AbstractParser<C2S_OptionSkillGroup_21403>() {
         public C2S_OptionSkillGroup_21403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionSkillGroup_21403(input, extensionRegistry);
         }
      };

      private C2S_OptionSkillGroup_21403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionSkillGroup_21403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionSkillGroup_21403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionSkillGroup_21403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.starId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skillGroup_ = input.readInt32();
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionSkillGroup_21403.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasStarId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStarId() {
         return this.starId_;
      }

      public boolean hasSkillGroup() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkillGroup() {
         return this.skillGroup_;
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
         } else if (!this.hasStarId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillGroup()) {
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
            output.writeInt32(2, this.starId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skillGroup_);
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
               size += CodedOutputStream.computeInt32Size(2, this.starId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skillGroup_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OptionSkillGroup_21403)) {
            return super.equals(obj);
         } else {
            C2S_OptionSkillGroup_21403 other = (C2S_OptionSkillGroup_21403)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasStarId() != other.hasStarId()) {
               return false;
            } else if (this.hasStarId() && this.getStarId() != other.getStarId()) {
               return false;
            } else if (this.hasSkillGroup() != other.hasSkillGroup()) {
               return false;
            } else if (this.hasSkillGroup() && this.getSkillGroup() != other.getSkillGroup()) {
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

            if (this.hasStarId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStarId();
            }

            if (this.hasSkillGroup()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillGroup();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionSkillGroup_21403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionSkillGroup_21403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionSkillGroup_21403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionSkillGroup_21403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionSkillGroup_21403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionSkillGroup_21403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionSkillGroup_21403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionSkillGroup_21403> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionSkillGroup_21403> getParserForType() {
         return PARSER;
      }

      public C2S_OptionSkillGroup_21403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionSkillGroup_21403OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int starId_;
         private int skillGroup_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionSkillGroup_21403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.C2S_OptionSkillGroup_21403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.starId_ = 0;
            this.bitField0_ &= -3;
            this.skillGroup_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_OptionSkillGroup_21403_descriptor;
         }

         public C2S_OptionSkillGroup_21403 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.C2S_OptionSkillGroup_21403.getDefaultInstance();
         }

         public C2S_OptionSkillGroup_21403 build() {
            C2S_OptionSkillGroup_21403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionSkillGroup_21403 buildPartial() {
            C2S_OptionSkillGroup_21403 result = new C2S_OptionSkillGroup_21403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.starId_ = this.starId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skillGroup_ = this.skillGroup_;
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
            if (other instanceof C2S_OptionSkillGroup_21403) {
               return this.mergeFrom((C2S_OptionSkillGroup_21403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionSkillGroup_21403 other) {
            if (other == HeroStarAtlasMsg.C2S_OptionSkillGroup_21403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasStarId()) {
                  this.setStarId(other.getStarId());
               }

               if (other.hasSkillGroup()) {
                  this.setSkillGroup(other.getSkillGroup());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasStarId()) {
               return false;
            } else {
               return this.hasSkillGroup();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OptionSkillGroup_21403 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionSkillGroup_21403)HeroStarAtlasMsg.C2S_OptionSkillGroup_21403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionSkillGroup_21403)e.getUnfinishedMessage();
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

         public boolean hasStarId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStarId() {
            return this.starId_;
         }

         public Builder setStarId(int value) {
            this.bitField0_ |= 2;
            this.starId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStarId() {
            this.bitField0_ &= -3;
            this.starId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillGroup() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkillGroup() {
            return this.skillGroup_;
         }

         public Builder setSkillGroup(int value) {
            this.bitField0_ |= 4;
            this.skillGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillGroup() {
            this.bitField0_ &= -5;
            this.skillGroup_ = 0;
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

   public static final class S2C_OptionSkillGroup_21404 extends GeneratedMessageV3 implements S2C_OptionSkillGroup_21404OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_OptionSkillGroup_21404 DEFAULT_INSTANCE = new S2C_OptionSkillGroup_21404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionSkillGroup_21404> PARSER = new AbstractParser<S2C_OptionSkillGroup_21404>() {
         public S2C_OptionSkillGroup_21404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionSkillGroup_21404(input, extensionRegistry);
         }
      };

      private S2C_OptionSkillGroup_21404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionSkillGroup_21404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionSkillGroup_21404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionSkillGroup_21404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionSkillGroup_21404.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OptionSkillGroup_21404)) {
            return super.equals(obj);
         } else {
            S2C_OptionSkillGroup_21404 other = (S2C_OptionSkillGroup_21404)obj;
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

      public static S2C_OptionSkillGroup_21404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionSkillGroup_21404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionSkillGroup_21404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionSkillGroup_21404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionSkillGroup_21404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionSkillGroup_21404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionSkillGroup_21404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionSkillGroup_21404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionSkillGroup_21404> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionSkillGroup_21404> getParserForType() {
         return PARSER;
      }

      public S2C_OptionSkillGroup_21404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionSkillGroup_21404OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionSkillGroup_21404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_OptionSkillGroup_21404_descriptor;
         }

         public S2C_OptionSkillGroup_21404 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.getDefaultInstance();
         }

         public S2C_OptionSkillGroup_21404 build() {
            S2C_OptionSkillGroup_21404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionSkillGroup_21404 buildPartial() {
            S2C_OptionSkillGroup_21404 result = new S2C_OptionSkillGroup_21404(this);
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
            if (other instanceof S2C_OptionSkillGroup_21404) {
               return this.mergeFrom((S2C_OptionSkillGroup_21404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionSkillGroup_21404 other) {
            if (other == HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.getDefaultInstance()) {
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
            S2C_OptionSkillGroup_21404 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionSkillGroup_21404)HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionSkillGroup_21404)e.getUnfinishedMessage();
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

   public static final class C2S_StarIdLvUp_21405 extends GeneratedMessageV3 implements C2S_StarIdLvUp_21405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STARID_FIELD_NUMBER = 2;
      private int starId_;
      private byte memoizedIsInitialized;
      private static final C2S_StarIdLvUp_21405 DEFAULT_INSTANCE = new C2S_StarIdLvUp_21405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StarIdLvUp_21405> PARSER = new AbstractParser<C2S_StarIdLvUp_21405>() {
         public C2S_StarIdLvUp_21405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StarIdLvUp_21405(input, extensionRegistry);
         }
      };

      private C2S_StarIdLvUp_21405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StarIdLvUp_21405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StarIdLvUp_21405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StarIdLvUp_21405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.starId_ = input.readInt32();
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarIdLvUp_21405.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasStarId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStarId() {
         return this.starId_;
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
         } else if (!this.hasStarId()) {
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
            output.writeInt32(2, this.starId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.starId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StarIdLvUp_21405)) {
            return super.equals(obj);
         } else {
            C2S_StarIdLvUp_21405 other = (C2S_StarIdLvUp_21405)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasStarId() != other.hasStarId()) {
               return false;
            } else if (this.hasStarId() && this.getStarId() != other.getStarId()) {
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

            if (this.hasStarId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStarId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StarIdLvUp_21405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(InputStream input) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StarIdLvUp_21405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StarIdLvUp_21405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StarIdLvUp_21405> parser() {
         return PARSER;
      }

      public Parser<C2S_StarIdLvUp_21405> getParserForType() {
         return PARSER;
      }

      public C2S_StarIdLvUp_21405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StarIdLvUp_21405OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int starId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarIdLvUp_21405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.C2S_StarIdLvUp_21405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.starId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21405_descriptor;
         }

         public C2S_StarIdLvUp_21405 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.C2S_StarIdLvUp_21405.getDefaultInstance();
         }

         public C2S_StarIdLvUp_21405 build() {
            C2S_StarIdLvUp_21405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StarIdLvUp_21405 buildPartial() {
            C2S_StarIdLvUp_21405 result = new C2S_StarIdLvUp_21405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.starId_ = this.starId_;
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
            if (other instanceof C2S_StarIdLvUp_21405) {
               return this.mergeFrom((C2S_StarIdLvUp_21405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StarIdLvUp_21405 other) {
            if (other == HeroStarAtlasMsg.C2S_StarIdLvUp_21405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasStarId()) {
                  this.setStarId(other.getStarId());
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
               return this.hasStarId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StarIdLvUp_21405 parsedMessage = null;

            try {
               parsedMessage = (C2S_StarIdLvUp_21405)HeroStarAtlasMsg.C2S_StarIdLvUp_21405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StarIdLvUp_21405)e.getUnfinishedMessage();
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

         public boolean hasStarId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStarId() {
            return this.starId_;
         }

         public Builder setStarId(int value) {
            this.bitField0_ |= 2;
            this.starId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStarId() {
            this.bitField0_ &= -3;
            this.starId_ = 0;
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

   public static final class C2S_StarIdLvUp_21406 extends GeneratedMessageV3 implements C2S_StarIdLvUp_21406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVEL_FIELD_NUMBER = 1;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_StarIdLvUp_21406 DEFAULT_INSTANCE = new C2S_StarIdLvUp_21406();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StarIdLvUp_21406> PARSER = new AbstractParser<C2S_StarIdLvUp_21406>() {
         public C2S_StarIdLvUp_21406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StarIdLvUp_21406(input, extensionRegistry);
         }
      };

      private C2S_StarIdLvUp_21406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StarIdLvUp_21406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StarIdLvUp_21406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StarIdLvUp_21406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.level_ = input.readInt32();
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarIdLvUp_21406.class, Builder.class);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StarIdLvUp_21406)) {
            return super.equals(obj);
         } else {
            C2S_StarIdLvUp_21406 other = (C2S_StarIdLvUp_21406)obj;
            if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StarIdLvUp_21406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarIdLvUp_21406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(InputStream input) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21406 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarIdLvUp_21406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarIdLvUp_21406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StarIdLvUp_21406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StarIdLvUp_21406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StarIdLvUp_21406> parser() {
         return PARSER;
      }

      public Parser<C2S_StarIdLvUp_21406> getParserForType() {
         return PARSER;
      }

      public C2S_StarIdLvUp_21406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StarIdLvUp_21406OrBuilder {
         private int bitField0_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarIdLvUp_21406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.C2S_StarIdLvUp_21406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.level_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarIdLvUp_21406_descriptor;
         }

         public C2S_StarIdLvUp_21406 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.C2S_StarIdLvUp_21406.getDefaultInstance();
         }

         public C2S_StarIdLvUp_21406 build() {
            C2S_StarIdLvUp_21406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StarIdLvUp_21406 buildPartial() {
            C2S_StarIdLvUp_21406 result = new C2S_StarIdLvUp_21406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof C2S_StarIdLvUp_21406) {
               return this.mergeFrom((C2S_StarIdLvUp_21406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StarIdLvUp_21406 other) {
            if (other == HeroStarAtlasMsg.C2S_StarIdLvUp_21406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StarIdLvUp_21406 parsedMessage = null;

            try {
               parsedMessage = (C2S_StarIdLvUp_21406)HeroStarAtlasMsg.C2S_StarIdLvUp_21406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StarIdLvUp_21406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 1;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -2;
            this.level_ = 0;
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

   public static final class C2S_StarMapReset_21407 extends GeneratedMessageV3 implements C2S_StarMapReset_21407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StarMapReset_21407 DEFAULT_INSTANCE = new C2S_StarMapReset_21407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StarMapReset_21407> PARSER = new AbstractParser<C2S_StarMapReset_21407>() {
         public C2S_StarMapReset_21407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StarMapReset_21407(input, extensionRegistry);
         }
      };

      private C2S_StarMapReset_21407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StarMapReset_21407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StarMapReset_21407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StarMapReset_21407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarMapReset_21407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StarMapReset_21407)) {
            return super.equals(obj);
         } else {
            C2S_StarMapReset_21407 other = (C2S_StarMapReset_21407)obj;
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

      public static C2S_StarMapReset_21407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data);
      }

      public static C2S_StarMapReset_21407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapReset_21407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data);
      }

      public static C2S_StarMapReset_21407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapReset_21407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data);
      }

      public static C2S_StarMapReset_21407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapReset_21407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapReset_21407 parseFrom(InputStream input) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarMapReset_21407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarMapReset_21407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StarMapReset_21407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarMapReset_21407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarMapReset_21407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapReset_21407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StarMapReset_21407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StarMapReset_21407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StarMapReset_21407> parser() {
         return PARSER;
      }

      public Parser<C2S_StarMapReset_21407> getParserForType() {
         return PARSER;
      }

      public C2S_StarMapReset_21407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StarMapReset_21407OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarMapReset_21407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.C2S_StarMapReset_21407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapReset_21407_descriptor;
         }

         public C2S_StarMapReset_21407 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.C2S_StarMapReset_21407.getDefaultInstance();
         }

         public C2S_StarMapReset_21407 build() {
            C2S_StarMapReset_21407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StarMapReset_21407 buildPartial() {
            C2S_StarMapReset_21407 result = new C2S_StarMapReset_21407(this);
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
            if (other instanceof C2S_StarMapReset_21407) {
               return this.mergeFrom((C2S_StarMapReset_21407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StarMapReset_21407 other) {
            if (other == HeroStarAtlasMsg.C2S_StarMapReset_21407.getDefaultInstance()) {
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
            C2S_StarMapReset_21407 parsedMessage = null;

            try {
               parsedMessage = (C2S_StarMapReset_21407)HeroStarAtlasMsg.C2S_StarMapReset_21407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StarMapReset_21407)e.getUnfinishedMessage();
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

   public static final class S2C_StarMapReset_21408 extends GeneratedMessageV3 implements S2C_StarMapReset_21408OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_StarMapReset_21408 DEFAULT_INSTANCE = new S2C_StarMapReset_21408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StarMapReset_21408> PARSER = new AbstractParser<S2C_StarMapReset_21408>() {
         public S2C_StarMapReset_21408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StarMapReset_21408(input, extensionRegistry);
         }
      };

      private S2C_StarMapReset_21408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StarMapReset_21408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StarMapReset_21408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StarMapReset_21408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarMapReset_21408.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StarMapReset_21408)) {
            return super.equals(obj);
         } else {
            S2C_StarMapReset_21408 other = (S2C_StarMapReset_21408)obj;
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

      public static S2C_StarMapReset_21408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data);
      }

      public static S2C_StarMapReset_21408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapReset_21408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data);
      }

      public static S2C_StarMapReset_21408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapReset_21408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data);
      }

      public static S2C_StarMapReset_21408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapReset_21408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapReset_21408 parseFrom(InputStream input) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarMapReset_21408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarMapReset_21408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StarMapReset_21408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarMapReset_21408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarMapReset_21408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapReset_21408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StarMapReset_21408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StarMapReset_21408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StarMapReset_21408> parser() {
         return PARSER;
      }

      public Parser<S2C_StarMapReset_21408> getParserForType() {
         return PARSER;
      }

      public S2C_StarMapReset_21408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StarMapReset_21408OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarMapReset_21408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.S2C_StarMapReset_21408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapReset_21408_descriptor;
         }

         public S2C_StarMapReset_21408 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.S2C_StarMapReset_21408.getDefaultInstance();
         }

         public S2C_StarMapReset_21408 build() {
            S2C_StarMapReset_21408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StarMapReset_21408 buildPartial() {
            S2C_StarMapReset_21408 result = new S2C_StarMapReset_21408(this);
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
            if (other instanceof S2C_StarMapReset_21408) {
               return this.mergeFrom((S2C_StarMapReset_21408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StarMapReset_21408 other) {
            if (other == HeroStarAtlasMsg.S2C_StarMapReset_21408.getDefaultInstance()) {
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
            S2C_StarMapReset_21408 parsedMessage = null;

            try {
               parsedMessage = (S2C_StarMapReset_21408)HeroStarAtlasMsg.S2C_StarMapReset_21408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StarMapReset_21408)e.getUnfinishedMessage();
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

   public static final class C2S_StarMapSkill_21409 extends GeneratedMessageV3 implements C2S_StarMapSkill_21409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int LEV_FIELD_NUMBER = 2;
      private int lev_;
      public static final int SKILLID_FIELD_NUMBER = 3;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_StarMapSkill_21409 DEFAULT_INSTANCE = new C2S_StarMapSkill_21409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StarMapSkill_21409> PARSER = new AbstractParser<C2S_StarMapSkill_21409>() {
         public C2S_StarMapSkill_21409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StarMapSkill_21409(input, extensionRegistry);
         }
      };

      private C2S_StarMapSkill_21409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StarMapSkill_21409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StarMapSkill_21409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StarMapSkill_21409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.lev_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skillId_ = input.readInt32();
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
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarMapSkill_21409.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasLev() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLev() {
         return this.lev_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
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
         } else if (!this.hasLev()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillId()) {
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
            output.writeInt32(2, this.lev_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lev_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StarMapSkill_21409)) {
            return super.equals(obj);
         } else {
            C2S_StarMapSkill_21409 other = (C2S_StarMapSkill_21409)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasLev() != other.hasLev()) {
               return false;
            } else if (this.hasLev() && this.getLev() != other.getLev()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
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

            if (this.hasLev()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLev();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StarMapSkill_21409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data);
      }

      public static C2S_StarMapSkill_21409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapSkill_21409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data);
      }

      public static C2S_StarMapSkill_21409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapSkill_21409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data);
      }

      public static C2S_StarMapSkill_21409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StarMapSkill_21409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StarMapSkill_21409 parseFrom(InputStream input) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarMapSkill_21409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarMapSkill_21409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StarMapSkill_21409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StarMapSkill_21409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StarMapSkill_21409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StarMapSkill_21409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StarMapSkill_21409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StarMapSkill_21409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StarMapSkill_21409> parser() {
         return PARSER;
      }

      public Parser<C2S_StarMapSkill_21409> getParserForType() {
         return PARSER;
      }

      public C2S_StarMapSkill_21409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StarMapSkill_21409OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int lev_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StarMapSkill_21409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.C2S_StarMapSkill_21409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.lev_ = 0;
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_C2S_StarMapSkill_21409_descriptor;
         }

         public C2S_StarMapSkill_21409 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.C2S_StarMapSkill_21409.getDefaultInstance();
         }

         public C2S_StarMapSkill_21409 build() {
            C2S_StarMapSkill_21409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StarMapSkill_21409 buildPartial() {
            C2S_StarMapSkill_21409 result = new C2S_StarMapSkill_21409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lev_ = this.lev_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_StarMapSkill_21409) {
               return this.mergeFrom((C2S_StarMapSkill_21409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StarMapSkill_21409 other) {
            if (other == HeroStarAtlasMsg.C2S_StarMapSkill_21409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasLev()) {
                  this.setLev(other.getLev());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasLev()) {
               return false;
            } else {
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StarMapSkill_21409 parsedMessage = null;

            try {
               parsedMessage = (C2S_StarMapSkill_21409)HeroStarAtlasMsg.C2S_StarMapSkill_21409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StarMapSkill_21409)e.getUnfinishedMessage();
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

         public boolean hasLev() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLev() {
            return this.lev_;
         }

         public Builder setLev(int value) {
            this.bitField0_ |= 2;
            this.lev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLev() {
            this.bitField0_ &= -3;
            this.lev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 4;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -5;
            this.skillId_ = 0;
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

   public static final class S2C_StarMapSkill_21410 extends GeneratedMessageV3 implements S2C_StarMapSkill_21410OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SELECTSKILL_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> selectSkill_;
      private byte memoizedIsInitialized;
      private static final S2C_StarMapSkill_21410 DEFAULT_INSTANCE = new S2C_StarMapSkill_21410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StarMapSkill_21410> PARSER = new AbstractParser<S2C_StarMapSkill_21410>() {
         public S2C_StarMapSkill_21410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StarMapSkill_21410(input, extensionRegistry);
         }
      };

      private S2C_StarMapSkill_21410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StarMapSkill_21410() {
         this.memoizedIsInitialized = -1;
         this.selectSkill_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StarMapSkill_21410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StarMapSkill_21410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 34:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.selectSkill_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.selectSkill_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.selectSkill_ = Collections.unmodifiableList(this.selectSkill_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarMapSkill_21410.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getSelectSkillList() {
         return this.selectSkill_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSelectSkillOrBuilderList() {
         return this.selectSkill_;
      }

      public int getSelectSkillCount() {
         return this.selectSkill_.size();
      }

      public CommonMsg.MapDataII getSelectSkill(int index) {
         return (CommonMsg.MapDataII)this.selectSkill_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSelectSkillOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.selectSkill_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getSelectSkillCount(); ++i) {
               if (!this.getSelectSkill(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.selectSkill_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.selectSkill_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.selectSkill_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.selectSkill_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StarMapSkill_21410)) {
            return super.equals(obj);
         } else {
            S2C_StarMapSkill_21410 other = (S2C_StarMapSkill_21410)obj;
            if (!this.getSelectSkillList().equals(other.getSelectSkillList())) {
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
            if (this.getSelectSkillCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSelectSkillList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StarMapSkill_21410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data);
      }

      public static S2C_StarMapSkill_21410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapSkill_21410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data);
      }

      public static S2C_StarMapSkill_21410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapSkill_21410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data);
      }

      public static S2C_StarMapSkill_21410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StarMapSkill_21410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StarMapSkill_21410 parseFrom(InputStream input) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarMapSkill_21410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarMapSkill_21410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StarMapSkill_21410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StarMapSkill_21410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StarMapSkill_21410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StarMapSkill_21410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StarMapSkill_21410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StarMapSkill_21410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StarMapSkill_21410> parser() {
         return PARSER;
      }

      public Parser<S2C_StarMapSkill_21410> getParserForType() {
         return PARSER;
      }

      public S2C_StarMapSkill_21410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StarMapSkill_21410OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> selectSkill_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> selectSkillBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StarMapSkill_21410.class, Builder.class);
         }

         private Builder() {
            this.selectSkill_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.selectSkill_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroStarAtlasMsg.S2C_StarMapSkill_21410.alwaysUseFieldBuilders) {
               this.getSelectSkillFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.selectSkillBuilder_ == null) {
               this.selectSkill_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.selectSkillBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroStarAtlasMsg.internal_static_herostaratlas_com_gzbz_protobuf_S2C_StarMapSkill_21410_descriptor;
         }

         public S2C_StarMapSkill_21410 getDefaultInstanceForType() {
            return HeroStarAtlasMsg.S2C_StarMapSkill_21410.getDefaultInstance();
         }

         public S2C_StarMapSkill_21410 build() {
            S2C_StarMapSkill_21410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StarMapSkill_21410 buildPartial() {
            S2C_StarMapSkill_21410 result = new S2C_StarMapSkill_21410(this);
            int from_bitField0_ = this.bitField0_;
            if (this.selectSkillBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.selectSkill_ = Collections.unmodifiableList(this.selectSkill_);
                  this.bitField0_ &= -2;
               }

               result.selectSkill_ = this.selectSkill_;
            } else {
               result.selectSkill_ = this.selectSkillBuilder_.build();
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
            if (other instanceof S2C_StarMapSkill_21410) {
               return this.mergeFrom((S2C_StarMapSkill_21410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StarMapSkill_21410 other) {
            if (other == HeroStarAtlasMsg.S2C_StarMapSkill_21410.getDefaultInstance()) {
               return this;
            } else {
               if (this.selectSkillBuilder_ == null) {
                  if (!other.selectSkill_.isEmpty()) {
                     if (this.selectSkill_.isEmpty()) {
                        this.selectSkill_ = other.selectSkill_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureSelectSkillIsMutable();
                        this.selectSkill_.addAll(other.selectSkill_);
                     }

                     this.onChanged();
                  }
               } else if (!other.selectSkill_.isEmpty()) {
                  if (this.selectSkillBuilder_.isEmpty()) {
                     this.selectSkillBuilder_.dispose();
                     this.selectSkillBuilder_ = null;
                     this.selectSkill_ = other.selectSkill_;
                     this.bitField0_ &= -2;
                     this.selectSkillBuilder_ = HeroStarAtlasMsg.S2C_StarMapSkill_21410.alwaysUseFieldBuilders ? this.getSelectSkillFieldBuilder() : null;
                  } else {
                     this.selectSkillBuilder_.addAllMessages(other.selectSkill_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getSelectSkillCount(); ++i) {
               if (!this.getSelectSkill(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StarMapSkill_21410 parsedMessage = null;

            try {
               parsedMessage = (S2C_StarMapSkill_21410)HeroStarAtlasMsg.S2C_StarMapSkill_21410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StarMapSkill_21410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSelectSkillIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.selectSkill_ = new ArrayList(this.selectSkill_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getSelectSkillList() {
            return this.selectSkillBuilder_ == null ? Collections.unmodifiableList(this.selectSkill_) : this.selectSkillBuilder_.getMessageList();
         }

         public int getSelectSkillCount() {
            return this.selectSkillBuilder_ == null ? this.selectSkill_.size() : this.selectSkillBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSelectSkill(int index) {
            return this.selectSkillBuilder_ == null ? (CommonMsg.MapDataII)this.selectSkill_.get(index) : (CommonMsg.MapDataII)this.selectSkillBuilder_.getMessage(index);
         }

         public Builder setSelectSkill(int index, CommonMsg.MapDataII value) {
            if (this.selectSkillBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSelectSkillIsMutable();
               this.selectSkill_.set(index, value);
               this.onChanged();
            } else {
               this.selectSkillBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSelectSkill(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.selectSkillBuilder_ == null) {
               this.ensureSelectSkillIsMutable();
               this.selectSkill_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.selectSkillBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSelectSkill(CommonMsg.MapDataII value) {
            if (this.selectSkillBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSelectSkillIsMutable();
               this.selectSkill_.add(value);
               this.onChanged();
            } else {
               this.selectSkillBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSelectSkill(int index, CommonMsg.MapDataII value) {
            if (this.selectSkillBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSelectSkillIsMutable();
               this.selectSkill_.add(index, value);
               this.onChanged();
            } else {
               this.selectSkillBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSelectSkill(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.selectSkillBuilder_ == null) {
               this.ensureSelectSkillIsMutable();
               this.selectSkill_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.selectSkillBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSelectSkill(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.selectSkillBuilder_ == null) {
               this.ensureSelectSkillIsMutable();
               this.selectSkill_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.selectSkillBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSelectSkill(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.selectSkillBuilder_ == null) {
               this.ensureSelectSkillIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.selectSkill_);
               this.onChanged();
            } else {
               this.selectSkillBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSelectSkill() {
            if (this.selectSkillBuilder_ == null) {
               this.selectSkill_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.selectSkillBuilder_.clear();
            }

            return this;
         }

         public Builder removeSelectSkill(int index) {
            if (this.selectSkillBuilder_ == null) {
               this.ensureSelectSkillIsMutable();
               this.selectSkill_.remove(index);
               this.onChanged();
            } else {
               this.selectSkillBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSelectSkillBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSelectSkillFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSelectSkillOrBuilder(int index) {
            return this.selectSkillBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.selectSkill_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.selectSkillBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSelectSkillOrBuilderList() {
            return this.selectSkillBuilder_ != null ? this.selectSkillBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.selectSkill_);
         }

         public CommonMsg.MapDataII.Builder addSelectSkillBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSelectSkillFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSelectSkillBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSelectSkillFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSelectSkillBuilderList() {
            return this.getSelectSkillFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSelectSkillFieldBuilder() {
            if (this.selectSkillBuilder_ == null) {
               this.selectSkillBuilder_ = new RepeatedFieldBuilderV3(this.selectSkill_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.selectSkill_ = null;
            }

            return this.selectSkillBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_OptionSkillGroup_21403OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasStarId();

      int getStarId();

      boolean hasSkillGroup();

      int getSkillGroup();
   }

   public interface C2S_StarIdLvUp_21405OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasStarId();

      int getStarId();
   }

   public interface C2S_StarIdLvUp_21406OrBuilder extends MessageOrBuilder {
      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_StarMapReset_21407OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_StarMapSkill_21409OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasLev();

      int getLev();

      boolean hasSkillId();

      int getSkillId();
   }

   public interface S2C_OptionSkillGroup_21404OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_StarMapReset_21408OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_StarMapSkill_21410OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getSelectSkillList();

      CommonMsg.MapDataII getSelectSkill(int index);

      int getSelectSkillCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSelectSkillOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSelectSkillOrBuilder(int index);
   }
}
