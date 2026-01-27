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

public final class ThanksgivingDayMsg {
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ThanksgivingDayMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015ThanksgivingDay.proto\u0012\u001bchongYang.com.gzbz.protobuf\u001a\u000fChongYang.proto\u001a\fcommon.proto\u001a\u0013ThemeActivity.proto\"\u0010\n\u000eC2S_Main_17001\"è\u0001\n\u000eS2C_Main_17002\u00124\n\u0005infos\u0018\u0001 \u0003(\u000b2%.chongYang.com.gzbz.protobuf.SignInfo\u0012\u000f\n\u0007useFree\u0018\u0002 \u0002(\u0005\u0012\u0010\n\broundNum\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0004 \u0002(\u0005\u0012\u0011\n\ttaskPoint\u0018\u0005 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0006 \u0003(\u0005\u0012H\n\fillustration\u0018\u0007 \u0003(\u000b22.themeAactivity.com.gzbz.protobuf.IllustrationData\"\u001d\n\u000eC2S_Sign_17003\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"F\n\u000eS2C_Sign_17004\u00124\n\u0005infos\u0018\u0001 \u0003(\u000b2%.chongYang.com.gzbz.protobuf.SignInfo\"%\n\u0016C2S_FindTreasure_17005\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\";\n\u0016S2C_FindTreasure_17006\u0012\u000f\n\u0007useFree\u0018\u0001 \u0002(\u0005\u0012\u0010\n\broundNum\u0018\u0002 \u0002(\u0005\"&\n\u0014C2S_TaskCommit_17007\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"9\n\u0014S2C_TaskCommit_17008\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\ttaskPoint\u0018\u0002 \u0002(\u0005\"2\n\u0014S2C_TaskNotify_17010\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"0\n\u0019C2S_TaskPointReward_17011\u0012\u0013\n\u000bpointReward\u0018\u0001 \u0002(\u0005\"0\n\u0019S2C_TaskPointReward_17012\u0012\u0013\n\u000bpointReward\u0018\u0001 \u0002(\u0005B)\n\u0011com.gzbz.protobufB\u0012ThanksgivingDayMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ChongYangMsg.getDescriptor(), CommonMsg.getDescriptor(), ThemeActivityMsg.getDescriptor()});
      internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor, new String[0]);
      internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor, new String[]{"Infos", "UseFree", "RoundNum", "Day", "TaskPoint", "PointReward", "Illustration"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor, new String[]{"Day"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor, new String[]{"Infos"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor, new String[]{"Num"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor, new String[]{"UseFree", "RoundNum"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor, new String[]{"TaskId"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor, new String[]{"TaskId", "TaskPoint"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor, new String[]{"Task"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor, new String[]{"PointReward"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor, new String[]{"PointReward"});
      ChongYangMsg.getDescriptor();
      CommonMsg.getDescriptor();
      ThemeActivityMsg.getDescriptor();
   }

   public static final class C2S_Main_17001 extends GeneratedMessageV3 implements C2S_Main_17001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_17001 DEFAULT_INSTANCE = new C2S_Main_17001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_17001> PARSER = new AbstractParser<C2S_Main_17001>() {
         public C2S_Main_17001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_17001(input, extensionRegistry);
         }
      };

      private C2S_Main_17001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_17001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_17001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_17001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_17001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_17001)) {
            return super.equals(obj);
         } else {
            C2S_Main_17001 other = (C2S_Main_17001)obj;
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

      public static C2S_Main_17001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data);
      }

      public static C2S_Main_17001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_17001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data);
      }

      public static C2S_Main_17001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_17001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data);
      }

      public static C2S_Main_17001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_17001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_17001 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_17001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_17001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_17001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_17001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_17001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_17001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_17001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_17001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_17001> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_17001> getParserForType() {
         return PARSER;
      }

      public C2S_Main_17001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_17001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_17001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.C2S_Main_17001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Main_17001_descriptor;
         }

