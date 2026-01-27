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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CrossHeroCommentMsg {
   private static final Descriptors.Descriptor internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossHeroCommentMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016CrossHeroComment.proto\u0012\"crossHerocomment.com.gzbz.protobuf\u001a\u0011HeroComment.proto\"0\n\u0010S2CR_OpenUi_8351\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\"!\n\u000fS2CR_Click_8353\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\"H\n\u0011S2CR_Comment_8355\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007context\u0018\u0002 \u0002(\t\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\"v\n\u0012S2CR_ThumbsUp_8357\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012B\n\toperation\u0018\u0003 \u0002(\u000e2/.herocomment.com.gzbz.protobuf.CommentOperation\"4\n\u0014S2CR_DelComment_8359\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005B*\n\u0011com.gzbz.protobufB\u0013CrossHeroCommentMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{HeroCommentMsg.getDescriptor()});
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor, new String[]{"HeroId", "Type"});
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor, new String[]{"HeroId"});
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor, new String[]{"HeroId", "Context", "PlayerName"});
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor, new String[]{"HeroId", "Code", "Operation"});
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor, new String[]{"HeroId", "Code"});
      HeroCommentMsg.getDescriptor();
   }

   public static final class S2CR_OpenUi_8351 extends GeneratedMessageV3 implements S2CR_OpenUi_8351OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_OpenUi_8351 DEFAULT_INSTANCE = new S2CR_OpenUi_8351();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_OpenUi_8351> PARSER = new AbstractParser<S2CR_OpenUi_8351>() {
         public S2CR_OpenUi_8351 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_OpenUi_8351(input, extensionRegistry);
         }
      };

      private S2CR_OpenUi_8351(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_OpenUi_8351() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_OpenUi_8351();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_OpenUi_8351(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
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
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OpenUi_8351.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_OpenUi_8351)) {
            return super.equals(obj);
         } else {
            S2CR_OpenUi_8351 other = (S2CR_OpenUi_8351)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_OpenUi_8351 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data);
      }

      public static S2CR_OpenUi_8351 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenUi_8351 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data);
      }

      public static S2CR_OpenUi_8351 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenUi_8351 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data);
      }

      public static S2CR_OpenUi_8351 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenUi_8351)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenUi_8351 parseFrom(InputStream input) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OpenUi_8351 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OpenUi_8351 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_OpenUi_8351 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OpenUi_8351 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OpenUi_8351 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenUi_8351)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_OpenUi_8351 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_OpenUi_8351 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_OpenUi_8351> parser() {
         return PARSER;
      }

      public Parser<S2CR_OpenUi_8351> getParserForType() {
         return PARSER;
      }

      public S2CR_OpenUi_8351 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_OpenUi_8351OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OpenUi_8351.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroCommentMsg.S2CR_OpenUi_8351.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_OpenUi_8351_descriptor;
         }

         public S2CR_OpenUi_8351 getDefaultInstanceForType() {
            return CrossHeroCommentMsg.S2CR_OpenUi_8351.getDefaultInstance();
         }

         public S2CR_OpenUi_8351 build() {
            S2CR_OpenUi_8351 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_OpenUi_8351 buildPartial() {
            S2CR_OpenUi_8351 result = new S2CR_OpenUi_8351(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2CR_OpenUi_8351) {
               return this.mergeFrom((S2CR_OpenUi_8351)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_OpenUi_8351 other) {
            if (other == CrossHeroCommentMsg.S2CR_OpenUi_8351.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
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
            S2CR_OpenUi_8351 parsedMessage = null;

            try {
               parsedMessage = (S2CR_OpenUi_8351)CrossHeroCommentMsg.S2CR_OpenUi_8351.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_OpenUi_8351)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
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

   public static final class S2CR_Click_8353 extends GeneratedMessageV3 implements S2CR_Click_8353OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final S2CR_Click_8353 DEFAULT_INSTANCE = new S2CR_Click_8353();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Click_8353> PARSER = new AbstractParser<S2CR_Click_8353>() {
         public S2CR_Click_8353 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Click_8353(input, extensionRegistry);
         }
      };

      private S2CR_Click_8353(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Click_8353() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Click_8353();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Click_8353(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Click_8353.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Click_8353)) {
            return super.equals(obj);
         } else {
            S2CR_Click_8353 other = (S2CR_Click_8353)obj;
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

      public static S2CR_Click_8353 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data);
      }

      public static S2CR_Click_8353 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Click_8353 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data);
      }

      public static S2CR_Click_8353 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Click_8353 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data);
      }

      public static S2CR_Click_8353 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Click_8353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Click_8353 parseFrom(InputStream input) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Click_8353 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Click_8353 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Click_8353 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Click_8353 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Click_8353 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Click_8353)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Click_8353 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Click_8353 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Click_8353> parser() {
         return PARSER;
      }

      public Parser<S2CR_Click_8353> getParserForType() {
         return PARSER;
      }

      public S2CR_Click_8353 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Click_8353OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Click_8353.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroCommentMsg.S2CR_Click_8353.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Click_8353_descriptor;
         }

         public S2CR_Click_8353 getDefaultInstanceForType() {
            return CrossHeroCommentMsg.S2CR_Click_8353.getDefaultInstance();
         }

         public S2CR_Click_8353 build() {
            S2CR_Click_8353 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Click_8353 buildPartial() {
            S2CR_Click_8353 result = new S2CR_Click_8353(this);
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
            if (other instanceof S2CR_Click_8353) {
               return this.mergeFrom((S2CR_Click_8353)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Click_8353 other) {
            if (other == CrossHeroCommentMsg.S2CR_Click_8353.getDefaultInstance()) {
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
            S2CR_Click_8353 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Click_8353)CrossHeroCommentMsg.S2CR_Click_8353.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Click_8353)e.getUnfinishedMessage();
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

   public static final class S2CR_Comment_8355 extends GeneratedMessageV3 implements S2CR_Comment_8355OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CONTEXT_FIELD_NUMBER = 2;
      private volatile Object context_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final S2CR_Comment_8355 DEFAULT_INSTANCE = new S2CR_Comment_8355();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Comment_8355> PARSER = new AbstractParser<S2CR_Comment_8355>() {
         public S2CR_Comment_8355 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Comment_8355(input, extensionRegistry);
         }
      };

      private S2CR_Comment_8355(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Comment_8355() {
         this.memoizedIsInitialized = -1;
         this.context_ = "";
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Comment_8355();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Comment_8355(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.context_ = bs;
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
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
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Comment_8355.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasContext() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContext() {
         Object ref = this.context_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.context_ = s;
            }

            return s;
         }
      }

      public ByteString getContextBytes() {
         Object ref = this.context_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.context_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
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
         } else if (!this.hasContext()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
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

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.context_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.context_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Comment_8355)) {
            return super.equals(obj);
         } else {
            S2CR_Comment_8355 other = (S2CR_Comment_8355)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasContext() != other.hasContext()) {
               return false;
            } else if (this.hasContext() && !this.getContext().equals(other.getContext())) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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

            if (this.hasContext()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContext().hashCode();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Comment_8355 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data);
      }

      public static S2CR_Comment_8355 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Comment_8355 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data);
      }

      public static S2CR_Comment_8355 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Comment_8355 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data);
      }

      public static S2CR_Comment_8355 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Comment_8355)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Comment_8355 parseFrom(InputStream input) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Comment_8355 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Comment_8355 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Comment_8355 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Comment_8355 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Comment_8355 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Comment_8355)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Comment_8355 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Comment_8355 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Comment_8355> parser() {
         return PARSER;
      }

      public Parser<S2CR_Comment_8355> getParserForType() {
         return PARSER;
      }

      public S2CR_Comment_8355 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Comment_8355OrBuilder {
         private int bitField0_;
         private int heroId_;
         private Object context_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Comment_8355.class, Builder.class);
         }

         private Builder() {
            this.context_ = "";
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.context_ = "";
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroCommentMsg.S2CR_Comment_8355.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.context_ = "";
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_Comment_8355_descriptor;
         }

         public S2CR_Comment_8355 getDefaultInstanceForType() {
            return CrossHeroCommentMsg.S2CR_Comment_8355.getDefaultInstance();
         }

         public S2CR_Comment_8355 build() {
            S2CR_Comment_8355 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Comment_8355 buildPartial() {
            S2CR_Comment_8355 result = new S2CR_Comment_8355(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.context_ = this.context_;
            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof S2CR_Comment_8355) {
               return this.mergeFrom((S2CR_Comment_8355)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Comment_8355 other) {
            if (other == CrossHeroCommentMsg.S2CR_Comment_8355.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasContext()) {
                  this.bitField0_ |= 2;
                  this.context_ = other.context_;
                  this.onChanged();
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasContext()) {
               return false;
            } else {
               return this.hasPlayerName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Comment_8355 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Comment_8355)CrossHeroCommentMsg.S2CR_Comment_8355.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Comment_8355)e.getUnfinishedMessage();
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

         public boolean hasContext() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContext() {
            Object ref = this.context_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.context_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContextBytes() {
            Object ref = this.context_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.context_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContext(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContext() {
            this.bitField0_ &= -3;
            this.context_ = CrossHeroCommentMsg.S2CR_Comment_8355.getDefaultInstance().getContext();
            this.onChanged();
            return this;
         }

         public Builder setContextBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = CrossHeroCommentMsg.S2CR_Comment_8355.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
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

   public static final class S2CR_ThumbsUp_8357 extends GeneratedMessageV3 implements S2CR_ThumbsUp_8357OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int OPERATION_FIELD_NUMBER = 3;
      private int operation_;
      private byte memoizedIsInitialized;
      private static final S2CR_ThumbsUp_8357 DEFAULT_INSTANCE = new S2CR_ThumbsUp_8357();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ThumbsUp_8357> PARSER = new AbstractParser<S2CR_ThumbsUp_8357>() {
         public S2CR_ThumbsUp_8357 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ThumbsUp_8357(input, extensionRegistry);
         }
      };

      private S2CR_ThumbsUp_8357(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ThumbsUp_8357() {
         this.memoizedIsInitialized = -1;
         this.operation_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ThumbsUp_8357();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ThumbsUp_8357(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        HeroCommentMsg.CommentOperation value = HeroCommentMsg.CommentOperation.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.operation_ = rawValue;
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
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ThumbsUp_8357.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasOperation() {
         return (this.bitField0_ & 4) != 0;
      }

      public HeroCommentMsg.CommentOperation getOperation() {
         HeroCommentMsg.CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
         return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOperation()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.operation_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.operation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ThumbsUp_8357)) {
            return super.equals(obj);
         } else {
            S2CR_ThumbsUp_8357 other = (S2CR_ThumbsUp_8357)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasOperation() != other.hasOperation()) {
               return false;
            } else if (this.hasOperation() && this.operation_ != other.operation_) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasOperation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.operation_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ThumbsUp_8357 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_8357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(InputStream input) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ThumbsUp_8357 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_8357 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_8357 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_8357)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ThumbsUp_8357 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ThumbsUp_8357 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ThumbsUp_8357> parser() {
         return PARSER;
      }

      public Parser<S2CR_ThumbsUp_8357> getParserForType() {
         return PARSER;
      }

      public S2CR_ThumbsUp_8357 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ThumbsUp_8357OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int code_;
         private int operation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ThumbsUp_8357.class, Builder.class);
         }

         private Builder() {
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.operation_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroCommentMsg.S2CR_ThumbsUp_8357.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.operation_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_ThumbsUp_8357_descriptor;
         }

         public S2CR_ThumbsUp_8357 getDefaultInstanceForType() {
            return CrossHeroCommentMsg.S2CR_ThumbsUp_8357.getDefaultInstance();
         }

         public S2CR_ThumbsUp_8357 build() {
            S2CR_ThumbsUp_8357 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ThumbsUp_8357 buildPartial() {
            S2CR_ThumbsUp_8357 result = new S2CR_ThumbsUp_8357(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.operation_ = this.operation_;
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
            if (other instanceof S2CR_ThumbsUp_8357) {
               return this.mergeFrom((S2CR_ThumbsUp_8357)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ThumbsUp_8357 other) {
            if (other == CrossHeroCommentMsg.S2CR_ThumbsUp_8357.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasOperation()) {
                  this.setOperation(other.getOperation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasOperation();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ThumbsUp_8357 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ThumbsUp_8357)CrossHeroCommentMsg.S2CR_ThumbsUp_8357.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ThumbsUp_8357)e.getUnfinishedMessage();
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

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOperation() {
            return (this.bitField0_ & 4) != 0;
         }

         public HeroCommentMsg.CommentOperation getOperation() {
            HeroCommentMsg.CommentOperation result = HeroCommentMsg.CommentOperation.valueOf(this.operation_);
            return result == null ? HeroCommentMsg.CommentOperation.OPERATION_NO : result;
         }

         public Builder setOperation(HeroCommentMsg.CommentOperation value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.operation_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearOperation() {
            this.bitField0_ &= -5;
            this.operation_ = 0;
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

   public static final class S2CR_DelComment_8359 extends GeneratedMessageV3 implements S2CR_DelComment_8359OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2CR_DelComment_8359 DEFAULT_INSTANCE = new S2CR_DelComment_8359();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DelComment_8359> PARSER = new AbstractParser<S2CR_DelComment_8359>() {
         public S2CR_DelComment_8359 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DelComment_8359(input, extensionRegistry);
         }
      };

      private S2CR_DelComment_8359(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DelComment_8359() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DelComment_8359();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DelComment_8359(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
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
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DelComment_8359.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DelComment_8359)) {
            return super.equals(obj);
         } else {
            S2CR_DelComment_8359 other = (S2CR_DelComment_8359)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DelComment_8359 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data);
      }

      public static S2CR_DelComment_8359 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DelComment_8359 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data);
      }

      public static S2CR_DelComment_8359 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DelComment_8359 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data);
      }

      public static S2CR_DelComment_8359 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DelComment_8359)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DelComment_8359 parseFrom(InputStream input) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DelComment_8359 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DelComment_8359 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DelComment_8359 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DelComment_8359 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DelComment_8359 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DelComment_8359)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DelComment_8359 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DelComment_8359 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DelComment_8359> parser() {
         return PARSER;
      }

      public Parser<S2CR_DelComment_8359> getParserForType() {
         return PARSER;
      }

      public S2CR_DelComment_8359 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DelComment_8359OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DelComment_8359.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossHeroCommentMsg.S2CR_DelComment_8359.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossHeroCommentMsg.internal_static_crossHerocomment_com_gzbz_protobuf_S2CR_DelComment_8359_descriptor;
         }

         public S2CR_DelComment_8359 getDefaultInstanceForType() {
            return CrossHeroCommentMsg.S2CR_DelComment_8359.getDefaultInstance();
         }

         public S2CR_DelComment_8359 build() {
            S2CR_DelComment_8359 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DelComment_8359 buildPartial() {
            S2CR_DelComment_8359 result = new S2CR_DelComment_8359(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2CR_DelComment_8359) {
               return this.mergeFrom((S2CR_DelComment_8359)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DelComment_8359 other) {
            if (other == CrossHeroCommentMsg.S2CR_DelComment_8359.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_DelComment_8359 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DelComment_8359)CrossHeroCommentMsg.S2CR_DelComment_8359.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DelComment_8359)e.getUnfinishedMessage();
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

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
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

   public interface S2CR_Click_8353OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface S2CR_Comment_8355OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasContext();

      String getContext();

      ByteString getContextBytes();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2CR_DelComment_8359OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();
   }

   public interface S2CR_OpenUi_8351OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasType();

      int getType();
   }

   public interface S2CR_ThumbsUp_8357OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasCode();

      int getCode();

      boolean hasOperation();

      HeroCommentMsg.CommentOperation getOperation();
   }
}
