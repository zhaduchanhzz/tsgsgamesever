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

public final class CrossDuelMsg {
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossDuelMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fCrossDuel.proto\u0012\u001bcrossDuel.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u0010DuelBattle.proto\"\u0015\n\u0013S2CR_DuelMain_15701\"Ð\u0001\n\u0013CR2S_DuelMain_15702\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0003\u0012\u000e\n\u0006season\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bstageStatus\u0018\u0005 \u0002(\u0005\u0012\u0015\n\rprevStartTime\u0018\u0006 \u0002(\u0003\u0012\u0013\n\u000bprevEndTime\u0018\u0007 \u0002(\u0003\u0012\u0011\n\tpassRound\u0018\b \u0001(\u0005\u0012\u0011\n\tpassState\u0018\t \u0001(\u0005\u0012\u000f\n\u0007isGroup\u0018\n \u0001(\b\"B\n\u0018S2CR_GodChoiceHero_15703\u0012&\n\u000bheroUpCount\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"+\n\u0016S2CR_DuelHistory_15704\u0012\u0011\n\ttodayLike\u0018\u0001 \u0003(\u0003\">\n\u001aS2CR_DuelHistoryLike_15705\u0012\u000e\n\u0006season\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\"2\n\u001dS2CR_DuelTopWorshipList_15706\u0012\u0011\n\ttodayLike\u0018\u0001 \u0003(\u0003\"8\n\u0019S2CR_DuelTopWorship_15707\u0012\r\n\u0005group\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004zone\u0018\u0002 \u0002(\u0005\"*\n\u0018CR2S_GodChoiceHero_15710\u0012\u000e\n\u0006heroId\u0018\u0001 \u0003(\u0005\"%\n\u0015CR2S_BossSettle_15712\u0012\f\n\u0004isGm\u0018\u0001 \u0002(\b\"\u0017\n\u0015S2CR_BossSettle_15713\"%\n\u0014S2CR_EnterDuel_15714\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\"m\n\u001aCR2S_StageSettleInfo_15715\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\u00122\n\btopThree\u0018\u0003 \u0003(\u000b2 .duel.com.gzbz.protobuf.RankInfo\"U\n\u0017S2S_SendRankAward_15730\u0012\u000f\n\u0007awardId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005medal\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004type\u0018\u0004 \u0001(\u0005\"/\n\u001bS2S_NotifyDelResource_15731\u0012\u0010\n\bwagerInx\u0018\u0001 \u0002(\u0005\"@\n\u0018S2S_SendGuessAward_15732\u0012\u0010\n\bwagerInx\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nawardTypes\u0018\u0002 \u0003(\u0005\"Q\n\u0016S2S_sendBossRank_15733\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tbossPoint\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eserialChampion\u0018\u0003 \u0002(\u0005\"S\n\u0016S2S_sendArraying_15734\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u0010\n\barraying\u0018\u0002 \u0002(\f\"\u0018\n\u0016S2S_PlayerLogout_15738\"\u001f\n\u000fS2S_sendGm_4599\u0012\f\n\u0004gmOp\u0018\u0001 \u0002(\u0005\".\n\u001aCR2S_EnterZonePlayer_15739\u0012\u0010\n\bplayerId\u0018\u0001 \u0003(\u0005B#\n\u0011com.gzbz.protobufB\fCrossDuelMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), DuelBattleMsg.getDescriptor()});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor, new String[0]);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor, new String[]{"StartTime", "EndTime", "Season", "Stage", "StageStatus", "PrevStartTime", "PrevEndTime", "PassRound", "PassState", "IsGroup"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor, new String[]{"HeroUpCount"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor, new String[]{"TodayLike"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor, new String[]{"Season", "PlayerId"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor, new String[]{"TodayLike"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor, new String[]{"Group", "Zone"});
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor, new String[]{"HeroId"});
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor, new String[]{"IsGm"});
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor, new String[0]);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor, new String[]{"Stage"});
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor, new String[]{"Stage", "Rank", "TopThree"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor, new String[]{"AwardId", "Rank", "Medal", "Type"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor, new String[]{"WagerInx"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor, new String[]{"WagerInx", "AwardTypes"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor, new String[]{"Rank", "BossPoint", "SerialChampion"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor, new String[]{"ArrayingType", "Arraying"});
      internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor, new String[0]);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor, new String[]{"GmOp"});
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor, new String[]{"PlayerId"});
      CommonMsg.getDescriptor();
      DuelBattleMsg.getDescriptor();
   }

   public static final class S2CR_DuelMain_15701 extends GeneratedMessageV3 implements S2CR_DuelMain_15701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_DuelMain_15701 DEFAULT_INSTANCE = new S2CR_DuelMain_15701();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DuelMain_15701> PARSER = new AbstractParser<S2CR_DuelMain_15701>() {
         public S2CR_DuelMain_15701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DuelMain_15701(input, extensionRegistry);
         }
      };

      private S2CR_DuelMain_15701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DuelMain_15701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DuelMain_15701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DuelMain_15701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelMain_15701.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_DuelMain_15701)) {
            return super.equals(obj);
         } else {
            S2CR_DuelMain_15701 other = (S2CR_DuelMain_15701)obj;
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

      public static S2CR_DuelMain_15701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data);
      }

      public static S2CR_DuelMain_15701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelMain_15701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data);
      }

      public static S2CR_DuelMain_15701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelMain_15701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data);
      }

      public static S2CR_DuelMain_15701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelMain_15701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelMain_15701 parseFrom(InputStream input) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelMain_15701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelMain_15701 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DuelMain_15701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelMain_15701 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelMain_15701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelMain_15701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DuelMain_15701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DuelMain_15701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DuelMain_15701> parser() {
         return PARSER;
      }

      public Parser<S2CR_DuelMain_15701> getParserForType() {
         return PARSER;
      }

      public S2CR_DuelMain_15701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DuelMain_15701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelMain_15701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_DuelMain_15701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelMain_15701_descriptor;
         }

         public S2CR_DuelMain_15701 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_DuelMain_15701.getDefaultInstance();
         }

         public S2CR_DuelMain_15701 build() {
            S2CR_DuelMain_15701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DuelMain_15701 buildPartial() {
            S2CR_DuelMain_15701 result = new S2CR_DuelMain_15701(this);
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
            if (other instanceof S2CR_DuelMain_15701) {
               return this.mergeFrom((S2CR_DuelMain_15701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DuelMain_15701 other) {
            if (other == CrossDuelMsg.S2CR_DuelMain_15701.getDefaultInstance()) {
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
            S2CR_DuelMain_15701 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DuelMain_15701)CrossDuelMsg.S2CR_DuelMain_15701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DuelMain_15701)e.getUnfinishedMessage();
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

   public static final class CR2S_DuelMain_15702 extends GeneratedMessageV3 implements CR2S_DuelMain_15702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private long startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private long endTime_;
      public static final int SEASON_FIELD_NUMBER = 3;
      private int season_;
      public static final int STAGE_FIELD_NUMBER = 4;
      private int stage_;
      public static final int STAGESTATUS_FIELD_NUMBER = 5;
      private int stageStatus_;
      public static final int PREVSTARTTIME_FIELD_NUMBER = 6;
      private long prevStartTime_;
      public static final int PREVENDTIME_FIELD_NUMBER = 7;
      private long prevEndTime_;
      public static final int PASSROUND_FIELD_NUMBER = 8;
      private int passRound_;
      public static final int PASSSTATE_FIELD_NUMBER = 9;
      private int passState_;
      public static final int ISGROUP_FIELD_NUMBER = 10;
      private boolean isGroup_;
      private byte memoizedIsInitialized;
      private static final CR2S_DuelMain_15702 DEFAULT_INSTANCE = new CR2S_DuelMain_15702();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DuelMain_15702> PARSER = new AbstractParser<CR2S_DuelMain_15702>() {
         public CR2S_DuelMain_15702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DuelMain_15702(input, extensionRegistry);
         }
      };

      private CR2S_DuelMain_15702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DuelMain_15702() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DuelMain_15702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DuelMain_15702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.season_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.stage_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.stageStatus_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.prevStartTime_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.prevEndTime_ = input.readInt64();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.passRound_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.passState_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.isGroup_ = input.readBool();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DuelMain_15702.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public boolean hasSeason() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSeason() {
         return this.season_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasStageStatus() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStageStatus() {
         return this.stageStatus_;
      }

      public boolean hasPrevStartTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getPrevStartTime() {
         return this.prevStartTime_;
      }

      public boolean hasPrevEndTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getPrevEndTime() {
         return this.prevEndTime_;
      }

      public boolean hasPassRound() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getPassRound() {
         return this.passRound_;
      }

      public boolean hasPassState() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getPassState() {
         return this.passState_;
      }

      public boolean hasIsGroup() {
         return (this.bitField0_ & 512) != 0;
      }

      public boolean getIsGroup() {
         return this.isGroup_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeason()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrevStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrevEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.season_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.stage_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.stageStatus_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.prevStartTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(7, this.prevEndTime_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.passRound_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.passState_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeBool(10, this.isGroup_);
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
               size += CodedOutputStream.computeInt64Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.season_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.stage_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.stageStatus_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.prevStartTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.prevEndTime_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.passRound_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.passState_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeBoolSize(10, this.isGroup_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_DuelMain_15702)) {
            return super.equals(obj);
         } else {
            CR2S_DuelMain_15702 other = (CR2S_DuelMain_15702)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasSeason() != other.hasSeason()) {
               return false;
            } else if (this.hasSeason() && this.getSeason() != other.getSeason()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasStageStatus() != other.hasStageStatus()) {
               return false;
            } else if (this.hasStageStatus() && this.getStageStatus() != other.getStageStatus()) {
               return false;
            } else if (this.hasPrevStartTime() != other.hasPrevStartTime()) {
               return false;
            } else if (this.hasPrevStartTime() && this.getPrevStartTime() != other.getPrevStartTime()) {
               return false;
            } else if (this.hasPrevEndTime() != other.hasPrevEndTime()) {
               return false;
            } else if (this.hasPrevEndTime() && this.getPrevEndTime() != other.getPrevEndTime()) {
               return false;
            } else if (this.hasPassRound() != other.hasPassRound()) {
               return false;
            } else if (this.hasPassRound() && this.getPassRound() != other.getPassRound()) {
               return false;
            } else if (this.hasPassState() != other.hasPassState()) {
               return false;
            } else if (this.hasPassState() && this.getPassState() != other.getPassState()) {
               return false;
            } else if (this.hasIsGroup() != other.hasIsGroup()) {
               return false;
            } else if (this.hasIsGroup() && this.getIsGroup() != other.getIsGroup()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getStartTime());
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getEndTime());
            }

            if (this.hasSeason()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSeason();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasStageStatus()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStageStatus();
            }

            if (this.hasPrevStartTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPrevStartTime());
            }

            if (this.hasPrevEndTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getPrevEndTime());
            }

            if (this.hasPassRound()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPassRound();
            }

            if (this.hasPassState()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPassState();
            }

            if (this.hasIsGroup()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGroup());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_DuelMain_15702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data);
      }

      public static CR2S_DuelMain_15702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DuelMain_15702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data);
      }

      public static CR2S_DuelMain_15702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DuelMain_15702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data);
      }

      public static CR2S_DuelMain_15702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DuelMain_15702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DuelMain_15702 parseFrom(InputStream input) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DuelMain_15702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DuelMain_15702 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DuelMain_15702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DuelMain_15702 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DuelMain_15702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DuelMain_15702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DuelMain_15702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DuelMain_15702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DuelMain_15702> parser() {
         return PARSER;
      }

      public Parser<CR2S_DuelMain_15702> getParserForType() {
         return PARSER;
      }

      public CR2S_DuelMain_15702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DuelMain_15702OrBuilder {
         private int bitField0_;
         private long startTime_;
         private long endTime_;
         private int season_;
         private int stage_;
         private int stageStatus_;
         private long prevStartTime_;
         private long prevEndTime_;
         private int passRound_;
         private int passState_;
         private boolean isGroup_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DuelMain_15702.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.CR2S_DuelMain_15702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0L;
            this.bitField0_ &= -2;
            this.endTime_ = 0L;
            this.bitField0_ &= -3;
            this.season_ = 0;
            this.bitField0_ &= -5;
            this.stage_ = 0;
            this.bitField0_ &= -9;
            this.stageStatus_ = 0;
            this.bitField0_ &= -17;
            this.prevStartTime_ = 0L;
            this.bitField0_ &= -33;
            this.prevEndTime_ = 0L;
            this.bitField0_ &= -65;
            this.passRound_ = 0;
            this.bitField0_ &= -129;
            this.passState_ = 0;
            this.bitField0_ &= -257;
            this.isGroup_ = false;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_DuelMain_15702_descriptor;
         }

         public CR2S_DuelMain_15702 getDefaultInstanceForType() {
            return CrossDuelMsg.CR2S_DuelMain_15702.getDefaultInstance();
         }

         public CR2S_DuelMain_15702 build() {
            CR2S_DuelMain_15702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DuelMain_15702 buildPartial() {
            CR2S_DuelMain_15702 result = new CR2S_DuelMain_15702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.season_ = this.season_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.stageStatus_ = this.stageStatus_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.prevStartTime_ = this.prevStartTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.prevEndTime_ = this.prevEndTime_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.passRound_ = this.passRound_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.passState_ = this.passState_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.isGroup_ = this.isGroup_;
               to_bitField0_ |= 512;
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
            if (other instanceof CR2S_DuelMain_15702) {
               return this.mergeFrom((CR2S_DuelMain_15702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DuelMain_15702 other) {
            if (other == CrossDuelMsg.CR2S_DuelMain_15702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasSeason()) {
                  this.setSeason(other.getSeason());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasStageStatus()) {
                  this.setStageStatus(other.getStageStatus());
               }

               if (other.hasPrevStartTime()) {
                  this.setPrevStartTime(other.getPrevStartTime());
               }

               if (other.hasPrevEndTime()) {
                  this.setPrevEndTime(other.getPrevEndTime());
               }

               if (other.hasPassRound()) {
                  this.setPassRound(other.getPassRound());
               }

               if (other.hasPassState()) {
                  this.setPassState(other.getPassState());
               }

               if (other.hasIsGroup()) {
                  this.setIsGroup(other.getIsGroup());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasSeason()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else if (!this.hasStageStatus()) {
               return false;
            } else if (!this.hasPrevStartTime()) {
               return false;
            } else {
               return this.hasPrevEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_DuelMain_15702 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DuelMain_15702)CrossDuelMsg.CR2S_DuelMain_15702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DuelMain_15702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(long value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(long value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasSeason() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSeason() {
            return this.season_;
         }

         public Builder setSeason(int value) {
            this.bitField0_ |= 4;
            this.season_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeason() {
            this.bitField0_ &= -5;
            this.season_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 8;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -9;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageStatus() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStageStatus() {
            return this.stageStatus_;
         }

         public Builder setStageStatus(int value) {
            this.bitField0_ |= 16;
            this.stageStatus_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageStatus() {
            this.bitField0_ &= -17;
            this.stageStatus_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrevStartTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getPrevStartTime() {
            return this.prevStartTime_;
         }

         public Builder setPrevStartTime(long value) {
            this.bitField0_ |= 32;
            this.prevStartTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrevStartTime() {
            this.bitField0_ &= -33;
            this.prevStartTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPrevEndTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getPrevEndTime() {
            return this.prevEndTime_;
         }

         public Builder setPrevEndTime(long value) {
            this.bitField0_ |= 64;
            this.prevEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrevEndTime() {
            this.bitField0_ &= -65;
            this.prevEndTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPassRound() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getPassRound() {
            return this.passRound_;
         }

         public Builder setPassRound(int value) {
            this.bitField0_ |= 128;
            this.passRound_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassRound() {
            this.bitField0_ &= -129;
            this.passRound_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPassState() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPassState() {
            return this.passState_;
         }

         public Builder setPassState(int value) {
            this.bitField0_ |= 256;
            this.passState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassState() {
            this.bitField0_ &= -257;
            this.passState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsGroup() {
            return (this.bitField0_ & 512) != 0;
         }

         public boolean getIsGroup() {
            return this.isGroup_;
         }

         public Builder setIsGroup(boolean value) {
            this.bitField0_ |= 512;
            this.isGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGroup() {
            this.bitField0_ &= -513;
            this.isGroup_ = false;
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

   public static final class S2CR_GodChoiceHero_15703 extends GeneratedMessageV3 implements S2CR_GodChoiceHero_15703OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROUPCOUNT_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> heroUpCount_;
      private byte memoizedIsInitialized;
      private static final S2CR_GodChoiceHero_15703 DEFAULT_INSTANCE = new S2CR_GodChoiceHero_15703();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GodChoiceHero_15703> PARSER = new AbstractParser<S2CR_GodChoiceHero_15703>() {
         public S2CR_GodChoiceHero_15703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GodChoiceHero_15703(input, extensionRegistry);
         }
      };

      private S2CR_GodChoiceHero_15703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GodChoiceHero_15703() {
         this.memoizedIsInitialized = -1;
         this.heroUpCount_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GodChoiceHero_15703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GodChoiceHero_15703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroUpCount_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroUpCount_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.heroUpCount_ = Collections.unmodifiableList(this.heroUpCount_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GodChoiceHero_15703.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getHeroUpCountList() {
         return this.heroUpCount_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getHeroUpCountOrBuilderList() {
         return this.heroUpCount_;
      }

      public int getHeroUpCountCount() {
         return this.heroUpCount_.size();
      }

      public CommonMsg.MapDataII getHeroUpCount(int index) {
         return (CommonMsg.MapDataII)this.heroUpCount_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getHeroUpCountOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.heroUpCount_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getHeroUpCountCount(); ++i) {
               if (!this.getHeroUpCount(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.heroUpCount_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.heroUpCount_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.heroUpCount_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heroUpCount_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_GodChoiceHero_15703)) {
            return super.equals(obj);
         } else {
            S2CR_GodChoiceHero_15703 other = (S2CR_GodChoiceHero_15703)obj;
            if (!this.getHeroUpCountList().equals(other.getHeroUpCountList())) {
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
            if (this.getHeroUpCountCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroUpCountList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GodChoiceHero_15703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(InputStream input) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GodChoiceHero_15703 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GodChoiceHero_15703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GodChoiceHero_15703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GodChoiceHero_15703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GodChoiceHero_15703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GodChoiceHero_15703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GodChoiceHero_15703> parser() {
         return PARSER;
      }

      public Parser<S2CR_GodChoiceHero_15703> getParserForType() {
         return PARSER;
      }

      public S2CR_GodChoiceHero_15703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GodChoiceHero_15703OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> heroUpCount_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> heroUpCountBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GodChoiceHero_15703.class, Builder.class);
         }

         private Builder() {
            this.heroUpCount_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroUpCount_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_GodChoiceHero_15703.alwaysUseFieldBuilders) {
               this.getHeroUpCountFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroUpCountBuilder_ == null) {
               this.heroUpCount_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroUpCountBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_GodChoiceHero_15703_descriptor;
         }

         public S2CR_GodChoiceHero_15703 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_GodChoiceHero_15703.getDefaultInstance();
         }

         public S2CR_GodChoiceHero_15703 build() {
            S2CR_GodChoiceHero_15703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GodChoiceHero_15703 buildPartial() {
            S2CR_GodChoiceHero_15703 result = new S2CR_GodChoiceHero_15703(this);
            int from_bitField0_ = this.bitField0_;
            if (this.heroUpCountBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.heroUpCount_ = Collections.unmodifiableList(this.heroUpCount_);
                  this.bitField0_ &= -2;
               }

               result.heroUpCount_ = this.heroUpCount_;
            } else {
               result.heroUpCount_ = this.heroUpCountBuilder_.build();
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
            if (other instanceof S2CR_GodChoiceHero_15703) {
               return this.mergeFrom((S2CR_GodChoiceHero_15703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GodChoiceHero_15703 other) {
            if (other == CrossDuelMsg.S2CR_GodChoiceHero_15703.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroUpCountBuilder_ == null) {
                  if (!other.heroUpCount_.isEmpty()) {
                     if (this.heroUpCount_.isEmpty()) {
                        this.heroUpCount_ = other.heroUpCount_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHeroUpCountIsMutable();
                        this.heroUpCount_.addAll(other.heroUpCount_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroUpCount_.isEmpty()) {
                  if (this.heroUpCountBuilder_.isEmpty()) {
                     this.heroUpCountBuilder_.dispose();
                     this.heroUpCountBuilder_ = null;
                     this.heroUpCount_ = other.heroUpCount_;
                     this.bitField0_ &= -2;
                     this.heroUpCountBuilder_ = CrossDuelMsg.S2CR_GodChoiceHero_15703.alwaysUseFieldBuilders ? this.getHeroUpCountFieldBuilder() : null;
                  } else {
                     this.heroUpCountBuilder_.addAllMessages(other.heroUpCount_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getHeroUpCountCount(); ++i) {
               if (!this.getHeroUpCount(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_GodChoiceHero_15703 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GodChoiceHero_15703)CrossDuelMsg.S2CR_GodChoiceHero_15703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GodChoiceHero_15703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroUpCountIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroUpCount_ = new ArrayList(this.heroUpCount_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getHeroUpCountList() {
            return this.heroUpCountBuilder_ == null ? Collections.unmodifiableList(this.heroUpCount_) : this.heroUpCountBuilder_.getMessageList();
         }

         public int getHeroUpCountCount() {
            return this.heroUpCountBuilder_ == null ? this.heroUpCount_.size() : this.heroUpCountBuilder_.getCount();
         }

         public CommonMsg.MapDataII getHeroUpCount(int index) {
            return this.heroUpCountBuilder_ == null ? (CommonMsg.MapDataII)this.heroUpCount_.get(index) : (CommonMsg.MapDataII)this.heroUpCountBuilder_.getMessage(index);
         }

         public Builder setHeroUpCount(int index, CommonMsg.MapDataII value) {
            if (this.heroUpCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.set(index, value);
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroUpCount(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.heroUpCountBuilder_ == null) {
               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroUpCount(CommonMsg.MapDataII value) {
            if (this.heroUpCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.add(value);
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroUpCount(int index, CommonMsg.MapDataII value) {
            if (this.heroUpCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.add(index, value);
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroUpCount(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.heroUpCountBuilder_ == null) {
               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroUpCount(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.heroUpCountBuilder_ == null) {
               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroUpCount(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.heroUpCountBuilder_ == null) {
               this.ensureHeroUpCountIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroUpCount_);
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroUpCount() {
            if (this.heroUpCountBuilder_ == null) {
               this.heroUpCount_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroUpCount(int index) {
            if (this.heroUpCountBuilder_ == null) {
               this.ensureHeroUpCountIsMutable();
               this.heroUpCount_.remove(index);
               this.onChanged();
            } else {
               this.heroUpCountBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getHeroUpCountBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getHeroUpCountFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getHeroUpCountOrBuilder(int index) {
            return this.heroUpCountBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.heroUpCount_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.heroUpCountBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getHeroUpCountOrBuilderList() {
            return this.heroUpCountBuilder_ != null ? this.heroUpCountBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroUpCount_);
         }

         public CommonMsg.MapDataII.Builder addHeroUpCountBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getHeroUpCountFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addHeroUpCountBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getHeroUpCountFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getHeroUpCountBuilderList() {
            return this.getHeroUpCountFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getHeroUpCountFieldBuilder() {
            if (this.heroUpCountBuilder_ == null) {
               this.heroUpCountBuilder_ = new RepeatedFieldBuilderV3(this.heroUpCount_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.heroUpCount_ = null;
            }

            return this.heroUpCountBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_DuelHistory_15704 extends GeneratedMessageV3 implements S2CR_DuelHistory_15704OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TODAYLIKE_FIELD_NUMBER = 1;
      private Internal.LongList todayLike_;
      private byte memoizedIsInitialized;
      private static final S2CR_DuelHistory_15704 DEFAULT_INSTANCE = new S2CR_DuelHistory_15704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DuelHistory_15704> PARSER = new AbstractParser<S2CR_DuelHistory_15704>() {
         public S2CR_DuelHistory_15704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DuelHistory_15704(input, extensionRegistry);
         }
      };

      private S2CR_DuelHistory_15704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DuelHistory_15704() {
         this.memoizedIsInitialized = -1;
         this.todayLike_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DuelHistory_15704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DuelHistory_15704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.todayLike_ = newLongList();
                           mutable_bitField0_ |= 1;
                        }

                        this.todayLike_.addLong(input.readInt64());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.todayLike_ = newLongList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.todayLike_.addLong(input.readInt64());
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
                  this.todayLike_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelHistory_15704.class, Builder.class);
      }

      public List<Long> getTodayLikeList() {
         return this.todayLike_;
      }

      public int getTodayLikeCount() {
         return this.todayLike_.size();
      }

      public long getTodayLike(int index) {
         return this.todayLike_.getLong(index);
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
         for(int i = 0; i < this.todayLike_.size(); ++i) {
            output.writeInt64(1, this.todayLike_.getLong(i));
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

            for(int i = 0; i < this.todayLike_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.todayLike_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getTodayLikeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DuelHistory_15704)) {
            return super.equals(obj);
         } else {
            S2CR_DuelHistory_15704 other = (S2CR_DuelHistory_15704)obj;
            if (!this.getTodayLikeList().equals(other.getTodayLikeList())) {
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
            if (this.getTodayLikeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTodayLikeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DuelHistory_15704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistory_15704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistory_15704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistory_15704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistory_15704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistory_15704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistory_15704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistory_15704 parseFrom(InputStream input) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistory_15704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelHistory_15704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistory_15704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelHistory_15704 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistory_15704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistory_15704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DuelHistory_15704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DuelHistory_15704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DuelHistory_15704> parser() {
         return PARSER;
      }

      public Parser<S2CR_DuelHistory_15704> getParserForType() {
         return PARSER;
      }

      public S2CR_DuelHistory_15704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DuelHistory_15704OrBuilder {
         private int bitField0_;
         private Internal.LongList todayLike_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelHistory_15704.class, Builder.class);
         }

         private Builder() {
            this.todayLike_ = CrossDuelMsg.S2CR_DuelHistory_15704.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.todayLike_ = CrossDuelMsg.S2CR_DuelHistory_15704.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_DuelHistory_15704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.todayLike_ = CrossDuelMsg.S2CR_DuelHistory_15704.emptyLongList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistory_15704_descriptor;
         }

         public S2CR_DuelHistory_15704 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_DuelHistory_15704.getDefaultInstance();
         }

         public S2CR_DuelHistory_15704 build() {
            S2CR_DuelHistory_15704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DuelHistory_15704 buildPartial() {
            S2CR_DuelHistory_15704 result = new S2CR_DuelHistory_15704(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.todayLike_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.todayLike_ = this.todayLike_;
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
            if (other instanceof S2CR_DuelHistory_15704) {
               return this.mergeFrom((S2CR_DuelHistory_15704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DuelHistory_15704 other) {
            if (other == CrossDuelMsg.S2CR_DuelHistory_15704.getDefaultInstance()) {
               return this;
            } else {
               if (!other.todayLike_.isEmpty()) {
                  if (this.todayLike_.isEmpty()) {
                     this.todayLike_ = other.todayLike_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTodayLikeIsMutable();
                     this.todayLike_.addAll(other.todayLike_);
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
            S2CR_DuelHistory_15704 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DuelHistory_15704)CrossDuelMsg.S2CR_DuelHistory_15704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DuelHistory_15704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTodayLikeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.todayLike_ = CrossDuelMsg.S2CR_DuelHistory_15704.mutableCopy(this.todayLike_);
               this.bitField0_ |= 1;
            }

         }

         public List<Long> getTodayLikeList() {
            return (List<Long>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.todayLike_) : this.todayLike_);
         }

         public int getTodayLikeCount() {
            return this.todayLike_.size();
         }

         public long getTodayLike(int index) {
            return this.todayLike_.getLong(index);
         }

         public Builder setTodayLike(int index, long value) {
            this.ensureTodayLikeIsMutable();
            this.todayLike_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTodayLike(long value) {
            this.ensureTodayLikeIsMutable();
            this.todayLike_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTodayLike(Iterable<? extends Long> values) {
            this.ensureTodayLikeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.todayLike_);
            this.onChanged();
            return this;
         }

         public Builder clearTodayLike() {
            this.todayLike_ = CrossDuelMsg.S2CR_DuelHistory_15704.emptyLongList();
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

   public static final class S2CR_DuelHistoryLike_15705 extends GeneratedMessageV3 implements S2CR_DuelHistoryLike_15705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SEASON_FIELD_NUMBER = 1;
      private int season_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2CR_DuelHistoryLike_15705 DEFAULT_INSTANCE = new S2CR_DuelHistoryLike_15705();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DuelHistoryLike_15705> PARSER = new AbstractParser<S2CR_DuelHistoryLike_15705>() {
         public S2CR_DuelHistoryLike_15705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DuelHistoryLike_15705(input, extensionRegistry);
         }
      };

      private S2CR_DuelHistoryLike_15705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DuelHistoryLike_15705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DuelHistoryLike_15705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DuelHistoryLike_15705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.season_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelHistoryLike_15705.class, Builder.class);
      }

      public boolean hasSeason() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSeason() {
         return this.season_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasSeason()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.season_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.season_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DuelHistoryLike_15705)) {
            return super.equals(obj);
         } else {
            S2CR_DuelHistoryLike_15705 other = (S2CR_DuelHistoryLike_15705)obj;
            if (this.hasSeason() != other.hasSeason()) {
               return false;
            } else if (this.hasSeason() && this.getSeason() != other.getSeason()) {
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
            if (this.hasSeason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSeason();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelHistoryLike_15705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(InputStream input) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelHistoryLike_15705 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistoryLike_15705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelHistoryLike_15705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelHistoryLike_15705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DuelHistoryLike_15705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DuelHistoryLike_15705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DuelHistoryLike_15705> parser() {
         return PARSER;
      }

      public Parser<S2CR_DuelHistoryLike_15705> getParserForType() {
         return PARSER;
      }

      public S2CR_DuelHistoryLike_15705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DuelHistoryLike_15705OrBuilder {
         private int bitField0_;
         private int season_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelHistoryLike_15705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_DuelHistoryLike_15705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.season_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelHistoryLike_15705_descriptor;
         }

         public S2CR_DuelHistoryLike_15705 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_DuelHistoryLike_15705.getDefaultInstance();
         }

         public S2CR_DuelHistoryLike_15705 build() {
            S2CR_DuelHistoryLike_15705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DuelHistoryLike_15705 buildPartial() {
            S2CR_DuelHistoryLike_15705 result = new S2CR_DuelHistoryLike_15705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.season_ = this.season_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof S2CR_DuelHistoryLike_15705) {
               return this.mergeFrom((S2CR_DuelHistoryLike_15705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DuelHistoryLike_15705 other) {
            if (other == CrossDuelMsg.S2CR_DuelHistoryLike_15705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSeason()) {
                  this.setSeason(other.getSeason());
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
            if (!this.hasSeason()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_DuelHistoryLike_15705 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DuelHistoryLike_15705)CrossDuelMsg.S2CR_DuelHistoryLike_15705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DuelHistoryLike_15705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSeason() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSeason() {
            return this.season_;
         }

         public Builder setSeason(int value) {
            this.bitField0_ |= 1;
            this.season_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeason() {
            this.bitField0_ &= -2;
            this.season_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 2;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -3;
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

   public static final class S2CR_DuelTopWorshipList_15706 extends GeneratedMessageV3 implements S2CR_DuelTopWorshipList_15706OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TODAYLIKE_FIELD_NUMBER = 1;
      private Internal.LongList todayLike_;
      private byte memoizedIsInitialized;
      private static final S2CR_DuelTopWorshipList_15706 DEFAULT_INSTANCE = new S2CR_DuelTopWorshipList_15706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DuelTopWorshipList_15706> PARSER = new AbstractParser<S2CR_DuelTopWorshipList_15706>() {
         public S2CR_DuelTopWorshipList_15706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DuelTopWorshipList_15706(input, extensionRegistry);
         }
      };

      private S2CR_DuelTopWorshipList_15706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DuelTopWorshipList_15706() {
         this.memoizedIsInitialized = -1;
         this.todayLike_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DuelTopWorshipList_15706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DuelTopWorshipList_15706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.todayLike_ = newLongList();
                           mutable_bitField0_ |= 1;
                        }

                        this.todayLike_.addLong(input.readInt64());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.todayLike_ = newLongList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.todayLike_.addLong(input.readInt64());
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
                  this.todayLike_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelTopWorshipList_15706.class, Builder.class);
      }

      public List<Long> getTodayLikeList() {
         return this.todayLike_;
      }

      public int getTodayLikeCount() {
         return this.todayLike_.size();
      }

      public long getTodayLike(int index) {
         return this.todayLike_.getLong(index);
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
         for(int i = 0; i < this.todayLike_.size(); ++i) {
            output.writeInt64(1, this.todayLike_.getLong(i));
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

            for(int i = 0; i < this.todayLike_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.todayLike_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getTodayLikeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DuelTopWorshipList_15706)) {
            return super.equals(obj);
         } else {
            S2CR_DuelTopWorshipList_15706 other = (S2CR_DuelTopWorshipList_15706)obj;
            if (!this.getTodayLikeList().equals(other.getTodayLikeList())) {
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
            if (this.getTodayLikeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTodayLikeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorshipList_15706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(InputStream input) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelTopWorshipList_15706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorshipList_15706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorshipList_15706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorshipList_15706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DuelTopWorshipList_15706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DuelTopWorshipList_15706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DuelTopWorshipList_15706> parser() {
         return PARSER;
      }

      public Parser<S2CR_DuelTopWorshipList_15706> getParserForType() {
         return PARSER;
      }

      public S2CR_DuelTopWorshipList_15706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DuelTopWorshipList_15706OrBuilder {
         private int bitField0_;
         private Internal.LongList todayLike_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelTopWorshipList_15706.class, Builder.class);
         }

         private Builder() {
            this.todayLike_ = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.todayLike_ = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_DuelTopWorshipList_15706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.todayLike_ = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.emptyLongList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorshipList_15706_descriptor;
         }

         public S2CR_DuelTopWorshipList_15706 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_DuelTopWorshipList_15706.getDefaultInstance();
         }

         public S2CR_DuelTopWorshipList_15706 build() {
            S2CR_DuelTopWorshipList_15706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DuelTopWorshipList_15706 buildPartial() {
            S2CR_DuelTopWorshipList_15706 result = new S2CR_DuelTopWorshipList_15706(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.todayLike_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.todayLike_ = this.todayLike_;
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
            if (other instanceof S2CR_DuelTopWorshipList_15706) {
               return this.mergeFrom((S2CR_DuelTopWorshipList_15706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DuelTopWorshipList_15706 other) {
            if (other == CrossDuelMsg.S2CR_DuelTopWorshipList_15706.getDefaultInstance()) {
               return this;
            } else {
               if (!other.todayLike_.isEmpty()) {
                  if (this.todayLike_.isEmpty()) {
                     this.todayLike_ = other.todayLike_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTodayLikeIsMutable();
                     this.todayLike_.addAll(other.todayLike_);
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
            S2CR_DuelTopWorshipList_15706 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DuelTopWorshipList_15706)CrossDuelMsg.S2CR_DuelTopWorshipList_15706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DuelTopWorshipList_15706)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTodayLikeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.todayLike_ = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.mutableCopy(this.todayLike_);
               this.bitField0_ |= 1;
            }

         }

         public List<Long> getTodayLikeList() {
            return (List<Long>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.todayLike_) : this.todayLike_);
         }

         public int getTodayLikeCount() {
            return this.todayLike_.size();
         }

         public long getTodayLike(int index) {
            return this.todayLike_.getLong(index);
         }

         public Builder setTodayLike(int index, long value) {
            this.ensureTodayLikeIsMutable();
            this.todayLike_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTodayLike(long value) {
            this.ensureTodayLikeIsMutable();
            this.todayLike_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTodayLike(Iterable<? extends Long> values) {
            this.ensureTodayLikeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.todayLike_);
            this.onChanged();
            return this;
         }

         public Builder clearTodayLike() {
            this.todayLike_ = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.emptyLongList();
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

   public static final class S2CR_DuelTopWorship_15707 extends GeneratedMessageV3 implements S2CR_DuelTopWorship_15707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUP_FIELD_NUMBER = 1;
      private int group_;
      public static final int ZONE_FIELD_NUMBER = 2;
      private int zone_;
      private byte memoizedIsInitialized;
      private static final S2CR_DuelTopWorship_15707 DEFAULT_INSTANCE = new S2CR_DuelTopWorship_15707();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DuelTopWorship_15707> PARSER = new AbstractParser<S2CR_DuelTopWorship_15707>() {
         public S2CR_DuelTopWorship_15707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DuelTopWorship_15707(input, extensionRegistry);
         }
      };

      private S2CR_DuelTopWorship_15707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DuelTopWorship_15707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DuelTopWorship_15707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DuelTopWorship_15707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.group_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.zone_ = input.readInt32();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelTopWorship_15707.class, Builder.class);
      }

      public boolean hasGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroup() {
         return this.group_;
      }

      public boolean hasZone() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getZone() {
         return this.zone_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasZone()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.group_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.zone_);
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
               size += CodedOutputStream.computeInt32Size(1, this.group_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.zone_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DuelTopWorship_15707)) {
            return super.equals(obj);
         } else {
            S2CR_DuelTopWorship_15707 other = (S2CR_DuelTopWorship_15707)obj;
            if (this.hasGroup() != other.hasGroup()) {
               return false;
            } else if (this.hasGroup() && this.getGroup() != other.getGroup()) {
               return false;
            } else if (this.hasZone() != other.hasZone()) {
               return false;
            } else if (this.hasZone() && this.getZone() != other.getZone()) {
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
            if (this.hasGroup()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroup();
            }

            if (this.hasZone()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getZone();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DuelTopWorship_15707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(InputStream input) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelTopWorship_15707 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorship_15707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DuelTopWorship_15707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DuelTopWorship_15707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DuelTopWorship_15707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DuelTopWorship_15707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DuelTopWorship_15707> parser() {
         return PARSER;
      }

      public Parser<S2CR_DuelTopWorship_15707> getParserForType() {
         return PARSER;
      }

      public S2CR_DuelTopWorship_15707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DuelTopWorship_15707OrBuilder {
         private int bitField0_;
         private int group_;
         private int zone_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DuelTopWorship_15707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_DuelTopWorship_15707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.group_ = 0;
            this.bitField0_ &= -2;
            this.zone_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_DuelTopWorship_15707_descriptor;
         }

         public S2CR_DuelTopWorship_15707 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_DuelTopWorship_15707.getDefaultInstance();
         }

         public S2CR_DuelTopWorship_15707 build() {
            S2CR_DuelTopWorship_15707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DuelTopWorship_15707 buildPartial() {
            S2CR_DuelTopWorship_15707 result = new S2CR_DuelTopWorship_15707(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.group_ = this.group_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.zone_ = this.zone_;
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
            if (other instanceof S2CR_DuelTopWorship_15707) {
               return this.mergeFrom((S2CR_DuelTopWorship_15707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DuelTopWorship_15707 other) {
            if (other == CrossDuelMsg.S2CR_DuelTopWorship_15707.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroup()) {
                  this.setGroup(other.getGroup());
               }

               if (other.hasZone()) {
                  this.setZone(other.getZone());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGroup()) {
               return false;
            } else {
               return this.hasZone();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_DuelTopWorship_15707 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DuelTopWorship_15707)CrossDuelMsg.S2CR_DuelTopWorship_15707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DuelTopWorship_15707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroup() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroup() {
            return this.group_;
         }

         public Builder setGroup(int value) {
            this.bitField0_ |= 1;
            this.group_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroup() {
            this.bitField0_ &= -2;
            this.group_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasZone() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getZone() {
            return this.zone_;
         }

         public Builder setZone(int value) {
            this.bitField0_ |= 2;
            this.zone_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearZone() {
            this.bitField0_ &= -3;
            this.zone_ = 0;
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

   public static final class CR2S_GodChoiceHero_15710 extends GeneratedMessageV3 implements CR2S_GodChoiceHero_15710OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROID_FIELD_NUMBER = 1;
      private Internal.IntList heroId_;
      private byte memoizedIsInitialized;
      private static final CR2S_GodChoiceHero_15710 DEFAULT_INSTANCE = new CR2S_GodChoiceHero_15710();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GodChoiceHero_15710> PARSER = new AbstractParser<CR2S_GodChoiceHero_15710>() {
         public CR2S_GodChoiceHero_15710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GodChoiceHero_15710(input, extensionRegistry);
         }
      };

      private CR2S_GodChoiceHero_15710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GodChoiceHero_15710() {
         this.memoizedIsInitialized = -1;
         this.heroId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GodChoiceHero_15710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GodChoiceHero_15710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroId_.addInt(input.readInt32());
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
                  this.heroId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GodChoiceHero_15710.class, Builder.class);
      }

      public List<Integer> getHeroIdList() {
         return this.heroId_;
      }

      public int getHeroIdCount() {
         return this.heroId_.size();
      }

      public int getHeroId(int index) {
         return this.heroId_.getInt(index);
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
         for(int i = 0; i < this.heroId_.size(); ++i) {
            output.writeInt32(1, this.heroId_.getInt(i));
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

            for(int i = 0; i < this.heroId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GodChoiceHero_15710)) {
            return super.equals(obj);
         } else {
            CR2S_GodChoiceHero_15710 other = (CR2S_GodChoiceHero_15710)obj;
            if (!this.getHeroIdList().equals(other.getHeroIdList())) {
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
            if (this.getHeroIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GodChoiceHero_15710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(InputStream input) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GodChoiceHero_15710 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GodChoiceHero_15710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GodChoiceHero_15710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GodChoiceHero_15710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GodChoiceHero_15710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GodChoiceHero_15710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GodChoiceHero_15710> parser() {
         return PARSER;
      }

      public Parser<CR2S_GodChoiceHero_15710> getParserForType() {
         return PARSER;
      }

      public CR2S_GodChoiceHero_15710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GodChoiceHero_15710OrBuilder {
         private int bitField0_;
         private Internal.IntList heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GodChoiceHero_15710.class, Builder.class);
         }

         private Builder() {
            this.heroId_ = CrossDuelMsg.CR2S_GodChoiceHero_15710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroId_ = CrossDuelMsg.CR2S_GodChoiceHero_15710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.CR2S_GodChoiceHero_15710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = CrossDuelMsg.CR2S_GodChoiceHero_15710.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_GodChoiceHero_15710_descriptor;
         }

         public CR2S_GodChoiceHero_15710 getDefaultInstanceForType() {
            return CrossDuelMsg.CR2S_GodChoiceHero_15710.getDefaultInstance();
         }

         public CR2S_GodChoiceHero_15710 build() {
            CR2S_GodChoiceHero_15710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GodChoiceHero_15710 buildPartial() {
            CR2S_GodChoiceHero_15710 result = new CR2S_GodChoiceHero_15710(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.heroId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.heroId_ = this.heroId_;
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
            if (other instanceof CR2S_GodChoiceHero_15710) {
               return this.mergeFrom((CR2S_GodChoiceHero_15710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GodChoiceHero_15710 other) {
            if (other == CrossDuelMsg.CR2S_GodChoiceHero_15710.getDefaultInstance()) {
               return this;
            } else {
               if (!other.heroId_.isEmpty()) {
                  if (this.heroId_.isEmpty()) {
                     this.heroId_ = other.heroId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHeroIdIsMutable();
                     this.heroId_.addAll(other.heroId_);
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
            CR2S_GodChoiceHero_15710 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GodChoiceHero_15710)CrossDuelMsg.CR2S_GodChoiceHero_15710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GodChoiceHero_15710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroId_ = CrossDuelMsg.CR2S_GodChoiceHero_15710.mutableCopy(this.heroId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHeroIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.heroId_) : this.heroId_);
         }

         public int getHeroIdCount() {
            return this.heroId_.size();
         }

         public int getHeroId(int index) {
            return this.heroId_.getInt(index);
         }

         public Builder setHeroId(int index, int value) {
            this.ensureHeroIdIsMutable();
            this.heroId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroId(int value) {
            this.ensureHeroIdIsMutable();
            this.heroId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroId(Iterable<? extends Integer> values) {
            this.ensureHeroIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroId_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.heroId_ = CrossDuelMsg.CR2S_GodChoiceHero_15710.emptyIntList();
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

   public static final class CR2S_BossSettle_15712 extends GeneratedMessageV3 implements CR2S_BossSettle_15712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISGM_FIELD_NUMBER = 1;
      private boolean isGm_;
      private byte memoizedIsInitialized;
      private static final CR2S_BossSettle_15712 DEFAULT_INSTANCE = new CR2S_BossSettle_15712();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BossSettle_15712> PARSER = new AbstractParser<CR2S_BossSettle_15712>() {
         public CR2S_BossSettle_15712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BossSettle_15712(input, extensionRegistry);
         }
      };

      private CR2S_BossSettle_15712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BossSettle_15712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BossSettle_15712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BossSettle_15712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isGm_ = input.readBool();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BossSettle_15712.class, Builder.class);
      }

      public boolean hasIsGm() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsGm() {
         return this.isGm_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsGm()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isGm_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isGm_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BossSettle_15712)) {
            return super.equals(obj);
         } else {
            CR2S_BossSettle_15712 other = (CR2S_BossSettle_15712)obj;
            if (this.hasIsGm() != other.hasIsGm()) {
               return false;
            } else if (this.hasIsGm() && this.getIsGm() != other.getIsGm()) {
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
            if (this.hasIsGm()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGm());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BossSettle_15712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data);
      }

      public static CR2S_BossSettle_15712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BossSettle_15712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data);
      }

      public static CR2S_BossSettle_15712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BossSettle_15712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data);
      }

      public static CR2S_BossSettle_15712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BossSettle_15712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BossSettle_15712 parseFrom(InputStream input) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BossSettle_15712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BossSettle_15712 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BossSettle_15712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BossSettle_15712 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BossSettle_15712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BossSettle_15712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BossSettle_15712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BossSettle_15712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BossSettle_15712> parser() {
         return PARSER;
      }

      public Parser<CR2S_BossSettle_15712> getParserForType() {
         return PARSER;
      }

      public CR2S_BossSettle_15712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BossSettle_15712OrBuilder {
         private int bitField0_;
         private boolean isGm_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BossSettle_15712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.CR2S_BossSettle_15712.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isGm_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_BossSettle_15712_descriptor;
         }

         public CR2S_BossSettle_15712 getDefaultInstanceForType() {
            return CrossDuelMsg.CR2S_BossSettle_15712.getDefaultInstance();
         }

         public CR2S_BossSettle_15712 build() {
            CR2S_BossSettle_15712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BossSettle_15712 buildPartial() {
            CR2S_BossSettle_15712 result = new CR2S_BossSettle_15712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isGm_ = this.isGm_;
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
            if (other instanceof CR2S_BossSettle_15712) {
               return this.mergeFrom((CR2S_BossSettle_15712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BossSettle_15712 other) {
            if (other == CrossDuelMsg.CR2S_BossSettle_15712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsGm()) {
                  this.setIsGm(other.getIsGm());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsGm();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BossSettle_15712 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BossSettle_15712)CrossDuelMsg.CR2S_BossSettle_15712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BossSettle_15712)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsGm() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsGm() {
            return this.isGm_;
         }

         public Builder setIsGm(boolean value) {
            this.bitField0_ |= 1;
            this.isGm_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGm() {
            this.bitField0_ &= -2;
            this.isGm_ = false;
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

   public static final class S2CR_BossSettle_15713 extends GeneratedMessageV3 implements S2CR_BossSettle_15713OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_BossSettle_15713 DEFAULT_INSTANCE = new S2CR_BossSettle_15713();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BossSettle_15713> PARSER = new AbstractParser<S2CR_BossSettle_15713>() {
         public S2CR_BossSettle_15713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BossSettle_15713(input, extensionRegistry);
         }
      };

      private S2CR_BossSettle_15713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BossSettle_15713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BossSettle_15713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BossSettle_15713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BossSettle_15713.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_BossSettle_15713)) {
            return super.equals(obj);
         } else {
            S2CR_BossSettle_15713 other = (S2CR_BossSettle_15713)obj;
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

      public static S2CR_BossSettle_15713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data);
      }

      public static S2CR_BossSettle_15713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BossSettle_15713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data);
      }

      public static S2CR_BossSettle_15713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BossSettle_15713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data);
      }

      public static S2CR_BossSettle_15713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BossSettle_15713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BossSettle_15713 parseFrom(InputStream input) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BossSettle_15713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BossSettle_15713 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BossSettle_15713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BossSettle_15713 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BossSettle_15713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BossSettle_15713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BossSettle_15713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BossSettle_15713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BossSettle_15713> parser() {
         return PARSER;
      }

      public Parser<S2CR_BossSettle_15713> getParserForType() {
         return PARSER;
      }

      public S2CR_BossSettle_15713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BossSettle_15713OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BossSettle_15713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_BossSettle_15713.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_BossSettle_15713_descriptor;
         }

         public S2CR_BossSettle_15713 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_BossSettle_15713.getDefaultInstance();
         }

         public S2CR_BossSettle_15713 build() {
            S2CR_BossSettle_15713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BossSettle_15713 buildPartial() {
            S2CR_BossSettle_15713 result = new S2CR_BossSettle_15713(this);
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
            if (other instanceof S2CR_BossSettle_15713) {
               return this.mergeFrom((S2CR_BossSettle_15713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BossSettle_15713 other) {
            if (other == CrossDuelMsg.S2CR_BossSettle_15713.getDefaultInstance()) {
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
            S2CR_BossSettle_15713 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BossSettle_15713)CrossDuelMsg.S2CR_BossSettle_15713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BossSettle_15713)e.getUnfinishedMessage();
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

   public static final class S2CR_EnterDuel_15714 extends GeneratedMessageV3 implements S2CR_EnterDuel_15714OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_EnterDuel_15714 DEFAULT_INSTANCE = new S2CR_EnterDuel_15714();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_EnterDuel_15714> PARSER = new AbstractParser<S2CR_EnterDuel_15714>() {
         public S2CR_EnterDuel_15714 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_EnterDuel_15714(input, extensionRegistry);
         }
      };

      private S2CR_EnterDuel_15714(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_EnterDuel_15714() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_EnterDuel_15714();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_EnterDuel_15714(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stage_ = input.readInt32();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EnterDuel_15714.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stage_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_EnterDuel_15714)) {
            return super.equals(obj);
         } else {
            S2CR_EnterDuel_15714 other = (S2CR_EnterDuel_15714)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
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
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_EnterDuel_15714 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data);
      }

      public static S2CR_EnterDuel_15714 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterDuel_15714 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data);
      }

      public static S2CR_EnterDuel_15714 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterDuel_15714 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data);
      }

      public static S2CR_EnterDuel_15714 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterDuel_15714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterDuel_15714 parseFrom(InputStream input) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EnterDuel_15714 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EnterDuel_15714 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_EnterDuel_15714 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EnterDuel_15714 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EnterDuel_15714 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterDuel_15714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_EnterDuel_15714 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_EnterDuel_15714 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_EnterDuel_15714> parser() {
         return PARSER;
      }

      public Parser<S2CR_EnterDuel_15714> getParserForType() {
         return PARSER;
      }

      public S2CR_EnterDuel_15714 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_EnterDuel_15714OrBuilder {
         private int bitField0_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EnterDuel_15714.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2CR_EnterDuel_15714.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2CR_EnterDuel_15714_descriptor;
         }

         public S2CR_EnterDuel_15714 getDefaultInstanceForType() {
            return CrossDuelMsg.S2CR_EnterDuel_15714.getDefaultInstance();
         }

         public S2CR_EnterDuel_15714 build() {
            S2CR_EnterDuel_15714 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_EnterDuel_15714 buildPartial() {
            S2CR_EnterDuel_15714 result = new S2CR_EnterDuel_15714(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_EnterDuel_15714) {
               return this.mergeFrom((S2CR_EnterDuel_15714)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_EnterDuel_15714 other) {
            if (other == CrossDuelMsg.S2CR_EnterDuel_15714.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStage();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_EnterDuel_15714 parsedMessage = null;

            try {
               parsedMessage = (S2CR_EnterDuel_15714)CrossDuelMsg.S2CR_EnterDuel_15714.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_EnterDuel_15714)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
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

   public static final class CR2S_StageSettleInfo_15715 extends GeneratedMessageV3 implements CR2S_StageSettleInfo_15715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      public static final int TOPTHREE_FIELD_NUMBER = 3;
      private List<DuelBattleMsg.RankInfo> topThree_;
      private byte memoizedIsInitialized;
      private static final CR2S_StageSettleInfo_15715 DEFAULT_INSTANCE = new CR2S_StageSettleInfo_15715();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_StageSettleInfo_15715> PARSER = new AbstractParser<CR2S_StageSettleInfo_15715>() {
         public CR2S_StageSettleInfo_15715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_StageSettleInfo_15715(input, extensionRegistry);
         }
      };

      private CR2S_StageSettleInfo_15715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_StageSettleInfo_15715() {
         this.memoizedIsInitialized = -1;
         this.topThree_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_StageSettleInfo_15715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_StageSettleInfo_15715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rank_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.topThree_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.topThree_.add(input.readMessage(DuelBattleMsg.RankInfo.PARSER, extensionRegistry));
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
                  this.topThree_ = Collections.unmodifiableList(this.topThree_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_StageSettleInfo_15715.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public List<DuelBattleMsg.RankInfo> getTopThreeList() {
         return this.topThree_;
      }

      public List<? extends DuelBattleMsg.RankInfoOrBuilder> getTopThreeOrBuilderList() {
         return this.topThree_;
      }

      public int getTopThreeCount() {
         return this.topThree_.size();
      }

      public DuelBattleMsg.RankInfo getTopThree(int index) {
         return (DuelBattleMsg.RankInfo)this.topThree_.get(index);
      }

      public DuelBattleMsg.RankInfoOrBuilder getTopThreeOrBuilder(int index) {
         return (DuelBattleMsg.RankInfoOrBuilder)this.topThree_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTopThreeCount(); ++i) {
               if (!this.getTopThree(i).isInitialized()) {
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
            output.writeInt32(1, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rank_);
         }

         for(int i = 0; i < this.topThree_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.topThree_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            for(int i = 0; i < this.topThree_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.topThree_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_StageSettleInfo_15715)) {
            return super.equals(obj);
         } else {
            CR2S_StageSettleInfo_15715 other = (CR2S_StageSettleInfo_15715)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (!this.getTopThreeList().equals(other.getTopThreeList())) {
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
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            if (this.getTopThreeCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTopThreeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_StageSettleInfo_15715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(InputStream input) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_StageSettleInfo_15715 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_StageSettleInfo_15715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_StageSettleInfo_15715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_StageSettleInfo_15715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_StageSettleInfo_15715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_StageSettleInfo_15715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_StageSettleInfo_15715> parser() {
         return PARSER;
      }

      public Parser<CR2S_StageSettleInfo_15715> getParserForType() {
         return PARSER;
      }

      public CR2S_StageSettleInfo_15715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_StageSettleInfo_15715OrBuilder {
         private int bitField0_;
         private int stage_;
         private int rank_;
         private List<DuelBattleMsg.RankInfo> topThree_;
         private RepeatedFieldBuilderV3<DuelBattleMsg.RankInfo, DuelBattleMsg.RankInfo.Builder, DuelBattleMsg.RankInfoOrBuilder> topThreeBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_StageSettleInfo_15715.class, Builder.class);
         }

         private Builder() {
            this.topThree_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.topThree_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.CR2S_StageSettleInfo_15715.alwaysUseFieldBuilders) {
               this.getTopThreeFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            if (this.topThreeBuilder_ == null) {
               this.topThree_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.topThreeBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_StageSettleInfo_15715_descriptor;
         }

         public CR2S_StageSettleInfo_15715 getDefaultInstanceForType() {
            return CrossDuelMsg.CR2S_StageSettleInfo_15715.getDefaultInstance();
         }

         public CR2S_StageSettleInfo_15715 build() {
            CR2S_StageSettleInfo_15715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_StageSettleInfo_15715 buildPartial() {
            CR2S_StageSettleInfo_15715 result = new CR2S_StageSettleInfo_15715(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 2;
            }

            if (this.topThreeBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.topThree_ = Collections.unmodifiableList(this.topThree_);
                  this.bitField0_ &= -5;
               }

               result.topThree_ = this.topThree_;
            } else {
               result.topThree_ = this.topThreeBuilder_.build();
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
            if (other instanceof CR2S_StageSettleInfo_15715) {
               return this.mergeFrom((CR2S_StageSettleInfo_15715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_StageSettleInfo_15715 other) {
            if (other == CrossDuelMsg.CR2S_StageSettleInfo_15715.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (this.topThreeBuilder_ == null) {
                  if (!other.topThree_.isEmpty()) {
                     if (this.topThree_.isEmpty()) {
                        this.topThree_ = other.topThree_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureTopThreeIsMutable();
                        this.topThree_.addAll(other.topThree_);
                     }

                     this.onChanged();
                  }
               } else if (!other.topThree_.isEmpty()) {
                  if (this.topThreeBuilder_.isEmpty()) {
                     this.topThreeBuilder_.dispose();
                     this.topThreeBuilder_ = null;
                     this.topThree_ = other.topThree_;
                     this.bitField0_ &= -5;
                     this.topThreeBuilder_ = CrossDuelMsg.CR2S_StageSettleInfo_15715.alwaysUseFieldBuilders ? this.getTopThreeFieldBuilder() : null;
                  } else {
                     this.topThreeBuilder_.addAllMessages(other.topThree_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else if (!this.hasRank()) {
               return false;
            } else {
               for(int i = 0; i < this.getTopThreeCount(); ++i) {
                  if (!this.getTopThree(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_StageSettleInfo_15715 parsedMessage = null;

            try {
               parsedMessage = (CR2S_StageSettleInfo_15715)CrossDuelMsg.CR2S_StageSettleInfo_15715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_StageSettleInfo_15715)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
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

         private void ensureTopThreeIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.topThree_ = new ArrayList(this.topThree_);
               this.bitField0_ |= 4;
            }

         }

         public List<DuelBattleMsg.RankInfo> getTopThreeList() {
            return this.topThreeBuilder_ == null ? Collections.unmodifiableList(this.topThree_) : this.topThreeBuilder_.getMessageList();
         }

         public int getTopThreeCount() {
            return this.topThreeBuilder_ == null ? this.topThree_.size() : this.topThreeBuilder_.getCount();
         }

         public DuelBattleMsg.RankInfo getTopThree(int index) {
            return this.topThreeBuilder_ == null ? (DuelBattleMsg.RankInfo)this.topThree_.get(index) : (DuelBattleMsg.RankInfo)this.topThreeBuilder_.getMessage(index);
         }

         public Builder setTopThree(int index, DuelBattleMsg.RankInfo value) {
            if (this.topThreeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTopThreeIsMutable();
               this.topThree_.set(index, value);
               this.onChanged();
            } else {
               this.topThreeBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTopThree(int index, DuelBattleMsg.RankInfo.Builder builderForValue) {
            if (this.topThreeBuilder_ == null) {
               this.ensureTopThreeIsMutable();
               this.topThree_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.topThreeBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTopThree(DuelBattleMsg.RankInfo value) {
            if (this.topThreeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTopThreeIsMutable();
               this.topThree_.add(value);
               this.onChanged();
            } else {
               this.topThreeBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTopThree(int index, DuelBattleMsg.RankInfo value) {
            if (this.topThreeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTopThreeIsMutable();
               this.topThree_.add(index, value);
               this.onChanged();
            } else {
               this.topThreeBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTopThree(DuelBattleMsg.RankInfo.Builder builderForValue) {
            if (this.topThreeBuilder_ == null) {
               this.ensureTopThreeIsMutable();
               this.topThree_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.topThreeBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTopThree(int index, DuelBattleMsg.RankInfo.Builder builderForValue) {
            if (this.topThreeBuilder_ == null) {
               this.ensureTopThreeIsMutable();
               this.topThree_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.topThreeBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTopThree(Iterable<? extends DuelBattleMsg.RankInfo> values) {
            if (this.topThreeBuilder_ == null) {
               this.ensureTopThreeIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.topThree_);
               this.onChanged();
            } else {
               this.topThreeBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTopThree() {
            if (this.topThreeBuilder_ == null) {
               this.topThree_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.topThreeBuilder_.clear();
            }

            return this;
         }

         public Builder removeTopThree(int index) {
            if (this.topThreeBuilder_ == null) {
               this.ensureTopThreeIsMutable();
               this.topThree_.remove(index);
               this.onChanged();
            } else {
               this.topThreeBuilder_.remove(index);
            }

            return this;
         }

         public DuelBattleMsg.RankInfo.Builder getTopThreeBuilder(int index) {
            return (DuelBattleMsg.RankInfo.Builder)this.getTopThreeFieldBuilder().getBuilder(index);
         }

         public DuelBattleMsg.RankInfoOrBuilder getTopThreeOrBuilder(int index) {
            return this.topThreeBuilder_ == null ? (DuelBattleMsg.RankInfoOrBuilder)this.topThree_.get(index) : (DuelBattleMsg.RankInfoOrBuilder)this.topThreeBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DuelBattleMsg.RankInfoOrBuilder> getTopThreeOrBuilderList() {
            return this.topThreeBuilder_ != null ? this.topThreeBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.topThree_);
         }

         public DuelBattleMsg.RankInfo.Builder addTopThreeBuilder() {
            return (DuelBattleMsg.RankInfo.Builder)this.getTopThreeFieldBuilder().addBuilder(DuelBattleMsg.RankInfo.getDefaultInstance());
         }

         public DuelBattleMsg.RankInfo.Builder addTopThreeBuilder(int index) {
            return (DuelBattleMsg.RankInfo.Builder)this.getTopThreeFieldBuilder().addBuilder(index, DuelBattleMsg.RankInfo.getDefaultInstance());
         }

         public List<DuelBattleMsg.RankInfo.Builder> getTopThreeBuilderList() {
            return this.getTopThreeFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DuelBattleMsg.RankInfo, DuelBattleMsg.RankInfo.Builder, DuelBattleMsg.RankInfoOrBuilder> getTopThreeFieldBuilder() {
            if (this.topThreeBuilder_ == null) {
               this.topThreeBuilder_ = new RepeatedFieldBuilderV3(this.topThree_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.topThree_ = null;
            }

            return this.topThreeBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_SendRankAward_15730 extends GeneratedMessageV3 implements S2S_SendRankAward_15730OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDID_FIELD_NUMBER = 1;
      private int awardId_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      public static final int MEDAL_FIELD_NUMBER = 3;
      private int medal_;
      public static final int TYPE_FIELD_NUMBER = 4;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2S_SendRankAward_15730 DEFAULT_INSTANCE = new S2S_SendRankAward_15730();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SendRankAward_15730> PARSER = new AbstractParser<S2S_SendRankAward_15730>() {
         public S2S_SendRankAward_15730 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SendRankAward_15730(input, extensionRegistry);
         }
      };

      private S2S_SendRankAward_15730(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SendRankAward_15730() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SendRankAward_15730();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SendRankAward_15730(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.awardId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rank_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.medal_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendRankAward_15730.class, Builder.class);
      }

      public boolean hasAwardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasMedal() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMedal() {
         return this.medal_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasAwardId()) {
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
            output.writeInt32(1, this.awardId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rank_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.medal_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.awardId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.medal_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_SendRankAward_15730)) {
            return super.equals(obj);
         } else {
            S2S_SendRankAward_15730 other = (S2S_SendRankAward_15730)obj;
            if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasMedal() != other.hasMedal()) {
               return false;
            } else if (this.hasMedal() && this.getMedal() != other.getMedal()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasAwardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardId();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasMedal()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMedal();
            }

            if (this.hasType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_SendRankAward_15730 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_15730 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_15730 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_15730 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_15730 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_15730 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_15730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_15730 parseFrom(InputStream input) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_15730 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendRankAward_15730 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_15730 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendRankAward_15730 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_15730 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_15730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SendRankAward_15730 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SendRankAward_15730 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SendRankAward_15730> parser() {
         return PARSER;
      }

      public Parser<S2S_SendRankAward_15730> getParserForType() {
         return PARSER;
      }

      public S2S_SendRankAward_15730 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SendRankAward_15730OrBuilder {
         private int bitField0_;
         private int awardId_;
         private int rank_;
         private int medal_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendRankAward_15730.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_SendRankAward_15730.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.awardId_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            this.medal_ = 0;
            this.bitField0_ &= -5;
            this.type_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendRankAward_15730_descriptor;
         }

         public S2S_SendRankAward_15730 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_SendRankAward_15730.getDefaultInstance();
         }

         public S2S_SendRankAward_15730 build() {
            S2S_SendRankAward_15730 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SendRankAward_15730 buildPartial() {
            S2S_SendRankAward_15730 result = new S2S_SendRankAward_15730(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.awardId_ = this.awardId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.medal_ = this.medal_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2S_SendRankAward_15730) {
               return this.mergeFrom((S2S_SendRankAward_15730)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SendRankAward_15730 other) {
            if (other == CrossDuelMsg.S2S_SendRankAward_15730.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasMedal()) {
                  this.setMedal(other.getMedal());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAwardId()) {
               return false;
            } else {
               return this.hasRank();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_SendRankAward_15730 parsedMessage = null;

            try {
               parsedMessage = (S2S_SendRankAward_15730)CrossDuelMsg.S2S_SendRankAward_15730.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SendRankAward_15730)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAwardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 1;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -2;
            this.awardId_ = 0;
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

         public boolean hasMedal() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMedal() {
            return this.medal_;
         }

         public Builder setMedal(int value) {
            this.bitField0_ |= 4;
            this.medal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMedal() {
            this.bitField0_ &= -5;
            this.medal_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 8;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -9;
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

   public static final class S2S_NotifyDelResource_15731 extends GeneratedMessageV3 implements S2S_NotifyDelResource_15731OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WAGERINX_FIELD_NUMBER = 1;
      private int wagerInx_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifyDelResource_15731 DEFAULT_INSTANCE = new S2S_NotifyDelResource_15731();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifyDelResource_15731> PARSER = new AbstractParser<S2S_NotifyDelResource_15731>() {
         public S2S_NotifyDelResource_15731 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifyDelResource_15731(input, extensionRegistry);
         }
      };

      private S2S_NotifyDelResource_15731(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifyDelResource_15731() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifyDelResource_15731();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifyDelResource_15731(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wagerInx_ = input.readInt32();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyDelResource_15731.class, Builder.class);
      }

      public boolean hasWagerInx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWagerInx() {
         return this.wagerInx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWagerInx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wagerInx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wagerInx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifyDelResource_15731)) {
            return super.equals(obj);
         } else {
            S2S_NotifyDelResource_15731 other = (S2S_NotifyDelResource_15731)obj;
            if (this.hasWagerInx() != other.hasWagerInx()) {
               return false;
            } else if (this.hasWagerInx() && this.getWagerInx() != other.getWagerInx()) {
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
            if (this.hasWagerInx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWagerInx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifyDelResource_15731 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyDelResource_15731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyDelResource_15731 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifyDelResource_15731 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyDelResource_15731 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyDelResource_15731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifyDelResource_15731 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifyDelResource_15731 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifyDelResource_15731> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifyDelResource_15731> getParserForType() {
         return PARSER;
      }

      public S2S_NotifyDelResource_15731 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifyDelResource_15731OrBuilder {
         private int bitField0_;
         private int wagerInx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyDelResource_15731.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_NotifyDelResource_15731.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wagerInx_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_NotifyDelResource_15731_descriptor;
         }

         public S2S_NotifyDelResource_15731 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_NotifyDelResource_15731.getDefaultInstance();
         }

         public S2S_NotifyDelResource_15731 build() {
            S2S_NotifyDelResource_15731 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifyDelResource_15731 buildPartial() {
            S2S_NotifyDelResource_15731 result = new S2S_NotifyDelResource_15731(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wagerInx_ = this.wagerInx_;
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
            if (other instanceof S2S_NotifyDelResource_15731) {
               return this.mergeFrom((S2S_NotifyDelResource_15731)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifyDelResource_15731 other) {
            if (other == CrossDuelMsg.S2S_NotifyDelResource_15731.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWagerInx()) {
                  this.setWagerInx(other.getWagerInx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasWagerInx();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifyDelResource_15731 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifyDelResource_15731)CrossDuelMsg.S2S_NotifyDelResource_15731.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifyDelResource_15731)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWagerInx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWagerInx() {
            return this.wagerInx_;
         }

         public Builder setWagerInx(int value) {
            this.bitField0_ |= 1;
            this.wagerInx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerInx() {
            this.bitField0_ &= -2;
            this.wagerInx_ = 0;
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

   public static final class S2S_SendGuessAward_15732 extends GeneratedMessageV3 implements S2S_SendGuessAward_15732OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WAGERINX_FIELD_NUMBER = 1;
      private int wagerInx_;
      public static final int AWARDTYPES_FIELD_NUMBER = 2;
      private Internal.IntList awardTypes_;
      private byte memoizedIsInitialized;
      private static final S2S_SendGuessAward_15732 DEFAULT_INSTANCE = new S2S_SendGuessAward_15732();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SendGuessAward_15732> PARSER = new AbstractParser<S2S_SendGuessAward_15732>() {
         public S2S_SendGuessAward_15732 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SendGuessAward_15732(input, extensionRegistry);
         }
      };

      private S2S_SendGuessAward_15732(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SendGuessAward_15732() {
         this.memoizedIsInitialized = -1;
         this.awardTypes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SendGuessAward_15732();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SendGuessAward_15732(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wagerInx_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.awardTypes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.awardTypes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.awardTypes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.awardTypes_.addInt(input.readInt32());
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
                  this.awardTypes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendGuessAward_15732.class, Builder.class);
      }

      public boolean hasWagerInx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWagerInx() {
         return this.wagerInx_;
      }

      public List<Integer> getAwardTypesList() {
         return this.awardTypes_;
      }

      public int getAwardTypesCount() {
         return this.awardTypes_.size();
      }

      public int getAwardTypes(int index) {
         return this.awardTypes_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWagerInx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wagerInx_);
         }

         for(int i = 0; i < this.awardTypes_.size(); ++i) {
            output.writeInt32(2, this.awardTypes_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.wagerInx_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.awardTypes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.awardTypes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getAwardTypesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_SendGuessAward_15732)) {
            return super.equals(obj);
         } else {
            S2S_SendGuessAward_15732 other = (S2S_SendGuessAward_15732)obj;
            if (this.hasWagerInx() != other.hasWagerInx()) {
               return false;
            } else if (this.hasWagerInx() && this.getWagerInx() != other.getWagerInx()) {
               return false;
            } else if (!this.getAwardTypesList().equals(other.getAwardTypesList())) {
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
            if (this.hasWagerInx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWagerInx();
            }

            if (this.getAwardTypesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAwardTypesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_SendGuessAward_15732 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data);
      }

      public static S2S_SendGuessAward_15732 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendGuessAward_15732 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data);
      }

      public static S2S_SendGuessAward_15732 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendGuessAward_15732 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data);
      }

      public static S2S_SendGuessAward_15732 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendGuessAward_15732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendGuessAward_15732 parseFrom(InputStream input) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendGuessAward_15732 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendGuessAward_15732 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SendGuessAward_15732 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendGuessAward_15732 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendGuessAward_15732 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendGuessAward_15732)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SendGuessAward_15732 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SendGuessAward_15732 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SendGuessAward_15732> parser() {
         return PARSER;
      }

      public Parser<S2S_SendGuessAward_15732> getParserForType() {
         return PARSER;
      }

      public S2S_SendGuessAward_15732 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SendGuessAward_15732OrBuilder {
         private int bitField0_;
         private int wagerInx_;
         private Internal.IntList awardTypes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendGuessAward_15732.class, Builder.class);
         }

         private Builder() {
            this.awardTypes_ = CrossDuelMsg.S2S_SendGuessAward_15732.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardTypes_ = CrossDuelMsg.S2S_SendGuessAward_15732.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_SendGuessAward_15732.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wagerInx_ = 0;
            this.bitField0_ &= -2;
            this.awardTypes_ = CrossDuelMsg.S2S_SendGuessAward_15732.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_SendGuessAward_15732_descriptor;
         }

         public S2S_SendGuessAward_15732 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_SendGuessAward_15732.getDefaultInstance();
         }

         public S2S_SendGuessAward_15732 build() {
            S2S_SendGuessAward_15732 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SendGuessAward_15732 buildPartial() {
            S2S_SendGuessAward_15732 result = new S2S_SendGuessAward_15732(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wagerInx_ = this.wagerInx_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.awardTypes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.awardTypes_ = this.awardTypes_;
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
            if (other instanceof S2S_SendGuessAward_15732) {
               return this.mergeFrom((S2S_SendGuessAward_15732)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SendGuessAward_15732 other) {
            if (other == CrossDuelMsg.S2S_SendGuessAward_15732.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWagerInx()) {
                  this.setWagerInx(other.getWagerInx());
               }

               if (!other.awardTypes_.isEmpty()) {
                  if (this.awardTypes_.isEmpty()) {
                     this.awardTypes_ = other.awardTypes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureAwardTypesIsMutable();
                     this.awardTypes_.addAll(other.awardTypes_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasWagerInx();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_SendGuessAward_15732 parsedMessage = null;

            try {
               parsedMessage = (S2S_SendGuessAward_15732)CrossDuelMsg.S2S_SendGuessAward_15732.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SendGuessAward_15732)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWagerInx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWagerInx() {
            return this.wagerInx_;
         }

         public Builder setWagerInx(int value) {
            this.bitField0_ |= 1;
            this.wagerInx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerInx() {
            this.bitField0_ &= -2;
            this.wagerInx_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwardTypesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.awardTypes_ = CrossDuelMsg.S2S_SendGuessAward_15732.mutableCopy(this.awardTypes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getAwardTypesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.awardTypes_) : this.awardTypes_);
         }

         public int getAwardTypesCount() {
            return this.awardTypes_.size();
         }

         public int getAwardTypes(int index) {
            return this.awardTypes_.getInt(index);
         }

         public Builder setAwardTypes(int index, int value) {
            this.ensureAwardTypesIsMutable();
            this.awardTypes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAwardTypes(int value) {
            this.ensureAwardTypesIsMutable();
            this.awardTypes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAwardTypes(Iterable<? extends Integer> values) {
            this.ensureAwardTypesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardTypes_);
            this.onChanged();
            return this;
         }

         public Builder clearAwardTypes() {
            this.awardTypes_ = CrossDuelMsg.S2S_SendGuessAward_15732.emptyIntList();
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

   public static final class S2S_sendBossRank_15733 extends GeneratedMessageV3 implements S2S_sendBossRank_15733OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int BOSSPOINT_FIELD_NUMBER = 2;
      private int bossPoint_;
      public static final int SERIALCHAMPION_FIELD_NUMBER = 3;
      private int serialChampion_;
      private byte memoizedIsInitialized;
      private static final S2S_sendBossRank_15733 DEFAULT_INSTANCE = new S2S_sendBossRank_15733();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_sendBossRank_15733> PARSER = new AbstractParser<S2S_sendBossRank_15733>() {
         public S2S_sendBossRank_15733 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_sendBossRank_15733(input, extensionRegistry);
         }
      };

      private S2S_sendBossRank_15733(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_sendBossRank_15733() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_sendBossRank_15733();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_sendBossRank_15733(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bossPoint_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serialChampion_ = input.readInt32();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendBossRank_15733.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasBossPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBossPoint() {
         return this.bossPoint_;
      }

      public boolean hasSerialChampion() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSerialChampion() {
         return this.serialChampion_;
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
         } else if (!this.hasBossPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSerialChampion()) {
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
            output.writeInt32(2, this.bossPoint_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serialChampion_);
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
               size += CodedOutputStream.computeInt32Size(2, this.bossPoint_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serialChampion_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_sendBossRank_15733)) {
            return super.equals(obj);
         } else {
            S2S_sendBossRank_15733 other = (S2S_sendBossRank_15733)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasBossPoint() != other.hasBossPoint()) {
               return false;
            } else if (this.hasBossPoint() && this.getBossPoint() != other.getBossPoint()) {
               return false;
            } else if (this.hasSerialChampion() != other.hasSerialChampion()) {
               return false;
            } else if (this.hasSerialChampion() && this.getSerialChampion() != other.getSerialChampion()) {
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

            if (this.hasBossPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBossPoint();
            }

            if (this.hasSerialChampion()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSerialChampion();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_sendBossRank_15733 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data);
      }

      public static S2S_sendBossRank_15733 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendBossRank_15733 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data);
      }

      public static S2S_sendBossRank_15733 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendBossRank_15733 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data);
      }

      public static S2S_sendBossRank_15733 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendBossRank_15733)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendBossRank_15733 parseFrom(InputStream input) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendBossRank_15733 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendBossRank_15733 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_sendBossRank_15733 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendBossRank_15733 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendBossRank_15733 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendBossRank_15733)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_sendBossRank_15733 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_sendBossRank_15733 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_sendBossRank_15733> parser() {
         return PARSER;
      }

      public Parser<S2S_sendBossRank_15733> getParserForType() {
         return PARSER;
      }

      public S2S_sendBossRank_15733 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_sendBossRank_15733OrBuilder {
         private int bitField0_;
         private int rank_;
         private int bossPoint_;
         private int serialChampion_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendBossRank_15733.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_sendBossRank_15733.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.bossPoint_ = 0;
            this.bitField0_ &= -3;
            this.serialChampion_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendBossRank_15733_descriptor;
         }

         public S2S_sendBossRank_15733 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_sendBossRank_15733.getDefaultInstance();
         }

         public S2S_sendBossRank_15733 build() {
            S2S_sendBossRank_15733 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_sendBossRank_15733 buildPartial() {
            S2S_sendBossRank_15733 result = new S2S_sendBossRank_15733(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.bossPoint_ = this.bossPoint_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serialChampion_ = this.serialChampion_;
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
            if (other instanceof S2S_sendBossRank_15733) {
               return this.mergeFrom((S2S_sendBossRank_15733)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_sendBossRank_15733 other) {
            if (other == CrossDuelMsg.S2S_sendBossRank_15733.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasBossPoint()) {
                  this.setBossPoint(other.getBossPoint());
               }

               if (other.hasSerialChampion()) {
                  this.setSerialChampion(other.getSerialChampion());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasBossPoint()) {
               return false;
            } else {
               return this.hasSerialChampion();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_sendBossRank_15733 parsedMessage = null;

            try {
               parsedMessage = (S2S_sendBossRank_15733)CrossDuelMsg.S2S_sendBossRank_15733.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_sendBossRank_15733)e.getUnfinishedMessage();
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

         public boolean hasBossPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBossPoint() {
            return this.bossPoint_;
         }

         public Builder setBossPoint(int value) {
            this.bitField0_ |= 2;
            this.bossPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBossPoint() {
            this.bitField0_ &= -3;
            this.bossPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSerialChampion() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSerialChampion() {
            return this.serialChampion_;
         }

         public Builder setSerialChampion(int value) {
            this.bitField0_ |= 4;
            this.serialChampion_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSerialChampion() {
            this.bitField0_ &= -5;
            this.serialChampion_ = 0;
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

   public static final class S2S_sendArraying_15734 extends GeneratedMessageV3 implements S2S_sendArraying_15734OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2S_sendArraying_15734 DEFAULT_INSTANCE = new S2S_sendArraying_15734();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_sendArraying_15734> PARSER = new AbstractParser<S2S_sendArraying_15734>() {
         public S2S_sendArraying_15734 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_sendArraying_15734(input, extensionRegistry);
         }
      };

      private S2S_sendArraying_15734(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_sendArraying_15734() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_sendArraying_15734();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_sendArraying_15734(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendArraying_15734.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
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
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
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
         } else if (!(obj instanceof S2S_sendArraying_15734)) {
            return super.equals(obj);
         } else {
            S2S_sendArraying_15734 other = (S2S_sendArraying_15734)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
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

      public static S2S_sendArraying_15734 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data);
      }

      public static S2S_sendArraying_15734 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendArraying_15734 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data);
      }

      public static S2S_sendArraying_15734 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendArraying_15734 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data);
      }

      public static S2S_sendArraying_15734 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendArraying_15734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendArraying_15734 parseFrom(InputStream input) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendArraying_15734 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendArraying_15734 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_sendArraying_15734 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendArraying_15734 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendArraying_15734 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendArraying_15734)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_sendArraying_15734 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_sendArraying_15734 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_sendArraying_15734> parser() {
         return PARSER;
      }

      public Parser<S2S_sendArraying_15734> getParserForType() {
         return PARSER;
      }

      public S2S_sendArraying_15734 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_sendArraying_15734OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendArraying_15734.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_sendArraying_15734.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendArraying_15734_descriptor;
         }

         public S2S_sendArraying_15734 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_sendArraying_15734.getDefaultInstance();
         }

         public S2S_sendArraying_15734 build() {
            S2S_sendArraying_15734 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_sendArraying_15734 buildPartial() {
            S2S_sendArraying_15734 result = new S2S_sendArraying_15734(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
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
            if (other instanceof S2S_sendArraying_15734) {
               return this.mergeFrom((S2S_sendArraying_15734)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_sendArraying_15734 other) {
            if (other == CrossDuelMsg.S2S_sendArraying_15734.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
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
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasArraying();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_sendArraying_15734 parsedMessage = null;

            try {
               parsedMessage = (S2S_sendArraying_15734)CrossDuelMsg.S2S_sendArraying_15734.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_sendArraying_15734)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
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
            this.arraying_ = CrossDuelMsg.S2S_sendArraying_15734.getDefaultInstance().getArraying();
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

   public static final class S2S_PlayerLogout_15738 extends GeneratedMessageV3 implements S2S_PlayerLogout_15738OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_PlayerLogout_15738 DEFAULT_INSTANCE = new S2S_PlayerLogout_15738();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_PlayerLogout_15738> PARSER = new AbstractParser<S2S_PlayerLogout_15738>() {
         public S2S_PlayerLogout_15738 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_PlayerLogout_15738(input, extensionRegistry);
         }
      };

      private S2S_PlayerLogout_15738(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_PlayerLogout_15738() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_PlayerLogout_15738();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_PlayerLogout_15738(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_PlayerLogout_15738.class, Builder.class);
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
         } else if (!(obj instanceof S2S_PlayerLogout_15738)) {
            return super.equals(obj);
         } else {
            S2S_PlayerLogout_15738 other = (S2S_PlayerLogout_15738)obj;
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

      public static S2S_PlayerLogout_15738 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_15738 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_15738 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_15738 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_15738 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data);
      }

      public static S2S_PlayerLogout_15738 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_PlayerLogout_15738)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_PlayerLogout_15738 parseFrom(InputStream input) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_15738 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_PlayerLogout_15738 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_15738 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_PlayerLogout_15738 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_PlayerLogout_15738 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_PlayerLogout_15738)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_PlayerLogout_15738 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_PlayerLogout_15738 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_PlayerLogout_15738> parser() {
         return PARSER;
      }

      public Parser<S2S_PlayerLogout_15738> getParserForType() {
         return PARSER;
      }

      public S2S_PlayerLogout_15738 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_PlayerLogout_15738OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_PlayerLogout_15738.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_PlayerLogout_15738.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_PlayerLogout_15738_descriptor;
         }

         public S2S_PlayerLogout_15738 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_PlayerLogout_15738.getDefaultInstance();
         }

         public S2S_PlayerLogout_15738 build() {
            S2S_PlayerLogout_15738 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_PlayerLogout_15738 buildPartial() {
            S2S_PlayerLogout_15738 result = new S2S_PlayerLogout_15738(this);
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
            if (other instanceof S2S_PlayerLogout_15738) {
               return this.mergeFrom((S2S_PlayerLogout_15738)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_PlayerLogout_15738 other) {
            if (other == CrossDuelMsg.S2S_PlayerLogout_15738.getDefaultInstance()) {
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
            S2S_PlayerLogout_15738 parsedMessage = null;

            try {
               parsedMessage = (S2S_PlayerLogout_15738)CrossDuelMsg.S2S_PlayerLogout_15738.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_PlayerLogout_15738)e.getUnfinishedMessage();
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

   public static final class S2S_sendGm_4599 extends GeneratedMessageV3 implements S2S_sendGm_4599OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GMOP_FIELD_NUMBER = 1;
      private int gmOp_;
      private byte memoizedIsInitialized;
      private static final S2S_sendGm_4599 DEFAULT_INSTANCE = new S2S_sendGm_4599();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_sendGm_4599> PARSER = new AbstractParser<S2S_sendGm_4599>() {
         public S2S_sendGm_4599 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_sendGm_4599(input, extensionRegistry);
         }
      };

      private S2S_sendGm_4599(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_sendGm_4599() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_sendGm_4599();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_sendGm_4599(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gmOp_ = input.readInt32();
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
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendGm_4599.class, Builder.class);
      }

      public boolean hasGmOp() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGmOp() {
         return this.gmOp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGmOp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gmOp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gmOp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_sendGm_4599)) {
            return super.equals(obj);
         } else {
            S2S_sendGm_4599 other = (S2S_sendGm_4599)obj;
            if (this.hasGmOp() != other.hasGmOp()) {
               return false;
            } else if (this.hasGmOp() && this.getGmOp() != other.getGmOp()) {
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
            if (this.hasGmOp()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGmOp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_sendGm_4599 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data);
      }

      public static S2S_sendGm_4599 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendGm_4599 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data);
      }

      public static S2S_sendGm_4599 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendGm_4599 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data);
      }

      public static S2S_sendGm_4599 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_sendGm_4599)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_sendGm_4599 parseFrom(InputStream input) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendGm_4599 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendGm_4599 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_sendGm_4599 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_sendGm_4599 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_sendGm_4599 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_sendGm_4599)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_sendGm_4599 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_sendGm_4599 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_sendGm_4599> parser() {
         return PARSER;
      }

      public Parser<S2S_sendGm_4599> getParserForType() {
         return PARSER;
      }

      public S2S_sendGm_4599 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_sendGm_4599OrBuilder {
         private int bitField0_;
         private int gmOp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_sendGm_4599.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.S2S_sendGm_4599.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gmOp_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_S2S_sendGm_4599_descriptor;
         }

         public S2S_sendGm_4599 getDefaultInstanceForType() {
            return CrossDuelMsg.S2S_sendGm_4599.getDefaultInstance();
         }

         public S2S_sendGm_4599 build() {
            S2S_sendGm_4599 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_sendGm_4599 buildPartial() {
            S2S_sendGm_4599 result = new S2S_sendGm_4599(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gmOp_ = this.gmOp_;
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
            if (other instanceof S2S_sendGm_4599) {
               return this.mergeFrom((S2S_sendGm_4599)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_sendGm_4599 other) {
            if (other == CrossDuelMsg.S2S_sendGm_4599.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGmOp()) {
                  this.setGmOp(other.getGmOp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGmOp();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_sendGm_4599 parsedMessage = null;

            try {
               parsedMessage = (S2S_sendGm_4599)CrossDuelMsg.S2S_sendGm_4599.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_sendGm_4599)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGmOp() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGmOp() {
            return this.gmOp_;
         }

         public Builder setGmOp(int value) {
            this.bitField0_ |= 1;
            this.gmOp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGmOp() {
            this.bitField0_ &= -2;
            this.gmOp_ = 0;
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

   public static final class CR2S_EnterZonePlayer_15739 extends GeneratedMessageV3 implements CR2S_EnterZonePlayer_15739OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_EnterZonePlayer_15739 DEFAULT_INSTANCE = new CR2S_EnterZonePlayer_15739();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_EnterZonePlayer_15739> PARSER = new AbstractParser<CR2S_EnterZonePlayer_15739>() {
         public CR2S_EnterZonePlayer_15739 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_EnterZonePlayer_15739(input, extensionRegistry);
         }
      };

      private CR2S_EnterZonePlayer_15739(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_EnterZonePlayer_15739() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_EnterZonePlayer_15739();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_EnterZonePlayer_15739(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.playerId_.addInt(input.readInt32());
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
                  this.playerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EnterZonePlayer_15739.class, Builder.class);
      }

      public List<Integer> getPlayerIdList() {
         return this.playerId_;
      }

      public int getPlayerIdCount() {
         return this.playerId_.size();
      }

      public int getPlayerId(int index) {
         return this.playerId_.getInt(index);
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
         for(int i = 0; i < this.playerId_.size(); ++i) {
            output.writeInt32(1, this.playerId_.getInt(i));
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

            for(int i = 0; i < this.playerId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.playerId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayerIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_EnterZonePlayer_15739)) {
            return super.equals(obj);
         } else {
            CR2S_EnterZonePlayer_15739 other = (CR2S_EnterZonePlayer_15739)obj;
            if (!this.getPlayerIdList().equals(other.getPlayerIdList())) {
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
            if (this.getPlayerIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EnterZonePlayer_15739)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(InputStream input) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EnterZonePlayer_15739 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_EnterZonePlayer_15739 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EnterZonePlayer_15739 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EnterZonePlayer_15739)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_EnterZonePlayer_15739 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_EnterZonePlayer_15739 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_EnterZonePlayer_15739> parser() {
         return PARSER;
      }

      public Parser<CR2S_EnterZonePlayer_15739> getParserForType() {
         return PARSER;
      }

      public CR2S_EnterZonePlayer_15739 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_EnterZonePlayer_15739OrBuilder {
         private int bitField0_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EnterZonePlayer_15739.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = CrossDuelMsg.CR2S_EnterZonePlayer_15739.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = CrossDuelMsg.CR2S_EnterZonePlayer_15739.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDuelMsg.CR2S_EnterZonePlayer_15739.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = CrossDuelMsg.CR2S_EnterZonePlayer_15739.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDuelMsg.internal_static_crossDuel_com_gzbz_protobuf_CR2S_EnterZonePlayer_15739_descriptor;
         }

         public CR2S_EnterZonePlayer_15739 getDefaultInstanceForType() {
            return CrossDuelMsg.CR2S_EnterZonePlayer_15739.getDefaultInstance();
         }

         public CR2S_EnterZonePlayer_15739 build() {
            CR2S_EnterZonePlayer_15739 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_EnterZonePlayer_15739 buildPartial() {
            CR2S_EnterZonePlayer_15739 result = new CR2S_EnterZonePlayer_15739(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.playerId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.playerId_ = this.playerId_;
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
            if (other instanceof CR2S_EnterZonePlayer_15739) {
               return this.mergeFrom((CR2S_EnterZonePlayer_15739)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_EnterZonePlayer_15739 other) {
            if (other == CrossDuelMsg.CR2S_EnterZonePlayer_15739.getDefaultInstance()) {
               return this;
            } else {
               if (!other.playerId_.isEmpty()) {
                  if (this.playerId_.isEmpty()) {
                     this.playerId_ = other.playerId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePlayerIdIsMutable();
                     this.playerId_.addAll(other.playerId_);
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
            CR2S_EnterZonePlayer_15739 parsedMessage = null;

            try {
               parsedMessage = (CR2S_EnterZonePlayer_15739)CrossDuelMsg.CR2S_EnterZonePlayer_15739.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_EnterZonePlayer_15739)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerId_ = CrossDuelMsg.CR2S_EnterZonePlayer_15739.mutableCopy(this.playerId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPlayerIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.playerId_) : this.playerId_);
         }

         public int getPlayerIdCount() {
            return this.playerId_.size();
         }

         public int getPlayerId(int index) {
            return this.playerId_.getInt(index);
         }

         public Builder setPlayerId(int index, int value) {
            this.ensurePlayerIdIsMutable();
            this.playerId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPlayerId(int value) {
            this.ensurePlayerIdIsMutable();
            this.playerId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPlayerId(Iterable<? extends Integer> values) {
            this.ensurePlayerIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerId_);
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.playerId_ = CrossDuelMsg.CR2S_EnterZonePlayer_15739.emptyIntList();
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

   public interface CR2S_BossSettle_15712OrBuilder extends MessageOrBuilder {
      boolean hasIsGm();

      boolean getIsGm();
   }

   public interface CR2S_DuelMain_15702OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      long getStartTime();

      boolean hasEndTime();

      long getEndTime();

      boolean hasSeason();

      int getSeason();

      boolean hasStage();

      int getStage();

      boolean hasStageStatus();

      int getStageStatus();

      boolean hasPrevStartTime();

      long getPrevStartTime();

      boolean hasPrevEndTime();

      long getPrevEndTime();

      boolean hasPassRound();

      int getPassRound();

      boolean hasPassState();

      int getPassState();

      boolean hasIsGroup();

      boolean getIsGroup();
   }

   public interface CR2S_EnterZonePlayer_15739OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface CR2S_GodChoiceHero_15710OrBuilder extends MessageOrBuilder {
      List<Integer> getHeroIdList();

      int getHeroIdCount();

      int getHeroId(int index);
   }

   public interface CR2S_StageSettleInfo_15715OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();

      boolean hasRank();

      int getRank();

      List<DuelBattleMsg.RankInfo> getTopThreeList();

      DuelBattleMsg.RankInfo getTopThree(int index);

      int getTopThreeCount();

      List<? extends DuelBattleMsg.RankInfoOrBuilder> getTopThreeOrBuilderList();

      DuelBattleMsg.RankInfoOrBuilder getTopThreeOrBuilder(int index);
   }

   public interface S2CR_BossSettle_15713OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_DuelHistoryLike_15705OrBuilder extends MessageOrBuilder {
      boolean hasSeason();

      int getSeason();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2CR_DuelHistory_15704OrBuilder extends MessageOrBuilder {
      List<Long> getTodayLikeList();

      int getTodayLikeCount();

      long getTodayLike(int index);
   }

   public interface S2CR_DuelMain_15701OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_DuelTopWorshipList_15706OrBuilder extends MessageOrBuilder {
      List<Long> getTodayLikeList();

      int getTodayLikeCount();

      long getTodayLike(int index);
   }

   public interface S2CR_DuelTopWorship_15707OrBuilder extends MessageOrBuilder {
      boolean hasGroup();

      int getGroup();

      boolean hasZone();

      int getZone();
   }

   public interface S2CR_EnterDuel_15714OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();
   }

   public interface S2CR_GodChoiceHero_15703OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getHeroUpCountList();

      CommonMsg.MapDataII getHeroUpCount(int index);

      int getHeroUpCountCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getHeroUpCountOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getHeroUpCountOrBuilder(int index);
   }

   public interface S2S_NotifyDelResource_15731OrBuilder extends MessageOrBuilder {
      boolean hasWagerInx();

      int getWagerInx();
   }

   public interface S2S_PlayerLogout_15738OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_SendGuessAward_15732OrBuilder extends MessageOrBuilder {
      boolean hasWagerInx();

      int getWagerInx();

      List<Integer> getAwardTypesList();

      int getAwardTypesCount();

      int getAwardTypes(int index);
   }

   public interface S2S_SendRankAward_15730OrBuilder extends MessageOrBuilder {
      boolean hasAwardId();

      int getAwardId();

      boolean hasRank();

      int getRank();

      boolean hasMedal();

      int getMedal();

      boolean hasType();

      int getType();
   }

   public interface S2S_sendArraying_15734OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2S_sendBossRank_15733OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasBossPoint();

      int getBossPoint();

      boolean hasSerialChampion();

      int getSerialChampion();
   }

   public interface S2S_sendGm_4599OrBuilder extends MessageOrBuilder {
      boolean hasGmOp();

      int getGmOp();
   }
}
