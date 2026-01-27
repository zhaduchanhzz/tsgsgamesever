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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CrossDragonTeamMsg {
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossDragonTeamMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015CrossDragonTeam.proto\u0012!crossDragonTeam.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fBattle.proto\";\n\u0016S2S_BattleSettle_19101\u0012\u0013\n\u000bdragonStage\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0002 \u0002(\u0005\"]\n\u001aS2S_BattleSaveRecord_19102\u0012?\n\u0006result\u0018\u0003 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"o\n\u0018S2S_SendDragonInfo_19103\u0012A\n\ndragonInfo\u0018\u0001 \u0002(\u000b2-.crossDragonTeam.com.gzbz.protobuf.DragonInfo\u0012\u0010\n\barraying\u0018\u0002 \u0001(\f\"D\n\nDragonInfo\u0012\u0013\n\u000bdragonStage\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006passed\u0018\u0002 \u0002(\b\u0012\u0011\n\tbattleNum\u0018\u0003 \u0002(\u0005\"\u001b\n\u0019S2S_UpdateBattleNum_19104\"\u0017\n\u0015S2S_SweepBattle_19105\"\u0018\n\u0016S2S_PlayerLogout_19106\".\n\u0019S2S_NotifyOpenCross_19107\u0012\u0011\n\topenCross\u0018\u0001 \u0002(\b\"\u001d\n\u001bS2S_ResponseOpenCross_19108\"\u0018\n\u0016S2S_AskOpenCross_19120\"\u001d\n\fS2S_Gm_19109\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005B)\n\u0011com.gzbz.protobufB\u0012CrossDragonTeamMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor, new String[]{"DragonStage", "Time"});
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor, new String[]{"Result"});
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor, new String[]{"DragonInfo", "Arraying"});
      internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor, new String[]{"DragonStage", "Passed", "BattleNum"});
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor, new String[0]);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor, new String[0]);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor, new String[0]);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor, new String[]{"OpenCross"});
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor, new String[0]);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor, new String[0]);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor, new String[]{"State"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class S2S_BattleSettle_19101 extends GeneratedMessageV3 implements S2S_BattleSettle_19101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAGONSTAGE_FIELD_NUMBER = 1;
      private int dragonStage_;
      public static final int TIME_FIELD_NUMBER = 2;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2S_BattleSettle_19101 DEFAULT_INSTANCE = new S2S_BattleSettle_19101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_BattleSettle_19101> PARSER = new AbstractParser<S2S_BattleSettle_19101>() {
         public S2S_BattleSettle_19101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_BattleSettle_19101(input, extensionRegistry);
         }
      };

      private S2S_BattleSettle_19101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_BattleSettle_19101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_BattleSettle_19101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_BattleSettle_19101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dragonStage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.time_ = input.readInt32();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleSettle_19101.class, Builder.class);
      }

      public boolean hasDragonStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDragonStage() {
         return this.dragonStage_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dragonStage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.time_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dragonStage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_BattleSettle_19101)) {
            return super.equals(obj);
         } else {
            S2S_BattleSettle_19101 other = (S2S_BattleSettle_19101)obj;
            if (this.hasDragonStage() != other.hasDragonStage()) {
               return false;
            } else if (this.hasDragonStage() && this.getDragonStage() != other.getDragonStage()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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
            if (this.hasDragonStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDragonStage();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_BattleSettle_19101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data);
      }

      public static S2S_BattleSettle_19101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSettle_19101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data);
      }

      public static S2S_BattleSettle_19101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSettle_19101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data);
      }

      public static S2S_BattleSettle_19101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSettle_19101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSettle_19101 parseFrom(InputStream input) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleSettle_19101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleSettle_19101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_BattleSettle_19101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleSettle_19101 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleSettle_19101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSettle_19101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_BattleSettle_19101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_BattleSettle_19101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_BattleSettle_19101> parser() {
         return PARSER;
      }

      public Parser<S2S_BattleSettle_19101> getParserForType() {
         return PARSER;
      }

      public S2S_BattleSettle_19101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_BattleSettle_19101OrBuilder {
         private int bitField0_;
         private int dragonStage_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleSettle_19101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_BattleSettle_19101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dragonStage_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSettle_19101_descriptor;
         }

         public S2S_BattleSettle_19101 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_BattleSettle_19101.getDefaultInstance();
         }

         public S2S_BattleSettle_19101 build() {
            S2S_BattleSettle_19101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_BattleSettle_19101 buildPartial() {
            S2S_BattleSettle_19101 result = new S2S_BattleSettle_19101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dragonStage_ = this.dragonStage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2S_BattleSettle_19101) {
               return this.mergeFrom((S2S_BattleSettle_19101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_BattleSettle_19101 other) {
            if (other == CrossDragonTeamMsg.S2S_BattleSettle_19101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDragonStage()) {
                  this.setDragonStage(other.getDragonStage());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonStage()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_BattleSettle_19101 parsedMessage = null;

            try {
               parsedMessage = (S2S_BattleSettle_19101)CrossDragonTeamMsg.S2S_BattleSettle_19101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_BattleSettle_19101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDragonStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDragonStage() {
            return this.dragonStage_;
         }

         public Builder setDragonStage(int value) {
            this.bitField0_ |= 1;
            this.dragonStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonStage() {
            this.bitField0_ &= -2;
            this.dragonStage_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_BattleSaveRecord_19102 extends GeneratedMessageV3 implements S2S_BattleSaveRecord_19102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final S2S_BattleSaveRecord_19102 DEFAULT_INSTANCE = new S2S_BattleSaveRecord_19102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_BattleSaveRecord_19102> PARSER = new AbstractParser<S2S_BattleSaveRecord_19102>() {
         public S2S_BattleSaveRecord_19102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_BattleSaveRecord_19102(input, extensionRegistry);
         }
      };

      private S2S_BattleSaveRecord_19102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_BattleSaveRecord_19102() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_BattleSaveRecord_19102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_BattleSaveRecord_19102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleSaveRecord_19102.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
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
         } else if (!this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(3, this.getResult());
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
               size += CodedOutputStream.computeMessageSize(3, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_BattleSaveRecord_19102)) {
            return super.equals(obj);
         } else {
            S2S_BattleSaveRecord_19102 other = (S2S_BattleSaveRecord_19102)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
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
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BattleSaveRecord_19102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(InputStream input) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleSaveRecord_19102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_BattleSaveRecord_19102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BattleSaveRecord_19102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BattleSaveRecord_19102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_BattleSaveRecord_19102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_BattleSaveRecord_19102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_BattleSaveRecord_19102> parser() {
         return PARSER;
      }

      public Parser<S2S_BattleSaveRecord_19102> getParserForType() {
         return PARSER;
      }

      public S2S_BattleSaveRecord_19102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_BattleSaveRecord_19102OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BattleSaveRecord_19102.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_BattleSaveRecord_19102.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_BattleSaveRecord_19102_descriptor;
         }

         public S2S_BattleSaveRecord_19102 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_BattleSaveRecord_19102.getDefaultInstance();
         }

         public S2S_BattleSaveRecord_19102 build() {
            S2S_BattleSaveRecord_19102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_BattleSaveRecord_19102 buildPartial() {
            S2S_BattleSaveRecord_19102 result = new S2S_BattleSaveRecord_19102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
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
            if (other instanceof S2S_BattleSaveRecord_19102) {
               return this.mergeFrom((S2S_BattleSaveRecord_19102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_BattleSaveRecord_19102 other) {
            if (other == CrossDragonTeamMsg.S2S_BattleSaveRecord_19102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_BattleSaveRecord_19102 parsedMessage = null;

            try {
               parsedMessage = (S2S_BattleSaveRecord_19102)CrossDragonTeamMsg.S2S_BattleSaveRecord_19102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_BattleSaveRecord_19102)e.getUnfinishedMessage();
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

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_SendDragonInfo_19103 extends GeneratedMessageV3 implements S2S_SendDragonInfo_19103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAGONINFO_FIELD_NUMBER = 1;
      private DragonInfo dragonInfo_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2S_SendDragonInfo_19103 DEFAULT_INSTANCE = new S2S_SendDragonInfo_19103();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SendDragonInfo_19103> PARSER = new AbstractParser<S2S_SendDragonInfo_19103>() {
         public S2S_SendDragonInfo_19103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SendDragonInfo_19103(input, extensionRegistry);
         }
      };

      private S2S_SendDragonInfo_19103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SendDragonInfo_19103() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SendDragonInfo_19103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SendDragonInfo_19103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DragonInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.dragonInfo_.toBuilder();
                        }

                        this.dragonInfo_ = (DragonInfo)input.readMessage(CrossDragonTeamMsg.DragonInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.dragonInfo_);
                           this.dragonInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.arraying_ = input.readBytes();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendDragonInfo_19103.class, Builder.class);
      }

      public boolean hasDragonInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DragonInfo getDragonInfo() {
         return this.dragonInfo_ == null ? CrossDragonTeamMsg.DragonInfo.getDefaultInstance() : this.dragonInfo_;
      }

      public DragonInfoOrBuilder getDragonInfoOrBuilder() {
         return this.dragonInfo_ == null ? CrossDragonTeamMsg.DragonInfo.getDefaultInstance() : this.dragonInfo_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getDragonInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getDragonInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.arraying_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getDragonInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.arraying_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_SendDragonInfo_19103)) {
            return super.equals(obj);
         } else {
            S2S_SendDragonInfo_19103 other = (S2S_SendDragonInfo_19103)obj;
            if (this.hasDragonInfo() != other.hasDragonInfo()) {
               return false;
            } else if (this.hasDragonInfo() && !this.getDragonInfo().equals(other.getDragonInfo())) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
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
            if (this.hasDragonInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDragonInfo().hashCode();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_SendDragonInfo_19103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendDragonInfo_19103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(InputStream input) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendDragonInfo_19103 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SendDragonInfo_19103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendDragonInfo_19103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendDragonInfo_19103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SendDragonInfo_19103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SendDragonInfo_19103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SendDragonInfo_19103> parser() {
         return PARSER;
      }

      public Parser<S2S_SendDragonInfo_19103> getParserForType() {
         return PARSER;
      }

      public S2S_SendDragonInfo_19103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SendDragonInfo_19103OrBuilder {
         private int bitField0_;
         private DragonInfo dragonInfo_;
         private SingleFieldBuilderV3<DragonInfo, DragonInfo.Builder, DragonInfoOrBuilder> dragonInfoBuilder_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendDragonInfo_19103.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_SendDragonInfo_19103.alwaysUseFieldBuilders) {
               this.getDragonInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dragonInfoBuilder_ == null) {
               this.dragonInfo_ = null;
            } else {
               this.dragonInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SendDragonInfo_19103_descriptor;
         }

         public S2S_SendDragonInfo_19103 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_SendDragonInfo_19103.getDefaultInstance();
         }

         public S2S_SendDragonInfo_19103 build() {
            S2S_SendDragonInfo_19103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SendDragonInfo_19103 buildPartial() {
            S2S_SendDragonInfo_19103 result = new S2S_SendDragonInfo_19103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.dragonInfoBuilder_ == null) {
                  result.dragonInfo_ = this.dragonInfo_;
               } else {
                  result.dragonInfo_ = (DragonInfo)this.dragonInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arraying_ = this.arraying_;
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
            if (other instanceof S2S_SendDragonInfo_19103) {
               return this.mergeFrom((S2S_SendDragonInfo_19103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SendDragonInfo_19103 other) {
            if (other == CrossDragonTeamMsg.S2S_SendDragonInfo_19103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDragonInfo()) {
                  this.mergeDragonInfo(other.getDragonInfo());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonInfo()) {
               return false;
            } else {
               return this.getDragonInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_SendDragonInfo_19103 parsedMessage = null;

            try {
               parsedMessage = (S2S_SendDragonInfo_19103)CrossDragonTeamMsg.S2S_SendDragonInfo_19103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SendDragonInfo_19103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDragonInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public DragonInfo getDragonInfo() {
            if (this.dragonInfoBuilder_ == null) {
               return this.dragonInfo_ == null ? CrossDragonTeamMsg.DragonInfo.getDefaultInstance() : this.dragonInfo_;
            } else {
               return (DragonInfo)this.dragonInfoBuilder_.getMessage();
            }
         }

         public Builder setDragonInfo(DragonInfo value) {
            if (this.dragonInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.dragonInfo_ = value;
               this.onChanged();
            } else {
               this.dragonInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setDragonInfo(DragonInfo.Builder builderForValue) {
            if (this.dragonInfoBuilder_ == null) {
               this.dragonInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.dragonInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeDragonInfo(DragonInfo value) {
            if (this.dragonInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.dragonInfo_ != null && this.dragonInfo_ != CrossDragonTeamMsg.DragonInfo.getDefaultInstance()) {
                  this.dragonInfo_ = CrossDragonTeamMsg.DragonInfo.newBuilder(this.dragonInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.dragonInfo_ = value;
               }

               this.onChanged();
            } else {
               this.dragonInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearDragonInfo() {
            if (this.dragonInfoBuilder_ == null) {
               this.dragonInfo_ = null;
               this.onChanged();
            } else {
               this.dragonInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DragonInfo.Builder getDragonInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DragonInfo.Builder)this.getDragonInfoFieldBuilder().getBuilder();
         }

         public DragonInfoOrBuilder getDragonInfoOrBuilder() {
            if (this.dragonInfoBuilder_ != null) {
               return (DragonInfoOrBuilder)this.dragonInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.dragonInfo_ == null ? CrossDragonTeamMsg.DragonInfo.getDefaultInstance() : this.dragonInfo_;
            }
         }

         private SingleFieldBuilderV3<DragonInfo, DragonInfo.Builder, DragonInfoOrBuilder> getDragonInfoFieldBuilder() {
            if (this.dragonInfoBuilder_ == null) {
               this.dragonInfoBuilder_ = new SingleFieldBuilderV3(this.getDragonInfo(), this.getParentForChildren(), this.isClean());
               this.dragonInfo_ = null;
            }

            return this.dragonInfoBuilder_;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -3;
            this.arraying_ = CrossDragonTeamMsg.S2S_SendDragonInfo_19103.getDefaultInstance().getArraying();
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

   public static final class DragonInfo extends GeneratedMessageV3 implements DragonInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAGONSTAGE_FIELD_NUMBER = 1;
      private int dragonStage_;
      public static final int PASSED_FIELD_NUMBER = 2;
      private boolean passed_;
      public static final int BATTLENUM_FIELD_NUMBER = 3;
      private int battleNum_;
      private byte memoizedIsInitialized;
      private static final DragonInfo DEFAULT_INSTANCE = new DragonInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<DragonInfo> PARSER = new AbstractParser<DragonInfo>() {
         public DragonInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DragonInfo(input, extensionRegistry);
         }
      };

      private DragonInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DragonInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DragonInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DragonInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dragonStage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.passed_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.battleNum_ = input.readInt32();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DragonInfo.class, Builder.class);
      }

      public boolean hasDragonStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDragonStage() {
         return this.dragonStage_;
      }

      public boolean hasPassed() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getPassed() {
         return this.passed_;
      }

      public boolean hasBattleNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBattleNum() {
         return this.battleNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDragonStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassed()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dragonStage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.passed_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.battleNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dragonStage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.passed_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.battleNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DragonInfo)) {
            return super.equals(obj);
         } else {
            DragonInfo other = (DragonInfo)obj;
            if (this.hasDragonStage() != other.hasDragonStage()) {
               return false;
            } else if (this.hasDragonStage() && this.getDragonStage() != other.getDragonStage()) {
               return false;
            } else if (this.hasPassed() != other.hasPassed()) {
               return false;
            } else if (this.hasPassed() && this.getPassed() != other.getPassed()) {
               return false;
            } else if (this.hasBattleNum() != other.hasBattleNum()) {
               return false;
            } else if (this.hasBattleNum() && this.getBattleNum() != other.getBattleNum()) {
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
            if (this.hasDragonStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDragonStage();
            }

            if (this.hasPassed()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getPassed());
            }

            if (this.hasBattleNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBattleNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DragonInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data);
      }

      public static DragonInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DragonInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data);
      }

      public static DragonInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DragonInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data);
      }

      public static DragonInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DragonInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DragonInfo parseFrom(InputStream input) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DragonInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DragonInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DragonInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DragonInfo parseFrom(CodedInputStream input) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DragonInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DragonInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DragonInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DragonInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DragonInfo> parser() {
         return PARSER;
      }

      public Parser<DragonInfo> getParserForType() {
         return PARSER;
      }

      public DragonInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DragonInfoOrBuilder {
         private int bitField0_;
         private int dragonStage_;
         private boolean passed_;
         private int battleNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DragonInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.DragonInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dragonStage_ = 0;
            this.bitField0_ &= -2;
            this.passed_ = false;
            this.bitField0_ &= -3;
            this.battleNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_DragonInfo_descriptor;
         }

         public DragonInfo getDefaultInstanceForType() {
            return CrossDragonTeamMsg.DragonInfo.getDefaultInstance();
         }

         public DragonInfo build() {
            DragonInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DragonInfo buildPartial() {
            DragonInfo result = new DragonInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dragonStage_ = this.dragonStage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.passed_ = this.passed_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.battleNum_ = this.battleNum_;
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
            if (other instanceof DragonInfo) {
               return this.mergeFrom((DragonInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DragonInfo other) {
            if (other == CrossDragonTeamMsg.DragonInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDragonStage()) {
                  this.setDragonStage(other.getDragonStage());
               }

               if (other.hasPassed()) {
                  this.setPassed(other.getPassed());
               }

               if (other.hasBattleNum()) {
                  this.setBattleNum(other.getBattleNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDragonStage()) {
               return false;
            } else if (!this.hasPassed()) {
               return false;
            } else {
               return this.hasBattleNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DragonInfo parsedMessage = null;

            try {
               parsedMessage = (DragonInfo)CrossDragonTeamMsg.DragonInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DragonInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDragonStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDragonStage() {
            return this.dragonStage_;
         }

         public Builder setDragonStage(int value) {
            this.bitField0_ |= 1;
            this.dragonStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDragonStage() {
            this.bitField0_ &= -2;
            this.dragonStage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPassed() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getPassed() {
            return this.passed_;
         }

         public Builder setPassed(boolean value) {
            this.bitField0_ |= 2;
            this.passed_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassed() {
            this.bitField0_ &= -3;
            this.passed_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasBattleNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBattleNum() {
            return this.battleNum_;
         }

         public Builder setBattleNum(int value) {
            this.bitField0_ |= 4;
            this.battleNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleNum() {
            this.bitField0_ &= -5;
            this.battleNum_ = 0;
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

   public static final class S2S_UpdateBattleNum_19104 extends GeneratedMessageV3 implements S2S_UpdateBattleNum_19104OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_UpdateBattleNum_19104 DEFAULT_INSTANCE = new S2S_UpdateBattleNum_19104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_UpdateBattleNum_19104> PARSER = new AbstractParser<S2S_UpdateBattleNum_19104>() {
         public S2S_UpdateBattleNum_19104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_UpdateBattleNum_19104(input, extensionRegistry);
         }
      };

      private S2S_UpdateBattleNum_19104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_UpdateBattleNum_19104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_UpdateBattleNum_19104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_UpdateBattleNum_19104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateBattleNum_19104.class, Builder.class);
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
         } else if (!(obj instanceof S2S_UpdateBattleNum_19104)) {
            return super.equals(obj);
         } else {
            S2S_UpdateBattleNum_19104 other = (S2S_UpdateBattleNum_19104)obj;
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

      public static S2S_UpdateBattleNum_19104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateBattleNum_19104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(InputStream input) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateBattleNum_19104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_UpdateBattleNum_19104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateBattleNum_19104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateBattleNum_19104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_UpdateBattleNum_19104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_UpdateBattleNum_19104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_UpdateBattleNum_19104> parser() {
         return PARSER;
      }

      public Parser<S2S_UpdateBattleNum_19104> getParserForType() {
         return PARSER;
      }

      public S2S_UpdateBattleNum_19104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_UpdateBattleNum_19104OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateBattleNum_19104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_UpdateBattleNum_19104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_UpdateBattleNum_19104_descriptor;
         }

         public S2S_UpdateBattleNum_19104 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_UpdateBattleNum_19104.getDefaultInstance();
         }

         public S2S_UpdateBattleNum_19104 build() {
            S2S_UpdateBattleNum_19104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_UpdateBattleNum_19104 buildPartial() {
            S2S_UpdateBattleNum_19104 result = new S2S_UpdateBattleNum_19104(this);
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
            if (other instanceof S2S_UpdateBattleNum_19104) {
               return this.mergeFrom((S2S_UpdateBattleNum_19104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_UpdateBattleNum_19104 other) {
            if (other == CrossDragonTeamMsg.S2S_UpdateBattleNum_19104.getDefaultInstance()) {
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
            S2S_UpdateBattleNum_19104 parsedMessage = null;

            try {
               parsedMessage = (S2S_UpdateBattleNum_19104)CrossDragonTeamMsg.S2S_UpdateBattleNum_19104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_UpdateBattleNum_19104)e.getUnfinishedMessage();
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

   public static final class S2S_SweepBattle_19105 extends GeneratedMessageV3 implements S2S_SweepBattle_19105OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_SweepBattle_19105 DEFAULT_INSTANCE = new S2S_SweepBattle_19105();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SweepBattle_19105> PARSER = new AbstractParser<S2S_SweepBattle_19105>() {
         public S2S_SweepBattle_19105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SweepBattle_19105(input, extensionRegistry);
         }
      };

      private S2S_SweepBattle_19105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SweepBattle_19105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SweepBattle_19105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SweepBattle_19105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SweepBattle_19105.class, Builder.class);
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
         } else if (!(obj instanceof S2S_SweepBattle_19105)) {
            return super.equals(obj);
         } else {
            S2S_SweepBattle_19105 other = (S2S_SweepBattle_19105)obj;
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

      public static S2S_SweepBattle_19105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data);
      }

      public static S2S_SweepBattle_19105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SweepBattle_19105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data);
      }

      public static S2S_SweepBattle_19105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SweepBattle_19105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data);
      }

      public static S2S_SweepBattle_19105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SweepBattle_19105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SweepBattle_19105 parseFrom(InputStream input) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SweepBattle_19105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SweepBattle_19105 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SweepBattle_19105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SweepBattle_19105 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SweepBattle_19105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SweepBattle_19105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SweepBattle_19105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SweepBattle_19105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SweepBattle_19105> parser() {
         return PARSER;
      }

      public Parser<S2S_SweepBattle_19105> getParserForType() {
         return PARSER;
      }

      public S2S_SweepBattle_19105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SweepBattle_19105OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SweepBattle_19105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_SweepBattle_19105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_SweepBattle_19105_descriptor;
         }

         public S2S_SweepBattle_19105 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_SweepBattle_19105.getDefaultInstance();
         }

         public S2S_SweepBattle_19105 build() {
            S2S_SweepBattle_19105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SweepBattle_19105 buildPartial() {
            S2S_SweepBattle_19105 result = new S2S_SweepBattle_19105(this);
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
            if (other instanceof S2S_SweepBattle_19105) {
               return this.mergeFrom((S2S_SweepBattle_19105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SweepBattle_19105 other) {
            if (other == CrossDragonTeamMsg.S2S_SweepBattle_19105.getDefaultInstance()) {
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
            S2S_SweepBattle_19105 parsedMessage = null;

            try {
               parsedMessage = (S2S_SweepBattle_19105)CrossDragonTeamMsg.S2S_SweepBattle_19105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SweepBattle_19105)e.getUnfinishedMessage();
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

   public static final class S2S_PlayerLogout_19106 extends GeneratedMessageV3 implements S2S_PlayerLogout_19106OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_PlayerLogout_19106 DEFAULT_INSTANCE = new S2S_PlayerLogout_19106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_PlayerLogout_19106> PARSER = new AbstractParser<S2S_PlayerLogout_19106>() {
         public S2S_PlayerLogout_19106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_PlayerLogout_19106(input, extensionRegistry);
         }
      };

      private S2S_PlayerLogout_19106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_PlayerLogout_19106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_PlayerLogout_19106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_PlayerLogout_19106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_PlayerLogout_19106.class, Builder.class);
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
         } else if (!(obj instanceof S2S_PlayerLogout_19106)) {
            return super.equals(obj);
         } else {
            S2S_PlayerLogout_19106 other = (S2S_PlayerLogout_19106)obj;
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

      public static S2S_PlayerLogout_19106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_19106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_19106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_19106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_19106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_19106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_19106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_19106 parseFrom(InputStream input) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_19106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_PlayerLogout_19106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_19106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_PlayerLogout_19106 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_19106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_19106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_PlayerLogout_19106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_PlayerLogout_19106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_PlayerLogout_19106> parser() {
         return PARSER;
      }

      public Parser<S2S_PlayerLogout_19106> getParserForType() {
         return PARSER;
      }

      public S2S_PlayerLogout_19106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_PlayerLogout_19106OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_PlayerLogout_19106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_PlayerLogout_19106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_PlayerLogout_19106_descriptor;
         }

         public S2S_PlayerLogout_19106 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_PlayerLogout_19106.getDefaultInstance();
         }

         public S2S_PlayerLogout_19106 build() {
            S2S_PlayerLogout_19106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_PlayerLogout_19106 buildPartial() {
            S2S_PlayerLogout_19106 result = new S2S_PlayerLogout_19106(this);
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
            if (other instanceof S2S_PlayerLogout_19106) {
               return this.mergeFrom((S2S_PlayerLogout_19106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_PlayerLogout_19106 other) {
            if (other == CrossDragonTeamMsg.S2S_PlayerLogout_19106.getDefaultInstance()) {
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
            S2S_PlayerLogout_19106 parsedMessage = null;

            try {
               parsedMessage = (S2S_PlayerLogout_19106)CrossDragonTeamMsg.S2S_PlayerLogout_19106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_PlayerLogout_19106)e.getUnfinishedMessage();
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

   public static final class S2S_NotifyOpenCross_19107 extends GeneratedMessageV3 implements S2S_NotifyOpenCross_19107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENCROSS_FIELD_NUMBER = 1;
      private boolean openCross_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifyOpenCross_19107 DEFAULT_INSTANCE = new S2S_NotifyOpenCross_19107();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifyOpenCross_19107> PARSER = new AbstractParser<S2S_NotifyOpenCross_19107>() {
         public S2S_NotifyOpenCross_19107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifyOpenCross_19107(input, extensionRegistry);
         }
      };

      private S2S_NotifyOpenCross_19107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifyOpenCross_19107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifyOpenCross_19107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifyOpenCross_19107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openCross_ = input.readBool();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyOpenCross_19107.class, Builder.class);
      }

      public boolean hasOpenCross() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getOpenCross() {
         return this.openCross_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenCross()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.openCross_);
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
               size += CodedOutputStream.computeBoolSize(1, this.openCross_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifyOpenCross_19107)) {
            return super.equals(obj);
         } else {
            S2S_NotifyOpenCross_19107 other = (S2S_NotifyOpenCross_19107)obj;
            if (this.hasOpenCross() != other.hasOpenCross()) {
               return false;
            } else if (this.hasOpenCross() && this.getOpenCross() != other.getOpenCross()) {
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
            if (this.hasOpenCross()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getOpenCross());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyOpenCross_19107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyOpenCross_19107 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifyOpenCross_19107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyOpenCross_19107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyOpenCross_19107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifyOpenCross_19107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifyOpenCross_19107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifyOpenCross_19107> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifyOpenCross_19107> getParserForType() {
         return PARSER;
      }

      public S2S_NotifyOpenCross_19107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifyOpenCross_19107OrBuilder {
         private int bitField0_;
         private boolean openCross_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyOpenCross_19107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_NotifyOpenCross_19107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openCross_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_NotifyOpenCross_19107_descriptor;
         }

         public S2S_NotifyOpenCross_19107 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_NotifyOpenCross_19107.getDefaultInstance();
         }

         public S2S_NotifyOpenCross_19107 build() {
            S2S_NotifyOpenCross_19107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifyOpenCross_19107 buildPartial() {
            S2S_NotifyOpenCross_19107 result = new S2S_NotifyOpenCross_19107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openCross_ = this.openCross_;
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
            if (other instanceof S2S_NotifyOpenCross_19107) {
               return this.mergeFrom((S2S_NotifyOpenCross_19107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifyOpenCross_19107 other) {
            if (other == CrossDragonTeamMsg.S2S_NotifyOpenCross_19107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenCross()) {
                  this.setOpenCross(other.getOpenCross());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOpenCross();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifyOpenCross_19107 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifyOpenCross_19107)CrossDragonTeamMsg.S2S_NotifyOpenCross_19107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifyOpenCross_19107)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenCross() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getOpenCross() {
            return this.openCross_;
         }

         public Builder setOpenCross(boolean value) {
            this.bitField0_ |= 1;
            this.openCross_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenCross() {
            this.bitField0_ &= -2;
            this.openCross_ = false;
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

   public static final class S2S_ResponseOpenCross_19108 extends GeneratedMessageV3 implements S2S_ResponseOpenCross_19108OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_ResponseOpenCross_19108 DEFAULT_INSTANCE = new S2S_ResponseOpenCross_19108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_ResponseOpenCross_19108> PARSER = new AbstractParser<S2S_ResponseOpenCross_19108>() {
         public S2S_ResponseOpenCross_19108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_ResponseOpenCross_19108(input, extensionRegistry);
         }
      };

      private S2S_ResponseOpenCross_19108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_ResponseOpenCross_19108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_ResponseOpenCross_19108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_ResponseOpenCross_19108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ResponseOpenCross_19108.class, Builder.class);
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
         } else if (!(obj instanceof S2S_ResponseOpenCross_19108)) {
            return super.equals(obj);
         } else {
            S2S_ResponseOpenCross_19108 other = (S2S_ResponseOpenCross_19108)obj;
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

      public static S2S_ResponseOpenCross_19108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ResponseOpenCross_19108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(InputStream input) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ResponseOpenCross_19108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_ResponseOpenCross_19108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ResponseOpenCross_19108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ResponseOpenCross_19108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_ResponseOpenCross_19108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_ResponseOpenCross_19108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_ResponseOpenCross_19108> parser() {
         return PARSER;
      }

      public Parser<S2S_ResponseOpenCross_19108> getParserForType() {
         return PARSER;
      }

      public S2S_ResponseOpenCross_19108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_ResponseOpenCross_19108OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ResponseOpenCross_19108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_ResponseOpenCross_19108_descriptor;
         }

         public S2S_ResponseOpenCross_19108 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.getDefaultInstance();
         }

         public S2S_ResponseOpenCross_19108 build() {
            S2S_ResponseOpenCross_19108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_ResponseOpenCross_19108 buildPartial() {
            S2S_ResponseOpenCross_19108 result = new S2S_ResponseOpenCross_19108(this);
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
            if (other instanceof S2S_ResponseOpenCross_19108) {
               return this.mergeFrom((S2S_ResponseOpenCross_19108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_ResponseOpenCross_19108 other) {
            if (other == CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.getDefaultInstance()) {
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
            S2S_ResponseOpenCross_19108 parsedMessage = null;

            try {
               parsedMessage = (S2S_ResponseOpenCross_19108)CrossDragonTeamMsg.S2S_ResponseOpenCross_19108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_ResponseOpenCross_19108)e.getUnfinishedMessage();
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

   public static final class S2S_AskOpenCross_19120 extends GeneratedMessageV3 implements S2S_AskOpenCross_19120OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_AskOpenCross_19120 DEFAULT_INSTANCE = new S2S_AskOpenCross_19120();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_AskOpenCross_19120> PARSER = new AbstractParser<S2S_AskOpenCross_19120>() {
         public S2S_AskOpenCross_19120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_AskOpenCross_19120(input, extensionRegistry);
         }
      };

      private S2S_AskOpenCross_19120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_AskOpenCross_19120() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_AskOpenCross_19120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_AskOpenCross_19120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_AskOpenCross_19120.class, Builder.class);
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
         } else if (!(obj instanceof S2S_AskOpenCross_19120)) {
            return super.equals(obj);
         } else {
            S2S_AskOpenCross_19120 other = (S2S_AskOpenCross_19120)obj;
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

      public static S2S_AskOpenCross_19120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data);
      }

      public static S2S_AskOpenCross_19120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AskOpenCross_19120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data);
      }

      public static S2S_AskOpenCross_19120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AskOpenCross_19120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data);
      }

      public static S2S_AskOpenCross_19120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_AskOpenCross_19120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_AskOpenCross_19120 parseFrom(InputStream input) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_AskOpenCross_19120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_AskOpenCross_19120 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_AskOpenCross_19120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_AskOpenCross_19120 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_AskOpenCross_19120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_AskOpenCross_19120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_AskOpenCross_19120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_AskOpenCross_19120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_AskOpenCross_19120> parser() {
         return PARSER;
      }

      public Parser<S2S_AskOpenCross_19120> getParserForType() {
         return PARSER;
      }

      public S2S_AskOpenCross_19120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_AskOpenCross_19120OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_AskOpenCross_19120.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_AskOpenCross_19120.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_AskOpenCross_19120_descriptor;
         }

         public S2S_AskOpenCross_19120 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_AskOpenCross_19120.getDefaultInstance();
         }

         public S2S_AskOpenCross_19120 build() {
            S2S_AskOpenCross_19120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_AskOpenCross_19120 buildPartial() {
            S2S_AskOpenCross_19120 result = new S2S_AskOpenCross_19120(this);
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
            if (other instanceof S2S_AskOpenCross_19120) {
               return this.mergeFrom((S2S_AskOpenCross_19120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_AskOpenCross_19120 other) {
            if (other == CrossDragonTeamMsg.S2S_AskOpenCross_19120.getDefaultInstance()) {
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
            S2S_AskOpenCross_19120 parsedMessage = null;

            try {
               parsedMessage = (S2S_AskOpenCross_19120)CrossDragonTeamMsg.S2S_AskOpenCross_19120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_AskOpenCross_19120)e.getUnfinishedMessage();
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

   public static final class S2S_Gm_19109 extends GeneratedMessageV3 implements S2S_Gm_19109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2S_Gm_19109 DEFAULT_INSTANCE = new S2S_Gm_19109();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_Gm_19109> PARSER = new AbstractParser<S2S_Gm_19109>() {
         public S2S_Gm_19109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_Gm_19109(input, extensionRegistry);
         }
      };

      private S2S_Gm_19109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_Gm_19109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_Gm_19109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_Gm_19109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
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
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_Gm_19109.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_Gm_19109)) {
            return super.equals(obj);
         } else {
            S2S_Gm_19109 other = (S2S_Gm_19109)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_Gm_19109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data);
      }

      public static S2S_Gm_19109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_Gm_19109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data);
      }

      public static S2S_Gm_19109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_Gm_19109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data);
      }

      public static S2S_Gm_19109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_Gm_19109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_Gm_19109 parseFrom(InputStream input) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_Gm_19109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_Gm_19109 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_Gm_19109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_Gm_19109 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_Gm_19109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_Gm_19109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_Gm_19109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_Gm_19109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_Gm_19109> parser() {
         return PARSER;
      }

      public Parser<S2S_Gm_19109> getParserForType() {
         return PARSER;
      }

      public S2S_Gm_19109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_Gm_19109OrBuilder {
         private int bitField0_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_Gm_19109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonTeamMsg.S2S_Gm_19109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonTeamMsg.internal_static_crossDragonTeam_com_gzbz_protobuf_S2S_Gm_19109_descriptor;
         }

         public S2S_Gm_19109 getDefaultInstanceForType() {
            return CrossDragonTeamMsg.S2S_Gm_19109.getDefaultInstance();
         }

         public S2S_Gm_19109 build() {
            S2S_Gm_19109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_Gm_19109 buildPartial() {
            S2S_Gm_19109 result = new S2S_Gm_19109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2S_Gm_19109) {
               return this.mergeFrom((S2S_Gm_19109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_Gm_19109 other) {
            if (other == CrossDragonTeamMsg.S2S_Gm_19109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_Gm_19109 parsedMessage = null;

            try {
               parsedMessage = (S2S_Gm_19109)CrossDragonTeamMsg.S2S_Gm_19109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_Gm_19109)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
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

   public interface DragonInfoOrBuilder extends MessageOrBuilder {
      boolean hasDragonStage();

      int getDragonStage();

      boolean hasPassed();

      boolean getPassed();

      boolean hasBattleNum();

      int getBattleNum();
   }

   public interface S2S_AskOpenCross_19120OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_BattleSaveRecord_19102OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }

   public interface S2S_BattleSettle_19101OrBuilder extends MessageOrBuilder {
      boolean hasDragonStage();

      int getDragonStage();

      boolean hasTime();

      int getTime();
   }

   public interface S2S_Gm_19109OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();
   }

   public interface S2S_NotifyOpenCross_19107OrBuilder extends MessageOrBuilder {
      boolean hasOpenCross();

      boolean getOpenCross();
   }

   public interface S2S_PlayerLogout_19106OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_ResponseOpenCross_19108OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_SendDragonInfo_19103OrBuilder extends MessageOrBuilder {
      boolean hasDragonInfo();

      DragonInfo getDragonInfo();

      DragonInfoOrBuilder getDragonInfoOrBuilder();

      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2S_SweepBattle_19105OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_UpdateBattleNum_19104OrBuilder extends MessageOrBuilder {
   }
}
