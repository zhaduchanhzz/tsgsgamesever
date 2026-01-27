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

public final class DBServerMsg {
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DBServerMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eDBServer.proto\u0012\u001adbServer.com.gzbz.protobuf\u001a\fBattle.proto\"\u0012\n\u0010S2DB_Login_14501\"\u0012\n\u0010DB2S_Login_14502\"1\n\u0015S2DB_RequireLog_14503\u0012\f\n\u0004time\u0018\u0001 \u0002(\u0003\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"&\n\u0018DB2S_RequireResult_14504\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"@\n\u0014S2DB_BattleLog_14505\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006stream\u0018\u0003 \u0002(\f\"\u0018\n\u0016S2DB_PrintStatus_14506B\"\n\u0011com.gzbz.protobufB\u000bDBServerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{BattleMsg.getDescriptor()});
      internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor, new String[0]);
      internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor, new String[0]);
      internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor, new String[]{"Time", "Id"});
      internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor, new String[]{"Id"});
      internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor, new String[]{"Id", "Time", "Stream"});
      internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor, new String[0]);
      BattleMsg.getDescriptor();
   }

   public static final class S2DB_Login_14501 extends GeneratedMessageV3 implements S2DB_Login_14501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2DB_Login_14501 DEFAULT_INSTANCE = new S2DB_Login_14501();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2DB_Login_14501> PARSER = new AbstractParser<S2DB_Login_14501>() {
         public S2DB_Login_14501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2DB_Login_14501(input, extensionRegistry);
         }
      };

      private S2DB_Login_14501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2DB_Login_14501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2DB_Login_14501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2DB_Login_14501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_Login_14501.class, Builder.class);
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
         } else if (!(obj instanceof S2DB_Login_14501)) {
            return super.equals(obj);
         } else {
            S2DB_Login_14501 other = (S2DB_Login_14501)obj;
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

      public static S2DB_Login_14501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data);
      }

      public static S2DB_Login_14501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_Login_14501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data);
      }

      public static S2DB_Login_14501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_Login_14501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data);
      }

      public static S2DB_Login_14501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_Login_14501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_Login_14501 parseFrom(InputStream input) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_Login_14501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_Login_14501 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2DB_Login_14501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_Login_14501 parseFrom(CodedInputStream input) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_Login_14501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_Login_14501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2DB_Login_14501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2DB_Login_14501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2DB_Login_14501> parser() {
         return PARSER;
      }

      public Parser<S2DB_Login_14501> getParserForType() {
         return PARSER;
      }

      public S2DB_Login_14501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2DB_Login_14501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_Login_14501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.S2DB_Login_14501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_Login_14501_descriptor;
         }

         public S2DB_Login_14501 getDefaultInstanceForType() {
            return DBServerMsg.S2DB_Login_14501.getDefaultInstance();
         }

         public S2DB_Login_14501 build() {
            S2DB_Login_14501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2DB_Login_14501 buildPartial() {
            S2DB_Login_14501 result = new S2DB_Login_14501(this);
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
            if (other instanceof S2DB_Login_14501) {
               return this.mergeFrom((S2DB_Login_14501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2DB_Login_14501 other) {
            if (other == DBServerMsg.S2DB_Login_14501.getDefaultInstance()) {
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
            S2DB_Login_14501 parsedMessage = null;

            try {
               parsedMessage = (S2DB_Login_14501)DBServerMsg.S2DB_Login_14501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2DB_Login_14501)e.getUnfinishedMessage();
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

   public static final class DB2S_Login_14502 extends GeneratedMessageV3 implements DB2S_Login_14502OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final DB2S_Login_14502 DEFAULT_INSTANCE = new DB2S_Login_14502();
      /** @deprecated */
      @Deprecated
      public static final Parser<DB2S_Login_14502> PARSER = new AbstractParser<DB2S_Login_14502>() {
         public DB2S_Login_14502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DB2S_Login_14502(input, extensionRegistry);
         }
      };

      private DB2S_Login_14502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DB2S_Login_14502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DB2S_Login_14502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DB2S_Login_14502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_fieldAccessorTable.ensureFieldAccessorsInitialized(DB2S_Login_14502.class, Builder.class);
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
         } else if (!(obj instanceof DB2S_Login_14502)) {
            return super.equals(obj);
         } else {
            DB2S_Login_14502 other = (DB2S_Login_14502)obj;
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

      public static DB2S_Login_14502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data);
      }

      public static DB2S_Login_14502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_Login_14502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data);
      }

      public static DB2S_Login_14502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_Login_14502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data);
      }

      public static DB2S_Login_14502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_Login_14502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_Login_14502 parseFrom(InputStream input) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DB2S_Login_14502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DB2S_Login_14502 parseDelimitedFrom(InputStream input) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DB2S_Login_14502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DB2S_Login_14502 parseFrom(CodedInputStream input) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DB2S_Login_14502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_Login_14502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DB2S_Login_14502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DB2S_Login_14502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DB2S_Login_14502> parser() {
         return PARSER;
      }

      public Parser<DB2S_Login_14502> getParserForType() {
         return PARSER;
      }

      public DB2S_Login_14502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DB2S_Login_14502OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_fieldAccessorTable.ensureFieldAccessorsInitialized(DB2S_Login_14502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.DB2S_Login_14502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_Login_14502_descriptor;
         }

         public DB2S_Login_14502 getDefaultInstanceForType() {
            return DBServerMsg.DB2S_Login_14502.getDefaultInstance();
         }

         public DB2S_Login_14502 build() {
            DB2S_Login_14502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DB2S_Login_14502 buildPartial() {
            DB2S_Login_14502 result = new DB2S_Login_14502(this);
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
            if (other instanceof DB2S_Login_14502) {
               return this.mergeFrom((DB2S_Login_14502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DB2S_Login_14502 other) {
            if (other == DBServerMsg.DB2S_Login_14502.getDefaultInstance()) {
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
            DB2S_Login_14502 parsedMessage = null;

            try {
               parsedMessage = (DB2S_Login_14502)DBServerMsg.DB2S_Login_14502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DB2S_Login_14502)e.getUnfinishedMessage();
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

   public static final class S2DB_RequireLog_14503 extends GeneratedMessageV3 implements S2DB_RequireLog_14503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TIME_FIELD_NUMBER = 1;
      private long time_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2DB_RequireLog_14503 DEFAULT_INSTANCE = new S2DB_RequireLog_14503();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2DB_RequireLog_14503> PARSER = new AbstractParser<S2DB_RequireLog_14503>() {
         public S2DB_RequireLog_14503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2DB_RequireLog_14503(input, extensionRegistry);
         }
      };

      private S2DB_RequireLog_14503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2DB_RequireLog_14503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2DB_RequireLog_14503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2DB_RequireLog_14503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.time_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_RequireLog_14503.class, Builder.class);
      }

      public boolean hasTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getTime() {
         return this.time_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt64(1, this.time_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt64Size(1, this.time_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2DB_RequireLog_14503)) {
            return super.equals(obj);
         } else {
            S2DB_RequireLog_14503 other = (S2DB_RequireLog_14503)obj;
            if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
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
            if (this.hasTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getTime());
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2DB_RequireLog_14503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data);
      }

      public static S2DB_RequireLog_14503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_RequireLog_14503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data);
      }

      public static S2DB_RequireLog_14503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_RequireLog_14503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data);
      }

      public static S2DB_RequireLog_14503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_RequireLog_14503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_RequireLog_14503 parseFrom(InputStream input) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_RequireLog_14503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_RequireLog_14503 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2DB_RequireLog_14503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_RequireLog_14503 parseFrom(CodedInputStream input) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_RequireLog_14503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_RequireLog_14503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2DB_RequireLog_14503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2DB_RequireLog_14503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2DB_RequireLog_14503> parser() {
         return PARSER;
      }

      public Parser<S2DB_RequireLog_14503> getParserForType() {
         return PARSER;
      }

      public S2DB_RequireLog_14503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2DB_RequireLog_14503OrBuilder {
         private int bitField0_;
         private long time_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_RequireLog_14503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.S2DB_RequireLog_14503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.time_ = 0L;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_RequireLog_14503_descriptor;
         }

         public S2DB_RequireLog_14503 getDefaultInstanceForType() {
            return DBServerMsg.S2DB_RequireLog_14503.getDefaultInstance();
         }

         public S2DB_RequireLog_14503 build() {
            S2DB_RequireLog_14503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2DB_RequireLog_14503 buildPartial() {
            S2DB_RequireLog_14503 result = new S2DB_RequireLog_14503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof S2DB_RequireLog_14503) {
               return this.mergeFrom((S2DB_RequireLog_14503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2DB_RequireLog_14503 other) {
            if (other == DBServerMsg.S2DB_RequireLog_14503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTime()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2DB_RequireLog_14503 parsedMessage = null;

            try {
               parsedMessage = (S2DB_RequireLog_14503)DBServerMsg.S2DB_RequireLog_14503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2DB_RequireLog_14503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getTime() {
            return this.time_;
         }

         public Builder setTime(long value) {
            this.bitField0_ |= 1;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -2;
            this.time_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
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

   public static final class DB2S_RequireResult_14504 extends GeneratedMessageV3 implements DB2S_RequireResult_14504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final DB2S_RequireResult_14504 DEFAULT_INSTANCE = new DB2S_RequireResult_14504();
      /** @deprecated */
      @Deprecated
      public static final Parser<DB2S_RequireResult_14504> PARSER = new AbstractParser<DB2S_RequireResult_14504>() {
         public DB2S_RequireResult_14504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DB2S_RequireResult_14504(input, extensionRegistry);
         }
      };

      private DB2S_RequireResult_14504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DB2S_RequireResult_14504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DB2S_RequireResult_14504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DB2S_RequireResult_14504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_fieldAccessorTable.ensureFieldAccessorsInitialized(DB2S_RequireResult_14504.class, Builder.class);
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
         } else if (!(obj instanceof DB2S_RequireResult_14504)) {
            return super.equals(obj);
         } else {
            DB2S_RequireResult_14504 other = (DB2S_RequireResult_14504)obj;
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

      public static DB2S_RequireResult_14504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data);
      }

      public static DB2S_RequireResult_14504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_RequireResult_14504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data);
      }

      public static DB2S_RequireResult_14504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_RequireResult_14504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data);
      }

      public static DB2S_RequireResult_14504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DB2S_RequireResult_14504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DB2S_RequireResult_14504 parseFrom(InputStream input) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DB2S_RequireResult_14504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DB2S_RequireResult_14504 parseDelimitedFrom(InputStream input) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DB2S_RequireResult_14504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DB2S_RequireResult_14504 parseFrom(CodedInputStream input) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DB2S_RequireResult_14504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DB2S_RequireResult_14504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DB2S_RequireResult_14504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DB2S_RequireResult_14504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DB2S_RequireResult_14504> parser() {
         return PARSER;
      }

      public Parser<DB2S_RequireResult_14504> getParserForType() {
         return PARSER;
      }

      public DB2S_RequireResult_14504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DB2S_RequireResult_14504OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_fieldAccessorTable.ensureFieldAccessorsInitialized(DB2S_RequireResult_14504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.DB2S_RequireResult_14504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_DB2S_RequireResult_14504_descriptor;
         }

         public DB2S_RequireResult_14504 getDefaultInstanceForType() {
            return DBServerMsg.DB2S_RequireResult_14504.getDefaultInstance();
         }

         public DB2S_RequireResult_14504 build() {
            DB2S_RequireResult_14504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DB2S_RequireResult_14504 buildPartial() {
            DB2S_RequireResult_14504 result = new DB2S_RequireResult_14504(this);
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
            if (other instanceof DB2S_RequireResult_14504) {
               return this.mergeFrom((DB2S_RequireResult_14504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DB2S_RequireResult_14504 other) {
            if (other == DBServerMsg.DB2S_RequireResult_14504.getDefaultInstance()) {
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
            DB2S_RequireResult_14504 parsedMessage = null;

            try {
               parsedMessage = (DB2S_RequireResult_14504)DBServerMsg.DB2S_RequireResult_14504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DB2S_RequireResult_14504)e.getUnfinishedMessage();
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

   public static final class S2DB_BattleLog_14505 extends GeneratedMessageV3 implements S2DB_BattleLog_14505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TIME_FIELD_NUMBER = 2;
      private int time_;
      public static final int STREAM_FIELD_NUMBER = 3;
      private ByteString stream_;
      private byte memoizedIsInitialized;
      private static final S2DB_BattleLog_14505 DEFAULT_INSTANCE = new S2DB_BattleLog_14505();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2DB_BattleLog_14505> PARSER = new AbstractParser<S2DB_BattleLog_14505>() {
         public S2DB_BattleLog_14505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2DB_BattleLog_14505(input, extensionRegistry);
         }
      };

      private S2DB_BattleLog_14505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2DB_BattleLog_14505() {
         this.memoizedIsInitialized = -1;
         this.stream_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2DB_BattleLog_14505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2DB_BattleLog_14505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.time_ = input.readInt32();
                        break;
                     case 26:
                        this.bitField0_ |= 4;
                        this.stream_ = input.readBytes();
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_BattleLog_14505.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasStream() {
         return (this.bitField0_ & 4) != 0;
      }

      public ByteString getStream() {
         return this.stream_;
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
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStream()) {
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
            output.writeInt32(2, this.time_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.stream_);
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
               size += CodedOutputStream.computeInt32Size(2, this.time_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBytesSize(3, this.stream_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2DB_BattleLog_14505)) {
            return super.equals(obj);
         } else {
            S2DB_BattleLog_14505 other = (S2DB_BattleLog_14505)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasStream() != other.hasStream()) {
               return false;
            } else if (this.hasStream() && !this.getStream().equals(other.getStream())) {
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

            if (this.hasTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasStream()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStream().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2DB_BattleLog_14505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data);
      }

      public static S2DB_BattleLog_14505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_BattleLog_14505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data);
      }

      public static S2DB_BattleLog_14505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_BattleLog_14505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data);
      }

      public static S2DB_BattleLog_14505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_BattleLog_14505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_BattleLog_14505 parseFrom(InputStream input) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_BattleLog_14505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_BattleLog_14505 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2DB_BattleLog_14505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_BattleLog_14505 parseFrom(CodedInputStream input) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_BattleLog_14505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_BattleLog_14505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2DB_BattleLog_14505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2DB_BattleLog_14505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2DB_BattleLog_14505> parser() {
         return PARSER;
      }

      public Parser<S2DB_BattleLog_14505> getParserForType() {
         return PARSER;
      }

      public S2DB_BattleLog_14505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2DB_BattleLog_14505OrBuilder {
         private int bitField0_;
         private int id_;
         private int time_;
         private ByteString stream_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_BattleLog_14505.class, Builder.class);
         }

         private Builder() {
            this.stream_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.stream_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.S2DB_BattleLog_14505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            this.stream_ = ByteString.EMPTY;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_BattleLog_14505_descriptor;
         }

         public S2DB_BattleLog_14505 getDefaultInstanceForType() {
            return DBServerMsg.S2DB_BattleLog_14505.getDefaultInstance();
         }

         public S2DB_BattleLog_14505 build() {
            S2DB_BattleLog_14505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2DB_BattleLog_14505 buildPartial() {
            S2DB_BattleLog_14505 result = new S2DB_BattleLog_14505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.stream_ = this.stream_;
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
            if (other instanceof S2DB_BattleLog_14505) {
               return this.mergeFrom((S2DB_BattleLog_14505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2DB_BattleLog_14505 other) {
            if (other == DBServerMsg.S2DB_BattleLog_14505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasStream()) {
                  this.setStream(other.getStream());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else {
               return this.hasStream();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2DB_BattleLog_14505 parsedMessage = null;

            try {
               parsedMessage = (S2DB_BattleLog_14505)DBServerMsg.S2DB_BattleLog_14505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2DB_BattleLog_14505)e.getUnfinishedMessage();
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

         public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 2;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStream() {
            return (this.bitField0_ & 4) != 0;
         }

         public ByteString getStream() {
            return this.stream_;
         }

         public Builder setStream(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.stream_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearStream() {
            this.bitField0_ &= -5;
            this.stream_ = DBServerMsg.S2DB_BattleLog_14505.getDefaultInstance().getStream();
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

   public static final class S2DB_PrintStatus_14506 extends GeneratedMessageV3 implements S2DB_PrintStatus_14506OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2DB_PrintStatus_14506 DEFAULT_INSTANCE = new S2DB_PrintStatus_14506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2DB_PrintStatus_14506> PARSER = new AbstractParser<S2DB_PrintStatus_14506>() {
         public S2DB_PrintStatus_14506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2DB_PrintStatus_14506(input, extensionRegistry);
         }
      };

      private S2DB_PrintStatus_14506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2DB_PrintStatus_14506() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2DB_PrintStatus_14506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2DB_PrintStatus_14506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_PrintStatus_14506.class, Builder.class);
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
         } else if (!(obj instanceof S2DB_PrintStatus_14506)) {
            return super.equals(obj);
         } else {
            S2DB_PrintStatus_14506 other = (S2DB_PrintStatus_14506)obj;
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

      public static S2DB_PrintStatus_14506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data);
      }

      public static S2DB_PrintStatus_14506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_PrintStatus_14506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data);
      }

      public static S2DB_PrintStatus_14506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_PrintStatus_14506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data);
      }

      public static S2DB_PrintStatus_14506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2DB_PrintStatus_14506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2DB_PrintStatus_14506 parseFrom(InputStream input) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_PrintStatus_14506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_PrintStatus_14506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2DB_PrintStatus_14506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2DB_PrintStatus_14506 parseFrom(CodedInputStream input) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2DB_PrintStatus_14506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2DB_PrintStatus_14506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2DB_PrintStatus_14506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2DB_PrintStatus_14506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2DB_PrintStatus_14506> parser() {
         return PARSER;
      }

      public Parser<S2DB_PrintStatus_14506> getParserForType() {
         return PARSER;
      }

      public S2DB_PrintStatus_14506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2DB_PrintStatus_14506OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2DB_PrintStatus_14506.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DBServerMsg.S2DB_PrintStatus_14506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DBServerMsg.internal_static_dbServer_com_gzbz_protobuf_S2DB_PrintStatus_14506_descriptor;
         }

         public S2DB_PrintStatus_14506 getDefaultInstanceForType() {
            return DBServerMsg.S2DB_PrintStatus_14506.getDefaultInstance();
         }

         public S2DB_PrintStatus_14506 build() {
            S2DB_PrintStatus_14506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2DB_PrintStatus_14506 buildPartial() {
            S2DB_PrintStatus_14506 result = new S2DB_PrintStatus_14506(this);
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
            if (other instanceof S2DB_PrintStatus_14506) {
               return this.mergeFrom((S2DB_PrintStatus_14506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2DB_PrintStatus_14506 other) {
            if (other == DBServerMsg.S2DB_PrintStatus_14506.getDefaultInstance()) {
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
            S2DB_PrintStatus_14506 parsedMessage = null;

            try {
               parsedMessage = (S2DB_PrintStatus_14506)DBServerMsg.S2DB_PrintStatus_14506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2DB_PrintStatus_14506)e.getUnfinishedMessage();
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

   public interface DB2S_Login_14502OrBuilder extends MessageOrBuilder {
   }

   public interface DB2S_RequireResult_14504OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2DB_BattleLog_14505OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasTime();

      int getTime();

      boolean hasStream();

      ByteString getStream();
   }

   public interface S2DB_Login_14501OrBuilder extends MessageOrBuilder {
   }

   public interface S2DB_PrintStatus_14506OrBuilder extends MessageOrBuilder {
   }

   public interface S2DB_RequireLog_14503OrBuilder extends MessageOrBuilder {
      boolean hasTime();

      long getTime();

      boolean hasId();

      int getId();
   }
}
