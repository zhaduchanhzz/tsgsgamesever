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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HeroAwakenMsg {
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroAwakenMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010HeroAwaken.proto\u0012\u001cheroAwaken.com.gzbz.protobuf\"(\n\u000eHeroAwakenInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0001(\u0005\"\u0010\n\u000eC2S_Main_16801\"M\n\u000eS2C_Main_16802\u0012;\n\u0005infos\u0018\u0001 \u0003(\u000b2,.heroAwaken.com.gzbz.protobuf.HeroAwakenInfo\"R\n\u0014S2C_UpdateInfo_16804\u0012:\n\u0004info\u0018\u0001 \u0002(\u000b2,.heroAwaken.com.gzbz.protobuf.HeroAwakenInfo\"\u001e\n\u0010C2S_Unlock_16805\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"^\n\u0010S2C_Unlock_16806\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012:\n\u0004info\u0018\u0002 \u0002(\u000b2,.heroAwaken.com.gzbz.protobuf.HeroAwakenInfo\"&\n\u0011C2S_Upgrade_16809\u0012\u0011\n\tarchiveId\u0018\u0001 \u0002(\u0005\"_\n\u0011S2C_Upgrade_16810\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012:\n\u0004info\u0018\u0002 \u0002(\u000b2,.heroAwaken.com.gzbz.protobuf.HeroAwakenInfoB$\n\u0011com.gzbz.protobufB\rHeroAwakenMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor, new String[]{"Id", "Lv"});
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor, new String[0]);
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor, new String[]{"Infos"});
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor, new String[]{"Info"});
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor, new String[]{"Id"});
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor, new String[]{"Result", "Info"});
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor, new String[]{"ArchiveId"});
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor, new String[]{"Result", "Info"});
   }

   public static final class HeroAwakenInfo extends GeneratedMessageV3 implements HeroAwakenInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final HeroAwakenInfo DEFAULT_INSTANCE = new HeroAwakenInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroAwakenInfo> PARSER = new AbstractParser<HeroAwakenInfo>() {
         public HeroAwakenInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroAwakenInfo(input, extensionRegistry);
         }
      };

      private HeroAwakenInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroAwakenInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroAwakenInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroAwakenInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lv_ = input.readInt32();
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroAwakenInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLv() {
         return this.lv_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroAwakenInfo)) {
            return super.equals(obj);
         } else {
            HeroAwakenInfo other = (HeroAwakenInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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

            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroAwakenInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data);
      }

      public static HeroAwakenInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroAwakenInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data);
      }

      public static HeroAwakenInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroAwakenInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data);
      }

      public static HeroAwakenInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroAwakenInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroAwakenInfo parseFrom(InputStream input) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroAwakenInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroAwakenInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroAwakenInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroAwakenInfo parseFrom(CodedInputStream input) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroAwakenInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroAwakenInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroAwakenInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroAwakenInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroAwakenInfo> parser() {
         return PARSER;
      }

      public Parser<HeroAwakenInfo> getParserForType() {
         return PARSER;
      }

      public HeroAwakenInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroAwakenInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroAwakenInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.HeroAwakenInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_HeroAwakenInfo_descriptor;
         }

         public HeroAwakenInfo getDefaultInstanceForType() {
            return HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance();
         }

         public HeroAwakenInfo build() {
            HeroAwakenInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroAwakenInfo buildPartial() {
            HeroAwakenInfo result = new HeroAwakenInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof HeroAwakenInfo) {
               return this.mergeFrom((HeroAwakenInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroAwakenInfo other) {
            if (other == HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
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
            HeroAwakenInfo parsedMessage = null;

            try {
               parsedMessage = (HeroAwakenInfo)HeroAwakenMsg.HeroAwakenInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroAwakenInfo)e.getUnfinishedMessage();
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

         public boolean hasLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 2;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -3;
            this.lv_ = 0;
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

   public static final class C2S_Main_16801 extends GeneratedMessageV3 implements C2S_Main_16801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_16801 DEFAULT_INSTANCE = new C2S_Main_16801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_16801> PARSER = new AbstractParser<C2S_Main_16801>() {
         public C2S_Main_16801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_16801(input, extensionRegistry);
         }
      };

      private C2S_Main_16801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_16801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_16801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_16801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_16801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_16801)) {
            return super.equals(obj);
         } else {
            C2S_Main_16801 other = (C2S_Main_16801)obj;
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

      public static C2S_Main_16801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data);
      }

      public static C2S_Main_16801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_16801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data);
      }

      public static C2S_Main_16801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_16801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data);
      }

      public static C2S_Main_16801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_16801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_16801 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_16801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_16801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_16801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_16801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_16801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_16801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_16801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_16801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_16801> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_16801> getParserForType() {
         return PARSER;
      }

      public C2S_Main_16801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_16801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_16801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.C2S_Main_16801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Main_16801_descriptor;
         }

         public C2S_Main_16801 getDefaultInstanceForType() {
            return HeroAwakenMsg.C2S_Main_16801.getDefaultInstance();
         }

         public C2S_Main_16801 build() {
            C2S_Main_16801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_16801 buildPartial() {
            C2S_Main_16801 result = new C2S_Main_16801(this);
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
            if (other instanceof C2S_Main_16801) {
               return this.mergeFrom((C2S_Main_16801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_16801 other) {
            if (other == HeroAwakenMsg.C2S_Main_16801.getDefaultInstance()) {
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
            C2S_Main_16801 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_16801)HeroAwakenMsg.C2S_Main_16801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_16801)e.getUnfinishedMessage();
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

   public static final class S2C_Main_16802 extends GeneratedMessageV3 implements S2C_Main_16802OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroAwakenInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_16802 DEFAULT_INSTANCE = new S2C_Main_16802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_16802> PARSER = new AbstractParser<S2C_Main_16802>() {
         public S2C_Main_16802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_16802(input, extensionRegistry);
         }
      };

      private S2C_Main_16802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_16802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_16802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_16802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(HeroAwakenMsg.HeroAwakenInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_16802.class, Builder.class);
      }

      public List<HeroAwakenInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroAwakenInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroAwakenInfo getInfos(int index) {
         return (HeroAwakenInfo)this.infos_.get(index);
      }

      public HeroAwakenInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroAwakenInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_16802)) {
            return super.equals(obj);
         } else {
            S2C_Main_16802 other = (S2C_Main_16802)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_16802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data);
      }

      public static S2C_Main_16802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_16802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data);
      }

      public static S2C_Main_16802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_16802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data);
      }

      public static S2C_Main_16802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_16802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_16802 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_16802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_16802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_16802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_16802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_16802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_16802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_16802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_16802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_16802> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_16802> getParserForType() {
         return PARSER;
      }

      public S2C_Main_16802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_16802OrBuilder {
         private int bitField0_;
         private List<HeroAwakenInfo> infos_;
         private RepeatedFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_16802.class, Builder.class);
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
            if (HeroAwakenMsg.S2C_Main_16802.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Main_16802_descriptor;
         }

         public S2C_Main_16802 getDefaultInstanceForType() {
            return HeroAwakenMsg.S2C_Main_16802.getDefaultInstance();
         }

         public S2C_Main_16802 build() {
            S2C_Main_16802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_16802 buildPartial() {
            S2C_Main_16802 result = new S2C_Main_16802(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_Main_16802) {
               return this.mergeFrom((S2C_Main_16802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_16802 other) {
            if (other == HeroAwakenMsg.S2C_Main_16802.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = HeroAwakenMsg.S2C_Main_16802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_16802 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_16802)HeroAwakenMsg.S2C_Main_16802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_16802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroAwakenInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroAwakenInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroAwakenInfo)this.infos_.get(index) : (HeroAwakenInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroAwakenInfo value) {
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

         public Builder setInfos(int index, HeroAwakenInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroAwakenInfo value) {
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

         public Builder addInfos(int index, HeroAwakenInfo value) {
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

         public Builder addInfos(HeroAwakenInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroAwakenInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroAwakenInfo> values) {
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
               this.bitField0_ &= -2;
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

         public HeroAwakenInfo.Builder getInfosBuilder(int index) {
            return (HeroAwakenInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroAwakenInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroAwakenInfoOrBuilder)this.infos_.get(index) : (HeroAwakenInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroAwakenInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroAwakenInfo.Builder addInfosBuilder() {
            return (HeroAwakenInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance());
         }

         public HeroAwakenInfo.Builder addInfosBuilder(int index) {
            return (HeroAwakenInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance());
         }

         public List<HeroAwakenInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class S2C_UpdateInfo_16804 extends GeneratedMessageV3 implements S2C_UpdateInfo_16804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private HeroAwakenInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateInfo_16804 DEFAULT_INSTANCE = new S2C_UpdateInfo_16804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateInfo_16804> PARSER = new AbstractParser<S2C_UpdateInfo_16804>() {
         public S2C_UpdateInfo_16804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateInfo_16804(input, extensionRegistry);
         }
      };

      private S2C_UpdateInfo_16804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateInfo_16804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateInfo_16804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateInfo_16804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        HeroAwakenInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HeroAwakenInfo)input.readMessage(HeroAwakenMsg.HeroAwakenInfo.PARSER, extensionRegistry);
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateInfo_16804.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public HeroAwakenInfo getInfo() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
      }

      public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_UpdateInfo_16804)) {
            return super.equals(obj);
         } else {
            S2C_UpdateInfo_16804 other = (S2C_UpdateInfo_16804)obj;
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

      public static S2C_UpdateInfo_16804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data);
      }

      public static S2C_UpdateInfo_16804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateInfo_16804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data);
      }

      public static S2C_UpdateInfo_16804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateInfo_16804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data);
      }

      public static S2C_UpdateInfo_16804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateInfo_16804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateInfo_16804 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateInfo_16804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateInfo_16804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateInfo_16804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateInfo_16804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateInfo_16804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateInfo_16804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateInfo_16804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateInfo_16804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateInfo_16804> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateInfo_16804> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateInfo_16804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateInfo_16804OrBuilder {
         private int bitField0_;
         private HeroAwakenInfo info_;
         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateInfo_16804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.S2C_UpdateInfo_16804.alwaysUseFieldBuilders) {
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
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_UpdateInfo_16804_descriptor;
         }

         public S2C_UpdateInfo_16804 getDefaultInstanceForType() {
            return HeroAwakenMsg.S2C_UpdateInfo_16804.getDefaultInstance();
         }

         public S2C_UpdateInfo_16804 build() {
            S2C_UpdateInfo_16804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateInfo_16804 buildPartial() {
            S2C_UpdateInfo_16804 result = new S2C_UpdateInfo_16804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HeroAwakenInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UpdateInfo_16804) {
               return this.mergeFrom((S2C_UpdateInfo_16804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateInfo_16804 other) {
            if (other == HeroAwakenMsg.S2C_UpdateInfo_16804.getDefaultInstance()) {
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
            S2C_UpdateInfo_16804 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateInfo_16804)HeroAwakenMsg.S2C_UpdateInfo_16804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateInfo_16804)e.getUnfinishedMessage();
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

         public HeroAwakenInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            } else {
               return (HeroAwakenInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HeroAwakenInfo value) {
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

         public Builder setInfo(HeroAwakenInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(HeroAwakenInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance()) {
                  this.info_ = HeroAwakenMsg.HeroAwakenInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public HeroAwakenInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (HeroAwakenInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HeroAwakenInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Unlock_16805 extends GeneratedMessageV3 implements C2S_Unlock_16805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_Unlock_16805 DEFAULT_INSTANCE = new C2S_Unlock_16805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Unlock_16805> PARSER = new AbstractParser<C2S_Unlock_16805>() {
         public C2S_Unlock_16805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Unlock_16805(input, extensionRegistry);
         }
      };

      private C2S_Unlock_16805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Unlock_16805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Unlock_16805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Unlock_16805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_16805.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Unlock_16805)) {
            return super.equals(obj);
         } else {
            C2S_Unlock_16805 other = (C2S_Unlock_16805)obj;
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

      public static C2S_Unlock_16805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_16805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_16805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_16805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_16805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_16805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_16805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_16805 parseFrom(InputStream input) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_16805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_16805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Unlock_16805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_16805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_16805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_16805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Unlock_16805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Unlock_16805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Unlock_16805> parser() {
         return PARSER;
      }

      public Parser<C2S_Unlock_16805> getParserForType() {
         return PARSER;
      }

      public C2S_Unlock_16805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Unlock_16805OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_16805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.C2S_Unlock_16805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Unlock_16805_descriptor;
         }

         public C2S_Unlock_16805 getDefaultInstanceForType() {
            return HeroAwakenMsg.C2S_Unlock_16805.getDefaultInstance();
         }

         public C2S_Unlock_16805 build() {
            C2S_Unlock_16805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Unlock_16805 buildPartial() {
            C2S_Unlock_16805 result = new C2S_Unlock_16805(this);
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
            if (other instanceof C2S_Unlock_16805) {
               return this.mergeFrom((C2S_Unlock_16805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Unlock_16805 other) {
            if (other == HeroAwakenMsg.C2S_Unlock_16805.getDefaultInstance()) {
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
            C2S_Unlock_16805 parsedMessage = null;

            try {
               parsedMessage = (C2S_Unlock_16805)HeroAwakenMsg.C2S_Unlock_16805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Unlock_16805)e.getUnfinishedMessage();
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

   public static final class S2C_Unlock_16806 extends GeneratedMessageV3 implements S2C_Unlock_16806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private HeroAwakenInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_Unlock_16806 DEFAULT_INSTANCE = new S2C_Unlock_16806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Unlock_16806> PARSER = new AbstractParser<S2C_Unlock_16806>() {
         public S2C_Unlock_16806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Unlock_16806(input, extensionRegistry);
         }
      };

      private S2C_Unlock_16806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Unlock_16806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Unlock_16806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Unlock_16806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        HeroAwakenInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HeroAwakenInfo)input.readMessage(HeroAwakenMsg.HeroAwakenInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_16806.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public HeroAwakenInfo getInfo() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
      }

      public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Unlock_16806)) {
            return super.equals(obj);
         } else {
            S2C_Unlock_16806 other = (S2C_Unlock_16806)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Unlock_16806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_16806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_16806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_16806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_16806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_16806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_16806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_16806 parseFrom(InputStream input) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_16806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_16806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Unlock_16806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_16806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_16806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_16806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Unlock_16806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Unlock_16806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Unlock_16806> parser() {
         return PARSER;
      }

      public Parser<S2C_Unlock_16806> getParserForType() {
         return PARSER;
      }

      public S2C_Unlock_16806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Unlock_16806OrBuilder {
         private int bitField0_;
         private int result_;
         private HeroAwakenInfo info_;
         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_16806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.S2C_Unlock_16806.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Unlock_16806_descriptor;
         }

         public S2C_Unlock_16806 getDefaultInstanceForType() {
            return HeroAwakenMsg.S2C_Unlock_16806.getDefaultInstance();
         }

         public S2C_Unlock_16806 build() {
            S2C_Unlock_16806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Unlock_16806 buildPartial() {
            S2C_Unlock_16806 result = new S2C_Unlock_16806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HeroAwakenInfo)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_Unlock_16806) {
               return this.mergeFrom((S2C_Unlock_16806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Unlock_16806 other) {
            if (other == HeroAwakenMsg.S2C_Unlock_16806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Unlock_16806 parsedMessage = null;

            try {
               parsedMessage = (S2C_Unlock_16806)HeroAwakenMsg.S2C_Unlock_16806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Unlock_16806)e.getUnfinishedMessage();
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

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public HeroAwakenInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            } else {
               return (HeroAwakenInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HeroAwakenInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(HeroAwakenInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(HeroAwakenInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance()) {
                  this.info_ = HeroAwakenMsg.HeroAwakenInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public HeroAwakenInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (HeroAwakenInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HeroAwakenInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Upgrade_16809 extends GeneratedMessageV3 implements C2S_Upgrade_16809OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARCHIVEID_FIELD_NUMBER = 1;
      private int archiveId_;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_16809 DEFAULT_INSTANCE = new C2S_Upgrade_16809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_16809> PARSER = new AbstractParser<C2S_Upgrade_16809>() {
         public C2S_Upgrade_16809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_16809(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_16809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_16809() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_16809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_16809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.archiveId_ = input.readInt32();
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_16809.class, Builder.class);
      }

      public boolean hasArchiveId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getArchiveId() {
         return this.archiveId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArchiveId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.archiveId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.archiveId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Upgrade_16809)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_16809 other = (C2S_Upgrade_16809)obj;
            if (this.hasArchiveId() != other.hasArchiveId()) {
               return false;
            } else if (this.hasArchiveId() && this.getArchiveId() != other.getArchiveId()) {
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
            if (this.hasArchiveId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArchiveId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Upgrade_16809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_16809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_16809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_16809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_16809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_16809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_16809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_16809 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_16809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_16809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_16809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_16809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_16809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_16809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_16809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_16809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_16809> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_16809> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_16809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_16809OrBuilder {
         private int bitField0_;
         private int archiveId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_16809.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.C2S_Upgrade_16809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.archiveId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_C2S_Upgrade_16809_descriptor;
         }

         public C2S_Upgrade_16809 getDefaultInstanceForType() {
            return HeroAwakenMsg.C2S_Upgrade_16809.getDefaultInstance();
         }

         public C2S_Upgrade_16809 build() {
            C2S_Upgrade_16809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_16809 buildPartial() {
            C2S_Upgrade_16809 result = new C2S_Upgrade_16809(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.archiveId_ = this.archiveId_;
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
            if (other instanceof C2S_Upgrade_16809) {
               return this.mergeFrom((C2S_Upgrade_16809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_16809 other) {
            if (other == HeroAwakenMsg.C2S_Upgrade_16809.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArchiveId()) {
                  this.setArchiveId(other.getArchiveId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasArchiveId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Upgrade_16809 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_16809)HeroAwakenMsg.C2S_Upgrade_16809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_16809)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArchiveId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getArchiveId() {
            return this.archiveId_;
         }

         public Builder setArchiveId(int value) {
            this.bitField0_ |= 1;
            this.archiveId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArchiveId() {
            this.bitField0_ &= -2;
            this.archiveId_ = 0;
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

   public static final class S2C_Upgrade_16810 extends GeneratedMessageV3 implements S2C_Upgrade_16810OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private HeroAwakenInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_Upgrade_16810 DEFAULT_INSTANCE = new S2C_Upgrade_16810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Upgrade_16810> PARSER = new AbstractParser<S2C_Upgrade_16810>() {
         public S2C_Upgrade_16810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Upgrade_16810(input, extensionRegistry);
         }
      };

      private S2C_Upgrade_16810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Upgrade_16810() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Upgrade_16810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Upgrade_16810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        HeroAwakenInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HeroAwakenInfo)input.readMessage(HeroAwakenMsg.HeroAwakenInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_16810.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public HeroAwakenInfo getInfo() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
      }

      public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Upgrade_16810)) {
            return super.equals(obj);
         } else {
            S2C_Upgrade_16810 other = (S2C_Upgrade_16810)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Upgrade_16810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_16810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_16810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_16810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_16810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_16810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_16810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_16810 parseFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_16810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_16810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_16810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_16810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_16810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_16810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Upgrade_16810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Upgrade_16810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Upgrade_16810> parser() {
         return PARSER;
      }

      public Parser<S2C_Upgrade_16810> getParserForType() {
         return PARSER;
      }

      public S2C_Upgrade_16810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Upgrade_16810OrBuilder {
         private int bitField0_;
         private int result_;
         private HeroAwakenInfo info_;
         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_16810.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAwakenMsg.S2C_Upgrade_16810.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAwakenMsg.internal_static_heroAwaken_com_gzbz_protobuf_S2C_Upgrade_16810_descriptor;
         }

         public S2C_Upgrade_16810 getDefaultInstanceForType() {
            return HeroAwakenMsg.S2C_Upgrade_16810.getDefaultInstance();
         }

         public S2C_Upgrade_16810 build() {
            S2C_Upgrade_16810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Upgrade_16810 buildPartial() {
            S2C_Upgrade_16810 result = new S2C_Upgrade_16810(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HeroAwakenInfo)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_Upgrade_16810) {
               return this.mergeFrom((S2C_Upgrade_16810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Upgrade_16810 other) {
            if (other == HeroAwakenMsg.S2C_Upgrade_16810.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Upgrade_16810 parsedMessage = null;

            try {
               parsedMessage = (S2C_Upgrade_16810)HeroAwakenMsg.S2C_Upgrade_16810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Upgrade_16810)e.getUnfinishedMessage();
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

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public HeroAwakenInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            } else {
               return (HeroAwakenInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HeroAwakenInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(HeroAwakenInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(HeroAwakenInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance()) {
                  this.info_ = HeroAwakenMsg.HeroAwakenInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public HeroAwakenInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (HeroAwakenInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HeroAwakenInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HeroAwakenInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? HeroAwakenMsg.HeroAwakenInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HeroAwakenInfo, HeroAwakenInfo.Builder, HeroAwakenInfoOrBuilder> getInfoFieldBuilder() {
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

   public interface C2S_Main_16801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Unlock_16805OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Upgrade_16809OrBuilder extends MessageOrBuilder {
      boolean hasArchiveId();

      int getArchiveId();
   }

   public interface HeroAwakenInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_Main_16802OrBuilder extends MessageOrBuilder {
      List<HeroAwakenInfo> getInfosList();

      HeroAwakenInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroAwakenInfoOrBuilder> getInfosOrBuilderList();

      HeroAwakenInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_Unlock_16806OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      HeroAwakenInfo getInfo();

      HeroAwakenInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UpdateInfo_16804OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      HeroAwakenInfo getInfo();

      HeroAwakenInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_Upgrade_16810OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      HeroAwakenInfo getInfo();

      HeroAwakenInfoOrBuilder getInfoOrBuilder();
   }
}
