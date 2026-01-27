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

public final class SacrificeMsg {
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SacrificeMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fSacrifice.proto\u0012\u001bsacrifice.com.gzbz.protobuf\u001a\fcommon.proto\"&\n\u0016C2S_SacrificeHero_8501\u0012\f\n\u0004code\u0018\u0001 \u0003(\u0005\"W\n\u0018S2C_SacrificeReward_8502\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\f\n\u0004rare\u0018\u0003 \u0001(\b\"3\n\u0016C2S_SacrificeSoul_8503\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"D\n\u0019C2S_SacrificeOperate_8505\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0003(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0001(\u0005\")\n\u0019S2C_SacrificeOperate_8506\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SacrificeQuick_8507B#\n\u0011com.gzbz.protobufB\fSacrificeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor, new String[]{"Code"});
      internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor, new String[]{"Type", "Items", "Rare"});
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor, new String[]{"Code", "Num"});
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor, new String[]{"Type", "Code", "Num"});
      internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor, new String[]{"Type"});
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor, new String[0]);
      CommonMsg.getDescriptor();
   }

   public static final class C2S_SacrificeHero_8501 extends GeneratedMessageV3 implements C2S_SacrificeHero_8501OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODE_FIELD_NUMBER = 1;
      private Internal.IntList code_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeHero_8501 DEFAULT_INSTANCE = new C2S_SacrificeHero_8501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeHero_8501> PARSER = new AbstractParser<C2S_SacrificeHero_8501>() {
         public C2S_SacrificeHero_8501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeHero_8501(input, extensionRegistry);
         }
      };

      private C2S_SacrificeHero_8501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeHero_8501() {
         this.memoizedIsInitialized = -1;
         this.code_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeHero_8501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeHero_8501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.code_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.code_.addInt(input.readInt32());
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
                  this.code_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeHero_8501.class, Builder.class);
      }

      public List<Integer> getCodeList() {
         return this.code_;
      }

      public int getCodeCount() {
         return this.code_.size();
      }

      public int getCode(int index) {
         return this.code_.getInt(index);
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
         for(int i = 0; i < this.code_.size(); ++i) {
            output.writeInt32(1, this.code_.getInt(i));
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

            for(int i = 0; i < this.code_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.code_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SacrificeHero_8501)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeHero_8501 other = (C2S_SacrificeHero_8501)obj;
            if (!this.getCodeList().equals(other.getCodeList())) {
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
            if (this.getCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SacrificeHero_8501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeHero_8501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeHero_8501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeHero_8501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeHero_8501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeHero_8501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeHero_8501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeHero_8501 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeHero_8501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeHero_8501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeHero_8501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeHero_8501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeHero_8501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeHero_8501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeHero_8501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeHero_8501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeHero_8501> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeHero_8501> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeHero_8501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeHero_8501OrBuilder {
         private int bitField0_;
         private Internal.IntList code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeHero_8501.class, Builder.class);
         }

         private Builder() {
            this.code_ = SacrificeMsg.C2S_SacrificeHero_8501.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = SacrificeMsg.C2S_SacrificeHero_8501.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.C2S_SacrificeHero_8501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = SacrificeMsg.C2S_SacrificeHero_8501.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeHero_8501_descriptor;
         }

         public C2S_SacrificeHero_8501 getDefaultInstanceForType() {
            return SacrificeMsg.C2S_SacrificeHero_8501.getDefaultInstance();
         }

         public C2S_SacrificeHero_8501 build() {
            C2S_SacrificeHero_8501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeHero_8501 buildPartial() {
            C2S_SacrificeHero_8501 result = new C2S_SacrificeHero_8501(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.code_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.code_ = this.code_;
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
            if (other instanceof C2S_SacrificeHero_8501) {
               return this.mergeFrom((C2S_SacrificeHero_8501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeHero_8501 other) {
            if (other == SacrificeMsg.C2S_SacrificeHero_8501.getDefaultInstance()) {
               return this;
            } else {
               if (!other.code_.isEmpty()) {
                  if (this.code_.isEmpty()) {
                     this.code_ = other.code_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodeIsMutable();
                     this.code_.addAll(other.code_);
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
            C2S_SacrificeHero_8501 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeHero_8501)SacrificeMsg.C2S_SacrificeHero_8501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeHero_8501)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.code_ = SacrificeMsg.C2S_SacrificeHero_8501.mutableCopy(this.code_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.code_) : this.code_);
         }

         public int getCodeCount() {
            return this.code_.size();
         }

         public int getCode(int index) {
            return this.code_.getInt(index);
         }

         public Builder setCode(int index, int value) {
            this.ensureCodeIsMutable();
            this.code_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCode(int value) {
            this.ensureCodeIsMutable();
            this.code_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCode(Iterable<? extends Integer> values) {
            this.ensureCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.code_);
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.code_ = SacrificeMsg.C2S_SacrificeHero_8501.emptyIntList();
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

   public static final class S2C_SacrificeReward_8502 extends GeneratedMessageV3 implements S2C_SacrificeReward_8502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> items_;
      public static final int RARE_FIELD_NUMBER = 3;
      private boolean rare_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeReward_8502 DEFAULT_INSTANCE = new S2C_SacrificeReward_8502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeReward_8502> PARSER = new AbstractParser<S2C_SacrificeReward_8502>() {
         public S2C_SacrificeReward_8502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeReward_8502(input, extensionRegistry);
         }
      };

      private S2C_SacrificeReward_8502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeReward_8502() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeReward_8502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeReward_8502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.rare_ = input.readBool();
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeReward_8502.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public boolean hasRare() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getRare() {
         return this.rare_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.items_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.rare_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.items_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.rare_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeReward_8502)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeReward_8502 other = (S2C_SacrificeReward_8502)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
               return false;
            } else if (this.hasRare() != other.hasRare()) {
               return false;
            } else if (this.hasRare() && this.getRare() != other.getRare()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            if (this.hasRare()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getRare());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeReward_8502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_8502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_8502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_8502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_8502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_8502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_8502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_8502 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_8502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeReward_8502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_8502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeReward_8502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_8502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_8502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeReward_8502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeReward_8502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeReward_8502> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeReward_8502> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeReward_8502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeReward_8502OrBuilder {
         private int bitField0_;
         private int type_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;
         private boolean rare_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeReward_8502.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.S2C_SacrificeReward_8502.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemsBuilder_.clear();
            }

            this.rare_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeReward_8502_descriptor;
         }

         public S2C_SacrificeReward_8502 getDefaultInstanceForType() {
            return SacrificeMsg.S2C_SacrificeReward_8502.getDefaultInstance();
         }

         public S2C_SacrificeReward_8502 build() {
            S2C_SacrificeReward_8502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeReward_8502 buildPartial() {
            S2C_SacrificeReward_8502 result = new S2C_SacrificeReward_8502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -3;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rare_ = this.rare_;
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
            if (other instanceof S2C_SacrificeReward_8502) {
               return this.mergeFrom((S2C_SacrificeReward_8502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeReward_8502 other) {
            if (other == SacrificeMsg.S2C_SacrificeReward_8502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -3;
                     this.itemsBuilder_ = SacrificeMsg.S2C_SacrificeReward_8502.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               if (other.hasRare()) {
                  this.setRare(other.getRare());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeReward_8502 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeReward_8502)SacrificeMsg.S2C_SacrificeReward_8502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeReward_8502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public boolean hasRare() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getRare() {
            return this.rare_;
         }

         public Builder setRare(boolean value) {
            this.bitField0_ |= 4;
            this.rare_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRare() {
            this.bitField0_ &= -5;
            this.rare_ = false;
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

   public static final class C2S_SacrificeSoul_8503 extends GeneratedMessageV3 implements C2S_SacrificeSoul_8503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeSoul_8503 DEFAULT_INSTANCE = new C2S_SacrificeSoul_8503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeSoul_8503> PARSER = new AbstractParser<C2S_SacrificeSoul_8503>() {
         public C2S_SacrificeSoul_8503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeSoul_8503(input, extensionRegistry);
         }
      };

      private C2S_SacrificeSoul_8503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeSoul_8503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeSoul_8503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeSoul_8503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
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
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeSoul_8503.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SacrificeSoul_8503)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeSoul_8503 other = (C2S_SacrificeSoul_8503)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SacrificeSoul_8503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeSoul_8503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeSoul_8503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeSoul_8503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeSoul_8503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeSoul_8503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeSoul_8503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeSoul_8503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeSoul_8503> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeSoul_8503> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeSoul_8503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeSoul_8503OrBuilder {
         private int bitField0_;
         private int code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeSoul_8503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.C2S_SacrificeSoul_8503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeSoul_8503_descriptor;
         }

         public C2S_SacrificeSoul_8503 getDefaultInstanceForType() {
            return SacrificeMsg.C2S_SacrificeSoul_8503.getDefaultInstance();
         }

         public C2S_SacrificeSoul_8503 build() {
            C2S_SacrificeSoul_8503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeSoul_8503 buildPartial() {
            C2S_SacrificeSoul_8503 result = new C2S_SacrificeSoul_8503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_SacrificeSoul_8503) {
               return this.mergeFrom((C2S_SacrificeSoul_8503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeSoul_8503 other) {
            if (other == SacrificeMsg.C2S_SacrificeSoul_8503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SacrificeSoul_8503 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeSoul_8503)SacrificeMsg.C2S_SacrificeSoul_8503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeSoul_8503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
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

   public static final class C2S_SacrificeOperate_8505 extends GeneratedMessageV3 implements C2S_SacrificeOperate_8505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int CODE_FIELD_NUMBER = 2;
      private Internal.IntList code_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeOperate_8505 DEFAULT_INSTANCE = new C2S_SacrificeOperate_8505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeOperate_8505> PARSER = new AbstractParser<C2S_SacrificeOperate_8505>() {
         public C2S_SacrificeOperate_8505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeOperate_8505(input, extensionRegistry);
         }
      };

      private C2S_SacrificeOperate_8505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeOperate_8505() {
         this.memoizedIsInitialized = -1;
         this.code_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeOperate_8505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeOperate_8505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.code_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.code_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.code_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeOperate_8505.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getCodeList() {
         return this.code_;
      }

      public int getCodeCount() {
         return this.code_.size();
      }

      public int getCode(int index) {
         return this.code_.getInt(index);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.code_.size(); ++i) {
            output.writeInt32(2, this.code_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.code_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.code_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodeList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SacrificeOperate_8505)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeOperate_8505 other = (C2S_SacrificeOperate_8505)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getCodeList().equals(other.getCodeList())) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.getCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodeList().hashCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SacrificeOperate_8505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeOperate_8505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeOperate_8505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeOperate_8505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeOperate_8505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeOperate_8505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeOperate_8505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeOperate_8505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeOperate_8505> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeOperate_8505> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeOperate_8505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeOperate_8505OrBuilder {
         private int bitField0_;
         private int type_;
         private Internal.IntList code_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeOperate_8505.class, Builder.class);
         }

         private Builder() {
            this.code_ = SacrificeMsg.C2S_SacrificeOperate_8505.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = SacrificeMsg.C2S_SacrificeOperate_8505.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.C2S_SacrificeOperate_8505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.code_ = SacrificeMsg.C2S_SacrificeOperate_8505.emptyIntList();
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeOperate_8505_descriptor;
         }

         public C2S_SacrificeOperate_8505 getDefaultInstanceForType() {
            return SacrificeMsg.C2S_SacrificeOperate_8505.getDefaultInstance();
         }

         public C2S_SacrificeOperate_8505 build() {
            C2S_SacrificeOperate_8505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeOperate_8505 buildPartial() {
            C2S_SacrificeOperate_8505 result = new C2S_SacrificeOperate_8505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.code_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.code_ = this.code_;
            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_SacrificeOperate_8505) {
               return this.mergeFrom((C2S_SacrificeOperate_8505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeOperate_8505 other) {
            if (other == SacrificeMsg.C2S_SacrificeOperate_8505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.code_.isEmpty()) {
                  if (this.code_.isEmpty()) {
                     this.code_ = other.code_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCodeIsMutable();
                     this.code_.addAll(other.code_);
                  }

                  this.onChanged();
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SacrificeOperate_8505 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeOperate_8505)SacrificeMsg.C2S_SacrificeOperate_8505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeOperate_8505)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.code_ = SacrificeMsg.C2S_SacrificeOperate_8505.mutableCopy(this.code_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.code_) : this.code_);
         }

         public int getCodeCount() {
            return this.code_.size();
         }

         public int getCode(int index) {
            return this.code_.getInt(index);
         }

         public Builder setCode(int index, int value) {
            this.ensureCodeIsMutable();
            this.code_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCode(int value) {
            this.ensureCodeIsMutable();
            this.code_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCode(Iterable<? extends Integer> values) {
            this.ensureCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.code_);
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.code_ = SacrificeMsg.C2S_SacrificeOperate_8505.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
            this.num_ = 0;
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

   public static final class S2C_SacrificeOperate_8506 extends GeneratedMessageV3 implements S2C_SacrificeOperate_8506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeOperate_8506 DEFAULT_INSTANCE = new S2C_SacrificeOperate_8506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeOperate_8506> PARSER = new AbstractParser<S2C_SacrificeOperate_8506>() {
         public S2C_SacrificeOperate_8506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeOperate_8506(input, extensionRegistry);
         }
      };

      private S2C_SacrificeOperate_8506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeOperate_8506() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeOperate_8506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeOperate_8506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeOperate_8506.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeOperate_8506)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeOperate_8506 other = (S2C_SacrificeOperate_8506)obj;
            if (this.hasType() != other.hasType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeOperate_8506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeOperate_8506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeOperate_8506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeOperate_8506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeOperate_8506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeOperate_8506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeOperate_8506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeOperate_8506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeOperate_8506> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeOperate_8506> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeOperate_8506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeOperate_8506OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeOperate_8506.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.S2C_SacrificeOperate_8506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_S2C_SacrificeOperate_8506_descriptor;
         }

         public S2C_SacrificeOperate_8506 getDefaultInstanceForType() {
            return SacrificeMsg.S2C_SacrificeOperate_8506.getDefaultInstance();
         }

         public S2C_SacrificeOperate_8506 build() {
            S2C_SacrificeOperate_8506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeOperate_8506 buildPartial() {
            S2C_SacrificeOperate_8506 result = new S2C_SacrificeOperate_8506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_SacrificeOperate_8506) {
               return this.mergeFrom((S2C_SacrificeOperate_8506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeOperate_8506 other) {
            if (other == SacrificeMsg.S2C_SacrificeOperate_8506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeOperate_8506 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeOperate_8506)SacrificeMsg.S2C_SacrificeOperate_8506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeOperate_8506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
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

   public static final class C2S_SacrificeQuick_8507 extends GeneratedMessageV3 implements C2S_SacrificeQuick_8507OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeQuick_8507 DEFAULT_INSTANCE = new C2S_SacrificeQuick_8507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeQuick_8507> PARSER = new AbstractParser<C2S_SacrificeQuick_8507>() {
         public C2S_SacrificeQuick_8507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeQuick_8507(input, extensionRegistry);
         }
      };

      private C2S_SacrificeQuick_8507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeQuick_8507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeQuick_8507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeQuick_8507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeQuick_8507.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SacrificeQuick_8507)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeQuick_8507 other = (C2S_SacrificeQuick_8507)obj;
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

      public static C2S_SacrificeQuick_8507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeQuick_8507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeQuick_8507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeQuick_8507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeQuick_8507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeQuick_8507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeQuick_8507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeQuick_8507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeQuick_8507> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeQuick_8507> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeQuick_8507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeQuick_8507OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeQuick_8507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SacrificeMsg.C2S_SacrificeQuick_8507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SacrificeMsg.internal_static_sacrifice_com_gzbz_protobuf_C2S_SacrificeQuick_8507_descriptor;
         }

         public C2S_SacrificeQuick_8507 getDefaultInstanceForType() {
            return SacrificeMsg.C2S_SacrificeQuick_8507.getDefaultInstance();
         }

         public C2S_SacrificeQuick_8507 build() {
            C2S_SacrificeQuick_8507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeQuick_8507 buildPartial() {
            C2S_SacrificeQuick_8507 result = new C2S_SacrificeQuick_8507(this);
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
            if (other instanceof C2S_SacrificeQuick_8507) {
               return this.mergeFrom((C2S_SacrificeQuick_8507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeQuick_8507 other) {
            if (other == SacrificeMsg.C2S_SacrificeQuick_8507.getDefaultInstance()) {
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
            C2S_SacrificeQuick_8507 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeQuick_8507)SacrificeMsg.C2S_SacrificeQuick_8507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeQuick_8507)e.getUnfinishedMessage();
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

   public interface C2S_SacrificeHero_8501OrBuilder extends MessageOrBuilder {
      List<Integer> getCodeList();

      int getCodeCount();

      int getCode(int index);
   }

   public interface C2S_SacrificeOperate_8505OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<Integer> getCodeList();

      int getCodeCount();

      int getCode(int index);

      boolean hasNum();

      int getNum();
   }

   public interface C2S_SacrificeQuick_8507OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SacrificeSoul_8503OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_SacrificeOperate_8506OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2C_SacrificeReward_8502OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);

      boolean hasRare();

      boolean getRare();
   }
}
