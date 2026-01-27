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

public final class NationalDayMsg {
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_MusicData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_RoundData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private NationalDayMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011NationalDay.proto\u0012\u001dnationalDay.com.gzbz.protobuf\"=\n\tMusicData\u0012\u000f\n\u0007musicId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btopScore\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005gotId\u0018\u0003 \u0003(\u0005\">\n\tRoundData\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000broundReward\u0018\u0002 \u0002(\b\u0012\r\n\u0005gotId\u0018\u0003 \u0003(\u0005\"\u0010\n\u000eC2S_Main_15201\"\u0082\u0002\n\u000eS2C_Main_15202\u0012\u0011\n\tbeatCount\u0018\u0001 \u0002(\u0005\u0012;\n\tmusicData\u0018\u0002 \u0003(\u000b2(.nationalDay.com.gzbz.protobuf.MusicData\u0012;\n\troundData\u0018\u0003 \u0003(\u000b2(.nationalDay.com.gzbz.protobuf.RoundData\u0012\r\n\u0005gotId\u0018\u0004 \u0003(\u0005\u0012\u0011\n\tfreeCount\u0018\u0005 \u0002(\u0005\u0012\u0012\n\ncycleCount\u0018\u0006 \u0002(\u0005\u0012\u0016\n\u000esacrificeCount\u0018\u0007 \u0002(\u0005\u0012\u0015\n\rserverProcess\u0018\b \u0002(\u0005\"4\n\u0012C2S_BeatDrum_15203\u0012\u000f\n\u0007musicId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0005\"l\n\u0012S2C_BeatDrum_15204\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007musicId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tbeatCount\u0018\u0003 \u0002(\u0005\u0012\u0010\n\btopScore\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bgotScore\u0018\u0005 \u0003(\u0005\"$\n\u0013C2S_Sacrifice_15205\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"t\n\u0013S2C_Sacrifice_15206\u0012\u0011\n\tfreeCount\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ncycleCount\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007process\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000esacrificeCount\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0005 \u0002(\u0005\"3\n\u001aS2C_SacrificeProcess_15208\u0012\u0015\n\rserverProcess\u0018\u0001 \u0002(\u0005\"'\n\u0019C2S_SacrificeReward_15209\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"'\n\u0019S2C_SacrificeReward_15210\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"/\n\u001eC2S_SacrificeRoundReward_15211\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\"/\n\u001eS2C_SacrificeRoundReward_15212\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\"*\n\u0019C2S_DrumLevelReward_15213\u0012\r\n\u0005gotId\u0018\u0001 \u0002(\u0005\"*\n\u0019S2C_DrumLevelReward_15214\u0012\r\n\u0005gotId\u0018\u0001 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eNationalDayMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_nationalDay_com_gzbz_protobuf_MusicData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor, new String[]{"MusicId", "TopScore", "GotId"});
      internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_nationalDay_com_gzbz_protobuf_RoundData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor, new String[]{"Round", "RoundReward", "GotId"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor, new String[0]);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor, new String[]{"BeatCount", "MusicData", "RoundData", "GotId", "FreeCount", "CycleCount", "SacrificeCount", "ServerProcess"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor, new String[]{"MusicId", "Score"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor, new String[]{"Result", "MusicId", "BeatCount", "TopScore", "GotScore"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor, new String[]{"Count"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor, new String[]{"FreeCount", "CycleCount", "Process", "SacrificeCount", "Count"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor, new String[]{"ServerProcess"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor, new String[]{"Id"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor, new String[]{"Id"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor, new String[]{"Round"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor, new String[]{"Round"});
      internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor, new String[]{"GotId"});
      internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor, new String[]{"GotId"});
   }

   public static final class MusicData extends GeneratedMessageV3 implements MusicDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MUSICID_FIELD_NUMBER = 1;
      private int musicId_;
      public static final int TOPSCORE_FIELD_NUMBER = 2;
      private int topScore_;
      public static final int GOTID_FIELD_NUMBER = 3;
      private Internal.IntList gotId_;
      private byte memoizedIsInitialized;
      private static final MusicData DEFAULT_INSTANCE = new MusicData();
      /** @deprecated */
      @Deprecated
      public static final Parser<MusicData> PARSER = new AbstractParser<MusicData>() {
         public MusicData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MusicData(input, extensionRegistry);
         }
      };

      private MusicData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MusicData() {
         this.memoizedIsInitialized = -1;
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MusicData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MusicData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.musicId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.topScore_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotId_.addInt(input.readInt32());
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
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_MusicData_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicData.class, Builder.class);
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasTopScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTopScore() {
         return this.topScore_;
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTopScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.musicId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.topScore_);
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(3, this.gotId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.musicId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.topScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MusicData)) {
            return super.equals(obj);
         } else {
            MusicData other = (MusicData)obj;
            if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasTopScore() != other.hasTopScore()) {
               return false;
            } else if (this.hasTopScore() && this.getTopScore() != other.getTopScore()) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
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
            if (this.hasMusicId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasTopScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTopScore();
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MusicData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data);
      }

      public static MusicData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MusicData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MusicData parseFrom(InputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MusicData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MusicData parseDelimitedFrom(InputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MusicData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MusicData parseFrom(CodedInputStream input) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MusicData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MusicData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MusicData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MusicData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MusicData> parser() {
         return PARSER;
      }

      public Parser<MusicData> getParserForType() {
         return PARSER;
      }

      public MusicData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicDataOrBuilder {
         private int bitField0_;
         private int musicId_;
         private int topScore_;
         private Internal.IntList gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_MusicData_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicData.class, Builder.class);
         }

         private Builder() {
            this.gotId_ = NationalDayMsg.MusicData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotId_ = NationalDayMsg.MusicData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.MusicData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.musicId_ = 0;
            this.bitField0_ &= -2;
            this.topScore_ = 0;
            this.bitField0_ &= -3;
            this.gotId_ = NationalDayMsg.MusicData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_MusicData_descriptor;
         }

         public MusicData getDefaultInstanceForType() {
            return NationalDayMsg.MusicData.getDefaultInstance();
         }

         public MusicData build() {
            MusicData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MusicData buildPartial() {
            MusicData result = new MusicData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.topScore_ = this.topScore_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotId_ = this.gotId_;
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
            if (other instanceof MusicData) {
               return this.mergeFrom((MusicData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MusicData other) {
            if (other == NationalDayMsg.MusicData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasTopScore()) {
                  this.setTopScore(other.getTopScore());
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasTopScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MusicData parsedMessage = null;

            try {
               parsedMessage = (MusicData)NationalDayMsg.MusicData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MusicData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMusicId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 1;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTopScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTopScore() {
            return this.topScore_;
         }

         public Builder setTopScore(int value) {
            this.bitField0_ |= 2;
            this.topScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTopScore() {
            this.bitField0_ &= -3;
            this.topScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotId_ = NationalDayMsg.MusicData.mutableCopy(this.gotId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = NationalDayMsg.MusicData.emptyIntList();
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

   public static final class RoundData extends GeneratedMessageV3 implements RoundDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int ROUNDREWARD_FIELD_NUMBER = 2;
      private boolean roundReward_;
      public static final int GOTID_FIELD_NUMBER = 3;
      private Internal.IntList gotId_;
      private byte memoizedIsInitialized;
      private static final RoundData DEFAULT_INSTANCE = new RoundData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RoundData> PARSER = new AbstractParser<RoundData>() {
         public RoundData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RoundData(input, extensionRegistry);
         }
      };

      private RoundData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RoundData() {
         this.memoizedIsInitialized = -1;
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RoundData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RoundData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.roundReward_ = input.readBool();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotId_.addInt(input.readInt32());
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
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_RoundData_fieldAccessorTable.ensureFieldAccessorsInitialized(RoundData.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasRoundReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getRoundReward() {
         return this.roundReward_;
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
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
         } else if (!this.hasRoundReward()) {
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
            output.writeBool(2, this.roundReward_);
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(3, this.gotId_.getInt(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.roundReward_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RoundData)) {
            return super.equals(obj);
         } else {
            RoundData other = (RoundData)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasRoundReward() != other.hasRoundReward()) {
               return false;
            } else if (this.hasRoundReward() && this.getRoundReward() != other.getRoundReward()) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
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

            if (this.hasRoundReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getRoundReward());
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RoundData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data);
      }

      public static RoundData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoundData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data);
      }

      public static RoundData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoundData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data);
      }

      public static RoundData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RoundData parseFrom(InputStream input) throws IOException {
         return (RoundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RoundData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RoundData parseDelimitedFrom(InputStream input) throws IOException {
         return (RoundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RoundData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RoundData parseFrom(CodedInputStream input) throws IOException {
         return (RoundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RoundData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RoundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RoundData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RoundData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RoundData> parser() {
         return PARSER;
      }

      public Parser<RoundData> getParserForType() {
         return PARSER;
      }

      public RoundData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoundDataOrBuilder {
         private int bitField0_;
         private int round_;
         private boolean roundReward_;
         private Internal.IntList gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_RoundData_fieldAccessorTable.ensureFieldAccessorsInitialized(RoundData.class, Builder.class);
         }

         private Builder() {
            this.gotId_ = NationalDayMsg.RoundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotId_ = NationalDayMsg.RoundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.RoundData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.roundReward_ = false;
            this.bitField0_ &= -3;
            this.gotId_ = NationalDayMsg.RoundData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_RoundData_descriptor;
         }

         public RoundData getDefaultInstanceForType() {
            return NationalDayMsg.RoundData.getDefaultInstance();
         }

         public RoundData build() {
            RoundData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RoundData buildPartial() {
            RoundData result = new RoundData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.roundReward_ = this.roundReward_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotId_ = this.gotId_;
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
            if (other instanceof RoundData) {
               return this.mergeFrom((RoundData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RoundData other) {
            if (other == NationalDayMsg.RoundData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasRoundReward()) {
                  this.setRoundReward(other.getRoundReward());
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
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
               return this.hasRoundReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RoundData parsedMessage = null;

            try {
               parsedMessage = (RoundData)NationalDayMsg.RoundData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RoundData)e.getUnfinishedMessage();
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

         public boolean hasRoundReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getRoundReward() {
            return this.roundReward_;
         }

         public Builder setRoundReward(boolean value) {
            this.bitField0_ |= 2;
            this.roundReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundReward() {
            this.bitField0_ &= -3;
            this.roundReward_ = false;
            this.onChanged();
            return this;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotId_ = NationalDayMsg.RoundData.mutableCopy(this.gotId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = NationalDayMsg.RoundData.emptyIntList();
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

   public static final class C2S_Main_15201 extends GeneratedMessageV3 implements C2S_Main_15201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_15201 DEFAULT_INSTANCE = new C2S_Main_15201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_15201> PARSER = new AbstractParser<C2S_Main_15201>() {
         public C2S_Main_15201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_15201(input, extensionRegistry);
         }
      };

      private C2S_Main_15201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_15201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_15201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_15201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_15201)) {
            return super.equals(obj);
         } else {
            C2S_Main_15201 other = (C2S_Main_15201)obj;
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

      public static C2S_Main_15201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data);
      }

      public static C2S_Main_15201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data);
      }

      public static C2S_Main_15201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data);
      }

      public static C2S_Main_15201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15201 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_15201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_15201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_15201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_15201> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_15201> getParserForType() {
         return PARSER;
      }

      public C2S_Main_15201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_15201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_Main_15201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Main_15201_descriptor;
         }

         public C2S_Main_15201 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_Main_15201.getDefaultInstance();
         }

         public C2S_Main_15201 build() {
            C2S_Main_15201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_15201 buildPartial() {
            C2S_Main_15201 result = new C2S_Main_15201(this);
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
            if (other instanceof C2S_Main_15201) {
               return this.mergeFrom((C2S_Main_15201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_15201 other) {
            if (other == NationalDayMsg.C2S_Main_15201.getDefaultInstance()) {
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
            C2S_Main_15201 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_15201)NationalDayMsg.C2S_Main_15201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_15201)e.getUnfinishedMessage();
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

   public static final class S2C_Main_15202 extends GeneratedMessageV3 implements S2C_Main_15202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEATCOUNT_FIELD_NUMBER = 1;
      private int beatCount_;
      public static final int MUSICDATA_FIELD_NUMBER = 2;
      private List<MusicData> musicData_;
      public static final int ROUNDDATA_FIELD_NUMBER = 3;
      private List<RoundData> roundData_;
      public static final int GOTID_FIELD_NUMBER = 4;
      private Internal.IntList gotId_;
      public static final int FREECOUNT_FIELD_NUMBER = 5;
      private int freeCount_;
      public static final int CYCLECOUNT_FIELD_NUMBER = 6;
      private int cycleCount_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 7;
      private int sacrificeCount_;
      public static final int SERVERPROCESS_FIELD_NUMBER = 8;
      private int serverProcess_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_15202 DEFAULT_INSTANCE = new S2C_Main_15202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_15202> PARSER = new AbstractParser<S2C_Main_15202>() {
         public S2C_Main_15202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_15202(input, extensionRegistry);
         }
      };

      private S2C_Main_15202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_15202() {
         this.memoizedIsInitialized = -1;
         this.musicData_ = Collections.emptyList();
         this.roundData_ = Collections.emptyList();
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_15202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_15202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beatCount_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.musicData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.musicData_.add(input.readMessage(NationalDayMsg.MusicData.PARSER, extensionRegistry));
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.roundData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.roundData_.add(input.readMessage(NationalDayMsg.RoundData.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.gotId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 2;
                        this.freeCount_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.cycleCount_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.sacrificeCount_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.serverProcess_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.musicData_ = Collections.unmodifiableList(this.musicData_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.roundData_ = Collections.unmodifiableList(this.roundData_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15202.class, Builder.class);
      }

      public boolean hasBeatCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeatCount() {
         return this.beatCount_;
      }

      public List<MusicData> getMusicDataList() {
         return this.musicData_;
      }

      public List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList() {
         return this.musicData_;
      }

      public int getMusicDataCount() {
         return this.musicData_.size();
      }

      public MusicData getMusicData(int index) {
         return (MusicData)this.musicData_.get(index);
      }

      public MusicDataOrBuilder getMusicDataOrBuilder(int index) {
         return (MusicDataOrBuilder)this.musicData_.get(index);
      }

      public List<RoundData> getRoundDataList() {
         return this.roundData_;
      }

      public List<? extends RoundDataOrBuilder> getRoundDataOrBuilderList() {
         return this.roundData_;
      }

      public int getRoundDataCount() {
         return this.roundData_.size();
      }

      public RoundData getRoundData(int index) {
         return (RoundData)this.roundData_.get(index);
      }

      public RoundDataOrBuilder getRoundDataOrBuilder(int index) {
         return (RoundDataOrBuilder)this.roundData_.get(index);
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
      }

      public boolean hasFreeCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFreeCount() {
         return this.freeCount_;
      }

      public boolean hasCycleCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCycleCount() {
         return this.cycleCount_;
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasServerProcess() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getServerProcess() {
         return this.serverProcess_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeatCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCycleCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getMusicDataCount(); ++i) {
               if (!this.getMusicData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRoundDataCount(); ++i) {
               if (!this.getRoundData(i).isInitialized()) {
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
            output.writeInt32(1, this.beatCount_);
         }

         for(int i = 0; i < this.musicData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.musicData_.get(i));
         }

         for(int i = 0; i < this.roundData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.roundData_.get(i));
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(4, this.gotId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.freeCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.cycleCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.serverProcess_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beatCount_);
            }

            for(int i = 0; i < this.musicData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.musicData_.get(i));
            }

            for(int i = 0; i < this.roundData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.roundData_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.freeCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.cycleCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverProcess_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_15202)) {
            return super.equals(obj);
         } else {
            S2C_Main_15202 other = (S2C_Main_15202)obj;
            if (this.hasBeatCount() != other.hasBeatCount()) {
               return false;
            } else if (this.hasBeatCount() && this.getBeatCount() != other.getBeatCount()) {
               return false;
            } else if (!this.getMusicDataList().equals(other.getMusicDataList())) {
               return false;
            } else if (!this.getRoundDataList().equals(other.getRoundDataList())) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
               return false;
            } else if (this.hasFreeCount() != other.hasFreeCount()) {
               return false;
            } else if (this.hasFreeCount() && this.getFreeCount() != other.getFreeCount()) {
               return false;
            } else if (this.hasCycleCount() != other.hasCycleCount()) {
               return false;
            } else if (this.hasCycleCount() && this.getCycleCount() != other.getCycleCount()) {
               return false;
            } else if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasServerProcess() != other.hasServerProcess()) {
               return false;
            } else if (this.hasServerProcess() && this.getServerProcess() != other.getServerProcess()) {
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
            if (this.hasBeatCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeatCount();
            }

            if (this.getMusicDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMusicDataList().hashCode();
            }

            if (this.getRoundDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRoundDataList().hashCode();
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            if (this.hasFreeCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFreeCount();
            }

            if (this.hasCycleCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getCycleCount();
            }

            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasServerProcess()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerProcess();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_15202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data);
      }

      public static S2C_Main_15202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data);
      }

      public static S2C_Main_15202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data);
      }

      public static S2C_Main_15202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15202 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_15202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_15202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_15202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_15202> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_15202> getParserForType() {
         return PARSER;
      }

      public S2C_Main_15202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_15202OrBuilder {
         private int bitField0_;
         private int beatCount_;
         private List<MusicData> musicData_;
         private RepeatedFieldBuilderV3<MusicData, MusicData.Builder, MusicDataOrBuilder> musicDataBuilder_;
         private List<RoundData> roundData_;
         private RepeatedFieldBuilderV3<RoundData, RoundData.Builder, RoundDataOrBuilder> roundDataBuilder_;
         private Internal.IntList gotId_;
         private int freeCount_;
         private int cycleCount_;
         private int sacrificeCount_;
         private int serverProcess_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15202.class, Builder.class);
         }

         private Builder() {
            this.musicData_ = Collections.emptyList();
            this.roundData_ = Collections.emptyList();
            this.gotId_ = NationalDayMsg.S2C_Main_15202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.musicData_ = Collections.emptyList();
            this.roundData_ = Collections.emptyList();
            this.gotId_ = NationalDayMsg.S2C_Main_15202.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_Main_15202.alwaysUseFieldBuilders) {
               this.getMusicDataFieldBuilder();
               this.getRoundDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beatCount_ = 0;
            this.bitField0_ &= -2;
            if (this.musicDataBuilder_ == null) {
               this.musicData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.musicDataBuilder_.clear();
            }

            if (this.roundDataBuilder_ == null) {
               this.roundData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.roundDataBuilder_.clear();
            }

            this.gotId_ = NationalDayMsg.S2C_Main_15202.emptyIntList();
            this.bitField0_ &= -9;
            this.freeCount_ = 0;
            this.bitField0_ &= -17;
            this.cycleCount_ = 0;
            this.bitField0_ &= -33;
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -65;
            this.serverProcess_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Main_15202_descriptor;
         }

         public S2C_Main_15202 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_Main_15202.getDefaultInstance();
         }

         public S2C_Main_15202 build() {
            S2C_Main_15202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_15202 buildPartial() {
            S2C_Main_15202 result = new S2C_Main_15202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beatCount_ = this.beatCount_;
               to_bitField0_ |= 1;
            }

            if (this.musicDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.musicData_ = Collections.unmodifiableList(this.musicData_);
                  this.bitField0_ &= -3;
               }

               result.musicData_ = this.musicData_;
            } else {
               result.musicData_ = this.musicDataBuilder_.build();
            }

            if (this.roundDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.roundData_ = Collections.unmodifiableList(this.roundData_);
                  this.bitField0_ &= -5;
               }

               result.roundData_ = this.roundData_;
            } else {
               result.roundData_ = this.roundDataBuilder_.build();
            }

            if ((this.bitField0_ & 8) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.gotId_ = this.gotId_;
            if ((from_bitField0_ & 16) != 0) {
               result.freeCount_ = this.freeCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.cycleCount_ = this.cycleCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverProcess_ = this.serverProcess_;
               to_bitField0_ |= 16;
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
            if (other instanceof S2C_Main_15202) {
               return this.mergeFrom((S2C_Main_15202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_15202 other) {
            if (other == NationalDayMsg.S2C_Main_15202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeatCount()) {
                  this.setBeatCount(other.getBeatCount());
               }

               if (this.musicDataBuilder_ == null) {
                  if (!other.musicData_.isEmpty()) {
                     if (this.musicData_.isEmpty()) {
                        this.musicData_ = other.musicData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureMusicDataIsMutable();
                        this.musicData_.addAll(other.musicData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.musicData_.isEmpty()) {
                  if (this.musicDataBuilder_.isEmpty()) {
                     this.musicDataBuilder_.dispose();
                     this.musicDataBuilder_ = null;
                     this.musicData_ = other.musicData_;
                     this.bitField0_ &= -3;
                     this.musicDataBuilder_ = NationalDayMsg.S2C_Main_15202.alwaysUseFieldBuilders ? this.getMusicDataFieldBuilder() : null;
                  } else {
                     this.musicDataBuilder_.addAllMessages(other.musicData_);
                  }
               }

               if (this.roundDataBuilder_ == null) {
                  if (!other.roundData_.isEmpty()) {
                     if (this.roundData_.isEmpty()) {
                        this.roundData_ = other.roundData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRoundDataIsMutable();
                        this.roundData_.addAll(other.roundData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.roundData_.isEmpty()) {
                  if (this.roundDataBuilder_.isEmpty()) {
                     this.roundDataBuilder_.dispose();
                     this.roundDataBuilder_ = null;
                     this.roundData_ = other.roundData_;
                     this.bitField0_ &= -5;
                     this.roundDataBuilder_ = NationalDayMsg.S2C_Main_15202.alwaysUseFieldBuilders ? this.getRoundDataFieldBuilder() : null;
                  } else {
                     this.roundDataBuilder_.addAllMessages(other.roundData_);
                  }
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
               }

               if (other.hasFreeCount()) {
                  this.setFreeCount(other.getFreeCount());
               }

               if (other.hasCycleCount()) {
                  this.setCycleCount(other.getCycleCount());
               }

               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasServerProcess()) {
                  this.setServerProcess(other.getServerProcess());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeatCount()) {
               return false;
            } else if (!this.hasFreeCount()) {
               return false;
            } else if (!this.hasCycleCount()) {
               return false;
            } else if (!this.hasSacrificeCount()) {
               return false;
            } else if (!this.hasServerProcess()) {
               return false;
            } else {
               for(int i = 0; i < this.getMusicDataCount(); ++i) {
                  if (!this.getMusicData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRoundDataCount(); ++i) {
                  if (!this.getRoundData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_15202 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_15202)NationalDayMsg.S2C_Main_15202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_15202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeatCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeatCount() {
            return this.beatCount_;
         }

         public Builder setBeatCount(int value) {
            this.bitField0_ |= 1;
            this.beatCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeatCount() {
            this.bitField0_ &= -2;
            this.beatCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMusicDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.musicData_ = new ArrayList(this.musicData_);
               this.bitField0_ |= 2;
            }

         }

         public List<MusicData> getMusicDataList() {
            return this.musicDataBuilder_ == null ? Collections.unmodifiableList(this.musicData_) : this.musicDataBuilder_.getMessageList();
         }

         public int getMusicDataCount() {
            return this.musicDataBuilder_ == null ? this.musicData_.size() : this.musicDataBuilder_.getCount();
         }

         public MusicData getMusicData(int index) {
            return this.musicDataBuilder_ == null ? (MusicData)this.musicData_.get(index) : (MusicData)this.musicDataBuilder_.getMessage(index);
         }

         public Builder setMusicData(int index, MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.set(index, value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMusicData(int index, MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMusicData(MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.add(value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMusicData(int index, MusicData value) {
            if (this.musicDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMusicDataIsMutable();
               this.musicData_.add(index, value);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMusicData(MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMusicData(int index, MusicData.Builder builderForValue) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.musicDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMusicData(Iterable<? extends MusicData> values) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.musicData_);
               this.onChanged();
            } else {
               this.musicDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMusicData() {
            if (this.musicDataBuilder_ == null) {
               this.musicData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.musicDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeMusicData(int index) {
            if (this.musicDataBuilder_ == null) {
               this.ensureMusicDataIsMutable();
               this.musicData_.remove(index);
               this.onChanged();
            } else {
               this.musicDataBuilder_.remove(index);
            }

            return this;
         }

         public MusicData.Builder getMusicDataBuilder(int index) {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().getBuilder(index);
         }

         public MusicDataOrBuilder getMusicDataOrBuilder(int index) {
            return this.musicDataBuilder_ == null ? (MusicDataOrBuilder)this.musicData_.get(index) : (MusicDataOrBuilder)this.musicDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList() {
            return this.musicDataBuilder_ != null ? this.musicDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.musicData_);
         }

         public MusicData.Builder addMusicDataBuilder() {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().addBuilder(NationalDayMsg.MusicData.getDefaultInstance());
         }

         public MusicData.Builder addMusicDataBuilder(int index) {
            return (MusicData.Builder)this.getMusicDataFieldBuilder().addBuilder(index, NationalDayMsg.MusicData.getDefaultInstance());
         }

         public List<MusicData.Builder> getMusicDataBuilderList() {
            return this.getMusicDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MusicData, MusicData.Builder, MusicDataOrBuilder> getMusicDataFieldBuilder() {
            if (this.musicDataBuilder_ == null) {
               this.musicDataBuilder_ = new RepeatedFieldBuilderV3(this.musicData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.musicData_ = null;
            }

            return this.musicDataBuilder_;
         }

         private void ensureRoundDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.roundData_ = new ArrayList(this.roundData_);
               this.bitField0_ |= 4;
            }

         }

         public List<RoundData> getRoundDataList() {
            return this.roundDataBuilder_ == null ? Collections.unmodifiableList(this.roundData_) : this.roundDataBuilder_.getMessageList();
         }

         public int getRoundDataCount() {
            return this.roundDataBuilder_ == null ? this.roundData_.size() : this.roundDataBuilder_.getCount();
         }

         public RoundData getRoundData(int index) {
            return this.roundDataBuilder_ == null ? (RoundData)this.roundData_.get(index) : (RoundData)this.roundDataBuilder_.getMessage(index);
         }

         public Builder setRoundData(int index, RoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.set(index, value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRoundData(int index, RoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRoundData(RoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.add(value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRoundData(int index, RoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.add(index, value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRoundData(RoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRoundData(int index, RoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRoundData(Iterable<? extends RoundData> values) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.roundData_);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRoundData() {
            if (this.roundDataBuilder_ == null) {
               this.roundData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.roundDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRoundData(int index) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.remove(index);
               this.onChanged();
            } else {
               this.roundDataBuilder_.remove(index);
            }

            return this;
         }

         public RoundData.Builder getRoundDataBuilder(int index) {
            return (RoundData.Builder)this.getRoundDataFieldBuilder().getBuilder(index);
         }

         public RoundDataOrBuilder getRoundDataOrBuilder(int index) {
            return this.roundDataBuilder_ == null ? (RoundDataOrBuilder)this.roundData_.get(index) : (RoundDataOrBuilder)this.roundDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RoundDataOrBuilder> getRoundDataOrBuilderList() {
            return this.roundDataBuilder_ != null ? this.roundDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.roundData_);
         }

         public RoundData.Builder addRoundDataBuilder() {
            return (RoundData.Builder)this.getRoundDataFieldBuilder().addBuilder(NationalDayMsg.RoundData.getDefaultInstance());
         }

         public RoundData.Builder addRoundDataBuilder(int index) {
            return (RoundData.Builder)this.getRoundDataFieldBuilder().addBuilder(index, NationalDayMsg.RoundData.getDefaultInstance());
         }

         public List<RoundData.Builder> getRoundDataBuilderList() {
            return this.getRoundDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RoundData, RoundData.Builder, RoundDataOrBuilder> getRoundDataFieldBuilder() {
            if (this.roundDataBuilder_ == null) {
               this.roundDataBuilder_ = new RepeatedFieldBuilderV3(this.roundData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.roundData_ = null;
            }

            return this.roundDataBuilder_;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotId_ = NationalDayMsg.S2C_Main_15202.mutableCopy(this.gotId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = NationalDayMsg.S2C_Main_15202.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasFreeCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFreeCount() {
            return this.freeCount_;
         }

         public Builder setFreeCount(int value) {
            this.bitField0_ |= 16;
            this.freeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeCount() {
            this.bitField0_ &= -17;
            this.freeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCycleCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getCycleCount() {
            return this.cycleCount_;
         }

         public Builder setCycleCount(int value) {
            this.bitField0_ |= 32;
            this.cycleCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCycleCount() {
            this.bitField0_ &= -33;
            this.cycleCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 64;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -65;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerProcess() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerProcess() {
            return this.serverProcess_;
         }

         public Builder setServerProcess(int value) {
            this.bitField0_ |= 128;
            this.serverProcess_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerProcess() {
            this.bitField0_ &= -129;
            this.serverProcess_ = 0;
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

   public static final class C2S_BeatDrum_15203 extends GeneratedMessageV3 implements C2S_BeatDrum_15203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MUSICID_FIELD_NUMBER = 1;
      private int musicId_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private int score_;
      private byte memoizedIsInitialized;
      private static final C2S_BeatDrum_15203 DEFAULT_INSTANCE = new C2S_BeatDrum_15203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BeatDrum_15203> PARSER = new AbstractParser<C2S_BeatDrum_15203>() {
         public C2S_BeatDrum_15203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BeatDrum_15203(input, extensionRegistry);
         }
      };

      private C2S_BeatDrum_15203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BeatDrum_15203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BeatDrum_15203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BeatDrum_15203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.musicId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.score_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrum_15203.class, Builder.class);
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.musicId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.score_);
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
               size += CodedOutputStream.computeInt32Size(1, this.musicId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.score_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BeatDrum_15203)) {
            return super.equals(obj);
         } else {
            C2S_BeatDrum_15203 other = (C2S_BeatDrum_15203)obj;
            if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
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
            if (this.hasMusicId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BeatDrum_15203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_15203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_15203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_15203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_15203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data);
      }

      public static C2S_BeatDrum_15203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BeatDrum_15203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BeatDrum_15203 parseFrom(InputStream input) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_15203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrum_15203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_15203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BeatDrum_15203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BeatDrum_15203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BeatDrum_15203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BeatDrum_15203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BeatDrum_15203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BeatDrum_15203> parser() {
         return PARSER;
      }

      public Parser<C2S_BeatDrum_15203> getParserForType() {
         return PARSER;
      }

      public C2S_BeatDrum_15203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BeatDrum_15203OrBuilder {
         private int bitField0_;
         private int musicId_;
         private int score_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BeatDrum_15203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_BeatDrum_15203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.musicId_ = 0;
            this.bitField0_ &= -2;
            this.score_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_BeatDrum_15203_descriptor;
         }

         public C2S_BeatDrum_15203 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_BeatDrum_15203.getDefaultInstance();
         }

         public C2S_BeatDrum_15203 build() {
            C2S_BeatDrum_15203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BeatDrum_15203 buildPartial() {
            C2S_BeatDrum_15203 result = new C2S_BeatDrum_15203(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.score_ = this.score_;
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
            if (other instanceof C2S_BeatDrum_15203) {
               return this.mergeFrom((C2S_BeatDrum_15203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BeatDrum_15203 other) {
            if (other == NationalDayMsg.C2S_BeatDrum_15203.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BeatDrum_15203 parsedMessage = null;

            try {
               parsedMessage = (C2S_BeatDrum_15203)NationalDayMsg.C2S_BeatDrum_15203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BeatDrum_15203)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMusicId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 1;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 2;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -3;
            this.score_ = 0;
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

   public static final class S2C_BeatDrum_15204 extends GeneratedMessageV3 implements S2C_BeatDrum_15204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int MUSICID_FIELD_NUMBER = 2;
      private int musicId_;
      public static final int BEATCOUNT_FIELD_NUMBER = 3;
      private int beatCount_;
      public static final int TOPSCORE_FIELD_NUMBER = 4;
      private int topScore_;
      public static final int GOTSCORE_FIELD_NUMBER = 5;
      private Internal.IntList gotScore_;
      private byte memoizedIsInitialized;
      private static final S2C_BeatDrum_15204 DEFAULT_INSTANCE = new S2C_BeatDrum_15204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BeatDrum_15204> PARSER = new AbstractParser<S2C_BeatDrum_15204>() {
         public S2C_BeatDrum_15204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BeatDrum_15204(input, extensionRegistry);
         }
      };

      private S2C_BeatDrum_15204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BeatDrum_15204() {
         this.memoizedIsInitialized = -1;
         this.gotScore_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BeatDrum_15204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BeatDrum_15204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.musicId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beatCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.topScore_ = input.readInt32();
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.gotScore_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.gotScore_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotScore_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotScore_.addInt(input.readInt32());
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
                  this.gotScore_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrum_15204.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMusicId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMusicId() {
         return this.musicId_;
      }

      public boolean hasBeatCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeatCount() {
         return this.beatCount_;
      }

      public boolean hasTopScore() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTopScore() {
         return this.topScore_;
      }

      public List<Integer> getGotScoreList() {
         return this.gotScore_;
      }

      public int getGotScoreCount() {
         return this.gotScore_.size();
      }

      public int getGotScore(int index) {
         return this.gotScore_.getInt(index);
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
         } else if (!this.hasMusicId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeatCount()) {
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
            output.writeInt32(2, this.musicId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beatCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.topScore_);
         }

         for(int i = 0; i < this.gotScore_.size(); ++i) {
            output.writeInt32(5, this.gotScore_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.musicId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beatCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.topScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotScore_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotScore_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotScoreList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BeatDrum_15204)) {
            return super.equals(obj);
         } else {
            S2C_BeatDrum_15204 other = (S2C_BeatDrum_15204)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMusicId() != other.hasMusicId()) {
               return false;
            } else if (this.hasMusicId() && this.getMusicId() != other.getMusicId()) {
               return false;
            } else if (this.hasBeatCount() != other.hasBeatCount()) {
               return false;
            } else if (this.hasBeatCount() && this.getBeatCount() != other.getBeatCount()) {
               return false;
            } else if (this.hasTopScore() != other.hasTopScore()) {
               return false;
            } else if (this.hasTopScore() && this.getTopScore() != other.getTopScore()) {
               return false;
            } else if (!this.getGotScoreList().equals(other.getGotScoreList())) {
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

            if (this.hasMusicId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMusicId();
            }

            if (this.hasBeatCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeatCount();
            }

            if (this.hasTopScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTopScore();
            }

            if (this.getGotScoreCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGotScoreList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BeatDrum_15204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_15204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_15204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_15204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_15204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data);
      }

      public static S2C_BeatDrum_15204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeatDrum_15204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeatDrum_15204 parseFrom(InputStream input) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_15204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrum_15204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_15204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeatDrum_15204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeatDrum_15204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeatDrum_15204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BeatDrum_15204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BeatDrum_15204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BeatDrum_15204> parser() {
         return PARSER;
      }

      public Parser<S2C_BeatDrum_15204> getParserForType() {
         return PARSER;
      }

      public S2C_BeatDrum_15204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BeatDrum_15204OrBuilder {
         private int bitField0_;
         private int result_;
         private int musicId_;
         private int beatCount_;
         private int topScore_;
         private Internal.IntList gotScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeatDrum_15204.class, Builder.class);
         }

         private Builder() {
            this.gotScore_ = NationalDayMsg.S2C_BeatDrum_15204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotScore_ = NationalDayMsg.S2C_BeatDrum_15204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_BeatDrum_15204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.musicId_ = 0;
            this.bitField0_ &= -3;
            this.beatCount_ = 0;
            this.bitField0_ &= -5;
            this.topScore_ = 0;
            this.bitField0_ &= -9;
            this.gotScore_ = NationalDayMsg.S2C_BeatDrum_15204.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_BeatDrum_15204_descriptor;
         }

         public S2C_BeatDrum_15204 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_BeatDrum_15204.getDefaultInstance();
         }

         public S2C_BeatDrum_15204 build() {
            S2C_BeatDrum_15204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BeatDrum_15204 buildPartial() {
            S2C_BeatDrum_15204 result = new S2C_BeatDrum_15204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.musicId_ = this.musicId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beatCount_ = this.beatCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.topScore_ = this.topScore_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.gotScore_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.gotScore_ = this.gotScore_;
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
            if (other instanceof S2C_BeatDrum_15204) {
               return this.mergeFrom((S2C_BeatDrum_15204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BeatDrum_15204 other) {
            if (other == NationalDayMsg.S2C_BeatDrum_15204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMusicId()) {
                  this.setMusicId(other.getMusicId());
               }

               if (other.hasBeatCount()) {
                  this.setBeatCount(other.getBeatCount());
               }

               if (other.hasTopScore()) {
                  this.setTopScore(other.getTopScore());
               }

               if (!other.gotScore_.isEmpty()) {
                  if (this.gotScore_.isEmpty()) {
                     this.gotScore_ = other.gotScore_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureGotScoreIsMutable();
                     this.gotScore_.addAll(other.gotScore_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasMusicId()) {
               return false;
            } else {
               return this.hasBeatCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BeatDrum_15204 parsedMessage = null;

            try {
               parsedMessage = (S2C_BeatDrum_15204)NationalDayMsg.S2C_BeatDrum_15204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BeatDrum_15204)e.getUnfinishedMessage();
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

         public boolean hasMusicId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMusicId() {
            return this.musicId_;
         }

         public Builder setMusicId(int value) {
            this.bitField0_ |= 2;
            this.musicId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMusicId() {
            this.bitField0_ &= -3;
            this.musicId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeatCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeatCount() {
            return this.beatCount_;
         }

         public Builder setBeatCount(int value) {
            this.bitField0_ |= 4;
            this.beatCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeatCount() {
            this.bitField0_ &= -5;
            this.beatCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTopScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTopScore() {
            return this.topScore_;
         }

         public Builder setTopScore(int value) {
            this.bitField0_ |= 8;
            this.topScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTopScore() {
            this.bitField0_ &= -9;
            this.topScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotScoreIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.gotScore_ = NationalDayMsg.S2C_BeatDrum_15204.mutableCopy(this.gotScore_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getGotScoreList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.gotScore_) : this.gotScore_);
         }

         public int getGotScoreCount() {
            return this.gotScore_.size();
         }

         public int getGotScore(int index) {
            return this.gotScore_.getInt(index);
         }

         public Builder setGotScore(int index, int value) {
            this.ensureGotScoreIsMutable();
            this.gotScore_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotScore(int value) {
            this.ensureGotScoreIsMutable();
            this.gotScore_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotScore(Iterable<? extends Integer> values) {
            this.ensureGotScoreIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotScore_);
            this.onChanged();
            return this;
         }

         public Builder clearGotScore() {
            this.gotScore_ = NationalDayMsg.S2C_BeatDrum_15204.emptyIntList();
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

   public static final class C2S_Sacrifice_15205 extends GeneratedMessageV3 implements C2S_Sacrifice_15205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_Sacrifice_15205 DEFAULT_INSTANCE = new C2S_Sacrifice_15205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sacrifice_15205> PARSER = new AbstractParser<C2S_Sacrifice_15205>() {
         public C2S_Sacrifice_15205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sacrifice_15205(input, extensionRegistry);
         }
      };

      private C2S_Sacrifice_15205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sacrifice_15205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sacrifice_15205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sacrifice_15205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.count_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sacrifice_15205.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Sacrifice_15205)) {
            return super.equals(obj);
         } else {
            C2S_Sacrifice_15205 other = (C2S_Sacrifice_15205)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
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
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Sacrifice_15205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data);
      }

      public static C2S_Sacrifice_15205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sacrifice_15205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data);
      }

      public static C2S_Sacrifice_15205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sacrifice_15205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data);
      }

      public static C2S_Sacrifice_15205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sacrifice_15205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sacrifice_15205 parseFrom(InputStream input) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sacrifice_15205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sacrifice_15205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sacrifice_15205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sacrifice_15205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sacrifice_15205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sacrifice_15205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sacrifice_15205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sacrifice_15205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sacrifice_15205> parser() {
         return PARSER;
      }

      public Parser<C2S_Sacrifice_15205> getParserForType() {
         return PARSER;
      }

      public C2S_Sacrifice_15205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sacrifice_15205OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sacrifice_15205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_Sacrifice_15205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_Sacrifice_15205_descriptor;
         }

         public C2S_Sacrifice_15205 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_Sacrifice_15205.getDefaultInstance();
         }

         public C2S_Sacrifice_15205 build() {
            C2S_Sacrifice_15205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sacrifice_15205 buildPartial() {
            C2S_Sacrifice_15205 result = new C2S_Sacrifice_15205(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof C2S_Sacrifice_15205) {
               return this.mergeFrom((C2S_Sacrifice_15205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sacrifice_15205 other) {
            if (other == NationalDayMsg.C2S_Sacrifice_15205.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Sacrifice_15205 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sacrifice_15205)NationalDayMsg.C2S_Sacrifice_15205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sacrifice_15205)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
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

   public static final class S2C_Sacrifice_15206 extends GeneratedMessageV3 implements S2C_Sacrifice_15206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREECOUNT_FIELD_NUMBER = 1;
      private int freeCount_;
      public static final int CYCLECOUNT_FIELD_NUMBER = 2;
      private int cycleCount_;
      public static final int PROCESS_FIELD_NUMBER = 3;
      private int process_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 4;
      private int sacrificeCount_;
      public static final int COUNT_FIELD_NUMBER = 5;
      private int count_;
      private byte memoizedIsInitialized;
      private static final S2C_Sacrifice_15206 DEFAULT_INSTANCE = new S2C_Sacrifice_15206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Sacrifice_15206> PARSER = new AbstractParser<S2C_Sacrifice_15206>() {
         public S2C_Sacrifice_15206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Sacrifice_15206(input, extensionRegistry);
         }
      };

      private S2C_Sacrifice_15206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Sacrifice_15206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Sacrifice_15206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Sacrifice_15206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.freeCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.cycleCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.process_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.sacrificeCount_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.count_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Sacrifice_15206.class, Builder.class);
      }

      public boolean hasFreeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFreeCount() {
         return this.freeCount_;
      }

      public boolean hasCycleCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCycleCount() {
         return this.cycleCount_;
      }

      public boolean hasProcess() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getProcess() {
         return this.process_;
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCycleCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.freeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.cycleCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.process_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.freeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.cycleCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.process_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Sacrifice_15206)) {
            return super.equals(obj);
         } else {
            S2C_Sacrifice_15206 other = (S2C_Sacrifice_15206)obj;
            if (this.hasFreeCount() != other.hasFreeCount()) {
               return false;
            } else if (this.hasFreeCount() && this.getFreeCount() != other.getFreeCount()) {
               return false;
            } else if (this.hasCycleCount() != other.hasCycleCount()) {
               return false;
            } else if (this.hasCycleCount() && this.getCycleCount() != other.getCycleCount()) {
               return false;
            } else if (this.hasProcess() != other.hasProcess()) {
               return false;
            } else if (this.hasProcess() && this.getProcess() != other.getProcess()) {
               return false;
            } else if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
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
            if (this.hasFreeCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFreeCount();
            }

            if (this.hasCycleCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCycleCount();
            }

            if (this.hasProcess()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProcess();
            }

            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Sacrifice_15206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data);
      }

      public static S2C_Sacrifice_15206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sacrifice_15206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data);
      }

      public static S2C_Sacrifice_15206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sacrifice_15206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data);
      }

      public static S2C_Sacrifice_15206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Sacrifice_15206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Sacrifice_15206 parseFrom(InputStream input) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Sacrifice_15206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Sacrifice_15206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Sacrifice_15206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Sacrifice_15206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Sacrifice_15206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Sacrifice_15206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Sacrifice_15206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Sacrifice_15206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Sacrifice_15206> parser() {
         return PARSER;
      }

      public Parser<S2C_Sacrifice_15206> getParserForType() {
         return PARSER;
      }

      public S2C_Sacrifice_15206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Sacrifice_15206OrBuilder {
         private int bitField0_;
         private int freeCount_;
         private int cycleCount_;
         private int process_;
         private int sacrificeCount_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Sacrifice_15206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_Sacrifice_15206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.freeCount_ = 0;
            this.bitField0_ &= -2;
            this.cycleCount_ = 0;
            this.bitField0_ &= -3;
            this.process_ = 0;
            this.bitField0_ &= -5;
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -9;
            this.count_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_Sacrifice_15206_descriptor;
         }

         public S2C_Sacrifice_15206 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_Sacrifice_15206.getDefaultInstance();
         }

         public S2C_Sacrifice_15206 build() {
            S2C_Sacrifice_15206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Sacrifice_15206 buildPartial() {
            S2C_Sacrifice_15206 result = new S2C_Sacrifice_15206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.freeCount_ = this.freeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.cycleCount_ = this.cycleCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.process_ = this.process_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 16;
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
            if (other instanceof S2C_Sacrifice_15206) {
               return this.mergeFrom((S2C_Sacrifice_15206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Sacrifice_15206 other) {
            if (other == NationalDayMsg.S2C_Sacrifice_15206.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFreeCount()) {
                  this.setFreeCount(other.getFreeCount());
               }

               if (other.hasCycleCount()) {
                  this.setCycleCount(other.getCycleCount());
               }

               if (other.hasProcess()) {
                  this.setProcess(other.getProcess());
               }

               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFreeCount()) {
               return false;
            } else if (!this.hasCycleCount()) {
               return false;
            } else if (!this.hasProcess()) {
               return false;
            } else if (!this.hasSacrificeCount()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Sacrifice_15206 parsedMessage = null;

            try {
               parsedMessage = (S2C_Sacrifice_15206)NationalDayMsg.S2C_Sacrifice_15206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Sacrifice_15206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFreeCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFreeCount() {
            return this.freeCount_;
         }

         public Builder setFreeCount(int value) {
            this.bitField0_ |= 1;
            this.freeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeCount() {
            this.bitField0_ &= -2;
            this.freeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCycleCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCycleCount() {
            return this.cycleCount_;
         }

         public Builder setCycleCount(int value) {
            this.bitField0_ |= 2;
            this.cycleCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCycleCount() {
            this.bitField0_ &= -3;
            this.cycleCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProcess() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getProcess() {
            return this.process_;
         }

         public Builder setProcess(int value) {
            this.bitField0_ |= 4;
            this.process_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProcess() {
            this.bitField0_ &= -5;
            this.process_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 8;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -9;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 16;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -17;
            this.count_ = 0;
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

   public static final class S2C_SacrificeProcess_15208 extends GeneratedMessageV3 implements S2C_SacrificeProcess_15208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERPROCESS_FIELD_NUMBER = 1;
      private int serverProcess_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeProcess_15208 DEFAULT_INSTANCE = new S2C_SacrificeProcess_15208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeProcess_15208> PARSER = new AbstractParser<S2C_SacrificeProcess_15208>() {
         public S2C_SacrificeProcess_15208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeProcess_15208(input, extensionRegistry);
         }
      };

      private S2C_SacrificeProcess_15208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeProcess_15208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeProcess_15208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeProcess_15208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverProcess_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeProcess_15208.class, Builder.class);
      }

      public boolean hasServerProcess() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerProcess() {
         return this.serverProcess_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverProcess_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverProcess_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeProcess_15208)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeProcess_15208 other = (S2C_SacrificeProcess_15208)obj;
            if (this.hasServerProcess() != other.hasServerProcess()) {
               return false;
            } else if (this.hasServerProcess() && this.getServerProcess() != other.getServerProcess()) {
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
            if (this.hasServerProcess()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerProcess();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeProcess_15208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeProcess_15208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeProcess_15208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeProcess_15208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeProcess_15208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeProcess_15208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeProcess_15208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeProcess_15208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeProcess_15208> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeProcess_15208> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeProcess_15208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeProcess_15208OrBuilder {
         private int bitField0_;
         private int serverProcess_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeProcess_15208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_SacrificeProcess_15208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverProcess_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeProcess_15208_descriptor;
         }

         public S2C_SacrificeProcess_15208 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_SacrificeProcess_15208.getDefaultInstance();
         }

         public S2C_SacrificeProcess_15208 build() {
            S2C_SacrificeProcess_15208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeProcess_15208 buildPartial() {
            S2C_SacrificeProcess_15208 result = new S2C_SacrificeProcess_15208(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverProcess_ = this.serverProcess_;
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
            if (other instanceof S2C_SacrificeProcess_15208) {
               return this.mergeFrom((S2C_SacrificeProcess_15208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeProcess_15208 other) {
            if (other == NationalDayMsg.S2C_SacrificeProcess_15208.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerProcess()) {
                  this.setServerProcess(other.getServerProcess());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasServerProcess();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeProcess_15208 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeProcess_15208)NationalDayMsg.S2C_SacrificeProcess_15208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeProcess_15208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerProcess() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerProcess() {
            return this.serverProcess_;
         }

         public Builder setServerProcess(int value) {
            this.bitField0_ |= 1;
            this.serverProcess_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerProcess() {
            this.bitField0_ &= -2;
            this.serverProcess_ = 0;
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

   public static final class C2S_SacrificeReward_15209 extends GeneratedMessageV3 implements C2S_SacrificeReward_15209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeReward_15209 DEFAULT_INSTANCE = new C2S_SacrificeReward_15209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeReward_15209> PARSER = new AbstractParser<C2S_SacrificeReward_15209>() {
         public C2S_SacrificeReward_15209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeReward_15209(input, extensionRegistry);
         }
      };

      private C2S_SacrificeReward_15209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeReward_15209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeReward_15209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeReward_15209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeReward_15209.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SacrificeReward_15209)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeReward_15209 other = (C2S_SacrificeReward_15209)obj;
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

      public static C2S_SacrificeReward_15209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeReward_15209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeReward_15209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeReward_15209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeReward_15209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeReward_15209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeReward_15209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeReward_15209 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeReward_15209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeReward_15209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeReward_15209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeReward_15209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeReward_15209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeReward_15209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeReward_15209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeReward_15209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeReward_15209> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeReward_15209> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeReward_15209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeReward_15209OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeReward_15209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_SacrificeReward_15209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeReward_15209_descriptor;
         }

         public C2S_SacrificeReward_15209 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_SacrificeReward_15209.getDefaultInstance();
         }

         public C2S_SacrificeReward_15209 build() {
            C2S_SacrificeReward_15209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeReward_15209 buildPartial() {
            C2S_SacrificeReward_15209 result = new C2S_SacrificeReward_15209(this);
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
            if (other instanceof C2S_SacrificeReward_15209) {
               return this.mergeFrom((C2S_SacrificeReward_15209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeReward_15209 other) {
            if (other == NationalDayMsg.C2S_SacrificeReward_15209.getDefaultInstance()) {
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
            C2S_SacrificeReward_15209 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeReward_15209)NationalDayMsg.C2S_SacrificeReward_15209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeReward_15209)e.getUnfinishedMessage();
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

   public static final class S2C_SacrificeReward_15210 extends GeneratedMessageV3 implements S2C_SacrificeReward_15210OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeReward_15210 DEFAULT_INSTANCE = new S2C_SacrificeReward_15210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeReward_15210> PARSER = new AbstractParser<S2C_SacrificeReward_15210>() {
         public S2C_SacrificeReward_15210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeReward_15210(input, extensionRegistry);
         }
      };

      private S2C_SacrificeReward_15210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeReward_15210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeReward_15210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeReward_15210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeReward_15210.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SacrificeReward_15210)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeReward_15210 other = (S2C_SacrificeReward_15210)obj;
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

      public static S2C_SacrificeReward_15210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_15210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_15210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_15210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_15210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeReward_15210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeReward_15210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeReward_15210 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_15210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeReward_15210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_15210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeReward_15210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeReward_15210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeReward_15210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeReward_15210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeReward_15210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeReward_15210> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeReward_15210> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeReward_15210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeReward_15210OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeReward_15210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_SacrificeReward_15210.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeReward_15210_descriptor;
         }

         public S2C_SacrificeReward_15210 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_SacrificeReward_15210.getDefaultInstance();
         }

         public S2C_SacrificeReward_15210 build() {
            S2C_SacrificeReward_15210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeReward_15210 buildPartial() {
            S2C_SacrificeReward_15210 result = new S2C_SacrificeReward_15210(this);
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
            if (other instanceof S2C_SacrificeReward_15210) {
               return this.mergeFrom((S2C_SacrificeReward_15210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeReward_15210 other) {
            if (other == NationalDayMsg.S2C_SacrificeReward_15210.getDefaultInstance()) {
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
            S2C_SacrificeReward_15210 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeReward_15210)NationalDayMsg.S2C_SacrificeReward_15210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeReward_15210)e.getUnfinishedMessage();
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

   public static final class C2S_SacrificeRoundReward_15211 extends GeneratedMessageV3 implements C2S_SacrificeRoundReward_15211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeRoundReward_15211 DEFAULT_INSTANCE = new C2S_SacrificeRoundReward_15211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeRoundReward_15211> PARSER = new AbstractParser<C2S_SacrificeRoundReward_15211>() {
         public C2S_SacrificeRoundReward_15211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeRoundReward_15211(input, extensionRegistry);
         }
      };

      private C2S_SacrificeRoundReward_15211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeRoundReward_15211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeRoundReward_15211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeRoundReward_15211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeRoundReward_15211.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SacrificeRoundReward_15211)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeRoundReward_15211 other = (C2S_SacrificeRoundReward_15211)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRoundReward_15211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeRoundReward_15211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRoundReward_15211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRoundReward_15211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRoundReward_15211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeRoundReward_15211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeRoundReward_15211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeRoundReward_15211> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeRoundReward_15211> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeRoundReward_15211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeRoundReward_15211OrBuilder {
         private int bitField0_;
         private int round_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeRoundReward_15211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_SacrificeRoundReward_15211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_SacrificeRoundReward_15211_descriptor;
         }

         public C2S_SacrificeRoundReward_15211 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_SacrificeRoundReward_15211.getDefaultInstance();
         }

         public C2S_SacrificeRoundReward_15211 build() {
            C2S_SacrificeRoundReward_15211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeRoundReward_15211 buildPartial() {
            C2S_SacrificeRoundReward_15211 result = new C2S_SacrificeRoundReward_15211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
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
            if (other instanceof C2S_SacrificeRoundReward_15211) {
               return this.mergeFrom((C2S_SacrificeRoundReward_15211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeRoundReward_15211 other) {
            if (other == NationalDayMsg.C2S_SacrificeRoundReward_15211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SacrificeRoundReward_15211 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeRoundReward_15211)NationalDayMsg.C2S_SacrificeRoundReward_15211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeRoundReward_15211)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_SacrificeRoundReward_15212 extends GeneratedMessageV3 implements S2C_SacrificeRoundReward_15212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeRoundReward_15212 DEFAULT_INSTANCE = new S2C_SacrificeRoundReward_15212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeRoundReward_15212> PARSER = new AbstractParser<S2C_SacrificeRoundReward_15212>() {
         public S2C_SacrificeRoundReward_15212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeRoundReward_15212(input, extensionRegistry);
         }
      };

      private S2C_SacrificeRoundReward_15212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeRoundReward_15212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeRoundReward_15212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeRoundReward_15212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRoundReward_15212.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeRoundReward_15212)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeRoundReward_15212 other = (S2C_SacrificeRoundReward_15212)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRoundReward_15212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRoundReward_15212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRoundReward_15212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRoundReward_15212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRoundReward_15212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeRoundReward_15212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeRoundReward_15212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeRoundReward_15212> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeRoundReward_15212> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeRoundReward_15212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeRoundReward_15212OrBuilder {
         private int bitField0_;
         private int round_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRoundReward_15212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_SacrificeRoundReward_15212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_SacrificeRoundReward_15212_descriptor;
         }

         public S2C_SacrificeRoundReward_15212 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_SacrificeRoundReward_15212.getDefaultInstance();
         }

         public S2C_SacrificeRoundReward_15212 build() {
            S2C_SacrificeRoundReward_15212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeRoundReward_15212 buildPartial() {
            S2C_SacrificeRoundReward_15212 result = new S2C_SacrificeRoundReward_15212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
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
            if (other instanceof S2C_SacrificeRoundReward_15212) {
               return this.mergeFrom((S2C_SacrificeRoundReward_15212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeRoundReward_15212 other) {
            if (other == NationalDayMsg.S2C_SacrificeRoundReward_15212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeRoundReward_15212 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeRoundReward_15212)NationalDayMsg.S2C_SacrificeRoundReward_15212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeRoundReward_15212)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DrumLevelReward_15213 extends GeneratedMessageV3 implements C2S_DrumLevelReward_15213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTID_FIELD_NUMBER = 1;
      private int gotId_;
      private byte memoizedIsInitialized;
      private static final C2S_DrumLevelReward_15213 DEFAULT_INSTANCE = new C2S_DrumLevelReward_15213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrumLevelReward_15213> PARSER = new AbstractParser<C2S_DrumLevelReward_15213>() {
         public C2S_DrumLevelReward_15213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrumLevelReward_15213(input, extensionRegistry);
         }
      };

      private C2S_DrumLevelReward_15213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrumLevelReward_15213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrumLevelReward_15213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrumLevelReward_15213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotId_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrumLevelReward_15213.class, Builder.class);
      }

      public boolean hasGotId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotId() {
         return this.gotId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DrumLevelReward_15213)) {
            return super.equals(obj);
         } else {
            C2S_DrumLevelReward_15213 other = (C2S_DrumLevelReward_15213)obj;
            if (this.hasGotId() != other.hasGotId()) {
               return false;
            } else if (this.hasGotId() && this.getGotId() != other.getGotId()) {
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
            if (this.hasGotId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DrumLevelReward_15213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrumLevelReward_15213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(InputStream input) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrumLevelReward_15213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_15213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrumLevelReward_15213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrumLevelReward_15213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrumLevelReward_15213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrumLevelReward_15213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrumLevelReward_15213> parser() {
         return PARSER;
      }

      public Parser<C2S_DrumLevelReward_15213> getParserForType() {
         return PARSER;
      }

      public C2S_DrumLevelReward_15213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrumLevelReward_15213OrBuilder {
         private int bitField0_;
         private int gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrumLevelReward_15213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.C2S_DrumLevelReward_15213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_C2S_DrumLevelReward_15213_descriptor;
         }

         public C2S_DrumLevelReward_15213 getDefaultInstanceForType() {
            return NationalDayMsg.C2S_DrumLevelReward_15213.getDefaultInstance();
         }

         public C2S_DrumLevelReward_15213 build() {
            C2S_DrumLevelReward_15213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrumLevelReward_15213 buildPartial() {
            C2S_DrumLevelReward_15213 result = new C2S_DrumLevelReward_15213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotId_ = this.gotId_;
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
            if (other instanceof C2S_DrumLevelReward_15213) {
               return this.mergeFrom((C2S_DrumLevelReward_15213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrumLevelReward_15213 other) {
            if (other == NationalDayMsg.C2S_DrumLevelReward_15213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotId()) {
                  this.setGotId(other.getGotId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DrumLevelReward_15213 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrumLevelReward_15213)NationalDayMsg.C2S_DrumLevelReward_15213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrumLevelReward_15213)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotId() {
            return this.gotId_;
         }

         public Builder setGotId(int value) {
            this.bitField0_ |= 1;
            this.gotId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.bitField0_ &= -2;
            this.gotId_ = 0;
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

   public static final class S2C_DrumLevelReward_15214 extends GeneratedMessageV3 implements S2C_DrumLevelReward_15214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTID_FIELD_NUMBER = 1;
      private int gotId_;
      private byte memoizedIsInitialized;
      private static final S2C_DrumLevelReward_15214 DEFAULT_INSTANCE = new S2C_DrumLevelReward_15214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrumLevelReward_15214> PARSER = new AbstractParser<S2C_DrumLevelReward_15214>() {
         public S2C_DrumLevelReward_15214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrumLevelReward_15214(input, extensionRegistry);
         }
      };

      private S2C_DrumLevelReward_15214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrumLevelReward_15214() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrumLevelReward_15214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrumLevelReward_15214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotId_ = input.readInt32();
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
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrumLevelReward_15214.class, Builder.class);
      }

      public boolean hasGotId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotId() {
         return this.gotId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DrumLevelReward_15214)) {
            return super.equals(obj);
         } else {
            S2C_DrumLevelReward_15214 other = (S2C_DrumLevelReward_15214)obj;
            if (this.hasGotId() != other.hasGotId()) {
               return false;
            } else if (this.hasGotId() && this.getGotId() != other.getGotId()) {
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
            if (this.hasGotId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DrumLevelReward_15214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrumLevelReward_15214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(InputStream input) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrumLevelReward_15214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_15214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrumLevelReward_15214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrumLevelReward_15214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrumLevelReward_15214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrumLevelReward_15214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrumLevelReward_15214> parser() {
         return PARSER;
      }

      public Parser<S2C_DrumLevelReward_15214> getParserForType() {
         return PARSER;
      }

      public S2C_DrumLevelReward_15214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrumLevelReward_15214OrBuilder {
         private int bitField0_;
         private int gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrumLevelReward_15214.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NationalDayMsg.S2C_DrumLevelReward_15214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NationalDayMsg.internal_static_nationalDay_com_gzbz_protobuf_S2C_DrumLevelReward_15214_descriptor;
         }

         public S2C_DrumLevelReward_15214 getDefaultInstanceForType() {
            return NationalDayMsg.S2C_DrumLevelReward_15214.getDefaultInstance();
         }

         public S2C_DrumLevelReward_15214 build() {
            S2C_DrumLevelReward_15214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrumLevelReward_15214 buildPartial() {
            S2C_DrumLevelReward_15214 result = new S2C_DrumLevelReward_15214(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotId_ = this.gotId_;
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
            if (other instanceof S2C_DrumLevelReward_15214) {
               return this.mergeFrom((S2C_DrumLevelReward_15214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrumLevelReward_15214 other) {
            if (other == NationalDayMsg.S2C_DrumLevelReward_15214.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotId()) {
                  this.setGotId(other.getGotId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DrumLevelReward_15214 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrumLevelReward_15214)NationalDayMsg.S2C_DrumLevelReward_15214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrumLevelReward_15214)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotId() {
            return this.gotId_;
         }

         public Builder setGotId(int value) {
            this.bitField0_ |= 1;
            this.gotId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.bitField0_ &= -2;
            this.gotId_ = 0;
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

   public interface C2S_BeatDrum_15203OrBuilder extends MessageOrBuilder {
      boolean hasMusicId();

      int getMusicId();

      boolean hasScore();

      int getScore();
   }

   public interface C2S_DrumLevelReward_15213OrBuilder extends MessageOrBuilder {
      boolean hasGotId();

      int getGotId();
   }

   public interface C2S_Main_15201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SacrificeReward_15209OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_SacrificeRoundReward_15211OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();
   }

   public interface C2S_Sacrifice_15205OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface MusicDataOrBuilder extends MessageOrBuilder {
      boolean hasMusicId();

      int getMusicId();

      boolean hasTopScore();

      int getTopScore();

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);
   }

   public interface RoundDataOrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasRoundReward();

      boolean getRoundReward();

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);
   }

   public interface S2C_BeatDrum_15204OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasMusicId();

      int getMusicId();

      boolean hasBeatCount();

      int getBeatCount();

      boolean hasTopScore();

      int getTopScore();

      List<Integer> getGotScoreList();

      int getGotScoreCount();

      int getGotScore(int index);
   }

   public interface S2C_DrumLevelReward_15214OrBuilder extends MessageOrBuilder {
      boolean hasGotId();

      int getGotId();
   }

   public interface S2C_Main_15202OrBuilder extends MessageOrBuilder {
      boolean hasBeatCount();

      int getBeatCount();

      List<MusicData> getMusicDataList();

      MusicData getMusicData(int index);

      int getMusicDataCount();

      List<? extends MusicDataOrBuilder> getMusicDataOrBuilderList();

      MusicDataOrBuilder getMusicDataOrBuilder(int index);

      List<RoundData> getRoundDataList();

      RoundData getRoundData(int index);

      int getRoundDataCount();

      List<? extends RoundDataOrBuilder> getRoundDataOrBuilderList();

      RoundDataOrBuilder getRoundDataOrBuilder(int index);

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);

      boolean hasFreeCount();

      int getFreeCount();

      boolean hasCycleCount();

      int getCycleCount();

      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasServerProcess();

      int getServerProcess();
   }

   public interface S2C_SacrificeProcess_15208OrBuilder extends MessageOrBuilder {
      boolean hasServerProcess();

      int getServerProcess();
   }

   public interface S2C_SacrificeReward_15210OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_SacrificeRoundReward_15212OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();
   }

   public interface S2C_Sacrifice_15206OrBuilder extends MessageOrBuilder {
      boolean hasFreeCount();

      int getFreeCount();

      boolean hasCycleCount();

      int getCycleCount();

      boolean hasProcess();

      int getProcess();

      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasCount();

      int getCount();
   }
}
