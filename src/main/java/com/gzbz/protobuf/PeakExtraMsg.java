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

public final class PeakExtraMsg {
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_RedPacket_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private PeakExtraMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fPeakExtra.proto\u0012\u001bpeakextra.com.gzbz.protobuf\u001a\fcommon.proto\"\u0017\n\u0015C2S_TopThreeInfo_4468\"Q\n\u0015S2C_TopThreeInfo_4469\u00128\n\u0005infos\u0018\u0001 \u0003(\u000b2).peakextra.com.gzbz.protobuf.TopThreeInfo\"o\n\fTopThreeInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0002 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0010\n\bserverId\u0018\b \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\t \u0001(\u0005\".\n\u001aC2S_PeakRedPacketList_4470\u0012\u0010\n\bpacketId\u0018\u0001 \u0002(\u0005\"W\n\u001aS2C_PeakRedPacketList_4471\u00129\n\tredPacket\u0018\u0001 \u0001(\u000b2&.peakextra.com.gzbz.protobuf.RedPacket\"'\n\u0019C2S_ReceiveRedPacket_4472\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"k\n\u0019S2C_ReceiveRedPacket_4473\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012B\n\bpickInfo\u0018\u0003 \u0003(\u000b20.peakextra.com.gzbz.protobuf.RedPacketPlayerData\"\u009b\u0001\n\tRedPacket\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bpacketId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007leftNum\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003sum\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0005 \u0002(\u0005\u0012D\n\nsendPlayer\u0018\u0006 \u0002(\u000b20.peakextra.com.gzbz.protobuf.RedPacketPlayerData\"\u0085\u0001\n\u0013RedPacketPlayerData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0006 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0007 \u0001(\u0005\u0012\u000b\n\u0003num\u0018\b \u0001(\u0005\">\n\u001cS2S_NotifyRedPacketInfo_4474\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\"/\n\u001fS2S_NotifyTerminationAward_4475\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\"\u0015\n\u0013C2S_EnterMatch_4476\"J\n\u0013S2C_EnterMatch_4477\u0012 \n\u0004data\u0018\u0003 \u0001(\u000b2\u0012.common.PlayerInfo\u0012\u0011\n\tmatchTime\u0018\u0004 \u0001(\u0005\"M\n\u0018S2C_NotifyRedPacket_4478\u0012\u0013\n\u000bredPacketId\u0018\u0001 \u0003(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006tempId\u0018\u0003 \u0003(\u0005\"D\n\u001cS2C_NotifyReceivePacket_4479\u0012\u0013\n\u000bredPacketId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007leftNum\u0018\u0002 \u0002(\u0005\"-\n\u001aS2S_serverTermination_4480\u0012\u000f\n\u0007opValue\u0018\u0002 \u0001(\u0005\".\n\u001eS2S_serverTerminationRank_4481\u0012\f\n\u0004rank\u0018\u0002 \u0001(\u0005B#\n\u0011com.gzbz.protobufB\fPeakExtraMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor, new String[0]);
      internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor, new String[]{"Infos"});
      internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor, new String[]{"Rank", "Head", "HeadFrame", "Name", "ServerId", "PlayerId"});
      internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor, new String[]{"PacketId"});
      internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor, new String[]{"RedPacket"});
      internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor, new String[]{"Id"});
      internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor, new String[]{"Id", "PickInfo"});
      internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_peakextra_com_gzbz_protobuf_RedPacket_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor, new String[]{"Id", "PacketId", "LeftNum", "Sum", "Time", "SendPlayer"});
      internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor, new String[]{"PlayerId", "PlayerName", "Head", "HeadFrame", "Rank", "Time", "Num"});
      internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor, new String[]{"PlayerId", "Rank"});
      internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor, new String[]{"Rank"});
      internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor, new String[0]);
      internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor, new String[]{"Data", "MatchTime"});
      internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor, new String[]{"RedPacketId", "Type", "TempId"});
      internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor, new String[]{"RedPacketId", "LeftNum"});
      internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor, new String[]{"OpValue"});
      internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor, new String[]{"Rank"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_TopThreeInfo_4468 extends GeneratedMessageV3 implements C2S_TopThreeInfo_4468OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TopThreeInfo_4468 DEFAULT_INSTANCE = new C2S_TopThreeInfo_4468();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TopThreeInfo_4468> PARSER = new AbstractParser<C2S_TopThreeInfo_4468>() {
         public C2S_TopThreeInfo_4468 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TopThreeInfo_4468(input, extensionRegistry);
         }
      };

      private C2S_TopThreeInfo_4468(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TopThreeInfo_4468() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TopThreeInfo_4468();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TopThreeInfo_4468(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TopThreeInfo_4468.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TopThreeInfo_4468)) {
            return super.equals(obj);
         } else {
            C2S_TopThreeInfo_4468 other = (C2S_TopThreeInfo_4468)obj;
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

      public static C2S_TopThreeInfo_4468 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TopThreeInfo_4468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(InputStream input) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TopThreeInfo_4468 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TopThreeInfo_4468 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TopThreeInfo_4468 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TopThreeInfo_4468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TopThreeInfo_4468 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TopThreeInfo_4468 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TopThreeInfo_4468> parser() {
         return PARSER;
      }

      public Parser<C2S_TopThreeInfo_4468> getParserForType() {
         return PARSER;
      }

      public C2S_TopThreeInfo_4468 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TopThreeInfo_4468OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TopThreeInfo_4468.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.C2S_TopThreeInfo_4468.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_TopThreeInfo_4468_descriptor;
         }

         public C2S_TopThreeInfo_4468 getDefaultInstanceForType() {
            return PeakExtraMsg.C2S_TopThreeInfo_4468.getDefaultInstance();
         }

         public C2S_TopThreeInfo_4468 build() {
            C2S_TopThreeInfo_4468 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TopThreeInfo_4468 buildPartial() {
            C2S_TopThreeInfo_4468 result = new C2S_TopThreeInfo_4468(this);
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
            if (other instanceof C2S_TopThreeInfo_4468) {
               return this.mergeFrom((C2S_TopThreeInfo_4468)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TopThreeInfo_4468 other) {
            if (other == PeakExtraMsg.C2S_TopThreeInfo_4468.getDefaultInstance()) {
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
            C2S_TopThreeInfo_4468 parsedMessage = null;

            try {
               parsedMessage = (C2S_TopThreeInfo_4468)PeakExtraMsg.C2S_TopThreeInfo_4468.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TopThreeInfo_4468)e.getUnfinishedMessage();
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

   public static final class S2C_TopThreeInfo_4469 extends GeneratedMessageV3 implements S2C_TopThreeInfo_4469OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<TopThreeInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_TopThreeInfo_4469 DEFAULT_INSTANCE = new S2C_TopThreeInfo_4469();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TopThreeInfo_4469> PARSER = new AbstractParser<S2C_TopThreeInfo_4469>() {
         public S2C_TopThreeInfo_4469 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TopThreeInfo_4469(input, extensionRegistry);
         }
      };

      private S2C_TopThreeInfo_4469(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TopThreeInfo_4469() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TopThreeInfo_4469();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TopThreeInfo_4469(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(PeakExtraMsg.TopThreeInfo.PARSER, extensionRegistry));
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TopThreeInfo_4469.class, Builder.class);
      }

      public List<TopThreeInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends TopThreeInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public TopThreeInfo getInfos(int index) {
         return (TopThreeInfo)this.infos_.get(index);
      }

      public TopThreeInfoOrBuilder getInfosOrBuilder(int index) {
         return (TopThreeInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_TopThreeInfo_4469)) {
            return super.equals(obj);
         } else {
            S2C_TopThreeInfo_4469 other = (S2C_TopThreeInfo_4469)obj;
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

      public static S2C_TopThreeInfo_4469 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TopThreeInfo_4469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(InputStream input) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TopThreeInfo_4469 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TopThreeInfo_4469 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TopThreeInfo_4469 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TopThreeInfo_4469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TopThreeInfo_4469 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TopThreeInfo_4469 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TopThreeInfo_4469> parser() {
         return PARSER;
      }

      public Parser<S2C_TopThreeInfo_4469> getParserForType() {
         return PARSER;
      }

      public S2C_TopThreeInfo_4469 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TopThreeInfo_4469OrBuilder {
         private int bitField0_;
         private List<TopThreeInfo> infos_;
         private RepeatedFieldBuilderV3<TopThreeInfo, TopThreeInfo.Builder, TopThreeInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TopThreeInfo_4469.class, Builder.class);
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
            if (PeakExtraMsg.S2C_TopThreeInfo_4469.alwaysUseFieldBuilders) {
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
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_TopThreeInfo_4469_descriptor;
         }

         public S2C_TopThreeInfo_4469 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_TopThreeInfo_4469.getDefaultInstance();
         }

         public S2C_TopThreeInfo_4469 build() {
            S2C_TopThreeInfo_4469 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TopThreeInfo_4469 buildPartial() {
            S2C_TopThreeInfo_4469 result = new S2C_TopThreeInfo_4469(this);
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
            if (other instanceof S2C_TopThreeInfo_4469) {
               return this.mergeFrom((S2C_TopThreeInfo_4469)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TopThreeInfo_4469 other) {
            if (other == PeakExtraMsg.S2C_TopThreeInfo_4469.getDefaultInstance()) {
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
                     this.infosBuilder_ = PeakExtraMsg.S2C_TopThreeInfo_4469.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_TopThreeInfo_4469 parsedMessage = null;

            try {
               parsedMessage = (S2C_TopThreeInfo_4469)PeakExtraMsg.S2C_TopThreeInfo_4469.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TopThreeInfo_4469)e.getUnfinishedMessage();
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

         public List<TopThreeInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public TopThreeInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (TopThreeInfo)this.infos_.get(index) : (TopThreeInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, TopThreeInfo value) {
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

         public Builder setInfos(int index, TopThreeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(TopThreeInfo value) {
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

         public Builder addInfos(int index, TopThreeInfo value) {
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

         public Builder addInfos(TopThreeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, TopThreeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends TopThreeInfo> values) {
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

         public TopThreeInfo.Builder getInfosBuilder(int index) {
            return (TopThreeInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public TopThreeInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (TopThreeInfoOrBuilder)this.infos_.get(index) : (TopThreeInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TopThreeInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public TopThreeInfo.Builder addInfosBuilder() {
            return (TopThreeInfo.Builder)this.getInfosFieldBuilder().addBuilder(PeakExtraMsg.TopThreeInfo.getDefaultInstance());
         }

         public TopThreeInfo.Builder addInfosBuilder(int index) {
            return (TopThreeInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PeakExtraMsg.TopThreeInfo.getDefaultInstance());
         }

         public List<TopThreeInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TopThreeInfo, TopThreeInfo.Builder, TopThreeInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class TopThreeInfo extends GeneratedMessageV3 implements TopThreeInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int HEAD_FIELD_NUMBER = 2;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 3;
      private int headFrame_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int SERVERID_FIELD_NUMBER = 8;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 9;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final TopThreeInfo DEFAULT_INSTANCE = new TopThreeInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TopThreeInfo> PARSER = new AbstractParser<TopThreeInfo>() {
         public TopThreeInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TopThreeInfo(input, extensionRegistry);
         }
      };

      private TopThreeInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TopThreeInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TopThreeInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TopThreeInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.head_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.name_ = bs;
                        break;
                     case 64:
                        this.bitField0_ |= 16;
                        this.serverId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 32;
                        this.playerId_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TopThreeInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.head_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.headFrame_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.serverId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(9, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.head_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.headFrame_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TopThreeInfo)) {
            return super.equals(obj);
         } else {
            TopThreeInfo other = (TopThreeInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TopThreeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data);
      }

      public static TopThreeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TopThreeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data);
      }

      public static TopThreeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TopThreeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data);
      }

      public static TopThreeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TopThreeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TopThreeInfo parseFrom(InputStream input) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TopThreeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TopThreeInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TopThreeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TopThreeInfo parseFrom(CodedInputStream input) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TopThreeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TopThreeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TopThreeInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TopThreeInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TopThreeInfo> parser() {
         return PARSER;
      }

      public Parser<TopThreeInfo> getParserForType() {
         return PARSER;
      }

      public TopThreeInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TopThreeInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int head_;
         private int headFrame_;
         private Object name_;
         private int serverId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TopThreeInfo.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.TopThreeInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.bitField0_ &= -3;
            this.headFrame_ = 0;
            this.bitField0_ &= -5;
            this.name_ = "";
            this.bitField0_ &= -9;
            this.serverId_ = 0;
            this.bitField0_ &= -17;
            this.playerId_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_TopThreeInfo_descriptor;
         }

         public TopThreeInfo getDefaultInstanceForType() {
            return PeakExtraMsg.TopThreeInfo.getDefaultInstance();
         }

         public TopThreeInfo build() {
            TopThreeInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TopThreeInfo buildPartial() {
            TopThreeInfo result = new TopThreeInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 16) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof TopThreeInfo) {
               return this.mergeFrom((TopThreeInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TopThreeInfo other) {
            if (other == PeakExtraMsg.TopThreeInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 8;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else {
               return this.hasName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TopThreeInfo parsedMessage = null;

            try {
               parsedMessage = (TopThreeInfo)PeakExtraMsg.TopThreeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TopThreeInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 2;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -3;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 4;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -5;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -9;
            this.name_ = PeakExtraMsg.TopThreeInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 16;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -17;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 32;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -33;
            this.playerId_ = 0;
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

   public static final class C2S_PeakRedPacketList_4470 extends GeneratedMessageV3 implements C2S_PeakRedPacketList_4470OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKETID_FIELD_NUMBER = 1;
      private int packetId_;
      private byte memoizedIsInitialized;
      private static final C2S_PeakRedPacketList_4470 DEFAULT_INSTANCE = new C2S_PeakRedPacketList_4470();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PeakRedPacketList_4470> PARSER = new AbstractParser<C2S_PeakRedPacketList_4470>() {
         public C2S_PeakRedPacketList_4470 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PeakRedPacketList_4470(input, extensionRegistry);
         }
      };

      private C2S_PeakRedPacketList_4470(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PeakRedPacketList_4470() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PeakRedPacketList_4470();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PeakRedPacketList_4470(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.packetId_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PeakRedPacketList_4470.class, Builder.class);
      }

      public boolean hasPacketId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPacketId() {
         return this.packetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPacketId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.packetId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.packetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PeakRedPacketList_4470)) {
            return super.equals(obj);
         } else {
            C2S_PeakRedPacketList_4470 other = (C2S_PeakRedPacketList_4470)obj;
            if (this.hasPacketId() != other.hasPacketId()) {
               return false;
            } else if (this.hasPacketId() && this.getPacketId() != other.getPacketId()) {
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
            if (this.hasPacketId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPacketId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PeakRedPacketList_4470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(InputStream input) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PeakRedPacketList_4470 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PeakRedPacketList_4470 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PeakRedPacketList_4470 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PeakRedPacketList_4470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PeakRedPacketList_4470 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PeakRedPacketList_4470 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PeakRedPacketList_4470> parser() {
         return PARSER;
      }

      public Parser<C2S_PeakRedPacketList_4470> getParserForType() {
         return PARSER;
      }

      public C2S_PeakRedPacketList_4470 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PeakRedPacketList_4470OrBuilder {
         private int bitField0_;
         private int packetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PeakRedPacketList_4470.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.C2S_PeakRedPacketList_4470.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.packetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_PeakRedPacketList_4470_descriptor;
         }

         public C2S_PeakRedPacketList_4470 getDefaultInstanceForType() {
            return PeakExtraMsg.C2S_PeakRedPacketList_4470.getDefaultInstance();
         }

         public C2S_PeakRedPacketList_4470 build() {
            C2S_PeakRedPacketList_4470 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PeakRedPacketList_4470 buildPartial() {
            C2S_PeakRedPacketList_4470 result = new C2S_PeakRedPacketList_4470(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.packetId_ = this.packetId_;
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
            if (other instanceof C2S_PeakRedPacketList_4470) {
               return this.mergeFrom((C2S_PeakRedPacketList_4470)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PeakRedPacketList_4470 other) {
            if (other == PeakExtraMsg.C2S_PeakRedPacketList_4470.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPacketId()) {
                  this.setPacketId(other.getPacketId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPacketId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PeakRedPacketList_4470 parsedMessage = null;

            try {
               parsedMessage = (C2S_PeakRedPacketList_4470)PeakExtraMsg.C2S_PeakRedPacketList_4470.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PeakRedPacketList_4470)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPacketId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPacketId() {
            return this.packetId_;
         }

         public Builder setPacketId(int value) {
            this.bitField0_ |= 1;
            this.packetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPacketId() {
            this.bitField0_ &= -2;
            this.packetId_ = 0;
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

   public static final class S2C_PeakRedPacketList_4471 extends GeneratedMessageV3 implements S2C_PeakRedPacketList_4471OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REDPACKET_FIELD_NUMBER = 1;
      private RedPacket redPacket_;
      private byte memoizedIsInitialized;
      private static final S2C_PeakRedPacketList_4471 DEFAULT_INSTANCE = new S2C_PeakRedPacketList_4471();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PeakRedPacketList_4471> PARSER = new AbstractParser<S2C_PeakRedPacketList_4471>() {
         public S2C_PeakRedPacketList_4471 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PeakRedPacketList_4471(input, extensionRegistry);
         }
      };

      private S2C_PeakRedPacketList_4471(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PeakRedPacketList_4471() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PeakRedPacketList_4471();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PeakRedPacketList_4471(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RedPacket.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.redPacket_.toBuilder();
                        }

                        this.redPacket_ = (RedPacket)input.readMessage(PeakExtraMsg.RedPacket.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.redPacket_);
                           this.redPacket_ = subBuilder.buildPartial();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PeakRedPacketList_4471.class, Builder.class);
      }

      public boolean hasRedPacket() {
         return (this.bitField0_ & 1) != 0;
      }

      public RedPacket getRedPacket() {
         return this.redPacket_ == null ? PeakExtraMsg.RedPacket.getDefaultInstance() : this.redPacket_;
      }

      public RedPacketOrBuilder getRedPacketOrBuilder() {
         return this.redPacket_ == null ? PeakExtraMsg.RedPacket.getDefaultInstance() : this.redPacket_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (this.hasRedPacket() && !this.getRedPacket().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getRedPacket());
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
               size += CodedOutputStream.computeMessageSize(1, this.getRedPacket());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PeakRedPacketList_4471)) {
            return super.equals(obj);
         } else {
            S2C_PeakRedPacketList_4471 other = (S2C_PeakRedPacketList_4471)obj;
            if (this.hasRedPacket() != other.hasRedPacket()) {
               return false;
            } else if (this.hasRedPacket() && !this.getRedPacket().equals(other.getRedPacket())) {
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
            if (this.hasRedPacket()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRedPacket().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PeakRedPacketList_4471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(InputStream input) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PeakRedPacketList_4471 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PeakRedPacketList_4471 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PeakRedPacketList_4471 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PeakRedPacketList_4471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PeakRedPacketList_4471 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PeakRedPacketList_4471 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PeakRedPacketList_4471> parser() {
         return PARSER;
      }

      public Parser<S2C_PeakRedPacketList_4471> getParserForType() {
         return PARSER;
      }

      public S2C_PeakRedPacketList_4471 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PeakRedPacketList_4471OrBuilder {
         private int bitField0_;
         private RedPacket redPacket_;
         private SingleFieldBuilderV3<RedPacket, RedPacket.Builder, RedPacketOrBuilder> redPacketBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PeakRedPacketList_4471.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2C_PeakRedPacketList_4471.alwaysUseFieldBuilders) {
               this.getRedPacketFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.redPacketBuilder_ == null) {
               this.redPacket_ = null;
            } else {
               this.redPacketBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_PeakRedPacketList_4471_descriptor;
         }

         public S2C_PeakRedPacketList_4471 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_PeakRedPacketList_4471.getDefaultInstance();
         }

         public S2C_PeakRedPacketList_4471 build() {
            S2C_PeakRedPacketList_4471 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PeakRedPacketList_4471 buildPartial() {
            S2C_PeakRedPacketList_4471 result = new S2C_PeakRedPacketList_4471(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.redPacketBuilder_ == null) {
                  result.redPacket_ = this.redPacket_;
               } else {
                  result.redPacket_ = (RedPacket)this.redPacketBuilder_.build();
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
            if (other instanceof S2C_PeakRedPacketList_4471) {
               return this.mergeFrom((S2C_PeakRedPacketList_4471)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PeakRedPacketList_4471 other) {
            if (other == PeakExtraMsg.S2C_PeakRedPacketList_4471.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRedPacket()) {
                  this.mergeRedPacket(other.getRedPacket());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return !this.hasRedPacket() || this.getRedPacket().isInitialized();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PeakRedPacketList_4471 parsedMessage = null;

            try {
               parsedMessage = (S2C_PeakRedPacketList_4471)PeakExtraMsg.S2C_PeakRedPacketList_4471.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PeakRedPacketList_4471)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRedPacket() {
            return (this.bitField0_ & 1) != 0;
         }

         public RedPacket getRedPacket() {
            if (this.redPacketBuilder_ == null) {
               return this.redPacket_ == null ? PeakExtraMsg.RedPacket.getDefaultInstance() : this.redPacket_;
            } else {
               return (RedPacket)this.redPacketBuilder_.getMessage();
            }
         }

         public Builder setRedPacket(RedPacket value) {
            if (this.redPacketBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.redPacket_ = value;
               this.onChanged();
            } else {
               this.redPacketBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setRedPacket(RedPacket.Builder builderForValue) {
            if (this.redPacketBuilder_ == null) {
               this.redPacket_ = builderForValue.build();
               this.onChanged();
            } else {
               this.redPacketBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeRedPacket(RedPacket value) {
            if (this.redPacketBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.redPacket_ != null && this.redPacket_ != PeakExtraMsg.RedPacket.getDefaultInstance()) {
                  this.redPacket_ = PeakExtraMsg.RedPacket.newBuilder(this.redPacket_).mergeFrom(value).buildPartial();
               } else {
                  this.redPacket_ = value;
               }

               this.onChanged();
            } else {
               this.redPacketBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearRedPacket() {
            if (this.redPacketBuilder_ == null) {
               this.redPacket_ = null;
               this.onChanged();
            } else {
               this.redPacketBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public RedPacket.Builder getRedPacketBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (RedPacket.Builder)this.getRedPacketFieldBuilder().getBuilder();
         }

         public RedPacketOrBuilder getRedPacketOrBuilder() {
            if (this.redPacketBuilder_ != null) {
               return (RedPacketOrBuilder)this.redPacketBuilder_.getMessageOrBuilder();
            } else {
               return this.redPacket_ == null ? PeakExtraMsg.RedPacket.getDefaultInstance() : this.redPacket_;
            }
         }

         private SingleFieldBuilderV3<RedPacket, RedPacket.Builder, RedPacketOrBuilder> getRedPacketFieldBuilder() {
            if (this.redPacketBuilder_ == null) {
               this.redPacketBuilder_ = new SingleFieldBuilderV3(this.getRedPacket(), this.getParentForChildren(), this.isClean());
               this.redPacket_ = null;
            }

            return this.redPacketBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ReceiveRedPacket_4472 extends GeneratedMessageV3 implements C2S_ReceiveRedPacket_4472OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveRedPacket_4472 DEFAULT_INSTANCE = new C2S_ReceiveRedPacket_4472();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveRedPacket_4472> PARSER = new AbstractParser<C2S_ReceiveRedPacket_4472>() {
         public C2S_ReceiveRedPacket_4472 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveRedPacket_4472(input, extensionRegistry);
         }
      };

      private C2S_ReceiveRedPacket_4472(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveRedPacket_4472() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveRedPacket_4472();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveRedPacket_4472(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveRedPacket_4472.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveRedPacket_4472)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveRedPacket_4472 other = (C2S_ReceiveRedPacket_4472)obj;
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

      public static C2S_ReceiveRedPacket_4472 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRedPacket_4472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveRedPacket_4472 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRedPacket_4472 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRedPacket_4472 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRedPacket_4472)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveRedPacket_4472 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveRedPacket_4472 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveRedPacket_4472> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveRedPacket_4472> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveRedPacket_4472 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveRedPacket_4472OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveRedPacket_4472.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.C2S_ReceiveRedPacket_4472.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_ReceiveRedPacket_4472_descriptor;
         }

         public C2S_ReceiveRedPacket_4472 getDefaultInstanceForType() {
            return PeakExtraMsg.C2S_ReceiveRedPacket_4472.getDefaultInstance();
         }

         public C2S_ReceiveRedPacket_4472 build() {
            C2S_ReceiveRedPacket_4472 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveRedPacket_4472 buildPartial() {
            C2S_ReceiveRedPacket_4472 result = new C2S_ReceiveRedPacket_4472(this);
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
            if (other instanceof C2S_ReceiveRedPacket_4472) {
               return this.mergeFrom((C2S_ReceiveRedPacket_4472)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveRedPacket_4472 other) {
            if (other == PeakExtraMsg.C2S_ReceiveRedPacket_4472.getDefaultInstance()) {
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
            C2S_ReceiveRedPacket_4472 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveRedPacket_4472)PeakExtraMsg.C2S_ReceiveRedPacket_4472.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveRedPacket_4472)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveRedPacket_4473 extends GeneratedMessageV3 implements S2C_ReceiveRedPacket_4473OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int PICKINFO_FIELD_NUMBER = 3;
      private List<RedPacketPlayerData> pickInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveRedPacket_4473 DEFAULT_INSTANCE = new S2C_ReceiveRedPacket_4473();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveRedPacket_4473> PARSER = new AbstractParser<S2C_ReceiveRedPacket_4473>() {
         public S2C_ReceiveRedPacket_4473 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveRedPacket_4473(input, extensionRegistry);
         }
      };

      private S2C_ReceiveRedPacket_4473(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveRedPacket_4473() {
         this.memoizedIsInitialized = -1;
         this.pickInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveRedPacket_4473();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveRedPacket_4473(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.id_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.pickInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.pickInfo_.add(input.readMessage(PeakExtraMsg.RedPacketPlayerData.PARSER, extensionRegistry));
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
                  this.pickInfo_ = Collections.unmodifiableList(this.pickInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveRedPacket_4473.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<RedPacketPlayerData> getPickInfoList() {
         return this.pickInfo_;
      }

      public List<? extends RedPacketPlayerDataOrBuilder> getPickInfoOrBuilderList() {
         return this.pickInfo_;
      }

      public int getPickInfoCount() {
         return this.pickInfo_.size();
      }

      public RedPacketPlayerData getPickInfo(int index) {
         return (RedPacketPlayerData)this.pickInfo_.get(index);
      }

      public RedPacketPlayerDataOrBuilder getPickInfoOrBuilder(int index) {
         return (RedPacketPlayerDataOrBuilder)this.pickInfo_.get(index);
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
            for(int i = 0; i < this.getPickInfoCount(); ++i) {
               if (!this.getPickInfo(i).isInitialized()) {
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
            output.writeInt32(2, this.id_);
         }

         for(int i = 0; i < this.pickInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.pickInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            for(int i = 0; i < this.pickInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.pickInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveRedPacket_4473)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveRedPacket_4473 other = (S2C_ReceiveRedPacket_4473)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getPickInfoList().equals(other.getPickInfoList())) {
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.getPickInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPickInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRedPacket_4473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveRedPacket_4473 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRedPacket_4473 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRedPacket_4473 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRedPacket_4473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveRedPacket_4473 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveRedPacket_4473 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveRedPacket_4473> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveRedPacket_4473> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveRedPacket_4473 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveRedPacket_4473OrBuilder {
         private int bitField0_;
         private int id_;
         private List<RedPacketPlayerData> pickInfo_;
         private RepeatedFieldBuilderV3<RedPacketPlayerData, RedPacketPlayerData.Builder, RedPacketPlayerDataOrBuilder> pickInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveRedPacket_4473.class, Builder.class);
         }

         private Builder() {
            this.pickInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pickInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2C_ReceiveRedPacket_4473.alwaysUseFieldBuilders) {
               this.getPickInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.pickInfoBuilder_ == null) {
               this.pickInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.pickInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_ReceiveRedPacket_4473_descriptor;
         }

         public S2C_ReceiveRedPacket_4473 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_ReceiveRedPacket_4473.getDefaultInstance();
         }

         public S2C_ReceiveRedPacket_4473 build() {
            S2C_ReceiveRedPacket_4473 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveRedPacket_4473 buildPartial() {
            S2C_ReceiveRedPacket_4473 result = new S2C_ReceiveRedPacket_4473(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.pickInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.pickInfo_ = Collections.unmodifiableList(this.pickInfo_);
                  this.bitField0_ &= -3;
               }

               result.pickInfo_ = this.pickInfo_;
            } else {
               result.pickInfo_ = this.pickInfoBuilder_.build();
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
            if (other instanceof S2C_ReceiveRedPacket_4473) {
               return this.mergeFrom((S2C_ReceiveRedPacket_4473)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveRedPacket_4473 other) {
            if (other == PeakExtraMsg.S2C_ReceiveRedPacket_4473.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.pickInfoBuilder_ == null) {
                  if (!other.pickInfo_.isEmpty()) {
                     if (this.pickInfo_.isEmpty()) {
                        this.pickInfo_ = other.pickInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePickInfoIsMutable();
                        this.pickInfo_.addAll(other.pickInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.pickInfo_.isEmpty()) {
                  if (this.pickInfoBuilder_.isEmpty()) {
                     this.pickInfoBuilder_.dispose();
                     this.pickInfoBuilder_ = null;
                     this.pickInfo_ = other.pickInfo_;
                     this.bitField0_ &= -3;
                     this.pickInfoBuilder_ = PeakExtraMsg.S2C_ReceiveRedPacket_4473.alwaysUseFieldBuilders ? this.getPickInfoFieldBuilder() : null;
                  } else {
                     this.pickInfoBuilder_.addAllMessages(other.pickInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               for(int i = 0; i < this.getPickInfoCount(); ++i) {
                  if (!this.getPickInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveRedPacket_4473 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveRedPacket_4473)PeakExtraMsg.S2C_ReceiveRedPacket_4473.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveRedPacket_4473)e.getUnfinishedMessage();
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

         private void ensurePickInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.pickInfo_ = new ArrayList(this.pickInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<RedPacketPlayerData> getPickInfoList() {
            return this.pickInfoBuilder_ == null ? Collections.unmodifiableList(this.pickInfo_) : this.pickInfoBuilder_.getMessageList();
         }

         public int getPickInfoCount() {
            return this.pickInfoBuilder_ == null ? this.pickInfo_.size() : this.pickInfoBuilder_.getCount();
         }

         public RedPacketPlayerData getPickInfo(int index) {
            return this.pickInfoBuilder_ == null ? (RedPacketPlayerData)this.pickInfo_.get(index) : (RedPacketPlayerData)this.pickInfoBuilder_.getMessage(index);
         }

         public Builder setPickInfo(int index, RedPacketPlayerData value) {
            if (this.pickInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePickInfoIsMutable();
               this.pickInfo_.set(index, value);
               this.onChanged();
            } else {
               this.pickInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPickInfo(int index, RedPacketPlayerData.Builder builderForValue) {
            if (this.pickInfoBuilder_ == null) {
               this.ensurePickInfoIsMutable();
               this.pickInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.pickInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPickInfo(RedPacketPlayerData value) {
            if (this.pickInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePickInfoIsMutable();
               this.pickInfo_.add(value);
               this.onChanged();
            } else {
               this.pickInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPickInfo(int index, RedPacketPlayerData value) {
            if (this.pickInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePickInfoIsMutable();
               this.pickInfo_.add(index, value);
               this.onChanged();
            } else {
               this.pickInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPickInfo(RedPacketPlayerData.Builder builderForValue) {
            if (this.pickInfoBuilder_ == null) {
               this.ensurePickInfoIsMutable();
               this.pickInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.pickInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPickInfo(int index, RedPacketPlayerData.Builder builderForValue) {
            if (this.pickInfoBuilder_ == null) {
               this.ensurePickInfoIsMutable();
               this.pickInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.pickInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPickInfo(Iterable<? extends RedPacketPlayerData> values) {
            if (this.pickInfoBuilder_ == null) {
               this.ensurePickInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pickInfo_);
               this.onChanged();
            } else {
               this.pickInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPickInfo() {
            if (this.pickInfoBuilder_ == null) {
               this.pickInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.pickInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removePickInfo(int index) {
            if (this.pickInfoBuilder_ == null) {
               this.ensurePickInfoIsMutable();
               this.pickInfo_.remove(index);
               this.onChanged();
            } else {
               this.pickInfoBuilder_.remove(index);
            }

            return this;
         }

         public RedPacketPlayerData.Builder getPickInfoBuilder(int index) {
            return (RedPacketPlayerData.Builder)this.getPickInfoFieldBuilder().getBuilder(index);
         }

         public RedPacketPlayerDataOrBuilder getPickInfoOrBuilder(int index) {
            return this.pickInfoBuilder_ == null ? (RedPacketPlayerDataOrBuilder)this.pickInfo_.get(index) : (RedPacketPlayerDataOrBuilder)this.pickInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RedPacketPlayerDataOrBuilder> getPickInfoOrBuilderList() {
            return this.pickInfoBuilder_ != null ? this.pickInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pickInfo_);
         }

         public RedPacketPlayerData.Builder addPickInfoBuilder() {
            return (RedPacketPlayerData.Builder)this.getPickInfoFieldBuilder().addBuilder(PeakExtraMsg.RedPacketPlayerData.getDefaultInstance());
         }

         public RedPacketPlayerData.Builder addPickInfoBuilder(int index) {
            return (RedPacketPlayerData.Builder)this.getPickInfoFieldBuilder().addBuilder(index, PeakExtraMsg.RedPacketPlayerData.getDefaultInstance());
         }

         public List<RedPacketPlayerData.Builder> getPickInfoBuilderList() {
            return this.getPickInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RedPacketPlayerData, RedPacketPlayerData.Builder, RedPacketPlayerDataOrBuilder> getPickInfoFieldBuilder() {
            if (this.pickInfoBuilder_ == null) {
               this.pickInfoBuilder_ = new RepeatedFieldBuilderV3(this.pickInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.pickInfo_ = null;
            }

            return this.pickInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RedPacket extends GeneratedMessageV3 implements RedPacketOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int PACKETID_FIELD_NUMBER = 2;
      private int packetId_;
      public static final int LEFTNUM_FIELD_NUMBER = 3;
      private int leftNum_;
      public static final int SUM_FIELD_NUMBER = 4;
      private int sum_;
      public static final int TIME_FIELD_NUMBER = 5;
      private int time_;
      public static final int SENDPLAYER_FIELD_NUMBER = 6;
      private RedPacketPlayerData sendPlayer_;
      private byte memoizedIsInitialized;
      private static final RedPacket DEFAULT_INSTANCE = new RedPacket();
      /** @deprecated */
      @Deprecated
      public static final Parser<RedPacket> PARSER = new AbstractParser<RedPacket>() {
         public RedPacket parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RedPacket(input, extensionRegistry);
         }
      };

      private RedPacket(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RedPacket() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RedPacket();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RedPacket(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.packetId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.leftNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.sum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.time_ = input.readInt32();
                        break;
                     case 50:
                        RedPacketPlayerData.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.sendPlayer_.toBuilder();
                        }

                        this.sendPlayer_ = (RedPacketPlayerData)input.readMessage(PeakExtraMsg.RedPacketPlayerData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.sendPlayer_);
                           this.sendPlayer_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacket.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasPacketId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPacketId() {
         return this.packetId_;
      }

      public boolean hasLeftNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLeftNum() {
         return this.leftNum_;
      }

      public boolean hasSum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSum() {
         return this.sum_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasSendPlayer() {
         return (this.bitField0_ & 32) != 0;
      }

      public RedPacketPlayerData getSendPlayer() {
         return this.sendPlayer_ == null ? PeakExtraMsg.RedPacketPlayerData.getDefaultInstance() : this.sendPlayer_;
      }

      public RedPacketPlayerDataOrBuilder getSendPlayerOrBuilder() {
         return this.sendPlayer_ == null ? PeakExtraMsg.RedPacketPlayerData.getDefaultInstance() : this.sendPlayer_;
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
         } else if (!this.hasPacketId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSendPlayer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSendPlayer().isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.packetId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.leftNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.time_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getSendPlayer());
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.packetId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.leftNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.time_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getSendPlayer());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RedPacket)) {
            return super.equals(obj);
         } else {
            RedPacket other = (RedPacket)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasPacketId() != other.hasPacketId()) {
               return false;
            } else if (this.hasPacketId() && this.getPacketId() != other.getPacketId()) {
               return false;
            } else if (this.hasLeftNum() != other.hasLeftNum()) {
               return false;
            } else if (this.hasLeftNum() && this.getLeftNum() != other.getLeftNum()) {
               return false;
            } else if (this.hasSum() != other.hasSum()) {
               return false;
            } else if (this.hasSum() && this.getSum() != other.getSum()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasSendPlayer() != other.hasSendPlayer()) {
               return false;
            } else if (this.hasSendPlayer() && !this.getSendPlayer().equals(other.getSendPlayer())) {
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

            if (this.hasPacketId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPacketId();
            }

            if (this.hasLeftNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLeftNum();
            }

            if (this.hasSum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSum();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasSendPlayer()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getSendPlayer().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RedPacket parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data);
      }

      public static RedPacket parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacket parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data);
      }

      public static RedPacket parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacket parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data);
      }

      public static RedPacket parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacket)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacket parseFrom(InputStream input) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RedPacket parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RedPacket parseDelimitedFrom(InputStream input) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RedPacket parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RedPacket parseFrom(CodedInputStream input) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RedPacket parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacket)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RedPacket prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RedPacket getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RedPacket> parser() {
         return PARSER;
      }

      public Parser<RedPacket> getParserForType() {
         return PARSER;
      }

      public RedPacket getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RedPacketOrBuilder {
         private int bitField0_;
         private int id_;
         private int packetId_;
         private int leftNum_;
         private int sum_;
         private int time_;
         private RedPacketPlayerData sendPlayer_;
         private SingleFieldBuilderV3<RedPacketPlayerData, RedPacketPlayerData.Builder, RedPacketPlayerDataOrBuilder> sendPlayerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacket.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.RedPacket.alwaysUseFieldBuilders) {
               this.getSendPlayerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.packetId_ = 0;
            this.bitField0_ &= -3;
            this.leftNum_ = 0;
            this.bitField0_ &= -5;
            this.sum_ = 0;
            this.bitField0_ &= -9;
            this.time_ = 0;
            this.bitField0_ &= -17;
            if (this.sendPlayerBuilder_ == null) {
               this.sendPlayer_ = null;
            } else {
               this.sendPlayerBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacket_descriptor;
         }

         public RedPacket getDefaultInstanceForType() {
            return PeakExtraMsg.RedPacket.getDefaultInstance();
         }

         public RedPacket build() {
            RedPacket result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RedPacket buildPartial() {
            RedPacket result = new RedPacket(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.packetId_ = this.packetId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.leftNum_ = this.leftNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.sum_ = this.sum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.sendPlayerBuilder_ == null) {
                  result.sendPlayer_ = this.sendPlayer_;
               } else {
                  result.sendPlayer_ = (RedPacketPlayerData)this.sendPlayerBuilder_.build();
               }

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
            if (other instanceof RedPacket) {
               return this.mergeFrom((RedPacket)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RedPacket other) {
            if (other == PeakExtraMsg.RedPacket.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasPacketId()) {
                  this.setPacketId(other.getPacketId());
               }

               if (other.hasLeftNum()) {
                  this.setLeftNum(other.getLeftNum());
               }

               if (other.hasSum()) {
                  this.setSum(other.getSum());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasSendPlayer()) {
                  this.mergeSendPlayer(other.getSendPlayer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasPacketId()) {
               return false;
            } else if (!this.hasLeftNum()) {
               return false;
            } else if (!this.hasSum()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasSendPlayer()) {
               return false;
            } else {
               return this.getSendPlayer().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RedPacket parsedMessage = null;

            try {
               parsedMessage = (RedPacket)PeakExtraMsg.RedPacket.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RedPacket)e.getUnfinishedMessage();
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

         public boolean hasPacketId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPacketId() {
            return this.packetId_;
         }

         public Builder setPacketId(int value) {
            this.bitField0_ |= 2;
            this.packetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPacketId() {
            this.bitField0_ &= -3;
            this.packetId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLeftNum() {
            return this.leftNum_;
         }

         public Builder setLeftNum(int value) {
            this.bitField0_ |= 4;
            this.leftNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftNum() {
            this.bitField0_ &= -5;
            this.leftNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSum() {
            return this.sum_;
         }

         public Builder setSum(int value) {
            this.bitField0_ |= 8;
            this.sum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSum() {
            this.bitField0_ &= -9;
            this.sum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 16;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -17;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSendPlayer() {
            return (this.bitField0_ & 32) != 0;
         }

         public RedPacketPlayerData getSendPlayer() {
            if (this.sendPlayerBuilder_ == null) {
               return this.sendPlayer_ == null ? PeakExtraMsg.RedPacketPlayerData.getDefaultInstance() : this.sendPlayer_;
            } else {
               return (RedPacketPlayerData)this.sendPlayerBuilder_.getMessage();
            }
         }

         public Builder setSendPlayer(RedPacketPlayerData value) {
            if (this.sendPlayerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.sendPlayer_ = value;
               this.onChanged();
            } else {
               this.sendPlayerBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setSendPlayer(RedPacketPlayerData.Builder builderForValue) {
            if (this.sendPlayerBuilder_ == null) {
               this.sendPlayer_ = builderForValue.build();
               this.onChanged();
            } else {
               this.sendPlayerBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeSendPlayer(RedPacketPlayerData value) {
            if (this.sendPlayerBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.sendPlayer_ != null && this.sendPlayer_ != PeakExtraMsg.RedPacketPlayerData.getDefaultInstance()) {
                  this.sendPlayer_ = PeakExtraMsg.RedPacketPlayerData.newBuilder(this.sendPlayer_).mergeFrom(value).buildPartial();
               } else {
                  this.sendPlayer_ = value;
               }

               this.onChanged();
            } else {
               this.sendPlayerBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearSendPlayer() {
            if (this.sendPlayerBuilder_ == null) {
               this.sendPlayer_ = null;
               this.onChanged();
            } else {
               this.sendPlayerBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public RedPacketPlayerData.Builder getSendPlayerBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (RedPacketPlayerData.Builder)this.getSendPlayerFieldBuilder().getBuilder();
         }

         public RedPacketPlayerDataOrBuilder getSendPlayerOrBuilder() {
            if (this.sendPlayerBuilder_ != null) {
               return (RedPacketPlayerDataOrBuilder)this.sendPlayerBuilder_.getMessageOrBuilder();
            } else {
               return this.sendPlayer_ == null ? PeakExtraMsg.RedPacketPlayerData.getDefaultInstance() : this.sendPlayer_;
            }
         }

         private SingleFieldBuilderV3<RedPacketPlayerData, RedPacketPlayerData.Builder, RedPacketPlayerDataOrBuilder> getSendPlayerFieldBuilder() {
            if (this.sendPlayerBuilder_ == null) {
               this.sendPlayerBuilder_ = new SingleFieldBuilderV3(this.getSendPlayer(), this.getParentForChildren(), this.isClean());
               this.sendPlayer_ = null;
            }

            return this.sendPlayerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RedPacketPlayerData extends GeneratedMessageV3 implements RedPacketPlayerDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      public static final int RANK_FIELD_NUMBER = 6;
      private int rank_;
      public static final int TIME_FIELD_NUMBER = 7;
      private int time_;
      public static final int NUM_FIELD_NUMBER = 8;
      private int num_;
      private byte memoizedIsInitialized;
      private static final RedPacketPlayerData DEFAULT_INSTANCE = new RedPacketPlayerData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RedPacketPlayerData> PARSER = new AbstractParser<RedPacketPlayerData>() {
         public RedPacketPlayerData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RedPacketPlayerData(input, extensionRegistry);
         }
      };

      private RedPacketPlayerData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RedPacketPlayerData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RedPacketPlayerData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RedPacketPlayerData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.rank_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.time_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 64;
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketPlayerData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasHead() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 64) != 0;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.headFrame_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.rank_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.time_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(8, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.rank_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.time_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RedPacketPlayerData)) {
            return super.equals(obj);
         } else {
            RedPacketPlayerData other = (RedPacketPlayerData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RedPacketPlayerData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data);
      }

      public static RedPacketPlayerData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacketPlayerData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data);
      }

      public static RedPacketPlayerData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacketPlayerData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data);
      }

      public static RedPacketPlayerData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RedPacketPlayerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RedPacketPlayerData parseFrom(InputStream input) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RedPacketPlayerData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RedPacketPlayerData parseDelimitedFrom(InputStream input) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RedPacketPlayerData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RedPacketPlayerData parseFrom(CodedInputStream input) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RedPacketPlayerData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RedPacketPlayerData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RedPacketPlayerData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RedPacketPlayerData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RedPacketPlayerData> parser() {
         return PARSER;
      }

      public Parser<RedPacketPlayerData> getParserForType() {
         return PARSER;
      }

      public RedPacketPlayerData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RedPacketPlayerDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int rank_;
         private int time_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketPlayerData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.RedPacketPlayerData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.head_ = 0;
            this.bitField0_ &= -5;
            this.headFrame_ = 0;
            this.bitField0_ &= -9;
            this.rank_ = 0;
            this.bitField0_ &= -17;
            this.time_ = 0;
            this.bitField0_ &= -33;
            this.num_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_RedPacketPlayerData_descriptor;
         }

         public RedPacketPlayerData getDefaultInstanceForType() {
            return PeakExtraMsg.RedPacketPlayerData.getDefaultInstance();
         }

         public RedPacketPlayerData build() {
            RedPacketPlayerData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RedPacketPlayerData buildPartial() {
            RedPacketPlayerData result = new RedPacketPlayerData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 64;
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
            if (other instanceof RedPacketPlayerData) {
               return this.mergeFrom((RedPacketPlayerData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RedPacketPlayerData other) {
            if (other == PeakExtraMsg.RedPacketPlayerData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else {
               return this.hasHeadFrame();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RedPacketPlayerData parsedMessage = null;

            try {
               parsedMessage = (RedPacketPlayerData)PeakExtraMsg.RedPacketPlayerData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RedPacketPlayerData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = PeakExtraMsg.RedPacketPlayerData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHead() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 4;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 8;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 16;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -17;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 32;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -33;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 64;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -65;
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

   public static final class S2S_NotifyRedPacketInfo_4474 extends GeneratedMessageV3 implements S2S_NotifyRedPacketInfo_4474OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifyRedPacketInfo_4474 DEFAULT_INSTANCE = new S2S_NotifyRedPacketInfo_4474();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifyRedPacketInfo_4474> PARSER = new AbstractParser<S2S_NotifyRedPacketInfo_4474>() {
         public S2S_NotifyRedPacketInfo_4474 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifyRedPacketInfo_4474(input, extensionRegistry);
         }
      };

      private S2S_NotifyRedPacketInfo_4474(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifyRedPacketInfo_4474() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifyRedPacketInfo_4474();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifyRedPacketInfo_4474(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rank_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyRedPacketInfo_4474.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifyRedPacketInfo_4474)) {
            return super.equals(obj);
         } else {
            S2S_NotifyRedPacketInfo_4474 other = (S2S_NotifyRedPacketInfo_4474)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyRedPacketInfo_4474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyRedPacketInfo_4474 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyRedPacketInfo_4474)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifyRedPacketInfo_4474 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifyRedPacketInfo_4474 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifyRedPacketInfo_4474> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifyRedPacketInfo_4474> getParserForType() {
         return PARSER;
      }

      public S2S_NotifyRedPacketInfo_4474 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifyRedPacketInfo_4474OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyRedPacketInfo_4474.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyRedPacketInfo_4474_descriptor;
         }

         public S2S_NotifyRedPacketInfo_4474 getDefaultInstanceForType() {
            return PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.getDefaultInstance();
         }

         public S2S_NotifyRedPacketInfo_4474 build() {
            S2S_NotifyRedPacketInfo_4474 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifyRedPacketInfo_4474 buildPartial() {
            S2S_NotifyRedPacketInfo_4474 result = new S2S_NotifyRedPacketInfo_4474(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof S2S_NotifyRedPacketInfo_4474) {
               return this.mergeFrom((S2S_NotifyRedPacketInfo_4474)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifyRedPacketInfo_4474 other) {
            if (other == PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasRank();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifyRedPacketInfo_4474 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifyRedPacketInfo_4474)PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifyRedPacketInfo_4474)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 2;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -3;
            this.rank_ = 0;
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

   public static final class S2S_NotifyTerminationAward_4475 extends GeneratedMessageV3 implements S2S_NotifyTerminationAward_4475OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifyTerminationAward_4475 DEFAULT_INSTANCE = new S2S_NotifyTerminationAward_4475();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifyTerminationAward_4475> PARSER = new AbstractParser<S2S_NotifyTerminationAward_4475>() {
         public S2S_NotifyTerminationAward_4475 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifyTerminationAward_4475(input, extensionRegistry);
         }
      };

      private S2S_NotifyTerminationAward_4475(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifyTerminationAward_4475() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifyTerminationAward_4475();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifyTerminationAward_4475(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyTerminationAward_4475.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifyTerminationAward_4475)) {
            return super.equals(obj);
         } else {
            S2S_NotifyTerminationAward_4475 other = (S2S_NotifyTerminationAward_4475)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyTerminationAward_4475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyTerminationAward_4475 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifyTerminationAward_4475 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyTerminationAward_4475 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyTerminationAward_4475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifyTerminationAward_4475 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifyTerminationAward_4475 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifyTerminationAward_4475> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifyTerminationAward_4475> getParserForType() {
         return PARSER;
      }

      public S2S_NotifyTerminationAward_4475 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifyTerminationAward_4475OrBuilder {
         private int bitField0_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyTerminationAward_4475.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2S_NotifyTerminationAward_4475.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_NotifyTerminationAward_4475_descriptor;
         }

         public S2S_NotifyTerminationAward_4475 getDefaultInstanceForType() {
            return PeakExtraMsg.S2S_NotifyTerminationAward_4475.getDefaultInstance();
         }

         public S2S_NotifyTerminationAward_4475 build() {
            S2S_NotifyTerminationAward_4475 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifyTerminationAward_4475 buildPartial() {
            S2S_NotifyTerminationAward_4475 result = new S2S_NotifyTerminationAward_4475(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof S2S_NotifyTerminationAward_4475) {
               return this.mergeFrom((S2S_NotifyTerminationAward_4475)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifyTerminationAward_4475 other) {
            if (other == PeakExtraMsg.S2S_NotifyTerminationAward_4475.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRank();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifyTerminationAward_4475 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifyTerminationAward_4475)PeakExtraMsg.S2S_NotifyTerminationAward_4475.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifyTerminationAward_4475)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
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

   public static final class C2S_EnterMatch_4476 extends GeneratedMessageV3 implements C2S_EnterMatch_4476OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EnterMatch_4476 DEFAULT_INSTANCE = new C2S_EnterMatch_4476();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterMatch_4476> PARSER = new AbstractParser<C2S_EnterMatch_4476>() {
         public C2S_EnterMatch_4476 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterMatch_4476(input, extensionRegistry);
         }
      };

      private C2S_EnterMatch_4476(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterMatch_4476() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterMatch_4476();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterMatch_4476(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterMatch_4476.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnterMatch_4476)) {
            return super.equals(obj);
         } else {
            C2S_EnterMatch_4476 other = (C2S_EnterMatch_4476)obj;
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

      public static C2S_EnterMatch_4476 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data);
      }

      public static C2S_EnterMatch_4476 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterMatch_4476 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data);
      }

      public static C2S_EnterMatch_4476 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterMatch_4476 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data);
      }

      public static C2S_EnterMatch_4476 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterMatch_4476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterMatch_4476 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterMatch_4476 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterMatch_4476 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterMatch_4476 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterMatch_4476 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterMatch_4476 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterMatch_4476)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterMatch_4476 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterMatch_4476 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterMatch_4476> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterMatch_4476> getParserForType() {
         return PARSER;
      }

      public C2S_EnterMatch_4476 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterMatch_4476OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterMatch_4476.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.C2S_EnterMatch_4476.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_C2S_EnterMatch_4476_descriptor;
         }

         public C2S_EnterMatch_4476 getDefaultInstanceForType() {
            return PeakExtraMsg.C2S_EnterMatch_4476.getDefaultInstance();
         }

         public C2S_EnterMatch_4476 build() {
            C2S_EnterMatch_4476 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterMatch_4476 buildPartial() {
            C2S_EnterMatch_4476 result = new C2S_EnterMatch_4476(this);
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
            if (other instanceof C2S_EnterMatch_4476) {
               return this.mergeFrom((C2S_EnterMatch_4476)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterMatch_4476 other) {
            if (other == PeakExtraMsg.C2S_EnterMatch_4476.getDefaultInstance()) {
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
            C2S_EnterMatch_4476 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterMatch_4476)PeakExtraMsg.C2S_EnterMatch_4476.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterMatch_4476)e.getUnfinishedMessage();
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

   public static final class S2C_EnterMatch_4477 extends GeneratedMessageV3 implements S2C_EnterMatch_4477OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DATA_FIELD_NUMBER = 3;
      private CommonMsg.PlayerInfo data_;
      public static final int MATCHTIME_FIELD_NUMBER = 4;
      private int matchTime_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterMatch_4477 DEFAULT_INSTANCE = new S2C_EnterMatch_4477();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterMatch_4477> PARSER = new AbstractParser<S2C_EnterMatch_4477>() {
         public S2C_EnterMatch_4477 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterMatch_4477(input, extensionRegistry);
         }
      };

      private S2C_EnterMatch_4477(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterMatch_4477() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterMatch_4477();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterMatch_4477(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.data_.toBuilder();
                        }

                        this.data_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.data_);
                           this.data_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.matchTime_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterMatch_4477.class, Builder.class);
      }

      public boolean hasData() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getData() {
         return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
      }

      public CommonMsg.PlayerInfoOrBuilder getDataOrBuilder() {
         return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
      }

      public boolean hasMatchTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMatchTime() {
         return this.matchTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (this.hasData() && !this.getData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(3, this.getData());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.matchTime_);
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
               size += CodedOutputStream.computeMessageSize(3, this.getData());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.matchTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterMatch_4477)) {
            return super.equals(obj);
         } else {
            S2C_EnterMatch_4477 other = (S2C_EnterMatch_4477)obj;
            if (this.hasData() != other.hasData()) {
               return false;
            } else if (this.hasData() && !this.getData().equals(other.getData())) {
               return false;
            } else if (this.hasMatchTime() != other.hasMatchTime()) {
               return false;
            } else if (this.hasMatchTime() && this.getMatchTime() != other.getMatchTime()) {
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
            if (this.hasData()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getData().hashCode();
            }

            if (this.hasMatchTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMatchTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterMatch_4477 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data);
      }

      public static S2C_EnterMatch_4477 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterMatch_4477 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data);
      }

      public static S2C_EnterMatch_4477 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterMatch_4477 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data);
      }

      public static S2C_EnterMatch_4477 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterMatch_4477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterMatch_4477 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterMatch_4477 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterMatch_4477 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterMatch_4477 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterMatch_4477 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterMatch_4477 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterMatch_4477)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterMatch_4477 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterMatch_4477 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterMatch_4477> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterMatch_4477> getParserForType() {
         return PARSER;
      }

      public S2C_EnterMatch_4477 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterMatch_4477OrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo data_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> dataBuilder_;
         private int matchTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterMatch_4477.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2C_EnterMatch_4477.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = null;
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.matchTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_EnterMatch_4477_descriptor;
         }

         public S2C_EnterMatch_4477 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_EnterMatch_4477.getDefaultInstance();
         }

         public S2C_EnterMatch_4477 build() {
            S2C_EnterMatch_4477 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterMatch_4477 buildPartial() {
            S2C_EnterMatch_4477 result = new S2C_EnterMatch_4477(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.dataBuilder_ == null) {
                  result.data_ = this.data_;
               } else {
                  result.data_ = (CommonMsg.PlayerInfo)this.dataBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.matchTime_ = this.matchTime_;
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
            if (other instanceof S2C_EnterMatch_4477) {
               return this.mergeFrom((S2C_EnterMatch_4477)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterMatch_4477 other) {
            if (other == PeakExtraMsg.S2C_EnterMatch_4477.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasData()) {
                  this.mergeData(other.getData());
               }

               if (other.hasMatchTime()) {
                  this.setMatchTime(other.getMatchTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return !this.hasData() || this.getData().isInitialized();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnterMatch_4477 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterMatch_4477)PeakExtraMsg.S2C_EnterMatch_4477.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterMatch_4477)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PlayerInfo getData() {
            if (this.dataBuilder_ == null) {
               return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
            } else {
               return (CommonMsg.PlayerInfo)this.dataBuilder_.getMessage();
            }
         }

         public Builder setData(CommonMsg.PlayerInfo value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.data_ = value;
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setData(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.data_ = builderForValue.build();
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeData(CommonMsg.PlayerInfo value) {
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.data_ != null && this.data_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.data_ = CommonMsg.PlayerInfo.newBuilder(this.data_).mergeFrom(value).buildPartial();
               } else {
                  this.data_ = value;
               }

               this.onChanged();
            } else {
               this.dataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = null;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getDataFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getDataOrBuilder() {
            if (this.dataBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.dataBuilder_.getMessageOrBuilder();
            } else {
               return this.data_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.data_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new SingleFieldBuilderV3(this.getData(), this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public boolean hasMatchTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMatchTime() {
            return this.matchTime_;
         }

         public Builder setMatchTime(int value) {
            this.bitField0_ |= 2;
            this.matchTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMatchTime() {
            this.bitField0_ &= -3;
            this.matchTime_ = 0;
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

   public static final class S2C_NotifyRedPacket_4478 extends GeneratedMessageV3 implements S2C_NotifyRedPacket_4478OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REDPACKETID_FIELD_NUMBER = 1;
      private Internal.IntList redPacketId_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int TEMPID_FIELD_NUMBER = 3;
      private Internal.IntList tempId_;
      private byte memoizedIsInitialized;
      private static final S2C_NotifyRedPacket_4478 DEFAULT_INSTANCE = new S2C_NotifyRedPacket_4478();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NotifyRedPacket_4478> PARSER = new AbstractParser<S2C_NotifyRedPacket_4478>() {
         public S2C_NotifyRedPacket_4478 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NotifyRedPacket_4478(input, extensionRegistry);
         }
      };

      private S2C_NotifyRedPacket_4478(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NotifyRedPacket_4478() {
         this.memoizedIsInitialized = -1;
         this.redPacketId_ = emptyIntList();
         this.tempId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NotifyRedPacket_4478();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NotifyRedPacket_4478(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.redPacketId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.redPacketId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.redPacketId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.tempId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.tempId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tempId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tempId_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.redPacketId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.redPacketId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.tempId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyRedPacket_4478.class, Builder.class);
      }

      public List<Integer> getRedPacketIdList() {
         return this.redPacketId_;
      }

      public int getRedPacketIdCount() {
         return this.redPacketId_.size();
      }

      public int getRedPacketId(int index) {
         return this.redPacketId_.getInt(index);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getTempIdList() {
         return this.tempId_;
      }

      public int getTempIdCount() {
         return this.tempId_.size();
      }

      public int getTempId(int index) {
         return this.tempId_.getInt(index);
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
         for(int i = 0; i < this.redPacketId_.size(); ++i) {
            output.writeInt32(1, this.redPacketId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.type_);
         }

         for(int i = 0; i < this.tempId_.size(); ++i) {
            output.writeInt32(3, this.tempId_.getInt(i));
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

            for(int i = 0; i < this.redPacketId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.redPacketId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRedPacketIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            dataSize = 0;

            for(int i = 0; i < this.tempId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tempId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTempIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NotifyRedPacket_4478)) {
            return super.equals(obj);
         } else {
            S2C_NotifyRedPacket_4478 other = (S2C_NotifyRedPacket_4478)obj;
            if (!this.getRedPacketIdList().equals(other.getRedPacketIdList())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getTempIdList().equals(other.getTempIdList())) {
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
            if (this.getRedPacketIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRedPacketIdList().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.getTempIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTempIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRedPacket_4478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(InputStream input) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyRedPacket_4478 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NotifyRedPacket_4478 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyRedPacket_4478 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRedPacket_4478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NotifyRedPacket_4478 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NotifyRedPacket_4478 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NotifyRedPacket_4478> parser() {
         return PARSER;
      }

      public Parser<S2C_NotifyRedPacket_4478> getParserForType() {
         return PARSER;
      }

      public S2C_NotifyRedPacket_4478 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NotifyRedPacket_4478OrBuilder {
         private int bitField0_;
         private Internal.IntList redPacketId_;
         private int type_;
         private Internal.IntList tempId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyRedPacket_4478.class, Builder.class);
         }

         private Builder() {
            this.redPacketId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.tempId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.redPacketId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.tempId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2C_NotifyRedPacket_4478.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.redPacketId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.tempId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyRedPacket_4478_descriptor;
         }

         public S2C_NotifyRedPacket_4478 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_NotifyRedPacket_4478.getDefaultInstance();
         }

         public S2C_NotifyRedPacket_4478 build() {
            S2C_NotifyRedPacket_4478 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NotifyRedPacket_4478 buildPartial() {
            S2C_NotifyRedPacket_4478 result = new S2C_NotifyRedPacket_4478(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.redPacketId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.redPacketId_ = this.redPacketId_;
            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.tempId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.tempId_ = this.tempId_;
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
            if (other instanceof S2C_NotifyRedPacket_4478) {
               return this.mergeFrom((S2C_NotifyRedPacket_4478)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NotifyRedPacket_4478 other) {
            if (other == PeakExtraMsg.S2C_NotifyRedPacket_4478.getDefaultInstance()) {
               return this;
            } else {
               if (!other.redPacketId_.isEmpty()) {
                  if (this.redPacketId_.isEmpty()) {
                     this.redPacketId_ = other.redPacketId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRedPacketIdIsMutable();
                     this.redPacketId_.addAll(other.redPacketId_);
                  }

                  this.onChanged();
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.tempId_.isEmpty()) {
                  if (this.tempId_.isEmpty()) {
                     this.tempId_ = other.tempId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureTempIdIsMutable();
                     this.tempId_.addAll(other.tempId_);
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
            S2C_NotifyRedPacket_4478 parsedMessage = null;

            try {
               parsedMessage = (S2C_NotifyRedPacket_4478)PeakExtraMsg.S2C_NotifyRedPacket_4478.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NotifyRedPacket_4478)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRedPacketIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.redPacketId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.mutableCopy(this.redPacketId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRedPacketIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.redPacketId_) : this.redPacketId_);
         }

         public int getRedPacketIdCount() {
            return this.redPacketId_.size();
         }

         public int getRedPacketId(int index) {
            return this.redPacketId_.getInt(index);
         }

         public Builder setRedPacketId(int index, int value) {
            this.ensureRedPacketIdIsMutable();
            this.redPacketId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRedPacketId(int value) {
            this.ensureRedPacketIdIsMutable();
            this.redPacketId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRedPacketId(Iterable<? extends Integer> values) {
            this.ensureRedPacketIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.redPacketId_);
            this.onChanged();
            return this;
         }

         public Builder clearRedPacketId() {
            this.redPacketId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTempIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.tempId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.mutableCopy(this.tempId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getTempIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.tempId_) : this.tempId_);
         }

         public int getTempIdCount() {
            return this.tempId_.size();
         }

         public int getTempId(int index) {
            return this.tempId_.getInt(index);
         }

         public Builder setTempId(int index, int value) {
            this.ensureTempIdIsMutable();
            this.tempId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTempId(int value) {
            this.ensureTempIdIsMutable();
            this.tempId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTempId(Iterable<? extends Integer> values) {
            this.ensureTempIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tempId_);
            this.onChanged();
            return this;
         }

         public Builder clearTempId() {
            this.tempId_ = PeakExtraMsg.S2C_NotifyRedPacket_4478.emptyIntList();
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

   public static final class S2C_NotifyReceivePacket_4479 extends GeneratedMessageV3 implements S2C_NotifyReceivePacket_4479OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REDPACKETID_FIELD_NUMBER = 1;
      private int redPacketId_;
      public static final int LEFTNUM_FIELD_NUMBER = 2;
      private int leftNum_;
      private byte memoizedIsInitialized;
      private static final S2C_NotifyReceivePacket_4479 DEFAULT_INSTANCE = new S2C_NotifyReceivePacket_4479();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NotifyReceivePacket_4479> PARSER = new AbstractParser<S2C_NotifyReceivePacket_4479>() {
         public S2C_NotifyReceivePacket_4479 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NotifyReceivePacket_4479(input, extensionRegistry);
         }
      };

      private S2C_NotifyReceivePacket_4479(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NotifyReceivePacket_4479() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NotifyReceivePacket_4479();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NotifyReceivePacket_4479(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.redPacketId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.leftNum_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyReceivePacket_4479.class, Builder.class);
      }

      public boolean hasRedPacketId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRedPacketId() {
         return this.redPacketId_;
      }

      public boolean hasLeftNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLeftNum() {
         return this.leftNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRedPacketId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.redPacketId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.leftNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.redPacketId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.leftNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NotifyReceivePacket_4479)) {
            return super.equals(obj);
         } else {
            S2C_NotifyReceivePacket_4479 other = (S2C_NotifyReceivePacket_4479)obj;
            if (this.hasRedPacketId() != other.hasRedPacketId()) {
               return false;
            } else if (this.hasRedPacketId() && this.getRedPacketId() != other.getRedPacketId()) {
               return false;
            } else if (this.hasLeftNum() != other.hasLeftNum()) {
               return false;
            } else if (this.hasLeftNum() && this.getLeftNum() != other.getLeftNum()) {
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
            if (this.hasRedPacketId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRedPacketId();
            }

            if (this.hasLeftNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLeftNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyReceivePacket_4479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(InputStream input) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyReceivePacket_4479 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NotifyReceivePacket_4479 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyReceivePacket_4479 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyReceivePacket_4479)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NotifyReceivePacket_4479 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NotifyReceivePacket_4479 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NotifyReceivePacket_4479> parser() {
         return PARSER;
      }

      public Parser<S2C_NotifyReceivePacket_4479> getParserForType() {
         return PARSER;
      }

      public S2C_NotifyReceivePacket_4479 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NotifyReceivePacket_4479OrBuilder {
         private int bitField0_;
         private int redPacketId_;
         private int leftNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyReceivePacket_4479.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2C_NotifyReceivePacket_4479.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.redPacketId_ = 0;
            this.bitField0_ &= -2;
            this.leftNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2C_NotifyReceivePacket_4479_descriptor;
         }

         public S2C_NotifyReceivePacket_4479 getDefaultInstanceForType() {
            return PeakExtraMsg.S2C_NotifyReceivePacket_4479.getDefaultInstance();
         }

         public S2C_NotifyReceivePacket_4479 build() {
            S2C_NotifyReceivePacket_4479 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NotifyReceivePacket_4479 buildPartial() {
            S2C_NotifyReceivePacket_4479 result = new S2C_NotifyReceivePacket_4479(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.redPacketId_ = this.redPacketId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.leftNum_ = this.leftNum_;
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
            if (other instanceof S2C_NotifyReceivePacket_4479) {
               return this.mergeFrom((S2C_NotifyReceivePacket_4479)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NotifyReceivePacket_4479 other) {
            if (other == PeakExtraMsg.S2C_NotifyReceivePacket_4479.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRedPacketId()) {
                  this.setRedPacketId(other.getRedPacketId());
               }

               if (other.hasLeftNum()) {
                  this.setLeftNum(other.getLeftNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRedPacketId()) {
               return false;
            } else {
               return this.hasLeftNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NotifyReceivePacket_4479 parsedMessage = null;

            try {
               parsedMessage = (S2C_NotifyReceivePacket_4479)PeakExtraMsg.S2C_NotifyReceivePacket_4479.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NotifyReceivePacket_4479)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRedPacketId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRedPacketId() {
            return this.redPacketId_;
         }

         public Builder setRedPacketId(int value) {
            this.bitField0_ |= 1;
            this.redPacketId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRedPacketId() {
            this.bitField0_ &= -2;
            this.redPacketId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLeftNum() {
            return this.leftNum_;
         }

         public Builder setLeftNum(int value) {
            this.bitField0_ |= 2;
            this.leftNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftNum() {
            this.bitField0_ &= -3;
            this.leftNum_ = 0;
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

   public static final class S2S_serverTermination_4480 extends GeneratedMessageV3 implements S2S_serverTermination_4480OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPVALUE_FIELD_NUMBER = 2;
      private int opValue_;
      private byte memoizedIsInitialized;
      private static final S2S_serverTermination_4480 DEFAULT_INSTANCE = new S2S_serverTermination_4480();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_serverTermination_4480> PARSER = new AbstractParser<S2S_serverTermination_4480>() {
         public S2S_serverTermination_4480 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_serverTermination_4480(input, extensionRegistry);
         }
      };

      private S2S_serverTermination_4480(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_serverTermination_4480() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_serverTermination_4480();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_serverTermination_4480(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.opValue_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_serverTermination_4480.class, Builder.class);
      }

      public boolean hasOpValue() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpValue() {
         return this.opValue_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.opValue_);
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
               size += CodedOutputStream.computeInt32Size(2, this.opValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_serverTermination_4480)) {
            return super.equals(obj);
         } else {
            S2S_serverTermination_4480 other = (S2S_serverTermination_4480)obj;
            if (this.hasOpValue() != other.hasOpValue()) {
               return false;
            } else if (this.hasOpValue() && this.getOpValue() != other.getOpValue()) {
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
            if (this.hasOpValue()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOpValue();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_serverTermination_4480 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data);
      }

      public static S2S_serverTermination_4480 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTermination_4480 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data);
      }

      public static S2S_serverTermination_4480 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTermination_4480 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data);
      }

      public static S2S_serverTermination_4480 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTermination_4480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTermination_4480 parseFrom(InputStream input) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_serverTermination_4480 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_serverTermination_4480 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_serverTermination_4480 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_serverTermination_4480 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_serverTermination_4480 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTermination_4480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_serverTermination_4480 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_serverTermination_4480 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_serverTermination_4480> parser() {
         return PARSER;
      }

      public Parser<S2S_serverTermination_4480> getParserForType() {
         return PARSER;
      }

      public S2S_serverTermination_4480 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_serverTermination_4480OrBuilder {
         private int bitField0_;
         private int opValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_serverTermination_4480.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2S_serverTermination_4480.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.opValue_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTermination_4480_descriptor;
         }

         public S2S_serverTermination_4480 getDefaultInstanceForType() {
            return PeakExtraMsg.S2S_serverTermination_4480.getDefaultInstance();
         }

         public S2S_serverTermination_4480 build() {
            S2S_serverTermination_4480 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_serverTermination_4480 buildPartial() {
            S2S_serverTermination_4480 result = new S2S_serverTermination_4480(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.opValue_ = this.opValue_;
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
            if (other instanceof S2S_serverTermination_4480) {
               return this.mergeFrom((S2S_serverTermination_4480)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_serverTermination_4480 other) {
            if (other == PeakExtraMsg.S2S_serverTermination_4480.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpValue()) {
                  this.setOpValue(other.getOpValue());
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
            S2S_serverTermination_4480 parsedMessage = null;

            try {
               parsedMessage = (S2S_serverTermination_4480)PeakExtraMsg.S2S_serverTermination_4480.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_serverTermination_4480)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpValue() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpValue() {
            return this.opValue_;
         }

         public Builder setOpValue(int value) {
            this.bitField0_ |= 1;
            this.opValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpValue() {
            this.bitField0_ &= -2;
            this.opValue_ = 0;
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

   public static final class S2S_serverTerminationRank_4481 extends GeneratedMessageV3 implements S2S_serverTerminationRank_4481OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      private byte memoizedIsInitialized;
      private static final S2S_serverTerminationRank_4481 DEFAULT_INSTANCE = new S2S_serverTerminationRank_4481();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_serverTerminationRank_4481> PARSER = new AbstractParser<S2S_serverTerminationRank_4481>() {
         public S2S_serverTerminationRank_4481 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_serverTerminationRank_4481(input, extensionRegistry);
         }
      };

      private S2S_serverTerminationRank_4481(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_serverTerminationRank_4481() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_serverTerminationRank_4481();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_serverTerminationRank_4481(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.rank_ = input.readInt32();
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
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_serverTerminationRank_4481.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_serverTerminationRank_4481)) {
            return super.equals(obj);
         } else {
            S2S_serverTerminationRank_4481 other = (S2S_serverTerminationRank_4481)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_serverTerminationRank_4481 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_serverTerminationRank_4481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(InputStream input) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_serverTerminationRank_4481 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_serverTerminationRank_4481 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_serverTerminationRank_4481 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_serverTerminationRank_4481)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_serverTerminationRank_4481 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_serverTerminationRank_4481 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_serverTerminationRank_4481> parser() {
         return PARSER;
      }

      public Parser<S2S_serverTerminationRank_4481> getParserForType() {
         return PARSER;
      }

      public S2S_serverTerminationRank_4481 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_serverTerminationRank_4481OrBuilder {
         private int bitField0_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_serverTerminationRank_4481.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PeakExtraMsg.S2S_serverTerminationRank_4481.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PeakExtraMsg.internal_static_peakextra_com_gzbz_protobuf_S2S_serverTerminationRank_4481_descriptor;
         }

         public S2S_serverTerminationRank_4481 getDefaultInstanceForType() {
            return PeakExtraMsg.S2S_serverTerminationRank_4481.getDefaultInstance();
         }

         public S2S_serverTerminationRank_4481 build() {
            S2S_serverTerminationRank_4481 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_serverTerminationRank_4481 buildPartial() {
            S2S_serverTerminationRank_4481 result = new S2S_serverTerminationRank_4481(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof S2S_serverTerminationRank_4481) {
               return this.mergeFrom((S2S_serverTerminationRank_4481)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_serverTerminationRank_4481 other) {
            if (other == PeakExtraMsg.S2S_serverTerminationRank_4481.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
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
            S2S_serverTerminationRank_4481 parsedMessage = null;

            try {
               parsedMessage = (S2S_serverTerminationRank_4481)PeakExtraMsg.S2S_serverTerminationRank_4481.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_serverTerminationRank_4481)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
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

   public interface C2S_EnterMatch_4476OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PeakRedPacketList_4470OrBuilder extends MessageOrBuilder {
      boolean hasPacketId();

      int getPacketId();
   }

   public interface C2S_ReceiveRedPacket_4472OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TopThreeInfo_4468OrBuilder extends MessageOrBuilder {
   }

   public interface RedPacketOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasPacketId();

      int getPacketId();

      boolean hasLeftNum();

      int getLeftNum();

      boolean hasSum();

      int getSum();

      boolean hasTime();

      int getTime();

      boolean hasSendPlayer();

      RedPacketPlayerData getSendPlayer();

      RedPacketPlayerDataOrBuilder getSendPlayerOrBuilder();
   }

   public interface RedPacketPlayerDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasRank();

      int getRank();

      boolean hasTime();

      int getTime();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_EnterMatch_4477OrBuilder extends MessageOrBuilder {
      boolean hasData();

      CommonMsg.PlayerInfo getData();

      CommonMsg.PlayerInfoOrBuilder getDataOrBuilder();

      boolean hasMatchTime();

      int getMatchTime();
   }

   public interface S2C_NotifyReceivePacket_4479OrBuilder extends MessageOrBuilder {
      boolean hasRedPacketId();

      int getRedPacketId();

      boolean hasLeftNum();

      int getLeftNum();
   }

   public interface S2C_NotifyRedPacket_4478OrBuilder extends MessageOrBuilder {
      List<Integer> getRedPacketIdList();

      int getRedPacketIdCount();

      int getRedPacketId(int index);

      boolean hasType();

      int getType();

      List<Integer> getTempIdList();

      int getTempIdCount();

      int getTempId(int index);
   }

   public interface S2C_PeakRedPacketList_4471OrBuilder extends MessageOrBuilder {
      boolean hasRedPacket();

      RedPacket getRedPacket();

      RedPacketOrBuilder getRedPacketOrBuilder();
   }

   public interface S2C_ReceiveRedPacket_4473OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<RedPacketPlayerData> getPickInfoList();

      RedPacketPlayerData getPickInfo(int index);

      int getPickInfoCount();

      List<? extends RedPacketPlayerDataOrBuilder> getPickInfoOrBuilderList();

      RedPacketPlayerDataOrBuilder getPickInfoOrBuilder(int index);
   }

   public interface S2C_TopThreeInfo_4469OrBuilder extends MessageOrBuilder {
      List<TopThreeInfo> getInfosList();

      TopThreeInfo getInfos(int index);

      int getInfosCount();

      List<? extends TopThreeInfoOrBuilder> getInfosOrBuilderList();

      TopThreeInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2S_NotifyRedPacketInfo_4474OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasRank();

      int getRank();
   }

   public interface S2S_NotifyTerminationAward_4475OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();
   }

   public interface S2S_serverTerminationRank_4481OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();
   }

   public interface S2S_serverTermination_4480OrBuilder extends MessageOrBuilder {
      boolean hasOpValue();

      int getOpValue();
   }

   public interface TopThreeInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();
   }
}
