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

public final class LevelPromoteMsg {
   private static final Descriptors.Descriptor internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_levelPromote_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LevelPromoteMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012LevelPromote.proto\u0012\u001elevelPromote.com.gzbz.protobuf\u001a\fcommon.proto\"C\n\bRankInfo\u0012\u000f\n\u0007modelId\u0018\u0001 \u0002(\u0005\u0012&\n\nplayerInfo\u0018\u0002 \u0003(\u000b2\u0012.common.PlayerInfo\"\u0017\n\u0015C2S_PromoteInfo_17901\"f\n\u0015S2C_PromoteInfo_17902\u0012\u0011\n\tpromoteId\u0018\u0001 \u0002(\u0005\u0012:\n\brankInfo\u0018\u0002 \u0003(\u000b2(.levelPromote.com.gzbz.protobuf.RankInfo\"R\n\u0014S2C_RecordInfo_17904\u0012:\n\brankInfo\u0018\u0001 \u0002(\u000b2(.levelPromote.com.gzbz.protobuf.RankInfoB&\n\u0011com.gzbz.protobufB\u000fLevelPromoteMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_levelPromote_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"ModelId", "PlayerInfo"});
      internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor, new String[0]);
      internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor, new String[]{"PromoteId", "RankInfo"});
      internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor, new String[]{"RankInfo"});
      CommonMsg.getDescriptor();
   }

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODELID_FIELD_NUMBER = 1;
      private int modelId_;
      public static final int PLAYERINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.PlayerInfo> playerInfo_;
      private byte memoizedIsInitialized;
      private static final RankInfo DEFAULT_INSTANCE = new RankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankInfo> PARSER = new AbstractParser<RankInfo>() {
         public RankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankInfo(input, extensionRegistry);
         }
      };

      private RankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankInfo() {
         this.memoizedIsInitialized = -1;
         this.playerInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.modelId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerInfo_.add(input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry));
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
                  this.playerInfo_ = Collections.unmodifiableList(this.playerInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasModelId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModelId() {
         return this.modelId_;
      }

      public List<CommonMsg.PlayerInfo> getPlayerInfoList() {
         return this.playerInfo_;
      }

      public List<? extends CommonMsg.PlayerInfoOrBuilder> getPlayerInfoOrBuilderList() {
         return this.playerInfo_;
      }

      public int getPlayerInfoCount() {
         return this.playerInfo_.size();
      }

      public CommonMsg.PlayerInfo getPlayerInfo(int index) {
         return (CommonMsg.PlayerInfo)this.playerInfo_.get(index);
      }

      public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder(int index) {
         return (CommonMsg.PlayerInfoOrBuilder)this.playerInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModelId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerInfoCount(); ++i) {
               if (!this.getPlayerInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.modelId_);
         }

         for(int i = 0; i < this.playerInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.playerInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.modelId_);
            }

            for(int i = 0; i < this.playerInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.playerInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankInfo)) {
            return super.equals(obj);
         } else {
            RankInfo other = (RankInfo)obj;
            if (this.hasModelId() != other.hasModelId()) {
               return false;
            } else if (this.hasModelId() && this.getModelId() != other.getModelId()) {
               return false;
            } else if (!this.getPlayerInfoList().equals(other.getPlayerInfoList())) {
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
            if (this.hasModelId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModelId();
            }

            if (this.getPlayerInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseFrom(CodedInputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankInfo> parser() {
         return PARSER;
      }

      public Parser<RankInfo> getParserForType() {
         return PARSER;
      }

      public RankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankInfoOrBuilder {
         private int bitField0_;
         private int modelId_;
         private List<CommonMsg.PlayerInfo> playerInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> playerInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
         }

         private Builder() {
            this.playerInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LevelPromoteMsg.RankInfo.alwaysUseFieldBuilders) {
               this.getPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.modelId_ = 0;
            this.bitField0_ &= -2;
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.playerInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return LevelPromoteMsg.RankInfo.getDefaultInstance();
         }

         public RankInfo build() {
            RankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankInfo buildPartial() {
            RankInfo result = new RankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.modelId_ = this.modelId_;
               to_bitField0_ |= 1;
            }

            if (this.playerInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.playerInfo_ = Collections.unmodifiableList(this.playerInfo_);
                  this.bitField0_ &= -3;
               }

               result.playerInfo_ = this.playerInfo_;
            } else {
               result.playerInfo_ = this.playerInfoBuilder_.build();
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == LevelPromoteMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModelId()) {
                  this.setModelId(other.getModelId());
               }

               if (this.playerInfoBuilder_ == null) {
                  if (!other.playerInfo_.isEmpty()) {
                     if (this.playerInfo_.isEmpty()) {
                        this.playerInfo_ = other.playerInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePlayerInfoIsMutable();
                        this.playerInfo_.addAll(other.playerInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerInfo_.isEmpty()) {
                  if (this.playerInfoBuilder_.isEmpty()) {
                     this.playerInfoBuilder_.dispose();
                     this.playerInfoBuilder_ = null;
                     this.playerInfo_ = other.playerInfo_;
                     this.bitField0_ &= -3;
                     this.playerInfoBuilder_ = LevelPromoteMsg.RankInfo.alwaysUseFieldBuilders ? this.getPlayerInfoFieldBuilder() : null;
                  } else {
                     this.playerInfoBuilder_.addAllMessages(other.playerInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModelId()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerInfoCount(); ++i) {
                  if (!this.getPlayerInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)LevelPromoteMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModelId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModelId() {
            return this.modelId_;
         }

         public Builder setModelId(int value) {
            this.bitField0_ |= 1;
            this.modelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelId() {
            this.bitField0_ &= -2;
            this.modelId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerInfo_ = new ArrayList(this.playerInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PlayerInfo> getPlayerInfoList() {
            return this.playerInfoBuilder_ == null ? Collections.unmodifiableList(this.playerInfo_) : this.playerInfoBuilder_.getMessageList();
         }

         public int getPlayerInfoCount() {
            return this.playerInfoBuilder_ == null ? this.playerInfo_.size() : this.playerInfoBuilder_.getCount();
         }

         public CommonMsg.PlayerInfo getPlayerInfo(int index) {
            return this.playerInfoBuilder_ == null ? (CommonMsg.PlayerInfo)this.playerInfo_.get(index) : (CommonMsg.PlayerInfo)this.playerInfoBuilder_.getMessage(index);
         }

         public Builder setPlayerInfo(int index, CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.set(index, value);
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerInfo(int index, CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.add(value);
               this.onChanged();
            } else {
               this.playerInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerInfo(int index, CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.add(index, value);
               this.onChanged();
            } else {
               this.playerInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerInfo(int index, CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerInfo(Iterable<? extends CommonMsg.PlayerInfo> values) {
            if (this.playerInfoBuilder_ == null) {
               this.ensurePlayerInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerInfo_);
               this.onChanged();
            } else {
               this.playerInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerInfo(int index) {
            if (this.playerInfoBuilder_ == null) {
               this.ensurePlayerInfoIsMutable();
               this.playerInfo_.remove(index);
               this.onChanged();
            } else {
               this.playerInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PlayerInfo.Builder getPlayerInfoBuilder(int index) {
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder(int index) {
            return this.playerInfoBuilder_ == null ? (CommonMsg.PlayerInfoOrBuilder)this.playerInfo_.get(index) : (CommonMsg.PlayerInfoOrBuilder)this.playerInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PlayerInfoOrBuilder> getPlayerInfoOrBuilderList() {
            return this.playerInfoBuilder_ != null ? this.playerInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerInfo_);
         }

         public CommonMsg.PlayerInfo.Builder addPlayerInfoBuilder() {
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().addBuilder(CommonMsg.PlayerInfo.getDefaultInstance());
         }

         public CommonMsg.PlayerInfo.Builder addPlayerInfoBuilder(int index) {
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().addBuilder(index, CommonMsg.PlayerInfo.getDefaultInstance());
         }

         public List<CommonMsg.PlayerInfo.Builder> getPlayerInfoBuilderList() {
            return this.getPlayerInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfoBuilder_ = new RepeatedFieldBuilderV3(this.playerInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.playerInfo_ = null;
            }

            return this.playerInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PromoteInfo_17901 extends GeneratedMessageV3 implements C2S_PromoteInfo_17901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PromoteInfo_17901 DEFAULT_INSTANCE = new C2S_PromoteInfo_17901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PromoteInfo_17901> PARSER = new AbstractParser<C2S_PromoteInfo_17901>() {
         public C2S_PromoteInfo_17901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PromoteInfo_17901(input, extensionRegistry);
         }
      };

      private C2S_PromoteInfo_17901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PromoteInfo_17901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PromoteInfo_17901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PromoteInfo_17901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PromoteInfo_17901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PromoteInfo_17901)) {
            return super.equals(obj);
         } else {
            C2S_PromoteInfo_17901 other = (C2S_PromoteInfo_17901)obj;
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

      public static C2S_PromoteInfo_17901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data);
      }

      public static C2S_PromoteInfo_17901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PromoteInfo_17901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data);
      }

      public static C2S_PromoteInfo_17901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PromoteInfo_17901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data);
      }

      public static C2S_PromoteInfo_17901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PromoteInfo_17901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PromoteInfo_17901 parseFrom(InputStream input) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PromoteInfo_17901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PromoteInfo_17901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PromoteInfo_17901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PromoteInfo_17901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PromoteInfo_17901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PromoteInfo_17901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PromoteInfo_17901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PromoteInfo_17901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PromoteInfo_17901> parser() {
         return PARSER;
      }

      public Parser<C2S_PromoteInfo_17901> getParserForType() {
         return PARSER;
      }

      public C2S_PromoteInfo_17901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PromoteInfo_17901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PromoteInfo_17901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LevelPromoteMsg.C2S_PromoteInfo_17901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_C2S_PromoteInfo_17901_descriptor;
         }

         public C2S_PromoteInfo_17901 getDefaultInstanceForType() {
            return LevelPromoteMsg.C2S_PromoteInfo_17901.getDefaultInstance();
         }

         public C2S_PromoteInfo_17901 build() {
            C2S_PromoteInfo_17901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PromoteInfo_17901 buildPartial() {
            C2S_PromoteInfo_17901 result = new C2S_PromoteInfo_17901(this);
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
            if (other instanceof C2S_PromoteInfo_17901) {
               return this.mergeFrom((C2S_PromoteInfo_17901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PromoteInfo_17901 other) {
            if (other == LevelPromoteMsg.C2S_PromoteInfo_17901.getDefaultInstance()) {
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
            C2S_PromoteInfo_17901 parsedMessage = null;

            try {
               parsedMessage = (C2S_PromoteInfo_17901)LevelPromoteMsg.C2S_PromoteInfo_17901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PromoteInfo_17901)e.getUnfinishedMessage();
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

   public static final class S2C_PromoteInfo_17902 extends GeneratedMessageV3 implements S2C_PromoteInfo_17902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PROMOTEID_FIELD_NUMBER = 1;
      private int promoteId_;
      public static final int RANKINFO_FIELD_NUMBER = 2;
      private List<RankInfo> rankInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_PromoteInfo_17902 DEFAULT_INSTANCE = new S2C_PromoteInfo_17902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PromoteInfo_17902> PARSER = new AbstractParser<S2C_PromoteInfo_17902>() {
         public S2C_PromoteInfo_17902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PromoteInfo_17902(input, extensionRegistry);
         }
      };

      private S2C_PromoteInfo_17902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PromoteInfo_17902() {
         this.memoizedIsInitialized = -1;
         this.rankInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PromoteInfo_17902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PromoteInfo_17902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.promoteId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rankInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankInfo_.add(input.readMessage(LevelPromoteMsg.RankInfo.PARSER, extensionRegistry));
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
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PromoteInfo_17902.class, Builder.class);
      }

      public boolean hasPromoteId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPromoteId() {
         return this.promoteId_;
      }

      public List<RankInfo> getRankInfoList() {
         return this.rankInfo_;
      }

      public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
         return this.rankInfo_;
      }

      public int getRankInfoCount() {
         return this.rankInfo_.size();
      }

      public RankInfo getRankInfo(int index) {
         return (RankInfo)this.rankInfo_.get(index);
      }

      public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
         return (RankInfoOrBuilder)this.rankInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPromoteId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankInfoCount(); ++i) {
               if (!this.getRankInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.promoteId_);
         }

         for(int i = 0; i < this.rankInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rankInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.promoteId_);
            }

            for(int i = 0; i < this.rankInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rankInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PromoteInfo_17902)) {
            return super.equals(obj);
         } else {
            S2C_PromoteInfo_17902 other = (S2C_PromoteInfo_17902)obj;
            if (this.hasPromoteId() != other.hasPromoteId()) {
               return false;
            } else if (this.hasPromoteId() && this.getPromoteId() != other.getPromoteId()) {
               return false;
            } else if (!this.getRankInfoList().equals(other.getRankInfoList())) {
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
            if (this.hasPromoteId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPromoteId();
            }

            if (this.getRankInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PromoteInfo_17902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data);
      }

      public static S2C_PromoteInfo_17902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PromoteInfo_17902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data);
      }

      public static S2C_PromoteInfo_17902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PromoteInfo_17902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data);
      }

      public static S2C_PromoteInfo_17902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PromoteInfo_17902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PromoteInfo_17902 parseFrom(InputStream input) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PromoteInfo_17902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PromoteInfo_17902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PromoteInfo_17902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PromoteInfo_17902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PromoteInfo_17902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PromoteInfo_17902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PromoteInfo_17902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PromoteInfo_17902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PromoteInfo_17902> parser() {
         return PARSER;
      }

      public Parser<S2C_PromoteInfo_17902> getParserForType() {
         return PARSER;
      }

      public S2C_PromoteInfo_17902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PromoteInfo_17902OrBuilder {
         private int bitField0_;
         private int promoteId_;
         private List<RankInfo> rankInfo_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PromoteInfo_17902.class, Builder.class);
         }

         private Builder() {
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LevelPromoteMsg.S2C_PromoteInfo_17902.alwaysUseFieldBuilders) {
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.promoteId_ = 0;
            this.bitField0_ &= -2;
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_PromoteInfo_17902_descriptor;
         }

         public S2C_PromoteInfo_17902 getDefaultInstanceForType() {
            return LevelPromoteMsg.S2C_PromoteInfo_17902.getDefaultInstance();
         }

         public S2C_PromoteInfo_17902 build() {
            S2C_PromoteInfo_17902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PromoteInfo_17902 buildPartial() {
            S2C_PromoteInfo_17902 result = new S2C_PromoteInfo_17902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.promoteId_ = this.promoteId_;
               to_bitField0_ |= 1;
            }

            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
                  this.bitField0_ &= -3;
               }

               result.rankInfo_ = this.rankInfo_;
            } else {
               result.rankInfo_ = this.rankInfoBuilder_.build();
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
            if (other instanceof S2C_PromoteInfo_17902) {
               return this.mergeFrom((S2C_PromoteInfo_17902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PromoteInfo_17902 other) {
            if (other == LevelPromoteMsg.S2C_PromoteInfo_17902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPromoteId()) {
                  this.setPromoteId(other.getPromoteId());
               }

               if (this.rankInfoBuilder_ == null) {
                  if (!other.rankInfo_.isEmpty()) {
                     if (this.rankInfo_.isEmpty()) {
                        this.rankInfo_ = other.rankInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankInfoIsMutable();
                        this.rankInfo_.addAll(other.rankInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankInfo_.isEmpty()) {
                  if (this.rankInfoBuilder_.isEmpty()) {
                     this.rankInfoBuilder_.dispose();
                     this.rankInfoBuilder_ = null;
                     this.rankInfo_ = other.rankInfo_;
                     this.bitField0_ &= -3;
                     this.rankInfoBuilder_ = LevelPromoteMsg.S2C_PromoteInfo_17902.alwaysUseFieldBuilders ? this.getRankInfoFieldBuilder() : null;
                  } else {
                     this.rankInfoBuilder_.addAllMessages(other.rankInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPromoteId()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankInfoCount(); ++i) {
                  if (!this.getRankInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PromoteInfo_17902 parsedMessage = null;

            try {
               parsedMessage = (S2C_PromoteInfo_17902)LevelPromoteMsg.S2C_PromoteInfo_17902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PromoteInfo_17902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPromoteId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPromoteId() {
            return this.promoteId_;
         }

         public Builder setPromoteId(int value) {
            this.bitField0_ |= 1;
            this.promoteId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPromoteId() {
            this.bitField0_ &= -2;
            this.promoteId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankInfo_ = new ArrayList(this.rankInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankInfo> getRankInfoList() {
            return this.rankInfoBuilder_ == null ? Collections.unmodifiableList(this.rankInfo_) : this.rankInfoBuilder_.getMessageList();
         }

         public int getRankInfoCount() {
            return this.rankInfoBuilder_ == null ? this.rankInfo_.size() : this.rankInfoBuilder_.getCount();
         }

         public RankInfo getRankInfo(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfo)this.rankInfo_.get(index) : (RankInfo)this.rankInfoBuilder_.getMessage(index);
         }

         public Builder setRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankInfo(RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankInfo(Iterable<? extends RankInfo> values) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankInfo_);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankInfo(int index) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.remove(index);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.remove(index);
            }

            return this;
         }

         public RankInfo.Builder getRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfoOrBuilder)this.rankInfo_.get(index) : (RankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
            return this.rankInfoBuilder_ != null ? this.rankInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankInfo_);
         }

         public RankInfo.Builder addRankInfoBuilder() {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(LevelPromoteMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(index, LevelPromoteMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getRankInfoBuilderList() {
            return this.getRankInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new RepeatedFieldBuilderV3(this.rankInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_RecordInfo_17904 extends GeneratedMessageV3 implements S2C_RecordInfo_17904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKINFO_FIELD_NUMBER = 1;
      private RankInfo rankInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_RecordInfo_17904 DEFAULT_INSTANCE = new S2C_RecordInfo_17904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecordInfo_17904> PARSER = new AbstractParser<S2C_RecordInfo_17904>() {
         public S2C_RecordInfo_17904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecordInfo_17904(input, extensionRegistry);
         }
      };

      private S2C_RecordInfo_17904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecordInfo_17904() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecordInfo_17904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecordInfo_17904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.rankInfo_.toBuilder();
                        }

                        this.rankInfo_ = (RankInfo)input.readMessage(LevelPromoteMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.rankInfo_);
                           this.rankInfo_ = subBuilder.buildPartial();
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
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecordInfo_17904.class, Builder.class);
      }

      public boolean hasRankInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankInfo getRankInfo() {
         return this.rankInfo_ == null ? LevelPromoteMsg.RankInfo.getDefaultInstance() : this.rankInfo_;
      }

      public RankInfoOrBuilder getRankInfoOrBuilder() {
         return this.rankInfo_ == null ? LevelPromoteMsg.RankInfo.getDefaultInstance() : this.rankInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRankInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getRankInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getRankInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecordInfo_17904)) {
            return super.equals(obj);
         } else {
            S2C_RecordInfo_17904 other = (S2C_RecordInfo_17904)obj;
            if (this.hasRankInfo() != other.hasRankInfo()) {
               return false;
            } else if (this.hasRankInfo() && !this.getRankInfo().equals(other.getRankInfo())) {
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
            if (this.hasRankInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecordInfo_17904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data);
      }

      public static S2C_RecordInfo_17904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecordInfo_17904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data);
      }

      public static S2C_RecordInfo_17904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecordInfo_17904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data);
      }

      public static S2C_RecordInfo_17904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecordInfo_17904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecordInfo_17904 parseFrom(InputStream input) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecordInfo_17904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecordInfo_17904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecordInfo_17904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecordInfo_17904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecordInfo_17904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecordInfo_17904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecordInfo_17904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecordInfo_17904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecordInfo_17904> parser() {
         return PARSER;
      }

      public Parser<S2C_RecordInfo_17904> getParserForType() {
         return PARSER;
      }

      public S2C_RecordInfo_17904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecordInfo_17904OrBuilder {
         private int bitField0_;
         private RankInfo rankInfo_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecordInfo_17904.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LevelPromoteMsg.S2C_RecordInfo_17904.alwaysUseFieldBuilders) {
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = null;
            } else {
               this.rankInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LevelPromoteMsg.internal_static_levelPromote_com_gzbz_protobuf_S2C_RecordInfo_17904_descriptor;
         }

         public S2C_RecordInfo_17904 getDefaultInstanceForType() {
            return LevelPromoteMsg.S2C_RecordInfo_17904.getDefaultInstance();
         }

         public S2C_RecordInfo_17904 build() {
            S2C_RecordInfo_17904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecordInfo_17904 buildPartial() {
            S2C_RecordInfo_17904 result = new S2C_RecordInfo_17904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.rankInfoBuilder_ == null) {
                  result.rankInfo_ = this.rankInfo_;
               } else {
                  result.rankInfo_ = (RankInfo)this.rankInfoBuilder_.build();
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
            if (other instanceof S2C_RecordInfo_17904) {
               return this.mergeFrom((S2C_RecordInfo_17904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecordInfo_17904 other) {
            if (other == LevelPromoteMsg.S2C_RecordInfo_17904.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankInfo()) {
                  this.mergeRankInfo(other.getRankInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRankInfo()) {
               return false;
            } else {
               return this.getRankInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecordInfo_17904 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecordInfo_17904)LevelPromoteMsg.S2C_RecordInfo_17904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecordInfo_17904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankInfo getRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               return this.rankInfo_ == null ? LevelPromoteMsg.RankInfo.getDefaultInstance() : this.rankInfo_;
            } else {
               return (RankInfo)this.rankInfoBuilder_.getMessage();
            }
         }

         public Builder setRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.rankInfo_ = value;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setRankInfo(RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.rankInfo_ != null && this.rankInfo_ != LevelPromoteMsg.RankInfo.getDefaultInstance()) {
                  this.rankInfo_ = LevelPromoteMsg.RankInfo.newBuilder(this.rankInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.rankInfo_ = value;
               }

               this.onChanged();
            } else {
               this.rankInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = null;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public RankInfo.Builder getRankInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getRankInfoOrBuilder() {
            if (this.rankInfoBuilder_ != null) {
               return (RankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.rankInfo_ == null ? LevelPromoteMsg.RankInfo.getDefaultInstance() : this.rankInfo_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new SingleFieldBuilderV3(this.getRankInfo(), this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_PromoteInfo_17901OrBuilder extends MessageOrBuilder {
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasModelId();

      int getModelId();

      List<CommonMsg.PlayerInfo> getPlayerInfoList();

      CommonMsg.PlayerInfo getPlayerInfo(int index);

      int getPlayerInfoCount();

      List<? extends CommonMsg.PlayerInfoOrBuilder> getPlayerInfoOrBuilderList();

      CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder(int index);
   }

   public interface S2C_PromoteInfo_17902OrBuilder extends MessageOrBuilder {
      boolean hasPromoteId();

      int getPromoteId();

      List<RankInfo> getRankInfoList();

      RankInfo getRankInfo(int index);

      int getRankInfoCount();

      List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList();

      RankInfoOrBuilder getRankInfoOrBuilder(int index);
   }

   public interface S2C_RecordInfo_17904OrBuilder extends MessageOrBuilder {
      boolean hasRankInfo();

      RankInfo getRankInfo();

      RankInfoOrBuilder getRankInfoOrBuilder();
   }
}
