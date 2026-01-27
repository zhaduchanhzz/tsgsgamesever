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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LuckDrawMsg {
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_StepHeros_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LuckDrawMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eLuckDraw.proto\u0012\u001aluckDraw.com.gzbz.protobuf\u001a\fcommon.proto\"*\n\tStepHeros\u0012\f\n\u0004step\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007heroIds\u0018\u0002 \u0003(\u0005\"\u0012\n\u0010C2S_OpenUi_12701\"\u0089\u0001\n\u0010S2C_OpenUi_12702\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0002 \u0003(\u0005\u00128\n\tstepHeros\u0018\u0003 \u0003(\u000b2%.luckDraw.com.gzbz.protobuf.StepHeros\u0012\u001b\n\u0005tasks\u0018\u0004 \u0003(\u000b2\f.common.Task\"-\n\u000eC2S_Draw_12703\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004step\u0018\u0002 \u0002(\u0005\"Z\n\u000eS2C_Draw_12704\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00128\n\tstepHeros\u0018\u0002 \u0002(\u000b2%.luckDraw.com.gzbz.protobuf.StepHeros\"3\n\u0014C2S_TakeReward_12705\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004step\u0018\u0002 \u0002(\u0005\"\u009a\u0001\n\u0014S2C_TakeReward_12706\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005round\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0003 \u0003(\u0005\u00128\n\tstepHeros\u0018\u0004 \u0003(\u000b2%.luckDraw.com.gzbz.protobuf.StepHeros\u0012\u0018\n\u0010isTakedAllReward\u0018\u0005 \u0001(\b\"3\n\u0014S2C_UpdateTask_12708\u0012\u001b\n\u0005tasks\u0018\u0001 \u0003(\u000b2\f.common.TaskB\"\n\u0011com.gzbz.protobufB\u000bLuckDrawMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_luckDraw_com_gzbz_protobuf_StepHeros_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor, new String[]{"Step", "HeroIds"});
      internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor, new String[0]);
      internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor, new String[]{"Round", "TakedId", "StepHeros", "Tasks"});
      internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor, new String[]{"Round", "Step"});
      internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor, new String[]{"Result", "StepHeros"});
      internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor, new String[]{"Round", "Step"});
      internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor, new String[]{"Result", "Round", "TakedId", "StepHeros", "IsTakedAllReward"});
      internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor, new String[]{"Tasks"});
      CommonMsg.getDescriptor();
   }

   public static final class StepHeros extends GeneratedMessageV3 implements StepHerosOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STEP_FIELD_NUMBER = 1;
      private int step_;
      public static final int HEROIDS_FIELD_NUMBER = 2;
      private Internal.IntList heroIds_;
      private byte memoizedIsInitialized;
      private static final StepHeros DEFAULT_INSTANCE = new StepHeros();
      /** @deprecated */
      @Deprecated
      public static final Parser<StepHeros> PARSER = new AbstractParser<StepHeros>() {
         public StepHeros parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new StepHeros(input, extensionRegistry);
         }
      };

      private StepHeros(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private StepHeros() {
         this.memoizedIsInitialized = -1;
         this.heroIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new StepHeros();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private StepHeros(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.step_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroIds_.addInt(input.readInt32());
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
                  this.heroIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_StepHeros_fieldAccessorTable.ensureFieldAccessorsInitialized(StepHeros.class, Builder.class);
      }

      public boolean hasStep() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStep() {
         return this.step_;
      }

      public List<Integer> getHeroIdsList() {
         return this.heroIds_;
      }

      public int getHeroIdsCount() {
         return this.heroIds_.size();
      }

      public int getHeroIds(int index) {
         return this.heroIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.step_);
         }

         for(int i = 0; i < this.heroIds_.size(); ++i) {
            output.writeInt32(2, this.heroIds_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.step_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof StepHeros)) {
            return super.equals(obj);
         } else {
            StepHeros other = (StepHeros)obj;
            if (this.hasStep() != other.hasStep()) {
               return false;
            } else if (this.hasStep() && this.getStep() != other.getStep()) {
               return false;
            } else if (!this.getHeroIdsList().equals(other.getHeroIdsList())) {
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
            if (this.hasStep()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStep();
            }

            if (this.getHeroIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static StepHeros parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data);
      }

      public static StepHeros parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StepHeros parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data);
      }

      public static StepHeros parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StepHeros parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data);
      }

      public static StepHeros parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StepHeros)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StepHeros parseFrom(InputStream input) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StepHeros parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static StepHeros parseDelimitedFrom(InputStream input) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static StepHeros parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static StepHeros parseFrom(CodedInputStream input) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StepHeros parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StepHeros)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(StepHeros prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static StepHeros getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StepHeros> parser() {
         return PARSER;
      }

      public Parser<StepHeros> getParserForType() {
         return PARSER;
      }

      public StepHeros getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StepHerosOrBuilder {
         private int bitField0_;
         private int step_;
         private Internal.IntList heroIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_StepHeros_fieldAccessorTable.ensureFieldAccessorsInitialized(StepHeros.class, Builder.class);
         }

         private Builder() {
            this.heroIds_ = LuckDrawMsg.StepHeros.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroIds_ = LuckDrawMsg.StepHeros.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.StepHeros.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.step_ = 0;
            this.bitField0_ &= -2;
            this.heroIds_ = LuckDrawMsg.StepHeros.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_StepHeros_descriptor;
         }

         public StepHeros getDefaultInstanceForType() {
            return LuckDrawMsg.StepHeros.getDefaultInstance();
         }

         public StepHeros build() {
            StepHeros result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public StepHeros buildPartial() {
            StepHeros result = new StepHeros(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.step_ = this.step_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroIds_ = this.heroIds_;
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
            if (other instanceof StepHeros) {
               return this.mergeFrom((StepHeros)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(StepHeros other) {
            if (other == LuckDrawMsg.StepHeros.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStep()) {
                  this.setStep(other.getStep());
               }

               if (!other.heroIds_.isEmpty()) {
                  if (this.heroIds_.isEmpty()) {
                     this.heroIds_ = other.heroIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroIdsIsMutable();
                     this.heroIds_.addAll(other.heroIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStep();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            StepHeros parsedMessage = null;

            try {
               parsedMessage = (StepHeros)LuckDrawMsg.StepHeros.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (StepHeros)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStep() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStep() {
            return this.step_;
         }

         public Builder setStep(int value) {
            this.bitField0_ |= 1;
            this.step_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStep() {
            this.bitField0_ &= -2;
            this.step_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroIds_ = LuckDrawMsg.StepHeros.mutableCopy(this.heroIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroIds_) : this.heroIds_);
         }

         public int getHeroIdsCount() {
            return this.heroIds_.size();
         }

         public int getHeroIds(int index) {
            return this.heroIds_.getInt(index);
         }

         public Builder setHeroIds(int index, int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroIds(int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroIds(Iterable<? extends Integer> values) {
            this.ensureHeroIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroIds() {
            this.heroIds_ = LuckDrawMsg.StepHeros.emptyIntList();
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

   public static final class C2S_OpenUi_12701 extends GeneratedMessageV3 implements C2S_OpenUi_12701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_12701 DEFAULT_INSTANCE = new C2S_OpenUi_12701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_12701> PARSER = new AbstractParser<C2S_OpenUi_12701>() {
         public C2S_OpenUi_12701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_12701(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_12701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_12701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_12701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_12701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_12701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_12701)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_12701 other = (C2S_OpenUi_12701)obj;
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

      public static C2S_OpenUi_12701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_12701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_12701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_12701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_12701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_12701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_12701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_12701 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_12701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_12701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_12701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_12701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_12701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_12701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_12701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_12701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_12701> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_12701> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_12701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_12701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_12701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.C2S_OpenUi_12701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_OpenUi_12701_descriptor;
         }

         public C2S_OpenUi_12701 getDefaultInstanceForType() {
            return LuckDrawMsg.C2S_OpenUi_12701.getDefaultInstance();
         }

         public C2S_OpenUi_12701 build() {
            C2S_OpenUi_12701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_12701 buildPartial() {
            C2S_OpenUi_12701 result = new C2S_OpenUi_12701(this);
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
            if (other instanceof C2S_OpenUi_12701) {
               return this.mergeFrom((C2S_OpenUi_12701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_12701 other) {
            if (other == LuckDrawMsg.C2S_OpenUi_12701.getDefaultInstance()) {
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
            C2S_OpenUi_12701 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_12701)LuckDrawMsg.C2S_OpenUi_12701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_12701)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUi_12702 extends GeneratedMessageV3 implements S2C_OpenUi_12702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int TAKEDID_FIELD_NUMBER = 2;
      private Internal.IntList takedId_;
      public static final int STEPHEROS_FIELD_NUMBER = 3;
      private List<StepHeros> stepHeros_;
      public static final int TASKS_FIELD_NUMBER = 4;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUi_12702 DEFAULT_INSTANCE = new S2C_OpenUi_12702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUi_12702> PARSER = new AbstractParser<S2C_OpenUi_12702>() {
         public S2C_OpenUi_12702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUi_12702(input, extensionRegistry);
         }
      };

      private S2C_OpenUi_12702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUi_12702() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
         this.stepHeros_ = Collections.emptyList();
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUi_12702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUi_12702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.round_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.stepHeros_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.stepHeros_.add(input.readMessage(LuckDrawMsg.StepHeros.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.takedId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.stepHeros_ = Collections.unmodifiableList(this.stepHeros_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_12702.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public List<Integer> getTakedIdList() {
         return this.takedId_;
      }

      public int getTakedIdCount() {
         return this.takedId_.size();
      }

      public int getTakedId(int index) {
         return this.takedId_.getInt(index);
      }

      public List<StepHeros> getStepHerosList() {
         return this.stepHeros_;
      }

      public List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList() {
         return this.stepHeros_;
      }

      public int getStepHerosCount() {
         return this.stepHeros_.size();
      }

      public StepHeros getStepHeros(int index) {
         return (StepHeros)this.stepHeros_.get(index);
      }

      public StepHerosOrBuilder getStepHerosOrBuilder(int index) {
         return (StepHerosOrBuilder)this.stepHeros_.get(index);
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStepHerosCount(); ++i) {
               if (!this.getStepHeros(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
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
            output.writeInt32(1, this.round_);
         }

         for(int i = 0; i < this.takedId_.size(); ++i) {
            output.writeInt32(2, this.takedId_.getInt(i));
         }

         for(int i = 0; i < this.stepHeros_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.stepHeros_.get(i));
         }

         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.tasks_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdList().size();

            for(int i = 0; i < this.stepHeros_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.stepHeros_.get(i));
            }

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUi_12702)) {
            return super.equals(obj);
         } else {
            S2C_OpenUi_12702 other = (S2C_OpenUi_12702)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (!this.getTakedIdList().equals(other.getTakedIdList())) {
               return false;
            } else if (!this.getStepHerosList().equals(other.getStepHerosList())) {
               return false;
            } else if (!this.getTasksList().equals(other.getTasksList())) {
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
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.getTakedIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedIdList().hashCode();
            }

            if (this.getStepHerosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStepHerosList().hashCode();
            }

            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUi_12702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_12702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_12702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_12702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_12702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_12702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_12702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_12702 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_12702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_12702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_12702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_12702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_12702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_12702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUi_12702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUi_12702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUi_12702> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUi_12702> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUi_12702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUi_12702OrBuilder {
         private int bitField0_;
         private int round_;
         private Internal.IntList takedId_;
         private List<StepHeros> stepHeros_;
         private RepeatedFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> stepHerosBuilder_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_12702.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = LuckDrawMsg.S2C_OpenUi_12702.emptyIntList();
            this.stepHeros_ = Collections.emptyList();
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = LuckDrawMsg.S2C_OpenUi_12702.emptyIntList();
            this.stepHeros_ = Collections.emptyList();
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.S2C_OpenUi_12702.alwaysUseFieldBuilders) {
               this.getStepHerosFieldBuilder();
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.takedId_ = LuckDrawMsg.S2C_OpenUi_12702.emptyIntList();
            this.bitField0_ &= -3;
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.stepHerosBuilder_.clear();
            }

            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_OpenUi_12702_descriptor;
         }

         public S2C_OpenUi_12702 getDefaultInstanceForType() {
            return LuckDrawMsg.S2C_OpenUi_12702.getDefaultInstance();
         }

         public S2C_OpenUi_12702 build() {
            S2C_OpenUi_12702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUi_12702 buildPartial() {
            S2C_OpenUi_12702 result = new S2C_OpenUi_12702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedId_ = this.takedId_;
            if (this.stepHerosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.stepHeros_ = Collections.unmodifiableList(this.stepHeros_);
                  this.bitField0_ &= -5;
               }

               result.stepHeros_ = this.stepHeros_;
            } else {
               result.stepHeros_ = this.stepHerosBuilder_.build();
            }

            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -9;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof S2C_OpenUi_12702) {
               return this.mergeFrom((S2C_OpenUi_12702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUi_12702 other) {
            if (other == LuckDrawMsg.S2C_OpenUi_12702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (!other.takedId_.isEmpty()) {
                  if (this.takedId_.isEmpty()) {
                     this.takedId_ = other.takedId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedIdIsMutable();
                     this.takedId_.addAll(other.takedId_);
                  }

                  this.onChanged();
               }

               if (this.stepHerosBuilder_ == null) {
                  if (!other.stepHeros_.isEmpty()) {
                     if (this.stepHeros_.isEmpty()) {
                        this.stepHeros_ = other.stepHeros_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureStepHerosIsMutable();
                        this.stepHeros_.addAll(other.stepHeros_);
                     }

                     this.onChanged();
                  }
               } else if (!other.stepHeros_.isEmpty()) {
                  if (this.stepHerosBuilder_.isEmpty()) {
                     this.stepHerosBuilder_.dispose();
                     this.stepHerosBuilder_ = null;
                     this.stepHeros_ = other.stepHeros_;
                     this.bitField0_ &= -5;
                     this.stepHerosBuilder_ = LuckDrawMsg.S2C_OpenUi_12702.alwaysUseFieldBuilders ? this.getStepHerosFieldBuilder() : null;
                  } else {
                     this.stepHerosBuilder_.addAllMessages(other.stepHeros_);
                  }
               }

               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -9;
                     this.tasksBuilder_ = LuckDrawMsg.S2C_OpenUi_12702.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else {
               for(int i = 0; i < this.getStepHerosCount(); ++i) {
                  if (!this.getStepHeros(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUi_12702 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUi_12702)LuckDrawMsg.S2C_OpenUi_12702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUi_12702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTakedIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedId_ = LuckDrawMsg.S2C_OpenUi_12702.mutableCopy(this.takedId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedId_) : this.takedId_);
         }

         public int getTakedIdCount() {
            return this.takedId_.size();
         }

         public int getTakedId(int index) {
            return this.takedId_.getInt(index);
         }

         public Builder setTakedId(int index, int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedId(int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedId(Iterable<? extends Integer> values) {
            this.ensureTakedIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedId() {
            this.takedId_ = LuckDrawMsg.S2C_OpenUi_12702.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureStepHerosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.stepHeros_ = new ArrayList(this.stepHeros_);
               this.bitField0_ |= 4;
            }

         }

         public List<StepHeros> getStepHerosList() {
            return this.stepHerosBuilder_ == null ? Collections.unmodifiableList(this.stepHeros_) : this.stepHerosBuilder_.getMessageList();
         }

         public int getStepHerosCount() {
            return this.stepHerosBuilder_ == null ? this.stepHeros_.size() : this.stepHerosBuilder_.getCount();
         }

         public StepHeros getStepHeros(int index) {
            return this.stepHerosBuilder_ == null ? (StepHeros)this.stepHeros_.get(index) : (StepHeros)this.stepHerosBuilder_.getMessage(index);
         }

         public Builder setStepHeros(int index, StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.set(index, value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStepHeros(int index, StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStepHeros(StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStepHeros(int index, StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(index, value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStepHeros(StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStepHeros(int index, StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStepHeros(Iterable<? extends StepHeros> values) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.stepHeros_);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStepHeros() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.stepHerosBuilder_.clear();
            }

            return this;
         }

         public Builder removeStepHeros(int index) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.remove(index);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.remove(index);
            }

            return this;
         }

         public StepHeros.Builder getStepHerosBuilder(int index) {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().getBuilder(index);
         }

         public StepHerosOrBuilder getStepHerosOrBuilder(int index) {
            return this.stepHerosBuilder_ == null ? (StepHerosOrBuilder)this.stepHeros_.get(index) : (StepHerosOrBuilder)this.stepHerosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList() {
            return this.stepHerosBuilder_ != null ? this.stepHerosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stepHeros_);
         }

         public StepHeros.Builder addStepHerosBuilder() {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().addBuilder(LuckDrawMsg.StepHeros.getDefaultInstance());
         }

         public StepHeros.Builder addStepHerosBuilder(int index) {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().addBuilder(index, LuckDrawMsg.StepHeros.getDefaultInstance());
         }

         public List<StepHeros.Builder> getStepHerosBuilderList() {
            return this.getStepHerosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> getStepHerosFieldBuilder() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHerosBuilder_ = new RepeatedFieldBuilderV3(this.stepHeros_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.stepHeros_ = null;
            }

            return this.stepHerosBuilder_;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Draw_12703 extends GeneratedMessageV3 implements C2S_Draw_12703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int STEP_FIELD_NUMBER = 2;
      private int step_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_12703 DEFAULT_INSTANCE = new C2S_Draw_12703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_12703> PARSER = new AbstractParser<C2S_Draw_12703>() {
         public C2S_Draw_12703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_12703(input, extensionRegistry);
         }
      };

      private C2S_Draw_12703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_12703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_12703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_12703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.round_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.step_ = input.readInt32();
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
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_12703.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasStep() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStep() {
         return this.step_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.step_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.step_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Draw_12703)) {
            return super.equals(obj);
         } else {
            C2S_Draw_12703 other = (C2S_Draw_12703)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasStep() != other.hasStep()) {
               return false;
            } else if (this.hasStep() && this.getStep() != other.getStep()) {
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
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasStep()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Draw_12703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data);
      }

      public static C2S_Draw_12703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_12703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data);
      }

      public static C2S_Draw_12703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_12703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data);
      }

      public static C2S_Draw_12703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_12703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_12703 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_12703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_12703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_12703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_12703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_12703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_12703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_12703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_12703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_12703> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_12703> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_12703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_12703OrBuilder {
         private int bitField0_;
         private int round_;
         private int step_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_12703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.C2S_Draw_12703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.step_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_Draw_12703_descriptor;
         }

         public C2S_Draw_12703 getDefaultInstanceForType() {
            return LuckDrawMsg.C2S_Draw_12703.getDefaultInstance();
         }

         public C2S_Draw_12703 build() {
            C2S_Draw_12703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_12703 buildPartial() {
            C2S_Draw_12703 result = new C2S_Draw_12703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.step_ = this.step_;
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
            if (other instanceof C2S_Draw_12703) {
               return this.mergeFrom((C2S_Draw_12703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_12703 other) {
            if (other == LuckDrawMsg.C2S_Draw_12703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasStep()) {
                  this.setStep(other.getStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else {
               return this.hasStep();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Draw_12703 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_12703)LuckDrawMsg.C2S_Draw_12703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_12703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStep() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStep() {
            return this.step_;
         }

         public Builder setStep(int value) {
            this.bitField0_ |= 2;
            this.step_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStep() {
            this.bitField0_ &= -3;
            this.step_ = 0;
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

   public static final class S2C_Draw_12704 extends GeneratedMessageV3 implements S2C_Draw_12704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int STEPHEROS_FIELD_NUMBER = 2;
      private StepHeros stepHeros_;
      private byte memoizedIsInitialized;
      private static final S2C_Draw_12704 DEFAULT_INSTANCE = new S2C_Draw_12704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_12704> PARSER = new AbstractParser<S2C_Draw_12704>() {
         public S2C_Draw_12704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_12704(input, extensionRegistry);
         }
      };

      private S2C_Draw_12704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_12704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_12704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_12704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 18:
                        StepHeros.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.stepHeros_.toBuilder();
                        }

                        this.stepHeros_ = (StepHeros)input.readMessage(LuckDrawMsg.StepHeros.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.stepHeros_);
                           this.stepHeros_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_12704.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasStepHeros() {
         return (this.bitField0_ & 2) != 0;
      }

      public StepHeros getStepHeros() {
         return this.stepHeros_ == null ? LuckDrawMsg.StepHeros.getDefaultInstance() : this.stepHeros_;
      }

      public StepHerosOrBuilder getStepHerosOrBuilder() {
         return this.stepHeros_ == null ? LuckDrawMsg.StepHeros.getDefaultInstance() : this.stepHeros_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStepHeros()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getStepHeros().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getStepHeros());
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getStepHeros());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Draw_12704)) {
            return super.equals(obj);
         } else {
            S2C_Draw_12704 other = (S2C_Draw_12704)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasStepHeros() != other.hasStepHeros()) {
               return false;
            } else if (this.hasStepHeros() && !this.getStepHeros().equals(other.getStepHeros())) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasStepHeros()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStepHeros().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Draw_12704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data);
      }

      public static S2C_Draw_12704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_12704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data);
      }

      public static S2C_Draw_12704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_12704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data);
      }

      public static S2C_Draw_12704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_12704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_12704 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_12704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_12704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_12704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_12704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_12704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_12704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_12704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_12704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_12704> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_12704> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_12704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_12704OrBuilder {
         private int bitField0_;
         private int result_;
         private StepHeros stepHeros_;
         private SingleFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> stepHerosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_12704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.S2C_Draw_12704.alwaysUseFieldBuilders) {
               this.getStepHerosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = null;
            } else {
               this.stepHerosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_Draw_12704_descriptor;
         }

         public S2C_Draw_12704 getDefaultInstanceForType() {
            return LuckDrawMsg.S2C_Draw_12704.getDefaultInstance();
         }

         public S2C_Draw_12704 build() {
            S2C_Draw_12704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_12704 buildPartial() {
            S2C_Draw_12704 result = new S2C_Draw_12704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.stepHerosBuilder_ == null) {
                  result.stepHeros_ = this.stepHeros_;
               } else {
                  result.stepHeros_ = (StepHeros)this.stepHerosBuilder_.build();
               }

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
            if (other instanceof S2C_Draw_12704) {
               return this.mergeFrom((S2C_Draw_12704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_12704 other) {
            if (other == LuckDrawMsg.S2C_Draw_12704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasStepHeros()) {
                  this.mergeStepHeros(other.getStepHeros());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasStepHeros()) {
               return false;
            } else {
               return this.getStepHeros().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Draw_12704 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_12704)LuckDrawMsg.S2C_Draw_12704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_12704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStepHeros() {
            return (this.bitField0_ & 2) != 0;
         }

         public StepHeros getStepHeros() {
            if (this.stepHerosBuilder_ == null) {
               return this.stepHeros_ == null ? LuckDrawMsg.StepHeros.getDefaultInstance() : this.stepHeros_;
            } else {
               return (StepHeros)this.stepHerosBuilder_.getMessage();
            }
         }

         public Builder setStepHeros(StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.stepHeros_ = value;
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setStepHeros(StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = builderForValue.build();
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeStepHeros(StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.stepHeros_ != null && this.stepHeros_ != LuckDrawMsg.StepHeros.getDefaultInstance()) {
                  this.stepHeros_ = LuckDrawMsg.StepHeros.newBuilder(this.stepHeros_).mergeFrom(value).buildPartial();
               } else {
                  this.stepHeros_ = value;
               }

               this.onChanged();
            } else {
               this.stepHerosBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearStepHeros() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = null;
               this.onChanged();
            } else {
               this.stepHerosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public StepHeros.Builder getStepHerosBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().getBuilder();
         }

         public StepHerosOrBuilder getStepHerosOrBuilder() {
            if (this.stepHerosBuilder_ != null) {
               return (StepHerosOrBuilder)this.stepHerosBuilder_.getMessageOrBuilder();
            } else {
               return this.stepHeros_ == null ? LuckDrawMsg.StepHeros.getDefaultInstance() : this.stepHeros_;
            }
         }

         private SingleFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> getStepHerosFieldBuilder() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHerosBuilder_ = new SingleFieldBuilderV3(this.getStepHeros(), this.getParentForChildren(), this.isClean());
               this.stepHeros_ = null;
            }

            return this.stepHerosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TakeReward_12705 extends GeneratedMessageV3 implements C2S_TakeReward_12705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int STEP_FIELD_NUMBER = 2;
      private int step_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeReward_12705 DEFAULT_INSTANCE = new C2S_TakeReward_12705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeReward_12705> PARSER = new AbstractParser<C2S_TakeReward_12705>() {
         public C2S_TakeReward_12705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeReward_12705(input, extensionRegistry);
         }
      };

      private C2S_TakeReward_12705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeReward_12705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeReward_12705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeReward_12705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.round_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.step_ = input.readInt32();
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
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeReward_12705.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasStep() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStep() {
         return this.step_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.step_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.step_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeReward_12705)) {
            return super.equals(obj);
         } else {
            C2S_TakeReward_12705 other = (C2S_TakeReward_12705)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasStep() != other.hasStep()) {
               return false;
            } else if (this.hasStep() && this.getStep() != other.getStep()) {
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
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasStep()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeReward_12705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data);
      }

      public static C2S_TakeReward_12705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeReward_12705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data);
      }

      public static C2S_TakeReward_12705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeReward_12705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data);
      }

      public static C2S_TakeReward_12705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeReward_12705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeReward_12705 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeReward_12705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeReward_12705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeReward_12705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeReward_12705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeReward_12705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeReward_12705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeReward_12705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeReward_12705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeReward_12705> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeReward_12705> getParserForType() {
         return PARSER;
      }

      public C2S_TakeReward_12705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeReward_12705OrBuilder {
         private int bitField0_;
         private int round_;
         private int step_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeReward_12705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.C2S_TakeReward_12705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.step_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_C2S_TakeReward_12705_descriptor;
         }

         public C2S_TakeReward_12705 getDefaultInstanceForType() {
            return LuckDrawMsg.C2S_TakeReward_12705.getDefaultInstance();
         }

         public C2S_TakeReward_12705 build() {
            C2S_TakeReward_12705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeReward_12705 buildPartial() {
            C2S_TakeReward_12705 result = new C2S_TakeReward_12705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.step_ = this.step_;
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
            if (other instanceof C2S_TakeReward_12705) {
               return this.mergeFrom((C2S_TakeReward_12705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeReward_12705 other) {
            if (other == LuckDrawMsg.C2S_TakeReward_12705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasStep()) {
                  this.setStep(other.getStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else {
               return this.hasStep();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeReward_12705 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeReward_12705)LuckDrawMsg.C2S_TakeReward_12705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeReward_12705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStep() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStep() {
            return this.step_;
         }

         public Builder setStep(int value) {
            this.bitField0_ |= 2;
            this.step_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStep() {
            this.bitField0_ &= -3;
            this.step_ = 0;
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

   public static final class S2C_TakeReward_12706 extends GeneratedMessageV3 implements S2C_TakeReward_12706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ROUND_FIELD_NUMBER = 2;
      private int round_;
      public static final int TAKEDID_FIELD_NUMBER = 3;
      private Internal.IntList takedId_;
      public static final int STEPHEROS_FIELD_NUMBER = 4;
      private List<StepHeros> stepHeros_;
      public static final int ISTAKEDALLREWARD_FIELD_NUMBER = 5;
      private boolean isTakedAllReward_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeReward_12706 DEFAULT_INSTANCE = new S2C_TakeReward_12706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeReward_12706> PARSER = new AbstractParser<S2C_TakeReward_12706>() {
         public S2C_TakeReward_12706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeReward_12706(input, extensionRegistry);
         }
      };

      private S2C_TakeReward_12706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeReward_12706() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
         this.stepHeros_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeReward_12706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeReward_12706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.round_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.takedId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.stepHeros_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.stepHeros_.add(input.readMessage(LuckDrawMsg.StepHeros.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.isTakedAllReward_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.takedId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.stepHeros_ = Collections.unmodifiableList(this.stepHeros_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeReward_12706.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasRound() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public List<Integer> getTakedIdList() {
         return this.takedId_;
      }

      public int getTakedIdCount() {
         return this.takedId_.size();
      }

      public int getTakedId(int index) {
         return this.takedId_.getInt(index);
      }

      public List<StepHeros> getStepHerosList() {
         return this.stepHeros_;
      }

      public List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList() {
         return this.stepHeros_;
      }

      public int getStepHerosCount() {
         return this.stepHeros_.size();
      }

      public StepHeros getStepHeros(int index) {
         return (StepHeros)this.stepHeros_.get(index);
      }

      public StepHerosOrBuilder getStepHerosOrBuilder(int index) {
         return (StepHerosOrBuilder)this.stepHeros_.get(index);
      }

      public boolean hasIsTakedAllReward() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsTakedAllReward() {
         return this.isTakedAllReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStepHerosCount(); ++i) {
               if (!this.getStepHeros(i).isInitialized()) {
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.round_);
         }

         for(int i = 0; i < this.takedId_.size(); ++i) {
            output.writeInt32(3, this.takedId_.getInt(i));
         }

         for(int i = 0; i < this.stepHeros_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.stepHeros_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(5, this.isTakedAllReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.round_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdList().size();

            for(int i = 0; i < this.stepHeros_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.stepHeros_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isTakedAllReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeReward_12706)) {
            return super.equals(obj);
         } else {
            S2C_TakeReward_12706 other = (S2C_TakeReward_12706)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (!this.getTakedIdList().equals(other.getTakedIdList())) {
               return false;
            } else if (!this.getStepHerosList().equals(other.getStepHerosList())) {
               return false;
            } else if (this.hasIsTakedAllReward() != other.hasIsTakedAllReward()) {
               return false;
            } else if (this.hasIsTakedAllReward() && this.getIsTakedAllReward() != other.getIsTakedAllReward()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasRound()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRound();
            }

            if (this.getTakedIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTakedIdList().hashCode();
            }

            if (this.getStepHerosCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStepHerosList().hashCode();
            }

            if (this.hasIsTakedAllReward()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsTakedAllReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeReward_12706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data);
      }

      public static S2C_TakeReward_12706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeReward_12706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data);
      }

      public static S2C_TakeReward_12706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeReward_12706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data);
      }

      public static S2C_TakeReward_12706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeReward_12706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeReward_12706 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeReward_12706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeReward_12706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeReward_12706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeReward_12706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeReward_12706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeReward_12706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeReward_12706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeReward_12706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeReward_12706> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeReward_12706> getParserForType() {
         return PARSER;
      }

      public S2C_TakeReward_12706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeReward_12706OrBuilder {
         private int bitField0_;
         private int result_;
         private int round_;
         private Internal.IntList takedId_;
         private List<StepHeros> stepHeros_;
         private RepeatedFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> stepHerosBuilder_;
         private boolean isTakedAllReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeReward_12706.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = LuckDrawMsg.S2C_TakeReward_12706.emptyIntList();
            this.stepHeros_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = LuckDrawMsg.S2C_TakeReward_12706.emptyIntList();
            this.stepHeros_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.S2C_TakeReward_12706.alwaysUseFieldBuilders) {
               this.getStepHerosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.bitField0_ &= -3;
            this.takedId_ = LuckDrawMsg.S2C_TakeReward_12706.emptyIntList();
            this.bitField0_ &= -5;
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.stepHerosBuilder_.clear();
            }

            this.isTakedAllReward_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_TakeReward_12706_descriptor;
         }

         public S2C_TakeReward_12706 getDefaultInstanceForType() {
            return LuckDrawMsg.S2C_TakeReward_12706.getDefaultInstance();
         }

         public S2C_TakeReward_12706 build() {
            S2C_TakeReward_12706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeReward_12706 buildPartial() {
            S2C_TakeReward_12706 result = new S2C_TakeReward_12706(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.takedId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.takedId_ = this.takedId_;
            if (this.stepHerosBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.stepHeros_ = Collections.unmodifiableList(this.stepHeros_);
                  this.bitField0_ &= -9;
               }

               result.stepHeros_ = this.stepHeros_;
            } else {
               result.stepHeros_ = this.stepHerosBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isTakedAllReward_ = this.isTakedAllReward_;
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
            if (other instanceof S2C_TakeReward_12706) {
               return this.mergeFrom((S2C_TakeReward_12706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeReward_12706 other) {
            if (other == LuckDrawMsg.S2C_TakeReward_12706.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (!other.takedId_.isEmpty()) {
                  if (this.takedId_.isEmpty()) {
                     this.takedId_ = other.takedId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureTakedIdIsMutable();
                     this.takedId_.addAll(other.takedId_);
                  }

                  this.onChanged();
               }

               if (this.stepHerosBuilder_ == null) {
                  if (!other.stepHeros_.isEmpty()) {
                     if (this.stepHeros_.isEmpty()) {
                        this.stepHeros_ = other.stepHeros_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureStepHerosIsMutable();
                        this.stepHeros_.addAll(other.stepHeros_);
                     }

                     this.onChanged();
                  }
               } else if (!other.stepHeros_.isEmpty()) {
                  if (this.stepHerosBuilder_.isEmpty()) {
                     this.stepHerosBuilder_.dispose();
                     this.stepHerosBuilder_ = null;
                     this.stepHeros_ = other.stepHeros_;
                     this.bitField0_ &= -9;
                     this.stepHerosBuilder_ = LuckDrawMsg.S2C_TakeReward_12706.alwaysUseFieldBuilders ? this.getStepHerosFieldBuilder() : null;
                  } else {
                     this.stepHerosBuilder_.addAllMessages(other.stepHeros_);
                  }
               }

               if (other.hasIsTakedAllReward()) {
                  this.setIsTakedAllReward(other.getIsTakedAllReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasRound()) {
               return false;
            } else {
               for(int i = 0; i < this.getStepHerosCount(); ++i) {
                  if (!this.getStepHeros(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeReward_12706 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeReward_12706)LuckDrawMsg.S2C_TakeReward_12706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeReward_12706)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 2;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -3;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTakedIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.takedId_ = LuckDrawMsg.S2C_TakeReward_12706.mutableCopy(this.takedId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getTakedIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.takedId_) : this.takedId_);
         }

         public int getTakedIdCount() {
            return this.takedId_.size();
         }

         public int getTakedId(int index) {
            return this.takedId_.getInt(index);
         }

         public Builder setTakedId(int index, int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedId(int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedId(Iterable<? extends Integer> values) {
            this.ensureTakedIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedId() {
            this.takedId_ = LuckDrawMsg.S2C_TakeReward_12706.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureStepHerosIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.stepHeros_ = new ArrayList(this.stepHeros_);
               this.bitField0_ |= 8;
            }

         }

         public List<StepHeros> getStepHerosList() {
            return this.stepHerosBuilder_ == null ? Collections.unmodifiableList(this.stepHeros_) : this.stepHerosBuilder_.getMessageList();
         }

         public int getStepHerosCount() {
            return this.stepHerosBuilder_ == null ? this.stepHeros_.size() : this.stepHerosBuilder_.getCount();
         }

         public StepHeros getStepHeros(int index) {
            return this.stepHerosBuilder_ == null ? (StepHeros)this.stepHeros_.get(index) : (StepHeros)this.stepHerosBuilder_.getMessage(index);
         }

         public Builder setStepHeros(int index, StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.set(index, value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStepHeros(int index, StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStepHeros(StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStepHeros(int index, StepHeros value) {
            if (this.stepHerosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(index, value);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStepHeros(StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStepHeros(int index, StepHeros.Builder builderForValue) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStepHeros(Iterable<? extends StepHeros> values) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.stepHeros_);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStepHeros() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHeros_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.stepHerosBuilder_.clear();
            }

            return this;
         }

         public Builder removeStepHeros(int index) {
            if (this.stepHerosBuilder_ == null) {
               this.ensureStepHerosIsMutable();
               this.stepHeros_.remove(index);
               this.onChanged();
            } else {
               this.stepHerosBuilder_.remove(index);
            }

            return this;
         }

         public StepHeros.Builder getStepHerosBuilder(int index) {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().getBuilder(index);
         }

         public StepHerosOrBuilder getStepHerosOrBuilder(int index) {
            return this.stepHerosBuilder_ == null ? (StepHerosOrBuilder)this.stepHeros_.get(index) : (StepHerosOrBuilder)this.stepHerosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList() {
            return this.stepHerosBuilder_ != null ? this.stepHerosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stepHeros_);
         }

         public StepHeros.Builder addStepHerosBuilder() {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().addBuilder(LuckDrawMsg.StepHeros.getDefaultInstance());
         }

         public StepHeros.Builder addStepHerosBuilder(int index) {
            return (StepHeros.Builder)this.getStepHerosFieldBuilder().addBuilder(index, LuckDrawMsg.StepHeros.getDefaultInstance());
         }

         public List<StepHeros.Builder> getStepHerosBuilderList() {
            return this.getStepHerosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StepHeros, StepHeros.Builder, StepHerosOrBuilder> getStepHerosFieldBuilder() {
            if (this.stepHerosBuilder_ == null) {
               this.stepHerosBuilder_ = new RepeatedFieldBuilderV3(this.stepHeros_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.stepHeros_ = null;
            }

            return this.stepHerosBuilder_;
         }

         public boolean hasIsTakedAllReward() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsTakedAllReward() {
            return this.isTakedAllReward_;
         }

         public Builder setIsTakedAllReward(boolean value) {
            this.bitField0_ |= 16;
            this.isTakedAllReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsTakedAllReward() {
            this.bitField0_ &= -17;
            this.isTakedAllReward_ = false;
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

   public static final class S2C_UpdateTask_12708 extends GeneratedMessageV3 implements S2C_UpdateTask_12708OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTask_12708 DEFAULT_INSTANCE = new S2C_UpdateTask_12708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTask_12708> PARSER = new AbstractParser<S2C_UpdateTask_12708>() {
         public S2C_UpdateTask_12708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTask_12708(input, extensionRegistry);
         }
      };

      private S2C_UpdateTask_12708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTask_12708() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTask_12708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTask_12708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_12708.class, Builder.class);
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tasks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateTask_12708)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTask_12708 other = (S2C_UpdateTask_12708)obj;
            if (!this.getTasksList().equals(other.getTasksList())) {
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
            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateTask_12708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_12708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_12708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_12708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_12708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_12708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_12708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_12708 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_12708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_12708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_12708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_12708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_12708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_12708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTask_12708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTask_12708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTask_12708> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTask_12708> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTask_12708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTask_12708OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_12708.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LuckDrawMsg.S2C_UpdateTask_12708.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LuckDrawMsg.internal_static_luckDraw_com_gzbz_protobuf_S2C_UpdateTask_12708_descriptor;
         }

         public S2C_UpdateTask_12708 getDefaultInstanceForType() {
            return LuckDrawMsg.S2C_UpdateTask_12708.getDefaultInstance();
         }

         public S2C_UpdateTask_12708 build() {
            S2C_UpdateTask_12708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTask_12708 buildPartial() {
            S2C_UpdateTask_12708 result = new S2C_UpdateTask_12708(this);
            int from_bitField0_ = this.bitField0_;
            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -2;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof S2C_UpdateTask_12708) {
               return this.mergeFrom((S2C_UpdateTask_12708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTask_12708 other) {
            if (other == LuckDrawMsg.S2C_UpdateTask_12708.getDefaultInstance()) {
               return this;
            } else {
               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -2;
                     this.tasksBuilder_ = LuckDrawMsg.S2C_UpdateTask_12708.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateTask_12708 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTask_12708)LuckDrawMsg.S2C_UpdateTask_12708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTask_12708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_Draw_12703OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasStep();

      int getStep();
   }

   public interface C2S_OpenUi_12701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeReward_12705OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasStep();

      int getStep();
   }

   public interface S2C_Draw_12704OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasStepHeros();

      StepHeros getStepHeros();

      StepHerosOrBuilder getStepHerosOrBuilder();
   }

   public interface S2C_OpenUi_12702OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      List<Integer> getTakedIdList();

      int getTakedIdCount();

      int getTakedId(int index);

      List<StepHeros> getStepHerosList();

      StepHeros getStepHeros(int index);

      int getStepHerosCount();

      List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList();

      StepHerosOrBuilder getStepHerosOrBuilder(int index);

      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface S2C_TakeReward_12706OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasRound();

      int getRound();

      List<Integer> getTakedIdList();

      int getTakedIdCount();

      int getTakedId(int index);

      List<StepHeros> getStepHerosList();

      StepHeros getStepHeros(int index);

      int getStepHerosCount();

      List<? extends StepHerosOrBuilder> getStepHerosOrBuilderList();

      StepHerosOrBuilder getStepHerosOrBuilder(int index);

      boolean hasIsTakedAllReward();

      boolean getIsTakedAllReward();
   }

   public interface S2C_UpdateTask_12708OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface StepHerosOrBuilder extends MessageOrBuilder {
      boolean hasStep();

      int getStep();

      List<Integer> getHeroIdsList();

      int getHeroIdsCount();

      int getHeroIds(int index);
   }
}