         public C2S_Main_17001 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.C2S_Main_17001.getDefaultInstance();
         }

         public C2S_Main_17001 build() {
            C2S_Main_17001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_17001 buildPartial() {
            C2S_Main_17001 result = new C2S_Main_17001(this);
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
            if (other instanceof C2S_Main_17001) {
               return this.mergeFrom((C2S_Main_17001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_17001 other) {
            if (other == ThanksgivingDayMsg.C2S_Main_17001.getDefaultInstance()) {
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
            C2S_Main_17001 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_17001)ThanksgivingDayMsg.C2S_Main_17001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_17001)e.getUnfinishedMessage();
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

   public static final class S2C_Main_17002 extends GeneratedMessageV3 implements S2C_Main_17002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<ChongYangMsg.SignInfo> infos_;
      public static final int USEFREE_FIELD_NUMBER = 2;
      private int useFree_;
      public static final int ROUNDNUM_FIELD_NUMBER = 3;
      private int roundNum_;
      public static final int DAY_FIELD_NUMBER = 4;
      private int day_;
      public static final int TASKPOINT_FIELD_NUMBER = 5;
      private int taskPoint_;
      public static final int POINTREWARD_FIELD_NUMBER = 6;
      private Internal.IntList pointReward_;
      public static final int ILLUSTRATION_FIELD_NUMBER = 7;
      private List<ThemeActivityMsg.IllustrationData> illustration_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_17002 DEFAULT_INSTANCE = new S2C_Main_17002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_17002> PARSER = new AbstractParser<S2C_Main_17002>() {
         public S2C_Main_17002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_17002(input, extensionRegistry);
         }
      };

      private S2C_Main_17002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_17002() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.pointReward_ = emptyIntList();
         this.illustration_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_17002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_17002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(ChongYangMsg.SignInfo.PARSER, extensionRegistry));
                        continue;
                     case 16:
                        this.bitField0_ |= 1;
                        this.useFree_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.roundNum_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.day_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.taskPoint_ = input.readInt32();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.illustration_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.illustration_.add(input.readMessage(ThemeActivityMsg.IllustrationData.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.pointReward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.pointReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.illustration_ = Collections.unmodifiableList(this.illustration_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_17002.class, Builder.class);
      }

      public List<ChongYangMsg.SignInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public ChongYangMsg.SignInfo getInfos(int index) {
         return (ChongYangMsg.SignInfo)this.infos_.get(index);
      }

      public ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index) {
         return (ChongYangMsg.SignInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasUseFree() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUseFree() {
         return this.useFree_;
      }

      public boolean hasRoundNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRoundNum() {
         return this.roundNum_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public boolean hasTaskPoint() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTaskPoint() {
         return this.taskPoint_;
      }

      public List<Integer> getPointRewardList() {
         return this.pointReward_;
      }

      public int getPointRewardCount() {
         return this.pointReward_.size();
      }

      public int getPointReward(int index) {
         return this.pointReward_.getInt(index);
      }

      public List<ThemeActivityMsg.IllustrationData> getIllustrationList() {
         return this.illustration_;
      }

      public List<? extends ThemeActivityMsg.IllustrationDataOrBuilder> getIllustrationOrBuilderList() {
         return this.illustration_;
      }

      public int getIllustrationCount() {
         return this.illustration_.size();
      }

      public ThemeActivityMsg.IllustrationData getIllustration(int index) {
         return (ThemeActivityMsg.IllustrationData)this.illustration_.get(index);
      }

      public ThemeActivityMsg.IllustrationDataOrBuilder getIllustrationOrBuilder(int index) {
         return (ThemeActivityMsg.IllustrationDataOrBuilder)this.illustration_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUseFree()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getIllustrationCount(); ++i) {
               if (!this.getIllustration(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.useFree_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.roundNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.day_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.taskPoint_);
         }

         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(6, this.pointReward_.getInt(i));
         }

         for(int i = 0; i < this.illustration_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.illustration_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.useFree_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.roundNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.day_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.taskPoint_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();

            for(int i = 0; i < this.illustration_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.illustration_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_17002)) {
            return super.equals(obj);
         } else {
            S2C_Main_17002 other = (S2C_Main_17002)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasUseFree() != other.hasUseFree()) {
               return false;
            } else if (this.hasUseFree() && this.getUseFree() != other.getUseFree()) {
               return false;
            } else if (this.hasRoundNum() != other.hasRoundNum()) {
               return false;
            } else if (this.hasRoundNum() && this.getRoundNum() != other.getRoundNum()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (this.hasTaskPoint() != other.hasTaskPoint()) {
               return false;
            } else if (this.hasTaskPoint() && this.getTaskPoint() != other.getTaskPoint()) {
               return false;
            } else if (!this.getPointRewardList().equals(other.getPointRewardList())) {
               return false;
            } else if (!this.getIllustrationList().equals(other.getIllustrationList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasUseFree()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUseFree();
            }

            if (this.hasRoundNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRoundNum();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDay();
            }

            if (this.hasTaskPoint()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTaskPoint();
            }

            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            if (this.getIllustrationCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getIllustrationList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_17002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data);
      }

      public static S2C_Main_17002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_17002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data);
      }

      public static S2C_Main_17002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_17002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data);
      }

      public static S2C_Main_17002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_17002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_17002 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_17002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_17002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_17002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_17002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_17002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_17002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_17002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_17002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_17002> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_17002> getParserForType() {
         return PARSER;
      }

      public S2C_Main_17002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_17002OrBuilder {
         private int bitField0_;
         private List<ChongYangMsg.SignInfo> infos_;
         private RepeatedFieldBuilderV3<ChongYangMsg.SignInfo, ChongYangMsg.SignInfo.Builder, ChongYangMsg.SignInfoOrBuilder> infosBuilder_;
         private int useFree_;
         private int roundNum_;
         private int day_;
         private int taskPoint_;
         private Internal.IntList pointReward_;
         private List<ThemeActivityMsg.IllustrationData> illustration_;
         private RepeatedFieldBuilderV3<ThemeActivityMsg.IllustrationData, ThemeActivityMsg.IllustrationData.Builder, ThemeActivityMsg.IllustrationDataOrBuilder> illustrationBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_17002.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.pointReward_ = ThanksgivingDayMsg.S2C_Main_17002.emptyIntList();
            this.illustration_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.pointReward_ = ThanksgivingDayMsg.S2C_Main_17002.emptyIntList();
            this.illustration_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_Main_17002.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
               this.getIllustrationFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            this.useFree_ = 0;
            this.bitField0_ &= -3;
            this.roundNum_ = 0;
            this.bitField0_ &= -5;
            this.day_ = 0;
            this.bitField0_ &= -9;
            this.taskPoint_ = 0;
            this.bitField0_ &= -17;
            this.pointReward_ = ThanksgivingDayMsg.S2C_Main_17002.emptyIntList();
            this.bitField0_ &= -33;
            if (this.illustrationBuilder_ == null) {
               this.illustration_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.illustrationBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Main_17002_descriptor;
         }

         public S2C_Main_17002 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_Main_17002.getDefaultInstance();
         }

         public S2C_Main_17002 build() {
            S2C_Main_17002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_17002 buildPartial() {
            S2C_Main_17002 result = new S2C_Main_17002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.useFree_ = this.useFree_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.roundNum_ = this.roundNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.taskPoint_ = this.taskPoint_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.pointReward_ = this.pointReward_;
            if (this.illustrationBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.illustration_ = Collections.unmodifiableList(this.illustration_);
                  this.bitField0_ &= -65;
               }

               result.illustration_ = this.illustration_;
            } else {
               result.illustration_ = this.illustrationBuilder_.build();
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
            if (other instanceof S2C_Main_17002) {
               return this.mergeFrom((S2C_Main_17002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_17002 other) {
            if (other == ThanksgivingDayMsg.S2C_Main_17002.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = ThanksgivingDayMsg.S2C_Main_17002.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasUseFree()) {
                  this.setUseFree(other.getUseFree());
               }

               if (other.hasRoundNum()) {
                  this.setRoundNum(other.getRoundNum());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (other.hasTaskPoint()) {
                  this.setTaskPoint(other.getTaskPoint());
               }

               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
                  }

                  this.onChanged();
               }

               if (this.illustrationBuilder_ == null) {
                  if (!other.illustration_.isEmpty()) {
                     if (this.illustration_.isEmpty()) {
                        this.illustration_ = other.illustration_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureIllustrationIsMutable();
                        this.illustration_.addAll(other.illustration_);
                     }

                     this.onChanged();
                  }
               } else if (!other.illustration_.isEmpty()) {
                  if (this.illustrationBuilder_.isEmpty()) {
                     this.illustrationBuilder_.dispose();
                     this.illustrationBuilder_ = null;
                     this.illustration_ = other.illustration_;
                     this.bitField0_ &= -65;
                     this.illustrationBuilder_ = ThanksgivingDayMsg.S2C_Main_17002.alwaysUseFieldBuilders ? this.getIllustrationFieldBuilder() : null;
                  } else {
                     this.illustrationBuilder_.addAllMessages(other.illustration_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUseFree()) {
               return false;
            } else if (!this.hasRoundNum()) {
               return false;
            } else if (!this.hasDay()) {
               return false;
            } else if (!this.hasTaskPoint()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getIllustrationCount(); ++i) {
                  if (!this.getIllustration(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_17002 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_17002)ThanksgivingDayMsg.S2C_Main_17002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_17002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChongYangMsg.SignInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public ChongYangMsg.SignInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (ChongYangMsg.SignInfo)this.infos_.get(index) : (ChongYangMsg.SignInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends ChongYangMsg.SignInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public ChongYangMsg.SignInfo.Builder getInfosBuilder(int index) {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (ChongYangMsg.SignInfoOrBuilder)this.infos_.get(index) : (ChongYangMsg.SignInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public ChongYangMsg.SignInfo.Builder addInfosBuilder() {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public ChongYangMsg.SignInfo.Builder addInfosBuilder(int index) {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public List<ChongYangMsg.SignInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChongYangMsg.SignInfo, ChongYangMsg.SignInfo.Builder, ChongYangMsg.SignInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasUseFree() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUseFree() {
            return this.useFree_;
         }

         public Builder setUseFree(int value) {
            this.bitField0_ |= 2;
            this.useFree_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseFree() {
            this.bitField0_ &= -3;
            this.useFree_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRoundNum() {
            return this.roundNum_;
         }

         public Builder setRoundNum(int value) {
            this.bitField0_ |= 4;
            this.roundNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundNum() {
            this.bitField0_ &= -5;
            this.roundNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 8;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -9;
            this.day_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTaskPoint() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTaskPoint() {
            return this.taskPoint_;
         }

         public Builder setTaskPoint(int value) {
            this.bitField0_ |= 16;
            this.taskPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskPoint() {
            this.bitField0_ &= -17;
            this.taskPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.pointReward_ = ThanksgivingDayMsg.S2C_Main_17002.mutableCopy(this.pointReward_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
         }

         public int getPointRewardCount() {
            return this.pointReward_.size();
         }

         public int getPointReward(int index) {
            return this.pointReward_.getInt(index);
         }

         public Builder setPointReward(int index, int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPointReward(int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPointReward(Iterable<? extends Integer> values) {
            this.ensurePointRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pointReward_);
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.pointReward_ = ThanksgivingDayMsg.S2C_Main_17002.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureIllustrationIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.illustration_ = new ArrayList(this.illustration_);
               this.bitField0_ |= 64;
            }

         }

         public List<ThemeActivityMsg.IllustrationData> getIllustrationList() {
            return this.illustrationBuilder_ == null ? Collections.unmodifiableList(this.illustration_) : this.illustrationBuilder_.getMessageList();
         }

         public int getIllustrationCount() {
            return this.illustrationBuilder_ == null ? this.illustration_.size() : this.illustrationBuilder_.getCount();
         }

         public ThemeActivityMsg.IllustrationData getIllustration(int index) {
            return this.illustrationBuilder_ == null ? (ThemeActivityMsg.IllustrationData)this.illustration_.get(index) : (ThemeActivityMsg.IllustrationData)this.illustrationBuilder_.getMessage(index);
         }

         public Builder setIllustration(int index, ThemeActivityMsg.IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.set(index, value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setIllustration(int index, ThemeActivityMsg.IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addIllustration(ThemeActivityMsg.IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.add(value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addIllustration(int index, ThemeActivityMsg.IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.add(index, value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addIllustration(ThemeActivityMsg.IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addIllustration(int index, ThemeActivityMsg.IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllIllustration(Iterable<? extends ThemeActivityMsg.IllustrationData> values) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.illustration_);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearIllustration() {
            if (this.illustrationBuilder_ == null) {
               this.illustration_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.illustrationBuilder_.clear();
            }

            return this;
         }

         public Builder removeIllustration(int index) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.remove(index);
               this.onChanged();
            } else {
               this.illustrationBuilder_.remove(index);
            }

            return this;
         }

         public ThemeActivityMsg.IllustrationData.Builder getIllustrationBuilder(int index) {
            return (ThemeActivityMsg.IllustrationData.Builder)this.getIllustrationFieldBuilder().getBuilder(index);
         }

         public ThemeActivityMsg.IllustrationDataOrBuilder getIllustrationOrBuilder(int index) {
            return this.illustrationBuilder_ == null ? (ThemeActivityMsg.IllustrationDataOrBuilder)this.illustration_.get(index) : (ThemeActivityMsg.IllustrationDataOrBuilder)this.illustrationBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ThemeActivityMsg.IllustrationDataOrBuilder> getIllustrationOrBuilderList() {
            return this.illustrationBuilder_ != null ? this.illustrationBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.illustration_);
         }

         public ThemeActivityMsg.IllustrationData.Builder addIllustrationBuilder() {
            return (ThemeActivityMsg.IllustrationData.Builder)this.getIllustrationFieldBuilder().addBuilder(ThemeActivityMsg.IllustrationData.getDefaultInstance());
         }

         public ThemeActivityMsg.IllustrationData.Builder addIllustrationBuilder(int index) {
            return (ThemeActivityMsg.IllustrationData.Builder)this.getIllustrationFieldBuilder().addBuilder(index, ThemeActivityMsg.IllustrationData.getDefaultInstance());
         }

         public List<ThemeActivityMsg.IllustrationData.Builder> getIllustrationBuilderList() {
            return this.getIllustrationFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ThemeActivityMsg.IllustrationData, ThemeActivityMsg.IllustrationData.Builder, ThemeActivityMsg.IllustrationDataOrBuilder> getIllustrationFieldBuilder() {
            if (this.illustrationBuilder_ == null) {
               this.illustrationBuilder_ = new RepeatedFieldBuilderV3(this.illustration_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.illustration_ = null;
            }

            return this.illustrationBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Sign_17003 extends GeneratedMessageV3 implements C2S_Sign_17003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_17003 DEFAULT_INSTANCE = new C2S_Sign_17003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_17003> PARSER = new AbstractParser<C2S_Sign_17003>() {
         public C2S_Sign_17003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_17003(input, extensionRegistry);
         }
      };

      private C2S_Sign_17003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_17003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_17003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_17003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_17003.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Sign_17003)) {
            return super.equals(obj);
         } else {
            C2S_Sign_17003 other = (C2S_Sign_17003)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Sign_17003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data);
      }

      public static C2S_Sign_17003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_17003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_17003 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_17003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_17003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_17003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_17003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_17003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_17003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_17003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_17003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_17003> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_17003> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_17003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_17003OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_17003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.C2S_Sign_17003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_17003_descriptor;
         }

         public C2S_Sign_17003 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.C2S_Sign_17003.getDefaultInstance();
         }

         public C2S_Sign_17003 build() {
            C2S_Sign_17003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_17003 buildPartial() {
            C2S_Sign_17003 result = new C2S_Sign_17003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_Sign_17003) {
               return this.mergeFrom((C2S_Sign_17003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_17003 other) {
            if (other == ThanksgivingDayMsg.C2S_Sign_17003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Sign_17003 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_17003)ThanksgivingDayMsg.C2S_Sign_17003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_17003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
            this.day_ = 0;
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

   public static final class S2C_Sign_17004 extends GeneratedMessageV3 implements S2C_Sign_17004OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<ChongYangMsg.SignInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_Sign_17004 DEFAULT_INSTANCE = new S2C_Sign_17004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Sign_17004> PARSER = new AbstractParser<S2C_Sign_17004>() {
         public S2C_Sign_17004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Sign_17004(input, extensionRegistry);
         }
      };

      private S2C_Sign_17004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Sign_17004() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Sign_17004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Sign_17004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(ChongYangMsg.SignInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Sign_17004.class, Builder.class);
      }

      public List<ChongYangMsg.SignInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public ChongYangMsg.SignInfo getInfos(int index) {
         return (ChongYangMsg.SignInfo)this.infos_.get(index);
      }

      public ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index) {
         return (ChongYangMsg.SignInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Sign_17004)) {
            return super.equals(obj);
         } else {
            S2C_Sign_17004 other = (S2C_Sign_17004)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Sign_17004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data);
      }

      public static S2C_Sign_17004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sign_17004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data);
      }

      public static S2C_Sign_17004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sign_17004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data);
      }

      public static S2C_Sign_17004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sign_17004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sign_17004 parseFrom(InputStream input) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Sign_17004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Sign_17004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Sign_17004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Sign_17004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Sign_17004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sign_17004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Sign_17004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Sign_17004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Sign_17004> parser() {
         return PARSER;
      }

      public Parser<S2C_Sign_17004> getParserForType() {
         return PARSER;
      }

      public S2C_Sign_17004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Sign_17004OrBuilder {
         private int bitField0_;
         private List<ChongYangMsg.SignInfo> infos_;
         private RepeatedFieldBuilderV3<ChongYangMsg.SignInfo, ChongYangMsg.SignInfo.Builder, ChongYangMsg.SignInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Sign_17004.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_Sign_17004.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_Sign_17004_descriptor;
         }

         public S2C_Sign_17004 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_Sign_17004.getDefaultInstance();
         }

         public S2C_Sign_17004 build() {
            S2C_Sign_17004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Sign_17004 buildPartial() {
            S2C_Sign_17004 result = new S2C_Sign_17004(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_Sign_17004) {
               return this.mergeFrom((S2C_Sign_17004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Sign_17004 other) {
            if (other == ThanksgivingDayMsg.S2C_Sign_17004.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = ThanksgivingDayMsg.S2C_Sign_17004.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Sign_17004 parsedMessage = null;

            try {
               parsedMessage = (S2C_Sign_17004)ThanksgivingDayMsg.S2C_Sign_17004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Sign_17004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChongYangMsg.SignInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public ChongYangMsg.SignInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (ChongYangMsg.SignInfo)this.infos_.get(index) : (ChongYangMsg.SignInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, ChongYangMsg.SignInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, ChongYangMsg.SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends ChongYangMsg.SignInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public ChongYangMsg.SignInfo.Builder getInfosBuilder(int index) {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (ChongYangMsg.SignInfoOrBuilder)this.infos_.get(index) : (ChongYangMsg.SignInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public ChongYangMsg.SignInfo.Builder addInfosBuilder() {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public ChongYangMsg.SignInfo.Builder addInfosBuilder(int index) {
            return (ChongYangMsg.SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public List<ChongYangMsg.SignInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChongYangMsg.SignInfo, ChongYangMsg.SignInfo.Builder, ChongYangMsg.SignInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FindTreasure_17005 extends GeneratedMessageV3 implements C2S_FindTreasure_17005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_FindTreasure_17005 DEFAULT_INSTANCE = new C2S_FindTreasure_17005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FindTreasure_17005> PARSER = new AbstractParser<C2S_FindTreasure_17005>() {
         public C2S_FindTreasure_17005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FindTreasure_17005(input, extensionRegistry);
         }
      };

      private C2S_FindTreasure_17005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FindTreasure_17005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FindTreasure_17005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FindTreasure_17005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FindTreasure_17005.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FindTreasure_17005)) {
            return super.equals(obj);
         } else {
            C2S_FindTreasure_17005 other = (C2S_FindTreasure_17005)obj;
            if (this.hasNum() != other.hasNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FindTreasure_17005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_17005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_17005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_17005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_17005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_17005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_17005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_17005 parseFrom(InputStream input) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_17005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FindTreasure_17005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_17005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FindTreasure_17005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_17005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_17005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FindTreasure_17005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FindTreasure_17005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FindTreasure_17005> parser() {
         return PARSER;
      }

      public Parser<C2S_FindTreasure_17005> getParserForType() {
         return PARSER;
      }

      public C2S_FindTreasure_17005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FindTreasure_17005OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FindTreasure_17005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.C2S_FindTreasure_17005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_17005_descriptor;
         }

         public C2S_FindTreasure_17005 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.C2S_FindTreasure_17005.getDefaultInstance();
         }

         public C2S_FindTreasure_17005 build() {
            C2S_FindTreasure_17005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FindTreasure_17005 buildPartial() {
            C2S_FindTreasure_17005 result = new C2S_FindTreasure_17005(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_FindTreasure_17005) {
               return this.mergeFrom((C2S_FindTreasure_17005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FindTreasure_17005 other) {
            if (other == ThanksgivingDayMsg.C2S_FindTreasure_17005.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FindTreasure_17005 parsedMessage = null;

            try {
               parsedMessage = (C2S_FindTreasure_17005)ThanksgivingDayMsg.C2S_FindTreasure_17005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FindTreasure_17005)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
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

   public static final class S2C_FindTreasure_17006 extends GeneratedMessageV3 implements S2C_FindTreasure_17006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int USEFREE_FIELD_NUMBER = 1;
      private int useFree_;
      public static final int ROUNDNUM_FIELD_NUMBER = 2;
      private int roundNum_;
      private byte memoizedIsInitialized;
      private static final S2C_FindTreasure_17006 DEFAULT_INSTANCE = new S2C_FindTreasure_17006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FindTreasure_17006> PARSER = new AbstractParser<S2C_FindTreasure_17006>() {
         public S2C_FindTreasure_17006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FindTreasure_17006(input, extensionRegistry);
         }
      };

      private S2C_FindTreasure_17006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FindTreasure_17006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FindTreasure_17006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FindTreasure_17006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.useFree_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.roundNum_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FindTreasure_17006.class, Builder.class);
      }

      public boolean hasUseFree() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUseFree() {
         return this.useFree_;
      }

      public boolean hasRoundNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRoundNum() {
         return this.roundNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUseFree()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.useFree_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.roundNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.useFree_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.roundNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FindTreasure_17006)) {
            return super.equals(obj);
         } else {
            S2C_FindTreasure_17006 other = (S2C_FindTreasure_17006)obj;
            if (this.hasUseFree() != other.hasUseFree()) {
               return false;
            } else if (this.hasUseFree() && this.getUseFree() != other.getUseFree()) {
               return false;
            } else if (this.hasRoundNum() != other.hasRoundNum()) {
               return false;
            } else if (this.hasRoundNum() && this.getRoundNum() != other.getRoundNum()) {
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
            if (this.hasUseFree()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUseFree();
            }

            if (this.hasRoundNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRoundNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FindTreasure_17006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_17006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_17006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_17006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_17006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_17006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_17006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_17006 parseFrom(InputStream input) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_17006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FindTreasure_17006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_17006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FindTreasure_17006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_17006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_17006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FindTreasure_17006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FindTreasure_17006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FindTreasure_17006> parser() {
         return PARSER;
      }

      public Parser<S2C_FindTreasure_17006> getParserForType() {
         return PARSER;
      }

      public S2C_FindTreasure_17006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FindTreasure_17006OrBuilder {
         private int bitField0_;
         private int useFree_;
         private int roundNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FindTreasure_17006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_FindTreasure_17006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.useFree_ = 0;
            this.bitField0_ &= -2;
            this.roundNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_17006_descriptor;
         }

         public S2C_FindTreasure_17006 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_FindTreasure_17006.getDefaultInstance();
         }

         public S2C_FindTreasure_17006 build() {
            S2C_FindTreasure_17006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FindTreasure_17006 buildPartial() {
            S2C_FindTreasure_17006 result = new S2C_FindTreasure_17006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.useFree_ = this.useFree_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.roundNum_ = this.roundNum_;
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
            if (other instanceof S2C_FindTreasure_17006) {
               return this.mergeFrom((S2C_FindTreasure_17006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FindTreasure_17006 other) {
            if (other == ThanksgivingDayMsg.S2C_FindTreasure_17006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUseFree()) {
                  this.setUseFree(other.getUseFree());
               }

               if (other.hasRoundNum()) {
                  this.setRoundNum(other.getRoundNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUseFree()) {
               return false;
            } else {
               return this.hasRoundNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FindTreasure_17006 parsedMessage = null;

            try {
               parsedMessage = (S2C_FindTreasure_17006)ThanksgivingDayMsg.S2C_FindTreasure_17006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FindTreasure_17006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUseFree() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUseFree() {
            return this.useFree_;
         }

         public Builder setUseFree(int value) {
            this.bitField0_ |= 1;
            this.useFree_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseFree() {
            this.bitField0_ &= -2;
            this.useFree_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRoundNum() {
            return this.roundNum_;
         }

         public Builder setRoundNum(int value) {
            this.bitField0_ |= 2;
            this.roundNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundNum() {
            this.bitField0_ &= -3;
            this.roundNum_ = 0;
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

   public static final class C2S_TaskCommit_17007 extends GeneratedMessageV3 implements C2S_TaskCommit_17007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskCommit_17007 DEFAULT_INSTANCE = new C2S_TaskCommit_17007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskCommit_17007> PARSER = new AbstractParser<C2S_TaskCommit_17007>() {
         public C2S_TaskCommit_17007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskCommit_17007(input, extensionRegistry);
         }
      };

      private C2S_TaskCommit_17007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskCommit_17007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskCommit_17007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskCommit_17007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommit_17007.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TaskCommit_17007)) {
            return super.equals(obj);
         } else {
            C2S_TaskCommit_17007 other = (C2S_TaskCommit_17007)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TaskCommit_17007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommit_17007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommit_17007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommit_17007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommit_17007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommit_17007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommit_17007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommit_17007 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommit_17007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommit_17007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskCommit_17007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommit_17007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommit_17007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommit_17007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskCommit_17007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskCommit_17007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskCommit_17007> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskCommit_17007> getParserForType() {
         return PARSER;
      }

      public C2S_TaskCommit_17007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskCommit_17007OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommit_17007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.C2S_TaskCommit_17007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskCommit_17007_descriptor;
         }

         public C2S_TaskCommit_17007 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.C2S_TaskCommit_17007.getDefaultInstance();
         }

         public C2S_TaskCommit_17007 build() {
            C2S_TaskCommit_17007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskCommit_17007 buildPartial() {
            C2S_TaskCommit_17007 result = new C2S_TaskCommit_17007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_TaskCommit_17007) {
               return this.mergeFrom((C2S_TaskCommit_17007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskCommit_17007 other) {
            if (other == ThanksgivingDayMsg.C2S_TaskCommit_17007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TaskCommit_17007 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskCommit_17007)ThanksgivingDayMsg.C2S_TaskCommit_17007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskCommit_17007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class S2C_TaskCommit_17008 extends GeneratedMessageV3 implements S2C_TaskCommit_17008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int TASKPOINT_FIELD_NUMBER = 2;
      private int taskPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskCommit_17008 DEFAULT_INSTANCE = new S2C_TaskCommit_17008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskCommit_17008> PARSER = new AbstractParser<S2C_TaskCommit_17008>() {
         public S2C_TaskCommit_17008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskCommit_17008(input, extensionRegistry);
         }
      };

      private S2C_TaskCommit_17008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskCommit_17008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskCommit_17008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskCommit_17008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskPoint_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommit_17008.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasTaskPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskPoint() {
         return this.taskPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskPoint_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskCommit_17008)) {
            return super.equals(obj);
         } else {
            S2C_TaskCommit_17008 other = (S2C_TaskCommit_17008)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasTaskPoint() != other.hasTaskPoint()) {
               return false;
            } else if (this.hasTaskPoint() && this.getTaskPoint() != other.getTaskPoint()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasTaskPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskCommit_17008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommit_17008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommit_17008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommit_17008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommit_17008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommit_17008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommit_17008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommit_17008 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommit_17008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommit_17008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskCommit_17008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommit_17008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommit_17008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommit_17008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskCommit_17008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskCommit_17008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskCommit_17008> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskCommit_17008> getParserForType() {
         return PARSER;
      }

      public S2C_TaskCommit_17008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskCommit_17008OrBuilder {
         private int bitField0_;
         private int taskId_;
         private int taskPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommit_17008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_TaskCommit_17008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.taskPoint_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskCommit_17008_descriptor;
         }

         public S2C_TaskCommit_17008 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_TaskCommit_17008.getDefaultInstance();
         }

         public S2C_TaskCommit_17008 build() {
            S2C_TaskCommit_17008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskCommit_17008 buildPartial() {
            S2C_TaskCommit_17008 result = new S2C_TaskCommit_17008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskPoint_ = this.taskPoint_;
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
            if (other instanceof S2C_TaskCommit_17008) {
               return this.mergeFrom((S2C_TaskCommit_17008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskCommit_17008 other) {
            if (other == ThanksgivingDayMsg.S2C_TaskCommit_17008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasTaskPoint()) {
                  this.setTaskPoint(other.getTaskPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else {
               return this.hasTaskPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskCommit_17008 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskCommit_17008)ThanksgivingDayMsg.S2C_TaskCommit_17008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskCommit_17008)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTaskPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskPoint() {
            return this.taskPoint_;
         }

         public Builder setTaskPoint(int value) {
            this.bitField0_ |= 2;
            this.taskPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskPoint() {
            this.bitField0_ &= -3;
            this.taskPoint_ = 0;
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

   public static final class S2C_TaskNotify_17010 extends GeneratedMessageV3 implements S2C_TaskNotify_17010OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_17010 DEFAULT_INSTANCE = new S2C_TaskNotify_17010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_17010> PARSER = new AbstractParser<S2C_TaskNotify_17010>() {
         public S2C_TaskNotify_17010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_17010(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_17010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_17010() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_17010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_17010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_17010.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotify_17010)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_17010 other = (S2C_TaskNotify_17010)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotify_17010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_17010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_17010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_17010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_17010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_17010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_17010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_17010 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_17010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_17010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_17010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_17010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_17010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_17010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_17010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_17010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_17010> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_17010> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_17010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_17010OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_17010.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_TaskNotify_17010.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskNotify_17010_descriptor;
         }

         public S2C_TaskNotify_17010 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_TaskNotify_17010.getDefaultInstance();
         }

         public S2C_TaskNotify_17010 build() {
            S2C_TaskNotify_17010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_17010 buildPartial() {
            S2C_TaskNotify_17010 result = new S2C_TaskNotify_17010(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_TaskNotify_17010) {
               return this.mergeFrom((S2C_TaskNotify_17010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_17010 other) {
            if (other == ThanksgivingDayMsg.S2C_TaskNotify_17010.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = ThanksgivingDayMsg.S2C_TaskNotify_17010.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotify_17010 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_17010)ThanksgivingDayMsg.S2C_TaskNotify_17010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_17010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TaskPointReward_17011 extends GeneratedMessageV3 implements C2S_TaskPointReward_17011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POINTREWARD_FIELD_NUMBER = 1;
      private int pointReward_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskPointReward_17011 DEFAULT_INSTANCE = new C2S_TaskPointReward_17011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskPointReward_17011> PARSER = new AbstractParser<C2S_TaskPointReward_17011>() {
         public C2S_TaskPointReward_17011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskPointReward_17011(input, extensionRegistry);
         }
      };

      private C2S_TaskPointReward_17011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskPointReward_17011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskPointReward_17011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskPointReward_17011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pointReward_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskPointReward_17011.class, Builder.class);
      }

      public boolean hasPointReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPointReward() {
         return this.pointReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPointReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pointReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pointReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TaskPointReward_17011)) {
            return super.equals(obj);
         } else {
            C2S_TaskPointReward_17011 other = (C2S_TaskPointReward_17011)obj;
            if (this.hasPointReward() != other.hasPointReward()) {
               return false;
            } else if (this.hasPointReward() && this.getPointReward() != other.getPointReward()) {
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
            if (this.hasPointReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPointReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TaskPointReward_17011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data);
      }

      public static C2S_TaskPointReward_17011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskPointReward_17011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data);
      }

      public static C2S_TaskPointReward_17011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskPointReward_17011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data);
      }

      public static C2S_TaskPointReward_17011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskPointReward_17011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskPointReward_17011 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskPointReward_17011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskPointReward_17011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskPointReward_17011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskPointReward_17011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskPointReward_17011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskPointReward_17011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskPointReward_17011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskPointReward_17011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskPointReward_17011> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskPointReward_17011> getParserForType() {
         return PARSER;
      }

      public C2S_TaskPointReward_17011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskPointReward_17011OrBuilder {
         private int bitField0_;
         private int pointReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskPointReward_17011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.C2S_TaskPointReward_17011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pointReward_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_TaskPointReward_17011_descriptor;
         }

         public C2S_TaskPointReward_17011 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.C2S_TaskPointReward_17011.getDefaultInstance();
         }

         public C2S_TaskPointReward_17011 build() {
            C2S_TaskPointReward_17011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskPointReward_17011 buildPartial() {
            C2S_TaskPointReward_17011 result = new C2S_TaskPointReward_17011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pointReward_ = this.pointReward_;
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
            if (other instanceof C2S_TaskPointReward_17011) {
               return this.mergeFrom((C2S_TaskPointReward_17011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskPointReward_17011 other) {
            if (other == ThanksgivingDayMsg.C2S_TaskPointReward_17011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPointReward()) {
                  this.setPointReward(other.getPointReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPointReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TaskPointReward_17011 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskPointReward_17011)ThanksgivingDayMsg.C2S_TaskPointReward_17011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskPointReward_17011)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPointReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPointReward() {
            return this.pointReward_;
         }

         public Builder setPointReward(int value) {
            this.bitField0_ |= 1;
            this.pointReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.bitField0_ &= -2;
            this.pointReward_ = 0;
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

   public static final class S2C_TaskPointReward_17012 extends GeneratedMessageV3 implements S2C_TaskPointReward_17012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POINTREWARD_FIELD_NUMBER = 1;
      private int pointReward_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskPointReward_17012 DEFAULT_INSTANCE = new S2C_TaskPointReward_17012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskPointReward_17012> PARSER = new AbstractParser<S2C_TaskPointReward_17012>() {
         public S2C_TaskPointReward_17012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskPointReward_17012(input, extensionRegistry);
         }
      };

      private S2C_TaskPointReward_17012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskPointReward_17012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskPointReward_17012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskPointReward_17012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pointReward_ = input.readInt32();
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
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskPointReward_17012.class, Builder.class);
      }

      public boolean hasPointReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPointReward() {
         return this.pointReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPointReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pointReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pointReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskPointReward_17012)) {
            return super.equals(obj);
         } else {
            S2C_TaskPointReward_17012 other = (S2C_TaskPointReward_17012)obj;
            if (this.hasPointReward() != other.hasPointReward()) {
               return false;
            } else if (this.hasPointReward() && this.getPointReward() != other.getPointReward()) {
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
            if (this.hasPointReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPointReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskPointReward_17012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data);
      }

      public static S2C_TaskPointReward_17012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskPointReward_17012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data);
      }

      public static S2C_TaskPointReward_17012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskPointReward_17012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data);
      }

      public static S2C_TaskPointReward_17012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskPointReward_17012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskPointReward_17012 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskPointReward_17012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskPointReward_17012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskPointReward_17012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskPointReward_17012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskPointReward_17012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskPointReward_17012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskPointReward_17012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskPointReward_17012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskPointReward_17012> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskPointReward_17012> getParserForType() {
         return PARSER;
      }

      public S2C_TaskPointReward_17012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskPointReward_17012OrBuilder {
         private int bitField0_;
         private int pointReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskPointReward_17012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ThanksgivingDayMsg.S2C_TaskPointReward_17012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pointReward_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ThanksgivingDayMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_TaskPointReward_17012_descriptor;
         }

         public S2C_TaskPointReward_17012 getDefaultInstanceForType() {
            return ThanksgivingDayMsg.S2C_TaskPointReward_17012.getDefaultInstance();
         }

         public S2C_TaskPointReward_17012 build() {
            S2C_TaskPointReward_17012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskPointReward_17012 buildPartial() {
            S2C_TaskPointReward_17012 result = new S2C_TaskPointReward_17012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pointReward_ = this.pointReward_;
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
            if (other instanceof S2C_TaskPointReward_17012) {
               return this.mergeFrom((S2C_TaskPointReward_17012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskPointReward_17012 other) {
            if (other == ThanksgivingDayMsg.S2C_TaskPointReward_17012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPointReward()) {
                  this.setPointReward(other.getPointReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPointReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskPointReward_17012 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskPointReward_17012)ThanksgivingDayMsg.S2C_TaskPointReward_17012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskPointReward_17012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPointReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPointReward() {
            return this.pointReward_;
         }

         public Builder setPointReward(int value) {
            this.bitField0_ |= 1;
            this.pointReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.bitField0_ &= -2;
            this.pointReward_ = 0;
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

   public interface C2S_FindTreasure_17005OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_Main_17001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_17003OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_TaskCommit_17007OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TaskPointReward_17011OrBuilder extends MessageOrBuilder {
      boolean hasPointReward();

      int getPointReward();
   }

   public interface S2C_FindTreasure_17006OrBuilder extends MessageOrBuilder {
      boolean hasUseFree();

      int getUseFree();

      boolean hasRoundNum();

      int getRoundNum();
   }

   public interface S2C_Main_17002OrBuilder extends MessageOrBuilder {
      List<ChongYangMsg.SignInfo> getInfosList();

      ChongYangMsg.SignInfo getInfos(int index);

      int getInfosCount();

      List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList();

      ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasUseFree();

      int getUseFree();

      boolean hasRoundNum();

      int getRoundNum();

      boolean hasDay();

      int getDay();

      boolean hasTaskPoint();

      int getTaskPoint();

      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);

      List<ThemeActivityMsg.IllustrationData> getIllustrationList();

      ThemeActivityMsg.IllustrationData getIllustration(int index);

      int getIllustrationCount();

      List<? extends ThemeActivityMsg.IllustrationDataOrBuilder> getIllustrationOrBuilderList();

      ThemeActivityMsg.IllustrationDataOrBuilder getIllustrationOrBuilder(int index);
   }

   public interface S2C_Sign_17004OrBuilder extends MessageOrBuilder {
      List<ChongYangMsg.SignInfo> getInfosList();

      ChongYangMsg.SignInfo getInfos(int index);

      int getInfosCount();

      List<? extends ChongYangMsg.SignInfoOrBuilder> getInfosOrBuilderList();

      ChongYangMsg.SignInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_TaskCommit_17008OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasTaskPoint();

      int getTaskPoint();
   }

   public interface S2C_TaskNotify_17010OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TaskPointReward_17012OrBuilder extends MessageOrBuilder {
      boolean hasPointReward();

      int getPointReward();
   }
}
