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

public final class FreeWelfareMsg {
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FreeWelfareMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011FreeWelfare.proto\u0012\u001dFreeWelfare.com.gzbz.protobuf\u001a\fcommon.proto\"\u001b\n\u0019C2S_FreeWelfareInfo_28301\"U\n\u0019S2C_FreeWelfareInfo_28302\u0012&\n\u000badvWatchNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0010\n\brecAdvId\u0018\u0002 \u0003(\u0005\" \n\u0012C2S_WatchAdv_28303\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"<\n\u0012S2C_WatchAdv_28304\u0012&\n\u000badvWatchNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"$\n\u0016C2S_RecAdvReward_28305\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"*\n\u0016S2C_RecAdvReward_28306\u0012\u0010\n\brecAdvId\u0018\u0001 \u0003(\u0005B%\n\u0011com.gzbz.protobufB\u000eFreeWelfareMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor, new String[0]);
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor, new String[]{"AdvWatchNum", "RecAdvId"});
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor, new String[]{"Id"});
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor, new String[]{"AdvWatchNum"});
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor, new String[]{"Id"});
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor, new String[]{"RecAdvId"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_FreeWelfareInfo_28301 extends GeneratedMessageV3 implements C2S_FreeWelfareInfo_28301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FreeWelfareInfo_28301 DEFAULT_INSTANCE = new C2S_FreeWelfareInfo_28301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeWelfareInfo_28301> PARSER = new AbstractParser<C2S_FreeWelfareInfo_28301>() {
         public C2S_FreeWelfareInfo_28301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeWelfareInfo_28301(input, extensionRegistry);
         }
      };

      private C2S_FreeWelfareInfo_28301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeWelfareInfo_28301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeWelfareInfo_28301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeWelfareInfo_28301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeWelfareInfo_28301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FreeWelfareInfo_28301)) {
            return super.equals(obj);
         } else {
            C2S_FreeWelfareInfo_28301 other = (C2S_FreeWelfareInfo_28301)obj;
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

      public static C2S_FreeWelfareInfo_28301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeWelfareInfo_28301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeWelfareInfo_28301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeWelfareInfo_28301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeWelfareInfo_28301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeWelfareInfo_28301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeWelfareInfo_28301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeWelfareInfo_28301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeWelfareInfo_28301> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeWelfareInfo_28301> getParserForType() {
         return PARSER;
      }

      public C2S_FreeWelfareInfo_28301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeWelfareInfo_28301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeWelfareInfo_28301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.C2S_FreeWelfareInfo_28301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_FreeWelfareInfo_28301_descriptor;
         }

         public C2S_FreeWelfareInfo_28301 getDefaultInstanceForType() {
            return FreeWelfareMsg.C2S_FreeWelfareInfo_28301.getDefaultInstance();
         }

         public C2S_FreeWelfareInfo_28301 build() {
            C2S_FreeWelfareInfo_28301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeWelfareInfo_28301 buildPartial() {
            C2S_FreeWelfareInfo_28301 result = new C2S_FreeWelfareInfo_28301(this);
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
            if (other instanceof C2S_FreeWelfareInfo_28301) {
               return this.mergeFrom((C2S_FreeWelfareInfo_28301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeWelfareInfo_28301 other) {
            if (other == FreeWelfareMsg.C2S_FreeWelfareInfo_28301.getDefaultInstance()) {
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
            C2S_FreeWelfareInfo_28301 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeWelfareInfo_28301)FreeWelfareMsg.C2S_FreeWelfareInfo_28301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeWelfareInfo_28301)e.getUnfinishedMessage();
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

   public static final class S2C_FreeWelfareInfo_28302 extends GeneratedMessageV3 implements S2C_FreeWelfareInfo_28302OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ADVWATCHNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> advWatchNum_;
      public static final int RECADVID_FIELD_NUMBER = 2;
      private Internal.IntList recAdvId_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeWelfareInfo_28302 DEFAULT_INSTANCE = new S2C_FreeWelfareInfo_28302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeWelfareInfo_28302> PARSER = new AbstractParser<S2C_FreeWelfareInfo_28302>() {
         public S2C_FreeWelfareInfo_28302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeWelfareInfo_28302(input, extensionRegistry);
         }
      };

      private S2C_FreeWelfareInfo_28302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeWelfareInfo_28302() {
         this.memoizedIsInitialized = -1;
         this.advWatchNum_ = Collections.emptyList();
         this.recAdvId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeWelfareInfo_28302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeWelfareInfo_28302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.advWatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.advWatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recAdvId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recAdvId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recAdvId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recAdvId_.addInt(input.readInt32());
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
                  this.advWatchNum_ = Collections.unmodifiableList(this.advWatchNum_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.recAdvId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeWelfareInfo_28302.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getAdvWatchNumList() {
         return this.advWatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList() {
         return this.advWatchNum_;
      }

      public int getAdvWatchNumCount() {
         return this.advWatchNum_.size();
      }

      public CommonMsg.MapDataII getAdvWatchNum(int index) {
         return (CommonMsg.MapDataII)this.advWatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.advWatchNum_.get(index);
      }

      public List<Integer> getRecAdvIdList() {
         return this.recAdvId_;
      }

      public int getRecAdvIdCount() {
         return this.recAdvId_.size();
      }

      public int getRecAdvId(int index) {
         return this.recAdvId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAdvWatchNumCount(); ++i) {
               if (!this.getAdvWatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.advWatchNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.advWatchNum_.get(i));
         }

         for(int i = 0; i < this.recAdvId_.size(); ++i) {
            output.writeInt32(2, this.recAdvId_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.advWatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.advWatchNum_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.recAdvId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recAdvId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecAdvIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FreeWelfareInfo_28302)) {
            return super.equals(obj);
         } else {
            S2C_FreeWelfareInfo_28302 other = (S2C_FreeWelfareInfo_28302)obj;
            if (!this.getAdvWatchNumList().equals(other.getAdvWatchNumList())) {
               return false;
            } else if (!this.getRecAdvIdList().equals(other.getRecAdvIdList())) {
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
            if (this.getAdvWatchNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAdvWatchNumList().hashCode();
            }

            if (this.getRecAdvIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecAdvIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeWelfareInfo_28302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeWelfareInfo_28302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeWelfareInfo_28302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeWelfareInfo_28302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeWelfareInfo_28302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeWelfareInfo_28302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeWelfareInfo_28302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeWelfareInfo_28302> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeWelfareInfo_28302> getParserForType() {
         return PARSER;
      }

      public S2C_FreeWelfareInfo_28302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeWelfareInfo_28302OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> advWatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> advWatchNumBuilder_;
         private Internal.IntList recAdvId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeWelfareInfo_28302.class, Builder.class);
         }

         private Builder() {
            this.advWatchNum_ = Collections.emptyList();
            this.recAdvId_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.advWatchNum_ = Collections.emptyList();
            this.recAdvId_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.S2C_FreeWelfareInfo_28302.alwaysUseFieldBuilders) {
               this.getAdvWatchNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.advWatchNumBuilder_.clear();
            }

            this.recAdvId_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_FreeWelfareInfo_28302_descriptor;
         }

         public S2C_FreeWelfareInfo_28302 getDefaultInstanceForType() {
            return FreeWelfareMsg.S2C_FreeWelfareInfo_28302.getDefaultInstance();
         }

         public S2C_FreeWelfareInfo_28302 build() {
            S2C_FreeWelfareInfo_28302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeWelfareInfo_28302 buildPartial() {
            S2C_FreeWelfareInfo_28302 result = new S2C_FreeWelfareInfo_28302(this);
            int from_bitField0_ = this.bitField0_;
            if (this.advWatchNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.advWatchNum_ = Collections.unmodifiableList(this.advWatchNum_);
                  this.bitField0_ &= -2;
               }

               result.advWatchNum_ = this.advWatchNum_;
            } else {
               result.advWatchNum_ = this.advWatchNumBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.recAdvId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.recAdvId_ = this.recAdvId_;
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
            if (other instanceof S2C_FreeWelfareInfo_28302) {
               return this.mergeFrom((S2C_FreeWelfareInfo_28302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeWelfareInfo_28302 other) {
            if (other == FreeWelfareMsg.S2C_FreeWelfareInfo_28302.getDefaultInstance()) {
               return this;
            } else {
               if (this.advWatchNumBuilder_ == null) {
                  if (!other.advWatchNum_.isEmpty()) {
                     if (this.advWatchNum_.isEmpty()) {
                        this.advWatchNum_ = other.advWatchNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAdvWatchNumIsMutable();
                        this.advWatchNum_.addAll(other.advWatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.advWatchNum_.isEmpty()) {
                  if (this.advWatchNumBuilder_.isEmpty()) {
                     this.advWatchNumBuilder_.dispose();
                     this.advWatchNumBuilder_ = null;
                     this.advWatchNum_ = other.advWatchNum_;
                     this.bitField0_ &= -2;
                     this.advWatchNumBuilder_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.alwaysUseFieldBuilders ? this.getAdvWatchNumFieldBuilder() : null;
                  } else {
                     this.advWatchNumBuilder_.addAllMessages(other.advWatchNum_);
                  }
               }

               if (!other.recAdvId_.isEmpty()) {
                  if (this.recAdvId_.isEmpty()) {
                     this.recAdvId_ = other.recAdvId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRecAdvIdIsMutable();
                     this.recAdvId_.addAll(other.recAdvId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAdvWatchNumCount(); ++i) {
               if (!this.getAdvWatchNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FreeWelfareInfo_28302 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeWelfareInfo_28302)FreeWelfareMsg.S2C_FreeWelfareInfo_28302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeWelfareInfo_28302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAdvWatchNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.advWatchNum_ = new ArrayList(this.advWatchNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getAdvWatchNumList() {
            return this.advWatchNumBuilder_ == null ? Collections.unmodifiableList(this.advWatchNum_) : this.advWatchNumBuilder_.getMessageList();
         }

         public int getAdvWatchNumCount() {
            return this.advWatchNumBuilder_ == null ? this.advWatchNum_.size() : this.advWatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAdvWatchNum(int index) {
            return this.advWatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.advWatchNum_.get(index) : (CommonMsg.MapDataII)this.advWatchNumBuilder_.getMessage(index);
         }

         public Builder setAdvWatchNum(int index, CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAdvWatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAdvWatchNum(CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAdvWatchNum(int index, CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAdvWatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAdvWatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAdvWatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.advWatchNum_);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAdvWatchNum() {
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeAdvWatchNum(int index) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.remove(index);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAdvWatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index) {
            return this.advWatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.advWatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.advWatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList() {
            return this.advWatchNumBuilder_ != null ? this.advWatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.advWatchNum_);
         }

         public CommonMsg.MapDataII.Builder addAdvWatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAdvWatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAdvWatchNumBuilderList() {
            return this.getAdvWatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAdvWatchNumFieldBuilder() {
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNumBuilder_ = new RepeatedFieldBuilderV3(this.advWatchNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.advWatchNum_ = null;
            }

            return this.advWatchNumBuilder_;
         }

         private void ensureRecAdvIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recAdvId_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.mutableCopy(this.recAdvId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRecAdvIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.recAdvId_) : this.recAdvId_);
         }

         public int getRecAdvIdCount() {
            return this.recAdvId_.size();
         }

         public int getRecAdvId(int index) {
            return this.recAdvId_.getInt(index);
         }

         public Builder setRecAdvId(int index, int value) {
            this.ensureRecAdvIdIsMutable();
            this.recAdvId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecAdvId(int value) {
            this.ensureRecAdvIdIsMutable();
            this.recAdvId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecAdvId(Iterable<? extends Integer> values) {
            this.ensureRecAdvIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recAdvId_);
            this.onChanged();
            return this;
         }

         public Builder clearRecAdvId() {
            this.recAdvId_ = FreeWelfareMsg.S2C_FreeWelfareInfo_28302.emptyIntList();
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

   public static final class C2S_WatchAdv_28303 extends GeneratedMessageV3 implements C2S_WatchAdv_28303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_WatchAdv_28303 DEFAULT_INSTANCE = new C2S_WatchAdv_28303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchAdv_28303> PARSER = new AbstractParser<C2S_WatchAdv_28303>() {
         public C2S_WatchAdv_28303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchAdv_28303(input, extensionRegistry);
         }
      };

      private C2S_WatchAdv_28303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchAdv_28303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchAdv_28303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchAdv_28303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchAdv_28303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WatchAdv_28303)) {
            return super.equals(obj);
         } else {
            C2S_WatchAdv_28303 other = (C2S_WatchAdv_28303)obj;
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

      public static C2S_WatchAdv_28303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data);
      }

      public static C2S_WatchAdv_28303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAdv_28303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data);
      }

      public static C2S_WatchAdv_28303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAdv_28303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data);
      }

      public static C2S_WatchAdv_28303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAdv_28303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAdv_28303 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchAdv_28303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchAdv_28303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchAdv_28303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchAdv_28303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchAdv_28303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAdv_28303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchAdv_28303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchAdv_28303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchAdv_28303> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchAdv_28303> getParserForType() {
         return PARSER;
      }

      public C2S_WatchAdv_28303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchAdv_28303OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchAdv_28303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.C2S_WatchAdv_28303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_WatchAdv_28303_descriptor;
         }

         public C2S_WatchAdv_28303 getDefaultInstanceForType() {
            return FreeWelfareMsg.C2S_WatchAdv_28303.getDefaultInstance();
         }

         public C2S_WatchAdv_28303 build() {
            C2S_WatchAdv_28303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchAdv_28303 buildPartial() {
            C2S_WatchAdv_28303 result = new C2S_WatchAdv_28303(this);
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
            if (other instanceof C2S_WatchAdv_28303) {
               return this.mergeFrom((C2S_WatchAdv_28303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchAdv_28303 other) {
            if (other == FreeWelfareMsg.C2S_WatchAdv_28303.getDefaultInstance()) {
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
            C2S_WatchAdv_28303 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchAdv_28303)FreeWelfareMsg.C2S_WatchAdv_28303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchAdv_28303)e.getUnfinishedMessage();
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

   public static final class S2C_WatchAdv_28304 extends GeneratedMessageV3 implements S2C_WatchAdv_28304OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ADVWATCHNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> advWatchNum_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchAdv_28304 DEFAULT_INSTANCE = new S2C_WatchAdv_28304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchAdv_28304> PARSER = new AbstractParser<S2C_WatchAdv_28304>() {
         public S2C_WatchAdv_28304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchAdv_28304(input, extensionRegistry);
         }
      };

      private S2C_WatchAdv_28304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchAdv_28304() {
         this.memoizedIsInitialized = -1;
         this.advWatchNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchAdv_28304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchAdv_28304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.advWatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.advWatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.advWatchNum_ = Collections.unmodifiableList(this.advWatchNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAdv_28304.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getAdvWatchNumList() {
         return this.advWatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList() {
         return this.advWatchNum_;
      }

      public int getAdvWatchNumCount() {
         return this.advWatchNum_.size();
      }

      public CommonMsg.MapDataII getAdvWatchNum(int index) {
         return (CommonMsg.MapDataII)this.advWatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.advWatchNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAdvWatchNumCount(); ++i) {
               if (!this.getAdvWatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.advWatchNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.advWatchNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.advWatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.advWatchNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchAdv_28304)) {
            return super.equals(obj);
         } else {
            S2C_WatchAdv_28304 other = (S2C_WatchAdv_28304)obj;
            if (!this.getAdvWatchNumList().equals(other.getAdvWatchNumList())) {
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
            if (this.getAdvWatchNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAdvWatchNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchAdv_28304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data);
      }

      public static S2C_WatchAdv_28304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAdv_28304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data);
      }

      public static S2C_WatchAdv_28304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAdv_28304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data);
      }

      public static S2C_WatchAdv_28304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAdv_28304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAdv_28304 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAdv_28304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAdv_28304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchAdv_28304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAdv_28304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAdv_28304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAdv_28304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchAdv_28304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchAdv_28304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchAdv_28304> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchAdv_28304> getParserForType() {
         return PARSER;
      }

      public S2C_WatchAdv_28304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchAdv_28304OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> advWatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> advWatchNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAdv_28304.class, Builder.class);
         }

         private Builder() {
            this.advWatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.advWatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.S2C_WatchAdv_28304.alwaysUseFieldBuilders) {
               this.getAdvWatchNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.advWatchNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_WatchAdv_28304_descriptor;
         }

         public S2C_WatchAdv_28304 getDefaultInstanceForType() {
            return FreeWelfareMsg.S2C_WatchAdv_28304.getDefaultInstance();
         }

         public S2C_WatchAdv_28304 build() {
            S2C_WatchAdv_28304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchAdv_28304 buildPartial() {
            S2C_WatchAdv_28304 result = new S2C_WatchAdv_28304(this);
            int from_bitField0_ = this.bitField0_;
            if (this.advWatchNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.advWatchNum_ = Collections.unmodifiableList(this.advWatchNum_);
                  this.bitField0_ &= -2;
               }

               result.advWatchNum_ = this.advWatchNum_;
            } else {
               result.advWatchNum_ = this.advWatchNumBuilder_.build();
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
            if (other instanceof S2C_WatchAdv_28304) {
               return this.mergeFrom((S2C_WatchAdv_28304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchAdv_28304 other) {
            if (other == FreeWelfareMsg.S2C_WatchAdv_28304.getDefaultInstance()) {
               return this;
            } else {
               if (this.advWatchNumBuilder_ == null) {
                  if (!other.advWatchNum_.isEmpty()) {
                     if (this.advWatchNum_.isEmpty()) {
                        this.advWatchNum_ = other.advWatchNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAdvWatchNumIsMutable();
                        this.advWatchNum_.addAll(other.advWatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.advWatchNum_.isEmpty()) {
                  if (this.advWatchNumBuilder_.isEmpty()) {
                     this.advWatchNumBuilder_.dispose();
                     this.advWatchNumBuilder_ = null;
                     this.advWatchNum_ = other.advWatchNum_;
                     this.bitField0_ &= -2;
                     this.advWatchNumBuilder_ = FreeWelfareMsg.S2C_WatchAdv_28304.alwaysUseFieldBuilders ? this.getAdvWatchNumFieldBuilder() : null;
                  } else {
                     this.advWatchNumBuilder_.addAllMessages(other.advWatchNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAdvWatchNumCount(); ++i) {
               if (!this.getAdvWatchNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WatchAdv_28304 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchAdv_28304)FreeWelfareMsg.S2C_WatchAdv_28304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchAdv_28304)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAdvWatchNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.advWatchNum_ = new ArrayList(this.advWatchNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getAdvWatchNumList() {
            return this.advWatchNumBuilder_ == null ? Collections.unmodifiableList(this.advWatchNum_) : this.advWatchNumBuilder_.getMessageList();
         }

         public int getAdvWatchNumCount() {
            return this.advWatchNumBuilder_ == null ? this.advWatchNum_.size() : this.advWatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAdvWatchNum(int index) {
            return this.advWatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.advWatchNum_.get(index) : (CommonMsg.MapDataII)this.advWatchNumBuilder_.getMessage(index);
         }

         public Builder setAdvWatchNum(int index, CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAdvWatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAdvWatchNum(CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAdvWatchNum(int index, CommonMsg.MapDataII value) {
            if (this.advWatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAdvWatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAdvWatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAdvWatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.advWatchNum_);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAdvWatchNum() {
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeAdvWatchNum(int index) {
            if (this.advWatchNumBuilder_ == null) {
               this.ensureAdvWatchNumIsMutable();
               this.advWatchNum_.remove(index);
               this.onChanged();
            } else {
               this.advWatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAdvWatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index) {
            return this.advWatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.advWatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.advWatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList() {
            return this.advWatchNumBuilder_ != null ? this.advWatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.advWatchNum_);
         }

         public CommonMsg.MapDataII.Builder addAdvWatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAdvWatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAdvWatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAdvWatchNumBuilderList() {
            return this.getAdvWatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAdvWatchNumFieldBuilder() {
            if (this.advWatchNumBuilder_ == null) {
               this.advWatchNumBuilder_ = new RepeatedFieldBuilderV3(this.advWatchNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.advWatchNum_ = null;
            }

            return this.advWatchNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecAdvReward_28305 extends GeneratedMessageV3 implements C2S_RecAdvReward_28305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RecAdvReward_28305 DEFAULT_INSTANCE = new C2S_RecAdvReward_28305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecAdvReward_28305> PARSER = new AbstractParser<C2S_RecAdvReward_28305>() {
         public C2S_RecAdvReward_28305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecAdvReward_28305(input, extensionRegistry);
         }
      };

      private C2S_RecAdvReward_28305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecAdvReward_28305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecAdvReward_28305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecAdvReward_28305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecAdvReward_28305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecAdvReward_28305)) {
            return super.equals(obj);
         } else {
            C2S_RecAdvReward_28305 other = (C2S_RecAdvReward_28305)obj;
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

      public static C2S_RecAdvReward_28305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data);
      }

      public static C2S_RecAdvReward_28305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecAdvReward_28305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data);
      }

      public static C2S_RecAdvReward_28305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecAdvReward_28305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data);
      }

      public static C2S_RecAdvReward_28305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecAdvReward_28305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecAdvReward_28305 parseFrom(InputStream input) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecAdvReward_28305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecAdvReward_28305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecAdvReward_28305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecAdvReward_28305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecAdvReward_28305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecAdvReward_28305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecAdvReward_28305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecAdvReward_28305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecAdvReward_28305> parser() {
         return PARSER;
      }

      public Parser<C2S_RecAdvReward_28305> getParserForType() {
         return PARSER;
      }

      public C2S_RecAdvReward_28305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecAdvReward_28305OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecAdvReward_28305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.C2S_RecAdvReward_28305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_C2S_RecAdvReward_28305_descriptor;
         }

         public C2S_RecAdvReward_28305 getDefaultInstanceForType() {
            return FreeWelfareMsg.C2S_RecAdvReward_28305.getDefaultInstance();
         }

         public C2S_RecAdvReward_28305 build() {
            C2S_RecAdvReward_28305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecAdvReward_28305 buildPartial() {
            C2S_RecAdvReward_28305 result = new C2S_RecAdvReward_28305(this);
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
            if (other instanceof C2S_RecAdvReward_28305) {
               return this.mergeFrom((C2S_RecAdvReward_28305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecAdvReward_28305 other) {
            if (other == FreeWelfareMsg.C2S_RecAdvReward_28305.getDefaultInstance()) {
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
            C2S_RecAdvReward_28305 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecAdvReward_28305)FreeWelfareMsg.C2S_RecAdvReward_28305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecAdvReward_28305)e.getUnfinishedMessage();
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

   public static final class S2C_RecAdvReward_28306 extends GeneratedMessageV3 implements S2C_RecAdvReward_28306OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECADVID_FIELD_NUMBER = 1;
      private Internal.IntList recAdvId_;
      private byte memoizedIsInitialized;
      private static final S2C_RecAdvReward_28306 DEFAULT_INSTANCE = new S2C_RecAdvReward_28306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecAdvReward_28306> PARSER = new AbstractParser<S2C_RecAdvReward_28306>() {
         public S2C_RecAdvReward_28306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecAdvReward_28306(input, extensionRegistry);
         }
      };

      private S2C_RecAdvReward_28306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecAdvReward_28306() {
         this.memoizedIsInitialized = -1;
         this.recAdvId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecAdvReward_28306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecAdvReward_28306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recAdvId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recAdvId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recAdvId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recAdvId_.addInt(input.readInt32());
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
                  this.recAdvId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecAdvReward_28306.class, Builder.class);
      }

      public List<Integer> getRecAdvIdList() {
         return this.recAdvId_;
      }

      public int getRecAdvIdCount() {
         return this.recAdvId_.size();
      }

      public int getRecAdvId(int index) {
         return this.recAdvId_.getInt(index);
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
         for(int i = 0; i < this.recAdvId_.size(); ++i) {
            output.writeInt32(1, this.recAdvId_.getInt(i));
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

            for(int i = 0; i < this.recAdvId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recAdvId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecAdvIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecAdvReward_28306)) {
            return super.equals(obj);
         } else {
            S2C_RecAdvReward_28306 other = (S2C_RecAdvReward_28306)obj;
            if (!this.getRecAdvIdList().equals(other.getRecAdvIdList())) {
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
            if (this.getRecAdvIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecAdvIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecAdvReward_28306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data);
      }

      public static S2C_RecAdvReward_28306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecAdvReward_28306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data);
      }

      public static S2C_RecAdvReward_28306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecAdvReward_28306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data);
      }

      public static S2C_RecAdvReward_28306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecAdvReward_28306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecAdvReward_28306 parseFrom(InputStream input) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecAdvReward_28306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecAdvReward_28306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecAdvReward_28306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecAdvReward_28306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecAdvReward_28306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecAdvReward_28306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecAdvReward_28306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecAdvReward_28306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecAdvReward_28306> parser() {
         return PARSER;
      }

      public Parser<S2C_RecAdvReward_28306> getParserForType() {
         return PARSER;
      }

      public S2C_RecAdvReward_28306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecAdvReward_28306OrBuilder {
         private int bitField0_;
         private Internal.IntList recAdvId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecAdvReward_28306.class, Builder.class);
         }

         private Builder() {
            this.recAdvId_ = FreeWelfareMsg.S2C_RecAdvReward_28306.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recAdvId_ = FreeWelfareMsg.S2C_RecAdvReward_28306.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FreeWelfareMsg.S2C_RecAdvReward_28306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recAdvId_ = FreeWelfareMsg.S2C_RecAdvReward_28306.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FreeWelfareMsg.internal_static_FreeWelfare_com_gzbz_protobuf_S2C_RecAdvReward_28306_descriptor;
         }

         public S2C_RecAdvReward_28306 getDefaultInstanceForType() {
            return FreeWelfareMsg.S2C_RecAdvReward_28306.getDefaultInstance();
         }

         public S2C_RecAdvReward_28306 build() {
            S2C_RecAdvReward_28306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecAdvReward_28306 buildPartial() {
            S2C_RecAdvReward_28306 result = new S2C_RecAdvReward_28306(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.recAdvId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.recAdvId_ = this.recAdvId_;
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
            if (other instanceof S2C_RecAdvReward_28306) {
               return this.mergeFrom((S2C_RecAdvReward_28306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecAdvReward_28306 other) {
            if (other == FreeWelfareMsg.S2C_RecAdvReward_28306.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recAdvId_.isEmpty()) {
                  if (this.recAdvId_.isEmpty()) {
                     this.recAdvId_ = other.recAdvId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecAdvIdIsMutable();
                     this.recAdvId_.addAll(other.recAdvId_);
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
            S2C_RecAdvReward_28306 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecAdvReward_28306)FreeWelfareMsg.S2C_RecAdvReward_28306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecAdvReward_28306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecAdvIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recAdvId_ = FreeWelfareMsg.S2C_RecAdvReward_28306.mutableCopy(this.recAdvId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRecAdvIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.recAdvId_) : this.recAdvId_);
         }

         public int getRecAdvIdCount() {
            return this.recAdvId_.size();
         }

         public int getRecAdvId(int index) {
            return this.recAdvId_.getInt(index);
         }

         public Builder setRecAdvId(int index, int value) {
            this.ensureRecAdvIdIsMutable();
            this.recAdvId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecAdvId(int value) {
            this.ensureRecAdvIdIsMutable();
            this.recAdvId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecAdvId(Iterable<? extends Integer> values) {
            this.ensureRecAdvIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recAdvId_);
            this.onChanged();
            return this;
         }

         public Builder clearRecAdvId() {
            this.recAdvId_ = FreeWelfareMsg.S2C_RecAdvReward_28306.emptyIntList();
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

   public interface C2S_FreeWelfareInfo_28301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecAdvReward_28305OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_WatchAdv_28303OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_FreeWelfareInfo_28302OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getAdvWatchNumList();

      CommonMsg.MapDataII getAdvWatchNum(int index);

      int getAdvWatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index);

      List<Integer> getRecAdvIdList();

      int getRecAdvIdCount();

      int getRecAdvId(int index);
   }

   public interface S2C_RecAdvReward_28306OrBuilder extends MessageOrBuilder {
      List<Integer> getRecAdvIdList();

      int getRecAdvIdCount();

      int getRecAdvId(int index);
   }

   public interface S2C_WatchAdv_28304OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getAdvWatchNumList();

      CommonMsg.MapDataII getAdvWatchNum(int index);

      int getAdvWatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAdvWatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAdvWatchNumOrBuilder(int index);
   }
}
