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

public final class BroodMsg {
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BroodMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bBrood.proto\u0012\u0017Brood.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_26001\"\u009e\u0002\n\u0016S2C_ActivityInfo_26002\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006actDay\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ntotalScore\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bjoinServers\u0018\u0004 \u0003(\u0005\u00126\n\btaskList\u0018\u0005 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012(\n\rbroodBuyIdNum\u0018\u0006 \u0003(\u000b2\u0011.common.MapDataII\u0012*\n\u000fbroodDrawId2Num\u0018\u0007 \u0003(\u000b2\u0011.common.MapDataII\u0012,\n\u0011broodDrawType2Num\u0018\b \u0003(\u000b2\u0011.common.MapDataII\"&\n\u0014C2S_CommitTask_26011\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_26012\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"N\n\u0014S2C_TaskNotice_26013\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0016\n\u0014C2S_DrawRecord_26021\"O\n\u0014S2C_DrawRecord_26022\u00127\n\bmyRecord\u0018\u0001 \u0003(\u000b2%.Brood.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_26023\"]\n\u001aS2C_ServerDrawRecord_26024\u0012?\n\fserverRecord\u0018\u0001 \u0003(\u000b2).Brood.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"\u0084\u0001\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bslotType\u0018\u0006 \u0001(\u0005\".\n\u000fC2S_Brood_26041\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005times\u0018\u0002 \u0002(\u0005\"\u0090\u0001\n\u000fS2C_Brood_26042\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bisHaveFancy\u0018\u0002 \u0002(\b\u0012*\n\u000fbroodDrawId2Num\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012,\n\u0011broodDrawType2Num\u0018\u0004 \u0002(\u000b2\u0011.common.MapDataII\"A\n\u0019S2C_CrossActOpenDay_26051\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bjoinServers\u0018\u0002 \u0003(\u0005\"4\n\u001eS2C_RankTotalScoreUpdate_26052\u0012\u0012\n\ntotalScore\u0018\u0001 \u0002(\u0005\"-\n\u0012C2S_BroodBuy_26060\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\">\n\u0012S2C_BroodBuy_26061\u0012(\n\rbroodBuyIdNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataIIB\u001f\n\u0011com.gzbz.protobufB\bBroodMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor, new String[0]);
      internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor, new String[]{"OpenDay", "ActDay", "TotalScore", "JoinServers", "TaskList", "BroodBuyIdNum", "BroodDrawId2Num", "BroodDrawType2Num"});
      internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor, new String[]{"TaskId"});
      internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor, new String[]{"TaskId"});
      internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor, new String[]{"TaskList"});
      internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor, new String[0]);
      internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor, new String[]{"MyRecord"});
      internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor, new String[0]);
      internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor, new String[]{"ServerRecord"});
      internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage", "SlotType"});
      internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor, new String[]{"Type", "Times"});
      internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor, new String[]{"Result", "IsHaveFancy", "BroodDrawId2Num", "BroodDrawType2Num"});
      internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor, new String[]{"OpenDay", "JoinServers"});
      internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor, new String[]{"TotalScore"});
      internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor, new String[]{"Id", "Num"});
      internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor, new String[]{"BroodBuyIdNum"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_26001 extends GeneratedMessageV3 implements C2S_ActivityInfo_26001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_26001 DEFAULT_INSTANCE = new C2S_ActivityInfo_26001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_26001> PARSER = new AbstractParser<C2S_ActivityInfo_26001>() {
         public C2S_ActivityInfo_26001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_26001(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_26001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_26001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_26001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_26001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_26001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_26001)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_26001 other = (C2S_ActivityInfo_26001)obj;
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

      public static C2S_ActivityInfo_26001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_26001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_26001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_26001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_26001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_26001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_26001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_26001 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_26001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_26001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_26001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_26001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_26001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_26001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_26001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_26001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_26001> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_26001> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_26001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_26001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_26001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_ActivityInfo_26001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ActivityInfo_26001_descriptor;
         }

         public C2S_ActivityInfo_26001 getDefaultInstanceForType() {
            return BroodMsg.C2S_ActivityInfo_26001.getDefaultInstance();
         }

         public C2S_ActivityInfo_26001 build() {
            C2S_ActivityInfo_26001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_26001 buildPartial() {
            C2S_ActivityInfo_26001 result = new C2S_ActivityInfo_26001(this);
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
            if (other instanceof C2S_ActivityInfo_26001) {
               return this.mergeFrom((C2S_ActivityInfo_26001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_26001 other) {
            if (other == BroodMsg.C2S_ActivityInfo_26001.getDefaultInstance()) {
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
            C2S_ActivityInfo_26001 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_26001)BroodMsg.C2S_ActivityInfo_26001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_26001)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_26002 extends GeneratedMessageV3 implements S2C_ActivityInfo_26002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTDAY_FIELD_NUMBER = 2;
      private int actDay_;
      public static final int TOTALSCORE_FIELD_NUMBER = 3;
      private int totalScore_;
      public static final int JOINSERVERS_FIELD_NUMBER = 4;
      private Internal.IntList joinServers_;
      public static final int TASKLIST_FIELD_NUMBER = 5;
      private List<ActivityMsg.TaskData> taskList_;
      public static final int BROODBUYIDNUM_FIELD_NUMBER = 6;
      private List<CommonMsg.MapDataII> broodBuyIdNum_;
      public static final int BROODDRAWID2NUM_FIELD_NUMBER = 7;
      private List<CommonMsg.MapDataII> broodDrawId2Num_;
      public static final int BROODDRAWTYPE2NUM_FIELD_NUMBER = 8;
      private List<CommonMsg.MapDataII> broodDrawType2Num_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_26002 DEFAULT_INSTANCE = new S2C_ActivityInfo_26002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_26002> PARSER = new AbstractParser<S2C_ActivityInfo_26002>() {
         public S2C_ActivityInfo_26002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_26002(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_26002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_26002() {
         this.memoizedIsInitialized = -1;
         this.joinServers_ = emptyIntList();
         this.taskList_ = Collections.emptyList();
         this.broodBuyIdNum_ = Collections.emptyList();
         this.broodDrawId2Num_ = Collections.emptyList();
         this.broodDrawType2Num_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_26002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_26002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openDay_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.actDay_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.totalScore_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.joinServers_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.broodBuyIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.broodBuyIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.broodDrawId2Num_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.broodDrawId2Num_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.broodDrawType2Num_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.broodDrawType2Num_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.joinServers_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.joinServers_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.broodBuyIdNum_ = Collections.unmodifiableList(this.broodBuyIdNum_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.broodDrawId2Num_ = Collections.unmodifiableList(this.broodDrawId2Num_);
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.broodDrawType2Num_ = Collections.unmodifiableList(this.broodDrawType2Num_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_26002.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasActDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActDay() {
         return this.actDay_;
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
      }

      public List<Integer> getJoinServersList() {
         return this.joinServers_;
      }

      public int getJoinServersCount() {
         return this.joinServers_.size();
      }

      public int getJoinServers(int index) {
         return this.joinServers_.getInt(index);
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public List<CommonMsg.MapDataII> getBroodBuyIdNumList() {
         return this.broodBuyIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList() {
         return this.broodBuyIdNum_;
      }

      public int getBroodBuyIdNumCount() {
         return this.broodBuyIdNum_.size();
      }

      public CommonMsg.MapDataII getBroodBuyIdNum(int index) {
         return (CommonMsg.MapDataII)this.broodBuyIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getBroodDrawId2NumList() {
         return this.broodDrawId2Num_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList() {
         return this.broodDrawId2Num_;
      }

      public int getBroodDrawId2NumCount() {
         return this.broodDrawId2Num_.size();
      }

      public CommonMsg.MapDataII getBroodDrawId2Num(int index) {
         return (CommonMsg.MapDataII)this.broodDrawId2Num_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2Num_.get(index);
      }

      public List<CommonMsg.MapDataII> getBroodDrawType2NumList() {
         return this.broodDrawType2Num_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawType2NumOrBuilderList() {
         return this.broodDrawType2Num_;
      }

      public int getBroodDrawType2NumCount() {
         return this.broodDrawType2Num_.size();
      }

      public CommonMsg.MapDataII getBroodDrawType2Num(int index) {
         return (CommonMsg.MapDataII)this.broodDrawType2Num_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.broodDrawType2Num_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBroodBuyIdNumCount(); ++i) {
               if (!this.getBroodBuyIdNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBroodDrawId2NumCount(); ++i) {
               if (!this.getBroodDrawId2Num(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBroodDrawType2NumCount(); ++i) {
               if (!this.getBroodDrawType2Num(i).isInitialized()) {
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
            output.writeInt32(1, this.openDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.actDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.totalScore_);
         }

         for(int i = 0; i < this.joinServers_.size(); ++i) {
            output.writeInt32(4, this.joinServers_.getInt(i));
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.taskList_.get(i));
         }

         for(int i = 0; i < this.broodBuyIdNum_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.broodBuyIdNum_.get(i));
         }

         for(int i = 0; i < this.broodDrawId2Num_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.broodDrawId2Num_.get(i));
         }

         for(int i = 0; i < this.broodDrawType2Num_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.broodDrawType2Num_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.openDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.actDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.totalScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.joinServers_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.joinServers_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getJoinServersList().size();

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.taskList_.get(i));
            }

            for(int i = 0; i < this.broodBuyIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.broodBuyIdNum_.get(i));
            }

            for(int i = 0; i < this.broodDrawId2Num_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.broodDrawId2Num_.get(i));
            }

            for(int i = 0; i < this.broodDrawType2Num_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.broodDrawType2Num_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_26002)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_26002 other = (S2C_ActivityInfo_26002)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasActDay() != other.hasActDay()) {
               return false;
            } else if (this.hasActDay() && this.getActDay() != other.getActDay()) {
               return false;
            } else if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
               return false;
            } else if (!this.getJoinServersList().equals(other.getJoinServersList())) {
               return false;
            } else if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else if (!this.getBroodBuyIdNumList().equals(other.getBroodBuyIdNumList())) {
               return false;
            } else if (!this.getBroodDrawId2NumList().equals(other.getBroodDrawId2NumList())) {
               return false;
            } else if (!this.getBroodDrawType2NumList().equals(other.getBroodDrawType2NumList())) {
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
            if (this.hasOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.hasActDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActDay();
            }

            if (this.hasTotalScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTotalScore();
            }

            if (this.getJoinServersCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getJoinServersList().hashCode();
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            if (this.getBroodBuyIdNumCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBroodBuyIdNumList().hashCode();
            }

            if (this.getBroodDrawId2NumCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getBroodDrawId2NumList().hashCode();
            }

            if (this.getBroodDrawType2NumCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getBroodDrawType2NumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_26002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_26002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_26002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_26002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_26002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_26002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_26002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_26002 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_26002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_26002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_26002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_26002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_26002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_26002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_26002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_26002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_26002> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_26002> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_26002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_26002OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int actDay_;
         private int totalScore_;
         private Internal.IntList joinServers_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;
         private List<CommonMsg.MapDataII> broodBuyIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodBuyIdNumBuilder_;
         private List<CommonMsg.MapDataII> broodDrawId2Num_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodDrawId2NumBuilder_;
         private List<CommonMsg.MapDataII> broodDrawType2Num_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodDrawType2NumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_26002.class, Builder.class);
         }

         private Builder() {
            this.joinServers_ = BroodMsg.S2C_ActivityInfo_26002.emptyIntList();
            this.taskList_ = Collections.emptyList();
            this.broodBuyIdNum_ = Collections.emptyList();
            this.broodDrawId2Num_ = Collections.emptyList();
            this.broodDrawType2Num_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.joinServers_ = BroodMsg.S2C_ActivityInfo_26002.emptyIntList();
            this.taskList_ = Collections.emptyList();
            this.broodBuyIdNum_ = Collections.emptyList();
            this.broodDrawId2Num_ = Collections.emptyList();
            this.broodDrawType2Num_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_ActivityInfo_26002.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
               this.getBroodBuyIdNumFieldBuilder();
               this.getBroodDrawId2NumFieldBuilder();
               this.getBroodDrawType2NumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.actDay_ = 0;
            this.bitField0_ &= -3;
            this.totalScore_ = 0;
            this.bitField0_ &= -5;
            this.joinServers_ = BroodMsg.S2C_ActivityInfo_26002.emptyIntList();
            this.bitField0_ &= -9;
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.taskListBuilder_.clear();
            }

            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.broodBuyIdNumBuilder_.clear();
            }

            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2Num_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.broodDrawId2NumBuilder_.clear();
            }

            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2Num_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.broodDrawType2NumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ActivityInfo_26002_descriptor;
         }

         public S2C_ActivityInfo_26002 getDefaultInstanceForType() {
            return BroodMsg.S2C_ActivityInfo_26002.getDefaultInstance();
         }

         public S2C_ActivityInfo_26002 build() {
            S2C_ActivityInfo_26002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_26002 buildPartial() {
            S2C_ActivityInfo_26002 result = new S2C_ActivityInfo_26002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.actDay_ = this.actDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalScore_ = this.totalScore_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.joinServers_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.joinServers_ = this.joinServers_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -17;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
            }

            if (this.broodBuyIdNumBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.broodBuyIdNum_ = Collections.unmodifiableList(this.broodBuyIdNum_);
                  this.bitField0_ &= -33;
               }

               result.broodBuyIdNum_ = this.broodBuyIdNum_;
            } else {
               result.broodBuyIdNum_ = this.broodBuyIdNumBuilder_.build();
            }

            if (this.broodDrawId2NumBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.broodDrawId2Num_ = Collections.unmodifiableList(this.broodDrawId2Num_);
                  this.bitField0_ &= -65;
               }

               result.broodDrawId2Num_ = this.broodDrawId2Num_;
            } else {
               result.broodDrawId2Num_ = this.broodDrawId2NumBuilder_.build();
            }

            if (this.broodDrawType2NumBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.broodDrawType2Num_ = Collections.unmodifiableList(this.broodDrawType2Num_);
                  this.bitField0_ &= -129;
               }

               result.broodDrawType2Num_ = this.broodDrawType2Num_;
            } else {
               result.broodDrawType2Num_ = this.broodDrawType2NumBuilder_.build();
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
            if (other instanceof S2C_ActivityInfo_26002) {
               return this.mergeFrom((S2C_ActivityInfo_26002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_26002 other) {
            if (other == BroodMsg.S2C_ActivityInfo_26002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasActDay()) {
                  this.setActDay(other.getActDay());
               }

               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
               }

               if (!other.joinServers_.isEmpty()) {
                  if (this.joinServers_.isEmpty()) {
                     this.joinServers_ = other.joinServers_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureJoinServersIsMutable();
                     this.joinServers_.addAll(other.joinServers_);
                  }

                  this.onChanged();
               }

               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -17;
                     this.taskListBuilder_ = BroodMsg.S2C_ActivityInfo_26002.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               if (this.broodBuyIdNumBuilder_ == null) {
                  if (!other.broodBuyIdNum_.isEmpty()) {
                     if (this.broodBuyIdNum_.isEmpty()) {
                        this.broodBuyIdNum_ = other.broodBuyIdNum_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureBroodBuyIdNumIsMutable();
                        this.broodBuyIdNum_.addAll(other.broodBuyIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.broodBuyIdNum_.isEmpty()) {
                  if (this.broodBuyIdNumBuilder_.isEmpty()) {
                     this.broodBuyIdNumBuilder_.dispose();
                     this.broodBuyIdNumBuilder_ = null;
                     this.broodBuyIdNum_ = other.broodBuyIdNum_;
                     this.bitField0_ &= -33;
                     this.broodBuyIdNumBuilder_ = BroodMsg.S2C_ActivityInfo_26002.alwaysUseFieldBuilders ? this.getBroodBuyIdNumFieldBuilder() : null;
                  } else {
                     this.broodBuyIdNumBuilder_.addAllMessages(other.broodBuyIdNum_);
                  }
               }

               if (this.broodDrawId2NumBuilder_ == null) {
                  if (!other.broodDrawId2Num_.isEmpty()) {
                     if (this.broodDrawId2Num_.isEmpty()) {
                        this.broodDrawId2Num_ = other.broodDrawId2Num_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureBroodDrawId2NumIsMutable();
                        this.broodDrawId2Num_.addAll(other.broodDrawId2Num_);
                     }

                     this.onChanged();
                  }
               } else if (!other.broodDrawId2Num_.isEmpty()) {
                  if (this.broodDrawId2NumBuilder_.isEmpty()) {
                     this.broodDrawId2NumBuilder_.dispose();
                     this.broodDrawId2NumBuilder_ = null;
                     this.broodDrawId2Num_ = other.broodDrawId2Num_;
                     this.bitField0_ &= -65;
                     this.broodDrawId2NumBuilder_ = BroodMsg.S2C_ActivityInfo_26002.alwaysUseFieldBuilders ? this.getBroodDrawId2NumFieldBuilder() : null;
                  } else {
                     this.broodDrawId2NumBuilder_.addAllMessages(other.broodDrawId2Num_);
                  }
               }

               if (this.broodDrawType2NumBuilder_ == null) {
                  if (!other.broodDrawType2Num_.isEmpty()) {
                     if (this.broodDrawType2Num_.isEmpty()) {
                        this.broodDrawType2Num_ = other.broodDrawType2Num_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureBroodDrawType2NumIsMutable();
                        this.broodDrawType2Num_.addAll(other.broodDrawType2Num_);
                     }

                     this.onChanged();
                  }
               } else if (!other.broodDrawType2Num_.isEmpty()) {
                  if (this.broodDrawType2NumBuilder_.isEmpty()) {
                     this.broodDrawType2NumBuilder_.dispose();
                     this.broodDrawType2NumBuilder_ = null;
                     this.broodDrawType2Num_ = other.broodDrawType2Num_;
                     this.bitField0_ &= -129;
                     this.broodDrawType2NumBuilder_ = BroodMsg.S2C_ActivityInfo_26002.alwaysUseFieldBuilders ? this.getBroodDrawType2NumFieldBuilder() : null;
                  } else {
                     this.broodDrawType2NumBuilder_.addAllMessages(other.broodDrawType2Num_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenDay()) {
               return false;
            } else if (!this.hasActDay()) {
               return false;
            } else if (!this.hasTotalScore()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getBroodBuyIdNumCount(); ++i) {
                  if (!this.getBroodBuyIdNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getBroodDrawId2NumCount(); ++i) {
                  if (!this.getBroodDrawId2Num(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getBroodDrawType2NumCount(); ++i) {
                  if (!this.getBroodDrawType2Num(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_26002 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_26002)BroodMsg.S2C_ActivityInfo_26002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_26002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 1;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -2;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActDay() {
            return this.actDay_;
         }

         public Builder setActDay(int value) {
            this.bitField0_ |= 2;
            this.actDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActDay() {
            this.bitField0_ &= -3;
            this.actDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTotalScore() {
            return this.totalScore_;
         }

         public Builder setTotalScore(int value) {
            this.bitField0_ |= 4;
            this.totalScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalScore() {
            this.bitField0_ &= -5;
            this.totalScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureJoinServersIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.joinServers_ = BroodMsg.S2C_ActivityInfo_26002.mutableCopy(this.joinServers_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getJoinServersList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.joinServers_) : this.joinServers_);
         }

         public int getJoinServersCount() {
            return this.joinServers_.size();
         }

         public int getJoinServers(int index) {
            return this.joinServers_.getInt(index);
         }

         public Builder setJoinServers(int index, int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addJoinServers(int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllJoinServers(Iterable<? extends Integer> values) {
            this.ensureJoinServersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.joinServers_);
            this.onChanged();
            return this;
         }

         public Builder clearJoinServers() {
            this.joinServers_ = BroodMsg.S2C_ActivityInfo_26002.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 16;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         private void ensureBroodBuyIdNumIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.broodBuyIdNum_ = new ArrayList(this.broodBuyIdNum_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.MapDataII> getBroodBuyIdNumList() {
            return this.broodBuyIdNumBuilder_ == null ? Collections.unmodifiableList(this.broodBuyIdNum_) : this.broodBuyIdNumBuilder_.getMessageList();
         }

         public int getBroodBuyIdNumCount() {
            return this.broodBuyIdNumBuilder_ == null ? this.broodBuyIdNum_.size() : this.broodBuyIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBroodBuyIdNum(int index) {
            return this.broodBuyIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.broodBuyIdNum_.get(index) : (CommonMsg.MapDataII)this.broodBuyIdNumBuilder_.getMessage(index);
         }

         public Builder setBroodBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBroodBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBroodBuyIdNum(CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBroodBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBroodBuyIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBroodBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBroodBuyIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.broodBuyIdNum_);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBroodBuyIdNum() {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeBroodBuyIdNum(int index) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.remove(index);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index) {
            return this.broodBuyIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList() {
            return this.broodBuyIdNumBuilder_ != null ? this.broodBuyIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.broodBuyIdNum_);
         }

         public CommonMsg.MapDataII.Builder addBroodBuyIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBroodBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBroodBuyIdNumBuilderList() {
            return this.getBroodBuyIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumFieldBuilder() {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNumBuilder_ = new RepeatedFieldBuilderV3(this.broodBuyIdNum_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.broodBuyIdNum_ = null;
            }

            return this.broodBuyIdNumBuilder_;
         }

         private void ensureBroodDrawId2NumIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.broodDrawId2Num_ = new ArrayList(this.broodDrawId2Num_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.MapDataII> getBroodDrawId2NumList() {
            return this.broodDrawId2NumBuilder_ == null ? Collections.unmodifiableList(this.broodDrawId2Num_) : this.broodDrawId2NumBuilder_.getMessageList();
         }

         public int getBroodDrawId2NumCount() {
            return this.broodDrawId2NumBuilder_ == null ? this.broodDrawId2Num_.size() : this.broodDrawId2NumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBroodDrawId2Num(int index) {
            return this.broodDrawId2NumBuilder_ == null ? (CommonMsg.MapDataII)this.broodDrawId2Num_.get(index) : (CommonMsg.MapDataII)this.broodDrawId2NumBuilder_.getMessage(index);
         }

         public Builder setBroodDrawId2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.set(index, value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBroodDrawId2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawId2Num(CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBroodDrawId2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(index, value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBroodDrawId2Num(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawId2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBroodDrawId2Num(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.broodDrawId2Num_);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBroodDrawId2Num() {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2Num_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.clear();
            }

            return this;
         }

         public Builder removeBroodDrawId2Num(int index) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.remove(index);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodDrawId2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index) {
            return this.broodDrawId2NumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2Num_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2NumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList() {
            return this.broodDrawId2NumBuilder_ != null ? this.broodDrawId2NumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.broodDrawId2Num_);
         }

         public CommonMsg.MapDataII.Builder addBroodDrawId2NumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBroodDrawId2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBroodDrawId2NumBuilderList() {
            return this.getBroodDrawId2NumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumFieldBuilder() {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2NumBuilder_ = new RepeatedFieldBuilderV3(this.broodDrawId2Num_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.broodDrawId2Num_ = null;
            }

            return this.broodDrawId2NumBuilder_;
         }

         private void ensureBroodDrawType2NumIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.broodDrawType2Num_ = new ArrayList(this.broodDrawType2Num_);
               this.bitField0_ |= 128;
            }

         }

         public List<CommonMsg.MapDataII> getBroodDrawType2NumList() {
            return this.broodDrawType2NumBuilder_ == null ? Collections.unmodifiableList(this.broodDrawType2Num_) : this.broodDrawType2NumBuilder_.getMessageList();
         }

         public int getBroodDrawType2NumCount() {
            return this.broodDrawType2NumBuilder_ == null ? this.broodDrawType2Num_.size() : this.broodDrawType2NumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBroodDrawType2Num(int index) {
            return this.broodDrawType2NumBuilder_ == null ? (CommonMsg.MapDataII)this.broodDrawType2Num_.get(index) : (CommonMsg.MapDataII)this.broodDrawType2NumBuilder_.getMessage(index);
         }

         public Builder setBroodDrawType2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawType2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.set(index, value);
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBroodDrawType2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawType2Num(CommonMsg.MapDataII value) {
            if (this.broodDrawType2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.add(value);
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBroodDrawType2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawType2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.add(index, value);
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBroodDrawType2Num(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawType2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBroodDrawType2Num(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.ensureBroodDrawType2NumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.broodDrawType2Num_);
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBroodDrawType2Num() {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2Num_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.clear();
            }

            return this;
         }

         public Builder removeBroodDrawType2Num(int index) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.ensureBroodDrawType2NumIsMutable();
               this.broodDrawType2Num_.remove(index);
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodDrawType2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawType2NumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder(int index) {
            return this.broodDrawType2NumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.broodDrawType2Num_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.broodDrawType2NumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawType2NumOrBuilderList() {
            return this.broodDrawType2NumBuilder_ != null ? this.broodDrawType2NumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.broodDrawType2Num_);
         }

         public CommonMsg.MapDataII.Builder addBroodDrawType2NumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawType2NumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBroodDrawType2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawType2NumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBroodDrawType2NumBuilderList() {
            return this.getBroodDrawType2NumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodDrawType2NumFieldBuilder() {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2NumBuilder_ = new RepeatedFieldBuilderV3(this.broodDrawType2Num_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.broodDrawType2Num_ = null;
            }

            return this.broodDrawType2NumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CommitTask_26011 extends GeneratedMessageV3 implements C2S_CommitTask_26011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_26011 DEFAULT_INSTANCE = new C2S_CommitTask_26011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_26011> PARSER = new AbstractParser<C2S_CommitTask_26011>() {
         public C2S_CommitTask_26011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_26011(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_26011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_26011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_26011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_26011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_26011.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_26011)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_26011 other = (C2S_CommitTask_26011)obj;
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

      public static C2S_CommitTask_26011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_26011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_26011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_26011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_26011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_26011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_26011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_26011 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_26011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_26011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_26011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_26011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_26011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_26011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_26011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_26011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_26011> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_26011> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_26011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_26011OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_26011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_CommitTask_26011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_CommitTask_26011_descriptor;
         }

         public C2S_CommitTask_26011 getDefaultInstanceForType() {
            return BroodMsg.C2S_CommitTask_26011.getDefaultInstance();
         }

         public C2S_CommitTask_26011 build() {
            C2S_CommitTask_26011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_26011 buildPartial() {
            C2S_CommitTask_26011 result = new C2S_CommitTask_26011(this);
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
            if (other instanceof C2S_CommitTask_26011) {
               return this.mergeFrom((C2S_CommitTask_26011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_26011 other) {
            if (other == BroodMsg.C2S_CommitTask_26011.getDefaultInstance()) {
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
            C2S_CommitTask_26011 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_26011)BroodMsg.C2S_CommitTask_26011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_26011)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_26012 extends GeneratedMessageV3 implements S2C_CommitTask_26012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_26012 DEFAULT_INSTANCE = new S2C_CommitTask_26012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_26012> PARSER = new AbstractParser<S2C_CommitTask_26012>() {
         public S2C_CommitTask_26012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_26012(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_26012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_26012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_26012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_26012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_26012.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_26012)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_26012 other = (S2C_CommitTask_26012)obj;
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

      public static S2C_CommitTask_26012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_26012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_26012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_26012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_26012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_26012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_26012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_26012 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_26012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_26012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_26012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_26012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_26012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_26012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_26012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_26012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_26012> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_26012> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_26012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_26012OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_26012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_CommitTask_26012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CommitTask_26012_descriptor;
         }

         public S2C_CommitTask_26012 getDefaultInstanceForType() {
            return BroodMsg.S2C_CommitTask_26012.getDefaultInstance();
         }

         public S2C_CommitTask_26012 build() {
            S2C_CommitTask_26012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_26012 buildPartial() {
            S2C_CommitTask_26012 result = new S2C_CommitTask_26012(this);
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
            if (other instanceof S2C_CommitTask_26012) {
               return this.mergeFrom((S2C_CommitTask_26012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_26012 other) {
            if (other == BroodMsg.S2C_CommitTask_26012.getDefaultInstance()) {
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
            S2C_CommitTask_26012 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_26012)BroodMsg.S2C_CommitTask_26012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_26012)e.getUnfinishedMessage();
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

   public static final class S2C_TaskNotice_26013 extends GeneratedMessageV3 implements S2C_TaskNotice_26013OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotice_26013 DEFAULT_INSTANCE = new S2C_TaskNotice_26013();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotice_26013> PARSER = new AbstractParser<S2C_TaskNotice_26013>() {
         public S2C_TaskNotice_26013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotice_26013(input, extensionRegistry);
         }
      };

      private S2C_TaskNotice_26013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotice_26013() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotice_26013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotice_26013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_26013.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotice_26013)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotice_26013 other = (S2C_TaskNotice_26013)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotice_26013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_26013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_26013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_26013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_26013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_26013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_26013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_26013 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_26013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_26013 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_26013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_26013 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_26013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_26013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotice_26013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotice_26013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotice_26013> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotice_26013> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotice_26013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotice_26013OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_26013.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_TaskNotice_26013.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_TaskNotice_26013_descriptor;
         }

         public S2C_TaskNotice_26013 getDefaultInstanceForType() {
            return BroodMsg.S2C_TaskNotice_26013.getDefaultInstance();
         }

         public S2C_TaskNotice_26013 build() {
            S2C_TaskNotice_26013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotice_26013 buildPartial() {
            S2C_TaskNotice_26013 result = new S2C_TaskNotice_26013(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_TaskNotice_26013) {
               return this.mergeFrom((S2C_TaskNotice_26013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotice_26013 other) {
            if (other == BroodMsg.S2C_TaskNotice_26013.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = BroodMsg.S2C_TaskNotice_26013.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotice_26013 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotice_26013)BroodMsg.S2C_TaskNotice_26013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotice_26013)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DrawRecord_26021 extends GeneratedMessageV3 implements C2S_DrawRecord_26021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_26021 DEFAULT_INSTANCE = new C2S_DrawRecord_26021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_26021> PARSER = new AbstractParser<C2S_DrawRecord_26021>() {
         public C2S_DrawRecord_26021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_26021(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_26021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_26021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_26021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_26021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_26021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_26021)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_26021 other = (C2S_DrawRecord_26021)obj;
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

      public static C2S_DrawRecord_26021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_26021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_26021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_26021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_26021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_26021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_26021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_26021 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_26021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_26021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_26021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_26021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_26021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_26021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_26021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_26021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_26021> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_26021> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_26021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_26021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_26021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_DrawRecord_26021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_DrawRecord_26021_descriptor;
         }

         public C2S_DrawRecord_26021 getDefaultInstanceForType() {
            return BroodMsg.C2S_DrawRecord_26021.getDefaultInstance();
         }

         public C2S_DrawRecord_26021 build() {
            C2S_DrawRecord_26021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_26021 buildPartial() {
            C2S_DrawRecord_26021 result = new C2S_DrawRecord_26021(this);
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
            if (other instanceof C2S_DrawRecord_26021) {
               return this.mergeFrom((C2S_DrawRecord_26021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_26021 other) {
            if (other == BroodMsg.C2S_DrawRecord_26021.getDefaultInstance()) {
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
            C2S_DrawRecord_26021 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_26021)BroodMsg.C2S_DrawRecord_26021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_26021)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_26022 extends GeneratedMessageV3 implements S2C_DrawRecord_26022OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_26022 DEFAULT_INSTANCE = new S2C_DrawRecord_26022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_26022> PARSER = new AbstractParser<S2C_DrawRecord_26022>() {
         public S2C_DrawRecord_26022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_26022(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_26022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_26022() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_26022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_26022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.myRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.myRecord_.add(input.readMessage(BroodMsg.MyDrawRecord.PARSER, extensionRegistry));
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
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_26022.class, Builder.class);
      }

      public List<MyDrawRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public MyDrawRecord getMyRecord(int index) {
         return (MyDrawRecord)this.myRecord_.get(index);
      }

      public MyDrawRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (MyDrawRecordOrBuilder)this.myRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.myRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.myRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.myRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.myRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DrawRecord_26022)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_26022 other = (S2C_DrawRecord_26022)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
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
            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DrawRecord_26022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_26022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_26022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_26022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_26022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_26022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_26022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_26022 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_26022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_26022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_26022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_26022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_26022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_26022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_26022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_26022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_26022> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_26022> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_26022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_26022OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_26022.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_DrawRecord_26022.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_DrawRecord_26022_descriptor;
         }

         public S2C_DrawRecord_26022 getDefaultInstanceForType() {
            return BroodMsg.S2C_DrawRecord_26022.getDefaultInstance();
         }

         public S2C_DrawRecord_26022 build() {
            S2C_DrawRecord_26022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_26022 buildPartial() {
            S2C_DrawRecord_26022 result = new S2C_DrawRecord_26022(this);
            int from_bitField0_ = this.bitField0_;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
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
            if (other instanceof S2C_DrawRecord_26022) {
               return this.mergeFrom((S2C_DrawRecord_26022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_26022 other) {
            if (other == BroodMsg.S2C_DrawRecord_26022.getDefaultInstance()) {
               return this;
            } else {
               if (this.myRecordBuilder_ == null) {
                  if (!other.myRecord_.isEmpty()) {
                     if (this.myRecord_.isEmpty()) {
                        this.myRecord_ = other.myRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMyRecordIsMutable();
                        this.myRecord_.addAll(other.myRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecord_.isEmpty()) {
                  if (this.myRecordBuilder_.isEmpty()) {
                     this.myRecordBuilder_.dispose();
                     this.myRecordBuilder_ = null;
                     this.myRecord_ = other.myRecord_;
                     this.bitField0_ &= -2;
                     this.myRecordBuilder_ = BroodMsg.S2C_DrawRecord_26022.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DrawRecord_26022 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_26022)BroodMsg.S2C_DrawRecord_26022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_26022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMyRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.myRecord_ = new ArrayList(this.myRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<MyDrawRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public MyDrawRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (MyDrawRecord)this.myRecord_.get(index) : (MyDrawRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecord(int index, MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecord(int index, MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecord(MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends MyDrawRecord> values) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecord_);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecord() {
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecord(int index) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.remove(index);
               this.onChanged();
            } else {
               this.myRecordBuilder_.remove(index);
            }

            return this;
         }

         public MyDrawRecord.Builder getMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public MyDrawRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (MyDrawRecordOrBuilder)this.myRecord_.get(index) : (MyDrawRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public MyDrawRecord.Builder addMyRecordBuilder() {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(BroodMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, BroodMsg.MyDrawRecord.getDefaultInstance());
         }

         public List<MyDrawRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ServerDrawRecord_26023 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_26023OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_26023 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_26023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_26023> PARSER = new AbstractParser<C2S_ServerDrawRecord_26023>() {
         public C2S_ServerDrawRecord_26023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_26023(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_26023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_26023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_26023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_26023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_26023.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_26023)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_26023 other = (C2S_ServerDrawRecord_26023)obj;
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

      public static C2S_ServerDrawRecord_26023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_26023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_26023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_26023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_26023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_26023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_26023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_26023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_26023> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_26023> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_26023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_26023OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_26023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_ServerDrawRecord_26023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_ServerDrawRecord_26023_descriptor;
         }

         public C2S_ServerDrawRecord_26023 getDefaultInstanceForType() {
            return BroodMsg.C2S_ServerDrawRecord_26023.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_26023 build() {
            C2S_ServerDrawRecord_26023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_26023 buildPartial() {
            C2S_ServerDrawRecord_26023 result = new C2S_ServerDrawRecord_26023(this);
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
            if (other instanceof C2S_ServerDrawRecord_26023) {
               return this.mergeFrom((C2S_ServerDrawRecord_26023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_26023 other) {
            if (other == BroodMsg.C2S_ServerDrawRecord_26023.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_26023 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_26023)BroodMsg.C2S_ServerDrawRecord_26023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_26023)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_26024 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_26024OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_26024 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_26024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_26024> PARSER = new AbstractParser<S2C_ServerDrawRecord_26024>() {
         public S2C_ServerDrawRecord_26024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_26024(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_26024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_26024() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_26024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_26024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.serverRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.serverRecord_.add(input.readMessage(BroodMsg.ServerDrawRecord.PARSER, extensionRegistry));
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
                  this.serverRecord_ = Collections.unmodifiableList(this.serverRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_26024.class, Builder.class);
      }

      public List<ServerDrawRecord> getServerRecordList() {
         return this.serverRecord_;
      }

      public List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList() {
         return this.serverRecord_;
      }

      public int getServerRecordCount() {
         return this.serverRecord_.size();
      }

      public ServerDrawRecord getServerRecord(int index) {
         return (ServerDrawRecord)this.serverRecord_.get(index);
      }

      public ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index) {
         return (ServerDrawRecordOrBuilder)this.serverRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getServerRecordCount(); ++i) {
               if (!this.getServerRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.serverRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.serverRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.serverRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.serverRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ServerDrawRecord_26024)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_26024 other = (S2C_ServerDrawRecord_26024)obj;
            if (!this.getServerRecordList().equals(other.getServerRecordList())) {
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
            if (this.getServerRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_26024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_26024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_26024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_26024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_26024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_26024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_26024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_26024> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_26024> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_26024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_26024OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_26024.class, Builder.class);
         }

         private Builder() {
            this.serverRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.serverRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_ServerDrawRecord_26024.alwaysUseFieldBuilders) {
               this.getServerRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.serverRecordBuilder_ == null) {
               this.serverRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.serverRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_ServerDrawRecord_26024_descriptor;
         }

         public S2C_ServerDrawRecord_26024 getDefaultInstanceForType() {
            return BroodMsg.S2C_ServerDrawRecord_26024.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_26024 build() {
            S2C_ServerDrawRecord_26024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_26024 buildPartial() {
            S2C_ServerDrawRecord_26024 result = new S2C_ServerDrawRecord_26024(this);
            int from_bitField0_ = this.bitField0_;
            if (this.serverRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.serverRecord_ = Collections.unmodifiableList(this.serverRecord_);
                  this.bitField0_ &= -2;
               }

               result.serverRecord_ = this.serverRecord_;
            } else {
               result.serverRecord_ = this.serverRecordBuilder_.build();
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
            if (other instanceof S2C_ServerDrawRecord_26024) {
               return this.mergeFrom((S2C_ServerDrawRecord_26024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_26024 other) {
            if (other == BroodMsg.S2C_ServerDrawRecord_26024.getDefaultInstance()) {
               return this;
            } else {
               if (this.serverRecordBuilder_ == null) {
                  if (!other.serverRecord_.isEmpty()) {
                     if (this.serverRecord_.isEmpty()) {
                        this.serverRecord_ = other.serverRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureServerRecordIsMutable();
                        this.serverRecord_.addAll(other.serverRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.serverRecord_.isEmpty()) {
                  if (this.serverRecordBuilder_.isEmpty()) {
                     this.serverRecordBuilder_.dispose();
                     this.serverRecordBuilder_ = null;
                     this.serverRecord_ = other.serverRecord_;
                     this.bitField0_ &= -2;
                     this.serverRecordBuilder_ = BroodMsg.S2C_ServerDrawRecord_26024.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
                  } else {
                     this.serverRecordBuilder_.addAllMessages(other.serverRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getServerRecordCount(); ++i) {
               if (!this.getServerRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ServerDrawRecord_26024 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_26024)BroodMsg.S2C_ServerDrawRecord_26024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_26024)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureServerRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.serverRecord_ = new ArrayList(this.serverRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<ServerDrawRecord> getServerRecordList() {
            return this.serverRecordBuilder_ == null ? Collections.unmodifiableList(this.serverRecord_) : this.serverRecordBuilder_.getMessageList();
         }

         public int getServerRecordCount() {
            return this.serverRecordBuilder_ == null ? this.serverRecord_.size() : this.serverRecordBuilder_.getCount();
         }

         public ServerDrawRecord getServerRecord(int index) {
            return this.serverRecordBuilder_ == null ? (ServerDrawRecord)this.serverRecord_.get(index) : (ServerDrawRecord)this.serverRecordBuilder_.getMessage(index);
         }

         public Builder setServerRecord(int index, ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.set(index, value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setServerRecord(int index, ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addServerRecord(ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addServerRecord(int index, ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(index, value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addServerRecord(ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addServerRecord(int index, ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllServerRecord(Iterable<? extends ServerDrawRecord> values) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.serverRecord_);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearServerRecord() {
            if (this.serverRecordBuilder_ == null) {
               this.serverRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.serverRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeServerRecord(int index) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.remove(index);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.remove(index);
            }

            return this;
         }

         public ServerDrawRecord.Builder getServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().getBuilder(index);
         }

         public ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index) {
            return this.serverRecordBuilder_ == null ? (ServerDrawRecordOrBuilder)this.serverRecord_.get(index) : (ServerDrawRecordOrBuilder)this.serverRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList() {
            return this.serverRecordBuilder_ != null ? this.serverRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.serverRecord_);
         }

         public ServerDrawRecord.Builder addServerRecordBuilder() {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(BroodMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, BroodMsg.ServerDrawRecord.getDefaultInstance());
         }

         public List<ServerDrawRecord.Builder> getServerRecordBuilderList() {
            return this.getServerRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> getServerRecordFieldBuilder() {
            if (this.serverRecordBuilder_ == null) {
               this.serverRecordBuilder_ = new RepeatedFieldBuilderV3(this.serverRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.serverRecord_ = null;
            }

            return this.serverRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class MyDrawRecord extends GeneratedMessageV3 implements MyDrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int ITEMINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> itemInfo_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final MyDrawRecord DEFAULT_INSTANCE = new MyDrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<MyDrawRecord> PARSER = new AbstractParser<MyDrawRecord>() {
         public MyDrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MyDrawRecord(input, extensionRegistry);
         }
      };

      private MyDrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MyDrawRecord() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MyDrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MyDrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.itemInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.itemInfo_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
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
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public List<CommonMsg.ItemInfo> getItemInfoList() {
         return this.itemInfo_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
         return this.itemInfo_;
      }

      public int getItemInfoCount() {
         return this.itemInfo_.size();
      }

      public CommonMsg.ItemInfo getItemInfo(int index) {
         return (CommonMsg.ItemInfo)this.itemInfo_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemInfoCount(); ++i) {
               if (!this.getItemInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.createTime_);
         }

         for(int i = 0; i < this.itemInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.itemInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.createTime_);
            }

            for(int i = 0; i < this.itemInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.itemInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MyDrawRecord)) {
            return super.equals(obj);
         } else {
            MyDrawRecord other = (MyDrawRecord)obj;
            if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (!this.getItemInfoList().equals(other.getItemInfoList())) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasCreateTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.getItemInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemInfoList().hashCode();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MyDrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(InputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MyDrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MyDrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MyDrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MyDrawRecord> parser() {
         return PARSER;
      }

      public Parser<MyDrawRecord> getParserForType() {
         return PARSER;
      }

      public MyDrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MyDrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
         }

         private Builder() {
            this.itemInfo_ = Collections.emptyList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemInfo_ = Collections.emptyList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.MyDrawRecord.alwaysUseFieldBuilders) {
               this.getItemInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.createTime_ = 0;
            this.bitField0_ &= -2;
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.playerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return BroodMsg.MyDrawRecord.getDefaultInstance();
         }

         public MyDrawRecord build() {
            MyDrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MyDrawRecord buildPartial() {
            MyDrawRecord result = new MyDrawRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 1;
            }

            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
                  this.bitField0_ &= -3;
               }

               result.itemInfo_ = this.itemInfo_;
            } else {
               result.itemInfo_ = this.itemInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof MyDrawRecord) {
               return this.mergeFrom((MyDrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MyDrawRecord other) {
            if (other == BroodMsg.MyDrawRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (this.itemInfoBuilder_ == null) {
                  if (!other.itemInfo_.isEmpty()) {
                     if (this.itemInfo_.isEmpty()) {
                        this.itemInfo_ = other.itemInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemInfoIsMutable();
                        this.itemInfo_.addAll(other.itemInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemInfo_.isEmpty()) {
                  if (this.itemInfoBuilder_.isEmpty()) {
                     this.itemInfoBuilder_.dispose();
                     this.itemInfoBuilder_ = null;
                     this.itemInfo_ = other.itemInfo_;
                     this.bitField0_ &= -3;
                     this.itemInfoBuilder_ = BroodMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
                  } else {
                     this.itemInfoBuilder_.addAllMessages(other.itemInfo_);
                  }
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCreateTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemInfoCount(); ++i) {
                  if (!this.getItemInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MyDrawRecord parsedMessage = null;

            try {
               parsedMessage = (MyDrawRecord)BroodMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MyDrawRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 1;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -2;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.itemInfo_ = new ArrayList(this.itemInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemInfoList() {
            return this.itemInfoBuilder_ == null ? Collections.unmodifiableList(this.itemInfo_) : this.itemInfoBuilder_.getMessageList();
         }

         public int getItemInfoCount() {
            return this.itemInfoBuilder_ == null ? this.itemInfo_.size() : this.itemInfoBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItemInfo(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfo)this.itemInfo_.get(index) : (CommonMsg.ItemInfo)this.itemInfoBuilder_.getMessage(index);
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemInfo(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemInfo_);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemInfo(int index) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.remove(index);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
            return this.itemInfoBuilder_ != null ? this.itemInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemInfo_);
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemInfoBuilderList() {
            return this.getItemInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemInfoFieldBuilder() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfoBuilder_ = new RepeatedFieldBuilderV3(this.itemInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = BroodMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ServerDrawRecord extends GeneratedMessageV3 implements ServerDrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemID_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SERVERID_FIELD_NUMBER = 4;
      private int serverId_;
      public static final int STAGE_FIELD_NUMBER = 5;
      private int stage_;
      public static final int SLOTTYPE_FIELD_NUMBER = 6;
      private int slotType_;
      private byte memoizedIsInitialized;
      private static final ServerDrawRecord DEFAULT_INSTANCE = new ServerDrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<ServerDrawRecord> PARSER = new AbstractParser<ServerDrawRecord>() {
         public ServerDrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ServerDrawRecord(input, extensionRegistry);
         }
      };

      private ServerDrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ServerDrawRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ServerDrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ServerDrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemID_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.serverId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.stage_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.slotType_ = input.readInt32();
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasBelovedItemID() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemID() {
         return this.belovedItemID_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasServerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSlotType() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getSlotType() {
         return this.slotType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemID()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.createTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemID_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.serverId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.stage_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.slotType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.createTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemID_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.serverId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.stage_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.slotType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ServerDrawRecord)) {
            return super.equals(obj);
         } else {
            ServerDrawRecord other = (ServerDrawRecord)obj;
            if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasBelovedItemID() != other.hasBelovedItemID()) {
               return false;
            } else if (this.hasBelovedItemID() && this.getBelovedItemID() != other.getBelovedItemID()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSlotType() != other.hasSlotType()) {
               return false;
            } else if (this.hasSlotType() && this.getSlotType() != other.getSlotType()) {
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
            if (this.hasCreateTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasBelovedItemID()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemID();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSlotType()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getSlotType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ServerDrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(InputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ServerDrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ServerDrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ServerDrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ServerDrawRecord> parser() {
         return PARSER;
      }

      public Parser<ServerDrawRecord> getParserForType() {
         return PARSER;
      }

      public ServerDrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerDrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private int belovedItemID_;
         private Object playerName_;
         private int serverId_;
         private int stage_;
         private int slotType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (BroodMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.createTime_ = 0;
            this.bitField0_ &= -2;
            this.belovedItemID_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.bitField0_ &= -9;
            this.stage_ = 0;
            this.bitField0_ &= -17;
            this.slotType_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return BroodMsg.ServerDrawRecord.getDefaultInstance();
         }

         public ServerDrawRecord build() {
            ServerDrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ServerDrawRecord buildPartial() {
            ServerDrawRecord result = new ServerDrawRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemID_ = this.belovedItemID_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.slotType_ = this.slotType_;
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
            if (other instanceof ServerDrawRecord) {
               return this.mergeFrom((ServerDrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ServerDrawRecord other) {
            if (other == BroodMsg.ServerDrawRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasBelovedItemID()) {
                  this.setBelovedItemID(other.getBelovedItemID());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSlotType()) {
                  this.setSlotType(other.getSlotType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCreateTime()) {
               return false;
            } else if (!this.hasBelovedItemID()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ServerDrawRecord parsedMessage = null;

            try {
               parsedMessage = (ServerDrawRecord)BroodMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ServerDrawRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 1;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -2;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBelovedItemID() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemID() {
            return this.belovedItemID_;
         }

         public Builder setBelovedItemID(int value) {
            this.bitField0_ |= 2;
            this.belovedItemID_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemID() {
            this.bitField0_ &= -3;
            this.belovedItemID_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = BroodMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 8;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -9;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 16;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -17;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlotType() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getSlotType() {
            return this.slotType_;
         }

         public Builder setSlotType(int value) {
            this.bitField0_ |= 32;
            this.slotType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlotType() {
            this.bitField0_ &= -33;
            this.slotType_ = 0;
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

   public static final class C2S_Brood_26041 extends GeneratedMessageV3 implements C2S_Brood_26041OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int TIMES_FIELD_NUMBER = 2;
      private int times_;
      private byte memoizedIsInitialized;
      private static final C2S_Brood_26041 DEFAULT_INSTANCE = new C2S_Brood_26041();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Brood_26041> PARSER = new AbstractParser<C2S_Brood_26041>() {
         public C2S_Brood_26041 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Brood_26041(input, extensionRegistry);
         }
      };

      private C2S_Brood_26041(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Brood_26041() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Brood_26041();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Brood_26041(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.times_ = input.readInt32();
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Brood_26041.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTimes() {
         return this.times_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.times_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.times_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Brood_26041)) {
            return super.equals(obj);
         } else {
            C2S_Brood_26041 other = (C2S_Brood_26041)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasTimes() != other.hasTimes()) {
               return false;
            } else if (this.hasTimes() && this.getTimes() != other.getTimes()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Brood_26041 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data);
      }

      public static C2S_Brood_26041 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Brood_26041 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data);
      }

      public static C2S_Brood_26041 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Brood_26041 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data);
      }

      public static C2S_Brood_26041 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Brood_26041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Brood_26041 parseFrom(InputStream input) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Brood_26041 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Brood_26041 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Brood_26041 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Brood_26041 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Brood_26041 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Brood_26041)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Brood_26041 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Brood_26041 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Brood_26041> parser() {
         return PARSER;
      }

      public Parser<C2S_Brood_26041> getParserForType() {
         return PARSER;
      }

      public C2S_Brood_26041 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Brood_26041OrBuilder {
         private int bitField0_;
         private int type_;
         private int times_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Brood_26041.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_Brood_26041.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.times_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_Brood_26041_descriptor;
         }

         public C2S_Brood_26041 getDefaultInstanceForType() {
            return BroodMsg.C2S_Brood_26041.getDefaultInstance();
         }

         public C2S_Brood_26041 build() {
            C2S_Brood_26041 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Brood_26041 buildPartial() {
            C2S_Brood_26041 result = new C2S_Brood_26041(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.times_ = this.times_;
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
            if (other instanceof C2S_Brood_26041) {
               return this.mergeFrom((C2S_Brood_26041)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Brood_26041 other) {
            if (other == BroodMsg.C2S_Brood_26041.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasTimes()) {
                  this.setTimes(other.getTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasTimes();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Brood_26041 parsedMessage = null;

            try {
               parsedMessage = (C2S_Brood_26041)BroodMsg.C2S_Brood_26041.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Brood_26041)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTimes() {
            return this.times_;
         }

         public Builder setTimes(int value) {
            this.bitField0_ |= 2;
            this.times_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTimes() {
            this.bitField0_ &= -3;
            this.times_ = 0;
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

   public static final class S2C_Brood_26042 extends GeneratedMessageV3 implements S2C_Brood_26042OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 2;
      private boolean isHaveFancy_;
      public static final int BROODDRAWID2NUM_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> broodDrawId2Num_;
      public static final int BROODDRAWTYPE2NUM_FIELD_NUMBER = 4;
      private CommonMsg.MapDataII broodDrawType2Num_;
      private byte memoizedIsInitialized;
      private static final S2C_Brood_26042 DEFAULT_INSTANCE = new S2C_Brood_26042();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Brood_26042> PARSER = new AbstractParser<S2C_Brood_26042>() {
         public S2C_Brood_26042 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Brood_26042(input, extensionRegistry);
         }
      };

      private S2C_Brood_26042(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Brood_26042() {
         this.memoizedIsInitialized = -1;
         this.broodDrawId2Num_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Brood_26042();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Brood_26042(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isHaveFancy_ = input.readBool();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.broodDrawId2Num_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.broodDrawId2Num_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 34:
                        CommonMsg.MapDataII.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.broodDrawType2Num_.toBuilder();
                        }

                        this.broodDrawType2Num_ = (CommonMsg.MapDataII)input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.broodDrawType2Num_);
                           this.broodDrawType2Num_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
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
                  this.broodDrawId2Num_ = Collections.unmodifiableList(this.broodDrawId2Num_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Brood_26042.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
      }

      public List<CommonMsg.MapDataII> getBroodDrawId2NumList() {
         return this.broodDrawId2Num_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList() {
         return this.broodDrawId2Num_;
      }

      public int getBroodDrawId2NumCount() {
         return this.broodDrawId2Num_.size();
      }

      public CommonMsg.MapDataII getBroodDrawId2Num(int index) {
         return (CommonMsg.MapDataII)this.broodDrawId2Num_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2Num_.get(index);
      }

      public boolean hasBroodDrawType2Num() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.MapDataII getBroodDrawType2Num() {
         return this.broodDrawType2Num_ == null ? CommonMsg.MapDataII.getDefaultInstance() : this.broodDrawType2Num_;
      }

      public CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder() {
         return this.broodDrawType2Num_ == null ? CommonMsg.MapDataII.getDefaultInstance() : this.broodDrawType2Num_;
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
         } else if (!this.hasIsHaveFancy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBroodDrawType2Num()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBroodDrawId2NumCount(); ++i) {
               if (!this.getBroodDrawId2Num(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getBroodDrawType2Num().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isHaveFancy_);
         }

         for(int i = 0; i < this.broodDrawId2Num_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.broodDrawId2Num_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getBroodDrawType2Num());
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
               size += CodedOutputStream.computeBoolSize(2, this.isHaveFancy_);
            }

            for(int i = 0; i < this.broodDrawId2Num_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.broodDrawId2Num_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getBroodDrawType2Num());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Brood_26042)) {
            return super.equals(obj);
         } else {
            S2C_Brood_26042 other = (S2C_Brood_26042)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
               return false;
            } else if (!this.getBroodDrawId2NumList().equals(other.getBroodDrawId2NumList())) {
               return false;
            } else if (this.hasBroodDrawType2Num() != other.hasBroodDrawType2Num()) {
               return false;
            } else if (this.hasBroodDrawType2Num() && !this.getBroodDrawType2Num().equals(other.getBroodDrawType2Num())) {
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

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.getBroodDrawId2NumCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBroodDrawId2NumList().hashCode();
            }

            if (this.hasBroodDrawType2Num()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBroodDrawType2Num().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Brood_26042 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data);
      }

      public static S2C_Brood_26042 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Brood_26042 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data);
      }

      public static S2C_Brood_26042 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Brood_26042 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data);
      }

      public static S2C_Brood_26042 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Brood_26042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Brood_26042 parseFrom(InputStream input) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Brood_26042 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Brood_26042 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Brood_26042 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Brood_26042 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Brood_26042 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Brood_26042)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Brood_26042 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Brood_26042 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Brood_26042> parser() {
         return PARSER;
      }

      public Parser<S2C_Brood_26042> getParserForType() {
         return PARSER;
      }

      public S2C_Brood_26042 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Brood_26042OrBuilder {
         private int bitField0_;
         private int result_;
         private boolean isHaveFancy_;
         private List<CommonMsg.MapDataII> broodDrawId2Num_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodDrawId2NumBuilder_;
         private CommonMsg.MapDataII broodDrawType2Num_;
         private SingleFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodDrawType2NumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Brood_26042.class, Builder.class);
         }

         private Builder() {
            this.broodDrawId2Num_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.broodDrawId2Num_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_Brood_26042.alwaysUseFieldBuilders) {
               this.getBroodDrawId2NumFieldBuilder();
               this.getBroodDrawType2NumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.isHaveFancy_ = false;
            this.bitField0_ &= -3;
            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2Num_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.broodDrawId2NumBuilder_.clear();
            }

            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2Num_ = null;
            } else {
               this.broodDrawType2NumBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_Brood_26042_descriptor;
         }

         public S2C_Brood_26042 getDefaultInstanceForType() {
            return BroodMsg.S2C_Brood_26042.getDefaultInstance();
         }

         public S2C_Brood_26042 build() {
            S2C_Brood_26042 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Brood_26042 buildPartial() {
            S2C_Brood_26042 result = new S2C_Brood_26042(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
               to_bitField0_ |= 2;
            }

            if (this.broodDrawId2NumBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.broodDrawId2Num_ = Collections.unmodifiableList(this.broodDrawId2Num_);
                  this.bitField0_ &= -5;
               }

               result.broodDrawId2Num_ = this.broodDrawId2Num_;
            } else {
               result.broodDrawId2Num_ = this.broodDrawId2NumBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.broodDrawType2NumBuilder_ == null) {
                  result.broodDrawType2Num_ = this.broodDrawType2Num_;
               } else {
                  result.broodDrawType2Num_ = (CommonMsg.MapDataII)this.broodDrawType2NumBuilder_.build();
               }

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
            if (other instanceof S2C_Brood_26042) {
               return this.mergeFrom((S2C_Brood_26042)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Brood_26042 other) {
            if (other == BroodMsg.S2C_Brood_26042.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
               }

               if (this.broodDrawId2NumBuilder_ == null) {
                  if (!other.broodDrawId2Num_.isEmpty()) {
                     if (this.broodDrawId2Num_.isEmpty()) {
                        this.broodDrawId2Num_ = other.broodDrawId2Num_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureBroodDrawId2NumIsMutable();
                        this.broodDrawId2Num_.addAll(other.broodDrawId2Num_);
                     }

                     this.onChanged();
                  }
               } else if (!other.broodDrawId2Num_.isEmpty()) {
                  if (this.broodDrawId2NumBuilder_.isEmpty()) {
                     this.broodDrawId2NumBuilder_.dispose();
                     this.broodDrawId2NumBuilder_ = null;
                     this.broodDrawId2Num_ = other.broodDrawId2Num_;
                     this.bitField0_ &= -5;
                     this.broodDrawId2NumBuilder_ = BroodMsg.S2C_Brood_26042.alwaysUseFieldBuilders ? this.getBroodDrawId2NumFieldBuilder() : null;
                  } else {
                     this.broodDrawId2NumBuilder_.addAllMessages(other.broodDrawId2Num_);
                  }
               }

               if (other.hasBroodDrawType2Num()) {
                  this.mergeBroodDrawType2Num(other.getBroodDrawType2Num());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasIsHaveFancy()) {
               return false;
            } else if (!this.hasBroodDrawType2Num()) {
               return false;
            } else {
               for(int i = 0; i < this.getBroodDrawId2NumCount(); ++i) {
                  if (!this.getBroodDrawId2Num(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getBroodDrawType2Num().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Brood_26042 parsedMessage = null;

            try {
               parsedMessage = (S2C_Brood_26042)BroodMsg.S2C_Brood_26042.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Brood_26042)e.getUnfinishedMessage();
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

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 2;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -3;
            this.isHaveFancy_ = false;
            this.onChanged();
            return this;
         }

         private void ensureBroodDrawId2NumIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.broodDrawId2Num_ = new ArrayList(this.broodDrawId2Num_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getBroodDrawId2NumList() {
            return this.broodDrawId2NumBuilder_ == null ? Collections.unmodifiableList(this.broodDrawId2Num_) : this.broodDrawId2NumBuilder_.getMessageList();
         }

         public int getBroodDrawId2NumCount() {
            return this.broodDrawId2NumBuilder_ == null ? this.broodDrawId2Num_.size() : this.broodDrawId2NumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBroodDrawId2Num(int index) {
            return this.broodDrawId2NumBuilder_ == null ? (CommonMsg.MapDataII)this.broodDrawId2Num_.get(index) : (CommonMsg.MapDataII)this.broodDrawId2NumBuilder_.getMessage(index);
         }

         public Builder setBroodDrawId2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.set(index, value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBroodDrawId2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawId2Num(CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBroodDrawId2Num(int index, CommonMsg.MapDataII value) {
            if (this.broodDrawId2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(index, value);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBroodDrawId2Num(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBroodDrawId2Num(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBroodDrawId2Num(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.broodDrawId2Num_);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBroodDrawId2Num() {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2Num_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.clear();
            }

            return this;
         }

         public Builder removeBroodDrawId2Num(int index) {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.ensureBroodDrawId2NumIsMutable();
               this.broodDrawId2Num_.remove(index);
               this.onChanged();
            } else {
               this.broodDrawId2NumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodDrawId2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index) {
            return this.broodDrawId2NumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2Num_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.broodDrawId2NumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList() {
            return this.broodDrawId2NumBuilder_ != null ? this.broodDrawId2NumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.broodDrawId2Num_);
         }

         public CommonMsg.MapDataII.Builder addBroodDrawId2NumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBroodDrawId2NumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawId2NumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBroodDrawId2NumBuilderList() {
            return this.getBroodDrawId2NumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumFieldBuilder() {
            if (this.broodDrawId2NumBuilder_ == null) {
               this.broodDrawId2NumBuilder_ = new RepeatedFieldBuilderV3(this.broodDrawId2Num_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.broodDrawId2Num_ = null;
            }

            return this.broodDrawId2NumBuilder_;
         }

         public boolean hasBroodDrawType2Num() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.MapDataII getBroodDrawType2Num() {
            if (this.broodDrawType2NumBuilder_ == null) {
               return this.broodDrawType2Num_ == null ? CommonMsg.MapDataII.getDefaultInstance() : this.broodDrawType2Num_;
            } else {
               return (CommonMsg.MapDataII)this.broodDrawType2NumBuilder_.getMessage();
            }
         }

         public Builder setBroodDrawType2Num(CommonMsg.MapDataII value) {
            if (this.broodDrawType2NumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.broodDrawType2Num_ = value;
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBroodDrawType2Num(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2Num_ = builderForValue.build();
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBroodDrawType2Num(CommonMsg.MapDataII value) {
            if (this.broodDrawType2NumBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.broodDrawType2Num_ != null && this.broodDrawType2Num_ != CommonMsg.MapDataII.getDefaultInstance()) {
                  this.broodDrawType2Num_ = CommonMsg.MapDataII.newBuilder(this.broodDrawType2Num_).mergeFrom(value).buildPartial();
               } else {
                  this.broodDrawType2Num_ = value;
               }

               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBroodDrawType2Num() {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2Num_ = null;
               this.onChanged();
            } else {
               this.broodDrawType2NumBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodDrawType2NumBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (CommonMsg.MapDataII.Builder)this.getBroodDrawType2NumFieldBuilder().getBuilder();
         }

         public CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder() {
            if (this.broodDrawType2NumBuilder_ != null) {
               return (CommonMsg.MapDataIIOrBuilder)this.broodDrawType2NumBuilder_.getMessageOrBuilder();
            } else {
               return this.broodDrawType2Num_ == null ? CommonMsg.MapDataII.getDefaultInstance() : this.broodDrawType2Num_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodDrawType2NumFieldBuilder() {
            if (this.broodDrawType2NumBuilder_ == null) {
               this.broodDrawType2NumBuilder_ = new SingleFieldBuilderV3(this.getBroodDrawType2Num(), this.getParentForChildren(), this.isClean());
               this.broodDrawType2Num_ = null;
            }

            return this.broodDrawType2NumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_CrossActOpenDay_26051 extends GeneratedMessageV3 implements S2C_CrossActOpenDay_26051OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int JOINSERVERS_FIELD_NUMBER = 2;
      private Internal.IntList joinServers_;
      private byte memoizedIsInitialized;
      private static final S2C_CrossActOpenDay_26051 DEFAULT_INSTANCE = new S2C_CrossActOpenDay_26051();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CrossActOpenDay_26051> PARSER = new AbstractParser<S2C_CrossActOpenDay_26051>() {
         public S2C_CrossActOpenDay_26051 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CrossActOpenDay_26051(input, extensionRegistry);
         }
      };

      private S2C_CrossActOpenDay_26051(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CrossActOpenDay_26051() {
         this.memoizedIsInitialized = -1;
         this.joinServers_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CrossActOpenDay_26051();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CrossActOpenDay_26051(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openDay_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.joinServers_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.joinServers_.addInt(input.readInt32());
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
                  this.joinServers_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossActOpenDay_26051.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public List<Integer> getJoinServersList() {
         return this.joinServers_;
      }

      public int getJoinServersCount() {
         return this.joinServers_.size();
      }

      public int getJoinServers(int index) {
         return this.joinServers_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.openDay_);
         }

         for(int i = 0; i < this.joinServers_.size(); ++i) {
            output.writeInt32(2, this.joinServers_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.openDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.joinServers_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.joinServers_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getJoinServersList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CrossActOpenDay_26051)) {
            return super.equals(obj);
         } else {
            S2C_CrossActOpenDay_26051 other = (S2C_CrossActOpenDay_26051)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (!this.getJoinServersList().equals(other.getJoinServersList())) {
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
            if (this.hasOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.getJoinServersCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getJoinServersList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_26051)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(InputStream input) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_26051 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_26051 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_26051 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_26051)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CrossActOpenDay_26051 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CrossActOpenDay_26051 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CrossActOpenDay_26051> parser() {
         return PARSER;
      }

      public Parser<S2C_CrossActOpenDay_26051> getParserForType() {
         return PARSER;
      }

      public S2C_CrossActOpenDay_26051 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CrossActOpenDay_26051OrBuilder {
         private int bitField0_;
         private int openDay_;
         private Internal.IntList joinServers_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossActOpenDay_26051.class, Builder.class);
         }

         private Builder() {
            this.joinServers_ = BroodMsg.S2C_CrossActOpenDay_26051.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.joinServers_ = BroodMsg.S2C_CrossActOpenDay_26051.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_CrossActOpenDay_26051.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.joinServers_ = BroodMsg.S2C_CrossActOpenDay_26051.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_CrossActOpenDay_26051_descriptor;
         }

         public S2C_CrossActOpenDay_26051 getDefaultInstanceForType() {
            return BroodMsg.S2C_CrossActOpenDay_26051.getDefaultInstance();
         }

         public S2C_CrossActOpenDay_26051 build() {
            S2C_CrossActOpenDay_26051 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CrossActOpenDay_26051 buildPartial() {
            S2C_CrossActOpenDay_26051 result = new S2C_CrossActOpenDay_26051(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.joinServers_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.joinServers_ = this.joinServers_;
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
            if (other instanceof S2C_CrossActOpenDay_26051) {
               return this.mergeFrom((S2C_CrossActOpenDay_26051)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CrossActOpenDay_26051 other) {
            if (other == BroodMsg.S2C_CrossActOpenDay_26051.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (!other.joinServers_.isEmpty()) {
                  if (this.joinServers_.isEmpty()) {
                     this.joinServers_ = other.joinServers_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureJoinServersIsMutable();
                     this.joinServers_.addAll(other.joinServers_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOpenDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CrossActOpenDay_26051 parsedMessage = null;

            try {
               parsedMessage = (S2C_CrossActOpenDay_26051)BroodMsg.S2C_CrossActOpenDay_26051.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CrossActOpenDay_26051)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 1;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -2;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureJoinServersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.joinServers_ = BroodMsg.S2C_CrossActOpenDay_26051.mutableCopy(this.joinServers_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getJoinServersList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.joinServers_) : this.joinServers_);
         }

         public int getJoinServersCount() {
            return this.joinServers_.size();
         }

         public int getJoinServers(int index) {
            return this.joinServers_.getInt(index);
         }

         public Builder setJoinServers(int index, int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addJoinServers(int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllJoinServers(Iterable<? extends Integer> values) {
            this.ensureJoinServersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.joinServers_);
            this.onChanged();
            return this;
         }

         public Builder clearJoinServers() {
            this.joinServers_ = BroodMsg.S2C_CrossActOpenDay_26051.emptyIntList();
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

   public static final class S2C_RankTotalScoreUpdate_26052 extends GeneratedMessageV3 implements S2C_RankTotalScoreUpdate_26052OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALSCORE_FIELD_NUMBER = 1;
      private int totalScore_;
      private byte memoizedIsInitialized;
      private static final S2C_RankTotalScoreUpdate_26052 DEFAULT_INSTANCE = new S2C_RankTotalScoreUpdate_26052();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankTotalScoreUpdate_26052> PARSER = new AbstractParser<S2C_RankTotalScoreUpdate_26052>() {
         public S2C_RankTotalScoreUpdate_26052 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankTotalScoreUpdate_26052(input, extensionRegistry);
         }
      };

      private S2C_RankTotalScoreUpdate_26052(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankTotalScoreUpdate_26052() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankTotalScoreUpdate_26052();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankTotalScoreUpdate_26052(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalScore_ = input.readInt32();
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankTotalScoreUpdate_26052.class, Builder.class);
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalScore_);
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
               size += CodedOutputStream.computeInt32Size(1, this.totalScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankTotalScoreUpdate_26052)) {
            return super.equals(obj);
         } else {
            S2C_RankTotalScoreUpdate_26052 other = (S2C_RankTotalScoreUpdate_26052)obj;
            if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
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
            if (this.hasTotalScore()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankTotalScoreUpdate_26052)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(InputStream input) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankTotalScoreUpdate_26052 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankTotalScoreUpdate_26052)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankTotalScoreUpdate_26052 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankTotalScoreUpdate_26052 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankTotalScoreUpdate_26052> parser() {
         return PARSER;
      }

      public Parser<S2C_RankTotalScoreUpdate_26052> getParserForType() {
         return PARSER;
      }

      public S2C_RankTotalScoreUpdate_26052 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankTotalScoreUpdate_26052OrBuilder {
         private int bitField0_;
         private int totalScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankTotalScoreUpdate_26052.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_RankTotalScoreUpdate_26052.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalScore_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_RankTotalScoreUpdate_26052_descriptor;
         }

         public S2C_RankTotalScoreUpdate_26052 getDefaultInstanceForType() {
            return BroodMsg.S2C_RankTotalScoreUpdate_26052.getDefaultInstance();
         }

         public S2C_RankTotalScoreUpdate_26052 build() {
            S2C_RankTotalScoreUpdate_26052 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankTotalScoreUpdate_26052 buildPartial() {
            S2C_RankTotalScoreUpdate_26052 result = new S2C_RankTotalScoreUpdate_26052(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalScore_ = this.totalScore_;
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
            if (other instanceof S2C_RankTotalScoreUpdate_26052) {
               return this.mergeFrom((S2C_RankTotalScoreUpdate_26052)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankTotalScoreUpdate_26052 other) {
            if (other == BroodMsg.S2C_RankTotalScoreUpdate_26052.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalScore();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RankTotalScoreUpdate_26052 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankTotalScoreUpdate_26052)BroodMsg.S2C_RankTotalScoreUpdate_26052.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankTotalScoreUpdate_26052)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalScore() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalScore() {
            return this.totalScore_;
         }

         public Builder setTotalScore(int value) {
            this.bitField0_ |= 1;
            this.totalScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalScore() {
            this.bitField0_ &= -2;
            this.totalScore_ = 0;
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

   public static final class C2S_BroodBuy_26060 extends GeneratedMessageV3 implements C2S_BroodBuy_26060OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_BroodBuy_26060 DEFAULT_INSTANCE = new C2S_BroodBuy_26060();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BroodBuy_26060> PARSER = new AbstractParser<C2S_BroodBuy_26060>() {
         public C2S_BroodBuy_26060 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BroodBuy_26060(input, extensionRegistry);
         }
      };

      private C2S_BroodBuy_26060(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BroodBuy_26060() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BroodBuy_26060();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BroodBuy_26060(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BroodBuy_26060.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BroodBuy_26060)) {
            return super.equals(obj);
         } else {
            C2S_BroodBuy_26060 other = (C2S_BroodBuy_26060)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BroodBuy_26060 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data);
      }

      public static C2S_BroodBuy_26060 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BroodBuy_26060 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data);
      }

      public static C2S_BroodBuy_26060 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BroodBuy_26060 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data);
      }

      public static C2S_BroodBuy_26060 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BroodBuy_26060)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BroodBuy_26060 parseFrom(InputStream input) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BroodBuy_26060 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BroodBuy_26060 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BroodBuy_26060 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BroodBuy_26060 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BroodBuy_26060 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BroodBuy_26060)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BroodBuy_26060 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BroodBuy_26060 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BroodBuy_26060> parser() {
         return PARSER;
      }

      public Parser<C2S_BroodBuy_26060> getParserForType() {
         return PARSER;
      }

      public C2S_BroodBuy_26060 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BroodBuy_26060OrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BroodBuy_26060.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.C2S_BroodBuy_26060.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_C2S_BroodBuy_26060_descriptor;
         }

         public C2S_BroodBuy_26060 getDefaultInstanceForType() {
            return BroodMsg.C2S_BroodBuy_26060.getDefaultInstance();
         }

         public C2S_BroodBuy_26060 build() {
            C2S_BroodBuy_26060 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BroodBuy_26060 buildPartial() {
            C2S_BroodBuy_26060 result = new C2S_BroodBuy_26060(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_BroodBuy_26060) {
               return this.mergeFrom((C2S_BroodBuy_26060)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BroodBuy_26060 other) {
            if (other == BroodMsg.C2S_BroodBuy_26060.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BroodBuy_26060 parsedMessage = null;

            try {
               parsedMessage = (C2S_BroodBuy_26060)BroodMsg.C2S_BroodBuy_26060.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BroodBuy_26060)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
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

   public static final class S2C_BroodBuy_26061 extends GeneratedMessageV3 implements S2C_BroodBuy_26061OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BROODBUYIDNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> broodBuyIdNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BroodBuy_26061 DEFAULT_INSTANCE = new S2C_BroodBuy_26061();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BroodBuy_26061> PARSER = new AbstractParser<S2C_BroodBuy_26061>() {
         public S2C_BroodBuy_26061 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BroodBuy_26061(input, extensionRegistry);
         }
      };

      private S2C_BroodBuy_26061(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BroodBuy_26061() {
         this.memoizedIsInitialized = -1;
         this.broodBuyIdNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BroodBuy_26061();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BroodBuy_26061(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.broodBuyIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.broodBuyIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.broodBuyIdNum_ = Collections.unmodifiableList(this.broodBuyIdNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BroodBuy_26061.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getBroodBuyIdNumList() {
         return this.broodBuyIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList() {
         return this.broodBuyIdNum_;
      }

      public int getBroodBuyIdNumCount() {
         return this.broodBuyIdNum_.size();
      }

      public CommonMsg.MapDataII getBroodBuyIdNum(int index) {
         return (CommonMsg.MapDataII)this.broodBuyIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBroodBuyIdNumCount(); ++i) {
               if (!this.getBroodBuyIdNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.broodBuyIdNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.broodBuyIdNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.broodBuyIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.broodBuyIdNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BroodBuy_26061)) {
            return super.equals(obj);
         } else {
            S2C_BroodBuy_26061 other = (S2C_BroodBuy_26061)obj;
            if (!this.getBroodBuyIdNumList().equals(other.getBroodBuyIdNumList())) {
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
            if (this.getBroodBuyIdNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBroodBuyIdNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BroodBuy_26061 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data);
      }

      public static S2C_BroodBuy_26061 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BroodBuy_26061 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data);
      }

      public static S2C_BroodBuy_26061 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BroodBuy_26061 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data);
      }

      public static S2C_BroodBuy_26061 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BroodBuy_26061)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BroodBuy_26061 parseFrom(InputStream input) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BroodBuy_26061 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BroodBuy_26061 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BroodBuy_26061 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BroodBuy_26061 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BroodBuy_26061 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BroodBuy_26061)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BroodBuy_26061 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BroodBuy_26061 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BroodBuy_26061> parser() {
         return PARSER;
      }

      public Parser<S2C_BroodBuy_26061> getParserForType() {
         return PARSER;
      }

      public S2C_BroodBuy_26061 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BroodBuy_26061OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> broodBuyIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> broodBuyIdNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BroodBuy_26061.class, Builder.class);
         }

         private Builder() {
            this.broodBuyIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.broodBuyIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BroodMsg.S2C_BroodBuy_26061.alwaysUseFieldBuilders) {
               this.getBroodBuyIdNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.broodBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BroodMsg.internal_static_Brood_com_gzbz_protobuf_S2C_BroodBuy_26061_descriptor;
         }

         public S2C_BroodBuy_26061 getDefaultInstanceForType() {
            return BroodMsg.S2C_BroodBuy_26061.getDefaultInstance();
         }

         public S2C_BroodBuy_26061 build() {
            S2C_BroodBuy_26061 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BroodBuy_26061 buildPartial() {
            S2C_BroodBuy_26061 result = new S2C_BroodBuy_26061(this);
            int from_bitField0_ = this.bitField0_;
            if (this.broodBuyIdNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.broodBuyIdNum_ = Collections.unmodifiableList(this.broodBuyIdNum_);
                  this.bitField0_ &= -2;
               }

               result.broodBuyIdNum_ = this.broodBuyIdNum_;
            } else {
               result.broodBuyIdNum_ = this.broodBuyIdNumBuilder_.build();
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
            if (other instanceof S2C_BroodBuy_26061) {
               return this.mergeFrom((S2C_BroodBuy_26061)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BroodBuy_26061 other) {
            if (other == BroodMsg.S2C_BroodBuy_26061.getDefaultInstance()) {
               return this;
            } else {
               if (this.broodBuyIdNumBuilder_ == null) {
                  if (!other.broodBuyIdNum_.isEmpty()) {
                     if (this.broodBuyIdNum_.isEmpty()) {
                        this.broodBuyIdNum_ = other.broodBuyIdNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBroodBuyIdNumIsMutable();
                        this.broodBuyIdNum_.addAll(other.broodBuyIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.broodBuyIdNum_.isEmpty()) {
                  if (this.broodBuyIdNumBuilder_.isEmpty()) {
                     this.broodBuyIdNumBuilder_.dispose();
                     this.broodBuyIdNumBuilder_ = null;
                     this.broodBuyIdNum_ = other.broodBuyIdNum_;
                     this.bitField0_ &= -2;
                     this.broodBuyIdNumBuilder_ = BroodMsg.S2C_BroodBuy_26061.alwaysUseFieldBuilders ? this.getBroodBuyIdNumFieldBuilder() : null;
                  } else {
                     this.broodBuyIdNumBuilder_.addAllMessages(other.broodBuyIdNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBroodBuyIdNumCount(); ++i) {
               if (!this.getBroodBuyIdNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BroodBuy_26061 parsedMessage = null;

            try {
               parsedMessage = (S2C_BroodBuy_26061)BroodMsg.S2C_BroodBuy_26061.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BroodBuy_26061)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBroodBuyIdNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.broodBuyIdNum_ = new ArrayList(this.broodBuyIdNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getBroodBuyIdNumList() {
            return this.broodBuyIdNumBuilder_ == null ? Collections.unmodifiableList(this.broodBuyIdNum_) : this.broodBuyIdNumBuilder_.getMessageList();
         }

         public int getBroodBuyIdNumCount() {
            return this.broodBuyIdNumBuilder_ == null ? this.broodBuyIdNum_.size() : this.broodBuyIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBroodBuyIdNum(int index) {
            return this.broodBuyIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.broodBuyIdNum_.get(index) : (CommonMsg.MapDataII)this.broodBuyIdNumBuilder_.getMessage(index);
         }

         public Builder setBroodBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBroodBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBroodBuyIdNum(CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBroodBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.broodBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBroodBuyIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBroodBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBroodBuyIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.broodBuyIdNum_);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBroodBuyIdNum() {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeBroodBuyIdNum(int index) {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.ensureBroodBuyIdNumIsMutable();
               this.broodBuyIdNum_.remove(index);
               this.onChanged();
            } else {
               this.broodBuyIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBroodBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index) {
            return this.broodBuyIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.broodBuyIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList() {
            return this.broodBuyIdNumBuilder_ != null ? this.broodBuyIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.broodBuyIdNum_);
         }

         public CommonMsg.MapDataII.Builder addBroodBuyIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBroodBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBroodBuyIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBroodBuyIdNumBuilderList() {
            return this.getBroodBuyIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumFieldBuilder() {
            if (this.broodBuyIdNumBuilder_ == null) {
               this.broodBuyIdNumBuilder_ = new RepeatedFieldBuilderV3(this.broodBuyIdNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.broodBuyIdNum_ = null;
            }

            return this.broodBuyIdNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ActivityInfo_26001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BroodBuy_26060OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_Brood_26041OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasTimes();

      int getTimes();
   }

   public interface C2S_CommitTask_26011OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_DrawRecord_26021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ServerDrawRecord_26023OrBuilder extends MessageOrBuilder {
   }

   public interface MyDrawRecordOrBuilder extends MessageOrBuilder {
      boolean hasCreateTime();

      int getCreateTime();

      List<CommonMsg.ItemInfo> getItemInfoList();

      CommonMsg.ItemInfo getItemInfo(int index);

      int getItemInfoCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index);

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2C_ActivityInfo_26002OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActDay();

      int getActDay();

      boolean hasTotalScore();

      int getTotalScore();

      List<Integer> getJoinServersList();

      int getJoinServersCount();

      int getJoinServers(int index);

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);

      List<CommonMsg.MapDataII> getBroodBuyIdNumList();

      CommonMsg.MapDataII getBroodBuyIdNum(int index);

      int getBroodBuyIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getBroodDrawId2NumList();

      CommonMsg.MapDataII getBroodDrawId2Num(int index);

      int getBroodDrawId2NumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index);

      List<CommonMsg.MapDataII> getBroodDrawType2NumList();

      CommonMsg.MapDataII getBroodDrawType2Num(int index);

      int getBroodDrawType2NumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawType2NumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder(int index);
   }

   public interface S2C_BroodBuy_26061OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getBroodBuyIdNumList();

      CommonMsg.MapDataII getBroodBuyIdNum(int index);

      int getBroodBuyIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBroodBuyIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBroodBuyIdNumOrBuilder(int index);
   }

   public interface S2C_Brood_26042OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      List<CommonMsg.MapDataII> getBroodDrawId2NumList();

      CommonMsg.MapDataII getBroodDrawId2Num(int index);

      int getBroodDrawId2NumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBroodDrawId2NumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBroodDrawId2NumOrBuilder(int index);

      boolean hasBroodDrawType2Num();

      CommonMsg.MapDataII getBroodDrawType2Num();

      CommonMsg.MapDataIIOrBuilder getBroodDrawType2NumOrBuilder();
   }

   public interface S2C_CommitTask_26012OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_CrossActOpenDay_26051OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      List<Integer> getJoinServersList();

      int getJoinServersCount();

      int getJoinServers(int index);
   }

   public interface S2C_DrawRecord_26022OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_RankTotalScoreUpdate_26052OrBuilder extends MessageOrBuilder {
      boolean hasTotalScore();

      int getTotalScore();
   }

   public interface S2C_ServerDrawRecord_26024OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_TaskNotice_26013OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }

   public interface ServerDrawRecordOrBuilder extends MessageOrBuilder {
      boolean hasCreateTime();

      int getCreateTime();

      boolean hasBelovedItemID();

      int getBelovedItemID();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasServerId();

      int getServerId();

      boolean hasStage();

      int getStage();

      boolean hasSlotType();

      int getSlotType();
   }
}
