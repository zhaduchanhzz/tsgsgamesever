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

public final class WorldPaintMsg {
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WorldPaintMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010WorldPaint.proto\u0012\u001cworldPaint.com.gzbz.protobuf\"\u0019\n\u0017C2S_WorldPaintMsg_23501\"[\n\u0017S2C_WorldPaintMsg_23502\u0012@\n\nworldPaint\u0018\u0001 \u0003(\u000b2,.worldPaint.com.gzbz.protobuf.WorldPaintInfo\"9\n\u000eWorldPaintInfo\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005grade\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\".\n\u001eC2S_WorldPaintStrengthen_23503\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\" \n\u001eS2C_WorldPaintStrengthen_23504\"0\n S2C_WorldPaintUnlockNotice_23505\u0012\f\n\u0004type\u0018\u0001 \u0003(\u0005B$\n\u0011com.gzbz.protobufB\rWorldPaintMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor, new String[0]);
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor, new String[]{"WorldPaint"});
      internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor, new String[]{"Type", "Grade", "Lv"});
      internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor, new String[]{"Type"});
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor, new String[0]);
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor, new String[]{"Type"});
   }

   public static final class C2S_WorldPaintMsg_23501 extends GeneratedMessageV3 implements C2S_WorldPaintMsg_23501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WorldPaintMsg_23501 DEFAULT_INSTANCE = new C2S_WorldPaintMsg_23501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WorldPaintMsg_23501> PARSER = new AbstractParser<C2S_WorldPaintMsg_23501>() {
         public C2S_WorldPaintMsg_23501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WorldPaintMsg_23501(input, extensionRegistry);
         }
      };

      private C2S_WorldPaintMsg_23501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WorldPaintMsg_23501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WorldPaintMsg_23501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WorldPaintMsg_23501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WorldPaintMsg_23501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WorldPaintMsg_23501)) {
            return super.equals(obj);
         } else {
            C2S_WorldPaintMsg_23501 other = (C2S_WorldPaintMsg_23501)obj;
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

      public static C2S_WorldPaintMsg_23501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintMsg_23501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(InputStream input) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WorldPaintMsg_23501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintMsg_23501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintMsg_23501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintMsg_23501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WorldPaintMsg_23501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WorldPaintMsg_23501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WorldPaintMsg_23501> parser() {
         return PARSER;
      }

      public Parser<C2S_WorldPaintMsg_23501> getParserForType() {
         return PARSER;
      }

      public C2S_WorldPaintMsg_23501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WorldPaintMsg_23501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WorldPaintMsg_23501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.C2S_WorldPaintMsg_23501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintMsg_23501_descriptor;
         }

         public C2S_WorldPaintMsg_23501 getDefaultInstanceForType() {
            return WorldPaintMsg.C2S_WorldPaintMsg_23501.getDefaultInstance();
         }

         public C2S_WorldPaintMsg_23501 build() {
            C2S_WorldPaintMsg_23501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WorldPaintMsg_23501 buildPartial() {
            C2S_WorldPaintMsg_23501 result = new C2S_WorldPaintMsg_23501(this);
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
            if (other instanceof C2S_WorldPaintMsg_23501) {
               return this.mergeFrom((C2S_WorldPaintMsg_23501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WorldPaintMsg_23501 other) {
            if (other == WorldPaintMsg.C2S_WorldPaintMsg_23501.getDefaultInstance()) {
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
            C2S_WorldPaintMsg_23501 parsedMessage = null;

            try {
               parsedMessage = (C2S_WorldPaintMsg_23501)WorldPaintMsg.C2S_WorldPaintMsg_23501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WorldPaintMsg_23501)e.getUnfinishedMessage();
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

   public static final class S2C_WorldPaintMsg_23502 extends GeneratedMessageV3 implements S2C_WorldPaintMsg_23502OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int WORLDPAINT_FIELD_NUMBER = 1;
      private List<WorldPaintInfo> worldPaint_;
      private byte memoizedIsInitialized;
      private static final S2C_WorldPaintMsg_23502 DEFAULT_INSTANCE = new S2C_WorldPaintMsg_23502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WorldPaintMsg_23502> PARSER = new AbstractParser<S2C_WorldPaintMsg_23502>() {
         public S2C_WorldPaintMsg_23502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WorldPaintMsg_23502(input, extensionRegistry);
         }
      };

      private S2C_WorldPaintMsg_23502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WorldPaintMsg_23502() {
         this.memoizedIsInitialized = -1;
         this.worldPaint_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WorldPaintMsg_23502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WorldPaintMsg_23502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.worldPaint_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.worldPaint_.add(input.readMessage(WorldPaintMsg.WorldPaintInfo.PARSER, extensionRegistry));
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
                  this.worldPaint_ = Collections.unmodifiableList(this.worldPaint_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintMsg_23502.class, Builder.class);
      }

      public List<WorldPaintInfo> getWorldPaintList() {
         return this.worldPaint_;
      }

      public List<? extends WorldPaintInfoOrBuilder> getWorldPaintOrBuilderList() {
         return this.worldPaint_;
      }

      public int getWorldPaintCount() {
         return this.worldPaint_.size();
      }

      public WorldPaintInfo getWorldPaint(int index) {
         return (WorldPaintInfo)this.worldPaint_.get(index);
      }

      public WorldPaintInfoOrBuilder getWorldPaintOrBuilder(int index) {
         return (WorldPaintInfoOrBuilder)this.worldPaint_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getWorldPaintCount(); ++i) {
               if (!this.getWorldPaint(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.worldPaint_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.worldPaint_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.worldPaint_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.worldPaint_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WorldPaintMsg_23502)) {
            return super.equals(obj);
         } else {
            S2C_WorldPaintMsg_23502 other = (S2C_WorldPaintMsg_23502)obj;
            if (!this.getWorldPaintList().equals(other.getWorldPaintList())) {
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
            if (this.getWorldPaintCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWorldPaintList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintMsg_23502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintMsg_23502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintMsg_23502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintMsg_23502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintMsg_23502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WorldPaintMsg_23502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WorldPaintMsg_23502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WorldPaintMsg_23502> parser() {
         return PARSER;
      }

      public Parser<S2C_WorldPaintMsg_23502> getParserForType() {
         return PARSER;
      }

      public S2C_WorldPaintMsg_23502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WorldPaintMsg_23502OrBuilder {
         private int bitField0_;
         private List<WorldPaintInfo> worldPaint_;
         private RepeatedFieldBuilderV3<WorldPaintInfo, WorldPaintInfo.Builder, WorldPaintInfoOrBuilder> worldPaintBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintMsg_23502.class, Builder.class);
         }

         private Builder() {
            this.worldPaint_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.worldPaint_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.S2C_WorldPaintMsg_23502.alwaysUseFieldBuilders) {
               this.getWorldPaintFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.worldPaintBuilder_ == null) {
               this.worldPaint_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.worldPaintBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintMsg_23502_descriptor;
         }

         public S2C_WorldPaintMsg_23502 getDefaultInstanceForType() {
            return WorldPaintMsg.S2C_WorldPaintMsg_23502.getDefaultInstance();
         }

         public S2C_WorldPaintMsg_23502 build() {
            S2C_WorldPaintMsg_23502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WorldPaintMsg_23502 buildPartial() {
            S2C_WorldPaintMsg_23502 result = new S2C_WorldPaintMsg_23502(this);
            int from_bitField0_ = this.bitField0_;
            if (this.worldPaintBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.worldPaint_ = Collections.unmodifiableList(this.worldPaint_);
                  this.bitField0_ &= -2;
               }

               result.worldPaint_ = this.worldPaint_;
            } else {
               result.worldPaint_ = this.worldPaintBuilder_.build();
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
            if (other instanceof S2C_WorldPaintMsg_23502) {
               return this.mergeFrom((S2C_WorldPaintMsg_23502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WorldPaintMsg_23502 other) {
            if (other == WorldPaintMsg.S2C_WorldPaintMsg_23502.getDefaultInstance()) {
               return this;
            } else {
               if (this.worldPaintBuilder_ == null) {
                  if (!other.worldPaint_.isEmpty()) {
                     if (this.worldPaint_.isEmpty()) {
                        this.worldPaint_ = other.worldPaint_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureWorldPaintIsMutable();
                        this.worldPaint_.addAll(other.worldPaint_);
                     }

                     this.onChanged();
                  }
               } else if (!other.worldPaint_.isEmpty()) {
                  if (this.worldPaintBuilder_.isEmpty()) {
                     this.worldPaintBuilder_.dispose();
                     this.worldPaintBuilder_ = null;
                     this.worldPaint_ = other.worldPaint_;
                     this.bitField0_ &= -2;
                     this.worldPaintBuilder_ = WorldPaintMsg.S2C_WorldPaintMsg_23502.alwaysUseFieldBuilders ? this.getWorldPaintFieldBuilder() : null;
                  } else {
                     this.worldPaintBuilder_.addAllMessages(other.worldPaint_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getWorldPaintCount(); ++i) {
               if (!this.getWorldPaint(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WorldPaintMsg_23502 parsedMessage = null;

            try {
               parsedMessage = (S2C_WorldPaintMsg_23502)WorldPaintMsg.S2C_WorldPaintMsg_23502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WorldPaintMsg_23502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureWorldPaintIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.worldPaint_ = new ArrayList(this.worldPaint_);
               this.bitField0_ |= 1;
            }

         }

         public List<WorldPaintInfo> getWorldPaintList() {
            return this.worldPaintBuilder_ == null ? Collections.unmodifiableList(this.worldPaint_) : this.worldPaintBuilder_.getMessageList();
         }

         public int getWorldPaintCount() {
            return this.worldPaintBuilder_ == null ? this.worldPaint_.size() : this.worldPaintBuilder_.getCount();
         }

         public WorldPaintInfo getWorldPaint(int index) {
            return this.worldPaintBuilder_ == null ? (WorldPaintInfo)this.worldPaint_.get(index) : (WorldPaintInfo)this.worldPaintBuilder_.getMessage(index);
         }

         public Builder setWorldPaint(int index, WorldPaintInfo value) {
            if (this.worldPaintBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldPaintIsMutable();
               this.worldPaint_.set(index, value);
               this.onChanged();
            } else {
               this.worldPaintBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWorldPaint(int index, WorldPaintInfo.Builder builderForValue) {
            if (this.worldPaintBuilder_ == null) {
               this.ensureWorldPaintIsMutable();
               this.worldPaint_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldPaintBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWorldPaint(WorldPaintInfo value) {
            if (this.worldPaintBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldPaintIsMutable();
               this.worldPaint_.add(value);
               this.onChanged();
            } else {
               this.worldPaintBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWorldPaint(int index, WorldPaintInfo value) {
            if (this.worldPaintBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldPaintIsMutable();
               this.worldPaint_.add(index, value);
               this.onChanged();
            } else {
               this.worldPaintBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWorldPaint(WorldPaintInfo.Builder builderForValue) {
            if (this.worldPaintBuilder_ == null) {
               this.ensureWorldPaintIsMutable();
               this.worldPaint_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.worldPaintBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWorldPaint(int index, WorldPaintInfo.Builder builderForValue) {
            if (this.worldPaintBuilder_ == null) {
               this.ensureWorldPaintIsMutable();
               this.worldPaint_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldPaintBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWorldPaint(Iterable<? extends WorldPaintInfo> values) {
            if (this.worldPaintBuilder_ == null) {
               this.ensureWorldPaintIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.worldPaint_);
               this.onChanged();
            } else {
               this.worldPaintBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWorldPaint() {
            if (this.worldPaintBuilder_ == null) {
               this.worldPaint_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.worldPaintBuilder_.clear();
            }

            return this;
         }

         public Builder removeWorldPaint(int index) {
            if (this.worldPaintBuilder_ == null) {
               this.ensureWorldPaintIsMutable();
               this.worldPaint_.remove(index);
               this.onChanged();
            } else {
               this.worldPaintBuilder_.remove(index);
            }

            return this;
         }

         public WorldPaintInfo.Builder getWorldPaintBuilder(int index) {
            return (WorldPaintInfo.Builder)this.getWorldPaintFieldBuilder().getBuilder(index);
         }

         public WorldPaintInfoOrBuilder getWorldPaintOrBuilder(int index) {
            return this.worldPaintBuilder_ == null ? (WorldPaintInfoOrBuilder)this.worldPaint_.get(index) : (WorldPaintInfoOrBuilder)this.worldPaintBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WorldPaintInfoOrBuilder> getWorldPaintOrBuilderList() {
            return this.worldPaintBuilder_ != null ? this.worldPaintBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.worldPaint_);
         }

         public WorldPaintInfo.Builder addWorldPaintBuilder() {
            return (WorldPaintInfo.Builder)this.getWorldPaintFieldBuilder().addBuilder(WorldPaintMsg.WorldPaintInfo.getDefaultInstance());
         }

         public WorldPaintInfo.Builder addWorldPaintBuilder(int index) {
            return (WorldPaintInfo.Builder)this.getWorldPaintFieldBuilder().addBuilder(index, WorldPaintMsg.WorldPaintInfo.getDefaultInstance());
         }

         public List<WorldPaintInfo.Builder> getWorldPaintBuilderList() {
            return this.getWorldPaintFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WorldPaintInfo, WorldPaintInfo.Builder, WorldPaintInfoOrBuilder> getWorldPaintFieldBuilder() {
            if (this.worldPaintBuilder_ == null) {
               this.worldPaintBuilder_ = new RepeatedFieldBuilderV3(this.worldPaint_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.worldPaint_ = null;
            }

            return this.worldPaintBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class WorldPaintInfo extends GeneratedMessageV3 implements WorldPaintInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int GRADE_FIELD_NUMBER = 2;
      private int grade_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final WorldPaintInfo DEFAULT_INSTANCE = new WorldPaintInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<WorldPaintInfo> PARSER = new AbstractParser<WorldPaintInfo>() {
         public WorldPaintInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WorldPaintInfo(input, extensionRegistry);
         }
      };

      private WorldPaintInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WorldPaintInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WorldPaintInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WorldPaintInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.grade_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPaintInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGrade() {
         return this.grade_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.grade_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.grade_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WorldPaintInfo)) {
            return super.equals(obj);
         } else {
            WorldPaintInfo other = (WorldPaintInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasGrade()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGrade();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WorldPaintInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data);
      }

      public static WorldPaintInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WorldPaintInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data);
      }

      public static WorldPaintInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WorldPaintInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data);
      }

      public static WorldPaintInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WorldPaintInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WorldPaintInfo parseFrom(InputStream input) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WorldPaintInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WorldPaintInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WorldPaintInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WorldPaintInfo parseFrom(CodedInputStream input) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WorldPaintInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WorldPaintInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WorldPaintInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WorldPaintInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WorldPaintInfo> parser() {
         return PARSER;
      }

      public Parser<WorldPaintInfo> getParserForType() {
         return PARSER;
      }

      public WorldPaintInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldPaintInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private int grade_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPaintInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.WorldPaintInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.grade_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_WorldPaintInfo_descriptor;
         }

         public WorldPaintInfo getDefaultInstanceForType() {
            return WorldPaintMsg.WorldPaintInfo.getDefaultInstance();
         }

         public WorldPaintInfo build() {
            WorldPaintInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WorldPaintInfo buildPartial() {
            WorldPaintInfo result = new WorldPaintInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.grade_ = this.grade_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof WorldPaintInfo) {
               return this.mergeFrom((WorldPaintInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WorldPaintInfo other) {
            if (other == WorldPaintMsg.WorldPaintInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
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
            if (!this.hasType()) {
               return false;
            } else if (!this.hasGrade()) {
               return false;
            } else {
               return this.hasLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WorldPaintInfo parsedMessage = null;

            try {
               parsedMessage = (WorldPaintInfo)WorldPaintMsg.WorldPaintInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WorldPaintInfo)e.getUnfinishedMessage();
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

         public boolean hasGrade() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 2;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -3;
            this.grade_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
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

   public static final class C2S_WorldPaintStrengthen_23503 extends GeneratedMessageV3 implements C2S_WorldPaintStrengthen_23503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_WorldPaintStrengthen_23503 DEFAULT_INSTANCE = new C2S_WorldPaintStrengthen_23503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WorldPaintStrengthen_23503> PARSER = new AbstractParser<C2S_WorldPaintStrengthen_23503>() {
         public C2S_WorldPaintStrengthen_23503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WorldPaintStrengthen_23503(input, extensionRegistry);
         }
      };

      private C2S_WorldPaintStrengthen_23503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WorldPaintStrengthen_23503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WorldPaintStrengthen_23503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WorldPaintStrengthen_23503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WorldPaintStrengthen_23503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WorldPaintStrengthen_23503)) {
            return super.equals(obj);
         } else {
            C2S_WorldPaintStrengthen_23503 other = (C2S_WorldPaintStrengthen_23503)obj;
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

      public static C2S_WorldPaintStrengthen_23503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WorldPaintStrengthen_23503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(InputStream input) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WorldPaintStrengthen_23503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintStrengthen_23503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WorldPaintStrengthen_23503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WorldPaintStrengthen_23503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WorldPaintStrengthen_23503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WorldPaintStrengthen_23503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WorldPaintStrengthen_23503> parser() {
         return PARSER;
      }

      public Parser<C2S_WorldPaintStrengthen_23503> getParserForType() {
         return PARSER;
      }

      public C2S_WorldPaintStrengthen_23503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WorldPaintStrengthen_23503OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WorldPaintStrengthen_23503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.C2S_WorldPaintStrengthen_23503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_C2S_WorldPaintStrengthen_23503_descriptor;
         }

         public C2S_WorldPaintStrengthen_23503 getDefaultInstanceForType() {
            return WorldPaintMsg.C2S_WorldPaintStrengthen_23503.getDefaultInstance();
         }

         public C2S_WorldPaintStrengthen_23503 build() {
            C2S_WorldPaintStrengthen_23503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WorldPaintStrengthen_23503 buildPartial() {
            C2S_WorldPaintStrengthen_23503 result = new C2S_WorldPaintStrengthen_23503(this);
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
            if (other instanceof C2S_WorldPaintStrengthen_23503) {
               return this.mergeFrom((C2S_WorldPaintStrengthen_23503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WorldPaintStrengthen_23503 other) {
            if (other == WorldPaintMsg.C2S_WorldPaintStrengthen_23503.getDefaultInstance()) {
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
            C2S_WorldPaintStrengthen_23503 parsedMessage = null;

            try {
               parsedMessage = (C2S_WorldPaintStrengthen_23503)WorldPaintMsg.C2S_WorldPaintStrengthen_23503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WorldPaintStrengthen_23503)e.getUnfinishedMessage();
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

   public static final class S2C_WorldPaintStrengthen_23504 extends GeneratedMessageV3 implements S2C_WorldPaintStrengthen_23504OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_WorldPaintStrengthen_23504 DEFAULT_INSTANCE = new S2C_WorldPaintStrengthen_23504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WorldPaintStrengthen_23504> PARSER = new AbstractParser<S2C_WorldPaintStrengthen_23504>() {
         public S2C_WorldPaintStrengthen_23504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WorldPaintStrengthen_23504(input, extensionRegistry);
         }
      };

      private S2C_WorldPaintStrengthen_23504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WorldPaintStrengthen_23504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WorldPaintStrengthen_23504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WorldPaintStrengthen_23504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintStrengthen_23504.class, Builder.class);
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
         } else if (!(obj instanceof S2C_WorldPaintStrengthen_23504)) {
            return super.equals(obj);
         } else {
            S2C_WorldPaintStrengthen_23504 other = (S2C_WorldPaintStrengthen_23504)obj;
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

      public static S2C_WorldPaintStrengthen_23504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintStrengthen_23504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintStrengthen_23504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintStrengthen_23504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintStrengthen_23504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintStrengthen_23504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WorldPaintStrengthen_23504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WorldPaintStrengthen_23504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WorldPaintStrengthen_23504> parser() {
         return PARSER;
      }

      public Parser<S2C_WorldPaintStrengthen_23504> getParserForType() {
         return PARSER;
      }

      public S2C_WorldPaintStrengthen_23504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WorldPaintStrengthen_23504OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintStrengthen_23504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.S2C_WorldPaintStrengthen_23504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintStrengthen_23504_descriptor;
         }

         public S2C_WorldPaintStrengthen_23504 getDefaultInstanceForType() {
            return WorldPaintMsg.S2C_WorldPaintStrengthen_23504.getDefaultInstance();
         }

         public S2C_WorldPaintStrengthen_23504 build() {
            S2C_WorldPaintStrengthen_23504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WorldPaintStrengthen_23504 buildPartial() {
            S2C_WorldPaintStrengthen_23504 result = new S2C_WorldPaintStrengthen_23504(this);
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
            if (other instanceof S2C_WorldPaintStrengthen_23504) {
               return this.mergeFrom((S2C_WorldPaintStrengthen_23504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WorldPaintStrengthen_23504 other) {
            if (other == WorldPaintMsg.S2C_WorldPaintStrengthen_23504.getDefaultInstance()) {
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
            S2C_WorldPaintStrengthen_23504 parsedMessage = null;

            try {
               parsedMessage = (S2C_WorldPaintStrengthen_23504)WorldPaintMsg.S2C_WorldPaintStrengthen_23504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WorldPaintStrengthen_23504)e.getUnfinishedMessage();
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

   public static final class S2C_WorldPaintUnlockNotice_23505 extends GeneratedMessageV3 implements S2C_WorldPaintUnlockNotice_23505OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TYPE_FIELD_NUMBER = 1;
      private Internal.IntList type_;
      private byte memoizedIsInitialized;
      private static final S2C_WorldPaintUnlockNotice_23505 DEFAULT_INSTANCE = new S2C_WorldPaintUnlockNotice_23505();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WorldPaintUnlockNotice_23505> PARSER = new AbstractParser<S2C_WorldPaintUnlockNotice_23505>() {
         public S2C_WorldPaintUnlockNotice_23505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WorldPaintUnlockNotice_23505(input, extensionRegistry);
         }
      };

      private S2C_WorldPaintUnlockNotice_23505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WorldPaintUnlockNotice_23505() {
         this.memoizedIsInitialized = -1;
         this.type_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WorldPaintUnlockNotice_23505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WorldPaintUnlockNotice_23505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.type_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.type_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.type_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.type_.addInt(input.readInt32());
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
                  this.type_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintUnlockNotice_23505.class, Builder.class);
      }

      public List<Integer> getTypeList() {
         return this.type_;
      }

      public int getTypeCount() {
         return this.type_.size();
      }

      public int getType(int index) {
         return this.type_.getInt(index);
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
         for(int i = 0; i < this.type_.size(); ++i) {
            output.writeInt32(1, this.type_.getInt(i));
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

            for(int i = 0; i < this.type_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.type_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTypeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WorldPaintUnlockNotice_23505)) {
            return super.equals(obj);
         } else {
            S2C_WorldPaintUnlockNotice_23505 other = (S2C_WorldPaintUnlockNotice_23505)obj;
            if (!this.getTypeList().equals(other.getTypeList())) {
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
            if (this.getTypeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTypeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WorldPaintUnlockNotice_23505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WorldPaintUnlockNotice_23505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WorldPaintUnlockNotice_23505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WorldPaintUnlockNotice_23505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WorldPaintUnlockNotice_23505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WorldPaintUnlockNotice_23505> parser() {
         return PARSER;
      }

      public Parser<S2C_WorldPaintUnlockNotice_23505> getParserForType() {
         return PARSER;
      }

      public S2C_WorldPaintUnlockNotice_23505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WorldPaintUnlockNotice_23505OrBuilder {
         private int bitField0_;
         private Internal.IntList type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WorldPaintUnlockNotice_23505.class, Builder.class);
         }

         private Builder() {
            this.type_ = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldPaintMsg.internal_static_worldPaint_com_gzbz_protobuf_S2C_WorldPaintUnlockNotice_23505_descriptor;
         }

         public S2C_WorldPaintUnlockNotice_23505 getDefaultInstanceForType() {
            return WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.getDefaultInstance();
         }

         public S2C_WorldPaintUnlockNotice_23505 build() {
            S2C_WorldPaintUnlockNotice_23505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WorldPaintUnlockNotice_23505 buildPartial() {
            S2C_WorldPaintUnlockNotice_23505 result = new S2C_WorldPaintUnlockNotice_23505(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.type_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.type_ = this.type_;
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
            if (other instanceof S2C_WorldPaintUnlockNotice_23505) {
               return this.mergeFrom((S2C_WorldPaintUnlockNotice_23505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WorldPaintUnlockNotice_23505 other) {
            if (other == WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.getDefaultInstance()) {
               return this;
            } else {
               if (!other.type_.isEmpty()) {
                  if (this.type_.isEmpty()) {
                     this.type_ = other.type_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTypeIsMutable();
                     this.type_.addAll(other.type_);
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
            S2C_WorldPaintUnlockNotice_23505 parsedMessage = null;

            try {
               parsedMessage = (S2C_WorldPaintUnlockNotice_23505)WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WorldPaintUnlockNotice_23505)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTypeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.type_ = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.mutableCopy(this.type_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTypeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.type_) : this.type_);
         }

         public int getTypeCount() {
            return this.type_.size();
         }

         public int getType(int index) {
            return this.type_.getInt(index);
         }

         public Builder setType(int index, int value) {
            this.ensureTypeIsMutable();
            this.type_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addType(int value) {
            this.ensureTypeIsMutable();
            this.type_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllType(Iterable<? extends Integer> values) {
            this.ensureTypeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.type_);
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.type_ = WorldPaintMsg.S2C_WorldPaintUnlockNotice_23505.emptyIntList();
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

   public interface C2S_WorldPaintMsg_23501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WorldPaintStrengthen_23503OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2C_WorldPaintMsg_23502OrBuilder extends MessageOrBuilder {
      List<WorldPaintInfo> getWorldPaintList();

      WorldPaintInfo getWorldPaint(int index);

      int getWorldPaintCount();

      List<? extends WorldPaintInfoOrBuilder> getWorldPaintOrBuilderList();

      WorldPaintInfoOrBuilder getWorldPaintOrBuilder(int index);
   }

   public interface S2C_WorldPaintStrengthen_23504OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_WorldPaintUnlockNotice_23505OrBuilder extends MessageOrBuilder {
      List<Integer> getTypeList();

      int getTypeCount();

      int getType(int index);
   }

   public interface WorldPaintInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasGrade();

      int getGrade();

      boolean hasLv();

      int getLv();
   }
}
