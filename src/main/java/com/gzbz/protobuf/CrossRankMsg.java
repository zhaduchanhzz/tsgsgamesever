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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class CrossRankMsg {
   private static final Descriptors.Descriptor internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossRankMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fCrossRank.proto\u0012\u001bcrossRank.com.gzbz.protobuf\u001a\nRank.proto\"W\n\u0015S2CR_UpdateRank_10901\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005value\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0003 \u0002(\u0003\u0012\u000e\n\u0006params\u0018\u0004 \u0003(\tB#\n\u0011com.gzbz.protobufB\fCrossRankMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor, new String[]{"ModuleId", "Value", "Score", "Params"});
      RankMsg.getDescriptor();
   }

   public static final class S2CR_UpdateRank_10901 extends GeneratedMessageV3 implements S2CR_UpdateRank_10901OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      public static final int VALUE_FIELD_NUMBER = 2;
      private int value_;
      public static final int SCORE_FIELD_NUMBER = 3;
      private long score_;
      public static final int PARAMS_FIELD_NUMBER = 4;
      private LazyStringList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpdateRank_10901 DEFAULT_INSTANCE = new S2CR_UpdateRank_10901();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpdateRank_10901> PARSER = new AbstractParser<S2CR_UpdateRank_10901>() {
         public S2CR_UpdateRank_10901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpdateRank_10901(input, extensionRegistry);
         }
      };

      private S2CR_UpdateRank_10901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpdateRank_10901() {
         this.memoizedIsInitialized = -1;
         this.params_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpdateRank_10901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpdateRank_10901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.value_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.score_ = input.readInt64();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.params_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.params_.add(bs);
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
                  this.params_ = this.params_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossRankMsg.internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossRankMsg.internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateRank_10901.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public boolean hasValue() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getValue() {
         return this.value_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getScore() {
         return this.score_;
      }

      public ProtocolStringList getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public String getParams(int index) {
         return (String)this.params_.get(index);
      }

      public ByteString getParamsBytes(int index) {
         return this.params_.getByteString(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.moduleId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.value_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.score_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 4, this.params_.getRaw(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.value_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.score_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.params_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpdateRank_10901)) {
            return super.equals(obj);
         } else {
            S2CR_UpdateRank_10901 other = (S2CR_UpdateRank_10901)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (this.hasValue() != other.hasValue()) {
               return false;
            } else if (this.hasValue() && this.getValue() != other.getValue()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.hasValue()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getValue();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getScore());
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpdateRank_10901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateRank_10901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateRank_10901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateRank_10901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateRank_10901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateRank_10901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateRank_10901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateRank_10901 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateRank_10901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateRank_10901 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpdateRank_10901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateRank_10901 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateRank_10901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateRank_10901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpdateRank_10901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpdateRank_10901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpdateRank_10901> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpdateRank_10901> getParserForType() {
         return PARSER;
      }

      public S2CR_UpdateRank_10901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpdateRank_10901OrBuilder {
         private int bitField0_;
         private int moduleId_;
         private int value_;
         private long score_;
         private LazyStringList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossRankMsg.internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossRankMsg.internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateRank_10901.class, Builder.class);
         }

         private Builder() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossRankMsg.S2CR_UpdateRank_10901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            this.value_ = 0;
            this.bitField0_ &= -3;
            this.score_ = 0L;
            this.bitField0_ &= -5;
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossRankMsg.internal_static_crossRank_com_gzbz_protobuf_S2CR_UpdateRank_10901_descriptor;
         }

         public S2CR_UpdateRank_10901 getDefaultInstanceForType() {
            return CrossRankMsg.S2CR_UpdateRank_10901.getDefaultInstance();
         }

         public S2CR_UpdateRank_10901 build() {
            S2CR_UpdateRank_10901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpdateRank_10901 buildPartial() {
            S2CR_UpdateRank_10901 result = new S2CR_UpdateRank_10901(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.value_ = this.value_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.params_ = this.params_.getUnmodifiableView();
               this.bitField0_ &= -9;
            }

            result.params_ = this.params_;
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
            if (other instanceof S2CR_UpdateRank_10901) {
               return this.mergeFrom((S2CR_UpdateRank_10901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpdateRank_10901 other) {
            if (other == CrossRankMsg.S2CR_UpdateRank_10901.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (other.hasValue()) {
                  this.setValue(other.getValue());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModuleId()) {
               return false;
            } else if (!this.hasValue()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpdateRank_10901 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpdateRank_10901)CrossRankMsg.S2CR_UpdateRank_10901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpdateRank_10901)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getValue() {
            return this.value_;
         }

         public Builder setValue(int value) {
            this.bitField0_ |= 2;
            this.value_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearValue() {
            this.bitField0_ &= -3;
            this.value_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getScore() {
            return this.score_;
         }

         public Builder setScore(long value) {
            this.bitField0_ |= 4;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -5;
            this.score_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.params_ = new LazyStringArrayList(this.params_);
               this.bitField0_ |= 8;
            }

         }

         public ProtocolStringList getParamsList() {
            return this.params_.getUnmodifiableView();
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public String getParams(int index) {
            return (String)this.params_.get(index);
         }

         public ByteString getParamsBytes(int index) {
            return this.params_.getByteString(index);
         }

         public Builder setParams(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addParams(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllParams(Iterable<String> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public Builder addParamsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface S2CR_UpdateRank_10901OrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();

      boolean hasValue();

      int getValue();

      boolean hasScore();

      long getScore();

      List<String> getParamsList();

      int getParamsCount();

      String getParams(int index);

      ByteString getParamsBytes(int index);
   }
}
