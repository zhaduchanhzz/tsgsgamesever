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

public final class DragonTigerMsg {
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DragonTigerMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011DragonTiger.proto\u0012\u001ddragonTiger.com.gzbz.protobuf\")\n\bSlotInfo\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"R\n\bTeamInfo\u0012\u000f\n\u0007teamIdx\u0018\u0001 \u0002(\u0005\u00125\n\u0004info\u0018\u0002 \u0003(\u000b2'.dragonTiger.com.gzbz.protobuf.SlotInfo\"\u001b\n\u0019C2S_DragonTigerInfo_14801\"\u008e\u0001\n\u0019S2C_DragonTigerInfo_14802\u0012\u000e\n\u0006mainLv\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tbackingLv\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bbackingStar\u0018\u0003 \u0002(\u0005\u00129\n\bteamInfo\u0018\u0004 \u0003(\u000b2'.dragonTiger.com.gzbz.protobuf.TeamInfo\"0\n\u0010C2S_Unlock_14803\u0012\u000f\n\u0007teamIdx\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0002 \u0002(\u0005\"0\n\u0010S2C_Unlock_14804\u0012\u000f\n\u0007teamIdx\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0002 \u0002(\u0005\"S\n\u0012C2S_Arraying_14805\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007teamIdx\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0004 \u0001(\u0005\"{\n\u0012S2C_Arraying_14806\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007teamIdx\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0004 \u0001(\u0005\u0012\u0011\n\tbackingLv\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000bbackingStar\u0018\u0006 \u0001(\u0005B%\n\u0011com.gzbz.protobufB\u000eDragonTigerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor, new String[]{"Idx", "HeroCode"});
      internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor, new String[]{"TeamIdx", "Info"});
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor, new String[0]);
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor, new String[]{"MainLv", "BackingLv", "BackingStar", "TeamInfo"});
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor, new String[]{"TeamIdx", "Idx"});
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor, new String[]{"TeamIdx", "Idx"});
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor, new String[]{"State", "TeamIdx", "Idx", "HeroCode"});
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor, new String[]{"State", "TeamIdx", "Idx", "HeroCode", "BackingLv", "BackingStar"});
   }

   public static final class SlotInfo extends GeneratedMessageV3 implements SlotInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final SlotInfo DEFAULT_INSTANCE = new SlotInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SlotInfo> PARSER = new AbstractParser<SlotInfo>() {
         public SlotInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SlotInfo(input, extensionRegistry);
         }
      };

      private SlotInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SlotInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SlotInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SlotInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SlotInfo.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
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
         } else if (!this.hasIdx()) {
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
            output.writeInt32(1, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
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
         } else if (!(obj instanceof SlotInfo)) {
            return super.equals(obj);
         } else {
            SlotInfo other = (SlotInfo)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
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

      public static SlotInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data);
      }

      public static SlotInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SlotInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data);
      }

      public static SlotInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SlotInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data);
      }

      public static SlotInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SlotInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SlotInfo parseFrom(InputStream input) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SlotInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SlotInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SlotInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SlotInfo parseFrom(CodedInputStream input) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SlotInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SlotInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SlotInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SlotInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SlotInfo> parser() {
         return PARSER;
      }

      public Parser<SlotInfo> getParserForType() {
         return PARSER;
      }

      public SlotInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SlotInfoOrBuilder {
         private int bitField0_;
         private int idx_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SlotInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.SlotInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_SlotInfo_descriptor;
         }

         public SlotInfo getDefaultInstanceForType() {
            return DragonTigerMsg.SlotInfo.getDefaultInstance();
         }

         public SlotInfo build() {
            SlotInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SlotInfo buildPartial() {
            SlotInfo result = new SlotInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof SlotInfo) {
               return this.mergeFrom((SlotInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SlotInfo other) {
            if (other == DragonTigerMsg.SlotInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
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
            if (!this.hasIdx()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SlotInfo parsedMessage = null;

            try {
               parsedMessage = (SlotInfo)DragonTigerMsg.SlotInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SlotInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
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

   public static final class TeamInfo extends GeneratedMessageV3 implements TeamInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMIDX_FIELD_NUMBER = 1;
      private int teamIdx_;
      public static final int INFO_FIELD_NUMBER = 2;
      private List<SlotInfo> info_;
      private byte memoizedIsInitialized;
      private static final TeamInfo DEFAULT_INSTANCE = new TeamInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TeamInfo> PARSER = new AbstractParser<TeamInfo>() {
         public TeamInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TeamInfo(input, extensionRegistry);
         }
      };

      private TeamInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TeamInfo() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TeamInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TeamInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamIdx_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.info_.add(input.readMessage(DragonTigerMsg.SlotInfo.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamInfo.class, Builder.class);
      }

      public boolean hasTeamIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamIdx() {
         return this.teamIdx_;
      }

      public List<SlotInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends SlotInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public SlotInfo getInfo(int index) {
         return (SlotInfo)this.info_.get(index);
      }

      public SlotInfoOrBuilder getInfoOrBuilder(int index) {
         return (SlotInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamIdx()) {
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
            output.writeInt32(1, this.teamIdx_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.info_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.teamIdx_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TeamInfo)) {
            return super.equals(obj);
         } else {
            TeamInfo other = (TeamInfo)obj;
            if (this.hasTeamIdx() != other.hasTeamIdx()) {
               return false;
            } else if (this.hasTeamIdx() && this.getTeamIdx() != other.getTeamIdx()) {
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
            if (this.hasTeamIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamIdx();
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TeamInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data);
      }

      public static TeamInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TeamInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data);
      }

      public static TeamInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TeamInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data);
      }

      public static TeamInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TeamInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TeamInfo parseFrom(InputStream input) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TeamInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TeamInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TeamInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TeamInfo parseFrom(CodedInputStream input) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TeamInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TeamInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TeamInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TeamInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TeamInfo> parser() {
         return PARSER;
      }

      public Parser<TeamInfo> getParserForType() {
         return PARSER;
      }

      public TeamInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TeamInfoOrBuilder {
         private int bitField0_;
         private int teamIdx_;
         private List<SlotInfo> info_;
         private RepeatedFieldBuilderV3<SlotInfo, SlotInfo.Builder, SlotInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TeamInfo.class, Builder.class);
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
            if (DragonTigerMsg.TeamInfo.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamIdx_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_TeamInfo_descriptor;
         }

         public TeamInfo getDefaultInstanceForType() {
            return DragonTigerMsg.TeamInfo.getDefaultInstance();
         }

         public TeamInfo build() {
            TeamInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TeamInfo buildPartial() {
            TeamInfo result = new TeamInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamIdx_ = this.teamIdx_;
               to_bitField0_ |= 1;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -3;
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
            if (other instanceof TeamInfo) {
               return this.mergeFrom((TeamInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TeamInfo other) {
            if (other == DragonTigerMsg.TeamInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamIdx()) {
                  this.setTeamIdx(other.getTeamIdx());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infoBuilder_ = DragonTigerMsg.TeamInfo.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            if (!this.hasTeamIdx()) {
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
            TeamInfo parsedMessage = null;

            try {
               parsedMessage = (TeamInfo)DragonTigerMsg.TeamInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TeamInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTeamIdx() {
            return this.teamIdx_;
         }

         public Builder setTeamIdx(int value) {
            this.bitField0_ |= 1;
            this.teamIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamIdx() {
            this.bitField0_ &= -2;
            this.teamIdx_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 2;
            }

         }

         public List<SlotInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public SlotInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (SlotInfo)this.info_.get(index) : (SlotInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, SlotInfo value) {
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

         public Builder setInfo(int index, SlotInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(SlotInfo value) {
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

         public Builder addInfo(int index, SlotInfo value) {
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

         public Builder addInfo(SlotInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, SlotInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends SlotInfo> values) {
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
               this.bitField0_ &= -3;
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

         public SlotInfo.Builder getInfoBuilder(int index) {
            return (SlotInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public SlotInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (SlotInfoOrBuilder)this.info_.get(index) : (SlotInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SlotInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public SlotInfo.Builder addInfoBuilder() {
            return (SlotInfo.Builder)this.getInfoFieldBuilder().addBuilder(DragonTigerMsg.SlotInfo.getDefaultInstance());
         }

         public SlotInfo.Builder addInfoBuilder(int index) {
            return (SlotInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, DragonTigerMsg.SlotInfo.getDefaultInstance());
         }

         public List<SlotInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SlotInfo, SlotInfo.Builder, SlotInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_DragonTigerInfo_14801 extends GeneratedMessageV3 implements C2S_DragonTigerInfo_14801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DragonTigerInfo_14801 DEFAULT_INSTANCE = new C2S_DragonTigerInfo_14801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonTigerInfo_14801> PARSER = new AbstractParser<C2S_DragonTigerInfo_14801>() {
         public C2S_DragonTigerInfo_14801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonTigerInfo_14801(input, extensionRegistry);
         }
      };

      private C2S_DragonTigerInfo_14801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonTigerInfo_14801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonTigerInfo_14801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonTigerInfo_14801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonTigerInfo_14801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonTigerInfo_14801)) {
            return super.equals(obj);
         } else {
            C2S_DragonTigerInfo_14801 other = (C2S_DragonTigerInfo_14801)obj;
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

      public static C2S_DragonTigerInfo_14801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTigerInfo_14801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonTigerInfo_14801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonTigerInfo_14801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonTigerInfo_14801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTigerInfo_14801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonTigerInfo_14801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonTigerInfo_14801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonTigerInfo_14801> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonTigerInfo_14801> getParserForType() {
         return PARSER;
      }

      public C2S_DragonTigerInfo_14801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonTigerInfo_14801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonTigerInfo_14801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.C2S_DragonTigerInfo_14801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_DragonTigerInfo_14801_descriptor;
         }

         public C2S_DragonTigerInfo_14801 getDefaultInstanceForType() {
            return DragonTigerMsg.C2S_DragonTigerInfo_14801.getDefaultInstance();
         }

         public C2S_DragonTigerInfo_14801 build() {
            C2S_DragonTigerInfo_14801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonTigerInfo_14801 buildPartial() {
            C2S_DragonTigerInfo_14801 result = new C2S_DragonTigerInfo_14801(this);
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
            if (other instanceof C2S_DragonTigerInfo_14801) {
               return this.mergeFrom((C2S_DragonTigerInfo_14801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonTigerInfo_14801 other) {
            if (other == DragonTigerMsg.C2S_DragonTigerInfo_14801.getDefaultInstance()) {
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
            C2S_DragonTigerInfo_14801 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonTigerInfo_14801)DragonTigerMsg.C2S_DragonTigerInfo_14801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonTigerInfo_14801)e.getUnfinishedMessage();
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

   public static final class S2C_DragonTigerInfo_14802 extends GeneratedMessageV3 implements S2C_DragonTigerInfo_14802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINLV_FIELD_NUMBER = 1;
      private int mainLv_;
      public static final int BACKINGLV_FIELD_NUMBER = 2;
      private int backingLv_;
      public static final int BACKINGSTAR_FIELD_NUMBER = 3;
      private int backingStar_;
      public static final int TEAMINFO_FIELD_NUMBER = 4;
      private List<TeamInfo> teamInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonTigerInfo_14802 DEFAULT_INSTANCE = new S2C_DragonTigerInfo_14802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonTigerInfo_14802> PARSER = new AbstractParser<S2C_DragonTigerInfo_14802>() {
         public S2C_DragonTigerInfo_14802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonTigerInfo_14802(input, extensionRegistry);
         }
      };

      private S2C_DragonTigerInfo_14802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonTigerInfo_14802() {
         this.memoizedIsInitialized = -1;
         this.teamInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonTigerInfo_14802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonTigerInfo_14802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.backingLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.backingStar_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.teamInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.teamInfo_.add(input.readMessage(DragonTigerMsg.TeamInfo.PARSER, extensionRegistry));
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
                  this.teamInfo_ = Collections.unmodifiableList(this.teamInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonTigerInfo_14802.class, Builder.class);
      }

      public boolean hasMainLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainLv() {
         return this.mainLv_;
      }

      public boolean hasBackingLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBackingLv() {
         return this.backingLv_;
      }

      public boolean hasBackingStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBackingStar() {
         return this.backingStar_;
      }

      public List<TeamInfo> getTeamInfoList() {
         return this.teamInfo_;
      }

      public List<? extends TeamInfoOrBuilder> getTeamInfoOrBuilderList() {
         return this.teamInfo_;
      }

      public int getTeamInfoCount() {
         return this.teamInfo_.size();
      }

      public TeamInfo getTeamInfo(int index) {
         return (TeamInfo)this.teamInfo_.get(index);
      }

      public TeamInfoOrBuilder getTeamInfoOrBuilder(int index) {
         return (TeamInfoOrBuilder)this.teamInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBackingLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBackingStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTeamInfoCount(); ++i) {
               if (!this.getTeamInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.mainLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.backingLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.backingStar_);
         }

         for(int i = 0; i < this.teamInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.teamInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.mainLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.backingLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.backingStar_);
            }

            for(int i = 0; i < this.teamInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.teamInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonTigerInfo_14802)) {
            return super.equals(obj);
         } else {
            S2C_DragonTigerInfo_14802 other = (S2C_DragonTigerInfo_14802)obj;
            if (this.hasMainLv() != other.hasMainLv()) {
               return false;
            } else if (this.hasMainLv() && this.getMainLv() != other.getMainLv()) {
               return false;
            } else if (this.hasBackingLv() != other.hasBackingLv()) {
               return false;
            } else if (this.hasBackingLv() && this.getBackingLv() != other.getBackingLv()) {
               return false;
            } else if (this.hasBackingStar() != other.hasBackingStar()) {
               return false;
            } else if (this.hasBackingStar() && this.getBackingStar() != other.getBackingStar()) {
               return false;
            } else if (!this.getTeamInfoList().equals(other.getTeamInfoList())) {
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
            if (this.hasMainLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainLv();
            }

            if (this.hasBackingLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBackingLv();
            }

            if (this.hasBackingStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBackingStar();
            }

            if (this.getTeamInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTeamInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTigerInfo_14802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonTigerInfo_14802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonTigerInfo_14802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonTigerInfo_14802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTigerInfo_14802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonTigerInfo_14802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonTigerInfo_14802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonTigerInfo_14802> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonTigerInfo_14802> getParserForType() {
         return PARSER;
      }

      public S2C_DragonTigerInfo_14802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonTigerInfo_14802OrBuilder {
         private int bitField0_;
         private int mainLv_;
         private int backingLv_;
         private int backingStar_;
         private List<TeamInfo> teamInfo_;
         private RepeatedFieldBuilderV3<TeamInfo, TeamInfo.Builder, TeamInfoOrBuilder> teamInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonTigerInfo_14802.class, Builder.class);
         }

         private Builder() {
            this.teamInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.S2C_DragonTigerInfo_14802.alwaysUseFieldBuilders) {
               this.getTeamInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.mainLv_ = 0;
            this.bitField0_ &= -2;
            this.backingLv_ = 0;
            this.bitField0_ &= -3;
            this.backingStar_ = 0;
            this.bitField0_ &= -5;
            if (this.teamInfoBuilder_ == null) {
               this.teamInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.teamInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_DragonTigerInfo_14802_descriptor;
         }

         public S2C_DragonTigerInfo_14802 getDefaultInstanceForType() {
            return DragonTigerMsg.S2C_DragonTigerInfo_14802.getDefaultInstance();
         }

         public S2C_DragonTigerInfo_14802 build() {
            S2C_DragonTigerInfo_14802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonTigerInfo_14802 buildPartial() {
            S2C_DragonTigerInfo_14802 result = new S2C_DragonTigerInfo_14802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainLv_ = this.mainLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.backingLv_ = this.backingLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.backingStar_ = this.backingStar_;
               to_bitField0_ |= 4;
            }

            if (this.teamInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.teamInfo_ = Collections.unmodifiableList(this.teamInfo_);
                  this.bitField0_ &= -9;
               }

               result.teamInfo_ = this.teamInfo_;
            } else {
               result.teamInfo_ = this.teamInfoBuilder_.build();
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
            if (other instanceof S2C_DragonTigerInfo_14802) {
               return this.mergeFrom((S2C_DragonTigerInfo_14802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonTigerInfo_14802 other) {
            if (other == DragonTigerMsg.S2C_DragonTigerInfo_14802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainLv()) {
                  this.setMainLv(other.getMainLv());
               }

               if (other.hasBackingLv()) {
                  this.setBackingLv(other.getBackingLv());
               }

               if (other.hasBackingStar()) {
                  this.setBackingStar(other.getBackingStar());
               }

               if (this.teamInfoBuilder_ == null) {
                  if (!other.teamInfo_.isEmpty()) {
                     if (this.teamInfo_.isEmpty()) {
                        this.teamInfo_ = other.teamInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTeamInfoIsMutable();
                        this.teamInfo_.addAll(other.teamInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.teamInfo_.isEmpty()) {
                  if (this.teamInfoBuilder_.isEmpty()) {
                     this.teamInfoBuilder_.dispose();
                     this.teamInfoBuilder_ = null;
                     this.teamInfo_ = other.teamInfo_;
                     this.bitField0_ &= -9;
                     this.teamInfoBuilder_ = DragonTigerMsg.S2C_DragonTigerInfo_14802.alwaysUseFieldBuilders ? this.getTeamInfoFieldBuilder() : null;
                  } else {
                     this.teamInfoBuilder_.addAllMessages(other.teamInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMainLv()) {
               return false;
            } else if (!this.hasBackingLv()) {
               return false;
            } else if (!this.hasBackingStar()) {
               return false;
            } else {
               for(int i = 0; i < this.getTeamInfoCount(); ++i) {
                  if (!this.getTeamInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonTigerInfo_14802 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonTigerInfo_14802)DragonTigerMsg.S2C_DragonTigerInfo_14802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonTigerInfo_14802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainLv() {
            return this.mainLv_;
         }

         public Builder setMainLv(int value) {
            this.bitField0_ |= 1;
            this.mainLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainLv() {
            this.bitField0_ &= -2;
            this.mainLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBackingLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBackingLv() {
            return this.backingLv_;
         }

         public Builder setBackingLv(int value) {
            this.bitField0_ |= 2;
            this.backingLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackingLv() {
            this.bitField0_ &= -3;
            this.backingLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBackingStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBackingStar() {
            return this.backingStar_;
         }

         public Builder setBackingStar(int value) {
            this.bitField0_ |= 4;
            this.backingStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackingStar() {
            this.bitField0_ &= -5;
            this.backingStar_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTeamInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.teamInfo_ = new ArrayList(this.teamInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<TeamInfo> getTeamInfoList() {
            return this.teamInfoBuilder_ == null ? Collections.unmodifiableList(this.teamInfo_) : this.teamInfoBuilder_.getMessageList();
         }

         public int getTeamInfoCount() {
            return this.teamInfoBuilder_ == null ? this.teamInfo_.size() : this.teamInfoBuilder_.getCount();
         }

         public TeamInfo getTeamInfo(int index) {
            return this.teamInfoBuilder_ == null ? (TeamInfo)this.teamInfo_.get(index) : (TeamInfo)this.teamInfoBuilder_.getMessage(index);
         }

         public Builder setTeamInfo(int index, TeamInfo value) {
            if (this.teamInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfoIsMutable();
               this.teamInfo_.set(index, value);
               this.onChanged();
            } else {
               this.teamInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTeamInfo(int index, TeamInfo.Builder builderForValue) {
            if (this.teamInfoBuilder_ == null) {
               this.ensureTeamInfoIsMutable();
               this.teamInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTeamInfo(TeamInfo value) {
            if (this.teamInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfoIsMutable();
               this.teamInfo_.add(value);
               this.onChanged();
            } else {
               this.teamInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTeamInfo(int index, TeamInfo value) {
            if (this.teamInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfoIsMutable();
               this.teamInfo_.add(index, value);
               this.onChanged();
            } else {
               this.teamInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTeamInfo(TeamInfo.Builder builderForValue) {
            if (this.teamInfoBuilder_ == null) {
               this.ensureTeamInfoIsMutable();
               this.teamInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTeamInfo(int index, TeamInfo.Builder builderForValue) {
            if (this.teamInfoBuilder_ == null) {
               this.ensureTeamInfoIsMutable();
               this.teamInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTeamInfo(Iterable<? extends TeamInfo> values) {
            if (this.teamInfoBuilder_ == null) {
               this.ensureTeamInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.teamInfo_);
               this.onChanged();
            } else {
               this.teamInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTeamInfo() {
            if (this.teamInfoBuilder_ == null) {
               this.teamInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.teamInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeTeamInfo(int index) {
            if (this.teamInfoBuilder_ == null) {
               this.ensureTeamInfoIsMutable();
               this.teamInfo_.remove(index);
               this.onChanged();
            } else {
               this.teamInfoBuilder_.remove(index);
            }

            return this;
         }

         public TeamInfo.Builder getTeamInfoBuilder(int index) {
            return (TeamInfo.Builder)this.getTeamInfoFieldBuilder().getBuilder(index);
         }

         public TeamInfoOrBuilder getTeamInfoOrBuilder(int index) {
            return this.teamInfoBuilder_ == null ? (TeamInfoOrBuilder)this.teamInfo_.get(index) : (TeamInfoOrBuilder)this.teamInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TeamInfoOrBuilder> getTeamInfoOrBuilderList() {
            return this.teamInfoBuilder_ != null ? this.teamInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.teamInfo_);
         }

         public TeamInfo.Builder addTeamInfoBuilder() {
            return (TeamInfo.Builder)this.getTeamInfoFieldBuilder().addBuilder(DragonTigerMsg.TeamInfo.getDefaultInstance());
         }

         public TeamInfo.Builder addTeamInfoBuilder(int index) {
            return (TeamInfo.Builder)this.getTeamInfoFieldBuilder().addBuilder(index, DragonTigerMsg.TeamInfo.getDefaultInstance());
         }

         public List<TeamInfo.Builder> getTeamInfoBuilderList() {
            return this.getTeamInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TeamInfo, TeamInfo.Builder, TeamInfoOrBuilder> getTeamInfoFieldBuilder() {
            if (this.teamInfoBuilder_ == null) {
               this.teamInfoBuilder_ = new RepeatedFieldBuilderV3(this.teamInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.teamInfo_ = null;
            }

            return this.teamInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Unlock_14803 extends GeneratedMessageV3 implements C2S_Unlock_14803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMIDX_FIELD_NUMBER = 1;
      private int teamIdx_;
      public static final int IDX_FIELD_NUMBER = 2;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final C2S_Unlock_14803 DEFAULT_INSTANCE = new C2S_Unlock_14803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Unlock_14803> PARSER = new AbstractParser<C2S_Unlock_14803>() {
         public C2S_Unlock_14803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Unlock_14803(input, extensionRegistry);
         }
      };

      private C2S_Unlock_14803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Unlock_14803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Unlock_14803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Unlock_14803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamIdx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.idx_ = input.readInt32();
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_14803.class, Builder.class);
      }

      public boolean hasTeamIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamIdx() {
         return this.teamIdx_;
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.teamIdx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.teamIdx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.idx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Unlock_14803)) {
            return super.equals(obj);
         } else {
            C2S_Unlock_14803 other = (C2S_Unlock_14803)obj;
            if (this.hasTeamIdx() != other.hasTeamIdx()) {
               return false;
            } else if (this.hasTeamIdx() && this.getTeamIdx() != other.getTeamIdx()) {
               return false;
            } else if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasTeamIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamIdx();
            }

            if (this.hasIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Unlock_14803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_14803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_14803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_14803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_14803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_14803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_14803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_14803 parseFrom(InputStream input) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_14803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_14803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Unlock_14803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_14803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_14803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_14803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Unlock_14803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Unlock_14803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Unlock_14803> parser() {
         return PARSER;
      }

      public Parser<C2S_Unlock_14803> getParserForType() {
         return PARSER;
      }

      public C2S_Unlock_14803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Unlock_14803OrBuilder {
         private int bitField0_;
         private int teamIdx_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_14803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.C2S_Unlock_14803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamIdx_ = 0;
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Unlock_14803_descriptor;
         }

         public C2S_Unlock_14803 getDefaultInstanceForType() {
            return DragonTigerMsg.C2S_Unlock_14803.getDefaultInstance();
         }

         public C2S_Unlock_14803 build() {
            C2S_Unlock_14803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Unlock_14803 buildPartial() {
            C2S_Unlock_14803 result = new C2S_Unlock_14803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamIdx_ = this.teamIdx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof C2S_Unlock_14803) {
               return this.mergeFrom((C2S_Unlock_14803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Unlock_14803 other) {
            if (other == DragonTigerMsg.C2S_Unlock_14803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamIdx()) {
                  this.setTeamIdx(other.getTeamIdx());
               }

               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamIdx()) {
               return false;
            } else {
               return this.hasIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Unlock_14803 parsedMessage = null;

            try {
               parsedMessage = (C2S_Unlock_14803)DragonTigerMsg.C2S_Unlock_14803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Unlock_14803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTeamIdx() {
            return this.teamIdx_;
         }

         public Builder setTeamIdx(int value) {
            this.bitField0_ |= 1;
            this.teamIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamIdx() {
            this.bitField0_ &= -2;
            this.teamIdx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 2;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -3;
            this.idx_ = 0;
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

   public static final class S2C_Unlock_14804 extends GeneratedMessageV3 implements S2C_Unlock_14804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMIDX_FIELD_NUMBER = 1;
      private int teamIdx_;
      public static final int IDX_FIELD_NUMBER = 2;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final S2C_Unlock_14804 DEFAULT_INSTANCE = new S2C_Unlock_14804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Unlock_14804> PARSER = new AbstractParser<S2C_Unlock_14804>() {
         public S2C_Unlock_14804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Unlock_14804(input, extensionRegistry);
         }
      };

      private S2C_Unlock_14804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Unlock_14804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Unlock_14804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Unlock_14804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamIdx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.idx_ = input.readInt32();
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_14804.class, Builder.class);
      }

      public boolean hasTeamIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamIdx() {
         return this.teamIdx_;
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.teamIdx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.teamIdx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.idx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Unlock_14804)) {
            return super.equals(obj);
         } else {
            S2C_Unlock_14804 other = (S2C_Unlock_14804)obj;
            if (this.hasTeamIdx() != other.hasTeamIdx()) {
               return false;
            } else if (this.hasTeamIdx() && this.getTeamIdx() != other.getTeamIdx()) {
               return false;
            } else if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasTeamIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamIdx();
            }

            if (this.hasIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Unlock_14804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_14804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_14804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_14804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_14804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_14804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_14804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_14804 parseFrom(InputStream input) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_14804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_14804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Unlock_14804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_14804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_14804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_14804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Unlock_14804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Unlock_14804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Unlock_14804> parser() {
         return PARSER;
      }

      public Parser<S2C_Unlock_14804> getParserForType() {
         return PARSER;
      }

      public S2C_Unlock_14804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Unlock_14804OrBuilder {
         private int bitField0_;
         private int teamIdx_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_14804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.S2C_Unlock_14804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamIdx_ = 0;
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Unlock_14804_descriptor;
         }

         public S2C_Unlock_14804 getDefaultInstanceForType() {
            return DragonTigerMsg.S2C_Unlock_14804.getDefaultInstance();
         }

         public S2C_Unlock_14804 build() {
            S2C_Unlock_14804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Unlock_14804 buildPartial() {
            S2C_Unlock_14804 result = new S2C_Unlock_14804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamIdx_ = this.teamIdx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof S2C_Unlock_14804) {
               return this.mergeFrom((S2C_Unlock_14804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Unlock_14804 other) {
            if (other == DragonTigerMsg.S2C_Unlock_14804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamIdx()) {
                  this.setTeamIdx(other.getTeamIdx());
               }

               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamIdx()) {
               return false;
            } else {
               return this.hasIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Unlock_14804 parsedMessage = null;

            try {
               parsedMessage = (S2C_Unlock_14804)DragonTigerMsg.S2C_Unlock_14804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Unlock_14804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTeamIdx() {
            return this.teamIdx_;
         }

         public Builder setTeamIdx(int value) {
            this.bitField0_ |= 1;
            this.teamIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamIdx() {
            this.bitField0_ &= -2;
            this.teamIdx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 2;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -3;
            this.idx_ = 0;
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

   public static final class C2S_Arraying_14805 extends GeneratedMessageV3 implements C2S_Arraying_14805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int TEAMIDX_FIELD_NUMBER = 2;
      private int teamIdx_;
      public static final int IDX_FIELD_NUMBER = 3;
      private int idx_;
      public static final int HEROCODE_FIELD_NUMBER = 4;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Arraying_14805 DEFAULT_INSTANCE = new C2S_Arraying_14805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Arraying_14805> PARSER = new AbstractParser<C2S_Arraying_14805>() {
         public C2S_Arraying_14805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Arraying_14805(input, extensionRegistry);
         }
      };

      private C2S_Arraying_14805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Arraying_14805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Arraying_14805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Arraying_14805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.teamIdx_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.idx_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Arraying_14805.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasTeamIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTeamIdx() {
         return this.teamIdx_;
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.teamIdx_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.idx_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.teamIdx_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.idx_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Arraying_14805)) {
            return super.equals(obj);
         } else {
            C2S_Arraying_14805 other = (C2S_Arraying_14805)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasTeamIdx() != other.hasTeamIdx()) {
               return false;
            } else if (this.hasTeamIdx() && this.getTeamIdx() != other.getTeamIdx()) {
               return false;
            } else if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            if (this.hasTeamIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamIdx();
            }

            if (this.hasIdx()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Arraying_14805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data);
      }

      public static C2S_Arraying_14805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Arraying_14805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data);
      }

      public static C2S_Arraying_14805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Arraying_14805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data);
      }

      public static C2S_Arraying_14805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Arraying_14805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Arraying_14805 parseFrom(InputStream input) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Arraying_14805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Arraying_14805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Arraying_14805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Arraying_14805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Arraying_14805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Arraying_14805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Arraying_14805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Arraying_14805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Arraying_14805> parser() {
         return PARSER;
      }

      public Parser<C2S_Arraying_14805> getParserForType() {
         return PARSER;
      }

      public C2S_Arraying_14805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Arraying_14805OrBuilder {
         private int bitField0_;
         private int state_;
         private int teamIdx_;
         private int idx_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Arraying_14805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.C2S_Arraying_14805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            this.teamIdx_ = 0;
            this.bitField0_ &= -3;
            this.idx_ = 0;
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_C2S_Arraying_14805_descriptor;
         }

         public C2S_Arraying_14805 getDefaultInstanceForType() {
            return DragonTigerMsg.C2S_Arraying_14805.getDefaultInstance();
         }

         public C2S_Arraying_14805 build() {
            C2S_Arraying_14805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Arraying_14805 buildPartial() {
            C2S_Arraying_14805 result = new C2S_Arraying_14805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.teamIdx_ = this.teamIdx_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_Arraying_14805) {
               return this.mergeFrom((C2S_Arraying_14805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Arraying_14805 other) {
            if (other == DragonTigerMsg.C2S_Arraying_14805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasTeamIdx()) {
                  this.setTeamIdx(other.getTeamIdx());
               }

               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
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
            if (!this.hasState()) {
               return false;
            } else if (!this.hasTeamIdx()) {
               return false;
            } else {
               return this.hasIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Arraying_14805 parsedMessage = null;

            try {
               parsedMessage = (C2S_Arraying_14805)DragonTigerMsg.C2S_Arraying_14805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Arraying_14805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTeamIdx() {
            return this.teamIdx_;
         }

         public Builder setTeamIdx(int value) {
            this.bitField0_ |= 2;
            this.teamIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamIdx() {
            this.bitField0_ &= -3;
            this.teamIdx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 4;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -5;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 8;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -9;
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

   public static final class S2C_Arraying_14806 extends GeneratedMessageV3 implements S2C_Arraying_14806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int TEAMIDX_FIELD_NUMBER = 2;
      private int teamIdx_;
      public static final int IDX_FIELD_NUMBER = 3;
      private int idx_;
      public static final int HEROCODE_FIELD_NUMBER = 4;
      private int heroCode_;
      public static final int BACKINGLV_FIELD_NUMBER = 5;
      private int backingLv_;
      public static final int BACKINGSTAR_FIELD_NUMBER = 6;
      private int backingStar_;
      private byte memoizedIsInitialized;
      private static final S2C_Arraying_14806 DEFAULT_INSTANCE = new S2C_Arraying_14806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Arraying_14806> PARSER = new AbstractParser<S2C_Arraying_14806>() {
         public S2C_Arraying_14806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Arraying_14806(input, extensionRegistry);
         }
      };

      private S2C_Arraying_14806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Arraying_14806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Arraying_14806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Arraying_14806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.teamIdx_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.idx_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.backingLv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.backingStar_ = input.readInt32();
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
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Arraying_14806.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasTeamIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTeamIdx() {
         return this.teamIdx_;
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasBackingLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getBackingLv() {
         return this.backingLv_;
      }

      public boolean hasBackingStar() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getBackingStar() {
         return this.backingStar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.teamIdx_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.idx_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.heroCode_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.backingLv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.backingStar_);
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
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.teamIdx_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.idx_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroCode_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.backingLv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.backingStar_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Arraying_14806)) {
            return super.equals(obj);
         } else {
            S2C_Arraying_14806 other = (S2C_Arraying_14806)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasTeamIdx() != other.hasTeamIdx()) {
               return false;
            } else if (this.hasTeamIdx() && this.getTeamIdx() != other.getTeamIdx()) {
               return false;
            } else if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasBackingLv() != other.hasBackingLv()) {
               return false;
            } else if (this.hasBackingLv() && this.getBackingLv() != other.getBackingLv()) {
               return false;
            } else if (this.hasBackingStar() != other.hasBackingStar()) {
               return false;
            } else if (this.hasBackingStar() && this.getBackingStar() != other.getBackingStar()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            if (this.hasTeamIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamIdx();
            }

            if (this.hasIdx()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasBackingLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getBackingLv();
            }

            if (this.hasBackingStar()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBackingStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Arraying_14806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data);
      }

      public static S2C_Arraying_14806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Arraying_14806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data);
      }

      public static S2C_Arraying_14806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Arraying_14806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data);
      }

      public static S2C_Arraying_14806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Arraying_14806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Arraying_14806 parseFrom(InputStream input) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Arraying_14806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Arraying_14806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Arraying_14806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Arraying_14806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Arraying_14806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Arraying_14806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Arraying_14806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Arraying_14806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Arraying_14806> parser() {
         return PARSER;
      }

      public Parser<S2C_Arraying_14806> getParserForType() {
         return PARSER;
      }

      public S2C_Arraying_14806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Arraying_14806OrBuilder {
         private int bitField0_;
         private int state_;
         private int teamIdx_;
         private int idx_;
         private int heroCode_;
         private int backingLv_;
         private int backingStar_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Arraying_14806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTigerMsg.S2C_Arraying_14806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            this.teamIdx_ = 0;
            this.bitField0_ &= -3;
            this.idx_ = 0;
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.bitField0_ &= -9;
            this.backingLv_ = 0;
            this.bitField0_ &= -17;
            this.backingStar_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTigerMsg.internal_static_dragonTiger_com_gzbz_protobuf_S2C_Arraying_14806_descriptor;
         }

         public S2C_Arraying_14806 getDefaultInstanceForType() {
            return DragonTigerMsg.S2C_Arraying_14806.getDefaultInstance();
         }

         public S2C_Arraying_14806 build() {
            S2C_Arraying_14806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Arraying_14806 buildPartial() {
            S2C_Arraying_14806 result = new S2C_Arraying_14806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.teamIdx_ = this.teamIdx_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.backingLv_ = this.backingLv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.backingStar_ = this.backingStar_;
               to_bitField0_ |= 32;
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
            if (other instanceof S2C_Arraying_14806) {
               return this.mergeFrom((S2C_Arraying_14806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Arraying_14806 other) {
            if (other == DragonTigerMsg.S2C_Arraying_14806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasTeamIdx()) {
                  this.setTeamIdx(other.getTeamIdx());
               }

               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasBackingLv()) {
                  this.setBackingLv(other.getBackingLv());
               }

               if (other.hasBackingStar()) {
                  this.setBackingStar(other.getBackingStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasState()) {
               return false;
            } else if (!this.hasTeamIdx()) {
               return false;
            } else {
               return this.hasIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Arraying_14806 parsedMessage = null;

            try {
               parsedMessage = (S2C_Arraying_14806)DragonTigerMsg.S2C_Arraying_14806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Arraying_14806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTeamIdx() {
            return this.teamIdx_;
         }

         public Builder setTeamIdx(int value) {
            this.bitField0_ |= 2;
            this.teamIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamIdx() {
            this.bitField0_ &= -3;
            this.teamIdx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 4;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -5;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 8;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -9;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBackingLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getBackingLv() {
            return this.backingLv_;
         }

         public Builder setBackingLv(int value) {
            this.bitField0_ |= 16;
            this.backingLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackingLv() {
            this.bitField0_ &= -17;
            this.backingLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBackingStar() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getBackingStar() {
            return this.backingStar_;
         }

         public Builder setBackingStar(int value) {
            this.bitField0_ |= 32;
            this.backingStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackingStar() {
            this.bitField0_ &= -33;
            this.backingStar_ = 0;
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

   public interface C2S_Arraying_14805OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();

      boolean hasTeamIdx();

      int getTeamIdx();

      boolean hasIdx();

      int getIdx();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_DragonTigerInfo_14801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Unlock_14803OrBuilder extends MessageOrBuilder {
      boolean hasTeamIdx();

      int getTeamIdx();

      boolean hasIdx();

      int getIdx();
   }

   public interface S2C_Arraying_14806OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();

      boolean hasTeamIdx();

      int getTeamIdx();

      boolean hasIdx();

      int getIdx();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasBackingLv();

      int getBackingLv();

      boolean hasBackingStar();

      int getBackingStar();
   }

   public interface S2C_DragonTigerInfo_14802OrBuilder extends MessageOrBuilder {
      boolean hasMainLv();

      int getMainLv();

      boolean hasBackingLv();

      int getBackingLv();

      boolean hasBackingStar();

      int getBackingStar();

      List<TeamInfo> getTeamInfoList();

      TeamInfo getTeamInfo(int index);

      int getTeamInfoCount();

      List<? extends TeamInfoOrBuilder> getTeamInfoOrBuilderList();

      TeamInfoOrBuilder getTeamInfoOrBuilder(int index);
   }

   public interface S2C_Unlock_14804OrBuilder extends MessageOrBuilder {
      boolean hasTeamIdx();

      int getTeamIdx();

      boolean hasIdx();

      int getIdx();
   }

   public interface SlotInfoOrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface TeamInfoOrBuilder extends MessageOrBuilder {
      boolean hasTeamIdx();

      int getTeamIdx();

      List<SlotInfo> getInfoList();

      SlotInfo getInfo(int index);

      int getInfoCount();

      List<? extends SlotInfoOrBuilder> getInfoOrBuilderList();

      SlotInfoOrBuilder getInfoOrBuilder(int index);
   }
}
