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

public final class CrossHeroRankMsg {
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossHeroRankMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013CrossHeroRank.proto\u0012\u001fcrossHeroRank.com.gzbz.protobuf\u001a\fcommon.proto\"B\n\bHeroRank\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012&\n\u000bplayerPower\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataIL\"U\n\u0019S2CR_ServerHeroRank_14901\u00128\n\u0005infos\u0018\u0001 \u0003(\u000b2).crossHeroRank.com.gzbz.protobuf.HeroRank\"\u001b\n\u0019CR2S_ServerHeroRank_14902\"\u001b\n\u0019S2CR_HeroCompensate_14903\"\u0099\u0001\n\u0019CR2S_HeroCompensate_14904\u0012)\n\u000eheroTotalPower\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataIL\u0012&\n\u000bjobMaxPower\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataIL\u0012)\n\u000elastCompensate\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\"E\n\rCrossHeroInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\"\n\bheroInfo\u0018\u0002 \u0002(\u000b2\u0010.common.HeroInfo\"b\n\u0019S2CR_UploadHeroInfo_14905\u0012E\n\rcrossHeroInfo\u0018\u0001 \u0003(\u000b2..crossHeroRank.com.gzbz.protobuf.CrossHeroInfo\",\n\u0019S2CR_RemoveHeroInfo_14907\u0012\u000f\n\u0007heroIds\u0018\u0001 \u0003(\u0005B'\n\u0011com.gzbz.protobufB\u0010CrossHeroRankMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor, new String[]{"HeroId", "PlayerPower"});
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor, new String[]{"Infos"});
      internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor, new String[0]);
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor, new String[0]);
      internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor, new String[]{"HeroTotalPower", "JobMaxPower", "LastCompensate"});
      internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor, new String[]{"PlayerId", "HeroInfo"});
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor, new String[]{"CrossHeroInfo"});
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor, new String[]{"HeroIds"});
      CommonMsg.getDescriptor();
   }

   public static final class HeroRank extends GeneratedMessageV3 implements HeroRankOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int PLAYERPOWER_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataIL> playerPower_;
      private byte memoizedIsInitialized;
      private static final HeroRank DEFAULT_INSTANCE = new HeroRank();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroRank> PARSER = new AbstractParser<HeroRank>() {
         public HeroRank parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroRank(input, extensionRegistry);
         }
      };

      private HeroRank(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroRank() {
         this.memoizedIsInitialized = -1;
         this.playerPower_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroRank();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroRank(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerPower_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerPower_.add(input.readMessage(CommonMsg.MapDataIL.PARSER, extensionRegistry));
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
                  this.playerPower_ = Collections.unmodifiableList(this.playerPower_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroRank.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public List<CommonMsg.MapDataIL> getPlayerPowerList() {
         return this.playerPower_;
      }

      public List<? extends CommonMsg.MapDataILOrBuilder> getPlayerPowerOrBuilderList() {
         return this.playerPower_;
      }

      public int getPlayerPowerCount() {
         return this.playerPower_.size();
      }

      public CommonMsg.MapDataIL getPlayerPower(int index) {
         return (CommonMsg.MapDataIL)this.playerPower_.get(index);
      }

      public CommonMsg.MapDataILOrBuilder getPlayerPowerOrBuilder(int index) {
         return (CommonMsg.MapDataILOrBuilder)this.playerPower_.get(index);
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
            for(int i = 0; i < this.getPlayerPowerCount(); ++i) {
               if (!this.getPlayerPower(i).isInitialized()) {
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
            output.writeInt32(1, this.heroId_);
         }

         for(int i = 0; i < this.playerPower_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.playerPower_.get(i));
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

            for(int i = 0; i < this.playerPower_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.playerPower_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroRank)) {
            return super.equals(obj);
         } else {
            HeroRank other = (HeroRank)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (!this.getPlayerPowerList().equals(other.getPlayerPowerList())) {
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

            if (this.getPlayerPowerCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerPowerList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroRank parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data);
      }

      public static HeroRank parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRank parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data);
      }

      public static HeroRank parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRank parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data);
      }

      public static HeroRank parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRank parseFrom(InputStream input) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroRank parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroRank parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroRank parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroRank parseFrom(CodedInputStream input) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroRank parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRank)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroRank prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroRank getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroRank> parser() {
         return PARSER;
      }

      public Parser<HeroRank> getParserForType() {
         return PARSER;
      }

      public HeroRank getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroRankOrBuilder {
         private int bitField0_;
         private int heroId_;
         private List<CommonMsg.MapDataIL> playerPower_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> playerPowerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroRank.class, Builder.class);
         }

         private Builder() {
            this.playerPower_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerPower_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.HeroRank.alwaysUseFieldBuilders) {
               this.getPlayerPowerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            if (this.playerPowerBuilder_ == null) {
               this.playerPower_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.playerPowerBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_HeroRank_descriptor;
         }

         public HeroRank getDefaultInstanceForType() {
            return CrossHeroRankMsg.HeroRank.getDefaultInstance();
         }

         public HeroRank build() {
            HeroRank result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroRank buildPartial() {
            HeroRank result = new HeroRank(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if (this.playerPowerBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.playerPower_ = Collections.unmodifiableList(this.playerPower_);
                  this.bitField0_ &= -3;
               }

               result.playerPower_ = this.playerPower_;
            } else {
               result.playerPower_ = this.playerPowerBuilder_.build();
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
            if (other instanceof HeroRank) {
               return this.mergeFrom((HeroRank)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroRank other) {
            if (other == CrossHeroRankMsg.HeroRank.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (this.playerPowerBuilder_ == null) {
                  if (!other.playerPower_.isEmpty()) {
                     if (this.playerPower_.isEmpty()) {
                        this.playerPower_ = other.playerPower_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePlayerPowerIsMutable();
                        this.playerPower_.addAll(other.playerPower_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerPower_.isEmpty()) {
                  if (this.playerPowerBuilder_.isEmpty()) {
                     this.playerPowerBuilder_.dispose();
                     this.playerPowerBuilder_ = null;
                     this.playerPower_ = other.playerPower_;
                     this.bitField0_ &= -3;
                     this.playerPowerBuilder_ = CrossHeroRankMsg.HeroRank.alwaysUseFieldBuilders ? this.getPlayerPowerFieldBuilder() : null;
                  } else {
                     this.playerPowerBuilder_.addAllMessages(other.playerPower_);
                  }
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
               for(int i = 0; i < this.getPlayerPowerCount(); ++i) {
                  if (!this.getPlayerPower(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroRank parsedMessage = null;

            try {
               parsedMessage = (HeroRank)CrossHeroRankMsg.HeroRank.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroRank)e.getUnfinishedMessage();
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

         private void ensurePlayerPowerIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerPower_ = new ArrayList(this.playerPower_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataIL> getPlayerPowerList() {
            return this.playerPowerBuilder_ == null ? Collections.unmodifiableList(this.playerPower_) : this.playerPowerBuilder_.getMessageList();
         }

         public int getPlayerPowerCount() {
            return this.playerPowerBuilder_ == null ? this.playerPower_.size() : this.playerPowerBuilder_.getCount();
         }

         public CommonMsg.MapDataIL getPlayerPower(int index) {
            return this.playerPowerBuilder_ == null ? (CommonMsg.MapDataIL)this.playerPower_.get(index) : (CommonMsg.MapDataIL)this.playerPowerBuilder_.getMessage(index);
         }

         public Builder setPlayerPower(int index, CommonMsg.MapDataIL value) {
            if (this.playerPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerPowerIsMutable();
               this.playerPower_.set(index, value);
               this.onChanged();
            } else {
               this.playerPowerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.playerPowerBuilder_ == null) {
               this.ensurePlayerPowerIsMutable();
               this.playerPower_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerPowerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerPower(CommonMsg.MapDataIL value) {
            if (this.playerPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerPowerIsMutable();
               this.playerPower_.add(value);
               this.onChanged();
            } else {
               this.playerPowerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerPower(int index, CommonMsg.MapDataIL value) {
            if (this.playerPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerPowerIsMutable();
               this.playerPower_.add(index, value);
               this.onChanged();
            } else {
               this.playerPowerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerPower(CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.playerPowerBuilder_ == null) {
               this.ensurePlayerPowerIsMutable();
               this.playerPower_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerPowerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.playerPowerBuilder_ == null) {
               this.ensurePlayerPowerIsMutable();
               this.playerPower_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerPowerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerPower(Iterable<? extends CommonMsg.MapDataIL> values) {
            if (this.playerPowerBuilder_ == null) {
               this.ensurePlayerPowerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerPower_);
               this.onChanged();
            } else {
               this.playerPowerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerPower() {
            if (this.playerPowerBuilder_ == null) {
               this.playerPower_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.playerPowerBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerPower(int index) {
            if (this.playerPowerBuilder_ == null) {
               this.ensurePlayerPowerIsMutable();
               this.playerPower_.remove(index);
               this.onChanged();
            } else {
               this.playerPowerBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIL.Builder getPlayerPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getPlayerPowerFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataILOrBuilder getPlayerPowerOrBuilder(int index) {
            return this.playerPowerBuilder_ == null ? (CommonMsg.MapDataILOrBuilder)this.playerPower_.get(index) : (CommonMsg.MapDataILOrBuilder)this.playerPowerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataILOrBuilder> getPlayerPowerOrBuilderList() {
            return this.playerPowerBuilder_ != null ? this.playerPowerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerPower_);
         }

         public CommonMsg.MapDataIL.Builder addPlayerPowerBuilder() {
            return (CommonMsg.MapDataIL.Builder)this.getPlayerPowerFieldBuilder().addBuilder(CommonMsg.MapDataIL.getDefaultInstance());
         }

         public CommonMsg.MapDataIL.Builder addPlayerPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getPlayerPowerFieldBuilder().addBuilder(index, CommonMsg.MapDataIL.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIL.Builder> getPlayerPowerBuilderList() {
            return this.getPlayerPowerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> getPlayerPowerFieldBuilder() {
            if (this.playerPowerBuilder_ == null) {
               this.playerPowerBuilder_ = new RepeatedFieldBuilderV3(this.playerPower_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.playerPower_ = null;
            }

            return this.playerPowerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ServerHeroRank_14901 extends GeneratedMessageV3 implements S2CR_ServerHeroRank_14901OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroRank> infos_;
      private byte memoizedIsInitialized;
      private static final S2CR_ServerHeroRank_14901 DEFAULT_INSTANCE = new S2CR_ServerHeroRank_14901();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ServerHeroRank_14901> PARSER = new AbstractParser<S2CR_ServerHeroRank_14901>() {
         public S2CR_ServerHeroRank_14901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ServerHeroRank_14901(input, extensionRegistry);
         }
      };

      private S2CR_ServerHeroRank_14901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ServerHeroRank_14901() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ServerHeroRank_14901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ServerHeroRank_14901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(CrossHeroRankMsg.HeroRank.PARSER, extensionRegistry));
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
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ServerHeroRank_14901.class, Builder.class);
      }

      public List<HeroRank> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroRankOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroRank getInfos(int index) {
         return (HeroRank)this.infos_.get(index);
      }

      public HeroRankOrBuilder getInfosOrBuilder(int index) {
         return (HeroRankOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2CR_ServerHeroRank_14901)) {
            return super.equals(obj);
         } else {
            S2CR_ServerHeroRank_14901 other = (S2CR_ServerHeroRank_14901)obj;
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

      public static S2CR_ServerHeroRank_14901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerHeroRank_14901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(InputStream input) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ServerHeroRank_14901 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ServerHeroRank_14901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ServerHeroRank_14901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerHeroRank_14901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ServerHeroRank_14901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ServerHeroRank_14901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ServerHeroRank_14901> parser() {
         return PARSER;
      }

      public Parser<S2CR_ServerHeroRank_14901> getParserForType() {
         return PARSER;
      }

      public S2CR_ServerHeroRank_14901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ServerHeroRank_14901OrBuilder {
         private int bitField0_;
         private List<HeroRank> infos_;
         private RepeatedFieldBuilderV3<HeroRank, HeroRank.Builder, HeroRankOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ServerHeroRank_14901.class, Builder.class);
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
            if (CrossHeroRankMsg.S2CR_ServerHeroRank_14901.alwaysUseFieldBuilders) {
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
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_ServerHeroRank_14901_descriptor;
         }

         public S2CR_ServerHeroRank_14901 getDefaultInstanceForType() {
            return CrossHeroRankMsg.S2CR_ServerHeroRank_14901.getDefaultInstance();
         }

         public S2CR_ServerHeroRank_14901 build() {
            S2CR_ServerHeroRank_14901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ServerHeroRank_14901 buildPartial() {
            S2CR_ServerHeroRank_14901 result = new S2CR_ServerHeroRank_14901(this);
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
            if (other instanceof S2CR_ServerHeroRank_14901) {
               return this.mergeFrom((S2CR_ServerHeroRank_14901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ServerHeroRank_14901 other) {
            if (other == CrossHeroRankMsg.S2CR_ServerHeroRank_14901.getDefaultInstance()) {
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
                     this.infosBuilder_ = CrossHeroRankMsg.S2CR_ServerHeroRank_14901.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2CR_ServerHeroRank_14901 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ServerHeroRank_14901)CrossHeroRankMsg.S2CR_ServerHeroRank_14901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ServerHeroRank_14901)e.getUnfinishedMessage();
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

         public List<HeroRank> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroRank getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroRank)this.infos_.get(index) : (HeroRank)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroRank value) {
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

         public Builder setInfos(int index, HeroRank.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroRank value) {
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

         public Builder addInfos(int index, HeroRank value) {
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

         public Builder addInfos(HeroRank.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroRank.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroRank> values) {
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

         public HeroRank.Builder getInfosBuilder(int index) {
            return (HeroRank.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroRankOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroRankOrBuilder)this.infos_.get(index) : (HeroRankOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroRankOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroRank.Builder addInfosBuilder() {
            return (HeroRank.Builder)this.getInfosFieldBuilder().addBuilder(CrossHeroRankMsg.HeroRank.getDefaultInstance());
         }

         public HeroRank.Builder addInfosBuilder(int index) {
            return (HeroRank.Builder)this.getInfosFieldBuilder().addBuilder(index, CrossHeroRankMsg.HeroRank.getDefaultInstance());
         }

         public List<HeroRank.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroRank, HeroRank.Builder, HeroRankOrBuilder> getInfosFieldBuilder() {
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

   public static final class CR2S_ServerHeroRank_14902 extends GeneratedMessageV3 implements CR2S_ServerHeroRank_14902OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_ServerHeroRank_14902 DEFAULT_INSTANCE = new CR2S_ServerHeroRank_14902();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ServerHeroRank_14902> PARSER = new AbstractParser<CR2S_ServerHeroRank_14902>() {
         public CR2S_ServerHeroRank_14902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ServerHeroRank_14902(input, extensionRegistry);
         }
      };

      private CR2S_ServerHeroRank_14902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ServerHeroRank_14902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ServerHeroRank_14902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ServerHeroRank_14902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerHeroRank_14902.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_ServerHeroRank_14902)) {
            return super.equals(obj);
         } else {
            CR2S_ServerHeroRank_14902 other = (CR2S_ServerHeroRank_14902)obj;
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

      public static CR2S_ServerHeroRank_14902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerHeroRank_14902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(InputStream input) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerHeroRank_14902 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ServerHeroRank_14902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerHeroRank_14902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerHeroRank_14902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ServerHeroRank_14902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ServerHeroRank_14902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ServerHeroRank_14902> parser() {
         return PARSER;
      }

      public Parser<CR2S_ServerHeroRank_14902> getParserForType() {
         return PARSER;
      }

      public CR2S_ServerHeroRank_14902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ServerHeroRank_14902OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerHeroRank_14902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.CR2S_ServerHeroRank_14902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_ServerHeroRank_14902_descriptor;
         }

         public CR2S_ServerHeroRank_14902 getDefaultInstanceForType() {
            return CrossHeroRankMsg.CR2S_ServerHeroRank_14902.getDefaultInstance();
         }

         public CR2S_ServerHeroRank_14902 build() {
            CR2S_ServerHeroRank_14902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ServerHeroRank_14902 buildPartial() {
            CR2S_ServerHeroRank_14902 result = new CR2S_ServerHeroRank_14902(this);
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
            if (other instanceof CR2S_ServerHeroRank_14902) {
               return this.mergeFrom((CR2S_ServerHeroRank_14902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ServerHeroRank_14902 other) {
            if (other == CrossHeroRankMsg.CR2S_ServerHeroRank_14902.getDefaultInstance()) {
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
            CR2S_ServerHeroRank_14902 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ServerHeroRank_14902)CrossHeroRankMsg.CR2S_ServerHeroRank_14902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ServerHeroRank_14902)e.getUnfinishedMessage();
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

   public static final class S2CR_HeroCompensate_14903 extends GeneratedMessageV3 implements S2CR_HeroCompensate_14903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_HeroCompensate_14903 DEFAULT_INSTANCE = new S2CR_HeroCompensate_14903();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_HeroCompensate_14903> PARSER = new AbstractParser<S2CR_HeroCompensate_14903>() {
         public S2CR_HeroCompensate_14903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_HeroCompensate_14903(input, extensionRegistry);
         }
      };

      private S2CR_HeroCompensate_14903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_HeroCompensate_14903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_HeroCompensate_14903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_HeroCompensate_14903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_HeroCompensate_14903.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_HeroCompensate_14903)) {
            return super.equals(obj);
         } else {
            S2CR_HeroCompensate_14903 other = (S2CR_HeroCompensate_14903)obj;
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

      public static S2CR_HeroCompensate_14903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HeroCompensate_14903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(InputStream input) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_HeroCompensate_14903 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_HeroCompensate_14903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_HeroCompensate_14903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HeroCompensate_14903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_HeroCompensate_14903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_HeroCompensate_14903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_HeroCompensate_14903> parser() {
         return PARSER;
      }

      public Parser<S2CR_HeroCompensate_14903> getParserForType() {
         return PARSER;
      }

      public S2CR_HeroCompensate_14903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_HeroCompensate_14903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_HeroCompensate_14903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.S2CR_HeroCompensate_14903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_HeroCompensate_14903_descriptor;
         }

         public S2CR_HeroCompensate_14903 getDefaultInstanceForType() {
            return CrossHeroRankMsg.S2CR_HeroCompensate_14903.getDefaultInstance();
         }

         public S2CR_HeroCompensate_14903 build() {
            S2CR_HeroCompensate_14903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_HeroCompensate_14903 buildPartial() {
            S2CR_HeroCompensate_14903 result = new S2CR_HeroCompensate_14903(this);
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
            if (other instanceof S2CR_HeroCompensate_14903) {
               return this.mergeFrom((S2CR_HeroCompensate_14903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_HeroCompensate_14903 other) {
            if (other == CrossHeroRankMsg.S2CR_HeroCompensate_14903.getDefaultInstance()) {
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
            S2CR_HeroCompensate_14903 parsedMessage = null;

            try {
               parsedMessage = (S2CR_HeroCompensate_14903)CrossHeroRankMsg.S2CR_HeroCompensate_14903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_HeroCompensate_14903)e.getUnfinishedMessage();
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

   public static final class CR2S_HeroCompensate_14904 extends GeneratedMessageV3 implements CR2S_HeroCompensate_14904OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROTOTALPOWER_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataIL> heroTotalPower_;
      public static final int JOBMAXPOWER_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataIL> jobMaxPower_;
      public static final int LASTCOMPENSATE_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> lastCompensate_;
      private byte memoizedIsInitialized;
      private static final CR2S_HeroCompensate_14904 DEFAULT_INSTANCE = new CR2S_HeroCompensate_14904();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_HeroCompensate_14904> PARSER = new AbstractParser<CR2S_HeroCompensate_14904>() {
         public CR2S_HeroCompensate_14904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_HeroCompensate_14904(input, extensionRegistry);
         }
      };

      private CR2S_HeroCompensate_14904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_HeroCompensate_14904() {
         this.memoizedIsInitialized = -1;
         this.heroTotalPower_ = Collections.emptyList();
         this.jobMaxPower_ = Collections.emptyList();
         this.lastCompensate_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_HeroCompensate_14904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_HeroCompensate_14904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroTotalPower_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroTotalPower_.add(input.readMessage(CommonMsg.MapDataIL.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.jobMaxPower_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.jobMaxPower_.add(input.readMessage(CommonMsg.MapDataIL.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.lastCompensate_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.lastCompensate_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.heroTotalPower_ = Collections.unmodifiableList(this.heroTotalPower_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.jobMaxPower_ = Collections.unmodifiableList(this.jobMaxPower_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.lastCompensate_ = Collections.unmodifiableList(this.lastCompensate_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HeroCompensate_14904.class, Builder.class);
      }

      public List<CommonMsg.MapDataIL> getHeroTotalPowerList() {
         return this.heroTotalPower_;
      }

      public List<? extends CommonMsg.MapDataILOrBuilder> getHeroTotalPowerOrBuilderList() {
         return this.heroTotalPower_;
      }

      public int getHeroTotalPowerCount() {
         return this.heroTotalPower_.size();
      }

      public CommonMsg.MapDataIL getHeroTotalPower(int index) {
         return (CommonMsg.MapDataIL)this.heroTotalPower_.get(index);
      }

      public CommonMsg.MapDataILOrBuilder getHeroTotalPowerOrBuilder(int index) {
         return (CommonMsg.MapDataILOrBuilder)this.heroTotalPower_.get(index);
      }

      public List<CommonMsg.MapDataIL> getJobMaxPowerList() {
         return this.jobMaxPower_;
      }

      public List<? extends CommonMsg.MapDataILOrBuilder> getJobMaxPowerOrBuilderList() {
         return this.jobMaxPower_;
      }

      public int getJobMaxPowerCount() {
         return this.jobMaxPower_.size();
      }

      public CommonMsg.MapDataIL getJobMaxPower(int index) {
         return (CommonMsg.MapDataIL)this.jobMaxPower_.get(index);
      }

      public CommonMsg.MapDataILOrBuilder getJobMaxPowerOrBuilder(int index) {
         return (CommonMsg.MapDataILOrBuilder)this.jobMaxPower_.get(index);
      }

      public List<CommonMsg.MapDataII> getLastCompensateList() {
         return this.lastCompensate_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getLastCompensateOrBuilderList() {
         return this.lastCompensate_;
      }

      public int getLastCompensateCount() {
         return this.lastCompensate_.size();
      }

      public CommonMsg.MapDataII getLastCompensate(int index) {
         return (CommonMsg.MapDataII)this.lastCompensate_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getLastCompensateOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.lastCompensate_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getHeroTotalPowerCount(); ++i) {
               if (!this.getHeroTotalPower(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getJobMaxPowerCount(); ++i) {
               if (!this.getJobMaxPower(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getLastCompensateCount(); ++i) {
               if (!this.getLastCompensate(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.heroTotalPower_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.heroTotalPower_.get(i));
         }

         for(int i = 0; i < this.jobMaxPower_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.jobMaxPower_.get(i));
         }

         for(int i = 0; i < this.lastCompensate_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.lastCompensate_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.heroTotalPower_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heroTotalPower_.get(i));
            }

            for(int i = 0; i < this.jobMaxPower_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.jobMaxPower_.get(i));
            }

            for(int i = 0; i < this.lastCompensate_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.lastCompensate_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_HeroCompensate_14904)) {
            return super.equals(obj);
         } else {
            CR2S_HeroCompensate_14904 other = (CR2S_HeroCompensate_14904)obj;
            if (!this.getHeroTotalPowerList().equals(other.getHeroTotalPowerList())) {
               return false;
            } else if (!this.getJobMaxPowerList().equals(other.getJobMaxPowerList())) {
               return false;
            } else if (!this.getLastCompensateList().equals(other.getLastCompensateList())) {
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
            if (this.getHeroTotalPowerCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroTotalPowerList().hashCode();
            }

            if (this.getJobMaxPowerCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getJobMaxPowerList().hashCode();
            }

            if (this.getLastCompensateCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLastCompensateList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_HeroCompensate_14904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HeroCompensate_14904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(InputStream input) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HeroCompensate_14904 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_HeroCompensate_14904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HeroCompensate_14904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HeroCompensate_14904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_HeroCompensate_14904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_HeroCompensate_14904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_HeroCompensate_14904> parser() {
         return PARSER;
      }

      public Parser<CR2S_HeroCompensate_14904> getParserForType() {
         return PARSER;
      }

      public CR2S_HeroCompensate_14904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_HeroCompensate_14904OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataIL> heroTotalPower_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> heroTotalPowerBuilder_;
         private List<CommonMsg.MapDataIL> jobMaxPower_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> jobMaxPowerBuilder_;
         private List<CommonMsg.MapDataII> lastCompensate_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> lastCompensateBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HeroCompensate_14904.class, Builder.class);
         }

         private Builder() {
            this.heroTotalPower_ = Collections.emptyList();
            this.jobMaxPower_ = Collections.emptyList();
            this.lastCompensate_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroTotalPower_ = Collections.emptyList();
            this.jobMaxPower_ = Collections.emptyList();
            this.lastCompensate_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.CR2S_HeroCompensate_14904.alwaysUseFieldBuilders) {
               this.getHeroTotalPowerFieldBuilder();
               this.getJobMaxPowerFieldBuilder();
               this.getLastCompensateFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroTotalPowerBuilder_ == null) {
               this.heroTotalPower_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroTotalPowerBuilder_.clear();
            }

            if (this.jobMaxPowerBuilder_ == null) {
               this.jobMaxPower_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.jobMaxPowerBuilder_.clear();
            }

            if (this.lastCompensateBuilder_ == null) {
               this.lastCompensate_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.lastCompensateBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CR2S_HeroCompensate_14904_descriptor;
         }

         public CR2S_HeroCompensate_14904 getDefaultInstanceForType() {
            return CrossHeroRankMsg.CR2S_HeroCompensate_14904.getDefaultInstance();
         }

         public CR2S_HeroCompensate_14904 build() {
            CR2S_HeroCompensate_14904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_HeroCompensate_14904 buildPartial() {
            CR2S_HeroCompensate_14904 result = new CR2S_HeroCompensate_14904(this);
            int from_bitField0_ = this.bitField0_;
            if (this.heroTotalPowerBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.heroTotalPower_ = Collections.unmodifiableList(this.heroTotalPower_);
                  this.bitField0_ &= -2;
               }

               result.heroTotalPower_ = this.heroTotalPower_;
            } else {
               result.heroTotalPower_ = this.heroTotalPowerBuilder_.build();
            }

            if (this.jobMaxPowerBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.jobMaxPower_ = Collections.unmodifiableList(this.jobMaxPower_);
                  this.bitField0_ &= -3;
               }

               result.jobMaxPower_ = this.jobMaxPower_;
            } else {
               result.jobMaxPower_ = this.jobMaxPowerBuilder_.build();
            }

            if (this.lastCompensateBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.lastCompensate_ = Collections.unmodifiableList(this.lastCompensate_);
                  this.bitField0_ &= -5;
               }

               result.lastCompensate_ = this.lastCompensate_;
            } else {
               result.lastCompensate_ = this.lastCompensateBuilder_.build();
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
            if (other instanceof CR2S_HeroCompensate_14904) {
               return this.mergeFrom((CR2S_HeroCompensate_14904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_HeroCompensate_14904 other) {
            if (other == CrossHeroRankMsg.CR2S_HeroCompensate_14904.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroTotalPowerBuilder_ == null) {
                  if (!other.heroTotalPower_.isEmpty()) {
                     if (this.heroTotalPower_.isEmpty()) {
                        this.heroTotalPower_ = other.heroTotalPower_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHeroTotalPowerIsMutable();
                        this.heroTotalPower_.addAll(other.heroTotalPower_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroTotalPower_.isEmpty()) {
                  if (this.heroTotalPowerBuilder_.isEmpty()) {
                     this.heroTotalPowerBuilder_.dispose();
                     this.heroTotalPowerBuilder_ = null;
                     this.heroTotalPower_ = other.heroTotalPower_;
                     this.bitField0_ &= -2;
                     this.heroTotalPowerBuilder_ = CrossHeroRankMsg.CR2S_HeroCompensate_14904.alwaysUseFieldBuilders ? this.getHeroTotalPowerFieldBuilder() : null;
                  } else {
                     this.heroTotalPowerBuilder_.addAllMessages(other.heroTotalPower_);
                  }
               }

               if (this.jobMaxPowerBuilder_ == null) {
                  if (!other.jobMaxPower_.isEmpty()) {
                     if (this.jobMaxPower_.isEmpty()) {
                        this.jobMaxPower_ = other.jobMaxPower_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureJobMaxPowerIsMutable();
                        this.jobMaxPower_.addAll(other.jobMaxPower_);
                     }

                     this.onChanged();
                  }
               } else if (!other.jobMaxPower_.isEmpty()) {
                  if (this.jobMaxPowerBuilder_.isEmpty()) {
                     this.jobMaxPowerBuilder_.dispose();
                     this.jobMaxPowerBuilder_ = null;
                     this.jobMaxPower_ = other.jobMaxPower_;
                     this.bitField0_ &= -3;
                     this.jobMaxPowerBuilder_ = CrossHeroRankMsg.CR2S_HeroCompensate_14904.alwaysUseFieldBuilders ? this.getJobMaxPowerFieldBuilder() : null;
                  } else {
                     this.jobMaxPowerBuilder_.addAllMessages(other.jobMaxPower_);
                  }
               }

               if (this.lastCompensateBuilder_ == null) {
                  if (!other.lastCompensate_.isEmpty()) {
                     if (this.lastCompensate_.isEmpty()) {
                        this.lastCompensate_ = other.lastCompensate_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureLastCompensateIsMutable();
                        this.lastCompensate_.addAll(other.lastCompensate_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lastCompensate_.isEmpty()) {
                  if (this.lastCompensateBuilder_.isEmpty()) {
                     this.lastCompensateBuilder_.dispose();
                     this.lastCompensateBuilder_ = null;
                     this.lastCompensate_ = other.lastCompensate_;
                     this.bitField0_ &= -5;
                     this.lastCompensateBuilder_ = CrossHeroRankMsg.CR2S_HeroCompensate_14904.alwaysUseFieldBuilders ? this.getLastCompensateFieldBuilder() : null;
                  } else {
                     this.lastCompensateBuilder_.addAllMessages(other.lastCompensate_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getHeroTotalPowerCount(); ++i) {
               if (!this.getHeroTotalPower(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getJobMaxPowerCount(); ++i) {
               if (!this.getJobMaxPower(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getLastCompensateCount(); ++i) {
               if (!this.getLastCompensate(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_HeroCompensate_14904 parsedMessage = null;

            try {
               parsedMessage = (CR2S_HeroCompensate_14904)CrossHeroRankMsg.CR2S_HeroCompensate_14904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_HeroCompensate_14904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroTotalPowerIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroTotalPower_ = new ArrayList(this.heroTotalPower_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataIL> getHeroTotalPowerList() {
            return this.heroTotalPowerBuilder_ == null ? Collections.unmodifiableList(this.heroTotalPower_) : this.heroTotalPowerBuilder_.getMessageList();
         }

         public int getHeroTotalPowerCount() {
            return this.heroTotalPowerBuilder_ == null ? this.heroTotalPower_.size() : this.heroTotalPowerBuilder_.getCount();
         }

         public CommonMsg.MapDataIL getHeroTotalPower(int index) {
            return this.heroTotalPowerBuilder_ == null ? (CommonMsg.MapDataIL)this.heroTotalPower_.get(index) : (CommonMsg.MapDataIL)this.heroTotalPowerBuilder_.getMessage(index);
         }

         public Builder setHeroTotalPower(int index, CommonMsg.MapDataIL value) {
            if (this.heroTotalPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.set(index, value);
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroTotalPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.heroTotalPowerBuilder_ == null) {
               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroTotalPower(CommonMsg.MapDataIL value) {
            if (this.heroTotalPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.add(value);
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroTotalPower(int index, CommonMsg.MapDataIL value) {
            if (this.heroTotalPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.add(index, value);
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroTotalPower(CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.heroTotalPowerBuilder_ == null) {
               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroTotalPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.heroTotalPowerBuilder_ == null) {
               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroTotalPower(Iterable<? extends CommonMsg.MapDataIL> values) {
            if (this.heroTotalPowerBuilder_ == null) {
               this.ensureHeroTotalPowerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroTotalPower_);
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroTotalPower() {
            if (this.heroTotalPowerBuilder_ == null) {
               this.heroTotalPower_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroTotalPower(int index) {
            if (this.heroTotalPowerBuilder_ == null) {
               this.ensureHeroTotalPowerIsMutable();
               this.heroTotalPower_.remove(index);
               this.onChanged();
            } else {
               this.heroTotalPowerBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIL.Builder getHeroTotalPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getHeroTotalPowerFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataILOrBuilder getHeroTotalPowerOrBuilder(int index) {
            return this.heroTotalPowerBuilder_ == null ? (CommonMsg.MapDataILOrBuilder)this.heroTotalPower_.get(index) : (CommonMsg.MapDataILOrBuilder)this.heroTotalPowerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataILOrBuilder> getHeroTotalPowerOrBuilderList() {
            return this.heroTotalPowerBuilder_ != null ? this.heroTotalPowerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroTotalPower_);
         }

         public CommonMsg.MapDataIL.Builder addHeroTotalPowerBuilder() {
            return (CommonMsg.MapDataIL.Builder)this.getHeroTotalPowerFieldBuilder().addBuilder(CommonMsg.MapDataIL.getDefaultInstance());
         }

         public CommonMsg.MapDataIL.Builder addHeroTotalPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getHeroTotalPowerFieldBuilder().addBuilder(index, CommonMsg.MapDataIL.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIL.Builder> getHeroTotalPowerBuilderList() {
            return this.getHeroTotalPowerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> getHeroTotalPowerFieldBuilder() {
            if (this.heroTotalPowerBuilder_ == null) {
               this.heroTotalPowerBuilder_ = new RepeatedFieldBuilderV3(this.heroTotalPower_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.heroTotalPower_ = null;
            }

            return this.heroTotalPowerBuilder_;
         }

         private void ensureJobMaxPowerIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.jobMaxPower_ = new ArrayList(this.jobMaxPower_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataIL> getJobMaxPowerList() {
            return this.jobMaxPowerBuilder_ == null ? Collections.unmodifiableList(this.jobMaxPower_) : this.jobMaxPowerBuilder_.getMessageList();
         }

         public int getJobMaxPowerCount() {
            return this.jobMaxPowerBuilder_ == null ? this.jobMaxPower_.size() : this.jobMaxPowerBuilder_.getCount();
         }

         public CommonMsg.MapDataIL getJobMaxPower(int index) {
            return this.jobMaxPowerBuilder_ == null ? (CommonMsg.MapDataIL)this.jobMaxPower_.get(index) : (CommonMsg.MapDataIL)this.jobMaxPowerBuilder_.getMessage(index);
         }

         public Builder setJobMaxPower(int index, CommonMsg.MapDataIL value) {
            if (this.jobMaxPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.set(index, value);
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setJobMaxPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.jobMaxPowerBuilder_ == null) {
               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addJobMaxPower(CommonMsg.MapDataIL value) {
            if (this.jobMaxPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.add(value);
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addJobMaxPower(int index, CommonMsg.MapDataIL value) {
            if (this.jobMaxPowerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.add(index, value);
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addJobMaxPower(CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.jobMaxPowerBuilder_ == null) {
               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addJobMaxPower(int index, CommonMsg.MapDataIL.Builder builderForValue) {
            if (this.jobMaxPowerBuilder_ == null) {
               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllJobMaxPower(Iterable<? extends CommonMsg.MapDataIL> values) {
            if (this.jobMaxPowerBuilder_ == null) {
               this.ensureJobMaxPowerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.jobMaxPower_);
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearJobMaxPower() {
            if (this.jobMaxPowerBuilder_ == null) {
               this.jobMaxPower_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.clear();
            }

            return this;
         }

         public Builder removeJobMaxPower(int index) {
            if (this.jobMaxPowerBuilder_ == null) {
               this.ensureJobMaxPowerIsMutable();
               this.jobMaxPower_.remove(index);
               this.onChanged();
            } else {
               this.jobMaxPowerBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIL.Builder getJobMaxPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getJobMaxPowerFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataILOrBuilder getJobMaxPowerOrBuilder(int index) {
            return this.jobMaxPowerBuilder_ == null ? (CommonMsg.MapDataILOrBuilder)this.jobMaxPower_.get(index) : (CommonMsg.MapDataILOrBuilder)this.jobMaxPowerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataILOrBuilder> getJobMaxPowerOrBuilderList() {
            return this.jobMaxPowerBuilder_ != null ? this.jobMaxPowerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.jobMaxPower_);
         }

         public CommonMsg.MapDataIL.Builder addJobMaxPowerBuilder() {
            return (CommonMsg.MapDataIL.Builder)this.getJobMaxPowerFieldBuilder().addBuilder(CommonMsg.MapDataIL.getDefaultInstance());
         }

         public CommonMsg.MapDataIL.Builder addJobMaxPowerBuilder(int index) {
            return (CommonMsg.MapDataIL.Builder)this.getJobMaxPowerFieldBuilder().addBuilder(index, CommonMsg.MapDataIL.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIL.Builder> getJobMaxPowerBuilderList() {
            return this.getJobMaxPowerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIL, CommonMsg.MapDataIL.Builder, CommonMsg.MapDataILOrBuilder> getJobMaxPowerFieldBuilder() {
            if (this.jobMaxPowerBuilder_ == null) {
               this.jobMaxPowerBuilder_ = new RepeatedFieldBuilderV3(this.jobMaxPower_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.jobMaxPower_ = null;
            }

            return this.jobMaxPowerBuilder_;
         }

         private void ensureLastCompensateIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.lastCompensate_ = new ArrayList(this.lastCompensate_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getLastCompensateList() {
            return this.lastCompensateBuilder_ == null ? Collections.unmodifiableList(this.lastCompensate_) : this.lastCompensateBuilder_.getMessageList();
         }

         public int getLastCompensateCount() {
            return this.lastCompensateBuilder_ == null ? this.lastCompensate_.size() : this.lastCompensateBuilder_.getCount();
         }

         public CommonMsg.MapDataII getLastCompensate(int index) {
            return this.lastCompensateBuilder_ == null ? (CommonMsg.MapDataII)this.lastCompensate_.get(index) : (CommonMsg.MapDataII)this.lastCompensateBuilder_.getMessage(index);
         }

         public Builder setLastCompensate(int index, CommonMsg.MapDataII value) {
            if (this.lastCompensateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.set(index, value);
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLastCompensate(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.lastCompensateBuilder_ == null) {
               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLastCompensate(CommonMsg.MapDataII value) {
            if (this.lastCompensateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.add(value);
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLastCompensate(int index, CommonMsg.MapDataII value) {
            if (this.lastCompensateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.add(index, value);
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLastCompensate(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.lastCompensateBuilder_ == null) {
               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLastCompensate(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.lastCompensateBuilder_ == null) {
               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLastCompensate(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.lastCompensateBuilder_ == null) {
               this.ensureLastCompensateIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lastCompensate_);
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLastCompensate() {
            if (this.lastCompensateBuilder_ == null) {
               this.lastCompensate_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.clear();
            }

            return this;
         }

         public Builder removeLastCompensate(int index) {
            if (this.lastCompensateBuilder_ == null) {
               this.ensureLastCompensateIsMutable();
               this.lastCompensate_.remove(index);
               this.onChanged();
            } else {
               this.lastCompensateBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getLastCompensateBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getLastCompensateFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getLastCompensateOrBuilder(int index) {
            return this.lastCompensateBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.lastCompensate_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.lastCompensateBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getLastCompensateOrBuilderList() {
            return this.lastCompensateBuilder_ != null ? this.lastCompensateBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lastCompensate_);
         }

         public CommonMsg.MapDataII.Builder addLastCompensateBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getLastCompensateFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addLastCompensateBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getLastCompensateFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getLastCompensateBuilderList() {
            return this.getLastCompensateFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getLastCompensateFieldBuilder() {
            if (this.lastCompensateBuilder_ == null) {
               this.lastCompensateBuilder_ = new RepeatedFieldBuilderV3(this.lastCompensate_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.lastCompensate_ = null;
            }

            return this.lastCompensateBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CrossHeroInfo extends GeneratedMessageV3 implements CrossHeroInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEROINFO_FIELD_NUMBER = 2;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final CrossHeroInfo DEFAULT_INSTANCE = new CrossHeroInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CrossHeroInfo> PARSER = new AbstractParser<CrossHeroInfo>() {
         public CrossHeroInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CrossHeroInfo(input, extensionRegistry);
         }
      };

      private CrossHeroInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CrossHeroInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CrossHeroInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CrossHeroInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
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
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossHeroInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getHeroInfo());
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CrossHeroInfo)) {
            return super.equals(obj);
         } else {
            CrossHeroInfo other = (CrossHeroInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CrossHeroInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data);
      }

      public static CrossHeroInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossHeroInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data);
      }

      public static CrossHeroInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossHeroInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data);
      }

      public static CrossHeroInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossHeroInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossHeroInfo parseFrom(InputStream input) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossHeroInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossHeroInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CrossHeroInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossHeroInfo parseFrom(CodedInputStream input) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossHeroInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossHeroInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CrossHeroInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CrossHeroInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CrossHeroInfo> parser() {
         return PARSER;
      }

      public Parser<CrossHeroInfo> getParserForType() {
         return PARSER;
      }

      public CrossHeroInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CrossHeroInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossHeroInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.CrossHeroInfo.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_CrossHeroInfo_descriptor;
         }

         public CrossHeroInfo getDefaultInstanceForType() {
            return CrossHeroRankMsg.CrossHeroInfo.getDefaultInstance();
         }

         public CrossHeroInfo build() {
            CrossHeroInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CrossHeroInfo buildPartial() {
            CrossHeroInfo result = new CrossHeroInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
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
            if (other instanceof CrossHeroInfo) {
               return this.mergeFrom((CrossHeroInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CrossHeroInfo other) {
            if (other == CrossHeroRankMsg.CrossHeroInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CrossHeroInfo parsedMessage = null;

            try {
               parsedMessage = (CrossHeroInfo)CrossHeroRankMsg.CrossHeroInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CrossHeroInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
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

   public static final class S2CR_UploadHeroInfo_14905 extends GeneratedMessageV3 implements S2CR_UploadHeroInfo_14905OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CROSSHEROINFO_FIELD_NUMBER = 1;
      private List<CrossHeroInfo> crossHeroInfo_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadHeroInfo_14905 DEFAULT_INSTANCE = new S2CR_UploadHeroInfo_14905();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadHeroInfo_14905> PARSER = new AbstractParser<S2CR_UploadHeroInfo_14905>() {
         public S2CR_UploadHeroInfo_14905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadHeroInfo_14905(input, extensionRegistry);
         }
      };

      private S2CR_UploadHeroInfo_14905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadHeroInfo_14905() {
         this.memoizedIsInitialized = -1;
         this.crossHeroInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadHeroInfo_14905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadHeroInfo_14905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.crossHeroInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.crossHeroInfo_.add(input.readMessage(CrossHeroRankMsg.CrossHeroInfo.PARSER, extensionRegistry));
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
                  this.crossHeroInfo_ = Collections.unmodifiableList(this.crossHeroInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadHeroInfo_14905.class, Builder.class);
      }

      public List<CrossHeroInfo> getCrossHeroInfoList() {
         return this.crossHeroInfo_;
      }

      public List<? extends CrossHeroInfoOrBuilder> getCrossHeroInfoOrBuilderList() {
         return this.crossHeroInfo_;
      }

      public int getCrossHeroInfoCount() {
         return this.crossHeroInfo_.size();
      }

      public CrossHeroInfo getCrossHeroInfo(int index) {
         return (CrossHeroInfo)this.crossHeroInfo_.get(index);
      }

      public CrossHeroInfoOrBuilder getCrossHeroInfoOrBuilder(int index) {
         return (CrossHeroInfoOrBuilder)this.crossHeroInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getCrossHeroInfoCount(); ++i) {
               if (!this.getCrossHeroInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.crossHeroInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.crossHeroInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.crossHeroInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.crossHeroInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadHeroInfo_14905)) {
            return super.equals(obj);
         } else {
            S2CR_UploadHeroInfo_14905 other = (S2CR_UploadHeroInfo_14905)obj;
            if (!this.getCrossHeroInfoList().equals(other.getCrossHeroInfoList())) {
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
            if (this.getCrossHeroInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCrossHeroInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadHeroInfo_14905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadHeroInfo_14905 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadHeroInfo_14905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadHeroInfo_14905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadHeroInfo_14905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadHeroInfo_14905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadHeroInfo_14905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadHeroInfo_14905> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadHeroInfo_14905> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadHeroInfo_14905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadHeroInfo_14905OrBuilder {
         private int bitField0_;
         private List<CrossHeroInfo> crossHeroInfo_;
         private RepeatedFieldBuilderV3<CrossHeroInfo, CrossHeroInfo.Builder, CrossHeroInfoOrBuilder> crossHeroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadHeroInfo_14905.class, Builder.class);
         }

         private Builder() {
            this.crossHeroInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.crossHeroInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.alwaysUseFieldBuilders) {
               this.getCrossHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.crossHeroInfoBuilder_ == null) {
               this.crossHeroInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.crossHeroInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_UploadHeroInfo_14905_descriptor;
         }

         public S2CR_UploadHeroInfo_14905 getDefaultInstanceForType() {
            return CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.getDefaultInstance();
         }

         public S2CR_UploadHeroInfo_14905 build() {
            S2CR_UploadHeroInfo_14905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadHeroInfo_14905 buildPartial() {
            S2CR_UploadHeroInfo_14905 result = new S2CR_UploadHeroInfo_14905(this);
            int from_bitField0_ = this.bitField0_;
            if (this.crossHeroInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.crossHeroInfo_ = Collections.unmodifiableList(this.crossHeroInfo_);
                  this.bitField0_ &= -2;
               }

               result.crossHeroInfo_ = this.crossHeroInfo_;
            } else {
               result.crossHeroInfo_ = this.crossHeroInfoBuilder_.build();
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
            if (other instanceof S2CR_UploadHeroInfo_14905) {
               return this.mergeFrom((S2CR_UploadHeroInfo_14905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadHeroInfo_14905 other) {
            if (other == CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.getDefaultInstance()) {
               return this;
            } else {
               if (this.crossHeroInfoBuilder_ == null) {
                  if (!other.crossHeroInfo_.isEmpty()) {
                     if (this.crossHeroInfo_.isEmpty()) {
                        this.crossHeroInfo_ = other.crossHeroInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureCrossHeroInfoIsMutable();
                        this.crossHeroInfo_.addAll(other.crossHeroInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.crossHeroInfo_.isEmpty()) {
                  if (this.crossHeroInfoBuilder_.isEmpty()) {
                     this.crossHeroInfoBuilder_.dispose();
                     this.crossHeroInfoBuilder_ = null;
                     this.crossHeroInfo_ = other.crossHeroInfo_;
                     this.bitField0_ &= -2;
                     this.crossHeroInfoBuilder_ = CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.alwaysUseFieldBuilders ? this.getCrossHeroInfoFieldBuilder() : null;
                  } else {
                     this.crossHeroInfoBuilder_.addAllMessages(other.crossHeroInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getCrossHeroInfoCount(); ++i) {
               if (!this.getCrossHeroInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadHeroInfo_14905 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadHeroInfo_14905)CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadHeroInfo_14905)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCrossHeroInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.crossHeroInfo_ = new ArrayList(this.crossHeroInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<CrossHeroInfo> getCrossHeroInfoList() {
            return this.crossHeroInfoBuilder_ == null ? Collections.unmodifiableList(this.crossHeroInfo_) : this.crossHeroInfoBuilder_.getMessageList();
         }

         public int getCrossHeroInfoCount() {
            return this.crossHeroInfoBuilder_ == null ? this.crossHeroInfo_.size() : this.crossHeroInfoBuilder_.getCount();
         }

         public CrossHeroInfo getCrossHeroInfo(int index) {
            return this.crossHeroInfoBuilder_ == null ? (CrossHeroInfo)this.crossHeroInfo_.get(index) : (CrossHeroInfo)this.crossHeroInfoBuilder_.getMessage(index);
         }

         public Builder setCrossHeroInfo(int index, CrossHeroInfo value) {
            if (this.crossHeroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.set(index, value);
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCrossHeroInfo(int index, CrossHeroInfo.Builder builderForValue) {
            if (this.crossHeroInfoBuilder_ == null) {
               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCrossHeroInfo(CrossHeroInfo value) {
            if (this.crossHeroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.add(value);
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCrossHeroInfo(int index, CrossHeroInfo value) {
            if (this.crossHeroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.add(index, value);
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCrossHeroInfo(CrossHeroInfo.Builder builderForValue) {
            if (this.crossHeroInfoBuilder_ == null) {
               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCrossHeroInfo(int index, CrossHeroInfo.Builder builderForValue) {
            if (this.crossHeroInfoBuilder_ == null) {
               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCrossHeroInfo(Iterable<? extends CrossHeroInfo> values) {
            if (this.crossHeroInfoBuilder_ == null) {
               this.ensureCrossHeroInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.crossHeroInfo_);
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCrossHeroInfo() {
            if (this.crossHeroInfoBuilder_ == null) {
               this.crossHeroInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeCrossHeroInfo(int index) {
            if (this.crossHeroInfoBuilder_ == null) {
               this.ensureCrossHeroInfoIsMutable();
               this.crossHeroInfo_.remove(index);
               this.onChanged();
            } else {
               this.crossHeroInfoBuilder_.remove(index);
            }

            return this;
         }

         public CrossHeroInfo.Builder getCrossHeroInfoBuilder(int index) {
            return (CrossHeroInfo.Builder)this.getCrossHeroInfoFieldBuilder().getBuilder(index);
         }

         public CrossHeroInfoOrBuilder getCrossHeroInfoOrBuilder(int index) {
            return this.crossHeroInfoBuilder_ == null ? (CrossHeroInfoOrBuilder)this.crossHeroInfo_.get(index) : (CrossHeroInfoOrBuilder)this.crossHeroInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CrossHeroInfoOrBuilder> getCrossHeroInfoOrBuilderList() {
            return this.crossHeroInfoBuilder_ != null ? this.crossHeroInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.crossHeroInfo_);
         }

         public CrossHeroInfo.Builder addCrossHeroInfoBuilder() {
            return (CrossHeroInfo.Builder)this.getCrossHeroInfoFieldBuilder().addBuilder(CrossHeroRankMsg.CrossHeroInfo.getDefaultInstance());
         }

         public CrossHeroInfo.Builder addCrossHeroInfoBuilder(int index) {
            return (CrossHeroInfo.Builder)this.getCrossHeroInfoFieldBuilder().addBuilder(index, CrossHeroRankMsg.CrossHeroInfo.getDefaultInstance());
         }

         public List<CrossHeroInfo.Builder> getCrossHeroInfoBuilderList() {
            return this.getCrossHeroInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CrossHeroInfo, CrossHeroInfo.Builder, CrossHeroInfoOrBuilder> getCrossHeroInfoFieldBuilder() {
            if (this.crossHeroInfoBuilder_ == null) {
               this.crossHeroInfoBuilder_ = new RepeatedFieldBuilderV3(this.crossHeroInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.crossHeroInfo_ = null;
            }

            return this.crossHeroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_RemoveHeroInfo_14907 extends GeneratedMessageV3 implements S2CR_RemoveHeroInfo_14907OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROIDS_FIELD_NUMBER = 1;
      private Internal.IntList heroIds_;
      private byte memoizedIsInitialized;
      private static final S2CR_RemoveHeroInfo_14907 DEFAULT_INSTANCE = new S2CR_RemoveHeroInfo_14907();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RemoveHeroInfo_14907> PARSER = new AbstractParser<S2CR_RemoveHeroInfo_14907>() {
         public S2CR_RemoveHeroInfo_14907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RemoveHeroInfo_14907(input, extensionRegistry);
         }
      };

      private S2CR_RemoveHeroInfo_14907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RemoveHeroInfo_14907() {
         this.memoizedIsInitialized = -1;
         this.heroIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RemoveHeroInfo_14907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RemoveHeroInfo_14907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroIds_.addInt(input.readInt32());
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
                  this.heroIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemoveHeroInfo_14907.class, Builder.class);
      }

      public List<Integer> getHeroIdsList() {
         return this.heroIds_;
      }

      public int getHeroIdsCount() {
         return this.heroIds_.size();
      }

      public int getHeroIds(int index) {
         return this.heroIds_.getInt(index);
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
         for(int i = 0; i < this.heroIds_.size(); ++i) {
            output.writeInt32(1, this.heroIds_.getInt(i));
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

            for(int i = 0; i < this.heroIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RemoveHeroInfo_14907)) {
            return super.equals(obj);
         } else {
            S2CR_RemoveHeroInfo_14907 other = (S2CR_RemoveHeroInfo_14907)obj;
            if (!this.getHeroIdsList().equals(other.getHeroIdsList())) {
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
            if (this.getHeroIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveHeroInfo_14907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(InputStream input) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemoveHeroInfo_14907 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RemoveHeroInfo_14907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemoveHeroInfo_14907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveHeroInfo_14907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RemoveHeroInfo_14907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RemoveHeroInfo_14907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RemoveHeroInfo_14907> parser() {
         return PARSER;
      }

      public Parser<S2CR_RemoveHeroInfo_14907> getParserForType() {
         return PARSER;
      }

      public S2CR_RemoveHeroInfo_14907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RemoveHeroInfo_14907OrBuilder {
         private int bitField0_;
         private Internal.IntList heroIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemoveHeroInfo_14907.class, Builder.class);
         }

         private Builder() {
            this.heroIds_ = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroIds_ = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroIds_ = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroRankMsg.internal_static_crossHeroRank_com_gzbz_protobuf_S2CR_RemoveHeroInfo_14907_descriptor;
         }

         public S2CR_RemoveHeroInfo_14907 getDefaultInstanceForType() {
            return CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.getDefaultInstance();
         }

         public S2CR_RemoveHeroInfo_14907 build() {
            S2CR_RemoveHeroInfo_14907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RemoveHeroInfo_14907 buildPartial() {
            S2CR_RemoveHeroInfo_14907 result = new S2CR_RemoveHeroInfo_14907(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.heroIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.heroIds_ = this.heroIds_;
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
            if (other instanceof S2CR_RemoveHeroInfo_14907) {
               return this.mergeFrom((S2CR_RemoveHeroInfo_14907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RemoveHeroInfo_14907 other) {
            if (other == CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.getDefaultInstance()) {
               return this;
            } else {
               if (!other.heroIds_.isEmpty()) {
                  if (this.heroIds_.isEmpty()) {
                     this.heroIds_ = other.heroIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHeroIdsIsMutable();
                     this.heroIds_.addAll(other.heroIds_);
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
            S2CR_RemoveHeroInfo_14907 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RemoveHeroInfo_14907)CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RemoveHeroInfo_14907)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroIds_ = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.mutableCopy(this.heroIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHeroIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.heroIds_) : this.heroIds_);
         }

         public int getHeroIdsCount() {
            return this.heroIds_.size();
         }

         public int getHeroIds(int index) {
            return this.heroIds_.getInt(index);
         }

         public Builder setHeroIds(int index, int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroIds(int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroIds(Iterable<? extends Integer> values) {
            this.ensureHeroIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroIds() {
            this.heroIds_ = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.emptyIntList();
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

   public interface CR2S_HeroCompensate_14904OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataIL> getHeroTotalPowerList();

      CommonMsg.MapDataIL getHeroTotalPower(int index);

      int getHeroTotalPowerCount();

      List<? extends CommonMsg.MapDataILOrBuilder> getHeroTotalPowerOrBuilderList();

      CommonMsg.MapDataILOrBuilder getHeroTotalPowerOrBuilder(int index);

      List<CommonMsg.MapDataIL> getJobMaxPowerList();

      CommonMsg.MapDataIL getJobMaxPower(int index);

      int getJobMaxPowerCount();

      List<? extends CommonMsg.MapDataILOrBuilder> getJobMaxPowerOrBuilderList();

      CommonMsg.MapDataILOrBuilder getJobMaxPowerOrBuilder(int index);

      List<CommonMsg.MapDataII> getLastCompensateList();

      CommonMsg.MapDataII getLastCompensate(int index);

      int getLastCompensateCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getLastCompensateOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getLastCompensateOrBuilder(int index);
   }

   public interface CR2S_ServerHeroRank_14902OrBuilder extends MessageOrBuilder {
   }

   public interface CrossHeroInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface HeroRankOrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      List<CommonMsg.MapDataIL> getPlayerPowerList();

      CommonMsg.MapDataIL getPlayerPower(int index);

      int getPlayerPowerCount();

      List<? extends CommonMsg.MapDataILOrBuilder> getPlayerPowerOrBuilderList();

      CommonMsg.MapDataILOrBuilder getPlayerPowerOrBuilder(int index);
   }

   public interface S2CR_HeroCompensate_14903OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_RemoveHeroInfo_14907OrBuilder extends MessageOrBuilder {
      List<Integer> getHeroIdsList();

      int getHeroIdsCount();

      int getHeroIds(int index);
   }

   public interface S2CR_ServerHeroRank_14901OrBuilder extends MessageOrBuilder {
      List<HeroRank> getInfosList();

      HeroRank getInfos(int index);

      int getInfosCount();

      List<? extends HeroRankOrBuilder> getInfosOrBuilderList();

      HeroRankOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2CR_UploadHeroInfo_14905OrBuilder extends MessageOrBuilder {
      List<CrossHeroInfo> getCrossHeroInfoList();

      CrossHeroInfo getCrossHeroInfo(int index);

      int getCrossHeroInfoCount();

      List<? extends CrossHeroInfoOrBuilder> getCrossHeroInfoOrBuilderList();

      CrossHeroInfoOrBuilder getCrossHeroInfoOrBuilder(int index);
   }
}
