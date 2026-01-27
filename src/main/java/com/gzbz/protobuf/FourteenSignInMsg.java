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

public final class FourteenSignInMsg {
   private static final Descriptors.Descriptor internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FourteenSignInMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014SignInFourteen.proto\u0012 fourteenSignIn.com.gzbz.protobuf\u001a\fcommon.proto\"\u001e\n\u001cC2S_FourteenSignInSign_24201\"¶\u0001\n\u001cS2C_FourteenSignInSign_24202\u0012\u000e\n\u0006ActDay\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bloginDay\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eretroactiveNum\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006gotDay\u0018\u0004 \u0003(\u0005\u0012\u0015\n\ropenServerDay\u0018\u0005 \u0002(\u0005\u0012\u001e\n\u0016todayGetRetroactiveNum\u0018\u0006 \u0002(\u0005\u0012\u0015\n\rtodayRecharge\u0018\u0007 \u0002(\u0005\"/\n\u001cC2S_FourteenSignInSign_24203\u0012\u000f\n\u0007signDay\u0018\u0001 \u0003(\u0005B(\n\u0011com.gzbz.protobufB\u0011FourteenSignInMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor, new String[0]);
      internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor, new String[]{"ActDay", "LoginDay", "RetroactiveNum", "GotDay", "OpenServerDay", "TodayGetRetroactiveNum", "TodayRecharge"});
      internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor, new String[]{"SignDay"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_FourteenSignInSign_24201 extends GeneratedMessageV3 implements C2S_FourteenSignInSign_24201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FourteenSignInSign_24201 DEFAULT_INSTANCE = new C2S_FourteenSignInSign_24201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FourteenSignInSign_24201> PARSER = new AbstractParser<C2S_FourteenSignInSign_24201>() {
         public C2S_FourteenSignInSign_24201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FourteenSignInSign_24201(input, extensionRegistry);
         }
      };

      private C2S_FourteenSignInSign_24201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FourteenSignInSign_24201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FourteenSignInSign_24201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FourteenSignInSign_24201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FourteenSignInSign_24201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FourteenSignInSign_24201)) {
            return super.equals(obj);
         } else {
            C2S_FourteenSignInSign_24201 other = (C2S_FourteenSignInSign_24201)obj;
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

      public static C2S_FourteenSignInSign_24201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(InputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FourteenSignInSign_24201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FourteenSignInSign_24201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FourteenSignInSign_24201> parser() {
         return PARSER;
      }

      public Parser<C2S_FourteenSignInSign_24201> getParserForType() {
         return PARSER;
      }

      public C2S_FourteenSignInSign_24201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FourteenSignInSign_24201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FourteenSignInSign_24201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FourteenSignInMsg.C2S_FourteenSignInSign_24201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24201_descriptor;
         }

         public C2S_FourteenSignInSign_24201 getDefaultInstanceForType() {
            return FourteenSignInMsg.C2S_FourteenSignInSign_24201.getDefaultInstance();
         }

         public C2S_FourteenSignInSign_24201 build() {
            C2S_FourteenSignInSign_24201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FourteenSignInSign_24201 buildPartial() {
            C2S_FourteenSignInSign_24201 result = new C2S_FourteenSignInSign_24201(this);
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
            if (other instanceof C2S_FourteenSignInSign_24201) {
               return this.mergeFrom((C2S_FourteenSignInSign_24201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FourteenSignInSign_24201 other) {
            if (other == FourteenSignInMsg.C2S_FourteenSignInSign_24201.getDefaultInstance()) {
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
            C2S_FourteenSignInSign_24201 parsedMessage = null;

            try {
               parsedMessage = (C2S_FourteenSignInSign_24201)FourteenSignInMsg.C2S_FourteenSignInSign_24201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FourteenSignInSign_24201)e.getUnfinishedMessage();
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

   public static final class S2C_FourteenSignInSign_24202 extends GeneratedMessageV3 implements S2C_FourteenSignInSign_24202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTDAY_FIELD_NUMBER = 1;
      private int actDay_;
      public static final int LOGINDAY_FIELD_NUMBER = 2;
      private int loginDay_;
      public static final int RETROACTIVENUM_FIELD_NUMBER = 3;
      private int retroactiveNum_;
      public static final int GOTDAY_FIELD_NUMBER = 4;
      private Internal.IntList gotDay_;
      public static final int OPENSERVERDAY_FIELD_NUMBER = 5;
      private int openServerDay_;
      public static final int TODAYGETRETROACTIVENUM_FIELD_NUMBER = 6;
      private int todayGetRetroactiveNum_;
      public static final int TODAYRECHARGE_FIELD_NUMBER = 7;
      private int todayRecharge_;
      private byte memoizedIsInitialized;
      private static final S2C_FourteenSignInSign_24202 DEFAULT_INSTANCE = new S2C_FourteenSignInSign_24202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FourteenSignInSign_24202> PARSER = new AbstractParser<S2C_FourteenSignInSign_24202>() {
         public S2C_FourteenSignInSign_24202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FourteenSignInSign_24202(input, extensionRegistry);
         }
      };

      private S2C_FourteenSignInSign_24202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FourteenSignInSign_24202() {
         this.memoizedIsInitialized = -1;
         this.gotDay_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FourteenSignInSign_24202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FourteenSignInSign_24202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.actDay_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.loginDay_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.retroactiveNum_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.gotDay_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.gotDay_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotDay_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.openServerDay_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 16;
                        this.todayGetRetroactiveNum_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 32;
                        this.todayRecharge_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotDay_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.gotDay_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FourteenSignInSign_24202.class, Builder.class);
      }

      public boolean hasActDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActDay() {
         return this.actDay_;
      }

      public boolean hasLoginDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLoginDay() {
         return this.loginDay_;
      }

      public boolean hasRetroactiveNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRetroactiveNum() {
         return this.retroactiveNum_;
      }

      public List<Integer> getGotDayList() {
         return this.gotDay_;
      }

      public int getGotDayCount() {
         return this.gotDay_.size();
      }

      public int getGotDay(int index) {
         return this.gotDay_.getInt(index);
      }

      public boolean hasOpenServerDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getOpenServerDay() {
         return this.openServerDay_;
      }

      public boolean hasTodayGetRetroactiveNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTodayGetRetroactiveNum() {
         return this.todayGetRetroactiveNum_;
      }

      public boolean hasTodayRecharge() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getTodayRecharge() {
         return this.todayRecharge_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLoginDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRetroactiveNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenServerDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTodayGetRetroactiveNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTodayRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.actDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.loginDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.retroactiveNum_);
         }

         for(int i = 0; i < this.gotDay_.size(); ++i) {
            output.writeInt32(4, this.gotDay_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.openServerDay_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.todayGetRetroactiveNum_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.todayRecharge_);
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
               size += CodedOutputStream.computeInt32Size(1, this.actDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.loginDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.retroactiveNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotDayList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.openServerDay_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.todayGetRetroactiveNum_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.todayRecharge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FourteenSignInSign_24202)) {
            return super.equals(obj);
         } else {
            S2C_FourteenSignInSign_24202 other = (S2C_FourteenSignInSign_24202)obj;
            if (this.hasActDay() != other.hasActDay()) {
               return false;
            } else if (this.hasActDay() && this.getActDay() != other.getActDay()) {
               return false;
            } else if (this.hasLoginDay() != other.hasLoginDay()) {
               return false;
            } else if (this.hasLoginDay() && this.getLoginDay() != other.getLoginDay()) {
               return false;
            } else if (this.hasRetroactiveNum() != other.hasRetroactiveNum()) {
               return false;
            } else if (this.hasRetroactiveNum() && this.getRetroactiveNum() != other.getRetroactiveNum()) {
               return false;
            } else if (!this.getGotDayList().equals(other.getGotDayList())) {
               return false;
            } else if (this.hasOpenServerDay() != other.hasOpenServerDay()) {
               return false;
            } else if (this.hasOpenServerDay() && this.getOpenServerDay() != other.getOpenServerDay()) {
               return false;
            } else if (this.hasTodayGetRetroactiveNum() != other.hasTodayGetRetroactiveNum()) {
               return false;
            } else if (this.hasTodayGetRetroactiveNum() && this.getTodayGetRetroactiveNum() != other.getTodayGetRetroactiveNum()) {
               return false;
            } else if (this.hasTodayRecharge() != other.hasTodayRecharge()) {
               return false;
            } else if (this.hasTodayRecharge() && this.getTodayRecharge() != other.getTodayRecharge()) {
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
            if (this.hasActDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActDay();
            }

            if (this.hasLoginDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLoginDay();
            }

            if (this.hasRetroactiveNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRetroactiveNum();
            }

            if (this.getGotDayCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotDayList().hashCode();
            }

            if (this.hasOpenServerDay()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOpenServerDay();
            }

            if (this.hasTodayGetRetroactiveNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTodayGetRetroactiveNum();
            }

            if (this.hasTodayRecharge()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTodayRecharge();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FourteenSignInSign_24202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(InputStream input) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FourteenSignInSign_24202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FourteenSignInSign_24202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FourteenSignInSign_24202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FourteenSignInSign_24202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FourteenSignInSign_24202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FourteenSignInSign_24202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FourteenSignInSign_24202> parser() {
         return PARSER;
      }

      public Parser<S2C_FourteenSignInSign_24202> getParserForType() {
         return PARSER;
      }

      public S2C_FourteenSignInSign_24202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FourteenSignInSign_24202OrBuilder {
         private int bitField0_;
         private int actDay_;
         private int loginDay_;
         private int retroactiveNum_;
         private Internal.IntList gotDay_;
         private int openServerDay_;
         private int todayGetRetroactiveNum_;
         private int todayRecharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FourteenSignInSign_24202.class, Builder.class);
         }

         private Builder() {
            this.gotDay_ = FourteenSignInMsg.S2C_FourteenSignInSign_24202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotDay_ = FourteenSignInMsg.S2C_FourteenSignInSign_24202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FourteenSignInMsg.S2C_FourteenSignInSign_24202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.actDay_ = 0;
            this.bitField0_ &= -2;
            this.loginDay_ = 0;
            this.bitField0_ &= -3;
            this.retroactiveNum_ = 0;
            this.bitField0_ &= -5;
            this.gotDay_ = FourteenSignInMsg.S2C_FourteenSignInSign_24202.emptyIntList();
            this.bitField0_ &= -9;
            this.openServerDay_ = 0;
            this.bitField0_ &= -17;
            this.todayGetRetroactiveNum_ = 0;
            this.bitField0_ &= -33;
            this.todayRecharge_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_S2C_FourteenSignInSign_24202_descriptor;
         }

         public S2C_FourteenSignInSign_24202 getDefaultInstanceForType() {
            return FourteenSignInMsg.S2C_FourteenSignInSign_24202.getDefaultInstance();
         }

         public S2C_FourteenSignInSign_24202 build() {
            S2C_FourteenSignInSign_24202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FourteenSignInSign_24202 buildPartial() {
            S2C_FourteenSignInSign_24202 result = new S2C_FourteenSignInSign_24202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.actDay_ = this.actDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.loginDay_ = this.loginDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.retroactiveNum_ = this.retroactiveNum_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.gotDay_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.gotDay_ = this.gotDay_;
            if ((from_bitField0_ & 16) != 0) {
               result.openServerDay_ = this.openServerDay_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.todayGetRetroactiveNum_ = this.todayGetRetroactiveNum_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.todayRecharge_ = this.todayRecharge_;
               to_bitField0_ |= 32;
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
            if (other instanceof S2C_FourteenSignInSign_24202) {
               return this.mergeFrom((S2C_FourteenSignInSign_24202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FourteenSignInSign_24202 other) {
            if (other == FourteenSignInMsg.S2C_FourteenSignInSign_24202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActDay()) {
                  this.setActDay(other.getActDay());
               }

               if (other.hasLoginDay()) {
                  this.setLoginDay(other.getLoginDay());
               }

               if (other.hasRetroactiveNum()) {
                  this.setRetroactiveNum(other.getRetroactiveNum());
               }

               if (!other.gotDay_.isEmpty()) {
                  if (this.gotDay_.isEmpty()) {
                     this.gotDay_ = other.gotDay_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureGotDayIsMutable();
                     this.gotDay_.addAll(other.gotDay_);
                  }

                  this.onChanged();
               }

               if (other.hasOpenServerDay()) {
                  this.setOpenServerDay(other.getOpenServerDay());
               }

               if (other.hasTodayGetRetroactiveNum()) {
                  this.setTodayGetRetroactiveNum(other.getTodayGetRetroactiveNum());
               }

               if (other.hasTodayRecharge()) {
                  this.setTodayRecharge(other.getTodayRecharge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActDay()) {
               return false;
            } else if (!this.hasLoginDay()) {
               return false;
            } else if (!this.hasRetroactiveNum()) {
               return false;
            } else if (!this.hasOpenServerDay()) {
               return false;
            } else if (!this.hasTodayGetRetroactiveNum()) {
               return false;
            } else {
               return this.hasTodayRecharge();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FourteenSignInSign_24202 parsedMessage = null;

            try {
               parsedMessage = (S2C_FourteenSignInSign_24202)FourteenSignInMsg.S2C_FourteenSignInSign_24202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FourteenSignInSign_24202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActDay() {
            return this.actDay_;
         }

         public Builder setActDay(int value) {
            this.bitField0_ |= 1;
            this.actDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActDay() {
            this.bitField0_ &= -2;
            this.actDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLoginDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLoginDay() {
            return this.loginDay_;
         }

         public Builder setLoginDay(int value) {
            this.bitField0_ |= 2;
            this.loginDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLoginDay() {
            this.bitField0_ &= -3;
            this.loginDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRetroactiveNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRetroactiveNum() {
            return this.retroactiveNum_;
         }

         public Builder setRetroactiveNum(int value) {
            this.bitField0_ |= 4;
            this.retroactiveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRetroactiveNum() {
            this.bitField0_ &= -5;
            this.retroactiveNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotDayIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotDay_ = FourteenSignInMsg.S2C_FourteenSignInSign_24202.mutableCopy(this.gotDay_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getGotDayList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.gotDay_) : this.gotDay_);
         }

         public int getGotDayCount() {
            return this.gotDay_.size();
         }

         public int getGotDay(int index) {
            return this.gotDay_.getInt(index);
         }

         public Builder setGotDay(int index, int value) {
            this.ensureGotDayIsMutable();
            this.gotDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotDay(int value) {
            this.ensureGotDayIsMutable();
            this.gotDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotDay(Iterable<? extends Integer> values) {
            this.ensureGotDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotDay_);
            this.onChanged();
            return this;
         }

         public Builder clearGotDay() {
            this.gotDay_ = FourteenSignInMsg.S2C_FourteenSignInSign_24202.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasOpenServerDay() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOpenServerDay() {
            return this.openServerDay_;
         }

         public Builder setOpenServerDay(int value) {
            this.bitField0_ |= 16;
            this.openServerDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenServerDay() {
            this.bitField0_ &= -17;
            this.openServerDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTodayGetRetroactiveNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTodayGetRetroactiveNum() {
            return this.todayGetRetroactiveNum_;
         }

         public Builder setTodayGetRetroactiveNum(int value) {
            this.bitField0_ |= 32;
            this.todayGetRetroactiveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodayGetRetroactiveNum() {
            this.bitField0_ &= -33;
            this.todayGetRetroactiveNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTodayRecharge() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTodayRecharge() {
            return this.todayRecharge_;
         }

         public Builder setTodayRecharge(int value) {
            this.bitField0_ |= 64;
            this.todayRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodayRecharge() {
            this.bitField0_ &= -65;
            this.todayRecharge_ = 0;
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

   public static final class C2S_FourteenSignInSign_24203 extends GeneratedMessageV3 implements C2S_FourteenSignInSign_24203OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SIGNDAY_FIELD_NUMBER = 1;
      private Internal.IntList signDay_;
      private byte memoizedIsInitialized;
      private static final C2S_FourteenSignInSign_24203 DEFAULT_INSTANCE = new C2S_FourteenSignInSign_24203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FourteenSignInSign_24203> PARSER = new AbstractParser<C2S_FourteenSignInSign_24203>() {
         public C2S_FourteenSignInSign_24203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FourteenSignInSign_24203(input, extensionRegistry);
         }
      };

      private C2S_FourteenSignInSign_24203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FourteenSignInSign_24203() {
         this.memoizedIsInitialized = -1;
         this.signDay_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FourteenSignInSign_24203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FourteenSignInSign_24203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.signDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.signDay_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.signDay_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.signDay_.addInt(input.readInt32());
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
                  this.signDay_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FourteenSignInSign_24203.class, Builder.class);
      }

      public List<Integer> getSignDayList() {
         return this.signDay_;
      }

      public int getSignDayCount() {
         return this.signDay_.size();
      }

      public int getSignDay(int index) {
         return this.signDay_.getInt(index);
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
         for(int i = 0; i < this.signDay_.size(); ++i) {
            output.writeInt32(1, this.signDay_.getInt(i));
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

            for(int i = 0; i < this.signDay_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.signDay_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSignDayList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FourteenSignInSign_24203)) {
            return super.equals(obj);
         } else {
            C2S_FourteenSignInSign_24203 other = (C2S_FourteenSignInSign_24203)obj;
            if (!this.getSignDayList().equals(other.getSignDayList())) {
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
            if (this.getSignDayCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSignDayList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FourteenSignInSign_24203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(InputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FourteenSignInSign_24203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FourteenSignInSign_24203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FourteenSignInSign_24203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FourteenSignInSign_24203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FourteenSignInSign_24203> parser() {
         return PARSER;
      }

      public Parser<C2S_FourteenSignInSign_24203> getParserForType() {
         return PARSER;
      }

      public C2S_FourteenSignInSign_24203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FourteenSignInSign_24203OrBuilder {
         private int bitField0_;
         private Internal.IntList signDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FourteenSignInSign_24203.class, Builder.class);
         }

         private Builder() {
            this.signDay_ = FourteenSignInMsg.C2S_FourteenSignInSign_24203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signDay_ = FourteenSignInMsg.C2S_FourteenSignInSign_24203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FourteenSignInMsg.C2S_FourteenSignInSign_24203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.signDay_ = FourteenSignInMsg.C2S_FourteenSignInSign_24203.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FourteenSignInMsg.internal_static_fourteenSignIn_com_gzbz_protobuf_C2S_FourteenSignInSign_24203_descriptor;
         }

         public C2S_FourteenSignInSign_24203 getDefaultInstanceForType() {
            return FourteenSignInMsg.C2S_FourteenSignInSign_24203.getDefaultInstance();
         }

         public C2S_FourteenSignInSign_24203 build() {
            C2S_FourteenSignInSign_24203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FourteenSignInSign_24203 buildPartial() {
            C2S_FourteenSignInSign_24203 result = new C2S_FourteenSignInSign_24203(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.signDay_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.signDay_ = this.signDay_;
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
            if (other instanceof C2S_FourteenSignInSign_24203) {
               return this.mergeFrom((C2S_FourteenSignInSign_24203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FourteenSignInSign_24203 other) {
            if (other == FourteenSignInMsg.C2S_FourteenSignInSign_24203.getDefaultInstance()) {
               return this;
            } else {
               if (!other.signDay_.isEmpty()) {
                  if (this.signDay_.isEmpty()) {
                     this.signDay_ = other.signDay_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureSignDayIsMutable();
                     this.signDay_.addAll(other.signDay_);
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
            C2S_FourteenSignInSign_24203 parsedMessage = null;

            try {
               parsedMessage = (C2S_FourteenSignInSign_24203)FourteenSignInMsg.C2S_FourteenSignInSign_24203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FourteenSignInSign_24203)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSignDayIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.signDay_ = FourteenSignInMsg.C2S_FourteenSignInSign_24203.mutableCopy(this.signDay_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getSignDayList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.signDay_) : this.signDay_);
         }

         public int getSignDayCount() {
            return this.signDay_.size();
         }

         public int getSignDay(int index) {
            return this.signDay_.getInt(index);
         }

         public Builder setSignDay(int index, int value) {
            this.ensureSignDayIsMutable();
            this.signDay_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSignDay(int value) {
            this.ensureSignDayIsMutable();
            this.signDay_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSignDay(Iterable<? extends Integer> values) {
            this.ensureSignDayIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.signDay_);
            this.onChanged();
            return this;
         }

         public Builder clearSignDay() {
            this.signDay_ = FourteenSignInMsg.C2S_FourteenSignInSign_24203.emptyIntList();
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

   public interface C2S_FourteenSignInSign_24201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FourteenSignInSign_24203OrBuilder extends MessageOrBuilder {
      List<Integer> getSignDayList();

      int getSignDayCount();

      int getSignDay(int index);
   }

   public interface S2C_FourteenSignInSign_24202OrBuilder extends MessageOrBuilder {
      boolean hasActDay();

      int getActDay();

      boolean hasLoginDay();

      int getLoginDay();

      boolean hasRetroactiveNum();

      int getRetroactiveNum();

      List<Integer> getGotDayList();

      int getGotDayCount();

      int getGotDay(int index);

      boolean hasOpenServerDay();

      int getOpenServerDay();

      boolean hasTodayGetRetroactiveNum();

      int getTodayGetRetroactiveNum();

      boolean hasTodayRecharge();

      int getTodayRecharge();
   }
}
