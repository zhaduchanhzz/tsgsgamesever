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

public final class FailureMsg {
   private static final Descriptors.Descriptor internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FailureMsg() {
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
      String[] descriptorData = new String[]{"\n\rFailure.proto\u0012\u0019failure.com.gzbz.protobuf\"6\n\u000fS2C_Failure_101\u0012\u0011\n\terrorCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\berrorStr\u0018\u0002 \u0001(\tB!\n\u0011com.gzbz.protobufB\nFailureMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor, new String[]{"ErrorCode", "ErrorStr"});
   }

   public static final class S2C_Failure_101 extends GeneratedMessageV3 implements S2C_Failure_101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ERRORCODE_FIELD_NUMBER = 1;
      private int errorCode_;
      public static final int ERRORSTR_FIELD_NUMBER = 2;
      private volatile Object errorStr_;
      private byte memoizedIsInitialized;
      private static final S2C_Failure_101 DEFAULT_INSTANCE = new S2C_Failure_101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Failure_101> PARSER = new AbstractParser<S2C_Failure_101>() {
         public S2C_Failure_101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Failure_101(input, extensionRegistry);
         }
      };

      private S2C_Failure_101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Failure_101() {
         this.memoizedIsInitialized = -1;
         this.errorStr_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Failure_101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Failure_101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.errorCode_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.errorStr_ = bs;
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
         return FailureMsg.internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FailureMsg.internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Failure_101.class, Builder.class);
      }

      public boolean hasErrorCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getErrorCode() {
         return this.errorCode_;
      }

      public boolean hasErrorStr() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getErrorStr() {
         Object ref = this.errorStr_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.errorStr_ = s;
            }

            return s;
         }
      }

      public ByteString getErrorStrBytes() {
         Object ref = this.errorStr_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.errorStr_ = b;
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
         } else if (!this.hasErrorCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.errorCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.errorStr_);
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
               size += CodedOutputStream.computeInt32Size(1, this.errorCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.errorStr_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Failure_101)) {
            return super.equals(obj);
         } else {
            S2C_Failure_101 other = (S2C_Failure_101)obj;
            if (this.hasErrorCode() != other.hasErrorCode()) {
               return false;
            } else if (this.hasErrorCode() && this.getErrorCode() != other.getErrorCode()) {
               return false;
            } else if (this.hasErrorStr() != other.hasErrorStr()) {
               return false;
            } else if (this.hasErrorStr() && !this.getErrorStr().equals(other.getErrorStr())) {
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
            if (this.hasErrorCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getErrorCode();
            }

            if (this.hasErrorStr()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getErrorStr().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Failure_101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data);
      }

      public static S2C_Failure_101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Failure_101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data);
      }

      public static S2C_Failure_101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Failure_101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data);
      }

      public static S2C_Failure_101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Failure_101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Failure_101 parseFrom(InputStream input) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Failure_101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Failure_101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Failure_101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Failure_101 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Failure_101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Failure_101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Failure_101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Failure_101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Failure_101> parser() {
         return PARSER;
      }

      public Parser<S2C_Failure_101> getParserForType() {
         return PARSER;
      }

      public S2C_Failure_101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Failure_101OrBuilder {
         private int bitField0_;
         private int errorCode_;
         private Object errorStr_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FailureMsg.internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FailureMsg.internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Failure_101.class, Builder.class);
         }

         private Builder() {
            this.errorStr_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.errorStr_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FailureMsg.S2C_Failure_101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.errorCode_ = 0;
            this.bitField0_ &= -2;
            this.errorStr_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FailureMsg.internal_static_failure_com_gzbz_protobuf_S2C_Failure_101_descriptor;
         }

         public S2C_Failure_101 getDefaultInstanceForType() {
            return FailureMsg.S2C_Failure_101.getDefaultInstance();
         }

         public S2C_Failure_101 build() {
            S2C_Failure_101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Failure_101 buildPartial() {
            S2C_Failure_101 result = new S2C_Failure_101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.errorCode_ = this.errorCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.errorStr_ = this.errorStr_;
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
            if (other instanceof S2C_Failure_101) {
               return this.mergeFrom((S2C_Failure_101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Failure_101 other) {
            if (other == FailureMsg.S2C_Failure_101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasErrorCode()) {
                  this.setErrorCode(other.getErrorCode());
               }

               if (other.hasErrorStr()) {
                  this.bitField0_ |= 2;
                  this.errorStr_ = other.errorStr_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasErrorCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Failure_101 parsedMessage = null;

            try {
               parsedMessage = (S2C_Failure_101)FailureMsg.S2C_Failure_101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Failure_101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getErrorCode() {
            return this.errorCode_;
         }

         public Builder setErrorCode(int value) {
            this.bitField0_ |= 1;
            this.errorCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasErrorStr() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getErrorStr() {
            Object ref = this.errorStr_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.errorStr_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getErrorStrBytes() {
            Object ref = this.errorStr_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.errorStr_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setErrorStr(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.errorStr_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearErrorStr() {
            this.bitField0_ &= -3;
            this.errorStr_ = FailureMsg.S2C_Failure_101.getDefaultInstance().getErrorStr();
            this.onChanged();
            return this;
         }

         public Builder setErrorStrBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.errorStr_ = value;
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

   public interface S2C_Failure_101OrBuilder extends MessageOrBuilder {
      boolean hasErrorCode();

      int getErrorCode();

      boolean hasErrorStr();

      String getErrorStr();

      ByteString getErrorStrBytes();
   }
}
