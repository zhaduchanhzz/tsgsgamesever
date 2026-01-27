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

public final class FaceBookShareMsg {
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FaceBookShareMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013FaceBookShare.proto\u0012\u001ffaceBookShare.com.gzbz.protobuf\"\u0015\n\u0013C2S_TotalInfo_19201\"Æ\u0001\n\u0013S2C_TotalInfo_19202\u0012\u0012\n\nlikesState\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nshareState\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000binviteState\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000ecommunityState\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000badviseState\u0018\u0005 \u0002(\u0005\u0012\u0014\n\fbindingState\u0018\u0006 \u0002(\u0005\u0012\u0019\n\u0011googlePlayerState\u0018\u0007 \u0002(\u0005\u0012\u0014\n\fh5GuideState\u0018\b \u0002(\u0005\"\u0011\n\u000fC2S_Likes_19203\"\u0011\n\u000fC2S_Share_19204\"\u0012\n\u0010C2S_Invite_19205\"\u0015\n\u0013C2S_Community_19206\"%\n\u0010C2S_Advise_19207\u0012\u0011\n\tsendAward\u0018\u0001 \u0002(\b\"\u0013\n\u0011C2S_Binding_19208\"\u0018\n\u0016C2S_GooglePlayer_19209\"\u0016\n\u0014C2S_RecH5Guide_19210B'\n\u0011com.gzbz.protobufB\u0010FaceBookShareMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor, new String[]{"LikesState", "ShareState", "InviteState", "CommunityState", "AdviseState", "BindingState", "GooglePlayerState", "H5GuideState"});
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor, new String[]{"SendAward"});
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor, new String[0]);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor, new String[0]);
   }

   public static final class C2S_TotalInfo_19201 extends GeneratedMessageV3 implements C2S_TotalInfo_19201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TotalInfo_19201 DEFAULT_INSTANCE = new C2S_TotalInfo_19201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TotalInfo_19201> PARSER = new AbstractParser<C2S_TotalInfo_19201>() {
         public C2S_TotalInfo_19201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TotalInfo_19201(input, extensionRegistry);
         }
      };

      private C2S_TotalInfo_19201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TotalInfo_19201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TotalInfo_19201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TotalInfo_19201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TotalInfo_19201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TotalInfo_19201)) {
            return super.equals(obj);
         } else {
            C2S_TotalInfo_19201 other = (C2S_TotalInfo_19201)obj;
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

      public static C2S_TotalInfo_19201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_19201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_19201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_19201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_19201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data);
      }

      public static C2S_TotalInfo_19201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TotalInfo_19201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TotalInfo_19201 parseFrom(InputStream input) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_19201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TotalInfo_19201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_19201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TotalInfo_19201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TotalInfo_19201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TotalInfo_19201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TotalInfo_19201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TotalInfo_19201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TotalInfo_19201> parser() {
         return PARSER;
      }

      public Parser<C2S_TotalInfo_19201> getParserForType() {
         return PARSER;
      }

      public C2S_TotalInfo_19201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TotalInfo_19201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TotalInfo_19201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_TotalInfo_19201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_TotalInfo_19201_descriptor;
         }

         public C2S_TotalInfo_19201 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_TotalInfo_19201.getDefaultInstance();
         }

         public C2S_TotalInfo_19201 build() {
            C2S_TotalInfo_19201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TotalInfo_19201 buildPartial() {
            C2S_TotalInfo_19201 result = new C2S_TotalInfo_19201(this);
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
            if (other instanceof C2S_TotalInfo_19201) {
               return this.mergeFrom((C2S_TotalInfo_19201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TotalInfo_19201 other) {
            if (other == FaceBookShareMsg.C2S_TotalInfo_19201.getDefaultInstance()) {
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
            C2S_TotalInfo_19201 parsedMessage = null;

            try {
               parsedMessage = (C2S_TotalInfo_19201)FaceBookShareMsg.C2S_TotalInfo_19201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TotalInfo_19201)e.getUnfinishedMessage();
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

   public static final class S2C_TotalInfo_19202 extends GeneratedMessageV3 implements S2C_TotalInfo_19202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LIKESSTATE_FIELD_NUMBER = 1;
      private int likesState_;
      public static final int SHARESTATE_FIELD_NUMBER = 2;
      private int shareState_;
      public static final int INVITESTATE_FIELD_NUMBER = 3;
      private int inviteState_;
      public static final int COMMUNITYSTATE_FIELD_NUMBER = 4;
      private int communityState_;
      public static final int ADVISESTATE_FIELD_NUMBER = 5;
      private int adviseState_;
      public static final int BINDINGSTATE_FIELD_NUMBER = 6;
      private int bindingState_;
      public static final int GOOGLEPLAYERSTATE_FIELD_NUMBER = 7;
      private int googlePlayerState_;
      public static final int H5GUIDESTATE_FIELD_NUMBER = 8;
      private int h5GuideState_;
      private byte memoizedIsInitialized;
      private static final S2C_TotalInfo_19202 DEFAULT_INSTANCE = new S2C_TotalInfo_19202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TotalInfo_19202> PARSER = new AbstractParser<S2C_TotalInfo_19202>() {
         public S2C_TotalInfo_19202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TotalInfo_19202(input, extensionRegistry);
         }
      };

      private S2C_TotalInfo_19202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TotalInfo_19202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TotalInfo_19202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TotalInfo_19202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.likesState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.shareState_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.inviteState_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.communityState_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.adviseState_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.bindingState_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.googlePlayerState_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.h5GuideState_ = input.readInt32();
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TotalInfo_19202.class, Builder.class);
      }

      public boolean hasLikesState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLikesState() {
         return this.likesState_;
      }

      public boolean hasShareState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShareState() {
         return this.shareState_;
      }

      public boolean hasInviteState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getInviteState() {
         return this.inviteState_;
      }

      public boolean hasCommunityState() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCommunityState() {
         return this.communityState_;
      }

      public boolean hasAdviseState() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getAdviseState() {
         return this.adviseState_;
      }

      public boolean hasBindingState() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getBindingState() {
         return this.bindingState_;
      }

      public boolean hasGooglePlayerState() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getGooglePlayerState() {
         return this.googlePlayerState_;
      }

      public boolean hasH5GuideState() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getH5GuideState() {
         return this.h5GuideState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLikesState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShareState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInviteState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCommunityState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAdviseState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBindingState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGooglePlayerState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasH5GuideState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.likesState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.shareState_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.inviteState_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.communityState_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.adviseState_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.bindingState_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.googlePlayerState_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.h5GuideState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.likesState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.shareState_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.inviteState_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.communityState_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.adviseState_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.bindingState_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.googlePlayerState_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.h5GuideState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TotalInfo_19202)) {
            return super.equals(obj);
         } else {
            S2C_TotalInfo_19202 other = (S2C_TotalInfo_19202)obj;
            if (this.hasLikesState() != other.hasLikesState()) {
               return false;
            } else if (this.hasLikesState() && this.getLikesState() != other.getLikesState()) {
               return false;
            } else if (this.hasShareState() != other.hasShareState()) {
               return false;
            } else if (this.hasShareState() && this.getShareState() != other.getShareState()) {
               return false;
            } else if (this.hasInviteState() != other.hasInviteState()) {
               return false;
            } else if (this.hasInviteState() && this.getInviteState() != other.getInviteState()) {
               return false;
            } else if (this.hasCommunityState() != other.hasCommunityState()) {
               return false;
            } else if (this.hasCommunityState() && this.getCommunityState() != other.getCommunityState()) {
               return false;
            } else if (this.hasAdviseState() != other.hasAdviseState()) {
               return false;
            } else if (this.hasAdviseState() && this.getAdviseState() != other.getAdviseState()) {
               return false;
            } else if (this.hasBindingState() != other.hasBindingState()) {
               return false;
            } else if (this.hasBindingState() && this.getBindingState() != other.getBindingState()) {
               return false;
            } else if (this.hasGooglePlayerState() != other.hasGooglePlayerState()) {
               return false;
            } else if (this.hasGooglePlayerState() && this.getGooglePlayerState() != other.getGooglePlayerState()) {
               return false;
            } else if (this.hasH5GuideState() != other.hasH5GuideState()) {
               return false;
            } else if (this.hasH5GuideState() && this.getH5GuideState() != other.getH5GuideState()) {
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
            if (this.hasLikesState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLikesState();
            }

            if (this.hasShareState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShareState();
            }

            if (this.hasInviteState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInviteState();
            }

            if (this.hasCommunityState()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCommunityState();
            }

            if (this.hasAdviseState()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getAdviseState();
            }

            if (this.hasBindingState()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBindingState();
            }

            if (this.hasGooglePlayerState()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getGooglePlayerState();
            }

            if (this.hasH5GuideState()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getH5GuideState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TotalInfo_19202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_19202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_19202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_19202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_19202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data);
      }

      public static S2C_TotalInfo_19202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TotalInfo_19202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TotalInfo_19202 parseFrom(InputStream input) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_19202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TotalInfo_19202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_19202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TotalInfo_19202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TotalInfo_19202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TotalInfo_19202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TotalInfo_19202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TotalInfo_19202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TotalInfo_19202> parser() {
         return PARSER;
      }

      public Parser<S2C_TotalInfo_19202> getParserForType() {
         return PARSER;
      }

      public S2C_TotalInfo_19202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TotalInfo_19202OrBuilder {
         private int bitField0_;
         private int likesState_;
         private int shareState_;
         private int inviteState_;
         private int communityState_;
         private int adviseState_;
         private int bindingState_;
         private int googlePlayerState_;
         private int h5GuideState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TotalInfo_19202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.S2C_TotalInfo_19202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.likesState_ = 0;
            this.bitField0_ &= -2;
            this.shareState_ = 0;
            this.bitField0_ &= -3;
            this.inviteState_ = 0;
            this.bitField0_ &= -5;
            this.communityState_ = 0;
            this.bitField0_ &= -9;
            this.adviseState_ = 0;
            this.bitField0_ &= -17;
            this.bindingState_ = 0;
            this.bitField0_ &= -33;
            this.googlePlayerState_ = 0;
            this.bitField0_ &= -65;
            this.h5GuideState_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_S2C_TotalInfo_19202_descriptor;
         }

         public S2C_TotalInfo_19202 getDefaultInstanceForType() {
            return FaceBookShareMsg.S2C_TotalInfo_19202.getDefaultInstance();
         }

         public S2C_TotalInfo_19202 build() {
            S2C_TotalInfo_19202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TotalInfo_19202 buildPartial() {
            S2C_TotalInfo_19202 result = new S2C_TotalInfo_19202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.likesState_ = this.likesState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.shareState_ = this.shareState_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.inviteState_ = this.inviteState_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.communityState_ = this.communityState_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.adviseState_ = this.adviseState_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.bindingState_ = this.bindingState_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.googlePlayerState_ = this.googlePlayerState_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.h5GuideState_ = this.h5GuideState_;
               to_bitField0_ |= 128;
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
            if (other instanceof S2C_TotalInfo_19202) {
               return this.mergeFrom((S2C_TotalInfo_19202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TotalInfo_19202 other) {
            if (other == FaceBookShareMsg.S2C_TotalInfo_19202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLikesState()) {
                  this.setLikesState(other.getLikesState());
               }

               if (other.hasShareState()) {
                  this.setShareState(other.getShareState());
               }

               if (other.hasInviteState()) {
                  this.setInviteState(other.getInviteState());
               }

               if (other.hasCommunityState()) {
                  this.setCommunityState(other.getCommunityState());
               }

               if (other.hasAdviseState()) {
                  this.setAdviseState(other.getAdviseState());
               }

               if (other.hasBindingState()) {
                  this.setBindingState(other.getBindingState());
               }

               if (other.hasGooglePlayerState()) {
                  this.setGooglePlayerState(other.getGooglePlayerState());
               }

               if (other.hasH5GuideState()) {
                  this.setH5GuideState(other.getH5GuideState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLikesState()) {
               return false;
            } else if (!this.hasShareState()) {
               return false;
            } else if (!this.hasInviteState()) {
               return false;
            } else if (!this.hasCommunityState()) {
               return false;
            } else if (!this.hasAdviseState()) {
               return false;
            } else if (!this.hasBindingState()) {
               return false;
            } else if (!this.hasGooglePlayerState()) {
               return false;
            } else {
               return this.hasH5GuideState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TotalInfo_19202 parsedMessage = null;

            try {
               parsedMessage = (S2C_TotalInfo_19202)FaceBookShareMsg.S2C_TotalInfo_19202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TotalInfo_19202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLikesState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLikesState() {
            return this.likesState_;
         }

         public Builder setLikesState(int value) {
            this.bitField0_ |= 1;
            this.likesState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLikesState() {
            this.bitField0_ &= -2;
            this.likesState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShareState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShareState() {
            return this.shareState_;
         }

         public Builder setShareState(int value) {
            this.bitField0_ |= 2;
            this.shareState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShareState() {
            this.bitField0_ &= -3;
            this.shareState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInviteState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getInviteState() {
            return this.inviteState_;
         }

         public Builder setInviteState(int value) {
            this.bitField0_ |= 4;
            this.inviteState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInviteState() {
            this.bitField0_ &= -5;
            this.inviteState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCommunityState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCommunityState() {
            return this.communityState_;
         }

         public Builder setCommunityState(int value) {
            this.bitField0_ |= 8;
            this.communityState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommunityState() {
            this.bitField0_ &= -9;
            this.communityState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAdviseState() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getAdviseState() {
            return this.adviseState_;
         }

         public Builder setAdviseState(int value) {
            this.bitField0_ |= 16;
            this.adviseState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAdviseState() {
            this.bitField0_ &= -17;
            this.adviseState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBindingState() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getBindingState() {
            return this.bindingState_;
         }

         public Builder setBindingState(int value) {
            this.bitField0_ |= 32;
            this.bindingState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBindingState() {
            this.bitField0_ &= -33;
            this.bindingState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGooglePlayerState() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getGooglePlayerState() {
            return this.googlePlayerState_;
         }

         public Builder setGooglePlayerState(int value) {
            this.bitField0_ |= 64;
            this.googlePlayerState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGooglePlayerState() {
            this.bitField0_ &= -65;
            this.googlePlayerState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasH5GuideState() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getH5GuideState() {
            return this.h5GuideState_;
         }

         public Builder setH5GuideState(int value) {
            this.bitField0_ |= 128;
            this.h5GuideState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearH5GuideState() {
            this.bitField0_ &= -129;
            this.h5GuideState_ = 0;
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

   public static final class C2S_Likes_19203 extends GeneratedMessageV3 implements C2S_Likes_19203OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Likes_19203 DEFAULT_INSTANCE = new C2S_Likes_19203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Likes_19203> PARSER = new AbstractParser<C2S_Likes_19203>() {
         public C2S_Likes_19203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Likes_19203(input, extensionRegistry);
         }
      };

      private C2S_Likes_19203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Likes_19203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Likes_19203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Likes_19203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Likes_19203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Likes_19203)) {
            return super.equals(obj);
         } else {
            C2S_Likes_19203 other = (C2S_Likes_19203)obj;
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

      public static C2S_Likes_19203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data);
      }

      public static C2S_Likes_19203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Likes_19203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data);
      }

      public static C2S_Likes_19203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Likes_19203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data);
      }

      public static C2S_Likes_19203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Likes_19203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Likes_19203 parseFrom(InputStream input) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Likes_19203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Likes_19203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Likes_19203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Likes_19203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Likes_19203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Likes_19203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Likes_19203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Likes_19203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Likes_19203> parser() {
         return PARSER;
      }

      public Parser<C2S_Likes_19203> getParserForType() {
         return PARSER;
      }

      public C2S_Likes_19203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Likes_19203OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Likes_19203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Likes_19203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Likes_19203_descriptor;
         }

         public C2S_Likes_19203 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Likes_19203.getDefaultInstance();
         }

         public C2S_Likes_19203 build() {
            C2S_Likes_19203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Likes_19203 buildPartial() {
            C2S_Likes_19203 result = new C2S_Likes_19203(this);
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
            if (other instanceof C2S_Likes_19203) {
               return this.mergeFrom((C2S_Likes_19203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Likes_19203 other) {
            if (other == FaceBookShareMsg.C2S_Likes_19203.getDefaultInstance()) {
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
            C2S_Likes_19203 parsedMessage = null;

            try {
               parsedMessage = (C2S_Likes_19203)FaceBookShareMsg.C2S_Likes_19203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Likes_19203)e.getUnfinishedMessage();
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

   public static final class C2S_Share_19204 extends GeneratedMessageV3 implements C2S_Share_19204OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Share_19204 DEFAULT_INSTANCE = new C2S_Share_19204();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Share_19204> PARSER = new AbstractParser<C2S_Share_19204>() {
         public C2S_Share_19204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Share_19204(input, extensionRegistry);
         }
      };

      private C2S_Share_19204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Share_19204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Share_19204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Share_19204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Share_19204.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Share_19204)) {
            return super.equals(obj);
         } else {
            C2S_Share_19204 other = (C2S_Share_19204)obj;
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

      public static C2S_Share_19204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data);
      }

      public static C2S_Share_19204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Share_19204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data);
      }

      public static C2S_Share_19204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Share_19204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data);
      }

      public static C2S_Share_19204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Share_19204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Share_19204 parseFrom(InputStream input) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Share_19204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Share_19204 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Share_19204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Share_19204 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Share_19204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Share_19204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Share_19204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Share_19204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Share_19204> parser() {
         return PARSER;
      }

      public Parser<C2S_Share_19204> getParserForType() {
         return PARSER;
      }

      public C2S_Share_19204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Share_19204OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Share_19204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Share_19204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Share_19204_descriptor;
         }

         public C2S_Share_19204 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Share_19204.getDefaultInstance();
         }

         public C2S_Share_19204 build() {
            C2S_Share_19204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Share_19204 buildPartial() {
            C2S_Share_19204 result = new C2S_Share_19204(this);
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
            if (other instanceof C2S_Share_19204) {
               return this.mergeFrom((C2S_Share_19204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Share_19204 other) {
            if (other == FaceBookShareMsg.C2S_Share_19204.getDefaultInstance()) {
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
            C2S_Share_19204 parsedMessage = null;

            try {
               parsedMessage = (C2S_Share_19204)FaceBookShareMsg.C2S_Share_19204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Share_19204)e.getUnfinishedMessage();
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

   public static final class C2S_Invite_19205 extends GeneratedMessageV3 implements C2S_Invite_19205OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Invite_19205 DEFAULT_INSTANCE = new C2S_Invite_19205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Invite_19205> PARSER = new AbstractParser<C2S_Invite_19205>() {
         public C2S_Invite_19205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Invite_19205(input, extensionRegistry);
         }
      };

      private C2S_Invite_19205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Invite_19205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Invite_19205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Invite_19205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Invite_19205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Invite_19205)) {
            return super.equals(obj);
         } else {
            C2S_Invite_19205 other = (C2S_Invite_19205)obj;
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

      public static C2S_Invite_19205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data);
      }

      public static C2S_Invite_19205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_19205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data);
      }

      public static C2S_Invite_19205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_19205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data);
      }

      public static C2S_Invite_19205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Invite_19205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Invite_19205 parseFrom(InputStream input) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Invite_19205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Invite_19205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Invite_19205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Invite_19205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Invite_19205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Invite_19205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Invite_19205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Invite_19205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Invite_19205> parser() {
         return PARSER;
      }

      public Parser<C2S_Invite_19205> getParserForType() {
         return PARSER;
      }

      public C2S_Invite_19205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Invite_19205OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Invite_19205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Invite_19205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Invite_19205_descriptor;
         }

         public C2S_Invite_19205 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Invite_19205.getDefaultInstance();
         }

         public C2S_Invite_19205 build() {
            C2S_Invite_19205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Invite_19205 buildPartial() {
            C2S_Invite_19205 result = new C2S_Invite_19205(this);
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
            if (other instanceof C2S_Invite_19205) {
               return this.mergeFrom((C2S_Invite_19205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Invite_19205 other) {
            if (other == FaceBookShareMsg.C2S_Invite_19205.getDefaultInstance()) {
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
            C2S_Invite_19205 parsedMessage = null;

            try {
               parsedMessage = (C2S_Invite_19205)FaceBookShareMsg.C2S_Invite_19205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Invite_19205)e.getUnfinishedMessage();
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

   public static final class C2S_Community_19206 extends GeneratedMessageV3 implements C2S_Community_19206OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Community_19206 DEFAULT_INSTANCE = new C2S_Community_19206();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Community_19206> PARSER = new AbstractParser<C2S_Community_19206>() {
         public C2S_Community_19206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Community_19206(input, extensionRegistry);
         }
      };

      private C2S_Community_19206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Community_19206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Community_19206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Community_19206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Community_19206.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Community_19206)) {
            return super.equals(obj);
         } else {
            C2S_Community_19206 other = (C2S_Community_19206)obj;
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

      public static C2S_Community_19206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data);
      }

      public static C2S_Community_19206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Community_19206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data);
      }

      public static C2S_Community_19206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Community_19206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data);
      }

      public static C2S_Community_19206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Community_19206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Community_19206 parseFrom(InputStream input) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Community_19206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Community_19206 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Community_19206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Community_19206 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Community_19206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Community_19206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Community_19206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Community_19206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Community_19206> parser() {
         return PARSER;
      }

      public Parser<C2S_Community_19206> getParserForType() {
         return PARSER;
      }

      public C2S_Community_19206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Community_19206OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Community_19206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Community_19206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Community_19206_descriptor;
         }

         public C2S_Community_19206 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Community_19206.getDefaultInstance();
         }

         public C2S_Community_19206 build() {
            C2S_Community_19206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Community_19206 buildPartial() {
            C2S_Community_19206 result = new C2S_Community_19206(this);
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
            if (other instanceof C2S_Community_19206) {
               return this.mergeFrom((C2S_Community_19206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Community_19206 other) {
            if (other == FaceBookShareMsg.C2S_Community_19206.getDefaultInstance()) {
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
            C2S_Community_19206 parsedMessage = null;

            try {
               parsedMessage = (C2S_Community_19206)FaceBookShareMsg.C2S_Community_19206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Community_19206)e.getUnfinishedMessage();
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

   public static final class C2S_Advise_19207 extends GeneratedMessageV3 implements C2S_Advise_19207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SENDAWARD_FIELD_NUMBER = 1;
      private boolean sendAward_;
      private byte memoizedIsInitialized;
      private static final C2S_Advise_19207 DEFAULT_INSTANCE = new C2S_Advise_19207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Advise_19207> PARSER = new AbstractParser<C2S_Advise_19207>() {
         public C2S_Advise_19207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Advise_19207(input, extensionRegistry);
         }
      };

      private C2S_Advise_19207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Advise_19207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Advise_19207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Advise_19207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sendAward_ = input.readBool();
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Advise_19207.class, Builder.class);
      }

      public boolean hasSendAward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getSendAward() {
         return this.sendAward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSendAward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.sendAward_);
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
               size += CodedOutputStream.computeBoolSize(1, this.sendAward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Advise_19207)) {
            return super.equals(obj);
         } else {
            C2S_Advise_19207 other = (C2S_Advise_19207)obj;
            if (this.hasSendAward() != other.hasSendAward()) {
               return false;
            } else if (this.hasSendAward() && this.getSendAward() != other.getSendAward()) {
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
            if (this.hasSendAward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getSendAward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Advise_19207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data);
      }

      public static C2S_Advise_19207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Advise_19207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data);
      }

      public static C2S_Advise_19207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Advise_19207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data);
      }

      public static C2S_Advise_19207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Advise_19207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Advise_19207 parseFrom(InputStream input) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Advise_19207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Advise_19207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Advise_19207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Advise_19207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Advise_19207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Advise_19207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Advise_19207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Advise_19207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Advise_19207> parser() {
         return PARSER;
      }

      public Parser<C2S_Advise_19207> getParserForType() {
         return PARSER;
      }

      public C2S_Advise_19207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Advise_19207OrBuilder {
         private int bitField0_;
         private boolean sendAward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Advise_19207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Advise_19207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sendAward_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Advise_19207_descriptor;
         }

         public C2S_Advise_19207 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Advise_19207.getDefaultInstance();
         }

         public C2S_Advise_19207 build() {
            C2S_Advise_19207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Advise_19207 buildPartial() {
            C2S_Advise_19207 result = new C2S_Advise_19207(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sendAward_ = this.sendAward_;
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
            if (other instanceof C2S_Advise_19207) {
               return this.mergeFrom((C2S_Advise_19207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Advise_19207 other) {
            if (other == FaceBookShareMsg.C2S_Advise_19207.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSendAward()) {
                  this.setSendAward(other.getSendAward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSendAward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Advise_19207 parsedMessage = null;

            try {
               parsedMessage = (C2S_Advise_19207)FaceBookShareMsg.C2S_Advise_19207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Advise_19207)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSendAward() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getSendAward() {
            return this.sendAward_;
         }

         public Builder setSendAward(boolean value) {
            this.bitField0_ |= 1;
            this.sendAward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendAward() {
            this.bitField0_ &= -2;
            this.sendAward_ = false;
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

   public static final class C2S_Binding_19208 extends GeneratedMessageV3 implements C2S_Binding_19208OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Binding_19208 DEFAULT_INSTANCE = new C2S_Binding_19208();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Binding_19208> PARSER = new AbstractParser<C2S_Binding_19208>() {
         public C2S_Binding_19208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Binding_19208(input, extensionRegistry);
         }
      };

      private C2S_Binding_19208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Binding_19208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Binding_19208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Binding_19208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Binding_19208.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Binding_19208)) {
            return super.equals(obj);
         } else {
            C2S_Binding_19208 other = (C2S_Binding_19208)obj;
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

      public static C2S_Binding_19208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data);
      }

      public static C2S_Binding_19208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Binding_19208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data);
      }

      public static C2S_Binding_19208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Binding_19208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data);
      }

      public static C2S_Binding_19208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Binding_19208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Binding_19208 parseFrom(InputStream input) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Binding_19208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Binding_19208 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Binding_19208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Binding_19208 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Binding_19208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Binding_19208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Binding_19208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Binding_19208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Binding_19208> parser() {
         return PARSER;
      }

      public Parser<C2S_Binding_19208> getParserForType() {
         return PARSER;
      }

      public C2S_Binding_19208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Binding_19208OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Binding_19208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_Binding_19208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_Binding_19208_descriptor;
         }

         public C2S_Binding_19208 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_Binding_19208.getDefaultInstance();
         }

         public C2S_Binding_19208 build() {
            C2S_Binding_19208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Binding_19208 buildPartial() {
            C2S_Binding_19208 result = new C2S_Binding_19208(this);
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
            if (other instanceof C2S_Binding_19208) {
               return this.mergeFrom((C2S_Binding_19208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Binding_19208 other) {
            if (other == FaceBookShareMsg.C2S_Binding_19208.getDefaultInstance()) {
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
            C2S_Binding_19208 parsedMessage = null;

            try {
               parsedMessage = (C2S_Binding_19208)FaceBookShareMsg.C2S_Binding_19208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Binding_19208)e.getUnfinishedMessage();
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

   public static final class C2S_GooglePlayer_19209 extends GeneratedMessageV3 implements C2S_GooglePlayer_19209OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GooglePlayer_19209 DEFAULT_INSTANCE = new C2S_GooglePlayer_19209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GooglePlayer_19209> PARSER = new AbstractParser<C2S_GooglePlayer_19209>() {
         public C2S_GooglePlayer_19209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GooglePlayer_19209(input, extensionRegistry);
         }
      };

      private C2S_GooglePlayer_19209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GooglePlayer_19209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GooglePlayer_19209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GooglePlayer_19209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GooglePlayer_19209.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GooglePlayer_19209)) {
            return super.equals(obj);
         } else {
            C2S_GooglePlayer_19209 other = (C2S_GooglePlayer_19209)obj;
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

      public static C2S_GooglePlayer_19209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data);
      }

      public static C2S_GooglePlayer_19209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GooglePlayer_19209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data);
      }

      public static C2S_GooglePlayer_19209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GooglePlayer_19209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data);
      }

      public static C2S_GooglePlayer_19209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GooglePlayer_19209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GooglePlayer_19209 parseFrom(InputStream input) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GooglePlayer_19209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GooglePlayer_19209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GooglePlayer_19209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GooglePlayer_19209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GooglePlayer_19209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GooglePlayer_19209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GooglePlayer_19209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GooglePlayer_19209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GooglePlayer_19209> parser() {
         return PARSER;
      }

      public Parser<C2S_GooglePlayer_19209> getParserForType() {
         return PARSER;
      }

      public C2S_GooglePlayer_19209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GooglePlayer_19209OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GooglePlayer_19209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_GooglePlayer_19209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_GooglePlayer_19209_descriptor;
         }

         public C2S_GooglePlayer_19209 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_GooglePlayer_19209.getDefaultInstance();
         }

         public C2S_GooglePlayer_19209 build() {
            C2S_GooglePlayer_19209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GooglePlayer_19209 buildPartial() {
            C2S_GooglePlayer_19209 result = new C2S_GooglePlayer_19209(this);
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
            if (other instanceof C2S_GooglePlayer_19209) {
               return this.mergeFrom((C2S_GooglePlayer_19209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GooglePlayer_19209 other) {
            if (other == FaceBookShareMsg.C2S_GooglePlayer_19209.getDefaultInstance()) {
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
            C2S_GooglePlayer_19209 parsedMessage = null;

            try {
               parsedMessage = (C2S_GooglePlayer_19209)FaceBookShareMsg.C2S_GooglePlayer_19209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GooglePlayer_19209)e.getUnfinishedMessage();
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

   public static final class C2S_RecH5Guide_19210 extends GeneratedMessageV3 implements C2S_RecH5Guide_19210OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RecH5Guide_19210 DEFAULT_INSTANCE = new C2S_RecH5Guide_19210();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecH5Guide_19210> PARSER = new AbstractParser<C2S_RecH5Guide_19210>() {
         public C2S_RecH5Guide_19210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecH5Guide_19210(input, extensionRegistry);
         }
      };

      private C2S_RecH5Guide_19210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecH5Guide_19210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecH5Guide_19210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecH5Guide_19210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecH5Guide_19210.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecH5Guide_19210)) {
            return super.equals(obj);
         } else {
            C2S_RecH5Guide_19210 other = (C2S_RecH5Guide_19210)obj;
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

      public static C2S_RecH5Guide_19210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data);
      }

      public static C2S_RecH5Guide_19210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecH5Guide_19210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data);
      }

      public static C2S_RecH5Guide_19210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecH5Guide_19210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data);
      }

      public static C2S_RecH5Guide_19210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecH5Guide_19210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecH5Guide_19210 parseFrom(InputStream input) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecH5Guide_19210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecH5Guide_19210 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecH5Guide_19210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecH5Guide_19210 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecH5Guide_19210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecH5Guide_19210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecH5Guide_19210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecH5Guide_19210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecH5Guide_19210> parser() {
         return PARSER;
      }

      public Parser<C2S_RecH5Guide_19210> getParserForType() {
         return PARSER;
      }

      public C2S_RecH5Guide_19210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecH5Guide_19210OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecH5Guide_19210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaceBookShareMsg.C2S_RecH5Guide_19210.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaceBookShareMsg.internal_static_faceBookShare_com_gzbz_protobuf_C2S_RecH5Guide_19210_descriptor;
         }

         public C2S_RecH5Guide_19210 getDefaultInstanceForType() {
            return FaceBookShareMsg.C2S_RecH5Guide_19210.getDefaultInstance();
         }

         public C2S_RecH5Guide_19210 build() {
            C2S_RecH5Guide_19210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecH5Guide_19210 buildPartial() {
            C2S_RecH5Guide_19210 result = new C2S_RecH5Guide_19210(this);
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
            if (other instanceof C2S_RecH5Guide_19210) {
               return this.mergeFrom((C2S_RecH5Guide_19210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecH5Guide_19210 other) {
            if (other == FaceBookShareMsg.C2S_RecH5Guide_19210.getDefaultInstance()) {
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
            C2S_RecH5Guide_19210 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecH5Guide_19210)FaceBookShareMsg.C2S_RecH5Guide_19210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecH5Guide_19210)e.getUnfinishedMessage();
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

   public interface C2S_Advise_19207OrBuilder extends MessageOrBuilder {
      boolean hasSendAward();

      boolean getSendAward();
   }

   public interface C2S_Binding_19208OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Community_19206OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GooglePlayer_19209OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Invite_19205OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Likes_19203OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecH5Guide_19210OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Share_19204OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TotalInfo_19201OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_TotalInfo_19202OrBuilder extends MessageOrBuilder {
      boolean hasLikesState();

      int getLikesState();

      boolean hasShareState();

      int getShareState();

      boolean hasInviteState();

      int getInviteState();

      boolean hasCommunityState();

      int getCommunityState();

      boolean hasAdviseState();

      int getAdviseState();

      boolean hasBindingState();

      int getBindingState();

      boolean hasGooglePlayerState();

      int getGooglePlayerState();

      boolean hasH5GuideState();

      int getH5GuideState();
   }
}
