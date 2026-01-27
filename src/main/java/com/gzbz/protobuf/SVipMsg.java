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

public final class SVipMsg {
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SVipMsg() {
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
      String[] descriptorData = new String[]{"\n\nSVip.proto\u0012\u0016sVip.com.gzbz.protobuf\"\u0015\n\u0013C2S_TotalInfo_21501\"\u008c\u0001\n\u0013S2C_TotalInfo_21502\u0012\u0012\n\nfocusState\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010focusReceiveType\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000edailyInviteNum\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000etotalInviteNum\u0018\u0004 \u0002(\u0005\u0012\u0017\n\u000finviteReceiveId\u0018\u0005 \u0003(\u0005\"2\n\u0016C2S_FocusReceive_21503\u0012\u0018\n\u0010focusReceiveType\u0018\u0001 \u0002(\u0005\"F\n\u0016S2C_FocusReceive_21504\u0012\u0012\n\nfocusState\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010focusReceiveType\u0018\u0002 \u0002(\u0005\"\u0012\n\u0010C2S_Invite_21505\"[\n\u0010S2C_Invite_21506\u0012\u0016\n\u000edailyInviteNum\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000etotalInviteNum\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000finviteReceiveId\u0018\u0003 \u0003(\u0005\"*\n\u001cC2S_AddUpInviteReceive_21507\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"O\n\u001cS2C_AddUpInviteReceive_21508\u0012\u0016\n\u000etotalInviteNum\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000finviteReceiveId\u0018\u0002 \u0003(\u0005B\u001e\n\u0011com.gzbz.protobufB\u0007SVipMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor, new String[0]);
      internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor, new String[]{"FocusState", "FocusReceiveType", "DailyInviteNum", "TotalInviteNum", "InviteReceiveId"});
      internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor, new String[]{"FocusReceiveType"});
      internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor, new String[]{"FocusState", "FocusReceiveType"});
      internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor, new String[0]);
      internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor, new String[]{"DailyInviteNum", "TotalInviteNum", "InviteReceiveId"});
      internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor, new String[]{"Id"});
      internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor, new String[]{"TotalInviteNum", "InviteReceiveId"});
   }

   public static final class C2S_TotalInfo_21501 extends GeneratedMessageV3 implements C2S_TotalInfo_21501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TotalInfo_21501 DEFAULT_INSTANCE = new C2S_TotalInfo_21501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TotalInfo_21501> PARSER = new AbstractParser<C2S_TotalInfo_21501>() {
         public C2S_TotalInfo_21501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TotalInfo_21501(input, extensionRegistry);
         }
      };

      private C2S_TotalInfo_21501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TotalInfo_21501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TotalInfo_21501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TotalInfo_21501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TotalInfo_21501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TotalInfo_21501)) {
            return super.equals(obj);
         } else {
            C2S_TotalInfo_21501 other = (C2S_TotalInfo_21501)obj;
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

      public static C2S_TotalInfo_21501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_21501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_21501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_21501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_21501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_21501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_21501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_21501 parseFrom(InputStream input) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_21501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TotalInfo_21501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_21501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TotalInfo_21501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_21501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_21501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TotalInfo_21501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TotalInfo_21501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TotalInfo_21501> parser() {
         return PARSER;
      }

      public Parser<C2S_TotalInfo_21501> getParserForType() {
         return PARSER;
      }

      public C2S_TotalInfo_21501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TotalInfo_21501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TotalInfo_21501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.C2S_TotalInfo_21501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_TotalInfo_21501_descriptor;
         }

         public C2S_TotalInfo_21501 getDefaultInstanceForType() {
            return SVipMsg.C2S_TotalInfo_21501.getDefaultInstance();
         }

         public C2S_TotalInfo_21501 build() {
            C2S_TotalInfo_21501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TotalInfo_21501 buildPartial() {
            C2S_TotalInfo_21501 result = new C2S_TotalInfo_21501(this);
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
            if (other instanceof C2S_TotalInfo_21501) {
               return this.mergeFrom((C2S_TotalInfo_21501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TotalInfo_21501 other) {
            if (other == SVipMsg.C2S_TotalInfo_21501.getDefaultInstance()) {
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
            C2S_TotalInfo_21501 parsedMessage = null;

            try {
               parsedMessage = (C2S_TotalInfo_21501)SVipMsg.C2S_TotalInfo_21501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TotalInfo_21501)e.getUnfinishedMessage();
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

   public static final class S2C_TotalInfo_21502 extends GeneratedMessageV3 implements S2C_TotalInfo_21502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FOCUSSTATE_FIELD_NUMBER = 1;
      private int focusState_;
      public static final int FOCUSRECEIVETYPE_FIELD_NUMBER = 2;
      private int focusReceiveType_;
      public static final int DAILYINVITENUM_FIELD_NUMBER = 3;
      private int dailyInviteNum_;
      public static final int TOTALINVITENUM_FIELD_NUMBER = 4;
      private int totalInviteNum_;
      public static final int INVITERECEIVEID_FIELD_NUMBER = 5;
      private Internal.IntList inviteReceiveId_;
      private byte memoizedIsInitialized;
      private static final S2C_TotalInfo_21502 DEFAULT_INSTANCE = new S2C_TotalInfo_21502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TotalInfo_21502> PARSER = new AbstractParser<S2C_TotalInfo_21502>() {
         public S2C_TotalInfo_21502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TotalInfo_21502(input, extensionRegistry);
         }
      };

      private S2C_TotalInfo_21502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TotalInfo_21502() {
         this.memoizedIsInitialized = -1;
         this.inviteReceiveId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TotalInfo_21502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TotalInfo_21502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.focusState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.focusReceiveType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailyInviteNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.totalInviteNum_ = input.readInt32();
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.inviteReceiveId_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.inviteReceiveId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TotalInfo_21502.class, Builder.class);
      }

      public boolean hasFocusState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFocusState() {
         return this.focusState_;
      }

      public boolean hasFocusReceiveType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFocusReceiveType() {
         return this.focusReceiveType_;
      }

      public boolean hasDailyInviteNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyInviteNum() {
         return this.dailyInviteNum_;
      }

      public boolean hasTotalInviteNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalInviteNum() {
         return this.totalInviteNum_;
      }

      public List<Integer> getInviteReceiveIdList() {
         return this.inviteReceiveId_;
      }

      public int getInviteReceiveIdCount() {
         return this.inviteReceiveId_.size();
      }

      public int getInviteReceiveId(int index) {
         return this.inviteReceiveId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFocusState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFocusReceiveType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyInviteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalInviteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.focusState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.focusReceiveType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailyInviteNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.totalInviteNum_);
         }

         for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
            output.writeInt32(5, this.inviteReceiveId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.focusState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.focusReceiveType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailyInviteNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalInviteNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.inviteReceiveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getInviteReceiveIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TotalInfo_21502)) {
            return super.equals(obj);
         } else {
            S2C_TotalInfo_21502 other = (S2C_TotalInfo_21502)obj;
            if (this.hasFocusState() != other.hasFocusState()) {
               return false;
            } else if (this.hasFocusState() && this.getFocusState() != other.getFocusState()) {
               return false;
            } else if (this.hasFocusReceiveType() != other.hasFocusReceiveType()) {
               return false;
            } else if (this.hasFocusReceiveType() && this.getFocusReceiveType() != other.getFocusReceiveType()) {
               return false;
            } else if (this.hasDailyInviteNum() != other.hasDailyInviteNum()) {
               return false;
            } else if (this.hasDailyInviteNum() && this.getDailyInviteNum() != other.getDailyInviteNum()) {
               return false;
            } else if (this.hasTotalInviteNum() != other.hasTotalInviteNum()) {
               return false;
            } else if (this.hasTotalInviteNum() && this.getTotalInviteNum() != other.getTotalInviteNum()) {
               return false;
            } else if (!this.getInviteReceiveIdList().equals(other.getInviteReceiveIdList())) {
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
            if (this.hasFocusState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFocusState();
            }

            if (this.hasFocusReceiveType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFocusReceiveType();
            }

            if (this.hasDailyInviteNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailyInviteNum();
            }

            if (this.hasTotalInviteNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalInviteNum();
            }

            if (this.getInviteReceiveIdCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getInviteReceiveIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TotalInfo_21502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_21502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_21502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_21502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_21502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_21502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_21502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_21502 parseFrom(InputStream input) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_21502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TotalInfo_21502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_21502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TotalInfo_21502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_21502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_21502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TotalInfo_21502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TotalInfo_21502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TotalInfo_21502> parser() {
         return PARSER;
      }

      public Parser<S2C_TotalInfo_21502> getParserForType() {
         return PARSER;
      }

      public S2C_TotalInfo_21502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TotalInfo_21502OrBuilder {
         private int bitField0_;
         private int focusState_;
         private int focusReceiveType_;
         private int dailyInviteNum_;
         private int totalInviteNum_;
         private Internal.IntList inviteReceiveId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TotalInfo_21502.class, Builder.class);
         }

         private Builder() {
            this.inviteReceiveId_ = SVipMsg.S2C_TotalInfo_21502.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.inviteReceiveId_ = SVipMsg.S2C_TotalInfo_21502.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.S2C_TotalInfo_21502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.focusState_ = 0;
            this.bitField0_ &= -2;
            this.focusReceiveType_ = 0;
            this.bitField0_ &= -3;
            this.dailyInviteNum_ = 0;
            this.bitField0_ &= -5;
            this.totalInviteNum_ = 0;
            this.bitField0_ &= -9;
            this.inviteReceiveId_ = SVipMsg.S2C_TotalInfo_21502.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_TotalInfo_21502_descriptor;
         }

         public S2C_TotalInfo_21502 getDefaultInstanceForType() {
            return SVipMsg.S2C_TotalInfo_21502.getDefaultInstance();
         }

         public S2C_TotalInfo_21502 build() {
            S2C_TotalInfo_21502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TotalInfo_21502 buildPartial() {
            S2C_TotalInfo_21502 result = new S2C_TotalInfo_21502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.focusState_ = this.focusState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.focusReceiveType_ = this.focusReceiveType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailyInviteNum_ = this.dailyInviteNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalInviteNum_ = this.totalInviteNum_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.inviteReceiveId_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.inviteReceiveId_ = this.inviteReceiveId_;
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
            if (other instanceof S2C_TotalInfo_21502) {
               return this.mergeFrom((S2C_TotalInfo_21502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TotalInfo_21502 other) {
            if (other == SVipMsg.S2C_TotalInfo_21502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFocusState()) {
                  this.setFocusState(other.getFocusState());
               }

               if (other.hasFocusReceiveType()) {
                  this.setFocusReceiveType(other.getFocusReceiveType());
               }

               if (other.hasDailyInviteNum()) {
                  this.setDailyInviteNum(other.getDailyInviteNum());
               }

               if (other.hasTotalInviteNum()) {
                  this.setTotalInviteNum(other.getTotalInviteNum());
               }

               if (!other.inviteReceiveId_.isEmpty()) {
                  if (this.inviteReceiveId_.isEmpty()) {
                     this.inviteReceiveId_ = other.inviteReceiveId_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureInviteReceiveIdIsMutable();
                     this.inviteReceiveId_.addAll(other.inviteReceiveId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFocusState()) {
               return false;
            } else if (!this.hasFocusReceiveType()) {
               return false;
            } else if (!this.hasDailyInviteNum()) {
               return false;
            } else {
               return this.hasTotalInviteNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TotalInfo_21502 parsedMessage = null;

            try {
               parsedMessage = (S2C_TotalInfo_21502)SVipMsg.S2C_TotalInfo_21502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TotalInfo_21502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFocusState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFocusState() {
            return this.focusState_;
         }

         public Builder setFocusState(int value) {
            this.bitField0_ |= 1;
            this.focusState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFocusState() {
            this.bitField0_ &= -2;
            this.focusState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFocusReceiveType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFocusReceiveType() {
            return this.focusReceiveType_;
         }

         public Builder setFocusReceiveType(int value) {
            this.bitField0_ |= 2;
            this.focusReceiveType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFocusReceiveType() {
            this.bitField0_ &= -3;
            this.focusReceiveType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyInviteNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailyInviteNum() {
            return this.dailyInviteNum_;
         }

         public Builder setDailyInviteNum(int value) {
            this.bitField0_ |= 4;
            this.dailyInviteNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyInviteNum() {
            this.bitField0_ &= -5;
            this.dailyInviteNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalInviteNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalInviteNum() {
            return this.totalInviteNum_;
         }

         public Builder setTotalInviteNum(int value) {
            this.bitField0_ |= 8;
            this.totalInviteNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalInviteNum() {
            this.bitField0_ &= -9;
            this.totalInviteNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInviteReceiveIdIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.inviteReceiveId_ = SVipMsg.S2C_TotalInfo_21502.mutableCopy(this.inviteReceiveId_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getInviteReceiveIdList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.inviteReceiveId_) : this.inviteReceiveId_);
         }

         public int getInviteReceiveIdCount() {
            return this.inviteReceiveId_.size();
         }

         public int getInviteReceiveId(int index) {
            return this.inviteReceiveId_.getInt(index);
         }

         public Builder setInviteReceiveId(int index, int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addInviteReceiveId(int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllInviteReceiveId(Iterable<? extends Integer> values) {
            this.ensureInviteReceiveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.inviteReceiveId_);
            this.onChanged();
            return this;
         }

         public Builder clearInviteReceiveId() {
            this.inviteReceiveId_ = SVipMsg.S2C_TotalInfo_21502.emptyIntList();
            this.bitField0_ &= -17;
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

   public static final class C2S_FocusReceive_21503 extends GeneratedMessageV3 implements C2S_FocusReceive_21503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FOCUSRECEIVETYPE_FIELD_NUMBER = 1;
      private int focusReceiveType_;
      private byte memoizedIsInitialized;
      private static final C2S_FocusReceive_21503 DEFAULT_INSTANCE = new C2S_FocusReceive_21503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FocusReceive_21503> PARSER = new AbstractParser<C2S_FocusReceive_21503>() {
         public C2S_FocusReceive_21503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FocusReceive_21503(input, extensionRegistry);
         }
      };

      private C2S_FocusReceive_21503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FocusReceive_21503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FocusReceive_21503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FocusReceive_21503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.focusReceiveType_ = input.readInt32();
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
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FocusReceive_21503.class, Builder.class);
      }

      public boolean hasFocusReceiveType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFocusReceiveType() {
         return this.focusReceiveType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFocusReceiveType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.focusReceiveType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.focusReceiveType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FocusReceive_21503)) {
            return super.equals(obj);
         } else {
            C2S_FocusReceive_21503 other = (C2S_FocusReceive_21503)obj;
            if (this.hasFocusReceiveType() != other.hasFocusReceiveType()) {
               return false;
            } else if (this.hasFocusReceiveType() && this.getFocusReceiveType() != other.getFocusReceiveType()) {
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
            if (this.hasFocusReceiveType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFocusReceiveType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FocusReceive_21503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data);
      }

      public static C2S_FocusReceive_21503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FocusReceive_21503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data);
      }

      public static C2S_FocusReceive_21503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FocusReceive_21503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data);
      }

      public static C2S_FocusReceive_21503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FocusReceive_21503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FocusReceive_21503 parseFrom(InputStream input) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FocusReceive_21503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FocusReceive_21503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FocusReceive_21503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FocusReceive_21503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FocusReceive_21503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FocusReceive_21503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FocusReceive_21503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FocusReceive_21503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FocusReceive_21503> parser() {
         return PARSER;
      }

      public Parser<C2S_FocusReceive_21503> getParserForType() {
         return PARSER;
      }

      public C2S_FocusReceive_21503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FocusReceive_21503OrBuilder {
         private int bitField0_;
         private int focusReceiveType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FocusReceive_21503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.C2S_FocusReceive_21503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.focusReceiveType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_FocusReceive_21503_descriptor;
         }

         public C2S_FocusReceive_21503 getDefaultInstanceForType() {
            return SVipMsg.C2S_FocusReceive_21503.getDefaultInstance();
         }

         public C2S_FocusReceive_21503 build() {
            C2S_FocusReceive_21503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FocusReceive_21503 buildPartial() {
            C2S_FocusReceive_21503 result = new C2S_FocusReceive_21503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.focusReceiveType_ = this.focusReceiveType_;
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
            if (other instanceof C2S_FocusReceive_21503) {
               return this.mergeFrom((C2S_FocusReceive_21503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FocusReceive_21503 other) {
            if (other == SVipMsg.C2S_FocusReceive_21503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFocusReceiveType()) {
                  this.setFocusReceiveType(other.getFocusReceiveType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFocusReceiveType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FocusReceive_21503 parsedMessage = null;

            try {
               parsedMessage = (C2S_FocusReceive_21503)SVipMsg.C2S_FocusReceive_21503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FocusReceive_21503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFocusReceiveType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFocusReceiveType() {
            return this.focusReceiveType_;
         }

         public Builder setFocusReceiveType(int value) {
            this.bitField0_ |= 1;
            this.focusReceiveType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFocusReceiveType() {
            this.bitField0_ &= -2;
            this.focusReceiveType_ = 0;
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

   public static final class S2C_FocusReceive_21504 extends GeneratedMessageV3 implements S2C_FocusReceive_21504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FOCUSSTATE_FIELD_NUMBER = 1;
      private int focusState_;
      public static final int FOCUSRECEIVETYPE_FIELD_NUMBER = 2;
      private int focusReceiveType_;
      private byte memoizedIsInitialized;
      private static final S2C_FocusReceive_21504 DEFAULT_INSTANCE = new S2C_FocusReceive_21504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FocusReceive_21504> PARSER = new AbstractParser<S2C_FocusReceive_21504>() {
         public S2C_FocusReceive_21504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FocusReceive_21504(input, extensionRegistry);
         }
      };

      private S2C_FocusReceive_21504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FocusReceive_21504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FocusReceive_21504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FocusReceive_21504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.focusState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.focusReceiveType_ = input.readInt32();
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
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FocusReceive_21504.class, Builder.class);
      }

      public boolean hasFocusState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFocusState() {
         return this.focusState_;
      }

      public boolean hasFocusReceiveType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFocusReceiveType() {
         return this.focusReceiveType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFocusState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFocusReceiveType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.focusState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.focusReceiveType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.focusState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.focusReceiveType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FocusReceive_21504)) {
            return super.equals(obj);
         } else {
            S2C_FocusReceive_21504 other = (S2C_FocusReceive_21504)obj;
            if (this.hasFocusState() != other.hasFocusState()) {
               return false;
            } else if (this.hasFocusState() && this.getFocusState() != other.getFocusState()) {
               return false;
            } else if (this.hasFocusReceiveType() != other.hasFocusReceiveType()) {
               return false;
            } else if (this.hasFocusReceiveType() && this.getFocusReceiveType() != other.getFocusReceiveType()) {
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
            if (this.hasFocusState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFocusState();
            }

            if (this.hasFocusReceiveType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFocusReceiveType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FocusReceive_21504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data);
      }

      public static S2C_FocusReceive_21504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FocusReceive_21504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data);
      }

      public static S2C_FocusReceive_21504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FocusReceive_21504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data);
      }

      public static S2C_FocusReceive_21504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FocusReceive_21504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FocusReceive_21504 parseFrom(InputStream input) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FocusReceive_21504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FocusReceive_21504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FocusReceive_21504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FocusReceive_21504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FocusReceive_21504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FocusReceive_21504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FocusReceive_21504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FocusReceive_21504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FocusReceive_21504> parser() {
         return PARSER;
      }

      public Parser<S2C_FocusReceive_21504> getParserForType() {
         return PARSER;
      }

      public S2C_FocusReceive_21504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FocusReceive_21504OrBuilder {
         private int bitField0_;
         private int focusState_;
         private int focusReceiveType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FocusReceive_21504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.S2C_FocusReceive_21504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.focusState_ = 0;
            this.bitField0_ &= -2;
            this.focusReceiveType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_FocusReceive_21504_descriptor;
         }

         public S2C_FocusReceive_21504 getDefaultInstanceForType() {
            return SVipMsg.S2C_FocusReceive_21504.getDefaultInstance();
         }

         public S2C_FocusReceive_21504 build() {
            S2C_FocusReceive_21504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FocusReceive_21504 buildPartial() {
            S2C_FocusReceive_21504 result = new S2C_FocusReceive_21504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.focusState_ = this.focusState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.focusReceiveType_ = this.focusReceiveType_;
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
            if (other instanceof S2C_FocusReceive_21504) {
               return this.mergeFrom((S2C_FocusReceive_21504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FocusReceive_21504 other) {
            if (other == SVipMsg.S2C_FocusReceive_21504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFocusState()) {
                  this.setFocusState(other.getFocusState());
               }

               if (other.hasFocusReceiveType()) {
                  this.setFocusReceiveType(other.getFocusReceiveType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFocusState()) {
               return false;
            } else {
               return this.hasFocusReceiveType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FocusReceive_21504 parsedMessage = null;

            try {
               parsedMessage = (S2C_FocusReceive_21504)SVipMsg.S2C_FocusReceive_21504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FocusReceive_21504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFocusState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFocusState() {
            return this.focusState_;
         }

         public Builder setFocusState(int value) {
            this.bitField0_ |= 1;
            this.focusState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFocusState() {
            this.bitField0_ &= -2;
            this.focusState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFocusReceiveType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFocusReceiveType() {
            return this.focusReceiveType_;
         }

         public Builder setFocusReceiveType(int value) {
            this.bitField0_ |= 2;
            this.focusReceiveType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFocusReceiveType() {
            this.bitField0_ &= -3;
            this.focusReceiveType_ = 0;
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

   public static final class C2S_Invite_21505 extends GeneratedMessageV3 implements C2S_Invite_21505OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Invite_21505 DEFAULT_INSTANCE = new C2S_Invite_21505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Invite_21505> PARSER = new AbstractParser<C2S_Invite_21505>() {
         public C2S_Invite_21505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Invite_21505(input, extensionRegistry);
         }
      };

      private C2S_Invite_21505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Invite_21505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Invite_21505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Invite_21505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Invite_21505.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Invite_21505)) {
            return super.equals(obj);
         } else {
            C2S_Invite_21505 other = (C2S_Invite_21505)obj;
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

      public static C2S_Invite_21505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data);
      }

      public static C2S_Invite_21505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_21505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data);
      }

      public static C2S_Invite_21505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_21505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data);
      }

      public static C2S_Invite_21505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_21505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_21505 parseFrom(InputStream input) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Invite_21505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Invite_21505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Invite_21505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Invite_21505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Invite_21505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_21505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Invite_21505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Invite_21505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Invite_21505> parser() {
         return PARSER;
      }

      public Parser<C2S_Invite_21505> getParserForType() {
         return PARSER;
      }

      public C2S_Invite_21505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Invite_21505OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Invite_21505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.C2S_Invite_21505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_Invite_21505_descriptor;
         }

         public C2S_Invite_21505 getDefaultInstanceForType() {
            return SVipMsg.C2S_Invite_21505.getDefaultInstance();
         }

         public C2S_Invite_21505 build() {
            C2S_Invite_21505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Invite_21505 buildPartial() {
            C2S_Invite_21505 result = new C2S_Invite_21505(this);
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
            if (other instanceof C2S_Invite_21505) {
               return this.mergeFrom((C2S_Invite_21505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Invite_21505 other) {
            if (other == SVipMsg.C2S_Invite_21505.getDefaultInstance()) {
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
            C2S_Invite_21505 parsedMessage = null;

            try {
               parsedMessage = (C2S_Invite_21505)SVipMsg.C2S_Invite_21505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Invite_21505)e.getUnfinishedMessage();
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

   public static final class S2C_Invite_21506 extends GeneratedMessageV3 implements S2C_Invite_21506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYINVITENUM_FIELD_NUMBER = 1;
      private int dailyInviteNum_;
      public static final int TOTALINVITENUM_FIELD_NUMBER = 2;
      private int totalInviteNum_;
      public static final int INVITERECEIVEID_FIELD_NUMBER = 3;
      private Internal.IntList inviteReceiveId_;
      private byte memoizedIsInitialized;
      private static final S2C_Invite_21506 DEFAULT_INSTANCE = new S2C_Invite_21506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Invite_21506> PARSER = new AbstractParser<S2C_Invite_21506>() {
         public S2C_Invite_21506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Invite_21506(input, extensionRegistry);
         }
      };

      private S2C_Invite_21506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Invite_21506() {
         this.memoizedIsInitialized = -1;
         this.inviteReceiveId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Invite_21506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Invite_21506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dailyInviteNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalInviteNum_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.inviteReceiveId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.inviteReceiveId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Invite_21506.class, Builder.class);
      }

      public boolean hasDailyInviteNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDailyInviteNum() {
         return this.dailyInviteNum_;
      }

      public boolean hasTotalInviteNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalInviteNum() {
         return this.totalInviteNum_;
      }

      public List<Integer> getInviteReceiveIdList() {
         return this.inviteReceiveId_;
      }

      public int getInviteReceiveIdCount() {
         return this.inviteReceiveId_.size();
      }

      public int getInviteReceiveId(int index) {
         return this.inviteReceiveId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDailyInviteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalInviteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dailyInviteNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalInviteNum_);
         }

         for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
            output.writeInt32(3, this.inviteReceiveId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.dailyInviteNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalInviteNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.inviteReceiveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getInviteReceiveIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Invite_21506)) {
            return super.equals(obj);
         } else {
            S2C_Invite_21506 other = (S2C_Invite_21506)obj;
            if (this.hasDailyInviteNum() != other.hasDailyInviteNum()) {
               return false;
            } else if (this.hasDailyInviteNum() && this.getDailyInviteNum() != other.getDailyInviteNum()) {
               return false;
            } else if (this.hasTotalInviteNum() != other.hasTotalInviteNum()) {
               return false;
            } else if (this.hasTotalInviteNum() && this.getTotalInviteNum() != other.getTotalInviteNum()) {
               return false;
            } else if (!this.getInviteReceiveIdList().equals(other.getInviteReceiveIdList())) {
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
            if (this.hasDailyInviteNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDailyInviteNum();
            }

            if (this.hasTotalInviteNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalInviteNum();
            }

            if (this.getInviteReceiveIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInviteReceiveIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Invite_21506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data);
      }

      public static S2C_Invite_21506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Invite_21506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data);
      }

      public static S2C_Invite_21506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Invite_21506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data);
      }

      public static S2C_Invite_21506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Invite_21506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Invite_21506 parseFrom(InputStream input) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Invite_21506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Invite_21506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Invite_21506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Invite_21506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Invite_21506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Invite_21506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Invite_21506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Invite_21506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Invite_21506> parser() {
         return PARSER;
      }

      public Parser<S2C_Invite_21506> getParserForType() {
         return PARSER;
      }

      public S2C_Invite_21506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Invite_21506OrBuilder {
         private int bitField0_;
         private int dailyInviteNum_;
         private int totalInviteNum_;
         private Internal.IntList inviteReceiveId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Invite_21506.class, Builder.class);
         }

         private Builder() {
            this.inviteReceiveId_ = SVipMsg.S2C_Invite_21506.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.inviteReceiveId_ = SVipMsg.S2C_Invite_21506.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.S2C_Invite_21506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyInviteNum_ = 0;
            this.bitField0_ &= -2;
            this.totalInviteNum_ = 0;
            this.bitField0_ &= -3;
            this.inviteReceiveId_ = SVipMsg.S2C_Invite_21506.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_Invite_21506_descriptor;
         }

         public S2C_Invite_21506 getDefaultInstanceForType() {
            return SVipMsg.S2C_Invite_21506.getDefaultInstance();
         }

         public S2C_Invite_21506 build() {
            S2C_Invite_21506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Invite_21506 buildPartial() {
            S2C_Invite_21506 result = new S2C_Invite_21506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dailyInviteNum_ = this.dailyInviteNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalInviteNum_ = this.totalInviteNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.inviteReceiveId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.inviteReceiveId_ = this.inviteReceiveId_;
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
            if (other instanceof S2C_Invite_21506) {
               return this.mergeFrom((S2C_Invite_21506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Invite_21506 other) {
            if (other == SVipMsg.S2C_Invite_21506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDailyInviteNum()) {
                  this.setDailyInviteNum(other.getDailyInviteNum());
               }

               if (other.hasTotalInviteNum()) {
                  this.setTotalInviteNum(other.getTotalInviteNum());
               }

               if (!other.inviteReceiveId_.isEmpty()) {
                  if (this.inviteReceiveId_.isEmpty()) {
                     this.inviteReceiveId_ = other.inviteReceiveId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureInviteReceiveIdIsMutable();
                     this.inviteReceiveId_.addAll(other.inviteReceiveId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDailyInviteNum()) {
               return false;
            } else {
               return this.hasTotalInviteNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Invite_21506 parsedMessage = null;

            try {
               parsedMessage = (S2C_Invite_21506)SVipMsg.S2C_Invite_21506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Invite_21506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDailyInviteNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDailyInviteNum() {
            return this.dailyInviteNum_;
         }

         public Builder setDailyInviteNum(int value) {
            this.bitField0_ |= 1;
            this.dailyInviteNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyInviteNum() {
            this.bitField0_ &= -2;
            this.dailyInviteNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalInviteNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalInviteNum() {
            return this.totalInviteNum_;
         }

         public Builder setTotalInviteNum(int value) {
            this.bitField0_ |= 2;
            this.totalInviteNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalInviteNum() {
            this.bitField0_ &= -3;
            this.totalInviteNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInviteReceiveIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.inviteReceiveId_ = SVipMsg.S2C_Invite_21506.mutableCopy(this.inviteReceiveId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getInviteReceiveIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.inviteReceiveId_) : this.inviteReceiveId_);
         }

         public int getInviteReceiveIdCount() {
            return this.inviteReceiveId_.size();
         }

         public int getInviteReceiveId(int index) {
            return this.inviteReceiveId_.getInt(index);
         }

         public Builder setInviteReceiveId(int index, int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addInviteReceiveId(int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllInviteReceiveId(Iterable<? extends Integer> values) {
            this.ensureInviteReceiveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.inviteReceiveId_);
            this.onChanged();
            return this;
         }

         public Builder clearInviteReceiveId() {
            this.inviteReceiveId_ = SVipMsg.S2C_Invite_21506.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class C2S_AddUpInviteReceive_21507 extends GeneratedMessageV3 implements C2S_AddUpInviteReceive_21507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_AddUpInviteReceive_21507 DEFAULT_INSTANCE = new C2S_AddUpInviteReceive_21507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AddUpInviteReceive_21507> PARSER = new AbstractParser<C2S_AddUpInviteReceive_21507>() {
         public C2S_AddUpInviteReceive_21507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AddUpInviteReceive_21507(input, extensionRegistry);
         }
      };

      private C2S_AddUpInviteReceive_21507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AddUpInviteReceive_21507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AddUpInviteReceive_21507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AddUpInviteReceive_21507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpInviteReceive_21507.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AddUpInviteReceive_21507)) {
            return super.equals(obj);
         } else {
            C2S_AddUpInviteReceive_21507 other = (C2S_AddUpInviteReceive_21507)obj;
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

      public static C2S_AddUpInviteReceive_21507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInviteReceive_21507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(InputStream input) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpInviteReceive_21507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AddUpInviteReceive_21507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpInviteReceive_21507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInviteReceive_21507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AddUpInviteReceive_21507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AddUpInviteReceive_21507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AddUpInviteReceive_21507> parser() {
         return PARSER;
      }

      public Parser<C2S_AddUpInviteReceive_21507> getParserForType() {
         return PARSER;
      }

      public C2S_AddUpInviteReceive_21507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AddUpInviteReceive_21507OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpInviteReceive_21507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.C2S_AddUpInviteReceive_21507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_C2S_AddUpInviteReceive_21507_descriptor;
         }

         public C2S_AddUpInviteReceive_21507 getDefaultInstanceForType() {
            return SVipMsg.C2S_AddUpInviteReceive_21507.getDefaultInstance();
         }

         public C2S_AddUpInviteReceive_21507 build() {
            C2S_AddUpInviteReceive_21507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AddUpInviteReceive_21507 buildPartial() {
            C2S_AddUpInviteReceive_21507 result = new C2S_AddUpInviteReceive_21507(this);
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
            if (other instanceof C2S_AddUpInviteReceive_21507) {
               return this.mergeFrom((C2S_AddUpInviteReceive_21507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AddUpInviteReceive_21507 other) {
            if (other == SVipMsg.C2S_AddUpInviteReceive_21507.getDefaultInstance()) {
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
            C2S_AddUpInviteReceive_21507 parsedMessage = null;

            try {
               parsedMessage = (C2S_AddUpInviteReceive_21507)SVipMsg.C2S_AddUpInviteReceive_21507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AddUpInviteReceive_21507)e.getUnfinishedMessage();
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

   public static final class S2C_AddUpInviteReceive_21508 extends GeneratedMessageV3 implements S2C_AddUpInviteReceive_21508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALINVITENUM_FIELD_NUMBER = 1;
      private int totalInviteNum_;
      public static final int INVITERECEIVEID_FIELD_NUMBER = 2;
      private Internal.IntList inviteReceiveId_;
      private byte memoizedIsInitialized;
      private static final S2C_AddUpInviteReceive_21508 DEFAULT_INSTANCE = new S2C_AddUpInviteReceive_21508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddUpInviteReceive_21508> PARSER = new AbstractParser<S2C_AddUpInviteReceive_21508>() {
         public S2C_AddUpInviteReceive_21508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddUpInviteReceive_21508(input, extensionRegistry);
         }
      };

      private S2C_AddUpInviteReceive_21508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddUpInviteReceive_21508() {
         this.memoizedIsInitialized = -1;
         this.inviteReceiveId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddUpInviteReceive_21508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddUpInviteReceive_21508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalInviteNum_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.inviteReceiveId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.inviteReceiveId_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.inviteReceiveId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpInviteReceive_21508.class, Builder.class);
      }

      public boolean hasTotalInviteNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalInviteNum() {
         return this.totalInviteNum_;
      }

      public List<Integer> getInviteReceiveIdList() {
         return this.inviteReceiveId_;
      }

      public int getInviteReceiveIdCount() {
         return this.inviteReceiveId_.size();
      }

      public int getInviteReceiveId(int index) {
         return this.inviteReceiveId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalInviteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalInviteNum_);
         }

         for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
            output.writeInt32(2, this.inviteReceiveId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.totalInviteNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.inviteReceiveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.inviteReceiveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getInviteReceiveIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddUpInviteReceive_21508)) {
            return super.equals(obj);
         } else {
            S2C_AddUpInviteReceive_21508 other = (S2C_AddUpInviteReceive_21508)obj;
            if (this.hasTotalInviteNum() != other.hasTotalInviteNum()) {
               return false;
            } else if (this.hasTotalInviteNum() && this.getTotalInviteNum() != other.getTotalInviteNum()) {
               return false;
            } else if (!this.getInviteReceiveIdList().equals(other.getInviteReceiveIdList())) {
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
            if (this.hasTotalInviteNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalInviteNum();
            }

            if (this.getInviteReceiveIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInviteReceiveIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInviteReceive_21508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(InputStream input) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpInviteReceive_21508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddUpInviteReceive_21508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpInviteReceive_21508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInviteReceive_21508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddUpInviteReceive_21508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddUpInviteReceive_21508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddUpInviteReceive_21508> parser() {
         return PARSER;
      }

      public Parser<S2C_AddUpInviteReceive_21508> getParserForType() {
         return PARSER;
      }

      public S2C_AddUpInviteReceive_21508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddUpInviteReceive_21508OrBuilder {
         private int bitField0_;
         private int totalInviteNum_;
         private Internal.IntList inviteReceiveId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpInviteReceive_21508.class, Builder.class);
         }

         private Builder() {
            this.inviteReceiveId_ = SVipMsg.S2C_AddUpInviteReceive_21508.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.inviteReceiveId_ = SVipMsg.S2C_AddUpInviteReceive_21508.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SVipMsg.S2C_AddUpInviteReceive_21508.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalInviteNum_ = 0;
            this.bitField0_ &= -2;
            this.inviteReceiveId_ = SVipMsg.S2C_AddUpInviteReceive_21508.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SVipMsg.internal_static_sVip_com_gzbz_protobuf_S2C_AddUpInviteReceive_21508_descriptor;
         }

         public S2C_AddUpInviteReceive_21508 getDefaultInstanceForType() {
            return SVipMsg.S2C_AddUpInviteReceive_21508.getDefaultInstance();
         }

         public S2C_AddUpInviteReceive_21508 build() {
            S2C_AddUpInviteReceive_21508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddUpInviteReceive_21508 buildPartial() {
            S2C_AddUpInviteReceive_21508 result = new S2C_AddUpInviteReceive_21508(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalInviteNum_ = this.totalInviteNum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.inviteReceiveId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.inviteReceiveId_ = this.inviteReceiveId_;
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
            if (other instanceof S2C_AddUpInviteReceive_21508) {
               return this.mergeFrom((S2C_AddUpInviteReceive_21508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddUpInviteReceive_21508 other) {
            if (other == SVipMsg.S2C_AddUpInviteReceive_21508.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalInviteNum()) {
                  this.setTotalInviteNum(other.getTotalInviteNum());
               }

               if (!other.inviteReceiveId_.isEmpty()) {
                  if (this.inviteReceiveId_.isEmpty()) {
                     this.inviteReceiveId_ = other.inviteReceiveId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureInviteReceiveIdIsMutable();
                     this.inviteReceiveId_.addAll(other.inviteReceiveId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalInviteNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddUpInviteReceive_21508 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddUpInviteReceive_21508)SVipMsg.S2C_AddUpInviteReceive_21508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddUpInviteReceive_21508)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalInviteNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalInviteNum() {
            return this.totalInviteNum_;
         }

         public Builder setTotalInviteNum(int value) {
            this.bitField0_ |= 1;
            this.totalInviteNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalInviteNum() {
            this.bitField0_ &= -2;
            this.totalInviteNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInviteReceiveIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.inviteReceiveId_ = SVipMsg.S2C_AddUpInviteReceive_21508.mutableCopy(this.inviteReceiveId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getInviteReceiveIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.inviteReceiveId_) : this.inviteReceiveId_);
         }

         public int getInviteReceiveIdCount() {
            return this.inviteReceiveId_.size();
         }

         public int getInviteReceiveId(int index) {
            return this.inviteReceiveId_.getInt(index);
         }

         public Builder setInviteReceiveId(int index, int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addInviteReceiveId(int value) {
            this.ensureInviteReceiveIdIsMutable();
            this.inviteReceiveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllInviteReceiveId(Iterable<? extends Integer> values) {
            this.ensureInviteReceiveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.inviteReceiveId_);
            this.onChanged();
            return this;
         }

         public Builder clearInviteReceiveId() {
            this.inviteReceiveId_ = SVipMsg.S2C_AddUpInviteReceive_21508.emptyIntList();
            this.bitField0_ &= -3;
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

   public interface C2S_AddUpInviteReceive_21507OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_FocusReceive_21503OrBuilder extends MessageOrBuilder {
      boolean hasFocusReceiveType();

      int getFocusReceiveType();
   }

   public interface C2S_Invite_21505OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TotalInfo_21501OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_AddUpInviteReceive_21508OrBuilder extends MessageOrBuilder {
      boolean hasTotalInviteNum();

      int getTotalInviteNum();

      List<Integer> getInviteReceiveIdList();

      int getInviteReceiveIdCount();

      int getInviteReceiveId(int index);
   }

   public interface S2C_FocusReceive_21504OrBuilder extends MessageOrBuilder {
      boolean hasFocusState();

      int getFocusState();

      boolean hasFocusReceiveType();

      int getFocusReceiveType();
   }

   public interface S2C_Invite_21506OrBuilder extends MessageOrBuilder {
      boolean hasDailyInviteNum();

      int getDailyInviteNum();

      boolean hasTotalInviteNum();

      int getTotalInviteNum();

      List<Integer> getInviteReceiveIdList();

      int getInviteReceiveIdCount();

      int getInviteReceiveId(int index);
   }

   public interface S2C_TotalInfo_21502OrBuilder extends MessageOrBuilder {
      boolean hasFocusState();

      int getFocusState();

      boolean hasFocusReceiveType();

      int getFocusReceiveType();

      boolean hasDailyInviteNum();

      int getDailyInviteNum();

      boolean hasTotalInviteNum();

      int getTotalInviteNum();

      List<Integer> getInviteReceiveIdList();

      int getInviteReceiveIdCount();

      int getInviteReceiveId(int index);
   }
}
