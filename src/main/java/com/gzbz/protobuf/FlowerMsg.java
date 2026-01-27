package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class FlowerMsg {
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FlowerMsg() {
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
      String[] descriptorData = new String[]{"\n\fFlower.proto\u0012\u0018Flower.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_24701\"ô\u0001\n\u0016S2C_ActivityInfo_24702\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rsendFlowerNum\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fgetFlowerNum\u0018\u0003 \u0002(\u0005\u0012\u0012\n\ntotalScore\u0018\u0004 \u0002(\u0005\u00126\n\btaskList\u0018\u0005 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012)\n\u000eflowerBuyIdNum\u0018\u0006 \u0003(\u000b2\u0011.common.MapDataII\u0012%\n\nscoreIdNum\u0018\u0007 \u0003(\u000b2\u0011.common.MapDataII\"&\n\u0014C2S_CommitTask_24703\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_24704\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"N\n\u0014S2C_TaskNotice_24705\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\".\n\u0013C2S_FlowerBuy_24706\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"@\n\u0013S2C_FlowerBuy_24707\u0012)\n\u000eflowerBuyIdNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"&\n\u0018C2S_RecScoreReward_24708\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"A\n\u0018S2C_RecScoreReward_24709\u0012%\n\nscoreIdNum\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\";\n\u0014C2S_GiveFlower_24710\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tflowerNum\u0018\u0002 \u0002(\u0005\"-\n\u0014S2C_GiveFlower_24711\u0012\u0015\n\rsendFlowerNum\u0018\u0001 \u0002(\u0005\"5\n!C2S_GetOtherPlayerFlowerNum_24712\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"9\n!S2C_GetOtherPlayerFlowerNum_24713\u0012\u0014\n\fgetFlowerNum\u0018\u0001 \u0002(\u0005\",\n\u0019S2C_CrossActOpenDay_24714\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\"7\n\u001dC2S_GetFlowerRankDetail_24715\u0012\u0016\n\u000etargetPlayerId\u0018\u0001 \u0002(\u0005\"s\n\u001dS2C_GetFlowerRankDetail_24716\u0012R\n\u0017getFlowerRankDetailData\u0018\u0001 \u0003(\u000b21.Flower.com.gzbz.protobuf.GetFlowerRankDetailData\"\u007f\n\u0017GetFlowerRankDetailData\u0012\u0014\n\fsendPlayerId\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esendPlayerName\u0018\u0002 \u0002(\t\u0012\u0015\n\rsendFlowerNum\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005\",\n\u001cC2S_FriendGetFlowerNum_24717\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"j\n\u001cS2C_FriendGetFlowerNum_24718\u0012J\n\u0013friendGetFlowerData\u0018\u0001 \u0003(\u000b2-.Flower.com.gzbz.protobuf.FriendGetFlowerData\"r\n\u0013FriendGetFlowerData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fgetFlowerNum\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005B \n\u0011com.gzbz.protobufB\tFlowerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor, new String[0]);
      internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor, new String[]{"OpenDay", "SendFlowerNum", "GetFlowerNum", "TotalScore", "TaskList", "FlowerBuyIdNum", "ScoreIdNum"});
      internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor, new String[]{"TaskId"});
      internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor, new String[]{"TaskId"});
      internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor, new String[]{"TaskList"});
      internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor, new String[]{"Id", "Num"});
      internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor, new String[]{"FlowerBuyIdNum"});
      internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor, new String[]{"Id"});
      internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor, new String[]{"ScoreIdNum"});
      internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor, new String[]{"PlayerId", "FlowerNum"});
      internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor, new String[]{"SendFlowerNum"});
      internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor, new String[]{"PlayerId"});
      internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor, new String[]{"GetFlowerNum"});
      internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor, new String[]{"OpenDay"});
      internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor, new String[]{"TargetPlayerId"});
      internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor, new String[]{"GetFlowerRankDetailData"});
      internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor, new String[]{"SendPlayerId", "SendPlayerName", "SendFlowerNum", "Head", "HeadFrame"});
      internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor, new String[]{"Type"});
      internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor, new String[]{"FriendGetFlowerData"});
      internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor, new String[]{"PlayerId", "PlayerName", "GetFlowerNum", "Head", "HeadFrame"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_24701 extends GeneratedMessageV3 implements C2S_ActivityInfo_24701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_24701 DEFAULT_INSTANCE = new C2S_ActivityInfo_24701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_24701> PARSER = new AbstractParser<C2S_ActivityInfo_24701>() {
         public C2S_ActivityInfo_24701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_24701(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_24701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_24701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_24701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_24701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_24701)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_24701 other = (C2S_ActivityInfo_24701)obj;
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

      public static C2S_ActivityInfo_24701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24701 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_24701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_24701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_24701> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_24701> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_24701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_24701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_ActivityInfo_24701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_ActivityInfo_24701_descriptor;
         }

         public C2S_ActivityInfo_24701 getDefaultInstanceForType() {
            return FlowerMsg.C2S_ActivityInfo_24701.getDefaultInstance();
         }

         public C2S_ActivityInfo_24701 build() {
            C2S_ActivityInfo_24701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_24701 buildPartial() {
            C2S_ActivityInfo_24701 result = new C2S_ActivityInfo_24701(this);
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
            if (other instanceof C2S_ActivityInfo_24701) {
               return this.mergeFrom((C2S_ActivityInfo_24701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_24701 other) {
            if (other == FlowerMsg.C2S_ActivityInfo_24701.getDefaultInstance()) {
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
            C2S_ActivityInfo_24701 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_24701)FlowerMsg.C2S_ActivityInfo_24701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_24701)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_24702 extends GeneratedMessageV3 implements S2C_ActivityInfo_24702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int SENDFLOWERNUM_FIELD_NUMBER = 2;
      private int sendFlowerNum_;
      public static final int GETFLOWERNUM_FIELD_NUMBER = 3;
      private int getFlowerNum_;
      public static final int TOTALSCORE_FIELD_NUMBER = 4;
      private int totalScore_;
      public static final int TASKLIST_FIELD_NUMBER = 5;
      private List<ActivityMsg.TaskData> taskList_;
      public static final int FLOWERBUYIDNUM_FIELD_NUMBER = 6;
      private List<CommonMsg.MapDataII> flowerBuyIdNum_;
      public static final int SCOREIDNUM_FIELD_NUMBER = 7;
      private List<CommonMsg.MapDataII> scoreIdNum_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_24702 DEFAULT_INSTANCE = new S2C_ActivityInfo_24702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_24702> PARSER = new AbstractParser<S2C_ActivityInfo_24702>() {
         public S2C_ActivityInfo_24702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_24702(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_24702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_24702() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
         this.flowerBuyIdNum_ = Collections.emptyList();
         this.scoreIdNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_24702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_24702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.sendFlowerNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.getFlowerNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.totalScore_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.flowerBuyIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.flowerBuyIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.scoreIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.scoreIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.flowerBuyIdNum_ = Collections.unmodifiableList(this.flowerBuyIdNum_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.scoreIdNum_ = Collections.unmodifiableList(this.scoreIdNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24702.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasSendFlowerNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSendFlowerNum() {
         return this.sendFlowerNum_;
      }

      public boolean hasGetFlowerNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGetFlowerNum() {
         return this.getFlowerNum_;
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
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

      public List<CommonMsg.MapDataII> getFlowerBuyIdNumList() {
         return this.flowerBuyIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList() {
         return this.flowerBuyIdNum_;
      }

      public int getFlowerBuyIdNumCount() {
         return this.flowerBuyIdNum_.size();
      }

      public CommonMsg.MapDataII getFlowerBuyIdNum(int index) {
         return (CommonMsg.MapDataII)this.flowerBuyIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getScoreIdNumList() {
         return this.scoreIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList() {
         return this.scoreIdNum_;
      }

      public int getScoreIdNumCount() {
         return this.scoreIdNum_.size();
      }

      public CommonMsg.MapDataII getScoreIdNum(int index) {
         return (CommonMsg.MapDataII)this.scoreIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.scoreIdNum_.get(index);
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
         } else if (!this.hasSendFlowerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGetFlowerNum()) {
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

            for(int i = 0; i < this.getFlowerBuyIdNumCount(); ++i) {
               if (!this.getFlowerBuyIdNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getScoreIdNumCount(); ++i) {
               if (!this.getScoreIdNum(i).isInitialized()) {
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
            output.writeInt32(2, this.sendFlowerNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.getFlowerNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.totalScore_);
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.taskList_.get(i));
         }

         for(int i = 0; i < this.flowerBuyIdNum_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.flowerBuyIdNum_.get(i));
         }

         for(int i = 0; i < this.scoreIdNum_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.scoreIdNum_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.sendFlowerNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.getFlowerNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalScore_);
            }

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.taskList_.get(i));
            }

            for(int i = 0; i < this.flowerBuyIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.flowerBuyIdNum_.get(i));
            }

            for(int i = 0; i < this.scoreIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.scoreIdNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_24702)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_24702 other = (S2C_ActivityInfo_24702)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasSendFlowerNum() != other.hasSendFlowerNum()) {
               return false;
            } else if (this.hasSendFlowerNum() && this.getSendFlowerNum() != other.getSendFlowerNum()) {
               return false;
            } else if (this.hasGetFlowerNum() != other.hasGetFlowerNum()) {
               return false;
            } else if (this.hasGetFlowerNum() && this.getGetFlowerNum() != other.getGetFlowerNum()) {
               return false;
            } else if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
               return false;
            } else if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else if (!this.getFlowerBuyIdNumList().equals(other.getFlowerBuyIdNumList())) {
               return false;
            } else if (!this.getScoreIdNumList().equals(other.getScoreIdNumList())) {
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

            if (this.hasSendFlowerNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSendFlowerNum();
            }

            if (this.hasGetFlowerNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGetFlowerNum();
            }

            if (this.hasTotalScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalScore();
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            if (this.getFlowerBuyIdNumCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFlowerBuyIdNumList().hashCode();
            }

            if (this.getScoreIdNumCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getScoreIdNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_24702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24702 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_24702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_24702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_24702> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_24702> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_24702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_24702OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int sendFlowerNum_;
         private int getFlowerNum_;
         private int totalScore_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;
         private List<CommonMsg.MapDataII> flowerBuyIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> flowerBuyIdNumBuilder_;
         private List<CommonMsg.MapDataII> scoreIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> scoreIdNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24702.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.flowerBuyIdNum_ = Collections.emptyList();
            this.scoreIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.flowerBuyIdNum_ = Collections.emptyList();
            this.scoreIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_ActivityInfo_24702.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
               this.getFlowerBuyIdNumFieldBuilder();
               this.getScoreIdNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.sendFlowerNum_ = 0;
            this.bitField0_ &= -3;
            this.getFlowerNum_ = 0;
            this.bitField0_ &= -5;
            this.totalScore_ = 0;
            this.bitField0_ &= -9;
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.taskListBuilder_.clear();
            }

            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.flowerBuyIdNumBuilder_.clear();
            }

            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNum_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.scoreIdNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_ActivityInfo_24702_descriptor;
         }

         public S2C_ActivityInfo_24702 getDefaultInstanceForType() {
            return FlowerMsg.S2C_ActivityInfo_24702.getDefaultInstance();
         }

         public S2C_ActivityInfo_24702 build() {
            S2C_ActivityInfo_24702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_24702 buildPartial() {
            S2C_ActivityInfo_24702 result = new S2C_ActivityInfo_24702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sendFlowerNum_ = this.sendFlowerNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.getFlowerNum_ = this.getFlowerNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalScore_ = this.totalScore_;
               to_bitField0_ |= 8;
            }

            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -17;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
            }

            if (this.flowerBuyIdNumBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.flowerBuyIdNum_ = Collections.unmodifiableList(this.flowerBuyIdNum_);
                  this.bitField0_ &= -33;
               }

               result.flowerBuyIdNum_ = this.flowerBuyIdNum_;
            } else {
               result.flowerBuyIdNum_ = this.flowerBuyIdNumBuilder_.build();
            }

            if (this.scoreIdNumBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.scoreIdNum_ = Collections.unmodifiableList(this.scoreIdNum_);
                  this.bitField0_ &= -65;
               }

               result.scoreIdNum_ = this.scoreIdNum_;
            } else {
               result.scoreIdNum_ = this.scoreIdNumBuilder_.build();
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
            if (other instanceof S2C_ActivityInfo_24702) {
               return this.mergeFrom((S2C_ActivityInfo_24702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_24702 other) {
            if (other == FlowerMsg.S2C_ActivityInfo_24702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasSendFlowerNum()) {
                  this.setSendFlowerNum(other.getSendFlowerNum());
               }

               if (other.hasGetFlowerNum()) {
                  this.setGetFlowerNum(other.getGetFlowerNum());
               }

               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
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
                     this.taskListBuilder_ = FlowerMsg.S2C_ActivityInfo_24702.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               if (this.flowerBuyIdNumBuilder_ == null) {
                  if (!other.flowerBuyIdNum_.isEmpty()) {
                     if (this.flowerBuyIdNum_.isEmpty()) {
                        this.flowerBuyIdNum_ = other.flowerBuyIdNum_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureFlowerBuyIdNumIsMutable();
                        this.flowerBuyIdNum_.addAll(other.flowerBuyIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.flowerBuyIdNum_.isEmpty()) {
                  if (this.flowerBuyIdNumBuilder_.isEmpty()) {
                     this.flowerBuyIdNumBuilder_.dispose();
                     this.flowerBuyIdNumBuilder_ = null;
                     this.flowerBuyIdNum_ = other.flowerBuyIdNum_;
                     this.bitField0_ &= -33;
                     this.flowerBuyIdNumBuilder_ = FlowerMsg.S2C_ActivityInfo_24702.alwaysUseFieldBuilders ? this.getFlowerBuyIdNumFieldBuilder() : null;
                  } else {
                     this.flowerBuyIdNumBuilder_.addAllMessages(other.flowerBuyIdNum_);
                  }
               }

               if (this.scoreIdNumBuilder_ == null) {
                  if (!other.scoreIdNum_.isEmpty()) {
                     if (this.scoreIdNum_.isEmpty()) {
                        this.scoreIdNum_ = other.scoreIdNum_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureScoreIdNumIsMutable();
                        this.scoreIdNum_.addAll(other.scoreIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.scoreIdNum_.isEmpty()) {
                  if (this.scoreIdNumBuilder_.isEmpty()) {
                     this.scoreIdNumBuilder_.dispose();
                     this.scoreIdNumBuilder_ = null;
                     this.scoreIdNum_ = other.scoreIdNum_;
                     this.bitField0_ &= -65;
                     this.scoreIdNumBuilder_ = FlowerMsg.S2C_ActivityInfo_24702.alwaysUseFieldBuilders ? this.getScoreIdNumFieldBuilder() : null;
                  } else {
                     this.scoreIdNumBuilder_.addAllMessages(other.scoreIdNum_);
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
            } else if (!this.hasSendFlowerNum()) {
               return false;
            } else if (!this.hasGetFlowerNum()) {
               return false;
            } else if (!this.hasTotalScore()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getFlowerBuyIdNumCount(); ++i) {
                  if (!this.getFlowerBuyIdNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getScoreIdNumCount(); ++i) {
                  if (!this.getScoreIdNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_24702 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_24702)FlowerMsg.S2C_ActivityInfo_24702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_24702)e.getUnfinishedMessage();
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

         public boolean hasSendFlowerNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSendFlowerNum() {
            return this.sendFlowerNum_;
         }

         public Builder setSendFlowerNum(int value) {
            this.bitField0_ |= 2;
            this.sendFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendFlowerNum() {
            this.bitField0_ &= -3;
            this.sendFlowerNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGetFlowerNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGetFlowerNum() {
            return this.getFlowerNum_;
         }

         public Builder setGetFlowerNum(int value) {
            this.bitField0_ |= 4;
            this.getFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGetFlowerNum() {
            this.bitField0_ &= -5;
            this.getFlowerNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalScore() {
            return this.totalScore_;
         }

         public Builder setTotalScore(int value) {
            this.bitField0_ |= 8;
            this.totalScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalScore() {
            this.bitField0_ &= -9;
            this.totalScore_ = 0;
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

         private void ensureFlowerBuyIdNumIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.flowerBuyIdNum_ = new ArrayList(this.flowerBuyIdNum_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.MapDataII> getFlowerBuyIdNumList() {
            return this.flowerBuyIdNumBuilder_ == null ? Collections.unmodifiableList(this.flowerBuyIdNum_) : this.flowerBuyIdNumBuilder_.getMessageList();
         }

         public int getFlowerBuyIdNumCount() {
            return this.flowerBuyIdNumBuilder_ == null ? this.flowerBuyIdNum_.size() : this.flowerBuyIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getFlowerBuyIdNum(int index) {
            return this.flowerBuyIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.flowerBuyIdNum_.get(index) : (CommonMsg.MapDataII)this.flowerBuyIdNumBuilder_.getMessage(index);
         }

         public Builder setFlowerBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFlowerBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFlowerBuyIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.flowerBuyIdNum_);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFlowerBuyIdNum() {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeFlowerBuyIdNum(int index) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.remove(index);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getFlowerBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index) {
            return this.flowerBuyIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList() {
            return this.flowerBuyIdNumBuilder_ != null ? this.flowerBuyIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.flowerBuyIdNum_);
         }

         public CommonMsg.MapDataII.Builder addFlowerBuyIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addFlowerBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getFlowerBuyIdNumBuilderList() {
            return this.getFlowerBuyIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumFieldBuilder() {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNumBuilder_ = new RepeatedFieldBuilderV3(this.flowerBuyIdNum_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.flowerBuyIdNum_ = null;
            }

            return this.flowerBuyIdNumBuilder_;
         }

         private void ensureScoreIdNumIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.scoreIdNum_ = new ArrayList(this.scoreIdNum_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.MapDataII> getScoreIdNumList() {
            return this.scoreIdNumBuilder_ == null ? Collections.unmodifiableList(this.scoreIdNum_) : this.scoreIdNumBuilder_.getMessageList();
         }

         public int getScoreIdNumCount() {
            return this.scoreIdNumBuilder_ == null ? this.scoreIdNum_.size() : this.scoreIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getScoreIdNum(int index) {
            return this.scoreIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.scoreIdNum_.get(index) : (CommonMsg.MapDataII)this.scoreIdNumBuilder_.getMessage(index);
         }

         public Builder setScoreIdNum(int index, CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setScoreIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addScoreIdNum(CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addScoreIdNum(int index, CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addScoreIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addScoreIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllScoreIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.scoreIdNum_);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearScoreIdNum() {
            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNum_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeScoreIdNum(int index) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.remove(index);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getScoreIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index) {
            return this.scoreIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.scoreIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.scoreIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList() {
            return this.scoreIdNumBuilder_ != null ? this.scoreIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.scoreIdNum_);
         }

         public CommonMsg.MapDataII.Builder addScoreIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addScoreIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getScoreIdNumBuilderList() {
            return this.getScoreIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getScoreIdNumFieldBuilder() {
            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNumBuilder_ = new RepeatedFieldBuilderV3(this.scoreIdNum_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.scoreIdNum_ = null;
            }

            return this.scoreIdNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CommitTask_24703 extends GeneratedMessageV3 implements C2S_CommitTask_24703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_24703 DEFAULT_INSTANCE = new C2S_CommitTask_24703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_24703> PARSER = new AbstractParser<C2S_CommitTask_24703>() {
         public C2S_CommitTask_24703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_24703(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_24703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_24703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_24703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_24703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_24703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_24703)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_24703 other = (C2S_CommitTask_24703)obj;
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

      public static C2S_CommitTask_24703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_24703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_24703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_24703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_24703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_24703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_24703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_24703 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_24703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_24703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_24703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_24703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_24703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_24703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_24703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_24703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_24703> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_24703> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_24703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_24703OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_24703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_CommitTask_24703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_CommitTask_24703_descriptor;
         }

         public C2S_CommitTask_24703 getDefaultInstanceForType() {
            return FlowerMsg.C2S_CommitTask_24703.getDefaultInstance();
         }

         public C2S_CommitTask_24703 build() {
            C2S_CommitTask_24703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_24703 buildPartial() {
            C2S_CommitTask_24703 result = new C2S_CommitTask_24703(this);
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
            if (other instanceof C2S_CommitTask_24703) {
               return this.mergeFrom((C2S_CommitTask_24703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_24703 other) {
            if (other == FlowerMsg.C2S_CommitTask_24703.getDefaultInstance()) {
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
            C2S_CommitTask_24703 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_24703)FlowerMsg.C2S_CommitTask_24703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_24703)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_24704 extends GeneratedMessageV3 implements S2C_CommitTask_24704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_24704 DEFAULT_INSTANCE = new S2C_CommitTask_24704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_24704> PARSER = new AbstractParser<S2C_CommitTask_24704>() {
         public S2C_CommitTask_24704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_24704(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_24704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_24704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_24704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_24704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_24704.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_24704)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_24704 other = (S2C_CommitTask_24704)obj;
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

      public static S2C_CommitTask_24704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_24704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_24704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_24704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_24704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_24704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_24704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_24704 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_24704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_24704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_24704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_24704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_24704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_24704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_24704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_24704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_24704> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_24704> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_24704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_24704OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_24704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_CommitTask_24704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CommitTask_24704_descriptor;
         }

         public S2C_CommitTask_24704 getDefaultInstanceForType() {
            return FlowerMsg.S2C_CommitTask_24704.getDefaultInstance();
         }

         public S2C_CommitTask_24704 build() {
            S2C_CommitTask_24704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_24704 buildPartial() {
            S2C_CommitTask_24704 result = new S2C_CommitTask_24704(this);
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
            if (other instanceof S2C_CommitTask_24704) {
               return this.mergeFrom((S2C_CommitTask_24704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_24704 other) {
            if (other == FlowerMsg.S2C_CommitTask_24704.getDefaultInstance()) {
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
            S2C_CommitTask_24704 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_24704)FlowerMsg.S2C_CommitTask_24704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_24704)e.getUnfinishedMessage();
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

   public static final class S2C_TaskNotice_24705 extends GeneratedMessageV3 implements S2C_TaskNotice_24705OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotice_24705 DEFAULT_INSTANCE = new S2C_TaskNotice_24705();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotice_24705> PARSER = new AbstractParser<S2C_TaskNotice_24705>() {
         public S2C_TaskNotice_24705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotice_24705(input, extensionRegistry);
         }
      };

      private S2C_TaskNotice_24705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotice_24705() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotice_24705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotice_24705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_24705.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskNotice_24705)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotice_24705 other = (S2C_TaskNotice_24705)obj;
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

      public static S2C_TaskNotice_24705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_24705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_24705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_24705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_24705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_24705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_24705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_24705 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_24705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_24705 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_24705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_24705 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_24705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_24705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotice_24705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotice_24705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotice_24705> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotice_24705> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotice_24705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotice_24705OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_24705.class, Builder.class);
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
            if (FlowerMsg.S2C_TaskNotice_24705.alwaysUseFieldBuilders) {
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
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_TaskNotice_24705_descriptor;
         }

         public S2C_TaskNotice_24705 getDefaultInstanceForType() {
            return FlowerMsg.S2C_TaskNotice_24705.getDefaultInstance();
         }

         public S2C_TaskNotice_24705 build() {
            S2C_TaskNotice_24705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotice_24705 buildPartial() {
            S2C_TaskNotice_24705 result = new S2C_TaskNotice_24705(this);
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
            if (other instanceof S2C_TaskNotice_24705) {
               return this.mergeFrom((S2C_TaskNotice_24705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotice_24705 other) {
            if (other == FlowerMsg.S2C_TaskNotice_24705.getDefaultInstance()) {
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
                     this.taskListBuilder_ = FlowerMsg.S2C_TaskNotice_24705.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_TaskNotice_24705 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotice_24705)FlowerMsg.S2C_TaskNotice_24705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotice_24705)e.getUnfinishedMessage();
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

   public static final class C2S_FlowerBuy_24706 extends GeneratedMessageV3 implements C2S_FlowerBuy_24706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_FlowerBuy_24706 DEFAULT_INSTANCE = new C2S_FlowerBuy_24706();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FlowerBuy_24706> PARSER = new AbstractParser<C2S_FlowerBuy_24706>() {
         public C2S_FlowerBuy_24706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FlowerBuy_24706(input, extensionRegistry);
         }
      };

      private C2S_FlowerBuy_24706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FlowerBuy_24706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FlowerBuy_24706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FlowerBuy_24706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlowerBuy_24706.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FlowerBuy_24706)) {
            return super.equals(obj);
         } else {
            C2S_FlowerBuy_24706 other = (C2S_FlowerBuy_24706)obj;
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

      public static C2S_FlowerBuy_24706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data);
      }

      public static C2S_FlowerBuy_24706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlowerBuy_24706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data);
      }

      public static C2S_FlowerBuy_24706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlowerBuy_24706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data);
      }

      public static C2S_FlowerBuy_24706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlowerBuy_24706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlowerBuy_24706 parseFrom(InputStream input) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlowerBuy_24706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlowerBuy_24706 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FlowerBuy_24706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlowerBuy_24706 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlowerBuy_24706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlowerBuy_24706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FlowerBuy_24706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FlowerBuy_24706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FlowerBuy_24706> parser() {
         return PARSER;
      }

      public Parser<C2S_FlowerBuy_24706> getParserForType() {
         return PARSER;
      }

      public C2S_FlowerBuy_24706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FlowerBuy_24706OrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlowerBuy_24706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_FlowerBuy_24706.alwaysUseFieldBuilders) {
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
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FlowerBuy_24706_descriptor;
         }

         public C2S_FlowerBuy_24706 getDefaultInstanceForType() {
            return FlowerMsg.C2S_FlowerBuy_24706.getDefaultInstance();
         }

         public C2S_FlowerBuy_24706 build() {
            C2S_FlowerBuy_24706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FlowerBuy_24706 buildPartial() {
            C2S_FlowerBuy_24706 result = new C2S_FlowerBuy_24706(this);
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
            if (other instanceof C2S_FlowerBuy_24706) {
               return this.mergeFrom((C2S_FlowerBuy_24706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FlowerBuy_24706 other) {
            if (other == FlowerMsg.C2S_FlowerBuy_24706.getDefaultInstance()) {
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
            C2S_FlowerBuy_24706 parsedMessage = null;

            try {
               parsedMessage = (C2S_FlowerBuy_24706)FlowerMsg.C2S_FlowerBuy_24706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FlowerBuy_24706)e.getUnfinishedMessage();
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

   public static final class S2C_FlowerBuy_24707 extends GeneratedMessageV3 implements S2C_FlowerBuy_24707OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int FLOWERBUYIDNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> flowerBuyIdNum_;
      private byte memoizedIsInitialized;
      private static final S2C_FlowerBuy_24707 DEFAULT_INSTANCE = new S2C_FlowerBuy_24707();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FlowerBuy_24707> PARSER = new AbstractParser<S2C_FlowerBuy_24707>() {
         public S2C_FlowerBuy_24707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FlowerBuy_24707(input, extensionRegistry);
         }
      };

      private S2C_FlowerBuy_24707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FlowerBuy_24707() {
         this.memoizedIsInitialized = -1;
         this.flowerBuyIdNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FlowerBuy_24707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FlowerBuy_24707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.flowerBuyIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.flowerBuyIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.flowerBuyIdNum_ = Collections.unmodifiableList(this.flowerBuyIdNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlowerBuy_24707.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getFlowerBuyIdNumList() {
         return this.flowerBuyIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList() {
         return this.flowerBuyIdNum_;
      }

      public int getFlowerBuyIdNumCount() {
         return this.flowerBuyIdNum_.size();
      }

      public CommonMsg.MapDataII getFlowerBuyIdNum(int index) {
         return (CommonMsg.MapDataII)this.flowerBuyIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getFlowerBuyIdNumCount(); ++i) {
               if (!this.getFlowerBuyIdNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.flowerBuyIdNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.flowerBuyIdNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.flowerBuyIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.flowerBuyIdNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FlowerBuy_24707)) {
            return super.equals(obj);
         } else {
            S2C_FlowerBuy_24707 other = (S2C_FlowerBuy_24707)obj;
            if (!this.getFlowerBuyIdNumList().equals(other.getFlowerBuyIdNumList())) {
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
            if (this.getFlowerBuyIdNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFlowerBuyIdNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FlowerBuy_24707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data);
      }

      public static S2C_FlowerBuy_24707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlowerBuy_24707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data);
      }

      public static S2C_FlowerBuy_24707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlowerBuy_24707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data);
      }

      public static S2C_FlowerBuy_24707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlowerBuy_24707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlowerBuy_24707 parseFrom(InputStream input) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlowerBuy_24707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlowerBuy_24707 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FlowerBuy_24707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlowerBuy_24707 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlowerBuy_24707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlowerBuy_24707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FlowerBuy_24707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FlowerBuy_24707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FlowerBuy_24707> parser() {
         return PARSER;
      }

      public Parser<S2C_FlowerBuy_24707> getParserForType() {
         return PARSER;
      }

      public S2C_FlowerBuy_24707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FlowerBuy_24707OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> flowerBuyIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> flowerBuyIdNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlowerBuy_24707.class, Builder.class);
         }

         private Builder() {
            this.flowerBuyIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.flowerBuyIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_FlowerBuy_24707.alwaysUseFieldBuilders) {
               this.getFlowerBuyIdNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.flowerBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FlowerBuy_24707_descriptor;
         }

         public S2C_FlowerBuy_24707 getDefaultInstanceForType() {
            return FlowerMsg.S2C_FlowerBuy_24707.getDefaultInstance();
         }

         public S2C_FlowerBuy_24707 build() {
            S2C_FlowerBuy_24707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FlowerBuy_24707 buildPartial() {
            S2C_FlowerBuy_24707 result = new S2C_FlowerBuy_24707(this);
            int from_bitField0_ = this.bitField0_;
            if (this.flowerBuyIdNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.flowerBuyIdNum_ = Collections.unmodifiableList(this.flowerBuyIdNum_);
                  this.bitField0_ &= -2;
               }

               result.flowerBuyIdNum_ = this.flowerBuyIdNum_;
            } else {
               result.flowerBuyIdNum_ = this.flowerBuyIdNumBuilder_.build();
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
            if (other instanceof S2C_FlowerBuy_24707) {
               return this.mergeFrom((S2C_FlowerBuy_24707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FlowerBuy_24707 other) {
            if (other == FlowerMsg.S2C_FlowerBuy_24707.getDefaultInstance()) {
               return this;
            } else {
               if (this.flowerBuyIdNumBuilder_ == null) {
                  if (!other.flowerBuyIdNum_.isEmpty()) {
                     if (this.flowerBuyIdNum_.isEmpty()) {
                        this.flowerBuyIdNum_ = other.flowerBuyIdNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureFlowerBuyIdNumIsMutable();
                        this.flowerBuyIdNum_.addAll(other.flowerBuyIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.flowerBuyIdNum_.isEmpty()) {
                  if (this.flowerBuyIdNumBuilder_.isEmpty()) {
                     this.flowerBuyIdNumBuilder_.dispose();
                     this.flowerBuyIdNumBuilder_ = null;
                     this.flowerBuyIdNum_ = other.flowerBuyIdNum_;
                     this.bitField0_ &= -2;
                     this.flowerBuyIdNumBuilder_ = FlowerMsg.S2C_FlowerBuy_24707.alwaysUseFieldBuilders ? this.getFlowerBuyIdNumFieldBuilder() : null;
                  } else {
                     this.flowerBuyIdNumBuilder_.addAllMessages(other.flowerBuyIdNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getFlowerBuyIdNumCount(); ++i) {
               if (!this.getFlowerBuyIdNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FlowerBuy_24707 parsedMessage = null;

            try {
               parsedMessage = (S2C_FlowerBuy_24707)FlowerMsg.S2C_FlowerBuy_24707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FlowerBuy_24707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureFlowerBuyIdNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.flowerBuyIdNum_ = new ArrayList(this.flowerBuyIdNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getFlowerBuyIdNumList() {
            return this.flowerBuyIdNumBuilder_ == null ? Collections.unmodifiableList(this.flowerBuyIdNum_) : this.flowerBuyIdNumBuilder_.getMessageList();
         }

         public int getFlowerBuyIdNumCount() {
            return this.flowerBuyIdNumBuilder_ == null ? this.flowerBuyIdNum_.size() : this.flowerBuyIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getFlowerBuyIdNum(int index) {
            return this.flowerBuyIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.flowerBuyIdNum_.get(index) : (CommonMsg.MapDataII)this.flowerBuyIdNumBuilder_.getMessage(index);
         }

         public Builder setFlowerBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFlowerBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(int index, CommonMsg.MapDataII value) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFlowerBuyIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFlowerBuyIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.flowerBuyIdNum_);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFlowerBuyIdNum() {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeFlowerBuyIdNum(int index) {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.ensureFlowerBuyIdNumIsMutable();
               this.flowerBuyIdNum_.remove(index);
               this.onChanged();
            } else {
               this.flowerBuyIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getFlowerBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index) {
            return this.flowerBuyIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.flowerBuyIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList() {
            return this.flowerBuyIdNumBuilder_ != null ? this.flowerBuyIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.flowerBuyIdNum_);
         }

         public CommonMsg.MapDataII.Builder addFlowerBuyIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addFlowerBuyIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getFlowerBuyIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getFlowerBuyIdNumBuilderList() {
            return this.getFlowerBuyIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumFieldBuilder() {
            if (this.flowerBuyIdNumBuilder_ == null) {
               this.flowerBuyIdNumBuilder_ = new RepeatedFieldBuilderV3(this.flowerBuyIdNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.flowerBuyIdNum_ = null;
            }

            return this.flowerBuyIdNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecScoreReward_24708 extends GeneratedMessageV3 implements C2S_RecScoreReward_24708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RecScoreReward_24708 DEFAULT_INSTANCE = new C2S_RecScoreReward_24708();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecScoreReward_24708> PARSER = new AbstractParser<C2S_RecScoreReward_24708>() {
         public C2S_RecScoreReward_24708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecScoreReward_24708(input, extensionRegistry);
         }
      };

      private C2S_RecScoreReward_24708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecScoreReward_24708() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecScoreReward_24708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecScoreReward_24708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecScoreReward_24708.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecScoreReward_24708)) {
            return super.equals(obj);
         } else {
            C2S_RecScoreReward_24708 other = (C2S_RecScoreReward_24708)obj;
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

      public static C2S_RecScoreReward_24708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_24708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_24708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_24708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_24708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_24708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_24708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_24708 parseFrom(InputStream input) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_24708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecScoreReward_24708 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_24708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecScoreReward_24708 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_24708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_24708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecScoreReward_24708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecScoreReward_24708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecScoreReward_24708> parser() {
         return PARSER;
      }

      public Parser<C2S_RecScoreReward_24708> getParserForType() {
         return PARSER;
      }

      public C2S_RecScoreReward_24708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecScoreReward_24708OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecScoreReward_24708.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_RecScoreReward_24708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_RecScoreReward_24708_descriptor;
         }

         public C2S_RecScoreReward_24708 getDefaultInstanceForType() {
            return FlowerMsg.C2S_RecScoreReward_24708.getDefaultInstance();
         }

         public C2S_RecScoreReward_24708 build() {
            C2S_RecScoreReward_24708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecScoreReward_24708 buildPartial() {
            C2S_RecScoreReward_24708 result = new C2S_RecScoreReward_24708(this);
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
            if (other instanceof C2S_RecScoreReward_24708) {
               return this.mergeFrom((C2S_RecScoreReward_24708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecScoreReward_24708 other) {
            if (other == FlowerMsg.C2S_RecScoreReward_24708.getDefaultInstance()) {
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
            C2S_RecScoreReward_24708 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecScoreReward_24708)FlowerMsg.C2S_RecScoreReward_24708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecScoreReward_24708)e.getUnfinishedMessage();
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

   public static final class S2C_RecScoreReward_24709 extends GeneratedMessageV3 implements S2C_RecScoreReward_24709OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SCOREIDNUM_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> scoreIdNum_;
      private byte memoizedIsInitialized;
      private static final S2C_RecScoreReward_24709 DEFAULT_INSTANCE = new S2C_RecScoreReward_24709();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecScoreReward_24709> PARSER = new AbstractParser<S2C_RecScoreReward_24709>() {
         public S2C_RecScoreReward_24709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecScoreReward_24709(input, extensionRegistry);
         }
      };

      private S2C_RecScoreReward_24709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecScoreReward_24709() {
         this.memoizedIsInitialized = -1;
         this.scoreIdNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecScoreReward_24709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecScoreReward_24709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.scoreIdNum_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.scoreIdNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.scoreIdNum_ = Collections.unmodifiableList(this.scoreIdNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecScoreReward_24709.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getScoreIdNumList() {
         return this.scoreIdNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList() {
         return this.scoreIdNum_;
      }

      public int getScoreIdNumCount() {
         return this.scoreIdNum_.size();
      }

      public CommonMsg.MapDataII getScoreIdNum(int index) {
         return (CommonMsg.MapDataII)this.scoreIdNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.scoreIdNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getScoreIdNumCount(); ++i) {
               if (!this.getScoreIdNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.scoreIdNum_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.scoreIdNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.scoreIdNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.scoreIdNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecScoreReward_24709)) {
            return super.equals(obj);
         } else {
            S2C_RecScoreReward_24709 other = (S2C_RecScoreReward_24709)obj;
            if (!this.getScoreIdNumList().equals(other.getScoreIdNumList())) {
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
            if (this.getScoreIdNumCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getScoreIdNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecScoreReward_24709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_24709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_24709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_24709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_24709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_24709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_24709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_24709 parseFrom(InputStream input) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_24709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecScoreReward_24709 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_24709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecScoreReward_24709 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_24709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_24709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecScoreReward_24709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecScoreReward_24709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecScoreReward_24709> parser() {
         return PARSER;
      }

      public Parser<S2C_RecScoreReward_24709> getParserForType() {
         return PARSER;
      }

      public S2C_RecScoreReward_24709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecScoreReward_24709OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> scoreIdNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> scoreIdNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecScoreReward_24709.class, Builder.class);
         }

         private Builder() {
            this.scoreIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.scoreIdNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_RecScoreReward_24709.alwaysUseFieldBuilders) {
               this.getScoreIdNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.scoreIdNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_RecScoreReward_24709_descriptor;
         }

         public S2C_RecScoreReward_24709 getDefaultInstanceForType() {
            return FlowerMsg.S2C_RecScoreReward_24709.getDefaultInstance();
         }

         public S2C_RecScoreReward_24709 build() {
            S2C_RecScoreReward_24709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecScoreReward_24709 buildPartial() {
            S2C_RecScoreReward_24709 result = new S2C_RecScoreReward_24709(this);
            int from_bitField0_ = this.bitField0_;
            if (this.scoreIdNumBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.scoreIdNum_ = Collections.unmodifiableList(this.scoreIdNum_);
                  this.bitField0_ &= -2;
               }

               result.scoreIdNum_ = this.scoreIdNum_;
            } else {
               result.scoreIdNum_ = this.scoreIdNumBuilder_.build();
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
            if (other instanceof S2C_RecScoreReward_24709) {
               return this.mergeFrom((S2C_RecScoreReward_24709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecScoreReward_24709 other) {
            if (other == FlowerMsg.S2C_RecScoreReward_24709.getDefaultInstance()) {
               return this;
            } else {
               if (this.scoreIdNumBuilder_ == null) {
                  if (!other.scoreIdNum_.isEmpty()) {
                     if (this.scoreIdNum_.isEmpty()) {
                        this.scoreIdNum_ = other.scoreIdNum_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureScoreIdNumIsMutable();
                        this.scoreIdNum_.addAll(other.scoreIdNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.scoreIdNum_.isEmpty()) {
                  if (this.scoreIdNumBuilder_.isEmpty()) {
                     this.scoreIdNumBuilder_.dispose();
                     this.scoreIdNumBuilder_ = null;
                     this.scoreIdNum_ = other.scoreIdNum_;
                     this.bitField0_ &= -2;
                     this.scoreIdNumBuilder_ = FlowerMsg.S2C_RecScoreReward_24709.alwaysUseFieldBuilders ? this.getScoreIdNumFieldBuilder() : null;
                  } else {
                     this.scoreIdNumBuilder_.addAllMessages(other.scoreIdNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getScoreIdNumCount(); ++i) {
               if (!this.getScoreIdNum(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecScoreReward_24709 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecScoreReward_24709)FlowerMsg.S2C_RecScoreReward_24709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecScoreReward_24709)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureScoreIdNumIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.scoreIdNum_ = new ArrayList(this.scoreIdNum_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getScoreIdNumList() {
            return this.scoreIdNumBuilder_ == null ? Collections.unmodifiableList(this.scoreIdNum_) : this.scoreIdNumBuilder_.getMessageList();
         }

         public int getScoreIdNumCount() {
            return this.scoreIdNumBuilder_ == null ? this.scoreIdNum_.size() : this.scoreIdNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getScoreIdNum(int index) {
            return this.scoreIdNumBuilder_ == null ? (CommonMsg.MapDataII)this.scoreIdNum_.get(index) : (CommonMsg.MapDataII)this.scoreIdNumBuilder_.getMessage(index);
         }

         public Builder setScoreIdNum(int index, CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.set(index, value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setScoreIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addScoreIdNum(CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addScoreIdNum(int index, CommonMsg.MapDataII value) {
            if (this.scoreIdNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(index, value);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addScoreIdNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addScoreIdNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllScoreIdNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.scoreIdNum_);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearScoreIdNum() {
            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNum_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeScoreIdNum(int index) {
            if (this.scoreIdNumBuilder_ == null) {
               this.ensureScoreIdNumIsMutable();
               this.scoreIdNum_.remove(index);
               this.onChanged();
            } else {
               this.scoreIdNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getScoreIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index) {
            return this.scoreIdNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.scoreIdNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.scoreIdNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList() {
            return this.scoreIdNumBuilder_ != null ? this.scoreIdNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.scoreIdNum_);
         }

         public CommonMsg.MapDataII.Builder addScoreIdNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addScoreIdNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getScoreIdNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getScoreIdNumBuilderList() {
            return this.getScoreIdNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getScoreIdNumFieldBuilder() {
            if (this.scoreIdNumBuilder_ == null) {
               this.scoreIdNumBuilder_ = new RepeatedFieldBuilderV3(this.scoreIdNum_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.scoreIdNum_ = null;
            }

            return this.scoreIdNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GiveFlower_24710 extends GeneratedMessageV3 implements C2S_GiveFlower_24710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int FLOWERNUM_FIELD_NUMBER = 2;
      private int flowerNum_;
      private byte memoizedIsInitialized;
      private static final C2S_GiveFlower_24710 DEFAULT_INSTANCE = new C2S_GiveFlower_24710();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiveFlower_24710> PARSER = new AbstractParser<C2S_GiveFlower_24710>() {
         public C2S_GiveFlower_24710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiveFlower_24710(input, extensionRegistry);
         }
      };

      private C2S_GiveFlower_24710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiveFlower_24710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiveFlower_24710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiveFlower_24710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flowerNum_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiveFlower_24710.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasFlowerNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFlowerNum() {
         return this.flowerNum_;
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
         } else if (!this.hasFlowerNum()) {
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
            output.writeInt32(2, this.flowerNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.flowerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GiveFlower_24710)) {
            return super.equals(obj);
         } else {
            C2S_GiveFlower_24710 other = (C2S_GiveFlower_24710)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasFlowerNum() != other.hasFlowerNum()) {
               return false;
            } else if (this.hasFlowerNum() && this.getFlowerNum() != other.getFlowerNum()) {
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

            if (this.hasFlowerNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFlowerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GiveFlower_24710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data);
      }

      public static C2S_GiveFlower_24710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveFlower_24710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data);
      }

      public static C2S_GiveFlower_24710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveFlower_24710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data);
      }

      public static C2S_GiveFlower_24710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiveFlower_24710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiveFlower_24710 parseFrom(InputStream input) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiveFlower_24710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiveFlower_24710 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiveFlower_24710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiveFlower_24710 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiveFlower_24710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiveFlower_24710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiveFlower_24710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiveFlower_24710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiveFlower_24710> parser() {
         return PARSER;
      }

      public Parser<C2S_GiveFlower_24710> getParserForType() {
         return PARSER;
      }

      public C2S_GiveFlower_24710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiveFlower_24710OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int flowerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiveFlower_24710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_GiveFlower_24710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.flowerNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GiveFlower_24710_descriptor;
         }

         public C2S_GiveFlower_24710 getDefaultInstanceForType() {
            return FlowerMsg.C2S_GiveFlower_24710.getDefaultInstance();
         }

         public C2S_GiveFlower_24710 build() {
            C2S_GiveFlower_24710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiveFlower_24710 buildPartial() {
            C2S_GiveFlower_24710 result = new C2S_GiveFlower_24710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.flowerNum_ = this.flowerNum_;
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
            if (other instanceof C2S_GiveFlower_24710) {
               return this.mergeFrom((C2S_GiveFlower_24710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiveFlower_24710 other) {
            if (other == FlowerMsg.C2S_GiveFlower_24710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasFlowerNum()) {
                  this.setFlowerNum(other.getFlowerNum());
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
               return this.hasFlowerNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GiveFlower_24710 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiveFlower_24710)FlowerMsg.C2S_GiveFlower_24710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiveFlower_24710)e.getUnfinishedMessage();
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

         public boolean hasFlowerNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFlowerNum() {
            return this.flowerNum_;
         }

         public Builder setFlowerNum(int value) {
            this.bitField0_ |= 2;
            this.flowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlowerNum() {
            this.bitField0_ &= -3;
            this.flowerNum_ = 0;
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

   public static final class S2C_GiveFlower_24711 extends GeneratedMessageV3 implements S2C_GiveFlower_24711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SENDFLOWERNUM_FIELD_NUMBER = 1;
      private int sendFlowerNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GiveFlower_24711 DEFAULT_INSTANCE = new S2C_GiveFlower_24711();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiveFlower_24711> PARSER = new AbstractParser<S2C_GiveFlower_24711>() {
         public S2C_GiveFlower_24711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiveFlower_24711(input, extensionRegistry);
         }
      };

      private S2C_GiveFlower_24711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiveFlower_24711() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiveFlower_24711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiveFlower_24711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sendFlowerNum_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiveFlower_24711.class, Builder.class);
      }

      public boolean hasSendFlowerNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSendFlowerNum() {
         return this.sendFlowerNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSendFlowerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sendFlowerNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sendFlowerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiveFlower_24711)) {
            return super.equals(obj);
         } else {
            S2C_GiveFlower_24711 other = (S2C_GiveFlower_24711)obj;
            if (this.hasSendFlowerNum() != other.hasSendFlowerNum()) {
               return false;
            } else if (this.hasSendFlowerNum() && this.getSendFlowerNum() != other.getSendFlowerNum()) {
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
            if (this.hasSendFlowerNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSendFlowerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiveFlower_24711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data);
      }

      public static S2C_GiveFlower_24711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveFlower_24711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data);
      }

      public static S2C_GiveFlower_24711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveFlower_24711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data);
      }

      public static S2C_GiveFlower_24711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiveFlower_24711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiveFlower_24711 parseFrom(InputStream input) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiveFlower_24711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiveFlower_24711 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiveFlower_24711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiveFlower_24711 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiveFlower_24711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiveFlower_24711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiveFlower_24711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiveFlower_24711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiveFlower_24711> parser() {
         return PARSER;
      }

      public Parser<S2C_GiveFlower_24711> getParserForType() {
         return PARSER;
      }

      public S2C_GiveFlower_24711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiveFlower_24711OrBuilder {
         private int bitField0_;
         private int sendFlowerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiveFlower_24711.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_GiveFlower_24711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sendFlowerNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GiveFlower_24711_descriptor;
         }

         public S2C_GiveFlower_24711 getDefaultInstanceForType() {
            return FlowerMsg.S2C_GiveFlower_24711.getDefaultInstance();
         }

         public S2C_GiveFlower_24711 build() {
            S2C_GiveFlower_24711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiveFlower_24711 buildPartial() {
            S2C_GiveFlower_24711 result = new S2C_GiveFlower_24711(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sendFlowerNum_ = this.sendFlowerNum_;
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
            if (other instanceof S2C_GiveFlower_24711) {
               return this.mergeFrom((S2C_GiveFlower_24711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiveFlower_24711 other) {
            if (other == FlowerMsg.S2C_GiveFlower_24711.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSendFlowerNum()) {
                  this.setSendFlowerNum(other.getSendFlowerNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSendFlowerNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiveFlower_24711 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiveFlower_24711)FlowerMsg.S2C_GiveFlower_24711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiveFlower_24711)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSendFlowerNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSendFlowerNum() {
            return this.sendFlowerNum_;
         }

         public Builder setSendFlowerNum(int value) {
            this.bitField0_ |= 1;
            this.sendFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendFlowerNum() {
            this.bitField0_ &= -2;
            this.sendFlowerNum_ = 0;
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

   public static final class C2S_GetOtherPlayerFlowerNum_24712 extends GeneratedMessageV3 implements C2S_GetOtherPlayerFlowerNum_24712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetOtherPlayerFlowerNum_24712 DEFAULT_INSTANCE = new C2S_GetOtherPlayerFlowerNum_24712();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetOtherPlayerFlowerNum_24712> PARSER = new AbstractParser<C2S_GetOtherPlayerFlowerNum_24712>() {
         public C2S_GetOtherPlayerFlowerNum_24712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetOtherPlayerFlowerNum_24712(input, extensionRegistry);
         }
      };

      private C2S_GetOtherPlayerFlowerNum_24712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetOtherPlayerFlowerNum_24712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetOtherPlayerFlowerNum_24712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetOtherPlayerFlowerNum_24712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetOtherPlayerFlowerNum_24712.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasPlayerId()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetOtherPlayerFlowerNum_24712)) {
            return super.equals(obj);
         } else {
            C2S_GetOtherPlayerFlowerNum_24712 other = (C2S_GetOtherPlayerFlowerNum_24712)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetOtherPlayerFlowerNum_24712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(InputStream input) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetOtherPlayerFlowerNum_24712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetOtherPlayerFlowerNum_24712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetOtherPlayerFlowerNum_24712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetOtherPlayerFlowerNum_24712> parser() {
         return PARSER;
      }

      public Parser<C2S_GetOtherPlayerFlowerNum_24712> getParserForType() {
         return PARSER;
      }

      public C2S_GetOtherPlayerFlowerNum_24712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetOtherPlayerFlowerNum_24712OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetOtherPlayerFlowerNum_24712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_GetOtherPlayerFlowerNum_24712.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetOtherPlayerFlowerNum_24712_descriptor;
         }

         public C2S_GetOtherPlayerFlowerNum_24712 getDefaultInstanceForType() {
            return FlowerMsg.C2S_GetOtherPlayerFlowerNum_24712.getDefaultInstance();
         }

         public C2S_GetOtherPlayerFlowerNum_24712 build() {
            C2S_GetOtherPlayerFlowerNum_24712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetOtherPlayerFlowerNum_24712 buildPartial() {
            C2S_GetOtherPlayerFlowerNum_24712 result = new C2S_GetOtherPlayerFlowerNum_24712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_GetOtherPlayerFlowerNum_24712) {
               return this.mergeFrom((C2S_GetOtherPlayerFlowerNum_24712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetOtherPlayerFlowerNum_24712 other) {
            if (other == FlowerMsg.C2S_GetOtherPlayerFlowerNum_24712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetOtherPlayerFlowerNum_24712 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetOtherPlayerFlowerNum_24712)FlowerMsg.C2S_GetOtherPlayerFlowerNum_24712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetOtherPlayerFlowerNum_24712)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_GetOtherPlayerFlowerNum_24713 extends GeneratedMessageV3 implements S2C_GetOtherPlayerFlowerNum_24713OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GETFLOWERNUM_FIELD_NUMBER = 1;
      private int getFlowerNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GetOtherPlayerFlowerNum_24713 DEFAULT_INSTANCE = new S2C_GetOtherPlayerFlowerNum_24713();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetOtherPlayerFlowerNum_24713> PARSER = new AbstractParser<S2C_GetOtherPlayerFlowerNum_24713>() {
         public S2C_GetOtherPlayerFlowerNum_24713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetOtherPlayerFlowerNum_24713(input, extensionRegistry);
         }
      };

      private S2C_GetOtherPlayerFlowerNum_24713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetOtherPlayerFlowerNum_24713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetOtherPlayerFlowerNum_24713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetOtherPlayerFlowerNum_24713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.getFlowerNum_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetOtherPlayerFlowerNum_24713.class, Builder.class);
      }

      public boolean hasGetFlowerNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGetFlowerNum() {
         return this.getFlowerNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGetFlowerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.getFlowerNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.getFlowerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetOtherPlayerFlowerNum_24713)) {
            return super.equals(obj);
         } else {
            S2C_GetOtherPlayerFlowerNum_24713 other = (S2C_GetOtherPlayerFlowerNum_24713)obj;
            if (this.hasGetFlowerNum() != other.hasGetFlowerNum()) {
               return false;
            } else if (this.hasGetFlowerNum() && this.getGetFlowerNum() != other.getGetFlowerNum()) {
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
            if (this.hasGetFlowerNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetFlowerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetOtherPlayerFlowerNum_24713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(InputStream input) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetOtherPlayerFlowerNum_24713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetOtherPlayerFlowerNum_24713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetOtherPlayerFlowerNum_24713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetOtherPlayerFlowerNum_24713> parser() {
         return PARSER;
      }

      public Parser<S2C_GetOtherPlayerFlowerNum_24713> getParserForType() {
         return PARSER;
      }

      public S2C_GetOtherPlayerFlowerNum_24713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetOtherPlayerFlowerNum_24713OrBuilder {
         private int bitField0_;
         private int getFlowerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetOtherPlayerFlowerNum_24713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.getFlowerNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetOtherPlayerFlowerNum_24713_descriptor;
         }

         public S2C_GetOtherPlayerFlowerNum_24713 getDefaultInstanceForType() {
            return FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.getDefaultInstance();
         }

         public S2C_GetOtherPlayerFlowerNum_24713 build() {
            S2C_GetOtherPlayerFlowerNum_24713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetOtherPlayerFlowerNum_24713 buildPartial() {
            S2C_GetOtherPlayerFlowerNum_24713 result = new S2C_GetOtherPlayerFlowerNum_24713(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.getFlowerNum_ = this.getFlowerNum_;
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
            if (other instanceof S2C_GetOtherPlayerFlowerNum_24713) {
               return this.mergeFrom((S2C_GetOtherPlayerFlowerNum_24713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetOtherPlayerFlowerNum_24713 other) {
            if (other == FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGetFlowerNum()) {
                  this.setGetFlowerNum(other.getGetFlowerNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGetFlowerNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetOtherPlayerFlowerNum_24713 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetOtherPlayerFlowerNum_24713)FlowerMsg.S2C_GetOtherPlayerFlowerNum_24713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetOtherPlayerFlowerNum_24713)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGetFlowerNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGetFlowerNum() {
            return this.getFlowerNum_;
         }

         public Builder setGetFlowerNum(int value) {
            this.bitField0_ |= 1;
            this.getFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGetFlowerNum() {
            this.bitField0_ &= -2;
            this.getFlowerNum_ = 0;
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

   public static final class S2C_CrossActOpenDay_24714 extends GeneratedMessageV3 implements S2C_CrossActOpenDay_24714OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final S2C_CrossActOpenDay_24714 DEFAULT_INSTANCE = new S2C_CrossActOpenDay_24714();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CrossActOpenDay_24714> PARSER = new AbstractParser<S2C_CrossActOpenDay_24714>() {
         public S2C_CrossActOpenDay_24714 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CrossActOpenDay_24714(input, extensionRegistry);
         }
      };

      private S2C_CrossActOpenDay_24714(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CrossActOpenDay_24714() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CrossActOpenDay_24714();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CrossActOpenDay_24714(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossActOpenDay_24714.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CrossActOpenDay_24714)) {
            return super.equals(obj);
         } else {
            S2C_CrossActOpenDay_24714 other = (S2C_CrossActOpenDay_24714)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossActOpenDay_24714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(InputStream input) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_24714 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_24714 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossActOpenDay_24714 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossActOpenDay_24714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CrossActOpenDay_24714 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CrossActOpenDay_24714 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CrossActOpenDay_24714> parser() {
         return PARSER;
      }

      public Parser<S2C_CrossActOpenDay_24714> getParserForType() {
         return PARSER;
      }

      public S2C_CrossActOpenDay_24714 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CrossActOpenDay_24714OrBuilder {
         private int bitField0_;
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossActOpenDay_24714.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_CrossActOpenDay_24714.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_CrossActOpenDay_24714_descriptor;
         }

         public S2C_CrossActOpenDay_24714 getDefaultInstanceForType() {
            return FlowerMsg.S2C_CrossActOpenDay_24714.getDefaultInstance();
         }

         public S2C_CrossActOpenDay_24714 build() {
            S2C_CrossActOpenDay_24714 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CrossActOpenDay_24714 buildPartial() {
            S2C_CrossActOpenDay_24714 result = new S2C_CrossActOpenDay_24714(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof S2C_CrossActOpenDay_24714) {
               return this.mergeFrom((S2C_CrossActOpenDay_24714)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CrossActOpenDay_24714 other) {
            if (other == FlowerMsg.S2C_CrossActOpenDay_24714.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
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
            S2C_CrossActOpenDay_24714 parsedMessage = null;

            try {
               parsedMessage = (S2C_CrossActOpenDay_24714)FlowerMsg.S2C_CrossActOpenDay_24714.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CrossActOpenDay_24714)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GetFlowerRankDetail_24715 extends GeneratedMessageV3 implements C2S_GetFlowerRankDetail_24715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETPLAYERID_FIELD_NUMBER = 1;
      private int targetPlayerId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetFlowerRankDetail_24715 DEFAULT_INSTANCE = new C2S_GetFlowerRankDetail_24715();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetFlowerRankDetail_24715> PARSER = new AbstractParser<C2S_GetFlowerRankDetail_24715>() {
         public C2S_GetFlowerRankDetail_24715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetFlowerRankDetail_24715(input, extensionRegistry);
         }
      };

      private C2S_GetFlowerRankDetail_24715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetFlowerRankDetail_24715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetFlowerRankDetail_24715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetFlowerRankDetail_24715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetPlayerId_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetFlowerRankDetail_24715.class, Builder.class);
      }

      public boolean hasTargetPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetPlayerId() {
         return this.targetPlayerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.targetPlayerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.targetPlayerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetFlowerRankDetail_24715)) {
            return super.equals(obj);
         } else {
            C2S_GetFlowerRankDetail_24715 other = (C2S_GetFlowerRankDetail_24715)obj;
            if (this.hasTargetPlayerId() != other.hasTargetPlayerId()) {
               return false;
            } else if (this.hasTargetPlayerId() && this.getTargetPlayerId() != other.getTargetPlayerId()) {
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
            if (this.hasTargetPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTargetPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetFlowerRankDetail_24715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(InputStream input) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetFlowerRankDetail_24715 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetFlowerRankDetail_24715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetFlowerRankDetail_24715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetFlowerRankDetail_24715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetFlowerRankDetail_24715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetFlowerRankDetail_24715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetFlowerRankDetail_24715> parser() {
         return PARSER;
      }

      public Parser<C2S_GetFlowerRankDetail_24715> getParserForType() {
         return PARSER;
      }

      public C2S_GetFlowerRankDetail_24715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetFlowerRankDetail_24715OrBuilder {
         private int bitField0_;
         private int targetPlayerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetFlowerRankDetail_24715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_GetFlowerRankDetail_24715.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetPlayerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_GetFlowerRankDetail_24715_descriptor;
         }

         public C2S_GetFlowerRankDetail_24715 getDefaultInstanceForType() {
            return FlowerMsg.C2S_GetFlowerRankDetail_24715.getDefaultInstance();
         }

         public C2S_GetFlowerRankDetail_24715 build() {
            C2S_GetFlowerRankDetail_24715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetFlowerRankDetail_24715 buildPartial() {
            C2S_GetFlowerRankDetail_24715 result = new C2S_GetFlowerRankDetail_24715(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.targetPlayerId_ = this.targetPlayerId_;
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
            if (other instanceof C2S_GetFlowerRankDetail_24715) {
               return this.mergeFrom((C2S_GetFlowerRankDetail_24715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetFlowerRankDetail_24715 other) {
            if (other == FlowerMsg.C2S_GetFlowerRankDetail_24715.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTargetPlayerId()) {
                  this.setTargetPlayerId(other.getTargetPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetFlowerRankDetail_24715 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetFlowerRankDetail_24715)FlowerMsg.C2S_GetFlowerRankDetail_24715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetFlowerRankDetail_24715)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTargetPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTargetPlayerId() {
            return this.targetPlayerId_;
         }

         public Builder setTargetPlayerId(int value) {
            this.bitField0_ |= 1;
            this.targetPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetPlayerId() {
            this.bitField0_ &= -2;
            this.targetPlayerId_ = 0;
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

   public static final class S2C_GetFlowerRankDetail_24716 extends GeneratedMessageV3 implements S2C_GetFlowerRankDetail_24716OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GETFLOWERRANKDETAILDATA_FIELD_NUMBER = 1;
      private List<GetFlowerRankDetailData> getFlowerRankDetailData_;
      private byte memoizedIsInitialized;
      private static final S2C_GetFlowerRankDetail_24716 DEFAULT_INSTANCE = new S2C_GetFlowerRankDetail_24716();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetFlowerRankDetail_24716> PARSER = new AbstractParser<S2C_GetFlowerRankDetail_24716>() {
         public S2C_GetFlowerRankDetail_24716 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetFlowerRankDetail_24716(input, extensionRegistry);
         }
      };

      private S2C_GetFlowerRankDetail_24716(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetFlowerRankDetail_24716() {
         this.memoizedIsInitialized = -1;
         this.getFlowerRankDetailData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetFlowerRankDetail_24716();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetFlowerRankDetail_24716(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.getFlowerRankDetailData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.getFlowerRankDetailData_.add(input.readMessage(FlowerMsg.GetFlowerRankDetailData.PARSER, extensionRegistry));
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
                  this.getFlowerRankDetailData_ = Collections.unmodifiableList(this.getFlowerRankDetailData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetFlowerRankDetail_24716.class, Builder.class);
      }

      public List<GetFlowerRankDetailData> getGetFlowerRankDetailDataList() {
         return this.getFlowerRankDetailData_;
      }

      public List<? extends GetFlowerRankDetailDataOrBuilder> getGetFlowerRankDetailDataOrBuilderList() {
         return this.getFlowerRankDetailData_;
      }

      public int getGetFlowerRankDetailDataCount() {
         return this.getFlowerRankDetailData_.size();
      }

      public GetFlowerRankDetailData getGetFlowerRankDetailData(int index) {
         return (GetFlowerRankDetailData)this.getFlowerRankDetailData_.get(index);
      }

      public GetFlowerRankDetailDataOrBuilder getGetFlowerRankDetailDataOrBuilder(int index) {
         return (GetFlowerRankDetailDataOrBuilder)this.getFlowerRankDetailData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGetFlowerRankDetailDataCount(); ++i) {
               if (!this.getGetFlowerRankDetailData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.getFlowerRankDetailData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.getFlowerRankDetailData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.getFlowerRankDetailData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.getFlowerRankDetailData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetFlowerRankDetail_24716)) {
            return super.equals(obj);
         } else {
            S2C_GetFlowerRankDetail_24716 other = (S2C_GetFlowerRankDetail_24716)obj;
            if (!this.getGetFlowerRankDetailDataList().equals(other.getGetFlowerRankDetailDataList())) {
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
            if (this.getGetFlowerRankDetailDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetFlowerRankDetailDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetFlowerRankDetail_24716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(InputStream input) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetFlowerRankDetail_24716 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetFlowerRankDetail_24716 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetFlowerRankDetail_24716 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetFlowerRankDetail_24716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetFlowerRankDetail_24716 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetFlowerRankDetail_24716 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetFlowerRankDetail_24716> parser() {
         return PARSER;
      }

      public Parser<S2C_GetFlowerRankDetail_24716> getParserForType() {
         return PARSER;
      }

      public S2C_GetFlowerRankDetail_24716 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetFlowerRankDetail_24716OrBuilder {
         private int bitField0_;
         private List<GetFlowerRankDetailData> getFlowerRankDetailData_;
         private RepeatedFieldBuilderV3<GetFlowerRankDetailData, GetFlowerRankDetailData.Builder, GetFlowerRankDetailDataOrBuilder> getFlowerRankDetailDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetFlowerRankDetail_24716.class, Builder.class);
         }

         private Builder() {
            this.getFlowerRankDetailData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.getFlowerRankDetailData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_GetFlowerRankDetail_24716.alwaysUseFieldBuilders) {
               this.getGetFlowerRankDetailDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.getFlowerRankDetailData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.getFlowerRankDetailDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_GetFlowerRankDetail_24716_descriptor;
         }

         public S2C_GetFlowerRankDetail_24716 getDefaultInstanceForType() {
            return FlowerMsg.S2C_GetFlowerRankDetail_24716.getDefaultInstance();
         }

         public S2C_GetFlowerRankDetail_24716 build() {
            S2C_GetFlowerRankDetail_24716 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetFlowerRankDetail_24716 buildPartial() {
            S2C_GetFlowerRankDetail_24716 result = new S2C_GetFlowerRankDetail_24716(this);
            int from_bitField0_ = this.bitField0_;
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.getFlowerRankDetailData_ = Collections.unmodifiableList(this.getFlowerRankDetailData_);
                  this.bitField0_ &= -2;
               }

               result.getFlowerRankDetailData_ = this.getFlowerRankDetailData_;
            } else {
               result.getFlowerRankDetailData_ = this.getFlowerRankDetailDataBuilder_.build();
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
            if (other instanceof S2C_GetFlowerRankDetail_24716) {
               return this.mergeFrom((S2C_GetFlowerRankDetail_24716)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetFlowerRankDetail_24716 other) {
            if (other == FlowerMsg.S2C_GetFlowerRankDetail_24716.getDefaultInstance()) {
               return this;
            } else {
               if (this.getFlowerRankDetailDataBuilder_ == null) {
                  if (!other.getFlowerRankDetailData_.isEmpty()) {
                     if (this.getFlowerRankDetailData_.isEmpty()) {
                        this.getFlowerRankDetailData_ = other.getFlowerRankDetailData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGetFlowerRankDetailDataIsMutable();
                        this.getFlowerRankDetailData_.addAll(other.getFlowerRankDetailData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.getFlowerRankDetailData_.isEmpty()) {
                  if (this.getFlowerRankDetailDataBuilder_.isEmpty()) {
                     this.getFlowerRankDetailDataBuilder_.dispose();
                     this.getFlowerRankDetailDataBuilder_ = null;
                     this.getFlowerRankDetailData_ = other.getFlowerRankDetailData_;
                     this.bitField0_ &= -2;
                     this.getFlowerRankDetailDataBuilder_ = FlowerMsg.S2C_GetFlowerRankDetail_24716.alwaysUseFieldBuilders ? this.getGetFlowerRankDetailDataFieldBuilder() : null;
                  } else {
                     this.getFlowerRankDetailDataBuilder_.addAllMessages(other.getFlowerRankDetailData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGetFlowerRankDetailDataCount(); ++i) {
               if (!this.getGetFlowerRankDetailData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetFlowerRankDetail_24716 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetFlowerRankDetail_24716)FlowerMsg.S2C_GetFlowerRankDetail_24716.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetFlowerRankDetail_24716)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGetFlowerRankDetailDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.getFlowerRankDetailData_ = new ArrayList(this.getFlowerRankDetailData_);
               this.bitField0_ |= 1;
            }

         }

         public List<GetFlowerRankDetailData> getGetFlowerRankDetailDataList() {
            return this.getFlowerRankDetailDataBuilder_ == null ? Collections.unmodifiableList(this.getFlowerRankDetailData_) : this.getFlowerRankDetailDataBuilder_.getMessageList();
         }

         public int getGetFlowerRankDetailDataCount() {
            return this.getFlowerRankDetailDataBuilder_ == null ? this.getFlowerRankDetailData_.size() : this.getFlowerRankDetailDataBuilder_.getCount();
         }

         public GetFlowerRankDetailData getGetFlowerRankDetailData(int index) {
            return this.getFlowerRankDetailDataBuilder_ == null ? (GetFlowerRankDetailData)this.getFlowerRankDetailData_.get(index) : (GetFlowerRankDetailData)this.getFlowerRankDetailDataBuilder_.getMessage(index);
         }

         public Builder setGetFlowerRankDetailData(int index, GetFlowerRankDetailData value) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.set(index, value);
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGetFlowerRankDetailData(int index, GetFlowerRankDetailData.Builder builderForValue) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGetFlowerRankDetailData(GetFlowerRankDetailData value) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.add(value);
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGetFlowerRankDetailData(int index, GetFlowerRankDetailData value) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.add(index, value);
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGetFlowerRankDetailData(GetFlowerRankDetailData.Builder builderForValue) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGetFlowerRankDetailData(int index, GetFlowerRankDetailData.Builder builderForValue) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGetFlowerRankDetailData(Iterable<? extends GetFlowerRankDetailData> values) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.ensureGetFlowerRankDetailDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.getFlowerRankDetailData_);
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGetFlowerRankDetailData() {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.getFlowerRankDetailData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeGetFlowerRankDetailData(int index) {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.ensureGetFlowerRankDetailDataIsMutable();
               this.getFlowerRankDetailData_.remove(index);
               this.onChanged();
            } else {
               this.getFlowerRankDetailDataBuilder_.remove(index);
            }

            return this;
         }

         public GetFlowerRankDetailData.Builder getGetFlowerRankDetailDataBuilder(int index) {
            return (GetFlowerRankDetailData.Builder)this.getGetFlowerRankDetailDataFieldBuilder().getBuilder(index);
         }

         public GetFlowerRankDetailDataOrBuilder getGetFlowerRankDetailDataOrBuilder(int index) {
            return this.getFlowerRankDetailDataBuilder_ == null ? (GetFlowerRankDetailDataOrBuilder)this.getFlowerRankDetailData_.get(index) : (GetFlowerRankDetailDataOrBuilder)this.getFlowerRankDetailDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GetFlowerRankDetailDataOrBuilder> getGetFlowerRankDetailDataOrBuilderList() {
            return this.getFlowerRankDetailDataBuilder_ != null ? this.getFlowerRankDetailDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.getFlowerRankDetailData_);
         }

         public GetFlowerRankDetailData.Builder addGetFlowerRankDetailDataBuilder() {
            return (GetFlowerRankDetailData.Builder)this.getGetFlowerRankDetailDataFieldBuilder().addBuilder(FlowerMsg.GetFlowerRankDetailData.getDefaultInstance());
         }

         public GetFlowerRankDetailData.Builder addGetFlowerRankDetailDataBuilder(int index) {
            return (GetFlowerRankDetailData.Builder)this.getGetFlowerRankDetailDataFieldBuilder().addBuilder(index, FlowerMsg.GetFlowerRankDetailData.getDefaultInstance());
         }

         public List<GetFlowerRankDetailData.Builder> getGetFlowerRankDetailDataBuilderList() {
            return this.getGetFlowerRankDetailDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GetFlowerRankDetailData, GetFlowerRankDetailData.Builder, GetFlowerRankDetailDataOrBuilder> getGetFlowerRankDetailDataFieldBuilder() {
            if (this.getFlowerRankDetailDataBuilder_ == null) {
               this.getFlowerRankDetailDataBuilder_ = new RepeatedFieldBuilderV3(this.getFlowerRankDetailData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.getFlowerRankDetailData_ = null;
            }

            return this.getFlowerRankDetailDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class GetFlowerRankDetailData extends GeneratedMessageV3 implements GetFlowerRankDetailDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SENDPLAYERID_FIELD_NUMBER = 1;
      private int sendPlayerId_;
      public static final int SENDPLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object sendPlayerName_;
      public static final int SENDFLOWERNUM_FIELD_NUMBER = 3;
      private int sendFlowerNum_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      private byte memoizedIsInitialized;
      private static final GetFlowerRankDetailData DEFAULT_INSTANCE = new GetFlowerRankDetailData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GetFlowerRankDetailData> PARSER = new AbstractParser<GetFlowerRankDetailData>() {
         public GetFlowerRankDetailData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GetFlowerRankDetailData(input, extensionRegistry);
         }
      };

      private GetFlowerRankDetailData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GetFlowerRankDetailData() {
         this.memoizedIsInitialized = -1;
         this.sendPlayerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GetFlowerRankDetailData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GetFlowerRankDetailData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sendPlayerId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.sendPlayerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.sendFlowerNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_fieldAccessorTable.ensureFieldAccessorsInitialized(GetFlowerRankDetailData.class, Builder.class);
      }

      public boolean hasSendPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSendPlayerId() {
         return this.sendPlayerId_;
      }

      public boolean hasSendPlayerName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getSendPlayerName() {
         Object ref = this.sendPlayerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.sendPlayerName_ = s;
            }

            return s;
         }
      }

      public ByteString getSendPlayerNameBytes() {
         Object ref = this.sendPlayerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.sendPlayerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasSendFlowerNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSendFlowerNum() {
         return this.sendFlowerNum_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSendPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSendPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSendFlowerNum()) {
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
            output.writeInt32(1, this.sendPlayerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.sendPlayerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.sendFlowerNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headFrame_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sendPlayerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.sendPlayerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.sendFlowerNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GetFlowerRankDetailData)) {
            return super.equals(obj);
         } else {
            GetFlowerRankDetailData other = (GetFlowerRankDetailData)obj;
            if (this.hasSendPlayerId() != other.hasSendPlayerId()) {
               return false;
            } else if (this.hasSendPlayerId() && this.getSendPlayerId() != other.getSendPlayerId()) {
               return false;
            } else if (this.hasSendPlayerName() != other.hasSendPlayerName()) {
               return false;
            } else if (this.hasSendPlayerName() && !this.getSendPlayerName().equals(other.getSendPlayerName())) {
               return false;
            } else if (this.hasSendFlowerNum() != other.hasSendFlowerNum()) {
               return false;
            } else if (this.hasSendFlowerNum() && this.getSendFlowerNum() != other.getSendFlowerNum()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
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
            if (this.hasSendPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSendPlayerId();
            }

            if (this.hasSendPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSendPlayerName().hashCode();
            }

            if (this.hasSendFlowerNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSendFlowerNum();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GetFlowerRankDetailData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data);
      }

      public static GetFlowerRankDetailData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GetFlowerRankDetailData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data);
      }

      public static GetFlowerRankDetailData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GetFlowerRankDetailData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data);
      }

      public static GetFlowerRankDetailData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GetFlowerRankDetailData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GetFlowerRankDetailData parseFrom(InputStream input) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GetFlowerRankDetailData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GetFlowerRankDetailData parseDelimitedFrom(InputStream input) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GetFlowerRankDetailData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GetFlowerRankDetailData parseFrom(CodedInputStream input) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GetFlowerRankDetailData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GetFlowerRankDetailData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GetFlowerRankDetailData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GetFlowerRankDetailData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GetFlowerRankDetailData> parser() {
         return PARSER;
      }

      public Parser<GetFlowerRankDetailData> getParserForType() {
         return PARSER;
      }

      public GetFlowerRankDetailData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetFlowerRankDetailDataOrBuilder {
         private int bitField0_;
         private int sendPlayerId_;
         private Object sendPlayerName_;
         private int sendFlowerNum_;
         private int head_;
         private int headFrame_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_fieldAccessorTable.ensureFieldAccessorsInitialized(GetFlowerRankDetailData.class, Builder.class);
         }

         private Builder() {
            this.sendPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.sendPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.GetFlowerRankDetailData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sendPlayerId_ = 0;
            this.bitField0_ &= -2;
            this.sendPlayerName_ = "";
            this.bitField0_ &= -3;
            this.sendFlowerNum_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_GetFlowerRankDetailData_descriptor;
         }

         public GetFlowerRankDetailData getDefaultInstanceForType() {
            return FlowerMsg.GetFlowerRankDetailData.getDefaultInstance();
         }

         public GetFlowerRankDetailData build() {
            GetFlowerRankDetailData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GetFlowerRankDetailData buildPartial() {
            GetFlowerRankDetailData result = new GetFlowerRankDetailData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sendPlayerId_ = this.sendPlayerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.sendPlayerName_ = this.sendPlayerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.sendFlowerNum_ = this.sendFlowerNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headFrame_ = this.headFrame_;
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
            if (other instanceof GetFlowerRankDetailData) {
               return this.mergeFrom((GetFlowerRankDetailData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GetFlowerRankDetailData other) {
            if (other == FlowerMsg.GetFlowerRankDetailData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSendPlayerId()) {
                  this.setSendPlayerId(other.getSendPlayerId());
               }

               if (other.hasSendPlayerName()) {
                  this.bitField0_ |= 2;
                  this.sendPlayerName_ = other.sendPlayerName_;
                  this.onChanged();
               }

               if (other.hasSendFlowerNum()) {
                  this.setSendFlowerNum(other.getSendFlowerNum());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSendPlayerId()) {
               return false;
            } else if (!this.hasSendPlayerName()) {
               return false;
            } else if (!this.hasSendFlowerNum()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else {
               return this.hasHeadFrame();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GetFlowerRankDetailData parsedMessage = null;

            try {
               parsedMessage = (GetFlowerRankDetailData)FlowerMsg.GetFlowerRankDetailData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GetFlowerRankDetailData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSendPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSendPlayerId() {
            return this.sendPlayerId_;
         }

         public Builder setSendPlayerId(int value) {
            this.bitField0_ |= 1;
            this.sendPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendPlayerId() {
            this.bitField0_ &= -2;
            this.sendPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSendPlayerName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getSendPlayerName() {
            Object ref = this.sendPlayerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.sendPlayerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getSendPlayerNameBytes() {
            Object ref = this.sendPlayerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.sendPlayerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setSendPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.sendPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearSendPlayerName() {
            this.bitField0_ &= -3;
            this.sendPlayerName_ = FlowerMsg.GetFlowerRankDetailData.getDefaultInstance().getSendPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setSendPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.sendPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSendFlowerNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSendFlowerNum() {
            return this.sendFlowerNum_;
         }

         public Builder setSendFlowerNum(int value) {
            this.bitField0_ |= 4;
            this.sendFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendFlowerNum() {
            this.bitField0_ &= -5;
            this.sendFlowerNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 8;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 16;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
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

   public static final class C2S_FriendGetFlowerNum_24717 extends GeneratedMessageV3 implements C2S_FriendGetFlowerNum_24717OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendGetFlowerNum_24717 DEFAULT_INSTANCE = new C2S_FriendGetFlowerNum_24717();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendGetFlowerNum_24717> PARSER = new AbstractParser<C2S_FriendGetFlowerNum_24717>() {
         public C2S_FriendGetFlowerNum_24717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendGetFlowerNum_24717(input, extensionRegistry);
         }
      };

      private C2S_FriendGetFlowerNum_24717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendGetFlowerNum_24717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendGetFlowerNum_24717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendGetFlowerNum_24717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendGetFlowerNum_24717.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FriendGetFlowerNum_24717)) {
            return super.equals(obj);
         } else {
            C2S_FriendGetFlowerNum_24717 other = (C2S_FriendGetFlowerNum_24717)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendGetFlowerNum_24717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendGetFlowerNum_24717 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendGetFlowerNum_24717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendGetFlowerNum_24717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendGetFlowerNum_24717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendGetFlowerNum_24717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendGetFlowerNum_24717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendGetFlowerNum_24717> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendGetFlowerNum_24717> getParserForType() {
         return PARSER;
      }

      public C2S_FriendGetFlowerNum_24717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendGetFlowerNum_24717OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendGetFlowerNum_24717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.C2S_FriendGetFlowerNum_24717.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_C2S_FriendGetFlowerNum_24717_descriptor;
         }

         public C2S_FriendGetFlowerNum_24717 getDefaultInstanceForType() {
            return FlowerMsg.C2S_FriendGetFlowerNum_24717.getDefaultInstance();
         }

         public C2S_FriendGetFlowerNum_24717 build() {
            C2S_FriendGetFlowerNum_24717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendGetFlowerNum_24717 buildPartial() {
            C2S_FriendGetFlowerNum_24717 result = new C2S_FriendGetFlowerNum_24717(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_FriendGetFlowerNum_24717) {
               return this.mergeFrom((C2S_FriendGetFlowerNum_24717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendGetFlowerNum_24717 other) {
            if (other == FlowerMsg.C2S_FriendGetFlowerNum_24717.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FriendGetFlowerNum_24717 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendGetFlowerNum_24717)FlowerMsg.C2S_FriendGetFlowerNum_24717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendGetFlowerNum_24717)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_FriendGetFlowerNum_24718 extends GeneratedMessageV3 implements S2C_FriendGetFlowerNum_24718OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int FRIENDGETFLOWERDATA_FIELD_NUMBER = 1;
      private List<FriendGetFlowerData> friendGetFlowerData_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendGetFlowerNum_24718 DEFAULT_INSTANCE = new S2C_FriendGetFlowerNum_24718();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendGetFlowerNum_24718> PARSER = new AbstractParser<S2C_FriendGetFlowerNum_24718>() {
         public S2C_FriendGetFlowerNum_24718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendGetFlowerNum_24718(input, extensionRegistry);
         }
      };

      private S2C_FriendGetFlowerNum_24718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendGetFlowerNum_24718() {
         this.memoizedIsInitialized = -1;
         this.friendGetFlowerData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendGetFlowerNum_24718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendGetFlowerNum_24718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.friendGetFlowerData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.friendGetFlowerData_.add(input.readMessage(FlowerMsg.FriendGetFlowerData.PARSER, extensionRegistry));
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
                  this.friendGetFlowerData_ = Collections.unmodifiableList(this.friendGetFlowerData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendGetFlowerNum_24718.class, Builder.class);
      }

      public List<FriendGetFlowerData> getFriendGetFlowerDataList() {
         return this.friendGetFlowerData_;
      }

      public List<? extends FriendGetFlowerDataOrBuilder> getFriendGetFlowerDataOrBuilderList() {
         return this.friendGetFlowerData_;
      }

      public int getFriendGetFlowerDataCount() {
         return this.friendGetFlowerData_.size();
      }

      public FriendGetFlowerData getFriendGetFlowerData(int index) {
         return (FriendGetFlowerData)this.friendGetFlowerData_.get(index);
      }

      public FriendGetFlowerDataOrBuilder getFriendGetFlowerDataOrBuilder(int index) {
         return (FriendGetFlowerDataOrBuilder)this.friendGetFlowerData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getFriendGetFlowerDataCount(); ++i) {
               if (!this.getFriendGetFlowerData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.friendGetFlowerData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.friendGetFlowerData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.friendGetFlowerData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.friendGetFlowerData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendGetFlowerNum_24718)) {
            return super.equals(obj);
         } else {
            S2C_FriendGetFlowerNum_24718 other = (S2C_FriendGetFlowerNum_24718)obj;
            if (!this.getFriendGetFlowerDataList().equals(other.getFriendGetFlowerDataList())) {
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
            if (this.getFriendGetFlowerDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFriendGetFlowerDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendGetFlowerNum_24718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendGetFlowerNum_24718 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendGetFlowerNum_24718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendGetFlowerNum_24718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendGetFlowerNum_24718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendGetFlowerNum_24718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendGetFlowerNum_24718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendGetFlowerNum_24718> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendGetFlowerNum_24718> getParserForType() {
         return PARSER;
      }

      public S2C_FriendGetFlowerNum_24718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendGetFlowerNum_24718OrBuilder {
         private int bitField0_;
         private List<FriendGetFlowerData> friendGetFlowerData_;
         private RepeatedFieldBuilderV3<FriendGetFlowerData, FriendGetFlowerData.Builder, FriendGetFlowerDataOrBuilder> friendGetFlowerDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendGetFlowerNum_24718.class, Builder.class);
         }

         private Builder() {
            this.friendGetFlowerData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.friendGetFlowerData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerMsg.S2C_FriendGetFlowerNum_24718.alwaysUseFieldBuilders) {
               this.getFriendGetFlowerDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.friendGetFlowerData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.friendGetFlowerDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_S2C_FriendGetFlowerNum_24718_descriptor;
         }

         public S2C_FriendGetFlowerNum_24718 getDefaultInstanceForType() {
            return FlowerMsg.S2C_FriendGetFlowerNum_24718.getDefaultInstance();
         }

         public S2C_FriendGetFlowerNum_24718 build() {
            S2C_FriendGetFlowerNum_24718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendGetFlowerNum_24718 buildPartial() {
            S2C_FriendGetFlowerNum_24718 result = new S2C_FriendGetFlowerNum_24718(this);
            int from_bitField0_ = this.bitField0_;
            if (this.friendGetFlowerDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.friendGetFlowerData_ = Collections.unmodifiableList(this.friendGetFlowerData_);
                  this.bitField0_ &= -2;
               }

               result.friendGetFlowerData_ = this.friendGetFlowerData_;
            } else {
               result.friendGetFlowerData_ = this.friendGetFlowerDataBuilder_.build();
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
            if (other instanceof S2C_FriendGetFlowerNum_24718) {
               return this.mergeFrom((S2C_FriendGetFlowerNum_24718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendGetFlowerNum_24718 other) {
            if (other == FlowerMsg.S2C_FriendGetFlowerNum_24718.getDefaultInstance()) {
               return this;
            } else {
               if (this.friendGetFlowerDataBuilder_ == null) {
                  if (!other.friendGetFlowerData_.isEmpty()) {
                     if (this.friendGetFlowerData_.isEmpty()) {
                        this.friendGetFlowerData_ = other.friendGetFlowerData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureFriendGetFlowerDataIsMutable();
                        this.friendGetFlowerData_.addAll(other.friendGetFlowerData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.friendGetFlowerData_.isEmpty()) {
                  if (this.friendGetFlowerDataBuilder_.isEmpty()) {
                     this.friendGetFlowerDataBuilder_.dispose();
                     this.friendGetFlowerDataBuilder_ = null;
                     this.friendGetFlowerData_ = other.friendGetFlowerData_;
                     this.bitField0_ &= -2;
                     this.friendGetFlowerDataBuilder_ = FlowerMsg.S2C_FriendGetFlowerNum_24718.alwaysUseFieldBuilders ? this.getFriendGetFlowerDataFieldBuilder() : null;
                  } else {
                     this.friendGetFlowerDataBuilder_.addAllMessages(other.friendGetFlowerData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getFriendGetFlowerDataCount(); ++i) {
               if (!this.getFriendGetFlowerData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendGetFlowerNum_24718 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendGetFlowerNum_24718)FlowerMsg.S2C_FriendGetFlowerNum_24718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendGetFlowerNum_24718)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureFriendGetFlowerDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.friendGetFlowerData_ = new ArrayList(this.friendGetFlowerData_);
               this.bitField0_ |= 1;
            }

         }

         public List<FriendGetFlowerData> getFriendGetFlowerDataList() {
            return this.friendGetFlowerDataBuilder_ == null ? Collections.unmodifiableList(this.friendGetFlowerData_) : this.friendGetFlowerDataBuilder_.getMessageList();
         }

         public int getFriendGetFlowerDataCount() {
            return this.friendGetFlowerDataBuilder_ == null ? this.friendGetFlowerData_.size() : this.friendGetFlowerDataBuilder_.getCount();
         }

         public FriendGetFlowerData getFriendGetFlowerData(int index) {
            return this.friendGetFlowerDataBuilder_ == null ? (FriendGetFlowerData)this.friendGetFlowerData_.get(index) : (FriendGetFlowerData)this.friendGetFlowerDataBuilder_.getMessage(index);
         }

         public Builder setFriendGetFlowerData(int index, FriendGetFlowerData value) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.set(index, value);
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFriendGetFlowerData(int index, FriendGetFlowerData.Builder builderForValue) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFriendGetFlowerData(FriendGetFlowerData value) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.add(value);
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFriendGetFlowerData(int index, FriendGetFlowerData value) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.add(index, value);
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFriendGetFlowerData(FriendGetFlowerData.Builder builderForValue) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFriendGetFlowerData(int index, FriendGetFlowerData.Builder builderForValue) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFriendGetFlowerData(Iterable<? extends FriendGetFlowerData> values) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.ensureFriendGetFlowerDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.friendGetFlowerData_);
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFriendGetFlowerData() {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.friendGetFlowerData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeFriendGetFlowerData(int index) {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.ensureFriendGetFlowerDataIsMutable();
               this.friendGetFlowerData_.remove(index);
               this.onChanged();
            } else {
               this.friendGetFlowerDataBuilder_.remove(index);
            }

            return this;
         }

         public FriendGetFlowerData.Builder getFriendGetFlowerDataBuilder(int index) {
            return (FriendGetFlowerData.Builder)this.getFriendGetFlowerDataFieldBuilder().getBuilder(index);
         }

         public FriendGetFlowerDataOrBuilder getFriendGetFlowerDataOrBuilder(int index) {
            return this.friendGetFlowerDataBuilder_ == null ? (FriendGetFlowerDataOrBuilder)this.friendGetFlowerData_.get(index) : (FriendGetFlowerDataOrBuilder)this.friendGetFlowerDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends FriendGetFlowerDataOrBuilder> getFriendGetFlowerDataOrBuilderList() {
            return this.friendGetFlowerDataBuilder_ != null ? this.friendGetFlowerDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.friendGetFlowerData_);
         }

         public FriendGetFlowerData.Builder addFriendGetFlowerDataBuilder() {
            return (FriendGetFlowerData.Builder)this.getFriendGetFlowerDataFieldBuilder().addBuilder(FlowerMsg.FriendGetFlowerData.getDefaultInstance());
         }

         public FriendGetFlowerData.Builder addFriendGetFlowerDataBuilder(int index) {
            return (FriendGetFlowerData.Builder)this.getFriendGetFlowerDataFieldBuilder().addBuilder(index, FlowerMsg.FriendGetFlowerData.getDefaultInstance());
         }

         public List<FriendGetFlowerData.Builder> getFriendGetFlowerDataBuilderList() {
            return this.getFriendGetFlowerDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FriendGetFlowerData, FriendGetFlowerData.Builder, FriendGetFlowerDataOrBuilder> getFriendGetFlowerDataFieldBuilder() {
            if (this.friendGetFlowerDataBuilder_ == null) {
               this.friendGetFlowerDataBuilder_ = new RepeatedFieldBuilderV3(this.friendGetFlowerData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.friendGetFlowerData_ = null;
            }

            return this.friendGetFlowerDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class FriendGetFlowerData extends GeneratedMessageV3 implements FriendGetFlowerDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int GETFLOWERNUM_FIELD_NUMBER = 3;
      private int getFlowerNum_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      private byte memoizedIsInitialized;
      private static final FriendGetFlowerData DEFAULT_INSTANCE = new FriendGetFlowerData();
      /** @deprecated */
      @Deprecated
      public static final Parser<FriendGetFlowerData> PARSER = new AbstractParser<FriendGetFlowerData>() {
         public FriendGetFlowerData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FriendGetFlowerData(input, extensionRegistry);
         }
      };

      private FriendGetFlowerData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FriendGetFlowerData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FriendGetFlowerData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FriendGetFlowerData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 4;
                        this.getFlowerNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
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
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_fieldAccessorTable.ensureFieldAccessorsInitialized(FriendGetFlowerData.class, Builder.class);
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

      public boolean hasGetFlowerNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGetFlowerNum() {
         return this.getFlowerNum_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
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
         } else if (!this.hasGetFlowerNum()) {
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
            output.writeInt32(3, this.getFlowerNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headFrame_);
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
               size += CodedOutputStream.computeInt32Size(3, this.getFlowerNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FriendGetFlowerData)) {
            return super.equals(obj);
         } else {
            FriendGetFlowerData other = (FriendGetFlowerData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasGetFlowerNum() != other.hasGetFlowerNum()) {
               return false;
            } else if (this.hasGetFlowerNum() && this.getGetFlowerNum() != other.getGetFlowerNum()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
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

            if (this.hasGetFlowerNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGetFlowerNum();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FriendGetFlowerData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data);
      }

      public static FriendGetFlowerData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FriendGetFlowerData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data);
      }

      public static FriendGetFlowerData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FriendGetFlowerData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data);
      }

      public static FriendGetFlowerData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FriendGetFlowerData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FriendGetFlowerData parseFrom(InputStream input) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FriendGetFlowerData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FriendGetFlowerData parseDelimitedFrom(InputStream input) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FriendGetFlowerData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FriendGetFlowerData parseFrom(CodedInputStream input) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FriendGetFlowerData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FriendGetFlowerData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FriendGetFlowerData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FriendGetFlowerData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FriendGetFlowerData> parser() {
         return PARSER;
      }

      public Parser<FriendGetFlowerData> getParserForType() {
         return PARSER;
      }

      public FriendGetFlowerData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FriendGetFlowerDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int getFlowerNum_;
         private int head_;
         private int headFrame_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_fieldAccessorTable.ensureFieldAccessorsInitialized(FriendGetFlowerData.class, Builder.class);
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
            if (FlowerMsg.FriendGetFlowerData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.getFlowerNum_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerMsg.internal_static_Flower_com_gzbz_protobuf_FriendGetFlowerData_descriptor;
         }

         public FriendGetFlowerData getDefaultInstanceForType() {
            return FlowerMsg.FriendGetFlowerData.getDefaultInstance();
         }

         public FriendGetFlowerData build() {
            FriendGetFlowerData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FriendGetFlowerData buildPartial() {
            FriendGetFlowerData result = new FriendGetFlowerData(this);
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
               result.getFlowerNum_ = this.getFlowerNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headFrame_ = this.headFrame_;
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
            if (other instanceof FriendGetFlowerData) {
               return this.mergeFrom((FriendGetFlowerData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FriendGetFlowerData other) {
            if (other == FlowerMsg.FriendGetFlowerData.getDefaultInstance()) {
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

               if (other.hasGetFlowerNum()) {
                  this.setGetFlowerNum(other.getGetFlowerNum());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
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
            } else if (!this.hasGetFlowerNum()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else {
               return this.hasHeadFrame();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FriendGetFlowerData parsedMessage = null;

            try {
               parsedMessage = (FriendGetFlowerData)FlowerMsg.FriendGetFlowerData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FriendGetFlowerData)e.getUnfinishedMessage();
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
            this.playerName_ = FlowerMsg.FriendGetFlowerData.getDefaultInstance().getPlayerName();
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

         public boolean hasGetFlowerNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGetFlowerNum() {
            return this.getFlowerNum_;
         }

         public Builder setGetFlowerNum(int value) {
            this.bitField0_ |= 4;
            this.getFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGetFlowerNum() {
            this.bitField0_ &= -5;
            this.getFlowerNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 8;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 16;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
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

   public interface C2S_ActivityInfo_24701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_24703OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_FlowerBuy_24706OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_FriendGetFlowerNum_24717OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_GetFlowerRankDetail_24715OrBuilder extends MessageOrBuilder {
      boolean hasTargetPlayerId();

      int getTargetPlayerId();
   }

   public interface C2S_GetOtherPlayerFlowerNum_24712OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_GiveFlower_24710OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasFlowerNum();

      int getFlowerNum();
   }

   public interface C2S_RecScoreReward_24708OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface FriendGetFlowerDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasGetFlowerNum();

      int getGetFlowerNum();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();
   }

   public interface GetFlowerRankDetailDataOrBuilder extends MessageOrBuilder {
      boolean hasSendPlayerId();

      int getSendPlayerId();

      boolean hasSendPlayerName();

      String getSendPlayerName();

      ByteString getSendPlayerNameBytes();

      boolean hasSendFlowerNum();

      int getSendFlowerNum();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();
   }

   public interface S2C_ActivityInfo_24702OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasSendFlowerNum();

      int getSendFlowerNum();

      boolean hasGetFlowerNum();

      int getGetFlowerNum();

      boolean hasTotalScore();

      int getTotalScore();

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);

      List<CommonMsg.MapDataII> getFlowerBuyIdNumList();

      CommonMsg.MapDataII getFlowerBuyIdNum(int index);

      int getFlowerBuyIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getScoreIdNumList();

      CommonMsg.MapDataII getScoreIdNum(int index);

      int getScoreIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index);
   }

   public interface S2C_CommitTask_24704OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_CrossActOpenDay_24714OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface S2C_FlowerBuy_24707OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getFlowerBuyIdNumList();

      CommonMsg.MapDataII getFlowerBuyIdNum(int index);

      int getFlowerBuyIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getFlowerBuyIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getFlowerBuyIdNumOrBuilder(int index);
   }

   public interface S2C_FriendGetFlowerNum_24718OrBuilder extends MessageOrBuilder {
      List<FriendGetFlowerData> getFriendGetFlowerDataList();

      FriendGetFlowerData getFriendGetFlowerData(int index);

      int getFriendGetFlowerDataCount();

      List<? extends FriendGetFlowerDataOrBuilder> getFriendGetFlowerDataOrBuilderList();

      FriendGetFlowerDataOrBuilder getFriendGetFlowerDataOrBuilder(int index);
   }

   public interface S2C_GetFlowerRankDetail_24716OrBuilder extends MessageOrBuilder {
      List<GetFlowerRankDetailData> getGetFlowerRankDetailDataList();

      GetFlowerRankDetailData getGetFlowerRankDetailData(int index);

      int getGetFlowerRankDetailDataCount();

      List<? extends GetFlowerRankDetailDataOrBuilder> getGetFlowerRankDetailDataOrBuilderList();

      GetFlowerRankDetailDataOrBuilder getGetFlowerRankDetailDataOrBuilder(int index);
   }

   public interface S2C_GetOtherPlayerFlowerNum_24713OrBuilder extends MessageOrBuilder {
      boolean hasGetFlowerNum();

      int getGetFlowerNum();
   }

   public interface S2C_GiveFlower_24711OrBuilder extends MessageOrBuilder {
      boolean hasSendFlowerNum();

      int getSendFlowerNum();
   }

   public interface S2C_RecScoreReward_24709OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getScoreIdNumList();

      CommonMsg.MapDataII getScoreIdNum(int index);

      int getScoreIdNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getScoreIdNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getScoreIdNumOrBuilder(int index);
   }

   public interface S2C_TaskNotice_24705OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }
}
