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

public final class KrActHeroImproveMsg {
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private KrActHeroImproveMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016KrActHeroImprove.proto\u0012\"KrActHeroImprove.com.gzbz.protobuf\"\u0018\n\u0016C2S_ActivityInfo_24301\" \u0001\n\u0016S2C_ActivityInfo_24302\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fselectHeroId\u0018\u0002 \u0002(\u0005\u0012\u0018\n\u0010hasSelectHeroIds\u0018\u0003 \u0003(\u0005\u0012\u0016\n\u000erecStarRewards\u0018\u0004 \u0003(\u0005\u0012\u0018\n\u0010canSelectHeroIds\u0018\u0005 \u0003(\u0005\u0012\u0013\n\u000bheroMaxStar\u0018\u0006 \u0002(\u0005\"&\n\u0014C2S_ChooseHero_24303\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_ChooseHero_24304\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\"/\n\u001bC2S_RecHeroStarReward_24305\u0012\u0010\n\bheroStar\u0018\u0001 \u0002(\u0005\"5\n\u001bS2C_RecHeroStarReward_24306\u0012\u0016\n\u000erecStarRewards\u0018\u0001 \u0003(\u0005B*\n\u0011com.gzbz.protobufB\u0013KrActHeroImproveMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor, new String[0]);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor, new String[]{"OpenDay", "SelectHeroId", "HasSelectHeroIds", "RecStarRewards", "CanSelectHeroIds", "HeroMaxStar"});
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor, new String[]{"HeroId"});
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor, new String[]{"HeroId"});
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor, new String[]{"HeroStar"});
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor, new String[]{"RecStarRewards"});
   }

   public static final class C2S_ActivityInfo_24301 extends GeneratedMessageV3 implements C2S_ActivityInfo_24301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_24301 DEFAULT_INSTANCE = new C2S_ActivityInfo_24301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_24301> PARSER = new AbstractParser<C2S_ActivityInfo_24301>() {
         public C2S_ActivityInfo_24301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_24301(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_24301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_24301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_24301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_24301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_24301)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_24301 other = (C2S_ActivityInfo_24301)obj;
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

      public static C2S_ActivityInfo_24301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24301 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_24301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_24301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_24301> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_24301> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_24301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_24301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.C2S_ActivityInfo_24301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ActivityInfo_24301_descriptor;
         }

         public C2S_ActivityInfo_24301 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.C2S_ActivityInfo_24301.getDefaultInstance();
         }

         public C2S_ActivityInfo_24301 build() {
            C2S_ActivityInfo_24301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_24301 buildPartial() {
            C2S_ActivityInfo_24301 result = new C2S_ActivityInfo_24301(this);
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
            if (other instanceof C2S_ActivityInfo_24301) {
               return this.mergeFrom((C2S_ActivityInfo_24301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_24301 other) {
            if (other == KrActHeroImproveMsg.C2S_ActivityInfo_24301.getDefaultInstance()) {
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
            C2S_ActivityInfo_24301 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_24301)KrActHeroImproveMsg.C2S_ActivityInfo_24301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_24301)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_24302 extends GeneratedMessageV3 implements S2C_ActivityInfo_24302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int SELECTHEROID_FIELD_NUMBER = 2;
      private int selectHeroId_;
      public static final int HASSELECTHEROIDS_FIELD_NUMBER = 3;
      private Internal.IntList hasSelectHeroIds_;
      public static final int RECSTARREWARDS_FIELD_NUMBER = 4;
      private Internal.IntList recStarRewards_;
      public static final int CANSELECTHEROIDS_FIELD_NUMBER = 5;
      private Internal.IntList canSelectHeroIds_;
      public static final int HEROMAXSTAR_FIELD_NUMBER = 6;
      private int heroMaxStar_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_24302 DEFAULT_INSTANCE = new S2C_ActivityInfo_24302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_24302> PARSER = new AbstractParser<S2C_ActivityInfo_24302>() {
         public S2C_ActivityInfo_24302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_24302(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_24302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_24302() {
         this.memoizedIsInitialized = -1;
         this.hasSelectHeroIds_ = emptyIntList();
         this.recStarRewards_ = emptyIntList();
         this.canSelectHeroIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_24302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_24302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openDay_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.selectHeroId_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hasSelectHeroIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hasSelectHeroIds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hasSelectHeroIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.recStarRewards_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.recStarRewards_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recStarRewards_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recStarRewards_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.canSelectHeroIds_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.canSelectHeroIds_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.canSelectHeroIds_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.canSelectHeroIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.heroMaxStar_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.hasSelectHeroIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.hasSelectHeroIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.recStarRewards_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.canSelectHeroIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24302.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasSelectHeroId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSelectHeroId() {
         return this.selectHeroId_;
      }

      public List<Integer> getHasSelectHeroIdsList() {
         return this.hasSelectHeroIds_;
      }

      public int getHasSelectHeroIdsCount() {
         return this.hasSelectHeroIds_.size();
      }

      public int getHasSelectHeroIds(int index) {
         return this.hasSelectHeroIds_.getInt(index);
      }

      public List<Integer> getRecStarRewardsList() {
         return this.recStarRewards_;
      }

      public int getRecStarRewardsCount() {
         return this.recStarRewards_.size();
      }

      public int getRecStarRewards(int index) {
         return this.recStarRewards_.getInt(index);
      }

      public List<Integer> getCanSelectHeroIdsList() {
         return this.canSelectHeroIds_;
      }

      public int getCanSelectHeroIdsCount() {
         return this.canSelectHeroIds_.size();
      }

      public int getCanSelectHeroIds(int index) {
         return this.canSelectHeroIds_.getInt(index);
      }

      public boolean hasHeroMaxStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroMaxStar() {
         return this.heroMaxStar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSelectHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroMaxStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.openDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.selectHeroId_);
         }

         for(int i = 0; i < this.hasSelectHeroIds_.size(); ++i) {
            output.writeInt32(3, this.hasSelectHeroIds_.getInt(i));
         }

         for(int i = 0; i < this.recStarRewards_.size(); ++i) {
            output.writeInt32(4, this.recStarRewards_.getInt(i));
         }

         for(int i = 0; i < this.canSelectHeroIds_.size(); ++i) {
            output.writeInt32(5, this.canSelectHeroIds_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.heroMaxStar_);
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
               size += CodedOutputStream.computeInt32Size(1, this.openDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.selectHeroId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.hasSelectHeroIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hasSelectHeroIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHasSelectHeroIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.recStarRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recStarRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecStarRewardsList().size();
            dataSize = 0;

            for(int i = 0; i < this.canSelectHeroIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.canSelectHeroIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCanSelectHeroIdsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.heroMaxStar_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_24302)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_24302 other = (S2C_ActivityInfo_24302)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasSelectHeroId() != other.hasSelectHeroId()) {
               return false;
            } else if (this.hasSelectHeroId() && this.getSelectHeroId() != other.getSelectHeroId()) {
               return false;
            } else if (!this.getHasSelectHeroIdsList().equals(other.getHasSelectHeroIdsList())) {
               return false;
            } else if (!this.getRecStarRewardsList().equals(other.getRecStarRewardsList())) {
               return false;
            } else if (!this.getCanSelectHeroIdsList().equals(other.getCanSelectHeroIdsList())) {
               return false;
            } else if (this.hasHeroMaxStar() != other.hasHeroMaxStar()) {
               return false;
            } else if (this.hasHeroMaxStar() && this.getHeroMaxStar() != other.getHeroMaxStar()) {
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
            if (this.hasOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.hasSelectHeroId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSelectHeroId();
            }

            if (this.getHasSelectHeroIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHasSelectHeroIdsList().hashCode();
            }

            if (this.getRecStarRewardsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecStarRewardsList().hashCode();
            }

            if (this.getCanSelectHeroIdsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCanSelectHeroIdsList().hashCode();
            }

            if (this.hasHeroMaxStar()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroMaxStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_24302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24302 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_24302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_24302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_24302> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_24302> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_24302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_24302OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int selectHeroId_;
         private Internal.IntList hasSelectHeroIds_;
         private Internal.IntList recStarRewards_;
         private Internal.IntList canSelectHeroIds_;
         private int heroMaxStar_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24302.class, Builder.class);
         }

         private Builder() {
            this.hasSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.canSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hasSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.canSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.S2C_ActivityInfo_24302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.selectHeroId_ = 0;
            this.bitField0_ &= -3;
            this.hasSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -5;
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -9;
            this.canSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -17;
            this.heroMaxStar_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ActivityInfo_24302_descriptor;
         }

         public S2C_ActivityInfo_24302 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.S2C_ActivityInfo_24302.getDefaultInstance();
         }

         public S2C_ActivityInfo_24302 build() {
            S2C_ActivityInfo_24302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_24302 buildPartial() {
            S2C_ActivityInfo_24302 result = new S2C_ActivityInfo_24302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.selectHeroId_ = this.selectHeroId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.hasSelectHeroIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.hasSelectHeroIds_ = this.hasSelectHeroIds_;
            if ((this.bitField0_ & 8) != 0) {
               this.recStarRewards_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.recStarRewards_ = this.recStarRewards_;
            if ((this.bitField0_ & 16) != 0) {
               this.canSelectHeroIds_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.canSelectHeroIds_ = this.canSelectHeroIds_;
            if ((from_bitField0_ & 32) != 0) {
               result.heroMaxStar_ = this.heroMaxStar_;
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
            if (other instanceof S2C_ActivityInfo_24302) {
               return this.mergeFrom((S2C_ActivityInfo_24302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_24302 other) {
            if (other == KrActHeroImproveMsg.S2C_ActivityInfo_24302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasSelectHeroId()) {
                  this.setSelectHeroId(other.getSelectHeroId());
               }

               if (!other.hasSelectHeroIds_.isEmpty()) {
                  if (this.hasSelectHeroIds_.isEmpty()) {
                     this.hasSelectHeroIds_ = other.hasSelectHeroIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureHasSelectHeroIdsIsMutable();
                     this.hasSelectHeroIds_.addAll(other.hasSelectHeroIds_);
                  }

                  this.onChanged();
               }

               if (!other.recStarRewards_.isEmpty()) {
                  if (this.recStarRewards_.isEmpty()) {
                     this.recStarRewards_ = other.recStarRewards_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureRecStarRewardsIsMutable();
                     this.recStarRewards_.addAll(other.recStarRewards_);
                  }

                  this.onChanged();
               }

               if (!other.canSelectHeroIds_.isEmpty()) {
                  if (this.canSelectHeroIds_.isEmpty()) {
                     this.canSelectHeroIds_ = other.canSelectHeroIds_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureCanSelectHeroIdsIsMutable();
                     this.canSelectHeroIds_.addAll(other.canSelectHeroIds_);
                  }

                  this.onChanged();
               }

               if (other.hasHeroMaxStar()) {
                  this.setHeroMaxStar(other.getHeroMaxStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenDay()) {
               return false;
            } else if (!this.hasSelectHeroId()) {
               return false;
            } else {
               return this.hasHeroMaxStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_24302 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_24302)KrActHeroImproveMsg.S2C_ActivityInfo_24302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_24302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 1;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -2;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSelectHeroId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSelectHeroId() {
            return this.selectHeroId_;
         }

         public Builder setSelectHeroId(int value) {
            this.bitField0_ |= 2;
            this.selectHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSelectHeroId() {
            this.bitField0_ &= -3;
            this.selectHeroId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHasSelectHeroIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.mutableCopy(this.hasSelectHeroIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getHasSelectHeroIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.hasSelectHeroIds_) : this.hasSelectHeroIds_);
         }

         public int getHasSelectHeroIdsCount() {
            return this.hasSelectHeroIds_.size();
         }

         public int getHasSelectHeroIds(int index) {
            return this.hasSelectHeroIds_.getInt(index);
         }

         public Builder setHasSelectHeroIds(int index, int value) {
            this.ensureHasSelectHeroIdsIsMutable();
            this.hasSelectHeroIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHasSelectHeroIds(int value) {
            this.ensureHasSelectHeroIdsIsMutable();
            this.hasSelectHeroIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHasSelectHeroIds(Iterable<? extends Integer> values) {
            this.ensureHasSelectHeroIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hasSelectHeroIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHasSelectHeroIds() {
            this.hasSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureRecStarRewardsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.recStarRewards_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.mutableCopy(this.recStarRewards_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getRecStarRewardsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.recStarRewards_) : this.recStarRewards_);
         }

         public int getRecStarRewardsCount() {
            return this.recStarRewards_.size();
         }

         public int getRecStarRewards(int index) {
            return this.recStarRewards_.getInt(index);
         }

         public Builder setRecStarRewards(int index, int value) {
            this.ensureRecStarRewardsIsMutable();
            this.recStarRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecStarRewards(int value) {
            this.ensureRecStarRewardsIsMutable();
            this.recStarRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecStarRewards(Iterable<? extends Integer> values) {
            this.ensureRecStarRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recStarRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearRecStarRewards() {
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureCanSelectHeroIdsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.canSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.mutableCopy(this.canSelectHeroIds_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getCanSelectHeroIdsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.canSelectHeroIds_) : this.canSelectHeroIds_);
         }

         public int getCanSelectHeroIdsCount() {
            return this.canSelectHeroIds_.size();
         }

         public int getCanSelectHeroIds(int index) {
            return this.canSelectHeroIds_.getInt(index);
         }

         public Builder setCanSelectHeroIds(int index, int value) {
            this.ensureCanSelectHeroIdsIsMutable();
            this.canSelectHeroIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCanSelectHeroIds(int value) {
            this.ensureCanSelectHeroIdsIsMutable();
            this.canSelectHeroIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCanSelectHeroIds(Iterable<? extends Integer> values) {
            this.ensureCanSelectHeroIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.canSelectHeroIds_);
            this.onChanged();
            return this;
         }

         public Builder clearCanSelectHeroIds() {
            this.canSelectHeroIds_ = KrActHeroImproveMsg.S2C_ActivityInfo_24302.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasHeroMaxStar() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeroMaxStar() {
            return this.heroMaxStar_;
         }

         public Builder setHeroMaxStar(int value) {
            this.bitField0_ |= 32;
            this.heroMaxStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroMaxStar() {
            this.bitField0_ &= -33;
            this.heroMaxStar_ = 0;
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

   public static final class C2S_ChooseHero_24303 extends GeneratedMessageV3 implements C2S_ChooseHero_24303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChooseHero_24303 DEFAULT_INSTANCE = new C2S_ChooseHero_24303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChooseHero_24303> PARSER = new AbstractParser<C2S_ChooseHero_24303>() {
         public C2S_ChooseHero_24303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChooseHero_24303(input, extensionRegistry);
         }
      };

      private C2S_ChooseHero_24303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChooseHero_24303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChooseHero_24303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChooseHero_24303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChooseHero_24303.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChooseHero_24303)) {
            return super.equals(obj);
         } else {
            C2S_ChooseHero_24303 other = (C2S_ChooseHero_24303)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChooseHero_24303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data);
      }

      public static C2S_ChooseHero_24303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChooseHero_24303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data);
      }

      public static C2S_ChooseHero_24303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChooseHero_24303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data);
      }

      public static C2S_ChooseHero_24303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChooseHero_24303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChooseHero_24303 parseFrom(InputStream input) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChooseHero_24303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChooseHero_24303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChooseHero_24303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChooseHero_24303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChooseHero_24303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChooseHero_24303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChooseHero_24303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChooseHero_24303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChooseHero_24303> parser() {
         return PARSER;
      }

      public Parser<C2S_ChooseHero_24303> getParserForType() {
         return PARSER;
      }

      public C2S_ChooseHero_24303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChooseHero_24303OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChooseHero_24303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.C2S_ChooseHero_24303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_ChooseHero_24303_descriptor;
         }

         public C2S_ChooseHero_24303 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.C2S_ChooseHero_24303.getDefaultInstance();
         }

         public C2S_ChooseHero_24303 build() {
            C2S_ChooseHero_24303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChooseHero_24303 buildPartial() {
            C2S_ChooseHero_24303 result = new C2S_ChooseHero_24303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof C2S_ChooseHero_24303) {
               return this.mergeFrom((C2S_ChooseHero_24303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChooseHero_24303 other) {
            if (other == KrActHeroImproveMsg.C2S_ChooseHero_24303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChooseHero_24303 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChooseHero_24303)KrActHeroImproveMsg.C2S_ChooseHero_24303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChooseHero_24303)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ChooseHero_24304 extends GeneratedMessageV3 implements S2C_ChooseHero_24304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final S2C_ChooseHero_24304 DEFAULT_INSTANCE = new S2C_ChooseHero_24304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChooseHero_24304> PARSER = new AbstractParser<S2C_ChooseHero_24304>() {
         public S2C_ChooseHero_24304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChooseHero_24304(input, extensionRegistry);
         }
      };

      private S2C_ChooseHero_24304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChooseHero_24304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChooseHero_24304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChooseHero_24304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChooseHero_24304.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChooseHero_24304)) {
            return super.equals(obj);
         } else {
            S2C_ChooseHero_24304 other = (S2C_ChooseHero_24304)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChooseHero_24304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data);
      }

      public static S2C_ChooseHero_24304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChooseHero_24304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data);
      }

      public static S2C_ChooseHero_24304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChooseHero_24304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data);
      }

      public static S2C_ChooseHero_24304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChooseHero_24304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChooseHero_24304 parseFrom(InputStream input) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChooseHero_24304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChooseHero_24304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChooseHero_24304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChooseHero_24304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChooseHero_24304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChooseHero_24304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChooseHero_24304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChooseHero_24304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChooseHero_24304> parser() {
         return PARSER;
      }

      public Parser<S2C_ChooseHero_24304> getParserForType() {
         return PARSER;
      }

      public S2C_ChooseHero_24304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChooseHero_24304OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChooseHero_24304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.S2C_ChooseHero_24304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_ChooseHero_24304_descriptor;
         }

         public S2C_ChooseHero_24304 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.S2C_ChooseHero_24304.getDefaultInstance();
         }

         public S2C_ChooseHero_24304 build() {
            S2C_ChooseHero_24304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChooseHero_24304 buildPartial() {
            S2C_ChooseHero_24304 result = new S2C_ChooseHero_24304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof S2C_ChooseHero_24304) {
               return this.mergeFrom((S2C_ChooseHero_24304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChooseHero_24304 other) {
            if (other == KrActHeroImproveMsg.S2C_ChooseHero_24304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChooseHero_24304 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChooseHero_24304)KrActHeroImproveMsg.S2C_ChooseHero_24304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChooseHero_24304)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecHeroStarReward_24305 extends GeneratedMessageV3 implements C2S_RecHeroStarReward_24305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROSTAR_FIELD_NUMBER = 1;
      private int heroStar_;
      private byte memoizedIsInitialized;
      private static final C2S_RecHeroStarReward_24305 DEFAULT_INSTANCE = new C2S_RecHeroStarReward_24305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecHeroStarReward_24305> PARSER = new AbstractParser<C2S_RecHeroStarReward_24305>() {
         public C2S_RecHeroStarReward_24305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecHeroStarReward_24305(input, extensionRegistry);
         }
      };

      private C2S_RecHeroStarReward_24305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecHeroStarReward_24305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecHeroStarReward_24305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecHeroStarReward_24305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroStar_ = input.readInt32();
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
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecHeroStarReward_24305.class, Builder.class);
      }

      public boolean hasHeroStar() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroStar() {
         return this.heroStar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroStar_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroStar_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecHeroStarReward_24305)) {
            return super.equals(obj);
         } else {
            C2S_RecHeroStarReward_24305 other = (C2S_RecHeroStarReward_24305)obj;
            if (this.hasHeroStar() != other.hasHeroStar()) {
               return false;
            } else if (this.hasHeroStar() && this.getHeroStar() != other.getHeroStar()) {
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
            if (this.hasHeroStar()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecHeroStarReward_24305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(InputStream input) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecHeroStarReward_24305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecHeroStarReward_24305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecHeroStarReward_24305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecHeroStarReward_24305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecHeroStarReward_24305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecHeroStarReward_24305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecHeroStarReward_24305> parser() {
         return PARSER;
      }

      public Parser<C2S_RecHeroStarReward_24305> getParserForType() {
         return PARSER;
      }

      public C2S_RecHeroStarReward_24305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecHeroStarReward_24305OrBuilder {
         private int bitField0_;
         private int heroStar_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecHeroStarReward_24305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.C2S_RecHeroStarReward_24305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroStar_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_C2S_RecHeroStarReward_24305_descriptor;
         }

         public C2S_RecHeroStarReward_24305 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.C2S_RecHeroStarReward_24305.getDefaultInstance();
         }

         public C2S_RecHeroStarReward_24305 build() {
            C2S_RecHeroStarReward_24305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecHeroStarReward_24305 buildPartial() {
            C2S_RecHeroStarReward_24305 result = new C2S_RecHeroStarReward_24305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroStar_ = this.heroStar_;
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
            if (other instanceof C2S_RecHeroStarReward_24305) {
               return this.mergeFrom((C2S_RecHeroStarReward_24305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecHeroStarReward_24305 other) {
            if (other == KrActHeroImproveMsg.C2S_RecHeroStarReward_24305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroStar()) {
                  this.setHeroStar(other.getHeroStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroStar();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecHeroStarReward_24305 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecHeroStarReward_24305)KrActHeroImproveMsg.C2S_RecHeroStarReward_24305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecHeroStarReward_24305)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroStar() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroStar() {
            return this.heroStar_;
         }

         public Builder setHeroStar(int value) {
            this.bitField0_ |= 1;
            this.heroStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroStar() {
            this.bitField0_ &= -2;
            this.heroStar_ = 0;
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

   public static final class S2C_RecHeroStarReward_24306 extends GeneratedMessageV3 implements S2C_RecHeroStarReward_24306OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECSTARREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList recStarRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_RecHeroStarReward_24306 DEFAULT_INSTANCE = new S2C_RecHeroStarReward_24306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecHeroStarReward_24306> PARSER = new AbstractParser<S2C_RecHeroStarReward_24306>() {
         public S2C_RecHeroStarReward_24306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecHeroStarReward_24306(input, extensionRegistry);
         }
      };

      private S2C_RecHeroStarReward_24306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecHeroStarReward_24306() {
         this.memoizedIsInitialized = -1;
         this.recStarRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecHeroStarReward_24306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecHeroStarReward_24306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recStarRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recStarRewards_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recStarRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recStarRewards_.addInt(input.readInt32());
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
                  this.recStarRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecHeroStarReward_24306.class, Builder.class);
      }

      public List<Integer> getRecStarRewardsList() {
         return this.recStarRewards_;
      }

      public int getRecStarRewardsCount() {
         return this.recStarRewards_.size();
      }

      public int getRecStarRewards(int index) {
         return this.recStarRewards_.getInt(index);
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
         for(int i = 0; i < this.recStarRewards_.size(); ++i) {
            output.writeInt32(1, this.recStarRewards_.getInt(i));
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

            for(int i = 0; i < this.recStarRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recStarRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecStarRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecHeroStarReward_24306)) {
            return super.equals(obj);
         } else {
            S2C_RecHeroStarReward_24306 other = (S2C_RecHeroStarReward_24306)obj;
            if (!this.getRecStarRewardsList().equals(other.getRecStarRewardsList())) {
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
            if (this.getRecStarRewardsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecStarRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecHeroStarReward_24306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(InputStream input) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecHeroStarReward_24306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecHeroStarReward_24306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecHeroStarReward_24306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecHeroStarReward_24306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecHeroStarReward_24306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecHeroStarReward_24306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecHeroStarReward_24306> parser() {
         return PARSER;
      }

      public Parser<S2C_RecHeroStarReward_24306> getParserForType() {
         return PARSER;
      }

      public S2C_RecHeroStarReward_24306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecHeroStarReward_24306OrBuilder {
         private int bitField0_;
         private Internal.IntList recStarRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecHeroStarReward_24306.class, Builder.class);
         }

         private Builder() {
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KrActHeroImproveMsg.internal_static_KrActHeroImprove_com_gzbz_protobuf_S2C_RecHeroStarReward_24306_descriptor;
         }

         public S2C_RecHeroStarReward_24306 getDefaultInstanceForType() {
            return KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.getDefaultInstance();
         }

         public S2C_RecHeroStarReward_24306 build() {
            S2C_RecHeroStarReward_24306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecHeroStarReward_24306 buildPartial() {
            S2C_RecHeroStarReward_24306 result = new S2C_RecHeroStarReward_24306(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.recStarRewards_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.recStarRewards_ = this.recStarRewards_;
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
            if (other instanceof S2C_RecHeroStarReward_24306) {
               return this.mergeFrom((S2C_RecHeroStarReward_24306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecHeroStarReward_24306 other) {
            if (other == KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recStarRewards_.isEmpty()) {
                  if (this.recStarRewards_.isEmpty()) {
                     this.recStarRewards_ = other.recStarRewards_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecStarRewardsIsMutable();
                     this.recStarRewards_.addAll(other.recStarRewards_);
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
            S2C_RecHeroStarReward_24306 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecHeroStarReward_24306)KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecHeroStarReward_24306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecStarRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recStarRewards_ = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.mutableCopy(this.recStarRewards_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRecStarRewardsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.recStarRewards_) : this.recStarRewards_);
         }

         public int getRecStarRewardsCount() {
            return this.recStarRewards_.size();
         }

         public int getRecStarRewards(int index) {
            return this.recStarRewards_.getInt(index);
         }

         public Builder setRecStarRewards(int index, int value) {
            this.ensureRecStarRewardsIsMutable();
            this.recStarRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecStarRewards(int value) {
            this.ensureRecStarRewardsIsMutable();
            this.recStarRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecStarRewards(Iterable<? extends Integer> values) {
            this.ensureRecStarRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recStarRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearRecStarRewards() {
            this.recStarRewards_ = KrActHeroImproveMsg.S2C_RecHeroStarReward_24306.emptyIntList();
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

   public interface C2S_ActivityInfo_24301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChooseHero_24303OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface C2S_RecHeroStarReward_24305OrBuilder extends MessageOrBuilder {
      boolean hasHeroStar();

      int getHeroStar();
   }

   public interface S2C_ActivityInfo_24302OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasSelectHeroId();

      int getSelectHeroId();

      List<Integer> getHasSelectHeroIdsList();

      int getHasSelectHeroIdsCount();

      int getHasSelectHeroIds(int index);

      List<Integer> getRecStarRewardsList();

      int getRecStarRewardsCount();

      int getRecStarRewards(int index);

      List<Integer> getCanSelectHeroIdsList();

      int getCanSelectHeroIdsCount();

      int getCanSelectHeroIds(int index);

      boolean hasHeroMaxStar();

      int getHeroMaxStar();
   }

   public interface S2C_ChooseHero_24304OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface S2C_RecHeroStarReward_24306OrBuilder extends MessageOrBuilder {
      List<Integer> getRecStarRewardsList();

      int getRecStarRewardsCount();

      int getRecStarRewards(int index);
   }
}
