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

public final class CrossUnionWarMsg {
   private static final Descriptors.Descriptor internal_static_cross_unionWar_WarAgainstData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_WarAgainstData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_WarStrongholdData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_WarStrongholdData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarSign_10101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossUnionWarMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013CrossUnionWar.proto\u0012\u000ecross.unionWar\u001a\fBattle.proto\"\u0010\n\u000eWarAgainstData\"9\n\u0011WarStrongholdData\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nstronghold\u0018\u0002 \u0002(\f\"(\n\u0017S2CR_UnionWarSign_10101\u0012\r\n\u0005union\u0018\u0001 \u0002(\f\"\u001f\n\u001dS2CR_UnionWarServerInit_10102\"5\n\u001eCR2S_UnionWarAgainstList_10103\u0012\u0013\n\u000bagainstList\u0018\u0001 \u0003(\f\"4\n!S2CR_UnionWarStrongholdList_10104\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\"o\n!CR2S_UnionWarStrongholdList_10105\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u00129\n\u000estrongholdList\u0018\u0002 \u0003(\u000b2!.cross.unionWar.WarStrongholdData\"1\n\u001fS2CR_UnionWarStatusChange_10106\u0012\u000e\n\u0006status\u0018\u0001 \u0002(\u0005\"E\n\u001fCR2S_UnionWarStatusChange_10107\u0012\u000e\n\u0006status\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nupdateTime\u0018\u0002 \u0002(\u0005\"F\n\"S2CR_UnionWarAttackLogUpload_10108\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007logData\u0018\u0002 \u0002(\f\"F\n\"CR2S_UnionWarAttackLogNotify_10109\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007logData\u0018\u0002 \u0002(\f\"3\n S2CR_UnionWarAttackLogList_10110\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\"E\n CR2S_UnionWarAttackLogList_10111\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\blogsData\u0018\u0002 \u0003(\f\"_\n\u0019S2CR_UnionWarBattle_10112\u0012B\n\tbattleMsg\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"_\n\u0019CR2S_UnionWarBattle_10113\u0012B\n\tbattleMsg\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"e\n\u001dCR2S_UnionWarServerMove_10114\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmemberId\u0018\u0003 \u0003(\u0005\u0012\u000f\n\u0007isMerge\u0018\u0004 \u0002(\b\"e\n\u001dCR2S_UnionWarStarChange_10115\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007holdPos\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007maxStar\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ttotalStar\u0018\u0004 \u0002(\u0005B'\n\u0011com.gzbz.protobufB\u0010CrossUnionWarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{BattleMsg.getDescriptor()});
      internal_static_cross_unionWar_WarAgainstData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_cross_unionWar_WarAgainstData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_WarAgainstData_descriptor, new String[0]);
      internal_static_cross_unionWar_WarStrongholdData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_cross_unionWar_WarStrongholdData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_WarStrongholdData_descriptor, new String[]{"Position", "Stronghold"});
      internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_cross_unionWar_S2CR_UnionWarSign_10101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor, new String[]{"Union"});
      internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor, new String[0]);
      internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor, new String[]{"AgainstList"});
      internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor, new String[]{"UnionId"});
      internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor, new String[]{"UnionId", "StrongholdList"});
      internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor, new String[]{"Status"});
      internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor, new String[]{"Status", "UpdateTime"});
      internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor, new String[]{"UnionId", "LogData"});
      internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor, new String[]{"UnionId", "LogData"});
      internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor, new String[]{"UnionId"});
      internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor, new String[]{"UnionId", "LogsData"});
      internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor, new String[]{"BattleMsg"});
      internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor, new String[]{"BattleMsg"});
      internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor, new String[]{"ServerId", "UnionId", "MemberId", "IsMerge"});
      internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor, new String[]{"UnionId", "HoldPos", "MaxStar", "TotalStar"});
      BattleMsg.getDescriptor();
   }

   public static final class WarAgainstData extends GeneratedMessageV3 implements WarAgainstDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final WarAgainstData DEFAULT_INSTANCE = new WarAgainstData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarAgainstData> PARSER = new AbstractParser<WarAgainstData>() {
         public WarAgainstData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarAgainstData(input, extensionRegistry);
         }
      };

      private WarAgainstData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarAgainstData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarAgainstData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarAgainstData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_WarAgainstData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_WarAgainstData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstData.class, Builder.class);
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
         } else if (!(obj instanceof WarAgainstData)) {
            return super.equals(obj);
         } else {
            WarAgainstData other = (WarAgainstData)obj;
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

      public static WarAgainstData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(InputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarAgainstData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstData parseFrom(CodedInputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarAgainstData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarAgainstData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarAgainstData> parser() {
         return PARSER;
      }

      public Parser<WarAgainstData> getParserForType() {
         return PARSER;
      }

      public WarAgainstData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarAgainstDataOrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarAgainstData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarAgainstData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.WarAgainstData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarAgainstData_descriptor;
         }

         public WarAgainstData getDefaultInstanceForType() {
            return CrossUnionWarMsg.WarAgainstData.getDefaultInstance();
         }

         public WarAgainstData build() {
            WarAgainstData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarAgainstData buildPartial() {
            WarAgainstData result = new WarAgainstData(this);
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
            if (other instanceof WarAgainstData) {
               return this.mergeFrom((WarAgainstData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarAgainstData other) {
            if (other == CrossUnionWarMsg.WarAgainstData.getDefaultInstance()) {
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
            WarAgainstData parsedMessage = null;

            try {
               parsedMessage = (WarAgainstData)CrossUnionWarMsg.WarAgainstData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarAgainstData)e.getUnfinishedMessage();
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

   public static final class WarStrongholdData extends GeneratedMessageV3 implements WarStrongholdDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int STRONGHOLD_FIELD_NUMBER = 2;
      private ByteString stronghold_;
      private byte memoizedIsInitialized;
      private static final WarStrongholdData DEFAULT_INSTANCE = new WarStrongholdData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarStrongholdData> PARSER = new AbstractParser<WarStrongholdData>() {
         public WarStrongholdData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarStrongholdData(input, extensionRegistry);
         }
      };

      private WarStrongholdData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarStrongholdData() {
         this.memoizedIsInitialized = -1;
         this.stronghold_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarStrongholdData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarStrongholdData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.stronghold_ = input.readBytes();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_WarStrongholdData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_WarStrongholdData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdData.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasStronghold() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getStronghold() {
         return this.stronghold_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStronghold()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.stronghold_);
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.stronghold_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarStrongholdData)) {
            return super.equals(obj);
         } else {
            WarStrongholdData other = (WarStrongholdData)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasStronghold() != other.hasStronghold()) {
               return false;
            } else if (this.hasStronghold() && !this.getStronghold().equals(other.getStronghold())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasStronghold()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStronghold().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarStrongholdData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(InputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(CodedInputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarStrongholdData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarStrongholdData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarStrongholdData> parser() {
         return PARSER;
      }

      public Parser<WarStrongholdData> getParserForType() {
         return PARSER;
      }

      public WarStrongholdData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarStrongholdDataOrBuilder {
         private int bitField0_;
         private int position_;
         private ByteString stronghold_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarStrongholdData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarStrongholdData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdData.class, Builder.class);
         }

         private Builder() {
            this.stronghold_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.stronghold_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.WarStrongholdData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.stronghold_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_WarStrongholdData_descriptor;
         }

         public WarStrongholdData getDefaultInstanceForType() {
            return CrossUnionWarMsg.WarStrongholdData.getDefaultInstance();
         }

         public WarStrongholdData build() {
            WarStrongholdData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarStrongholdData buildPartial() {
            WarStrongholdData result = new WarStrongholdData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.stronghold_ = this.stronghold_;
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
            if (other instanceof WarStrongholdData) {
               return this.mergeFrom((WarStrongholdData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarStrongholdData other) {
            if (other == CrossUnionWarMsg.WarStrongholdData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasStronghold()) {
                  this.setStronghold(other.getStronghold());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasStronghold();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarStrongholdData parsedMessage = null;

            try {
               parsedMessage = (WarStrongholdData)CrossUnionWarMsg.WarStrongholdData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarStrongholdData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStronghold() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getStronghold() {
            return this.stronghold_;
         }

         public Builder setStronghold(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.stronghold_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearStronghold() {
            this.bitField0_ &= -3;
            this.stronghold_ = CrossUnionWarMsg.WarStrongholdData.getDefaultInstance().getStronghold();
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

   public static final class S2CR_UnionWarSign_10101 extends GeneratedMessageV3 implements S2CR_UnionWarSign_10101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNION_FIELD_NUMBER = 1;
      private ByteString union_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarSign_10101 DEFAULT_INSTANCE = new S2CR_UnionWarSign_10101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarSign_10101> PARSER = new AbstractParser<S2CR_UnionWarSign_10101>() {
         public S2CR_UnionWarSign_10101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarSign_10101(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarSign_10101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarSign_10101() {
         this.memoizedIsInitialized = -1;
         this.union_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarSign_10101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarSign_10101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.union_ = input.readBytes();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarSign_10101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarSign_10101.class, Builder.class);
      }

      public boolean hasUnion() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getUnion() {
         return this.union_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnion()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.union_);
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
               size += CodedOutputStream.computeBytesSize(1, this.union_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarSign_10101)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarSign_10101 other = (S2CR_UnionWarSign_10101)obj;
            if (this.hasUnion() != other.hasUnion()) {
               return false;
            } else if (this.hasUnion() && !this.getUnion().equals(other.getUnion())) {
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
            if (this.hasUnion()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnion().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarSign_10101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarSign_10101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarSign_10101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarSign_10101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarSign_10101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarSign_10101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarSign_10101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarSign_10101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarSign_10101> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarSign_10101> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarSign_10101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarSign_10101OrBuilder {
         private int bitField0_;
         private ByteString union_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarSign_10101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarSign_10101.class, Builder.class);
         }

         private Builder() {
            this.union_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.union_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarSign_10101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.union_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarSign_10101_descriptor;
         }

         public S2CR_UnionWarSign_10101 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarSign_10101.getDefaultInstance();
         }

         public S2CR_UnionWarSign_10101 build() {
            S2CR_UnionWarSign_10101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarSign_10101 buildPartial() {
            S2CR_UnionWarSign_10101 result = new S2CR_UnionWarSign_10101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.union_ = this.union_;
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
            if (other instanceof S2CR_UnionWarSign_10101) {
               return this.mergeFrom((S2CR_UnionWarSign_10101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarSign_10101 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarSign_10101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnion()) {
                  this.setUnion(other.getUnion());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasUnion();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarSign_10101 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarSign_10101)CrossUnionWarMsg.S2CR_UnionWarSign_10101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarSign_10101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnion() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getUnion() {
            return this.union_;
         }

         public Builder setUnion(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.union_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnion() {
            this.bitField0_ &= -2;
            this.union_ = CrossUnionWarMsg.S2CR_UnionWarSign_10101.getDefaultInstance().getUnion();
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

   public static final class S2CR_UnionWarServerInit_10102 extends GeneratedMessageV3 implements S2CR_UnionWarServerInit_10102OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarServerInit_10102 DEFAULT_INSTANCE = new S2CR_UnionWarServerInit_10102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarServerInit_10102> PARSER = new AbstractParser<S2CR_UnionWarServerInit_10102>() {
         public S2CR_UnionWarServerInit_10102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarServerInit_10102(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarServerInit_10102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarServerInit_10102() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarServerInit_10102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarServerInit_10102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarServerInit_10102.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_UnionWarServerInit_10102)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarServerInit_10102 other = (S2CR_UnionWarServerInit_10102)obj;
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

      public static S2CR_UnionWarServerInit_10102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarServerInit_10102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarServerInit_10102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarServerInit_10102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarServerInit_10102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarServerInit_10102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarServerInit_10102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarServerInit_10102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarServerInit_10102> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarServerInit_10102> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarServerInit_10102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarServerInit_10102OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarServerInit_10102.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarServerInit_10102_descriptor;
         }

         public S2CR_UnionWarServerInit_10102 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.getDefaultInstance();
         }

         public S2CR_UnionWarServerInit_10102 build() {
            S2CR_UnionWarServerInit_10102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarServerInit_10102 buildPartial() {
            S2CR_UnionWarServerInit_10102 result = new S2CR_UnionWarServerInit_10102(this);
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
            if (other instanceof S2CR_UnionWarServerInit_10102) {
               return this.mergeFrom((S2CR_UnionWarServerInit_10102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarServerInit_10102 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.getDefaultInstance()) {
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
            S2CR_UnionWarServerInit_10102 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarServerInit_10102)CrossUnionWarMsg.S2CR_UnionWarServerInit_10102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarServerInit_10102)e.getUnfinishedMessage();
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

   public static final class CR2S_UnionWarAgainstList_10103 extends GeneratedMessageV3 implements CR2S_UnionWarAgainstList_10103OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AGAINSTLIST_FIELD_NUMBER = 1;
      private List<ByteString> againstList_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarAgainstList_10103 DEFAULT_INSTANCE = new CR2S_UnionWarAgainstList_10103();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarAgainstList_10103> PARSER = new AbstractParser<CR2S_UnionWarAgainstList_10103>() {
         public CR2S_UnionWarAgainstList_10103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarAgainstList_10103(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarAgainstList_10103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarAgainstList_10103() {
         this.memoizedIsInitialized = -1;
         this.againstList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarAgainstList_10103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarAgainstList_10103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.againstList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.againstList_.add(input.readBytes());
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
                  this.againstList_ = Collections.unmodifiableList(this.againstList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAgainstList_10103.class, Builder.class);
      }

      public List<ByteString> getAgainstListList() {
         return this.againstList_;
      }

      public int getAgainstListCount() {
         return this.againstList_.size();
      }

      public ByteString getAgainstList(int index) {
         return (ByteString)this.againstList_.get(index);
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
         for(int i = 0; i < this.againstList_.size(); ++i) {
            output.writeBytes(1, (ByteString)this.againstList_.get(i));
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

            for(int i = 0; i < this.againstList_.size(); ++i) {
               dataSize += CodedOutputStream.computeBytesSizeNoTag((ByteString)this.againstList_.get(i));
            }

            size += dataSize;
            size += 1 * this.getAgainstListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarAgainstList_10103)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarAgainstList_10103 other = (CR2S_UnionWarAgainstList_10103)obj;
            if (!this.getAgainstListList().equals(other.getAgainstListList())) {
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
            if (this.getAgainstListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAgainstListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAgainstList_10103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAgainstList_10103 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAgainstList_10103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAgainstList_10103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAgainstList_10103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarAgainstList_10103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarAgainstList_10103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarAgainstList_10103> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarAgainstList_10103> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarAgainstList_10103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarAgainstList_10103OrBuilder {
         private int bitField0_;
         private List<ByteString> againstList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAgainstList_10103.class, Builder.class);
         }

         private Builder() {
            this.againstList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.againstList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarAgainstList_10103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.againstList_ = Collections.emptyList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAgainstList_10103_descriptor;
         }

         public CR2S_UnionWarAgainstList_10103 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarAgainstList_10103.getDefaultInstance();
         }

         public CR2S_UnionWarAgainstList_10103 build() {
            CR2S_UnionWarAgainstList_10103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarAgainstList_10103 buildPartial() {
            CR2S_UnionWarAgainstList_10103 result = new CR2S_UnionWarAgainstList_10103(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.againstList_ = Collections.unmodifiableList(this.againstList_);
               this.bitField0_ &= -2;
            }

            result.againstList_ = this.againstList_;
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
            if (other instanceof CR2S_UnionWarAgainstList_10103) {
               return this.mergeFrom((CR2S_UnionWarAgainstList_10103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarAgainstList_10103 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarAgainstList_10103.getDefaultInstance()) {
               return this;
            } else {
               if (!other.againstList_.isEmpty()) {
                  if (this.againstList_.isEmpty()) {
                     this.againstList_ = other.againstList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureAgainstListIsMutable();
                     this.againstList_.addAll(other.againstList_);
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
            CR2S_UnionWarAgainstList_10103 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarAgainstList_10103)CrossUnionWarMsg.CR2S_UnionWarAgainstList_10103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarAgainstList_10103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAgainstListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.againstList_ = new ArrayList(this.againstList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ByteString> getAgainstListList() {
            return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.againstList_) : this.againstList_;
         }

         public int getAgainstListCount() {
            return this.againstList_.size();
         }

         public ByteString getAgainstList(int index) {
            return (ByteString)this.againstList_.get(index);
         }

         public Builder setAgainstList(int index, ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureAgainstListIsMutable();
               this.againstList_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAgainstList(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureAgainstListIsMutable();
               this.againstList_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllAgainstList(Iterable<? extends ByteString> values) {
            this.ensureAgainstListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.againstList_);
            this.onChanged();
            return this;
         }

         public Builder clearAgainstList() {
            this.againstList_ = Collections.emptyList();
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

   public static final class S2CR_UnionWarStrongholdList_10104 extends GeneratedMessageV3 implements S2CR_UnionWarStrongholdList_10104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarStrongholdList_10104 DEFAULT_INSTANCE = new S2CR_UnionWarStrongholdList_10104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarStrongholdList_10104> PARSER = new AbstractParser<S2CR_UnionWarStrongholdList_10104>() {
         public S2CR_UnionWarStrongholdList_10104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarStrongholdList_10104(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarStrongholdList_10104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarStrongholdList_10104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarStrongholdList_10104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarStrongholdList_10104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarStrongholdList_10104.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarStrongholdList_10104)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarStrongholdList_10104 other = (S2CR_UnionWarStrongholdList_10104)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStrongholdList_10104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStrongholdList_10104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStrongholdList_10104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarStrongholdList_10104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarStrongholdList_10104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarStrongholdList_10104> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarStrongholdList_10104> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarStrongholdList_10104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarStrongholdList_10104OrBuilder {
         private int bitField0_;
         private int unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarStrongholdList_10104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarStrongholdList_10104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStrongholdList_10104_descriptor;
         }

         public S2CR_UnionWarStrongholdList_10104 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarStrongholdList_10104.getDefaultInstance();
         }

         public S2CR_UnionWarStrongholdList_10104 build() {
            S2CR_UnionWarStrongholdList_10104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarStrongholdList_10104 buildPartial() {
            S2CR_UnionWarStrongholdList_10104 result = new S2CR_UnionWarStrongholdList_10104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
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
            if (other instanceof S2CR_UnionWarStrongholdList_10104) {
               return this.mergeFrom((S2CR_UnionWarStrongholdList_10104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarStrongholdList_10104 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarStrongholdList_10104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasUnionId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarStrongholdList_10104 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarStrongholdList_10104)CrossUnionWarMsg.S2CR_UnionWarStrongholdList_10104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarStrongholdList_10104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
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

   public static final class CR2S_UnionWarStrongholdList_10105 extends GeneratedMessageV3 implements CR2S_UnionWarStrongholdList_10105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int STRONGHOLDLIST_FIELD_NUMBER = 2;
      private List<WarStrongholdData> strongholdList_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarStrongholdList_10105 DEFAULT_INSTANCE = new CR2S_UnionWarStrongholdList_10105();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarStrongholdList_10105> PARSER = new AbstractParser<CR2S_UnionWarStrongholdList_10105>() {
         public CR2S_UnionWarStrongholdList_10105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarStrongholdList_10105(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarStrongholdList_10105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarStrongholdList_10105() {
         this.memoizedIsInitialized = -1;
         this.strongholdList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarStrongholdList_10105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarStrongholdList_10105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.strongholdList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.strongholdList_.add(input.readMessage(CrossUnionWarMsg.WarStrongholdData.PARSER, extensionRegistry));
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
                  this.strongholdList_ = Collections.unmodifiableList(this.strongholdList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStrongholdList_10105.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public List<WarStrongholdData> getStrongholdListList() {
         return this.strongholdList_;
      }

      public List<? extends WarStrongholdDataOrBuilder> getStrongholdListOrBuilderList() {
         return this.strongholdList_;
      }

      public int getStrongholdListCount() {
         return this.strongholdList_.size();
      }

      public WarStrongholdData getStrongholdList(int index) {
         return (WarStrongholdData)this.strongholdList_.get(index);
      }

      public WarStrongholdDataOrBuilder getStrongholdListOrBuilder(int index) {
         return (WarStrongholdDataOrBuilder)this.strongholdList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStrongholdListCount(); ++i) {
               if (!this.getStrongholdList(i).isInitialized()) {
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
            output.writeInt32(1, this.unionId_);
         }

         for(int i = 0; i < this.strongholdList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.strongholdList_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            for(int i = 0; i < this.strongholdList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.strongholdList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarStrongholdList_10105)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarStrongholdList_10105 other = (CR2S_UnionWarStrongholdList_10105)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (!this.getStrongholdListList().equals(other.getStrongholdListList())) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.getStrongholdListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStrongholdListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStrongholdList_10105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStrongholdList_10105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStrongholdList_10105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarStrongholdList_10105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarStrongholdList_10105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarStrongholdList_10105> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarStrongholdList_10105> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarStrongholdList_10105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarStrongholdList_10105OrBuilder {
         private int bitField0_;
         private int unionId_;
         private List<WarStrongholdData> strongholdList_;
         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> strongholdListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStrongholdList_10105.class, Builder.class);
         }

         private Builder() {
            this.strongholdList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.strongholdList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105.alwaysUseFieldBuilders) {
               this.getStrongholdListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            if (this.strongholdListBuilder_ == null) {
               this.strongholdList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.strongholdListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStrongholdList_10105_descriptor;
         }

         public CR2S_UnionWarStrongholdList_10105 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105.getDefaultInstance();
         }

         public CR2S_UnionWarStrongholdList_10105 build() {
            CR2S_UnionWarStrongholdList_10105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarStrongholdList_10105 buildPartial() {
            CR2S_UnionWarStrongholdList_10105 result = new CR2S_UnionWarStrongholdList_10105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if (this.strongholdListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.strongholdList_ = Collections.unmodifiableList(this.strongholdList_);
                  this.bitField0_ &= -3;
               }

               result.strongholdList_ = this.strongholdList_;
            } else {
               result.strongholdList_ = this.strongholdListBuilder_.build();
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
            if (other instanceof CR2S_UnionWarStrongholdList_10105) {
               return this.mergeFrom((CR2S_UnionWarStrongholdList_10105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarStrongholdList_10105 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (this.strongholdListBuilder_ == null) {
                  if (!other.strongholdList_.isEmpty()) {
                     if (this.strongholdList_.isEmpty()) {
                        this.strongholdList_ = other.strongholdList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureStrongholdListIsMutable();
                        this.strongholdList_.addAll(other.strongholdList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.strongholdList_.isEmpty()) {
                  if (this.strongholdListBuilder_.isEmpty()) {
                     this.strongholdListBuilder_.dispose();
                     this.strongholdListBuilder_ = null;
                     this.strongholdList_ = other.strongholdList_;
                     this.bitField0_ &= -3;
                     this.strongholdListBuilder_ = CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105.alwaysUseFieldBuilders ? this.getStrongholdListFieldBuilder() : null;
                  } else {
                     this.strongholdListBuilder_.addAllMessages(other.strongholdList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionId()) {
               return false;
            } else {
               for(int i = 0; i < this.getStrongholdListCount(); ++i) {
                  if (!this.getStrongholdList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarStrongholdList_10105 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarStrongholdList_10105)CrossUnionWarMsg.CR2S_UnionWarStrongholdList_10105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarStrongholdList_10105)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureStrongholdListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.strongholdList_ = new ArrayList(this.strongholdList_);
               this.bitField0_ |= 2;
            }

         }

         public List<WarStrongholdData> getStrongholdListList() {
            return this.strongholdListBuilder_ == null ? Collections.unmodifiableList(this.strongholdList_) : this.strongholdListBuilder_.getMessageList();
         }

         public int getStrongholdListCount() {
            return this.strongholdListBuilder_ == null ? this.strongholdList_.size() : this.strongholdListBuilder_.getCount();
         }

         public WarStrongholdData getStrongholdList(int index) {
            return this.strongholdListBuilder_ == null ? (WarStrongholdData)this.strongholdList_.get(index) : (WarStrongholdData)this.strongholdListBuilder_.getMessage(index);
         }

         public Builder setStrongholdList(int index, WarStrongholdData value) {
            if (this.strongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdListIsMutable();
               this.strongholdList_.set(index, value);
               this.onChanged();
            } else {
               this.strongholdListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStrongholdList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.strongholdListBuilder_ == null) {
               this.ensureStrongholdListIsMutable();
               this.strongholdList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStrongholdList(WarStrongholdData value) {
            if (this.strongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdListIsMutable();
               this.strongholdList_.add(value);
               this.onChanged();
            } else {
               this.strongholdListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStrongholdList(int index, WarStrongholdData value) {
            if (this.strongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdListIsMutable();
               this.strongholdList_.add(index, value);
               this.onChanged();
            } else {
               this.strongholdListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStrongholdList(WarStrongholdData.Builder builderForValue) {
            if (this.strongholdListBuilder_ == null) {
               this.ensureStrongholdListIsMutable();
               this.strongholdList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStrongholdList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.strongholdListBuilder_ == null) {
               this.ensureStrongholdListIsMutable();
               this.strongholdList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStrongholdList(Iterable<? extends WarStrongholdData> values) {
            if (this.strongholdListBuilder_ == null) {
               this.ensureStrongholdListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.strongholdList_);
               this.onChanged();
            } else {
               this.strongholdListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStrongholdList() {
            if (this.strongholdListBuilder_ == null) {
               this.strongholdList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.strongholdListBuilder_.clear();
            }

            return this;
         }

         public Builder removeStrongholdList(int index) {
            if (this.strongholdListBuilder_ == null) {
               this.ensureStrongholdListIsMutable();
               this.strongholdList_.remove(index);
               this.onChanged();
            } else {
               this.strongholdListBuilder_.remove(index);
            }

            return this;
         }

         public WarStrongholdData.Builder getStrongholdListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getStrongholdListFieldBuilder().getBuilder(index);
         }

         public WarStrongholdDataOrBuilder getStrongholdListOrBuilder(int index) {
            return this.strongholdListBuilder_ == null ? (WarStrongholdDataOrBuilder)this.strongholdList_.get(index) : (WarStrongholdDataOrBuilder)this.strongholdListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarStrongholdDataOrBuilder> getStrongholdListOrBuilderList() {
            return this.strongholdListBuilder_ != null ? this.strongholdListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.strongholdList_);
         }

         public WarStrongholdData.Builder addStrongholdListBuilder() {
            return (WarStrongholdData.Builder)this.getStrongholdListFieldBuilder().addBuilder(CrossUnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public WarStrongholdData.Builder addStrongholdListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getStrongholdListFieldBuilder().addBuilder(index, CrossUnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public List<WarStrongholdData.Builder> getStrongholdListBuilderList() {
            return this.getStrongholdListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> getStrongholdListFieldBuilder() {
            if (this.strongholdListBuilder_ == null) {
               this.strongholdListBuilder_ = new RepeatedFieldBuilderV3(this.strongholdList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.strongholdList_ = null;
            }

            return this.strongholdListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UnionWarStatusChange_10106 extends GeneratedMessageV3 implements S2CR_UnionWarStatusChange_10106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private int status_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarStatusChange_10106 DEFAULT_INSTANCE = new S2CR_UnionWarStatusChange_10106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarStatusChange_10106> PARSER = new AbstractParser<S2CR_UnionWarStatusChange_10106>() {
         public S2CR_UnionWarStatusChange_10106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarStatusChange_10106(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarStatusChange_10106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarStatusChange_10106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarStatusChange_10106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarStatusChange_10106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readInt32();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarStatusChange_10106.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.status_);
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
               size += CodedOutputStream.computeInt32Size(1, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarStatusChange_10106)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarStatusChange_10106 other = (S2CR_UnionWarStatusChange_10106)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
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
            if (this.hasStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStatus();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarStatusChange_10106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarStatusChange_10106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStatusChange_10106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarStatusChange_10106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarStatusChange_10106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarStatusChange_10106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarStatusChange_10106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarStatusChange_10106> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarStatusChange_10106> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarStatusChange_10106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarStatusChange_10106OrBuilder {
         private int bitField0_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarStatusChange_10106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarStatusChange_10106_descriptor;
         }

         public S2CR_UnionWarStatusChange_10106 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.getDefaultInstance();
         }

         public S2CR_UnionWarStatusChange_10106 build() {
            S2CR_UnionWarStatusChange_10106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarStatusChange_10106 buildPartial() {
            S2CR_UnionWarStatusChange_10106 result = new S2CR_UnionWarStatusChange_10106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
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
            if (other instanceof S2CR_UnionWarStatusChange_10106) {
               return this.mergeFrom((S2CR_UnionWarStatusChange_10106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarStatusChange_10106 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStatus();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarStatusChange_10106 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarStatusChange_10106)CrossUnionWarMsg.S2CR_UnionWarStatusChange_10106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarStatusChange_10106)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
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

   public static final class CR2S_UnionWarStatusChange_10107 extends GeneratedMessageV3 implements CR2S_UnionWarStatusChange_10107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private int status_;
      public static final int UPDATETIME_FIELD_NUMBER = 2;
      private int updateTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarStatusChange_10107 DEFAULT_INSTANCE = new CR2S_UnionWarStatusChange_10107();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarStatusChange_10107> PARSER = new AbstractParser<CR2S_UnionWarStatusChange_10107>() {
         public CR2S_UnionWarStatusChange_10107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarStatusChange_10107(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarStatusChange_10107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarStatusChange_10107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarStatusChange_10107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarStatusChange_10107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.updateTime_ = input.readInt32();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStatusChange_10107.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean hasUpdateTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUpdateTime() {
         return this.updateTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUpdateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.status_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.updateTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.status_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.updateTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarStatusChange_10107)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarStatusChange_10107 other = (CR2S_UnionWarStatusChange_10107)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.hasUpdateTime() != other.hasUpdateTime()) {
               return false;
            } else if (this.hasUpdateTime() && this.getUpdateTime() != other.getUpdateTime()) {
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
            if (this.hasStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStatus();
            }

            if (this.hasUpdateTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUpdateTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStatusChange_10107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStatusChange_10107 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStatusChange_10107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStatusChange_10107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStatusChange_10107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarStatusChange_10107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarStatusChange_10107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarStatusChange_10107> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarStatusChange_10107> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarStatusChange_10107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarStatusChange_10107OrBuilder {
         private int bitField0_;
         private int status_;
         private int updateTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStatusChange_10107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarStatusChange_10107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = 0;
            this.bitField0_ &= -2;
            this.updateTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStatusChange_10107_descriptor;
         }

         public CR2S_UnionWarStatusChange_10107 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarStatusChange_10107.getDefaultInstance();
         }

         public CR2S_UnionWarStatusChange_10107 build() {
            CR2S_UnionWarStatusChange_10107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarStatusChange_10107 buildPartial() {
            CR2S_UnionWarStatusChange_10107 result = new CR2S_UnionWarStatusChange_10107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.updateTime_ = this.updateTime_;
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
            if (other instanceof CR2S_UnionWarStatusChange_10107) {
               return this.mergeFrom((CR2S_UnionWarStatusChange_10107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarStatusChange_10107 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarStatusChange_10107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               if (other.hasUpdateTime()) {
                  this.setUpdateTime(other.getUpdateTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStatus()) {
               return false;
            } else {
               return this.hasUpdateTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarStatusChange_10107 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarStatusChange_10107)CrossUnionWarMsg.CR2S_UnionWarStatusChange_10107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarStatusChange_10107)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUpdateTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUpdateTime() {
            return this.updateTime_;
         }

         public Builder setUpdateTime(int value) {
            this.bitField0_ |= 2;
            this.updateTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUpdateTime() {
            this.bitField0_ &= -3;
            this.updateTime_ = 0;
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

   public static final class S2CR_UnionWarAttackLogUpload_10108 extends GeneratedMessageV3 implements S2CR_UnionWarAttackLogUpload_10108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int LOGDATA_FIELD_NUMBER = 2;
      private ByteString logData_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarAttackLogUpload_10108 DEFAULT_INSTANCE = new S2CR_UnionWarAttackLogUpload_10108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarAttackLogUpload_10108> PARSER = new AbstractParser<S2CR_UnionWarAttackLogUpload_10108>() {
         public S2CR_UnionWarAttackLogUpload_10108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarAttackLogUpload_10108(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarAttackLogUpload_10108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarAttackLogUpload_10108() {
         this.memoizedIsInitialized = -1;
         this.logData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarAttackLogUpload_10108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarAttackLogUpload_10108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.logData_ = input.readBytes();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarAttackLogUpload_10108.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasLogData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getLogData() {
         return this.logData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLogData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.logData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.logData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarAttackLogUpload_10108)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarAttackLogUpload_10108 other = (S2CR_UnionWarAttackLogUpload_10108)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasLogData() != other.hasLogData()) {
               return false;
            } else if (this.hasLogData() && !this.getLogData().equals(other.getLogData())) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasLogData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLogData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogUpload_10108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogUpload_10108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogUpload_10108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarAttackLogUpload_10108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarAttackLogUpload_10108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarAttackLogUpload_10108> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarAttackLogUpload_10108> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarAttackLogUpload_10108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarAttackLogUpload_10108OrBuilder {
         private int bitField0_;
         private int unionId_;
         private ByteString logData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarAttackLogUpload_10108.class, Builder.class);
         }

         private Builder() {
            this.logData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.logData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.logData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogUpload_10108_descriptor;
         }

         public S2CR_UnionWarAttackLogUpload_10108 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.getDefaultInstance();
         }

         public S2CR_UnionWarAttackLogUpload_10108 build() {
            S2CR_UnionWarAttackLogUpload_10108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarAttackLogUpload_10108 buildPartial() {
            S2CR_UnionWarAttackLogUpload_10108 result = new S2CR_UnionWarAttackLogUpload_10108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.logData_ = this.logData_;
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
            if (other instanceof S2CR_UnionWarAttackLogUpload_10108) {
               return this.mergeFrom((S2CR_UnionWarAttackLogUpload_10108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarAttackLogUpload_10108 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasLogData()) {
                  this.setLogData(other.getLogData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionId()) {
               return false;
            } else {
               return this.hasLogData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarAttackLogUpload_10108 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarAttackLogUpload_10108)CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarAttackLogUpload_10108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLogData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getLogData() {
            return this.logData_;
         }

         public Builder setLogData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.logData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLogData() {
            this.bitField0_ &= -3;
            this.logData_ = CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.getDefaultInstance().getLogData();
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

   public static final class CR2S_UnionWarAttackLogNotify_10109 extends GeneratedMessageV3 implements CR2S_UnionWarAttackLogNotify_10109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int LOGDATA_FIELD_NUMBER = 2;
      private ByteString logData_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarAttackLogNotify_10109 DEFAULT_INSTANCE = new CR2S_UnionWarAttackLogNotify_10109();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarAttackLogNotify_10109> PARSER = new AbstractParser<CR2S_UnionWarAttackLogNotify_10109>() {
         public CR2S_UnionWarAttackLogNotify_10109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarAttackLogNotify_10109(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarAttackLogNotify_10109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarAttackLogNotify_10109() {
         this.memoizedIsInitialized = -1;
         this.logData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarAttackLogNotify_10109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarAttackLogNotify_10109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.logData_ = input.readBytes();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAttackLogNotify_10109.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasLogData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getLogData() {
         return this.logData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLogData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.logData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.logData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarAttackLogNotify_10109)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarAttackLogNotify_10109 other = (CR2S_UnionWarAttackLogNotify_10109)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasLogData() != other.hasLogData()) {
               return false;
            } else if (this.hasLogData() && !this.getLogData().equals(other.getLogData())) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasLogData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLogData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogNotify_10109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogNotify_10109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogNotify_10109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarAttackLogNotify_10109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarAttackLogNotify_10109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarAttackLogNotify_10109> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarAttackLogNotify_10109> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarAttackLogNotify_10109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarAttackLogNotify_10109OrBuilder {
         private int bitField0_;
         private int unionId_;
         private ByteString logData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAttackLogNotify_10109.class, Builder.class);
         }

         private Builder() {
            this.logData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.logData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.logData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogNotify_10109_descriptor;
         }

         public CR2S_UnionWarAttackLogNotify_10109 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109.getDefaultInstance();
         }

         public CR2S_UnionWarAttackLogNotify_10109 build() {
            CR2S_UnionWarAttackLogNotify_10109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarAttackLogNotify_10109 buildPartial() {
            CR2S_UnionWarAttackLogNotify_10109 result = new CR2S_UnionWarAttackLogNotify_10109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.logData_ = this.logData_;
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
            if (other instanceof CR2S_UnionWarAttackLogNotify_10109) {
               return this.mergeFrom((CR2S_UnionWarAttackLogNotify_10109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarAttackLogNotify_10109 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasLogData()) {
                  this.setLogData(other.getLogData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionId()) {
               return false;
            } else {
               return this.hasLogData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarAttackLogNotify_10109 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarAttackLogNotify_10109)CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarAttackLogNotify_10109)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLogData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getLogData() {
            return this.logData_;
         }

         public Builder setLogData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.logData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLogData() {
            this.bitField0_ &= -3;
            this.logData_ = CrossUnionWarMsg.CR2S_UnionWarAttackLogNotify_10109.getDefaultInstance().getLogData();
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

   public static final class S2CR_UnionWarAttackLogList_10110 extends GeneratedMessageV3 implements S2CR_UnionWarAttackLogList_10110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarAttackLogList_10110 DEFAULT_INSTANCE = new S2CR_UnionWarAttackLogList_10110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarAttackLogList_10110> PARSER = new AbstractParser<S2CR_UnionWarAttackLogList_10110>() {
         public S2CR_UnionWarAttackLogList_10110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarAttackLogList_10110(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarAttackLogList_10110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarAttackLogList_10110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarAttackLogList_10110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarAttackLogList_10110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarAttackLogList_10110.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarAttackLogList_10110)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarAttackLogList_10110 other = (S2CR_UnionWarAttackLogList_10110)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarAttackLogList_10110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarAttackLogList_10110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarAttackLogList_10110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarAttackLogList_10110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarAttackLogList_10110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarAttackLogList_10110> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarAttackLogList_10110> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarAttackLogList_10110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarAttackLogList_10110OrBuilder {
         private int bitField0_;
         private int unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarAttackLogList_10110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarAttackLogList_10110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarAttackLogList_10110_descriptor;
         }

         public S2CR_UnionWarAttackLogList_10110 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarAttackLogList_10110.getDefaultInstance();
         }

         public S2CR_UnionWarAttackLogList_10110 build() {
            S2CR_UnionWarAttackLogList_10110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarAttackLogList_10110 buildPartial() {
            S2CR_UnionWarAttackLogList_10110 result = new S2CR_UnionWarAttackLogList_10110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
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
            if (other instanceof S2CR_UnionWarAttackLogList_10110) {
               return this.mergeFrom((S2CR_UnionWarAttackLogList_10110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarAttackLogList_10110 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarAttackLogList_10110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasUnionId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarAttackLogList_10110 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarAttackLogList_10110)CrossUnionWarMsg.S2CR_UnionWarAttackLogList_10110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarAttackLogList_10110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
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

   public static final class CR2S_UnionWarAttackLogList_10111 extends GeneratedMessageV3 implements CR2S_UnionWarAttackLogList_10111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int LOGSDATA_FIELD_NUMBER = 2;
      private List<ByteString> logsData_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarAttackLogList_10111 DEFAULT_INSTANCE = new CR2S_UnionWarAttackLogList_10111();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarAttackLogList_10111> PARSER = new AbstractParser<CR2S_UnionWarAttackLogList_10111>() {
         public CR2S_UnionWarAttackLogList_10111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarAttackLogList_10111(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarAttackLogList_10111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarAttackLogList_10111() {
         this.memoizedIsInitialized = -1;
         this.logsData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarAttackLogList_10111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarAttackLogList_10111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.logsData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.logsData_.add(input.readBytes());
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
                  this.logsData_ = Collections.unmodifiableList(this.logsData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAttackLogList_10111.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public List<ByteString> getLogsDataList() {
         return this.logsData_;
      }

      public int getLogsDataCount() {
         return this.logsData_.size();
      }

      public ByteString getLogsData(int index) {
         return (ByteString)this.logsData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
         }

         for(int i = 0; i < this.logsData_.size(); ++i) {
            output.writeBytes(2, (ByteString)this.logsData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.logsData_.size(); ++i) {
               dataSize += CodedOutputStream.computeBytesSizeNoTag((ByteString)this.logsData_.get(i));
            }

            size += dataSize;
            size += 1 * this.getLogsDataList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarAttackLogList_10111)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarAttackLogList_10111 other = (CR2S_UnionWarAttackLogList_10111)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (!this.getLogsDataList().equals(other.getLogsDataList())) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.getLogsDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLogsDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarAttackLogList_10111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarAttackLogList_10111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarAttackLogList_10111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarAttackLogList_10111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarAttackLogList_10111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarAttackLogList_10111> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarAttackLogList_10111> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarAttackLogList_10111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarAttackLogList_10111OrBuilder {
         private int bitField0_;
         private int unionId_;
         private List<ByteString> logsData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarAttackLogList_10111.class, Builder.class);
         }

         private Builder() {
            this.logsData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.logsData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarAttackLogList_10111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.logsData_ = Collections.emptyList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarAttackLogList_10111_descriptor;
         }

         public CR2S_UnionWarAttackLogList_10111 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarAttackLogList_10111.getDefaultInstance();
         }

         public CR2S_UnionWarAttackLogList_10111 build() {
            CR2S_UnionWarAttackLogList_10111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarAttackLogList_10111 buildPartial() {
            CR2S_UnionWarAttackLogList_10111 result = new CR2S_UnionWarAttackLogList_10111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.logsData_ = Collections.unmodifiableList(this.logsData_);
               this.bitField0_ &= -3;
            }

            result.logsData_ = this.logsData_;
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
            if (other instanceof CR2S_UnionWarAttackLogList_10111) {
               return this.mergeFrom((CR2S_UnionWarAttackLogList_10111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarAttackLogList_10111 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarAttackLogList_10111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (!other.logsData_.isEmpty()) {
                  if (this.logsData_.isEmpty()) {
                     this.logsData_ = other.logsData_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureLogsDataIsMutable();
                     this.logsData_.addAll(other.logsData_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasUnionId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarAttackLogList_10111 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarAttackLogList_10111)CrossUnionWarMsg.CR2S_UnionWarAttackLogList_10111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarAttackLogList_10111)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureLogsDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.logsData_ = new ArrayList(this.logsData_);
               this.bitField0_ |= 2;
            }

         }

         public List<ByteString> getLogsDataList() {
            return (this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.logsData_) : this.logsData_;
         }

         public int getLogsDataCount() {
            return this.logsData_.size();
         }

         public ByteString getLogsData(int index) {
            return (ByteString)this.logsData_.get(index);
         }

         public Builder setLogsData(int index, ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureLogsDataIsMutable();
               this.logsData_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addLogsData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureLogsDataIsMutable();
               this.logsData_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllLogsData(Iterable<? extends ByteString> values) {
            this.ensureLogsDataIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.logsData_);
            this.onChanged();
            return this;
         }

         public Builder clearLogsData() {
            this.logsData_ = Collections.emptyList();
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

   public static final class S2CR_UnionWarBattle_10112 extends GeneratedMessageV3 implements S2CR_UnionWarBattle_10112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEMSG_FIELD_NUMBER = 1;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionWarBattle_10112 DEFAULT_INSTANCE = new S2CR_UnionWarBattle_10112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionWarBattle_10112> PARSER = new AbstractParser<S2CR_UnionWarBattle_10112>() {
         public S2CR_UnionWarBattle_10112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionWarBattle_10112(input, extensionRegistry);
         }
      };

      private S2CR_UnionWarBattle_10112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionWarBattle_10112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionWarBattle_10112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionWarBattle_10112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarBattle_10112.class, Builder.class);
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBattleMsg());
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionWarBattle_10112)) {
            return super.equals(obj);
         } else {
            S2CR_UnionWarBattle_10112 other = (S2CR_UnionWarBattle_10112)obj;
            if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
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
            if (this.hasBattleMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionWarBattle_10112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarBattle_10112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarBattle_10112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionWarBattle_10112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionWarBattle_10112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionWarBattle_10112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionWarBattle_10112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionWarBattle_10112> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionWarBattle_10112> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionWarBattle_10112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionWarBattle_10112OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionWarBattle_10112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.S2CR_UnionWarBattle_10112.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_S2CR_UnionWarBattle_10112_descriptor;
         }

         public S2CR_UnionWarBattle_10112 getDefaultInstanceForType() {
            return CrossUnionWarMsg.S2CR_UnionWarBattle_10112.getDefaultInstance();
         }

         public S2CR_UnionWarBattle_10112 build() {
            S2CR_UnionWarBattle_10112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionWarBattle_10112 buildPartial() {
            S2CR_UnionWarBattle_10112 result = new S2CR_UnionWarBattle_10112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

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
            if (other instanceof S2CR_UnionWarBattle_10112) {
               return this.mergeFrom((S2CR_UnionWarBattle_10112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionWarBattle_10112 other) {
            if (other == CrossUnionWarMsg.S2CR_UnionWarBattle_10112.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionWarBattle_10112 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionWarBattle_10112)CrossUnionWarMsg.S2CR_UnionWarBattle_10112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionWarBattle_10112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 1) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnionWarBattle_10113 extends GeneratedMessageV3 implements CR2S_UnionWarBattle_10113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEMSG_FIELD_NUMBER = 1;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarBattle_10113 DEFAULT_INSTANCE = new CR2S_UnionWarBattle_10113();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarBattle_10113> PARSER = new AbstractParser<CR2S_UnionWarBattle_10113>() {
         public CR2S_UnionWarBattle_10113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarBattle_10113(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarBattle_10113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarBattle_10113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarBattle_10113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarBattle_10113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarBattle_10113.class, Builder.class);
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBattleMsg());
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarBattle_10113)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarBattle_10113 other = (CR2S_UnionWarBattle_10113)obj;
            if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
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
            if (this.hasBattleMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarBattle_10113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarBattle_10113 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarBattle_10113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarBattle_10113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarBattle_10113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarBattle_10113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarBattle_10113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarBattle_10113> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarBattle_10113> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarBattle_10113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarBattle_10113OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarBattle_10113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarBattle_10113.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarBattle_10113_descriptor;
         }

         public CR2S_UnionWarBattle_10113 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarBattle_10113.getDefaultInstance();
         }

         public CR2S_UnionWarBattle_10113 build() {
            CR2S_UnionWarBattle_10113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarBattle_10113 buildPartial() {
            CR2S_UnionWarBattle_10113 result = new CR2S_UnionWarBattle_10113(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

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
            if (other instanceof CR2S_UnionWarBattle_10113) {
               return this.mergeFrom((CR2S_UnionWarBattle_10113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarBattle_10113 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarBattle_10113.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarBattle_10113 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarBattle_10113)CrossUnionWarMsg.CR2S_UnionWarBattle_10113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarBattle_10113)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 1) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnionWarServerMove_10114 extends GeneratedMessageV3 implements CR2S_UnionWarServerMove_10114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int UNIONID_FIELD_NUMBER = 2;
      private int unionId_;
      public static final int MEMBERID_FIELD_NUMBER = 3;
      private Internal.IntList memberId_;
      public static final int ISMERGE_FIELD_NUMBER = 4;
      private boolean isMerge_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarServerMove_10114 DEFAULT_INSTANCE = new CR2S_UnionWarServerMove_10114();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarServerMove_10114> PARSER = new AbstractParser<CR2S_UnionWarServerMove_10114>() {
         public CR2S_UnionWarServerMove_10114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarServerMove_10114(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarServerMove_10114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarServerMove_10114() {
         this.memoizedIsInitialized = -1;
         this.memberId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarServerMove_10114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarServerMove_10114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.unionId_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.memberId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.memberId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.memberId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.isMerge_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.memberId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.memberId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarServerMove_10114.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public List<Integer> getMemberIdList() {
         return this.memberId_;
      }

      public int getMemberIdCount() {
         return this.memberId_.size();
      }

      public int getMemberId(int index) {
         return this.memberId_.getInt(index);
      }

      public boolean hasIsMerge() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsMerge() {
         return this.isMerge_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsMerge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unionId_);
         }

         for(int i = 0; i < this.memberId_.size(); ++i) {
            output.writeInt32(3, this.memberId_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.isMerge_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.unionId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.memberId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.memberId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMemberIdList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isMerge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarServerMove_10114)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarServerMove_10114 other = (CR2S_UnionWarServerMove_10114)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (!this.getMemberIdList().equals(other.getMemberIdList())) {
               return false;
            } else if (this.hasIsMerge() != other.hasIsMerge()) {
               return false;
            } else if (this.hasIsMerge() && this.getIsMerge() != other.getIsMerge()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.getMemberIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMemberIdList().hashCode();
            }

            if (this.hasIsMerge()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsMerge());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarServerMove_10114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarServerMove_10114 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarServerMove_10114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarServerMove_10114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarServerMove_10114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarServerMove_10114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarServerMove_10114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarServerMove_10114> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarServerMove_10114> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarServerMove_10114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarServerMove_10114OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int unionId_;
         private Internal.IntList memberId_;
         private boolean isMerge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarServerMove_10114.class, Builder.class);
         }

         private Builder() {
            this.memberId_ = CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.memberId_ = CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.bitField0_ &= -3;
            this.memberId_ = CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.emptyIntList();
            this.bitField0_ &= -5;
            this.isMerge_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarServerMove_10114_descriptor;
         }

         public CR2S_UnionWarServerMove_10114 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.getDefaultInstance();
         }

         public CR2S_UnionWarServerMove_10114 build() {
            CR2S_UnionWarServerMove_10114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarServerMove_10114 buildPartial() {
            CR2S_UnionWarServerMove_10114 result = new CR2S_UnionWarServerMove_10114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.memberId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.memberId_ = this.memberId_;
            if ((from_bitField0_ & 8) != 0) {
               result.isMerge_ = this.isMerge_;
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
            if (other instanceof CR2S_UnionWarServerMove_10114) {
               return this.mergeFrom((CR2S_UnionWarServerMove_10114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarServerMove_10114 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (!other.memberId_.isEmpty()) {
                  if (this.memberId_.isEmpty()) {
                     this.memberId_ = other.memberId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureMemberIdIsMutable();
                     this.memberId_.addAll(other.memberId_);
                  }

                  this.onChanged();
               }

               if (other.hasIsMerge()) {
                  this.setIsMerge(other.getIsMerge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasUnionId()) {
               return false;
            } else {
               return this.hasIsMerge();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarServerMove_10114 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarServerMove_10114)CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarServerMove_10114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 2;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -3;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMemberIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.memberId_ = CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.mutableCopy(this.memberId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getMemberIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.memberId_) : this.memberId_);
         }

         public int getMemberIdCount() {
            return this.memberId_.size();
         }

         public int getMemberId(int index) {
            return this.memberId_.getInt(index);
         }

         public Builder setMemberId(int index, int value) {
            this.ensureMemberIdIsMutable();
            this.memberId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMemberId(int value) {
            this.ensureMemberIdIsMutable();
            this.memberId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMemberId(Iterable<? extends Integer> values) {
            this.ensureMemberIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.memberId_);
            this.onChanged();
            return this;
         }

         public Builder clearMemberId() {
            this.memberId_ = CrossUnionWarMsg.CR2S_UnionWarServerMove_10114.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasIsMerge() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsMerge() {
            return this.isMerge_;
         }

         public Builder setIsMerge(boolean value) {
            this.bitField0_ |= 8;
            this.isMerge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMerge() {
            this.bitField0_ &= -9;
            this.isMerge_ = false;
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

   public static final class CR2S_UnionWarStarChange_10115 extends GeneratedMessageV3 implements CR2S_UnionWarStarChange_10115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int HOLDPOS_FIELD_NUMBER = 2;
      private int holdPos_;
      public static final int MAXSTAR_FIELD_NUMBER = 3;
      private int maxStar_;
      public static final int TOTALSTAR_FIELD_NUMBER = 4;
      private int totalStar_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarStarChange_10115 DEFAULT_INSTANCE = new CR2S_UnionWarStarChange_10115();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarStarChange_10115> PARSER = new AbstractParser<CR2S_UnionWarStarChange_10115>() {
         public CR2S_UnionWarStarChange_10115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarStarChange_10115(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarStarChange_10115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarStarChange_10115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarStarChange_10115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarStarChange_10115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.holdPos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxStar_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.totalStar_ = input.readInt32();
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
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStarChange_10115.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasHoldPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHoldPos() {
         return this.holdPos_;
      }

      public boolean hasMaxStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxStar() {
         return this.maxStar_;
      }

      public boolean hasTotalStar() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalStar() {
         return this.totalStar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHoldPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.holdPos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.maxStar_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.totalStar_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.holdPos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxStar_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalStar_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarStarChange_10115)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarStarChange_10115 other = (CR2S_UnionWarStarChange_10115)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasHoldPos() != other.hasHoldPos()) {
               return false;
            } else if (this.hasHoldPos() && this.getHoldPos() != other.getHoldPos()) {
               return false;
            } else if (this.hasMaxStar() != other.hasMaxStar()) {
               return false;
            } else if (this.hasMaxStar() && this.getMaxStar() != other.getMaxStar()) {
               return false;
            } else if (this.hasTotalStar() != other.hasTotalStar()) {
               return false;
            } else if (this.hasTotalStar() && this.getTotalStar() != other.getTotalStar()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasHoldPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHoldPos();
            }

            if (this.hasMaxStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxStar();
            }

            if (this.hasTotalStar()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarStarChange_10115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStarChange_10115 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStarChange_10115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarStarChange_10115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarStarChange_10115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarStarChange_10115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarStarChange_10115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarStarChange_10115> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarStarChange_10115> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarStarChange_10115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarStarChange_10115OrBuilder {
         private int bitField0_;
         private int unionId_;
         private int holdPos_;
         private int maxStar_;
         private int totalStar_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarStarChange_10115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionWarMsg.CR2S_UnionWarStarChange_10115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.holdPos_ = 0;
            this.bitField0_ &= -3;
            this.maxStar_ = 0;
            this.bitField0_ &= -5;
            this.totalStar_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionWarMsg.internal_static_cross_unionWar_CR2S_UnionWarStarChange_10115_descriptor;
         }

         public CR2S_UnionWarStarChange_10115 getDefaultInstanceForType() {
            return CrossUnionWarMsg.CR2S_UnionWarStarChange_10115.getDefaultInstance();
         }

         public CR2S_UnionWarStarChange_10115 build() {
            CR2S_UnionWarStarChange_10115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarStarChange_10115 buildPartial() {
            CR2S_UnionWarStarChange_10115 result = new CR2S_UnionWarStarChange_10115(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.holdPos_ = this.holdPos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxStar_ = this.maxStar_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalStar_ = this.totalStar_;
               to_bitField0_ |= 8;
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
            if (other instanceof CR2S_UnionWarStarChange_10115) {
               return this.mergeFrom((CR2S_UnionWarStarChange_10115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarStarChange_10115 other) {
            if (other == CrossUnionWarMsg.CR2S_UnionWarStarChange_10115.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasHoldPos()) {
                  this.setHoldPos(other.getHoldPos());
               }

               if (other.hasMaxStar()) {
                  this.setMaxStar(other.getMaxStar());
               }

               if (other.hasTotalStar()) {
                  this.setTotalStar(other.getTotalStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionId()) {
               return false;
            } else if (!this.hasHoldPos()) {
               return false;
            } else if (!this.hasMaxStar()) {
               return false;
            } else {
               return this.hasTotalStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionWarStarChange_10115 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarStarChange_10115)CrossUnionWarMsg.CR2S_UnionWarStarChange_10115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarStarChange_10115)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHoldPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHoldPos() {
            return this.holdPos_;
         }

         public Builder setHoldPos(int value) {
            this.bitField0_ |= 2;
            this.holdPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHoldPos() {
            this.bitField0_ &= -3;
            this.holdPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxStar() {
            return this.maxStar_;
         }

         public Builder setMaxStar(int value) {
            this.bitField0_ |= 4;
            this.maxStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxStar() {
            this.bitField0_ &= -5;
            this.maxStar_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalStar() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalStar() {
            return this.totalStar_;
         }

         public Builder setTotalStar(int value) {
            this.bitField0_ |= 8;
            this.totalStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalStar() {
            this.bitField0_ &= -9;
            this.totalStar_ = 0;
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

   public interface CR2S_UnionWarAgainstList_10103OrBuilder extends MessageOrBuilder {
      List<ByteString> getAgainstListList();

      int getAgainstListCount();

      ByteString getAgainstList(int index);
   }

   public interface CR2S_UnionWarAttackLogList_10111OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      List<ByteString> getLogsDataList();

      int getLogsDataCount();

      ByteString getLogsData(int index);
   }

   public interface CR2S_UnionWarAttackLogNotify_10109OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      boolean hasLogData();

      ByteString getLogData();
   }

   public interface CR2S_UnionWarBattle_10113OrBuilder extends MessageOrBuilder {
      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface CR2S_UnionWarServerMove_10114OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasUnionId();

      int getUnionId();

      List<Integer> getMemberIdList();

      int getMemberIdCount();

      int getMemberId(int index);

      boolean hasIsMerge();

      boolean getIsMerge();
   }

   public interface CR2S_UnionWarStarChange_10115OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      boolean hasHoldPos();

      int getHoldPos();

      boolean hasMaxStar();

      int getMaxStar();

      boolean hasTotalStar();

      int getTotalStar();
   }

   public interface CR2S_UnionWarStatusChange_10107OrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      int getStatus();

      boolean hasUpdateTime();

      int getUpdateTime();
   }

   public interface CR2S_UnionWarStrongholdList_10105OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      List<WarStrongholdData> getStrongholdListList();

      WarStrongholdData getStrongholdList(int index);

      int getStrongholdListCount();

      List<? extends WarStrongholdDataOrBuilder> getStrongholdListOrBuilderList();

      WarStrongholdDataOrBuilder getStrongholdListOrBuilder(int index);
   }

   public interface S2CR_UnionWarAttackLogList_10110OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();
   }

   public interface S2CR_UnionWarAttackLogUpload_10108OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      boolean hasLogData();

      ByteString getLogData();
   }

   public interface S2CR_UnionWarBattle_10112OrBuilder extends MessageOrBuilder {
      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface S2CR_UnionWarServerInit_10102OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_UnionWarSign_10101OrBuilder extends MessageOrBuilder {
      boolean hasUnion();

      ByteString getUnion();
   }

   public interface S2CR_UnionWarStatusChange_10106OrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      int getStatus();
   }

   public interface S2CR_UnionWarStrongholdList_10104OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();
   }

   public interface WarAgainstDataOrBuilder extends MessageOrBuilder {
   }

   public interface WarStrongholdDataOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasStronghold();

      ByteString getStronghold();
   }
}
