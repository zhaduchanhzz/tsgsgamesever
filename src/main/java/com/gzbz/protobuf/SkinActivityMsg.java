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

public final class SkinActivityMsg {
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_CardInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SkinActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012SkinActivity.proto\u0012\u001eskinActivity.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u001a\n\u0018C2S_OpenActivityUi_13601\"|\n\u0018S2C_OpenActivityUi_13602\u0012\r\n\u0005fight\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bfightReward\u0018\u0003 \u0003(\u0005\u0012\u0012\n\ntotalPoint\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0005 \u0003(\u0005\"\u0010\n\u000eC2S_Mate_13603\"\u0081\u0001\n\u000eS2C_Mate_13604\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012,\n\barraying\u0018\u0002 \u0002(\u000b2\u001a.common.PlayerArrayingInfo\u0012\u0011\n\tmonarchId\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0006 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0007 \u0002(\u0005\"#\n\u0015C2S_PointReward_13607\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0015S2C_PointReward_13608\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_MatchBattle_13611\"b\n\u0015S2C_MatchBattle_13612\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0004 \u0002(\u0003\u0012\u0012\n\ntotalPoint\u0018\u0005 \u0002(\u0005\":\n\bCardInfo\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"\u0018\n\u0016C2S_OpenTurnCard_13621\"ª\u0001\n\u0016S2C_OpenTurnCard_13622\u0012\u0012\n\nisHaveLuck\u0018\u0001 \u0002(\b\u0012\r\n\u0005round\u0018\u0002 \u0002(\u0005\u00127\n\u0005infos\u0018\u0003 \u0003(\u000b2(.skinActivity.com.gzbz.protobuf.CardInfo\u0012\u001e\n\u0004item\u0018\u0004 \u0001(\u000b2\u0010.common.ItemInfo\u0012\u0014\n\fdailyDrawNum\u0018\u0005 \u0002(\u0005\"#\n\u0012C2S_TurnCard_13623\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\"\u0099\u0001\n\u0012S2C_TurnCard_13624\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fisLuckReward\u0018\u0002 \u0002(\b\u00126\n\u0004info\u0018\u0003 \u0002(\u000b2(.skinActivity.com.gzbz.protobuf.CardInfo\u0012\u000f\n\u0007isReset\u0018\u0004 \u0001(\b\u0012\u0014\n\fdailyDrawNum\u0018\u0005 \u0002(\u0005\"0\n\u001aC2S_ChoiceLuckReward_13625\u0012\u0012\n\nawardIndex\u0018\u0001 \u0002(\u0005\"L\n\u001aS2C_ChoiceLuckReward_13626\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u001e\n\u0004item\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfo\"&\n\u0014C2S_CommitTask_13651\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_13652\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bC2S_SkinAvtivityTasks_13653\"9\n\u001bS2C_SkinAvtivityTasks_13654\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n\u0015S2C_UpdateTasks_13656\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.TaskB&\n\u0011com.gzbz.protobufB\u000fSkinActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor, new String[0]);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor, new String[]{"Fight", "TotalDamage", "FightReward", "TotalPoint", "PointReward"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor, new String[0]);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor, new String[]{"Power", "Arraying", "MonarchId", "PlayerName", "Sex"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor, new String[]{"Id"});
      internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor, new String[]{"Id"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor, new String[0]);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor, new String[]{"Damage", "FightNum", "TotalDamage", "TotalPoint"});
      internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_skinActivity_com_gzbz_protobuf_CardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor, new String[]{"Index", "Items"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor, new String[0]);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor, new String[]{"IsHaveLuck", "Round", "Infos", "Item", "DailyDrawNum"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor, new String[]{"Index"});
      internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor, new String[]{"Result", "IsLuckReward", "Info", "IsReset", "DailyDrawNum"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor, new String[]{"AwardIndex"});
      internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor, new String[]{"Result", "Item"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor, new String[]{"TaskId"});
      internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor, new String[]{"TaskId"});
      internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor, new String[0]);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor, new String[]{"Task"});
      internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor, new String[]{"Task"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_OpenActivityUi_13601 extends GeneratedMessageV3 implements C2S_OpenActivityUi_13601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenActivityUi_13601 DEFAULT_INSTANCE = new C2S_OpenActivityUi_13601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenActivityUi_13601> PARSER = new AbstractParser<C2S_OpenActivityUi_13601>() {
         public C2S_OpenActivityUi_13601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenActivityUi_13601(input, extensionRegistry);
         }
      };

      private C2S_OpenActivityUi_13601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenActivityUi_13601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenActivityUi_13601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenActivityUi_13601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenActivityUi_13601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenActivityUi_13601)) {
            return super.equals(obj);
         } else {
            C2S_OpenActivityUi_13601 other = (C2S_OpenActivityUi_13601)obj;
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

      public static C2S_OpenActivityUi_13601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenActivityUi_13601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenActivityUi_13601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenActivityUi_13601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenActivityUi_13601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenActivityUi_13601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenActivityUi_13601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenActivityUi_13601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenActivityUi_13601> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenActivityUi_13601> getParserForType() {
         return PARSER;
      }

      public C2S_OpenActivityUi_13601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenActivityUi_13601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenActivityUi_13601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_OpenActivityUi_13601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenActivityUi_13601_descriptor;
         }

         public C2S_OpenActivityUi_13601 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_OpenActivityUi_13601.getDefaultInstance();
         }

         public C2S_OpenActivityUi_13601 build() {
            C2S_OpenActivityUi_13601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenActivityUi_13601 buildPartial() {
            C2S_OpenActivityUi_13601 result = new C2S_OpenActivityUi_13601(this);
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
            if (other instanceof C2S_OpenActivityUi_13601) {
               return this.mergeFrom((C2S_OpenActivityUi_13601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenActivityUi_13601 other) {
            if (other == SkinActivityMsg.C2S_OpenActivityUi_13601.getDefaultInstance()) {
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
            C2S_OpenActivityUi_13601 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenActivityUi_13601)SkinActivityMsg.C2S_OpenActivityUi_13601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenActivityUi_13601)e.getUnfinishedMessage();
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

   public static final class S2C_OpenActivityUi_13602 extends GeneratedMessageV3 implements S2C_OpenActivityUi_13602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHT_FIELD_NUMBER = 1;
      private int fight_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 2;
      private long totalDamage_;
      public static final int FIGHTREWARD_FIELD_NUMBER = 3;
      private Internal.IntList fightReward_;
      public static final int TOTALPOINT_FIELD_NUMBER = 4;
      private int totalPoint_;
      public static final int POINTREWARD_FIELD_NUMBER = 5;
      private Internal.IntList pointReward_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenActivityUi_13602 DEFAULT_INSTANCE = new S2C_OpenActivityUi_13602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenActivityUi_13602> PARSER = new AbstractParser<S2C_OpenActivityUi_13602>() {
         public S2C_OpenActivityUi_13602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenActivityUi_13602(input, extensionRegistry);
         }
      };

      private S2C_OpenActivityUi_13602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenActivityUi_13602() {
         this.memoizedIsInitialized = -1;
         this.fightReward_ = emptyIntList();
         this.pointReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenActivityUi_13602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenActivityUi_13602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fight_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalDamage_ = input.readInt64();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.fightReward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalPoint_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pointReward_.addInt(input.readInt32());
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
                     this.fightReward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.fightReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.pointReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenActivityUi_13602.class, Builder.class);
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFight() {
         return this.fight_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public List<Integer> getFightRewardList() {
         return this.fightReward_;
      }

      public int getFightRewardCount() {
         return this.fightReward_.size();
      }

      public int getFightReward(int index) {
         return this.fightReward_.getInt(index);
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fight_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.totalDamage_);
         }

         for(int i = 0; i < this.fightReward_.size(); ++i) {
            output.writeInt32(3, this.fightReward_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.totalPoint_);
         }

         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(5, this.pointReward_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.fight_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.totalDamage_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.fightReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.fightReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFightRewardList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalPoint_);
            }

            dataSize = 0;

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenActivityUi_13602)) {
            return super.equals(obj);
         } else {
            S2C_OpenActivityUi_13602 other = (S2C_OpenActivityUi_13602)obj;
            if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (!this.getFightRewardList().equals(other.getFightRewardList())) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
               return false;
            } else if (!this.getPointRewardList().equals(other.getPointRewardList())) {
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
            if (this.hasFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.getFightRewardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightRewardList().hashCode();
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalPoint();
            }

            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenActivityUi_13602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenActivityUi_13602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenActivityUi_13602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenActivityUi_13602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenActivityUi_13602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenActivityUi_13602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenActivityUi_13602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenActivityUi_13602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenActivityUi_13602> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenActivityUi_13602> getParserForType() {
         return PARSER;
      }

      public S2C_OpenActivityUi_13602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenActivityUi_13602OrBuilder {
         private int bitField0_;
         private int fight_;
         private long totalDamage_;
         private Internal.IntList fightReward_;
         private int totalPoint_;
         private Internal.IntList pointReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenActivityUi_13602.class, Builder.class);
         }

         private Builder() {
            this.fightReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.pointReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.pointReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_OpenActivityUi_13602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fight_ = 0;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.fightReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            this.pointReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenActivityUi_13602_descriptor;
         }

         public S2C_OpenActivityUi_13602 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_OpenActivityUi_13602.getDefaultInstance();
         }

         public S2C_OpenActivityUi_13602 build() {
            S2C_OpenActivityUi_13602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenActivityUi_13602 buildPartial() {
            S2C_OpenActivityUi_13602 result = new S2C_OpenActivityUi_13602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.fightReward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.fightReward_ = this.fightReward_;
            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.pointReward_ = this.pointReward_;
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
            if (other instanceof S2C_OpenActivityUi_13602) {
               return this.mergeFrom((S2C_OpenActivityUi_13602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenActivityUi_13602 other) {
            if (other == SkinActivityMsg.S2C_OpenActivityUi_13602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (!other.fightReward_.isEmpty()) {
                  if (this.fightReward_.isEmpty()) {
                     this.fightReward_ = other.fightReward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureFightRewardIsMutable();
                     this.fightReward_.addAll(other.fightReward_);
                  }

                  this.onChanged();
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFight()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else {
               return this.hasTotalPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenActivityUi_13602 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenActivityUi_13602)SkinActivityMsg.S2C_OpenActivityUi_13602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenActivityUi_13602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFight() {
            return this.fight_;
         }

         public Builder setFight(int value) {
            this.bitField0_ |= 1;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -2;
            this.fight_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 2;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureFightRewardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.fightReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.mutableCopy(this.fightReward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getFightRewardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.fightReward_) : this.fightReward_);
         }

         public int getFightRewardCount() {
            return this.fightReward_.size();
         }

         public int getFightReward(int index) {
            return this.fightReward_.getInt(index);
         }

         public Builder setFightReward(int index, int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFightReward(int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFightReward(Iterable<? extends Integer> values) {
            this.ensureFightRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fightReward_);
            this.onChanged();
            return this;
         }

         public Builder clearFightReward() {
            this.fightReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.pointReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.mutableCopy(this.pointReward_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
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
            this.pointReward_ = SkinActivityMsg.S2C_OpenActivityUi_13602.emptyIntList();
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

   public static final class C2S_Mate_13603 extends GeneratedMessageV3 implements C2S_Mate_13603OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Mate_13603 DEFAULT_INSTANCE = new C2S_Mate_13603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Mate_13603> PARSER = new AbstractParser<C2S_Mate_13603>() {
         public C2S_Mate_13603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Mate_13603(input, extensionRegistry);
         }
      };

      private C2S_Mate_13603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Mate_13603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Mate_13603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Mate_13603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_13603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Mate_13603)) {
            return super.equals(obj);
         } else {
            C2S_Mate_13603 other = (C2S_Mate_13603)obj;
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

      public static C2S_Mate_13603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data);
      }

      public static C2S_Mate_13603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_13603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data);
      }

      public static C2S_Mate_13603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_13603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data);
      }

      public static C2S_Mate_13603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_13603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_13603 parseFrom(InputStream input) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_13603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_13603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Mate_13603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_13603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_13603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_13603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Mate_13603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Mate_13603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Mate_13603> parser() {
         return PARSER;
      }

      public Parser<C2S_Mate_13603> getParserForType() {
         return PARSER;
      }

      public C2S_Mate_13603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Mate_13603OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_13603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_Mate_13603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_Mate_13603_descriptor;
         }

         public C2S_Mate_13603 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_Mate_13603.getDefaultInstance();
         }

         public C2S_Mate_13603 build() {
            C2S_Mate_13603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Mate_13603 buildPartial() {
            C2S_Mate_13603 result = new C2S_Mate_13603(this);
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
            if (other instanceof C2S_Mate_13603) {
               return this.mergeFrom((C2S_Mate_13603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Mate_13603 other) {
            if (other == SkinActivityMsg.C2S_Mate_13603.getDefaultInstance()) {
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
            C2S_Mate_13603 parsedMessage = null;

            try {
               parsedMessage = (C2S_Mate_13603)SkinActivityMsg.C2S_Mate_13603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Mate_13603)e.getUnfinishedMessage();
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

   public static final class S2C_Mate_13604 extends GeneratedMessageV3 implements S2C_Mate_13604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private CommonMsg.PlayerArrayingInfo arraying_;
      public static final int MONARCHID_FIELD_NUMBER = 5;
      private int monarchId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 6;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 7;
      private int sex_;
      private byte memoizedIsInitialized;
      private static final S2C_Mate_13604 DEFAULT_INSTANCE = new S2C_Mate_13604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Mate_13604> PARSER = new AbstractParser<S2C_Mate_13604>() {
         public S2C_Mate_13604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Mate_13604(input, extensionRegistry);
         }
      };

      private S2C_Mate_13604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Mate_13604() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Mate_13604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Mate_13604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.power_ = input.readInt64();
                        break;
                     case 18:
                        CommonMsg.PlayerArrayingInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.arraying_.toBuilder();
                        }

                        this.arraying_ = (CommonMsg.PlayerArrayingInfo)input.readMessage(CommonMsg.PlayerArrayingInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.arraying_);
                           this.arraying_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.sex_ = input.readInt32();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_13604.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerArrayingInfo getArraying() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 8) != 0;
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

      public boolean hasSex() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMonarchId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getArraying().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getArraying());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.monarchId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.sex_);
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
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getArraying());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.monarchId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.sex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Mate_13604)) {
            return super.equals(obj);
         } else {
            S2C_Mate_13604 other = (S2C_Mate_13604)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
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
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Mate_13604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data);
      }

      public static S2C_Mate_13604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_13604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data);
      }

      public static S2C_Mate_13604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_13604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data);
      }

      public static S2C_Mate_13604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_13604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_13604 parseFrom(InputStream input) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_13604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_13604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Mate_13604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_13604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_13604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_13604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Mate_13604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Mate_13604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Mate_13604> parser() {
         return PARSER;
      }

      public Parser<S2C_Mate_13604> getParserForType() {
         return PARSER;
      }

      public S2C_Mate_13604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Mate_13604OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PlayerArrayingInfo arraying_;
         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> arrayingBuilder_;
         private int monarchId_;
         private Object playerName_;
         private int sex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_13604.class, Builder.class);
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
            if (SkinActivityMsg.S2C_Mate_13604.alwaysUseFieldBuilders) {
               this.getArrayingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.monarchId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_Mate_13604_descriptor;
         }

         public S2C_Mate_13604 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_Mate_13604.getDefaultInstance();
         }

         public S2C_Mate_13604 build() {
            S2C_Mate_13604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Mate_13604 buildPartial() {
            S2C_Mate_13604 result = new S2C_Mate_13604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.arrayingBuilder_ == null) {
                  result.arraying_ = this.arraying_;
               } else {
                  result.arraying_ = (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.sex_ = this.sex_;
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
            if (other instanceof S2C_Mate_13604) {
               return this.mergeFrom((S2C_Mate_13604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Mate_13604 other) {
            if (other == SkinActivityMsg.S2C_Mate_13604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasArraying()) {
                  this.mergeArraying(other.getArraying());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPower()) {
               return false;
            } else if (!this.hasArraying()) {
               return false;
            } else if (!this.hasMonarchId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasSex()) {
               return false;
            } else {
               return this.getArraying().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Mate_13604 parsedMessage = null;

            try {
               parsedMessage = (S2C_Mate_13604)SkinActivityMsg.S2C_Mate_13604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Mate_13604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerArrayingInfo getArraying() {
            if (this.arrayingBuilder_ == null) {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            } else {
               return (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.getMessage();
            }
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.arraying_ = value;
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = builderForValue.build();
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.arraying_ != null && this.arraying_ != CommonMsg.PlayerArrayingInfo.getDefaultInstance()) {
                  this.arraying_ = CommonMsg.PlayerArrayingInfo.newBuilder(this.arraying_).mergeFrom(value).buildPartial();
               } else {
                  this.arraying_ = value;
               }

               this.onChanged();
            } else {
               this.arrayingBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearArraying() {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
               this.onChanged();
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerArrayingInfo.Builder getArrayingBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerArrayingInfo.Builder)this.getArrayingFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
            if (this.arrayingBuilder_ != null) {
               return (CommonMsg.PlayerArrayingInfoOrBuilder)this.arrayingBuilder_.getMessageOrBuilder();
            } else {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> getArrayingFieldBuilder() {
            if (this.arrayingBuilder_ == null) {
               this.arrayingBuilder_ = new SingleFieldBuilderV3(this.getArraying(), this.getParentForChildren(), this.isClean());
               this.arraying_ = null;
            }

            return this.arrayingBuilder_;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 4;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -5;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -9;
            this.playerName_ = SkinActivityMsg.S2C_Mate_13604.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSex() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 16;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -17;
            this.sex_ = 0;
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

   public static final class C2S_PointReward_13607 extends GeneratedMessageV3 implements C2S_PointReward_13607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PointReward_13607 DEFAULT_INSTANCE = new C2S_PointReward_13607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointReward_13607> PARSER = new AbstractParser<C2S_PointReward_13607>() {
         public C2S_PointReward_13607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointReward_13607(input, extensionRegistry);
         }
      };

      private C2S_PointReward_13607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointReward_13607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointReward_13607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointReward_13607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_13607.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointReward_13607)) {
            return super.equals(obj);
         } else {
            C2S_PointReward_13607 other = (C2S_PointReward_13607)obj;
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

      public static C2S_PointReward_13607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_13607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_13607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_13607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_13607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_13607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_13607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_13607 parseFrom(InputStream input) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_13607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_13607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointReward_13607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_13607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_13607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_13607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointReward_13607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointReward_13607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointReward_13607> parser() {
         return PARSER;
      }

      public Parser<C2S_PointReward_13607> getParserForType() {
         return PARSER;
      }

      public C2S_PointReward_13607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointReward_13607OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_13607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_PointReward_13607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_PointReward_13607_descriptor;
         }

         public C2S_PointReward_13607 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_PointReward_13607.getDefaultInstance();
         }

         public C2S_PointReward_13607 build() {
            C2S_PointReward_13607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointReward_13607 buildPartial() {
            C2S_PointReward_13607 result = new C2S_PointReward_13607(this);
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
            if (other instanceof C2S_PointReward_13607) {
               return this.mergeFrom((C2S_PointReward_13607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointReward_13607 other) {
            if (other == SkinActivityMsg.C2S_PointReward_13607.getDefaultInstance()) {
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
            C2S_PointReward_13607 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointReward_13607)SkinActivityMsg.C2S_PointReward_13607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointReward_13607)e.getUnfinishedMessage();
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

   public static final class S2C_PointReward_13608 extends GeneratedMessageV3 implements S2C_PointReward_13608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PointReward_13608 DEFAULT_INSTANCE = new S2C_PointReward_13608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointReward_13608> PARSER = new AbstractParser<S2C_PointReward_13608>() {
         public S2C_PointReward_13608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointReward_13608(input, extensionRegistry);
         }
      };

      private S2C_PointReward_13608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointReward_13608() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointReward_13608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointReward_13608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_13608.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PointReward_13608)) {
            return super.equals(obj);
         } else {
            S2C_PointReward_13608 other = (S2C_PointReward_13608)obj;
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

      public static S2C_PointReward_13608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_13608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_13608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_13608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_13608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_13608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_13608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_13608 parseFrom(InputStream input) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_13608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_13608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointReward_13608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_13608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_13608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_13608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointReward_13608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointReward_13608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointReward_13608> parser() {
         return PARSER;
      }

      public Parser<S2C_PointReward_13608> getParserForType() {
         return PARSER;
      }

      public S2C_PointReward_13608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointReward_13608OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_13608.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_PointReward_13608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_PointReward_13608_descriptor;
         }

         public S2C_PointReward_13608 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_PointReward_13608.getDefaultInstance();
         }

         public S2C_PointReward_13608 build() {
            S2C_PointReward_13608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointReward_13608 buildPartial() {
            S2C_PointReward_13608 result = new S2C_PointReward_13608(this);
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
            if (other instanceof S2C_PointReward_13608) {
               return this.mergeFrom((S2C_PointReward_13608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointReward_13608 other) {
            if (other == SkinActivityMsg.S2C_PointReward_13608.getDefaultInstance()) {
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
            S2C_PointReward_13608 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointReward_13608)SkinActivityMsg.S2C_PointReward_13608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointReward_13608)e.getUnfinishedMessage();
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

   public static final class C2S_MatchBattle_13611 extends GeneratedMessageV3 implements C2S_MatchBattle_13611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MatchBattle_13611 DEFAULT_INSTANCE = new C2S_MatchBattle_13611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchBattle_13611> PARSER = new AbstractParser<C2S_MatchBattle_13611>() {
         public C2S_MatchBattle_13611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchBattle_13611(input, extensionRegistry);
         }
      };

      private C2S_MatchBattle_13611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchBattle_13611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchBattle_13611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchBattle_13611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_13611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchBattle_13611)) {
            return super.equals(obj);
         } else {
            C2S_MatchBattle_13611 other = (C2S_MatchBattle_13611)obj;
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

      public static C2S_MatchBattle_13611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_13611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_13611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_13611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_13611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_13611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_13611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_13611 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_13611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_13611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_13611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_13611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_13611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_13611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchBattle_13611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchBattle_13611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchBattle_13611> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchBattle_13611> getParserForType() {
         return PARSER;
      }

      public C2S_MatchBattle_13611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchBattle_13611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_13611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_MatchBattle_13611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_MatchBattle_13611_descriptor;
         }

         public C2S_MatchBattle_13611 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_MatchBattle_13611.getDefaultInstance();
         }

         public C2S_MatchBattle_13611 build() {
            C2S_MatchBattle_13611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchBattle_13611 buildPartial() {
            C2S_MatchBattle_13611 result = new C2S_MatchBattle_13611(this);
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
            if (other instanceof C2S_MatchBattle_13611) {
               return this.mergeFrom((C2S_MatchBattle_13611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchBattle_13611 other) {
            if (other == SkinActivityMsg.C2S_MatchBattle_13611.getDefaultInstance()) {
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
            C2S_MatchBattle_13611 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchBattle_13611)SkinActivityMsg.C2S_MatchBattle_13611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchBattle_13611)e.getUnfinishedMessage();
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

   public static final class S2C_MatchBattle_13612 extends GeneratedMessageV3 implements S2C_MatchBattle_13612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAMAGE_FIELD_NUMBER = 2;
      private long damage_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 4;
      private long totalDamage_;
      public static final int TOTALPOINT_FIELD_NUMBER = 5;
      private int totalPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_MatchBattle_13612 DEFAULT_INSTANCE = new S2C_MatchBattle_13612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchBattle_13612> PARSER = new AbstractParser<S2C_MatchBattle_13612>() {
         public S2C_MatchBattle_13612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchBattle_13612(input, extensionRegistry);
         }
      };

      private S2C_MatchBattle_13612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchBattle_13612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchBattle_13612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchBattle_13612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.damage_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalDamage_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.totalPoint_ = input.readInt32();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_13612.class, Builder.class);
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.damage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.totalDamage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.totalPoint_);
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
               size += CodedOutputStream.computeInt64Size(2, this.damage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.totalDamage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.totalPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MatchBattle_13612)) {
            return super.equals(obj);
         } else {
            S2C_MatchBattle_13612 other = (S2C_MatchBattle_13612)obj;
            if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
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
            if (this.hasDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTotalPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MatchBattle_13612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_13612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_13612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_13612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_13612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_13612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_13612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_13612 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_13612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_13612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_13612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_13612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_13612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_13612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchBattle_13612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchBattle_13612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchBattle_13612> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchBattle_13612> getParserForType() {
         return PARSER;
      }

      public S2C_MatchBattle_13612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchBattle_13612OrBuilder {
         private int bitField0_;
         private long damage_;
         private int fightNum_;
         private long totalDamage_;
         private int totalPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_13612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_MatchBattle_13612.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.damage_ = 0L;
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_MatchBattle_13612_descriptor;
         }

         public S2C_MatchBattle_13612 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_MatchBattle_13612.getDefaultInstance();
         }

         public S2C_MatchBattle_13612 build() {
            S2C_MatchBattle_13612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchBattle_13612 buildPartial() {
            S2C_MatchBattle_13612 result = new S2C_MatchBattle_13612(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
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
            if (other instanceof S2C_MatchBattle_13612) {
               return this.mergeFrom((S2C_MatchBattle_13612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchBattle_13612 other) {
            if (other == SkinActivityMsg.S2C_MatchBattle_13612.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDamage()) {
               return false;
            } else if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else {
               return this.hasTotalPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MatchBattle_13612 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchBattle_13612)SkinActivityMsg.S2C_MatchBattle_13612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchBattle_13612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 1;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -2;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 2;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 4;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -5;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
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

   public static final class CardInfo extends GeneratedMessageV3 implements CardInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final CardInfo DEFAULT_INSTANCE = new CardInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CardInfo> PARSER = new AbstractParser<CardInfo>() {
         public CardInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CardInfo(input, extensionRegistry);
         }
      };

      private CardInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CardInfo() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CardInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CardInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_CardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CardInfo.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(1, this.index_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CardInfo)) {
            return super.equals(obj);
         } else {
            CardInfo other = (CardInfo)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
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
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CardInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data);
      }

      public static CardInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CardInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data);
      }

      public static CardInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CardInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data);
      }

      public static CardInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CardInfo parseFrom(InputStream input) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CardInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CardInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CardInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CardInfo parseFrom(CodedInputStream input) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CardInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CardInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CardInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CardInfo> parser() {
         return PARSER;
      }

      public Parser<CardInfo> getParserForType() {
         return PARSER;
      }

      public CardInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardInfoOrBuilder {
         private int bitField0_;
         private int index_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_CardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CardInfo.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.CardInfo.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_CardInfo_descriptor;
         }

         public CardInfo getDefaultInstanceForType() {
            return SkinActivityMsg.CardInfo.getDefaultInstance();
         }

         public CardInfo build() {
            CardInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CardInfo buildPartial() {
            CardInfo result = new CardInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 1;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -3;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof CardInfo) {
               return this.mergeFrom((CardInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CardInfo other) {
            if (other == SkinActivityMsg.CardInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -3;
                     this.itemsBuilder_ = SkinActivityMsg.CardInfo.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIndex()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CardInfo parsedMessage = null;

            try {
               parsedMessage = (CardInfo)SkinActivityMsg.CardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CardInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OpenTurnCard_13621 extends GeneratedMessageV3 implements C2S_OpenTurnCard_13621OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenTurnCard_13621 DEFAULT_INSTANCE = new C2S_OpenTurnCard_13621();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenTurnCard_13621> PARSER = new AbstractParser<C2S_OpenTurnCard_13621>() {
         public C2S_OpenTurnCard_13621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenTurnCard_13621(input, extensionRegistry);
         }
      };

      private C2S_OpenTurnCard_13621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenTurnCard_13621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenTurnCard_13621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenTurnCard_13621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenTurnCard_13621.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenTurnCard_13621)) {
            return super.equals(obj);
         } else {
            C2S_OpenTurnCard_13621 other = (C2S_OpenTurnCard_13621)obj;
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

      public static C2S_OpenTurnCard_13621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenTurnCard_13621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenTurnCard_13621 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenTurnCard_13621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenTurnCard_13621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenTurnCard_13621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenTurnCard_13621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenTurnCard_13621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenTurnCard_13621> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenTurnCard_13621> getParserForType() {
         return PARSER;
      }

      public C2S_OpenTurnCard_13621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenTurnCard_13621OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenTurnCard_13621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_OpenTurnCard_13621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_OpenTurnCard_13621_descriptor;
         }

         public C2S_OpenTurnCard_13621 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_OpenTurnCard_13621.getDefaultInstance();
         }

         public C2S_OpenTurnCard_13621 build() {
            C2S_OpenTurnCard_13621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenTurnCard_13621 buildPartial() {
            C2S_OpenTurnCard_13621 result = new C2S_OpenTurnCard_13621(this);
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
            if (other instanceof C2S_OpenTurnCard_13621) {
               return this.mergeFrom((C2S_OpenTurnCard_13621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenTurnCard_13621 other) {
            if (other == SkinActivityMsg.C2S_OpenTurnCard_13621.getDefaultInstance()) {
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
            C2S_OpenTurnCard_13621 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenTurnCard_13621)SkinActivityMsg.C2S_OpenTurnCard_13621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenTurnCard_13621)e.getUnfinishedMessage();
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

   public static final class S2C_OpenTurnCard_13622 extends GeneratedMessageV3 implements S2C_OpenTurnCard_13622OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISHAVELUCK_FIELD_NUMBER = 1;
      private boolean isHaveLuck_;
      public static final int ROUND_FIELD_NUMBER = 2;
      private int round_;
      public static final int INFOS_FIELD_NUMBER = 3;
      private List<CardInfo> infos_;
      public static final int ITEM_FIELD_NUMBER = 4;
      private CommonMsg.ItemInfo item_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 5;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenTurnCard_13622 DEFAULT_INSTANCE = new S2C_OpenTurnCard_13622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenTurnCard_13622> PARSER = new AbstractParser<S2C_OpenTurnCard_13622>() {
         public S2C_OpenTurnCard_13622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenTurnCard_13622(input, extensionRegistry);
         }
      };

      private S2C_OpenTurnCard_13622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenTurnCard_13622() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenTurnCard_13622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenTurnCard_13622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isHaveLuck_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.round_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.infos_.add(input.readMessage(SkinActivityMsg.CardInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dailyDrawNum_ = input.readInt32();
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenTurnCard_13622.class, Builder.class);
      }

      public boolean hasIsHaveLuck() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsHaveLuck() {
         return this.isHaveLuck_;
      }

      public boolean hasRound() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public List<CardInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CardInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CardInfo getInfos(int index) {
         return (CardInfo)this.infos_.get(index);
      }

      public CardInfoOrBuilder getInfosOrBuilder(int index) {
         return (CardInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasItem() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.ItemInfo getItem() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsHaveLuck()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasItem() && !this.getItem().isInitialized()) {
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
            output.writeBool(1, this.isHaveLuck_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.round_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getItem());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.dailyDrawNum_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isHaveLuck_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.round_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getItem());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenTurnCard_13622)) {
            return super.equals(obj);
         } else {
            S2C_OpenTurnCard_13622 other = (S2C_OpenTurnCard_13622)obj;
            if (this.hasIsHaveLuck() != other.hasIsHaveLuck()) {
               return false;
            } else if (this.hasIsHaveLuck() && this.getIsHaveLuck() != other.getIsHaveLuck()) {
               return false;
            } else if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
               return false;
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
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
            if (this.hasIsHaveLuck()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveLuck());
            }

            if (this.hasRound()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRound();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItem().hashCode();
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenTurnCard_13622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenTurnCard_13622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenTurnCard_13622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenTurnCard_13622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenTurnCard_13622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenTurnCard_13622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenTurnCard_13622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenTurnCard_13622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenTurnCard_13622> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenTurnCard_13622> getParserForType() {
         return PARSER;
      }

      public S2C_OpenTurnCard_13622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenTurnCard_13622OrBuilder {
         private int bitField0_;
         private boolean isHaveLuck_;
         private int round_;
         private List<CardInfo> infos_;
         private RepeatedFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> infosBuilder_;
         private CommonMsg.ItemInfo item_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenTurnCard_13622.class, Builder.class);
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
            if (SkinActivityMsg.S2C_OpenTurnCard_13622.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.isHaveLuck_ = false;
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.bitField0_ &= -3;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infosBuilder_.clear();
            }

            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -9;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_OpenTurnCard_13622_descriptor;
         }

         public S2C_OpenTurnCard_13622 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_OpenTurnCard_13622.getDefaultInstance();
         }

         public S2C_OpenTurnCard_13622 build() {
            S2C_OpenTurnCard_13622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenTurnCard_13622 buildPartial() {
            S2C_OpenTurnCard_13622 result = new S2C_OpenTurnCard_13622(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isHaveLuck_ = this.isHaveLuck_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 2;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -5;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (CommonMsg.ItemInfo)this.itemBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_OpenTurnCard_13622) {
               return this.mergeFrom((S2C_OpenTurnCard_13622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenTurnCard_13622 other) {
            if (other == SkinActivityMsg.S2C_OpenTurnCard_13622.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsHaveLuck()) {
                  this.setIsHaveLuck(other.getIsHaveLuck());
               }

               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.infosBuilder_ = SkinActivityMsg.S2C_OpenTurnCard_13622.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsHaveLuck()) {
               return false;
            } else if (!this.hasRound()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasItem() && !this.getItem().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenTurnCard_13622 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenTurnCard_13622)SkinActivityMsg.S2C_OpenTurnCard_13622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenTurnCard_13622)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsHaveLuck() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsHaveLuck() {
            return this.isHaveLuck_;
         }

         public Builder setIsHaveLuck(boolean value) {
            this.bitField0_ |= 1;
            this.isHaveLuck_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveLuck() {
            this.bitField0_ &= -2;
            this.isHaveLuck_ = false;
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

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 4;
            }

         }

         public List<CardInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CardInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CardInfo)this.infos_.get(index) : (CardInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CardInfo value) {
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

         public Builder setInfos(int index, CardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CardInfo value) {
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

         public Builder addInfos(int index, CardInfo value) {
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

         public Builder addInfos(CardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CardInfo> values) {
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
               this.bitField0_ &= -5;
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

         public CardInfo.Builder getInfosBuilder(int index) {
            return (CardInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CardInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CardInfoOrBuilder)this.infos_.get(index) : (CardInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CardInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CardInfo.Builder addInfosBuilder() {
            return (CardInfo.Builder)this.getInfosFieldBuilder().addBuilder(SkinActivityMsg.CardInfo.getDefaultInstance());
         }

         public CardInfo.Builder addInfosBuilder(int index) {
            return (CardInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, SkinActivityMsg.CardInfo.getDefaultInstance());
         }

         public List<CardInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.ItemInfo getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            } else {
               return (CommonMsg.ItemInfo)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.item_ = value;
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.item_ != null && this.item_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.item_ = CommonMsg.ItemInfo.newBuilder(this.item_).mergeFrom(value).buildPartial();
               } else {
                  this.item_ = value;
               }

               this.onChanged();
            } else {
               this.itemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = null;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 16;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -17;
            this.dailyDrawNum_ = 0;
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

   public static final class C2S_TurnCard_13623 extends GeneratedMessageV3 implements C2S_TurnCard_13623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      private byte memoizedIsInitialized;
      private static final C2S_TurnCard_13623 DEFAULT_INSTANCE = new C2S_TurnCard_13623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TurnCard_13623> PARSER = new AbstractParser<C2S_TurnCard_13623>() {
         public C2S_TurnCard_13623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TurnCard_13623(input, extensionRegistry);
         }
      };

      private C2S_TurnCard_13623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TurnCard_13623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TurnCard_13623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TurnCard_13623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurnCard_13623.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.index_);
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TurnCard_13623)) {
            return super.equals(obj);
         } else {
            C2S_TurnCard_13623 other = (C2S_TurnCard_13623)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
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
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TurnCard_13623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data);
      }

      public static C2S_TurnCard_13623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurnCard_13623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data);
      }

      public static C2S_TurnCard_13623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurnCard_13623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data);
      }

      public static C2S_TurnCard_13623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurnCard_13623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurnCard_13623 parseFrom(InputStream input) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurnCard_13623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurnCard_13623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TurnCard_13623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurnCard_13623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurnCard_13623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurnCard_13623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TurnCard_13623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TurnCard_13623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TurnCard_13623> parser() {
         return PARSER;
      }

      public Parser<C2S_TurnCard_13623> getParserForType() {
         return PARSER;
      }

      public C2S_TurnCard_13623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TurnCard_13623OrBuilder {
         private int bitField0_;
         private int index_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurnCard_13623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_TurnCard_13623.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_TurnCard_13623_descriptor;
         }

         public C2S_TurnCard_13623 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_TurnCard_13623.getDefaultInstance();
         }

         public C2S_TurnCard_13623 build() {
            C2S_TurnCard_13623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TurnCard_13623 buildPartial() {
            C2S_TurnCard_13623 result = new C2S_TurnCard_13623(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
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
            if (other instanceof C2S_TurnCard_13623) {
               return this.mergeFrom((C2S_TurnCard_13623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TurnCard_13623 other) {
            if (other == SkinActivityMsg.C2S_TurnCard_13623.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TurnCard_13623 parsedMessage = null;

            try {
               parsedMessage = (C2S_TurnCard_13623)SkinActivityMsg.C2S_TurnCard_13623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TurnCard_13623)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
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

   public static final class S2C_TurnCard_13624 extends GeneratedMessageV3 implements S2C_TurnCard_13624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ISLUCKREWARD_FIELD_NUMBER = 2;
      private boolean isLuckReward_;
      public static final int INFO_FIELD_NUMBER = 3;
      private CardInfo info_;
      public static final int ISRESET_FIELD_NUMBER = 4;
      private boolean isReset_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 5;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_TurnCard_13624 DEFAULT_INSTANCE = new S2C_TurnCard_13624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TurnCard_13624> PARSER = new AbstractParser<S2C_TurnCard_13624>() {
         public S2C_TurnCard_13624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TurnCard_13624(input, extensionRegistry);
         }
      };

      private S2C_TurnCard_13624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TurnCard_13624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TurnCard_13624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TurnCard_13624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isLuckReward_ = input.readBool();
                        break;
                     case 26:
                        CardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CardInfo)input.readMessage(SkinActivityMsg.CardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isReset_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.dailyDrawNum_ = input.readInt32();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurnCard_13624.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasIsLuckReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsLuckReward() {
         return this.isLuckReward_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public CardInfo getInfo() {
         return this.info_ == null ? SkinActivityMsg.CardInfo.getDefaultInstance() : this.info_;
      }

      public CardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? SkinActivityMsg.CardInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasIsReset() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsReset() {
         return this.isReset_;
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
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
         } else if (!this.hasIsLuckReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
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
            output.writeBool(2, this.isLuckReward_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getInfo());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isReset_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.dailyDrawNum_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isLuckReward_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getInfo());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isReset_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TurnCard_13624)) {
            return super.equals(obj);
         } else {
            S2C_TurnCard_13624 other = (S2C_TurnCard_13624)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasIsLuckReward() != other.hasIsLuckReward()) {
               return false;
            } else if (this.hasIsLuckReward() && this.getIsLuckReward() != other.getIsLuckReward()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasIsReset() != other.hasIsReset()) {
               return false;
            } else if (this.hasIsReset() && this.getIsReset() != other.getIsReset()) {
               return false;
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
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

            if (this.hasIsLuckReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsLuckReward());
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.hasIsReset()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsReset());
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TurnCard_13624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data);
      }

      public static S2C_TurnCard_13624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurnCard_13624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data);
      }

      public static S2C_TurnCard_13624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurnCard_13624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data);
      }

      public static S2C_TurnCard_13624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurnCard_13624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurnCard_13624 parseFrom(InputStream input) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurnCard_13624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurnCard_13624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TurnCard_13624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurnCard_13624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurnCard_13624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurnCard_13624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TurnCard_13624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TurnCard_13624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TurnCard_13624> parser() {
         return PARSER;
      }

      public Parser<S2C_TurnCard_13624> getParserForType() {
         return PARSER;
      }

      public S2C_TurnCard_13624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TurnCard_13624OrBuilder {
         private int bitField0_;
         private int result_;
         private boolean isLuckReward_;
         private CardInfo info_;
         private SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> infoBuilder_;
         private boolean isReset_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurnCard_13624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_TurnCard_13624.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.isLuckReward_ = false;
            this.bitField0_ &= -3;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.isReset_ = false;
            this.bitField0_ &= -9;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_TurnCard_13624_descriptor;
         }

         public S2C_TurnCard_13624 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_TurnCard_13624.getDefaultInstance();
         }

         public S2C_TurnCard_13624 build() {
            S2C_TurnCard_13624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TurnCard_13624 buildPartial() {
            S2C_TurnCard_13624 result = new S2C_TurnCard_13624(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isLuckReward_ = this.isLuckReward_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CardInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isReset_ = this.isReset_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_TurnCard_13624) {
               return this.mergeFrom((S2C_TurnCard_13624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TurnCard_13624 other) {
            if (other == SkinActivityMsg.S2C_TurnCard_13624.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasIsLuckReward()) {
                  this.setIsLuckReward(other.getIsLuckReward());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasIsReset()) {
                  this.setIsReset(other.getIsReset());
               }

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasIsLuckReward()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TurnCard_13624 parsedMessage = null;

            try {
               parsedMessage = (S2C_TurnCard_13624)SkinActivityMsg.S2C_TurnCard_13624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TurnCard_13624)e.getUnfinishedMessage();
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

         public boolean hasIsLuckReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsLuckReward() {
            return this.isLuckReward_;
         }

         public Builder setIsLuckReward(boolean value) {
            this.bitField0_ |= 2;
            this.isLuckReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsLuckReward() {
            this.bitField0_ &= -3;
            this.isLuckReward_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public CardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? SkinActivityMsg.CardInfo.getDefaultInstance() : this.info_;
            } else {
               return (CardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setInfo(CardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeInfo(CardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.info_ != null && this.info_ != SkinActivityMsg.CardInfo.getDefaultInstance()) {
                  this.info_ = SkinActivityMsg.CardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? SkinActivityMsg.CardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CardInfo, CardInfo.Builder, CardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasIsReset() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsReset() {
            return this.isReset_;
         }

         public Builder setIsReset(boolean value) {
            this.bitField0_ |= 8;
            this.isReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReset() {
            this.bitField0_ &= -9;
            this.isReset_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 16;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -17;
            this.dailyDrawNum_ = 0;
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

   public static final class C2S_ChoiceLuckReward_13625 extends GeneratedMessageV3 implements C2S_ChoiceLuckReward_13625OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDINDEX_FIELD_NUMBER = 1;
      private int awardIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_ChoiceLuckReward_13625 DEFAULT_INSTANCE = new C2S_ChoiceLuckReward_13625();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChoiceLuckReward_13625> PARSER = new AbstractParser<C2S_ChoiceLuckReward_13625>() {
         public C2S_ChoiceLuckReward_13625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChoiceLuckReward_13625(input, extensionRegistry);
         }
      };

      private C2S_ChoiceLuckReward_13625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChoiceLuckReward_13625() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChoiceLuckReward_13625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChoiceLuckReward_13625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.awardIndex_ = input.readInt32();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChoiceLuckReward_13625.class, Builder.class);
      }

      public boolean hasAwardIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAwardIndex() {
         return this.awardIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAwardIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.awardIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.awardIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChoiceLuckReward_13625)) {
            return super.equals(obj);
         } else {
            C2S_ChoiceLuckReward_13625 other = (C2S_ChoiceLuckReward_13625)obj;
            if (this.hasAwardIndex() != other.hasAwardIndex()) {
               return false;
            } else if (this.hasAwardIndex() && this.getAwardIndex() != other.getAwardIndex()) {
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
            if (this.hasAwardIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceLuckReward_13625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(InputStream input) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChoiceLuckReward_13625 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChoiceLuckReward_13625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChoiceLuckReward_13625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceLuckReward_13625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChoiceLuckReward_13625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChoiceLuckReward_13625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChoiceLuckReward_13625> parser() {
         return PARSER;
      }

      public Parser<C2S_ChoiceLuckReward_13625> getParserForType() {
         return PARSER;
      }

      public C2S_ChoiceLuckReward_13625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChoiceLuckReward_13625OrBuilder {
         private int bitField0_;
         private int awardIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChoiceLuckReward_13625.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_ChoiceLuckReward_13625.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.awardIndex_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_ChoiceLuckReward_13625_descriptor;
         }

         public C2S_ChoiceLuckReward_13625 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_ChoiceLuckReward_13625.getDefaultInstance();
         }

         public C2S_ChoiceLuckReward_13625 build() {
            C2S_ChoiceLuckReward_13625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChoiceLuckReward_13625 buildPartial() {
            C2S_ChoiceLuckReward_13625 result = new C2S_ChoiceLuckReward_13625(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.awardIndex_ = this.awardIndex_;
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
            if (other instanceof C2S_ChoiceLuckReward_13625) {
               return this.mergeFrom((C2S_ChoiceLuckReward_13625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChoiceLuckReward_13625 other) {
            if (other == SkinActivityMsg.C2S_ChoiceLuckReward_13625.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAwardIndex()) {
                  this.setAwardIndex(other.getAwardIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAwardIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChoiceLuckReward_13625 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChoiceLuckReward_13625)SkinActivityMsg.C2S_ChoiceLuckReward_13625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChoiceLuckReward_13625)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAwardIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAwardIndex() {
            return this.awardIndex_;
         }

         public Builder setAwardIndex(int value) {
            this.bitField0_ |= 1;
            this.awardIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardIndex() {
            this.bitField0_ &= -2;
            this.awardIndex_ = 0;
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

   public static final class S2C_ChoiceLuckReward_13626 extends GeneratedMessageV3 implements S2C_ChoiceLuckReward_13626OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo item_;
      private byte memoizedIsInitialized;
      private static final S2C_ChoiceLuckReward_13626 DEFAULT_INSTANCE = new S2C_ChoiceLuckReward_13626();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChoiceLuckReward_13626> PARSER = new AbstractParser<S2C_ChoiceLuckReward_13626>() {
         public S2C_ChoiceLuckReward_13626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChoiceLuckReward_13626(input, extensionRegistry);
         }
      };

      private S2C_ChoiceLuckReward_13626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChoiceLuckReward_13626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChoiceLuckReward_13626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChoiceLuckReward_13626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChoiceLuckReward_13626.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getItem() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
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
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getItem().isInitialized()) {
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
            output.writeMessage(2, this.getItem());
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
               size += CodedOutputStream.computeMessageSize(2, this.getItem());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChoiceLuckReward_13626)) {
            return super.equals(obj);
         } else {
            S2C_ChoiceLuckReward_13626 other = (S2C_ChoiceLuckReward_13626)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
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

            if (this.hasItem()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItem().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceLuckReward_13626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(InputStream input) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChoiceLuckReward_13626 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChoiceLuckReward_13626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChoiceLuckReward_13626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceLuckReward_13626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChoiceLuckReward_13626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChoiceLuckReward_13626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChoiceLuckReward_13626> parser() {
         return PARSER;
      }

      public Parser<S2C_ChoiceLuckReward_13626> getParserForType() {
         return PARSER;
      }

      public S2C_ChoiceLuckReward_13626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChoiceLuckReward_13626OrBuilder {
         private int bitField0_;
         private int result_;
         private CommonMsg.ItemInfo item_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChoiceLuckReward_13626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_ChoiceLuckReward_13626.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_ChoiceLuckReward_13626_descriptor;
         }

         public S2C_ChoiceLuckReward_13626 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_ChoiceLuckReward_13626.getDefaultInstance();
         }

         public S2C_ChoiceLuckReward_13626 build() {
            S2C_ChoiceLuckReward_13626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChoiceLuckReward_13626 buildPartial() {
            S2C_ChoiceLuckReward_13626 result = new S2C_ChoiceLuckReward_13626(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (CommonMsg.ItemInfo)this.itemBuilder_.build();
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
            if (other instanceof S2C_ChoiceLuckReward_13626) {
               return this.mergeFrom((S2C_ChoiceLuckReward_13626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChoiceLuckReward_13626 other) {
            if (other == SkinActivityMsg.S2C_ChoiceLuckReward_13626.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else {
               return this.getItem().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChoiceLuckReward_13626 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChoiceLuckReward_13626)SkinActivityMsg.S2C_ChoiceLuckReward_13626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChoiceLuckReward_13626)e.getUnfinishedMessage();
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

         public boolean hasItem() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            } else {
               return (CommonMsg.ItemInfo)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.item_ = value;
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.item_ != null && this.item_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.item_ = CommonMsg.ItemInfo.newBuilder(this.item_).mergeFrom(value).buildPartial();
               } else {
                  this.item_ = value;
               }

               this.onChanged();
            } else {
               this.itemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = null;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CommitTask_13651 extends GeneratedMessageV3 implements C2S_CommitTask_13651OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_13651 DEFAULT_INSTANCE = new C2S_CommitTask_13651();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_13651> PARSER = new AbstractParser<C2S_CommitTask_13651>() {
         public C2S_CommitTask_13651 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_13651(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_13651(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_13651() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_13651();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_13651(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13651.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_13651)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_13651 other = (C2S_CommitTask_13651)obj;
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

      public static C2S_CommitTask_13651 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13651 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13651 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13651 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13651 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13651 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13651 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13651 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13651 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13651 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13651 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13651 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_13651 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_13651 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_13651> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_13651> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_13651 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_13651OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13651.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_CommitTask_13651.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_CommitTask_13651_descriptor;
         }

         public C2S_CommitTask_13651 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_CommitTask_13651.getDefaultInstance();
         }

         public C2S_CommitTask_13651 build() {
            C2S_CommitTask_13651 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_13651 buildPartial() {
            C2S_CommitTask_13651 result = new C2S_CommitTask_13651(this);
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
            if (other instanceof C2S_CommitTask_13651) {
               return this.mergeFrom((C2S_CommitTask_13651)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_13651 other) {
            if (other == SkinActivityMsg.C2S_CommitTask_13651.getDefaultInstance()) {
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
            C2S_CommitTask_13651 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_13651)SkinActivityMsg.C2S_CommitTask_13651.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_13651)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_13652 extends GeneratedMessageV3 implements S2C_CommitTask_13652OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_13652 DEFAULT_INSTANCE = new S2C_CommitTask_13652();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_13652> PARSER = new AbstractParser<S2C_CommitTask_13652>() {
         public S2C_CommitTask_13652 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_13652(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_13652(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_13652() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_13652();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_13652(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13652.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_13652)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_13652 other = (S2C_CommitTask_13652)obj;
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

      public static S2C_CommitTask_13652 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13652 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13652 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13652 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13652 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13652 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13652 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13652 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13652 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13652 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13652 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13652 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_13652 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_13652 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_13652> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_13652> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_13652 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_13652OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13652.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.S2C_CommitTask_13652.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_CommitTask_13652_descriptor;
         }

         public S2C_CommitTask_13652 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_CommitTask_13652.getDefaultInstance();
         }

         public S2C_CommitTask_13652 build() {
            S2C_CommitTask_13652 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_13652 buildPartial() {
            S2C_CommitTask_13652 result = new S2C_CommitTask_13652(this);
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
            if (other instanceof S2C_CommitTask_13652) {
               return this.mergeFrom((S2C_CommitTask_13652)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_13652 other) {
            if (other == SkinActivityMsg.S2C_CommitTask_13652.getDefaultInstance()) {
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
            S2C_CommitTask_13652 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_13652)SkinActivityMsg.S2C_CommitTask_13652.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_13652)e.getUnfinishedMessage();
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

   public static final class C2S_SkinAvtivityTasks_13653 extends GeneratedMessageV3 implements C2S_SkinAvtivityTasks_13653OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SkinAvtivityTasks_13653 DEFAULT_INSTANCE = new C2S_SkinAvtivityTasks_13653();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkinAvtivityTasks_13653> PARSER = new AbstractParser<C2S_SkinAvtivityTasks_13653>() {
         public C2S_SkinAvtivityTasks_13653 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkinAvtivityTasks_13653(input, extensionRegistry);
         }
      };

      private C2S_SkinAvtivityTasks_13653(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkinAvtivityTasks_13653() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkinAvtivityTasks_13653();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkinAvtivityTasks_13653(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkinAvtivityTasks_13653.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SkinAvtivityTasks_13653)) {
            return super.equals(obj);
         } else {
            C2S_SkinAvtivityTasks_13653 other = (C2S_SkinAvtivityTasks_13653)obj;
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

      public static C2S_SkinAvtivityTasks_13653 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinAvtivityTasks_13653)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(InputStream input) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkinAvtivityTasks_13653 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkinAvtivityTasks_13653 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkinAvtivityTasks_13653 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinAvtivityTasks_13653)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkinAvtivityTasks_13653 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkinAvtivityTasks_13653 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkinAvtivityTasks_13653> parser() {
         return PARSER;
      }

      public Parser<C2S_SkinAvtivityTasks_13653> getParserForType() {
         return PARSER;
      }

      public C2S_SkinAvtivityTasks_13653 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkinAvtivityTasks_13653OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkinAvtivityTasks_13653.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SkinActivityMsg.C2S_SkinAvtivityTasks_13653.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_C2S_SkinAvtivityTasks_13653_descriptor;
         }

         public C2S_SkinAvtivityTasks_13653 getDefaultInstanceForType() {
            return SkinActivityMsg.C2S_SkinAvtivityTasks_13653.getDefaultInstance();
         }

         public C2S_SkinAvtivityTasks_13653 build() {
            C2S_SkinAvtivityTasks_13653 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkinAvtivityTasks_13653 buildPartial() {
            C2S_SkinAvtivityTasks_13653 result = new C2S_SkinAvtivityTasks_13653(this);
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
            if (other instanceof C2S_SkinAvtivityTasks_13653) {
               return this.mergeFrom((C2S_SkinAvtivityTasks_13653)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkinAvtivityTasks_13653 other) {
            if (other == SkinActivityMsg.C2S_SkinAvtivityTasks_13653.getDefaultInstance()) {
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
            C2S_SkinAvtivityTasks_13653 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkinAvtivityTasks_13653)SkinActivityMsg.C2S_SkinAvtivityTasks_13653.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkinAvtivityTasks_13653)e.getUnfinishedMessage();
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

   public static final class S2C_SkinAvtivityTasks_13654 extends GeneratedMessageV3 implements S2C_SkinAvtivityTasks_13654OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_SkinAvtivityTasks_13654 DEFAULT_INSTANCE = new S2C_SkinAvtivityTasks_13654();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkinAvtivityTasks_13654> PARSER = new AbstractParser<S2C_SkinAvtivityTasks_13654>() {
         public S2C_SkinAvtivityTasks_13654 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkinAvtivityTasks_13654(input, extensionRegistry);
         }
      };

      private S2C_SkinAvtivityTasks_13654(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkinAvtivityTasks_13654() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkinAvtivityTasks_13654();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkinAvtivityTasks_13654(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkinAvtivityTasks_13654.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SkinAvtivityTasks_13654)) {
            return super.equals(obj);
         } else {
            S2C_SkinAvtivityTasks_13654 other = (S2C_SkinAvtivityTasks_13654)obj;
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

      public static S2C_SkinAvtivityTasks_13654 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinAvtivityTasks_13654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(InputStream input) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkinAvtivityTasks_13654 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkinAvtivityTasks_13654 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkinAvtivityTasks_13654 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinAvtivityTasks_13654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkinAvtivityTasks_13654 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkinAvtivityTasks_13654 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkinAvtivityTasks_13654> parser() {
         return PARSER;
      }

      public Parser<S2C_SkinAvtivityTasks_13654> getParserForType() {
         return PARSER;
      }

      public S2C_SkinAvtivityTasks_13654 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkinAvtivityTasks_13654OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkinAvtivityTasks_13654.class, Builder.class);
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
            if (SkinActivityMsg.S2C_SkinAvtivityTasks_13654.alwaysUseFieldBuilders) {
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
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_SkinAvtivityTasks_13654_descriptor;
         }

         public S2C_SkinAvtivityTasks_13654 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_SkinAvtivityTasks_13654.getDefaultInstance();
         }

         public S2C_SkinAvtivityTasks_13654 build() {
            S2C_SkinAvtivityTasks_13654 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkinAvtivityTasks_13654 buildPartial() {
            S2C_SkinAvtivityTasks_13654 result = new S2C_SkinAvtivityTasks_13654(this);
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
            if (other instanceof S2C_SkinAvtivityTasks_13654) {
               return this.mergeFrom((S2C_SkinAvtivityTasks_13654)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkinAvtivityTasks_13654 other) {
            if (other == SkinActivityMsg.S2C_SkinAvtivityTasks_13654.getDefaultInstance()) {
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
                     this.taskBuilder_ = SkinActivityMsg.S2C_SkinAvtivityTasks_13654.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_SkinAvtivityTasks_13654 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkinAvtivityTasks_13654)SkinActivityMsg.S2C_SkinAvtivityTasks_13654.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkinAvtivityTasks_13654)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateTasks_13656 extends GeneratedMessageV3 implements S2C_UpdateTasks_13656OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTasks_13656 DEFAULT_INSTANCE = new S2C_UpdateTasks_13656();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTasks_13656> PARSER = new AbstractParser<S2C_UpdateTasks_13656>() {
         public S2C_UpdateTasks_13656 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTasks_13656(input, extensionRegistry);
         }
      };

      private S2C_UpdateTasks_13656(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTasks_13656() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTasks_13656();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTasks_13656(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_13656.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpdateTasks_13656)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTasks_13656 other = (S2C_UpdateTasks_13656)obj;
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

      public static S2C_UpdateTasks_13656 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13656 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13656 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13656 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13656 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_13656 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_13656)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_13656 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13656 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_13656 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13656 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_13656 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_13656 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_13656)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTasks_13656 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTasks_13656 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTasks_13656> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTasks_13656> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTasks_13656 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTasks_13656OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_13656.class, Builder.class);
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
            if (SkinActivityMsg.S2C_UpdateTasks_13656.alwaysUseFieldBuilders) {
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
            return SkinActivityMsg.internal_static_skinActivity_com_gzbz_protobuf_S2C_UpdateTasks_13656_descriptor;
         }

         public S2C_UpdateTasks_13656 getDefaultInstanceForType() {
            return SkinActivityMsg.S2C_UpdateTasks_13656.getDefaultInstance();
         }

         public S2C_UpdateTasks_13656 build() {
            S2C_UpdateTasks_13656 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTasks_13656 buildPartial() {
            S2C_UpdateTasks_13656 result = new S2C_UpdateTasks_13656(this);
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
            if (other instanceof S2C_UpdateTasks_13656) {
               return this.mergeFrom((S2C_UpdateTasks_13656)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTasks_13656 other) {
            if (other == SkinActivityMsg.S2C_UpdateTasks_13656.getDefaultInstance()) {
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
                     this.taskBuilder_ = SkinActivityMsg.S2C_UpdateTasks_13656.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_UpdateTasks_13656 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTasks_13656)SkinActivityMsg.S2C_UpdateTasks_13656.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTasks_13656)e.getUnfinishedMessage();
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

   public interface C2S_ChoiceLuckReward_13625OrBuilder extends MessageOrBuilder {
      boolean hasAwardIndex();

      int getAwardIndex();
   }

   public interface C2S_CommitTask_13651OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_MatchBattle_13611OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Mate_13603OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenActivityUi_13601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenTurnCard_13621OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PointReward_13607OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_SkinAvtivityTasks_13653OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TurnCard_13623OrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();
   }

   public interface CardInfoOrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_ChoiceLuckReward_13626OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItem();

      CommonMsg.ItemInfo getItem();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder();
   }

   public interface S2C_CommitTask_13652OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_MatchBattle_13612OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasFightNum();

      int getFightNum();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasTotalPoint();

      int getTotalPoint();
   }

   public interface S2C_Mate_13604OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();

      boolean hasArraying();

      CommonMsg.PlayerArrayingInfo getArraying();

      CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();
   }

   public interface S2C_OpenActivityUi_13602OrBuilder extends MessageOrBuilder {
      boolean hasFight();

      int getFight();

      boolean hasTotalDamage();

      long getTotalDamage();

      List<Integer> getFightRewardList();

      int getFightRewardCount();

      int getFightReward(int index);

      boolean hasTotalPoint();

      int getTotalPoint();

      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);
   }

   public interface S2C_OpenTurnCard_13622OrBuilder extends MessageOrBuilder {
      boolean hasIsHaveLuck();

      boolean getIsHaveLuck();

      boolean hasRound();

      int getRound();

      List<CardInfo> getInfosList();

      CardInfo getInfos(int index);

      int getInfosCount();

      List<? extends CardInfoOrBuilder> getInfosOrBuilderList();

      CardInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasItem();

      CommonMsg.ItemInfo getItem();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_PointReward_13608OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_SkinAvtivityTasks_13654OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TurnCard_13624OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasIsLuckReward();

      boolean getIsLuckReward();

      boolean hasInfo();

      CardInfo getInfo();

      CardInfoOrBuilder getInfoOrBuilder();

      boolean hasIsReset();

      boolean getIsReset();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_UpdateTasks_13656OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
