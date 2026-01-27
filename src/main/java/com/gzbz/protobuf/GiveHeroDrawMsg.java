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

public final class GiveHeroDrawMsg {
   private static final Descriptors.Descriptor internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private GiveHeroDrawMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012GiveHeroDraw.proto\u0012\u001egiveHeroDraw.com.gzbz.protobuf\u001a\fcommon.proto\"\u001c\n\u001aC2S_GiveHeroDrawData_21301\"O\n\u001aS2C_GiveHeroDrawData_21302\u0012\u001a\n\u0012actTotalOnlineTime\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rtenDrawUseIds\u0018\u0002 \u0003(\u0005\"\u0013\n\u0011C2S_TenDraw_21303\"N\n\u0011S2C_TenDraw_21304\u0012\u0015\n\rtenDrawUseIds\u0018\u0001 \u0003(\u0005\u0012\"\n\bheroInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfoB&\n\u0011com.gzbz.protobufB\u000fGiveHeroDrawMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor, new String[0]);
      internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor, new String[]{"ActTotalOnlineTime", "TenDrawUseIds"});
      internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor, new String[0]);
      internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor, new String[]{"TenDrawUseIds", "HeroInfo"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_GiveHeroDrawData_21301 extends GeneratedMessageV3 implements C2S_GiveHeroDrawData_21301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GiveHeroDrawData_21301 DEFAULT_INSTANCE = new C2S_GiveHeroDrawData_21301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiveHeroDrawData_21301> PARSER = new AbstractParser<C2S_GiveHeroDrawData_21301>() {
         public C2S_GiveHeroDrawData_21301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiveHeroDrawData_21301(input, extensionRegistry);
         }
      };

      private C2S_GiveHeroDrawData_21301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiveHeroDrawData_21301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiveHeroDrawData_21301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiveHeroDrawData_21301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiveHeroDrawData_21301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GiveHeroDrawData_21301)) {
            return super.equals(obj);
         } else {
            C2S_GiveHeroDrawData_21301 other = (C2S_GiveHeroDrawData_21301)obj;
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

      public static C2S_GiveHeroDrawData_21301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveHeroDrawData_21301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(InputStream input) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiveHeroDrawData_21301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiveHeroDrawData_21301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiveHeroDrawData_21301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveHeroDrawData_21301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiveHeroDrawData_21301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiveHeroDrawData_21301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiveHeroDrawData_21301> parser() {
         return PARSER;
      }

      public Parser<C2S_GiveHeroDrawData_21301> getParserForType() {
         return PARSER;
      }

      public C2S_GiveHeroDrawData_21301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiveHeroDrawData_21301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiveHeroDrawData_21301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiveHeroDrawMsg.C2S_GiveHeroDrawData_21301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_GiveHeroDrawData_21301_descriptor;
         }

         public C2S_GiveHeroDrawData_21301 getDefaultInstanceForType() {
            return GiveHeroDrawMsg.C2S_GiveHeroDrawData_21301.getDefaultInstance();
         }

         public C2S_GiveHeroDrawData_21301 build() {
            C2S_GiveHeroDrawData_21301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiveHeroDrawData_21301 buildPartial() {
            C2S_GiveHeroDrawData_21301 result = new C2S_GiveHeroDrawData_21301(this);
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
            if (other instanceof C2S_GiveHeroDrawData_21301) {
               return this.mergeFrom((C2S_GiveHeroDrawData_21301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiveHeroDrawData_21301 other) {
            if (other == GiveHeroDrawMsg.C2S_GiveHeroDrawData_21301.getDefaultInstance()) {
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
            C2S_GiveHeroDrawData_21301 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiveHeroDrawData_21301)GiveHeroDrawMsg.C2S_GiveHeroDrawData_21301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiveHeroDrawData_21301)e.getUnfinishedMessage();
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

   public static final class S2C_GiveHeroDrawData_21302 extends GeneratedMessageV3 implements S2C_GiveHeroDrawData_21302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTTOTALONLINETIME_FIELD_NUMBER = 1;
      private long actTotalOnlineTime_;
      public static final int TENDRAWUSEIDS_FIELD_NUMBER = 2;
      private Internal.IntList tenDrawUseIds_;
      private byte memoizedIsInitialized;
      private static final S2C_GiveHeroDrawData_21302 DEFAULT_INSTANCE = new S2C_GiveHeroDrawData_21302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiveHeroDrawData_21302> PARSER = new AbstractParser<S2C_GiveHeroDrawData_21302>() {
         public S2C_GiveHeroDrawData_21302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiveHeroDrawData_21302(input, extensionRegistry);
         }
      };

      private S2C_GiveHeroDrawData_21302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiveHeroDrawData_21302() {
         this.memoizedIsInitialized = -1;
         this.tenDrawUseIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiveHeroDrawData_21302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiveHeroDrawData_21302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.actTotalOnlineTime_ = input.readInt64();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.tenDrawUseIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.tenDrawUseIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiveHeroDrawData_21302.class, Builder.class);
      }

      public boolean hasActTotalOnlineTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getActTotalOnlineTime() {
         return this.actTotalOnlineTime_;
      }

      public List<Integer> getTenDrawUseIdsList() {
         return this.tenDrawUseIds_;
      }

      public int getTenDrawUseIdsCount() {
         return this.tenDrawUseIds_.size();
      }

      public int getTenDrawUseIds(int index) {
         return this.tenDrawUseIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActTotalOnlineTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.actTotalOnlineTime_);
         }

         for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
            output.writeInt32(2, this.tenDrawUseIds_.getInt(i));
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
               size += CodedOutputStream.computeInt64Size(1, this.actTotalOnlineTime_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tenDrawUseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTenDrawUseIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiveHeroDrawData_21302)) {
            return super.equals(obj);
         } else {
            S2C_GiveHeroDrawData_21302 other = (S2C_GiveHeroDrawData_21302)obj;
            if (this.hasActTotalOnlineTime() != other.hasActTotalOnlineTime()) {
               return false;
            } else if (this.hasActTotalOnlineTime() && this.getActTotalOnlineTime() != other.getActTotalOnlineTime()) {
               return false;
            } else if (!this.getTenDrawUseIdsList().equals(other.getTenDrawUseIdsList())) {
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
            if (this.hasActTotalOnlineTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getActTotalOnlineTime());
            }

            if (this.getTenDrawUseIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTenDrawUseIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveHeroDrawData_21302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(InputStream input) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiveHeroDrawData_21302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiveHeroDrawData_21302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiveHeroDrawData_21302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveHeroDrawData_21302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiveHeroDrawData_21302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiveHeroDrawData_21302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiveHeroDrawData_21302> parser() {
         return PARSER;
      }

      public Parser<S2C_GiveHeroDrawData_21302> getParserForType() {
         return PARSER;
      }

      public S2C_GiveHeroDrawData_21302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiveHeroDrawData_21302OrBuilder {
         private int bitField0_;
         private long actTotalOnlineTime_;
         private Internal.IntList tenDrawUseIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiveHeroDrawData_21302.class, Builder.class);
         }

         private Builder() {
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.actTotalOnlineTime_ = 0L;
            this.bitField0_ &= -2;
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_GiveHeroDrawData_21302_descriptor;
         }

         public S2C_GiveHeroDrawData_21302 getDefaultInstanceForType() {
            return GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.getDefaultInstance();
         }

         public S2C_GiveHeroDrawData_21302 build() {
            S2C_GiveHeroDrawData_21302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiveHeroDrawData_21302 buildPartial() {
            S2C_GiveHeroDrawData_21302 result = new S2C_GiveHeroDrawData_21302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.actTotalOnlineTime_ = this.actTotalOnlineTime_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.tenDrawUseIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.tenDrawUseIds_ = this.tenDrawUseIds_;
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
            if (other instanceof S2C_GiveHeroDrawData_21302) {
               return this.mergeFrom((S2C_GiveHeroDrawData_21302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiveHeroDrawData_21302 other) {
            if (other == GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActTotalOnlineTime()) {
                  this.setActTotalOnlineTime(other.getActTotalOnlineTime());
               }

               if (!other.tenDrawUseIds_.isEmpty()) {
                  if (this.tenDrawUseIds_.isEmpty()) {
                     this.tenDrawUseIds_ = other.tenDrawUseIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTenDrawUseIdsIsMutable();
                     this.tenDrawUseIds_.addAll(other.tenDrawUseIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActTotalOnlineTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiveHeroDrawData_21302 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiveHeroDrawData_21302)GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiveHeroDrawData_21302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActTotalOnlineTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getActTotalOnlineTime() {
            return this.actTotalOnlineTime_;
         }

         public Builder setActTotalOnlineTime(long value) {
            this.bitField0_ |= 1;
            this.actTotalOnlineTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActTotalOnlineTime() {
            this.bitField0_ &= -2;
            this.actTotalOnlineTime_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureTenDrawUseIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.mutableCopy(this.tenDrawUseIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTenDrawUseIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.tenDrawUseIds_) : this.tenDrawUseIds_);
         }

         public int getTenDrawUseIdsCount() {
            return this.tenDrawUseIds_.size();
         }

         public int getTenDrawUseIds(int index) {
            return this.tenDrawUseIds_.getInt(index);
         }

         public Builder setTenDrawUseIds(int index, int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTenDrawUseIds(int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTenDrawUseIds(Iterable<? extends Integer> values) {
            this.ensureTenDrawUseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tenDrawUseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTenDrawUseIds() {
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_GiveHeroDrawData_21302.emptyIntList();
            this.bitField0_ &= -3;
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

   public static final class C2S_TenDraw_21303 extends GeneratedMessageV3 implements C2S_TenDraw_21303OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TenDraw_21303 DEFAULT_INSTANCE = new C2S_TenDraw_21303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TenDraw_21303> PARSER = new AbstractParser<C2S_TenDraw_21303>() {
         public C2S_TenDraw_21303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TenDraw_21303(input, extensionRegistry);
         }
      };

      private C2S_TenDraw_21303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TenDraw_21303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TenDraw_21303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TenDraw_21303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TenDraw_21303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TenDraw_21303)) {
            return super.equals(obj);
         } else {
            C2S_TenDraw_21303 other = (C2S_TenDraw_21303)obj;
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

      public static C2S_TenDraw_21303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21303 parseFrom(InputStream input) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TenDraw_21303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TenDraw_21303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TenDraw_21303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TenDraw_21303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TenDraw_21303> parser() {
         return PARSER;
      }

      public Parser<C2S_TenDraw_21303> getParserForType() {
         return PARSER;
      }

      public C2S_TenDraw_21303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TenDraw_21303OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TenDraw_21303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiveHeroDrawMsg.C2S_TenDraw_21303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_C2S_TenDraw_21303_descriptor;
         }

         public C2S_TenDraw_21303 getDefaultInstanceForType() {
            return GiveHeroDrawMsg.C2S_TenDraw_21303.getDefaultInstance();
         }

         public C2S_TenDraw_21303 build() {
            C2S_TenDraw_21303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TenDraw_21303 buildPartial() {
            C2S_TenDraw_21303 result = new C2S_TenDraw_21303(this);
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
            if (other instanceof C2S_TenDraw_21303) {
               return this.mergeFrom((C2S_TenDraw_21303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TenDraw_21303 other) {
            if (other == GiveHeroDrawMsg.C2S_TenDraw_21303.getDefaultInstance()) {
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
            C2S_TenDraw_21303 parsedMessage = null;

            try {
               parsedMessage = (C2S_TenDraw_21303)GiveHeroDrawMsg.C2S_TenDraw_21303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TenDraw_21303)e.getUnfinishedMessage();
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

   public static final class S2C_TenDraw_21304 extends GeneratedMessageV3 implements S2C_TenDraw_21304OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TENDRAWUSEIDS_FIELD_NUMBER = 1;
      private Internal.IntList tenDrawUseIds_;
      public static final int HEROINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> heroInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_TenDraw_21304 DEFAULT_INSTANCE = new S2C_TenDraw_21304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TenDraw_21304> PARSER = new AbstractParser<S2C_TenDraw_21304>() {
         public S2C_TenDraw_21304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TenDraw_21304(input, extensionRegistry);
         }
      };

      private S2C_TenDraw_21304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TenDraw_21304() {
         this.memoizedIsInitialized = -1;
         this.tenDrawUseIds_ = emptyIntList();
         this.heroInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TenDraw_21304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TenDraw_21304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tenDrawUseIds_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroInfo_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.tenDrawUseIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.tenDrawUseIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.heroInfo_ = Collections.unmodifiableList(this.heroInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TenDraw_21304.class, Builder.class);
      }

      public List<Integer> getTenDrawUseIdsList() {
         return this.tenDrawUseIds_;
      }

      public int getTenDrawUseIdsCount() {
         return this.tenDrawUseIds_.size();
      }

      public int getTenDrawUseIds(int index) {
         return this.tenDrawUseIds_.getInt(index);
      }

      public List<CommonMsg.ItemInfo> getHeroInfoList() {
         return this.heroInfo_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getHeroInfoOrBuilderList() {
         return this.heroInfo_;
      }

      public int getHeroInfoCount() {
         return this.heroInfo_.size();
      }

      public CommonMsg.ItemInfo getHeroInfo(int index) {
         return (CommonMsg.ItemInfo)this.heroInfo_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getHeroInfoOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.heroInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getHeroInfoCount(); ++i) {
               if (!this.getHeroInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
            output.writeInt32(1, this.tenDrawUseIds_.getInt(i));
         }

         for(int i = 0; i < this.heroInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.heroInfo_.get(i));
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

            for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tenDrawUseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTenDrawUseIdsList().size();

            for(int i = 0; i < this.heroInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.heroInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TenDraw_21304)) {
            return super.equals(obj);
         } else {
            S2C_TenDraw_21304 other = (S2C_TenDraw_21304)obj;
            if (!this.getTenDrawUseIdsList().equals(other.getTenDrawUseIdsList())) {
               return false;
            } else if (!this.getHeroInfoList().equals(other.getHeroInfoList())) {
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
            if (this.getTenDrawUseIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTenDrawUseIdsList().hashCode();
            }

            if (this.getHeroInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TenDraw_21304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21304 parseFrom(InputStream input) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TenDraw_21304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TenDraw_21304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TenDraw_21304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TenDraw_21304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TenDraw_21304> parser() {
         return PARSER;
      }

      public Parser<S2C_TenDraw_21304> getParserForType() {
         return PARSER;
      }

      public S2C_TenDraw_21304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TenDraw_21304OrBuilder {
         private int bitField0_;
         private Internal.IntList tenDrawUseIds_;
         private List<CommonMsg.ItemInfo> heroInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TenDraw_21304.class, Builder.class);
         }

         private Builder() {
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_TenDraw_21304.emptyIntList();
            this.heroInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_TenDraw_21304.emptyIntList();
            this.heroInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiveHeroDrawMsg.S2C_TenDraw_21304.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_TenDraw_21304.emptyIntList();
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.heroInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiveHeroDrawMsg.internal_static_giveHeroDraw_com_gzbz_protobuf_S2C_TenDraw_21304_descriptor;
         }

         public S2C_TenDraw_21304 getDefaultInstanceForType() {
            return GiveHeroDrawMsg.S2C_TenDraw_21304.getDefaultInstance();
         }

         public S2C_TenDraw_21304 build() {
            S2C_TenDraw_21304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TenDraw_21304 buildPartial() {
            S2C_TenDraw_21304 result = new S2C_TenDraw_21304(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.tenDrawUseIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.tenDrawUseIds_ = this.tenDrawUseIds_;
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.heroInfo_ = Collections.unmodifiableList(this.heroInfo_);
                  this.bitField0_ &= -3;
               }

               result.heroInfo_ = this.heroInfo_;
            } else {
               result.heroInfo_ = this.heroInfoBuilder_.build();
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
            if (other instanceof S2C_TenDraw_21304) {
               return this.mergeFrom((S2C_TenDraw_21304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TenDraw_21304 other) {
            if (other == GiveHeroDrawMsg.S2C_TenDraw_21304.getDefaultInstance()) {
               return this;
            } else {
               if (!other.tenDrawUseIds_.isEmpty()) {
                  if (this.tenDrawUseIds_.isEmpty()) {
                     this.tenDrawUseIds_ = other.tenDrawUseIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTenDrawUseIdsIsMutable();
                     this.tenDrawUseIds_.addAll(other.tenDrawUseIds_);
                  }

                  this.onChanged();
               }

               if (this.heroInfoBuilder_ == null) {
                  if (!other.heroInfo_.isEmpty()) {
                     if (this.heroInfo_.isEmpty()) {
                        this.heroInfo_ = other.heroInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureHeroInfoIsMutable();
                        this.heroInfo_.addAll(other.heroInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroInfo_.isEmpty()) {
                  if (this.heroInfoBuilder_.isEmpty()) {
                     this.heroInfoBuilder_.dispose();
                     this.heroInfoBuilder_ = null;
                     this.heroInfo_ = other.heroInfo_;
                     this.bitField0_ &= -3;
                     this.heroInfoBuilder_ = GiveHeroDrawMsg.S2C_TenDraw_21304.alwaysUseFieldBuilders ? this.getHeroInfoFieldBuilder() : null;
                  } else {
                     this.heroInfoBuilder_.addAllMessages(other.heroInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getHeroInfoCount(); ++i) {
               if (!this.getHeroInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TenDraw_21304 parsedMessage = null;

            try {
               parsedMessage = (S2C_TenDraw_21304)GiveHeroDrawMsg.S2C_TenDraw_21304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TenDraw_21304)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTenDrawUseIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_TenDraw_21304.mutableCopy(this.tenDrawUseIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTenDrawUseIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.tenDrawUseIds_) : this.tenDrawUseIds_);
         }

         public int getTenDrawUseIdsCount() {
            return this.tenDrawUseIds_.size();
         }

         public int getTenDrawUseIds(int index) {
            return this.tenDrawUseIds_.getInt(index);
         }

         public Builder setTenDrawUseIds(int index, int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTenDrawUseIds(int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTenDrawUseIds(Iterable<? extends Integer> values) {
            this.ensureTenDrawUseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tenDrawUseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTenDrawUseIds() {
            this.tenDrawUseIds_ = GiveHeroDrawMsg.S2C_TenDraw_21304.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureHeroInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroInfo_ = new ArrayList(this.heroInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getHeroInfoList() {
            return this.heroInfoBuilder_ == null ? Collections.unmodifiableList(this.heroInfo_) : this.heroInfoBuilder_.getMessageList();
         }

         public int getHeroInfoCount() {
            return this.heroInfoBuilder_ == null ? this.heroInfo_.size() : this.heroInfoBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getHeroInfo(int index) {
            return this.heroInfoBuilder_ == null ? (CommonMsg.ItemInfo)this.heroInfo_.get(index) : (CommonMsg.ItemInfo)this.heroInfoBuilder_.getMessage(index);
         }

         public Builder setHeroInfo(int index, CommonMsg.ItemInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfoIsMutable();
               this.heroInfo_.set(index, value);
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.ensureHeroInfoIsMutable();
               this.heroInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfo(CommonMsg.ItemInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfoIsMutable();
               this.heroInfo_.add(value);
               this.onChanged();
            } else {
               this.heroInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroInfo(int index, CommonMsg.ItemInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfoIsMutable();
               this.heroInfo_.add(index, value);
               this.onChanged();
            } else {
               this.heroInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroInfo(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.ensureHeroInfoIsMutable();
               this.heroInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.ensureHeroInfoIsMutable();
               this.heroInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroInfo(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.heroInfoBuilder_ == null) {
               this.ensureHeroInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroInfo_);
               this.onChanged();
            } else {
               this.heroInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroInfo(int index) {
            if (this.heroInfoBuilder_ == null) {
               this.ensureHeroInfoIsMutable();
               this.heroInfo_.remove(index);
               this.onChanged();
            } else {
               this.heroInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getHeroInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getHeroInfoOrBuilder(int index) {
            return this.heroInfoBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.heroInfo_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getHeroInfoOrBuilderList() {
            return this.heroInfoBuilder_ != null ? this.heroInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroInfo_);
         }

         public CommonMsg.ItemInfo.Builder addHeroInfoBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getHeroInfoFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addHeroInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getHeroInfoFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getHeroInfoBuilderList() {
            return this.getHeroInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new RepeatedFieldBuilderV3(this.heroInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_GiveHeroDrawData_21301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TenDraw_21303OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GiveHeroDrawData_21302OrBuilder extends MessageOrBuilder {
      boolean hasActTotalOnlineTime();

      long getActTotalOnlineTime();

      List<Integer> getTenDrawUseIdsList();

      int getTenDrawUseIdsCount();

      int getTenDrawUseIds(int index);
   }

   public interface S2C_TenDraw_21304OrBuilder extends MessageOrBuilder {
      List<Integer> getTenDrawUseIdsList();

      int getTenDrawUseIdsCount();

      int getTenDrawUseIds(int index);

      List<CommonMsg.ItemInfo> getHeroInfoList();

      CommonMsg.ItemInfo getHeroInfo(int index);

      int getHeroInfoCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getHeroInfoOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getHeroInfoOrBuilder(int index);
   }
}
