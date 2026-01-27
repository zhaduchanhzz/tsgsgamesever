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

public final class CrossDragonCaveMsg {
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_TeamUpload_25301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_UploadIntegral_25302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_ExploreMain_25303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_AtkSkip_25304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_Explore_25306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_Explore_25306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_EventHandle_25307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_UploadItem_25308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_UploadMap_25309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_UploadArraying_25311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_CR2S_BeKill_25312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_AddEnergy_25313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_AtkCooperation_25314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_Rank_25315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_Rank_25315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_Logs_25316_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_Logs_25316_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_Cooperation_25317_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_MakeCooperation_25318_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_S2CR_Energy_25319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_S2CR_Energy_25319_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_CR2S_EventHandle_25320_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_CR2S_AtkCooperation_25321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDragonCave_CR2S_Explore_25322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDragonCave_CR2S_Explore_25322_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossDragonCaveMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015CrossDragonCave.proto\u0012\u000fcrossDragonCave\u001a\fcommon.proto\u001a\fBattle.proto\u001a\u0010DragonCave.proto\"l\n\u0015S2CR_TeamUpload_25301\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bteamName\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007captain\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007players\u0018\u0004 \u0003(\u0005\u0012\u000f\n\u0007dismiss\u0018\u0005 \u0002(\b\"-\n\u0019S2CR_UploadIntegral_25302\u0012\u0010\n\bintegral\u0018\u0001 \u0002(\u0005\"@\n\u0016S2CR_ExploreMain_25303\u0012&\n\u000bkillMonster\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"\u0014\n\u0012S2CR_AtkSkip_25304\"\u0014\n\u0012S2CR_Explore_25306\"R\n\u0016S2CR_EventHandle_25307\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\u0012&\n\fpropertyItem\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"%\n\u0015S2CR_UploadItem_25308\u0012\f\n\u0004item\u0018\u0001 \u0002(\u0005\"%\n\u0014S2CR_UploadMap_25309\u0012\r\n\u0005mapId\u0018\u0001 \u0002(\u0005\"G\n\u001dS2CR_UploadPropertyItem_25310\u0012&\n\fpropertyItem\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\"-\n\u0019S2CR_UploadArraying_25311\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\"k\n\u0011CR2S_BeKill_25312\u0012\f\n\u0004item\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fpropertyItem\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006damage\u0018\u0003 \u0002(\u0003\u0012\u0011\n\tatkServer\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007atkName\u0018\u0005 \u0002(\t\"&\n\u0014S2CR_AddEnergy_25313\u0012\u000e\n\u0006energy\u0018\u0001 \u0002(\u0005\"-\n\u0019S2CR_AtkCooperation_25314\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"5\n\u000fS2CR_Rank_25315\u0012\"\n\u0004type\u0018\u0001 \u0002(\u000e2\u0014.dragonCave.RankType\"\u001f\n\u000fS2CR_Logs_25316\u0012\f\n\u0004mine\u0018\u0001 \u0002(\b\"\u0018\n\u0016S2CR_Cooperation_25317\"\u001c\n\u001aS2CR_MakeCooperation_25318\"\u0013\n\u0011S2CR_Energy_25319\"®\u0001\n\u0016CR2S_EventHandle_25320\u0012 \n\u0005event\u0018\u0001 \u0002(\u000b2\u0011.dragonCave.Event\u0012 \n\u0006reward\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u000f\n\u0007boxType\u0018\u0003 \u0001(\u0005\u0012?\n\u0006battle\u0018\u0004 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"\u00ad\u0001\n\u0019CR2S_AtkCooperation_25321\u0012 \n\u0005event\u0018\u0001 \u0002(\u000b2\u0011.dragonCave.Event\u0012 \n\u0006reward\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\u0012?\n\u0006battle\u0018\u0004 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"@\n\u0012CR2S_Explore_25322\u0012*\n\u0003msg\u0018\u0001 \u0002(\u000b2\u001d.dragonCave.S2C_Explore_25246B)\n\u0011com.gzbz.protobufB\u0012CrossDragonCaveMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor(), DragonCaveMsg.getDescriptor()});
      internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossDragonCave_S2CR_TeamUpload_25301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor, new String[]{"TeamId", "TeamName", "Captain", "Players", "Dismiss"});
      internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossDragonCave_S2CR_UploadIntegral_25302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor, new String[]{"Integral"});
      internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossDragonCave_S2CR_ExploreMain_25303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor, new String[]{"KillMonster"});
      internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossDragonCave_S2CR_AtkSkip_25304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor, new String[0]);
      internal_static_crossDragonCave_S2CR_Explore_25306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossDragonCave_S2CR_Explore_25306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_Explore_25306_descriptor, new String[0]);
      internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossDragonCave_S2CR_EventHandle_25307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor, new String[]{"Arraying", "PropertyItem"});
      internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossDragonCave_S2CR_UploadItem_25308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor, new String[]{"Item"});
      internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossDragonCave_S2CR_UploadMap_25309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor, new String[]{"MapId"});
      internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor, new String[]{"PropertyItem"});
      internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossDragonCave_S2CR_UploadArraying_25311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor, new String[]{"Arraying"});
      internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossDragonCave_CR2S_BeKill_25312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor, new String[]{"Item", "PropertyItem", "Damage", "AtkServer", "AtkName"});
      internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossDragonCave_S2CR_AddEnergy_25313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor, new String[]{"Energy"});
      internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossDragonCave_S2CR_AtkCooperation_25314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor, new String[]{"PlayerId"});
      internal_static_crossDragonCave_S2CR_Rank_25315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossDragonCave_S2CR_Rank_25315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_Rank_25315_descriptor, new String[]{"Type"});
      internal_static_crossDragonCave_S2CR_Logs_25316_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossDragonCave_S2CR_Logs_25316_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_Logs_25316_descriptor, new String[]{"Mine"});
      internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossDragonCave_S2CR_Cooperation_25317_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor, new String[0]);
      internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossDragonCave_S2CR_MakeCooperation_25318_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor, new String[0]);
      internal_static_crossDragonCave_S2CR_Energy_25319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossDragonCave_S2CR_Energy_25319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_S2CR_Energy_25319_descriptor, new String[0]);
      internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossDragonCave_CR2S_EventHandle_25320_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor, new String[]{"Event", "Reward", "BoxType", "Battle"});
      internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossDragonCave_CR2S_AtkCooperation_25321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor, new String[]{"Event", "Reward", "Num", "Battle"});
      internal_static_crossDragonCave_CR2S_Explore_25322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossDragonCave_CR2S_Explore_25322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDragonCave_CR2S_Explore_25322_descriptor, new String[]{"Msg"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
      DragonCaveMsg.getDescriptor();
   }

   public static final class S2CR_TeamUpload_25301 extends GeneratedMessageV3 implements S2CR_TeamUpload_25301OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int TEAMNAME_FIELD_NUMBER = 2;
      private volatile Object teamName_;
      public static final int CAPTAIN_FIELD_NUMBER = 3;
      private int captain_;
      public static final int PLAYERS_FIELD_NUMBER = 4;
      private Internal.IntList players_;
      public static final int DISMISS_FIELD_NUMBER = 5;
      private boolean dismiss_;
      private byte memoizedIsInitialized;
      private static final S2CR_TeamUpload_25301 DEFAULT_INSTANCE = new S2CR_TeamUpload_25301();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TeamUpload_25301> PARSER = new AbstractParser<S2CR_TeamUpload_25301>() {
         public S2CR_TeamUpload_25301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TeamUpload_25301(input, extensionRegistry);
         }
      };

      private S2CR_TeamUpload_25301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TeamUpload_25301() {
         this.memoizedIsInitialized = -1;
         this.teamName_ = "";
         this.players_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TeamUpload_25301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TeamUpload_25301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamId_ = input.readInt32();
                        continue;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.teamName_ = bs;
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.captain_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.players_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.players_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.players_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dismiss_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.players_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.players_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_TeamUpload_25301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamUpload_25301.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasTeamName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getTeamName() {
         Object ref = this.teamName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.teamName_ = s;
            }

            return s;
         }
      }

      public ByteString getTeamNameBytes() {
         Object ref = this.teamName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.teamName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCaptain() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCaptain() {
         return this.captain_;
      }

      public List<Integer> getPlayersList() {
         return this.players_;
      }

      public int getPlayersCount() {
         return this.players_.size();
      }

      public int getPlayers(int index) {
         return this.players_.getInt(index);
      }

      public boolean hasDismiss() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getDismiss() {
         return this.dismiss_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDismiss()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.teamId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.teamName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.captain_);
         }

         for(int i = 0; i < this.players_.size(); ++i) {
            output.writeInt32(4, this.players_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(5, this.dismiss_);
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
               size += CodedOutputStream.computeInt32Size(1, this.teamId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.teamName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.captain_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.players_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.players_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayersList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.dismiss_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TeamUpload_25301)) {
            return super.equals(obj);
         } else {
            S2CR_TeamUpload_25301 other = (S2CR_TeamUpload_25301)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasTeamName() != other.hasTeamName()) {
               return false;
            } else if (this.hasTeamName() && !this.getTeamName().equals(other.getTeamName())) {
               return false;
            } else if (this.hasCaptain() != other.hasCaptain()) {
               return false;
            } else if (this.hasCaptain() && this.getCaptain() != other.getCaptain()) {
               return false;
            } else if (!this.getPlayersList().equals(other.getPlayersList())) {
               return false;
            } else if (this.hasDismiss() != other.hasDismiss()) {
               return false;
            } else if (this.hasDismiss() && this.getDismiss() != other.getDismiss()) {
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
            if (this.hasTeamId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamId();
            }

            if (this.hasTeamName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamName().hashCode();
            }

            if (this.hasCaptain()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCaptain();
            }

            if (this.getPlayersCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayersList().hashCode();
            }

            if (this.hasDismiss()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getDismiss());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TeamUpload_25301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data);
      }

      public static S2CR_TeamUpload_25301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamUpload_25301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data);
      }

      public static S2CR_TeamUpload_25301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamUpload_25301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data);
      }

      public static S2CR_TeamUpload_25301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamUpload_25301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamUpload_25301 parseFrom(InputStream input) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamUpload_25301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamUpload_25301 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TeamUpload_25301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamUpload_25301 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamUpload_25301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamUpload_25301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TeamUpload_25301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TeamUpload_25301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TeamUpload_25301> parser() {
         return PARSER;
      }

      public Parser<S2CR_TeamUpload_25301> getParserForType() {
         return PARSER;
      }

      public S2CR_TeamUpload_25301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TeamUpload_25301OrBuilder {
         private int bitField0_;
         private int teamId_;
         private Object teamName_;
         private int captain_;
         private Internal.IntList players_;
         private boolean dismiss_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_TeamUpload_25301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamUpload_25301.class, Builder.class);
         }

         private Builder() {
            this.teamName_ = "";
            this.players_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamName_ = "";
            this.players_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_TeamUpload_25301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.teamName_ = "";
            this.bitField0_ &= -3;
            this.captain_ = 0;
            this.bitField0_ &= -5;
            this.players_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.emptyIntList();
            this.bitField0_ &= -9;
            this.dismiss_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_TeamUpload_25301_descriptor;
         }

         public S2CR_TeamUpload_25301 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_TeamUpload_25301.getDefaultInstance();
         }

         public S2CR_TeamUpload_25301 build() {
            S2CR_TeamUpload_25301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TeamUpload_25301 buildPartial() {
            S2CR_TeamUpload_25301 result = new S2CR_TeamUpload_25301(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.teamName_ = this.teamName_;
            if ((from_bitField0_ & 4) != 0) {
               result.captain_ = this.captain_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.players_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.players_ = this.players_;
            if ((from_bitField0_ & 16) != 0) {
               result.dismiss_ = this.dismiss_;
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
            if (other instanceof S2CR_TeamUpload_25301) {
               return this.mergeFrom((S2CR_TeamUpload_25301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TeamUpload_25301 other) {
            if (other == CrossDragonCaveMsg.S2CR_TeamUpload_25301.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasTeamName()) {
                  this.bitField0_ |= 2;
                  this.teamName_ = other.teamName_;
                  this.onChanged();
               }

               if (other.hasCaptain()) {
                  this.setCaptain(other.getCaptain());
               }

               if (!other.players_.isEmpty()) {
                  if (this.players_.isEmpty()) {
                     this.players_ = other.players_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensurePlayersIsMutable();
                     this.players_.addAll(other.players_);
                  }

                  this.onChanged();
               }

               if (other.hasDismiss()) {
                  this.setDismiss(other.getDismiss());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               return this.hasDismiss();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TeamUpload_25301 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TeamUpload_25301)CrossDragonCaveMsg.S2CR_TeamUpload_25301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TeamUpload_25301)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTeamId() {
            return this.teamId_;
         }

         public Builder setTeamId(int value) {
            this.bitField0_ |= 1;
            this.teamId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamId() {
            this.bitField0_ &= -2;
            this.teamId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getTeamName() {
            Object ref = this.teamName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.teamName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTeamNameBytes() {
            Object ref = this.teamName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.teamName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setTeamName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearTeamName() {
            this.bitField0_ &= -3;
            this.teamName_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.getDefaultInstance().getTeamName();
            this.onChanged();
            return this;
         }

         public Builder setTeamNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCaptain() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCaptain() {
            return this.captain_;
         }

         public Builder setCaptain(int value) {
            this.bitField0_ |= 4;
            this.captain_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCaptain() {
            this.bitField0_ &= -5;
            this.captain_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayersIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.players_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.mutableCopy(this.players_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getPlayersList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.players_) : this.players_);
         }

         public int getPlayersCount() {
            return this.players_.size();
         }

         public int getPlayers(int index) {
            return this.players_.getInt(index);
         }

         public Builder setPlayers(int index, int value) {
            this.ensurePlayersIsMutable();
            this.players_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPlayers(int value) {
            this.ensurePlayersIsMutable();
            this.players_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPlayers(Iterable<? extends Integer> values) {
            this.ensurePlayersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.players_);
            this.onChanged();
            return this;
         }

         public Builder clearPlayers() {
            this.players_ = CrossDragonCaveMsg.S2CR_TeamUpload_25301.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasDismiss() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getDismiss() {
            return this.dismiss_;
         }

         public Builder setDismiss(boolean value) {
            this.bitField0_ |= 16;
            this.dismiss_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDismiss() {
            this.bitField0_ &= -17;
            this.dismiss_ = false;
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

   public static final class S2CR_UploadIntegral_25302 extends GeneratedMessageV3 implements S2CR_UploadIntegral_25302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INTEGRAL_FIELD_NUMBER = 1;
      private int integral_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadIntegral_25302 DEFAULT_INSTANCE = new S2CR_UploadIntegral_25302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadIntegral_25302> PARSER = new AbstractParser<S2CR_UploadIntegral_25302>() {
         public S2CR_UploadIntegral_25302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadIntegral_25302(input, extensionRegistry);
         }
      };

      private S2CR_UploadIntegral_25302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadIntegral_25302() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadIntegral_25302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadIntegral_25302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.integral_ = input.readInt32();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadIntegral_25302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadIntegral_25302.class, Builder.class);
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIntegral() {
         return this.integral_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIntegral()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.integral_);
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
               size += CodedOutputStream.computeInt32Size(1, this.integral_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadIntegral_25302)) {
            return super.equals(obj);
         } else {
            S2CR_UploadIntegral_25302 other = (S2CR_UploadIntegral_25302)obj;
            if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
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
            if (this.hasIntegral()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIntegral();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadIntegral_25302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadIntegral_25302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadIntegral_25302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadIntegral_25302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadIntegral_25302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadIntegral_25302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadIntegral_25302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadIntegral_25302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadIntegral_25302> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadIntegral_25302> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadIntegral_25302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadIntegral_25302OrBuilder {
         private int bitField0_;
         private int integral_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadIntegral_25302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadIntegral_25302.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_UploadIntegral_25302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.integral_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadIntegral_25302_descriptor;
         }

         public S2CR_UploadIntegral_25302 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_UploadIntegral_25302.getDefaultInstance();
         }

         public S2CR_UploadIntegral_25302 build() {
            S2CR_UploadIntegral_25302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadIntegral_25302 buildPartial() {
            S2CR_UploadIntegral_25302 result = new S2CR_UploadIntegral_25302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.integral_ = this.integral_;
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
            if (other instanceof S2CR_UploadIntegral_25302) {
               return this.mergeFrom((S2CR_UploadIntegral_25302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadIntegral_25302 other) {
            if (other == CrossDragonCaveMsg.S2CR_UploadIntegral_25302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIntegral();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadIntegral_25302 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadIntegral_25302)CrossDragonCaveMsg.S2CR_UploadIntegral_25302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadIntegral_25302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(int value) {
            this.bitField0_ |= 1;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -2;
            this.integral_ = 0;
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

   public static final class S2CR_ExploreMain_25303 extends GeneratedMessageV3 implements S2CR_ExploreMain_25303OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int KILLMONSTER_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> killMonster_;
      private byte memoizedIsInitialized;
      private static final S2CR_ExploreMain_25303 DEFAULT_INSTANCE = new S2CR_ExploreMain_25303();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ExploreMain_25303> PARSER = new AbstractParser<S2CR_ExploreMain_25303>() {
         public S2CR_ExploreMain_25303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ExploreMain_25303(input, extensionRegistry);
         }
      };

      private S2CR_ExploreMain_25303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ExploreMain_25303() {
         this.memoizedIsInitialized = -1;
         this.killMonster_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ExploreMain_25303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ExploreMain_25303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.killMonster_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.killMonster_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.killMonster_ = Collections.unmodifiableList(this.killMonster_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_ExploreMain_25303_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ExploreMain_25303.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getKillMonsterList() {
         return this.killMonster_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getKillMonsterOrBuilderList() {
         return this.killMonster_;
      }

      public int getKillMonsterCount() {
         return this.killMonster_.size();
      }

      public CommonMsg.MapDataII getKillMonster(int index) {
         return (CommonMsg.MapDataII)this.killMonster_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getKillMonsterOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.killMonster_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getKillMonsterCount(); ++i) {
               if (!this.getKillMonster(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.killMonster_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.killMonster_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.killMonster_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.killMonster_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ExploreMain_25303)) {
            return super.equals(obj);
         } else {
            S2CR_ExploreMain_25303 other = (S2CR_ExploreMain_25303)obj;
            if (!this.getKillMonsterList().equals(other.getKillMonsterList())) {
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
            if (this.getKillMonsterCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getKillMonsterList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ExploreMain_25303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data);
      }

      public static S2CR_ExploreMain_25303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ExploreMain_25303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data);
      }

      public static S2CR_ExploreMain_25303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ExploreMain_25303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data);
      }

      public static S2CR_ExploreMain_25303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ExploreMain_25303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ExploreMain_25303 parseFrom(InputStream input) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ExploreMain_25303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ExploreMain_25303 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ExploreMain_25303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ExploreMain_25303 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ExploreMain_25303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ExploreMain_25303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ExploreMain_25303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ExploreMain_25303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ExploreMain_25303> parser() {
         return PARSER;
      }

      public Parser<S2CR_ExploreMain_25303> getParserForType() {
         return PARSER;
      }

      public S2CR_ExploreMain_25303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ExploreMain_25303OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> killMonster_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> killMonsterBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_ExploreMain_25303_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ExploreMain_25303.class, Builder.class);
         }

         private Builder() {
            this.killMonster_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.killMonster_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_ExploreMain_25303.alwaysUseFieldBuilders) {
               this.getKillMonsterFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.killMonsterBuilder_ == null) {
               this.killMonster_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.killMonsterBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_ExploreMain_25303_descriptor;
         }

         public S2CR_ExploreMain_25303 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_ExploreMain_25303.getDefaultInstance();
         }

         public S2CR_ExploreMain_25303 build() {
            S2CR_ExploreMain_25303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ExploreMain_25303 buildPartial() {
            S2CR_ExploreMain_25303 result = new S2CR_ExploreMain_25303(this);
            int from_bitField0_ = this.bitField0_;
            if (this.killMonsterBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.killMonster_ = Collections.unmodifiableList(this.killMonster_);
                  this.bitField0_ &= -2;
               }

               result.killMonster_ = this.killMonster_;
            } else {
               result.killMonster_ = this.killMonsterBuilder_.build();
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
            if (other instanceof S2CR_ExploreMain_25303) {
               return this.mergeFrom((S2CR_ExploreMain_25303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ExploreMain_25303 other) {
            if (other == CrossDragonCaveMsg.S2CR_ExploreMain_25303.getDefaultInstance()) {
               return this;
            } else {
               if (this.killMonsterBuilder_ == null) {
                  if (!other.killMonster_.isEmpty()) {
                     if (this.killMonster_.isEmpty()) {
                        this.killMonster_ = other.killMonster_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureKillMonsterIsMutable();
                        this.killMonster_.addAll(other.killMonster_);
                     }

                     this.onChanged();
                  }
               } else if (!other.killMonster_.isEmpty()) {
                  if (this.killMonsterBuilder_.isEmpty()) {
                     this.killMonsterBuilder_.dispose();
                     this.killMonsterBuilder_ = null;
                     this.killMonster_ = other.killMonster_;
                     this.bitField0_ &= -2;
                     this.killMonsterBuilder_ = CrossDragonCaveMsg.S2CR_ExploreMain_25303.alwaysUseFieldBuilders ? this.getKillMonsterFieldBuilder() : null;
                  } else {
                     this.killMonsterBuilder_.addAllMessages(other.killMonster_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getKillMonsterCount(); ++i) {
               if (!this.getKillMonster(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ExploreMain_25303 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ExploreMain_25303)CrossDragonCaveMsg.S2CR_ExploreMain_25303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ExploreMain_25303)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureKillMonsterIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.killMonster_ = new ArrayList(this.killMonster_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getKillMonsterList() {
            return this.killMonsterBuilder_ == null ? Collections.unmodifiableList(this.killMonster_) : this.killMonsterBuilder_.getMessageList();
         }

         public int getKillMonsterCount() {
            return this.killMonsterBuilder_ == null ? this.killMonster_.size() : this.killMonsterBuilder_.getCount();
         }

         public CommonMsg.MapDataII getKillMonster(int index) {
            return this.killMonsterBuilder_ == null ? (CommonMsg.MapDataII)this.killMonster_.get(index) : (CommonMsg.MapDataII)this.killMonsterBuilder_.getMessage(index);
         }

         public Builder setKillMonster(int index, CommonMsg.MapDataII value) {
            if (this.killMonsterBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureKillMonsterIsMutable();
               this.killMonster_.set(index, value);
               this.onChanged();
            } else {
               this.killMonsterBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setKillMonster(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.killMonsterBuilder_ == null) {
               this.ensureKillMonsterIsMutable();
               this.killMonster_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.killMonsterBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addKillMonster(CommonMsg.MapDataII value) {
            if (this.killMonsterBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureKillMonsterIsMutable();
               this.killMonster_.add(value);
               this.onChanged();
            } else {
               this.killMonsterBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addKillMonster(int index, CommonMsg.MapDataII value) {
            if (this.killMonsterBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureKillMonsterIsMutable();
               this.killMonster_.add(index, value);
               this.onChanged();
            } else {
               this.killMonsterBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addKillMonster(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.killMonsterBuilder_ == null) {
               this.ensureKillMonsterIsMutable();
               this.killMonster_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.killMonsterBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addKillMonster(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.killMonsterBuilder_ == null) {
               this.ensureKillMonsterIsMutable();
               this.killMonster_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.killMonsterBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllKillMonster(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.killMonsterBuilder_ == null) {
               this.ensureKillMonsterIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.killMonster_);
               this.onChanged();
            } else {
               this.killMonsterBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearKillMonster() {
            if (this.killMonsterBuilder_ == null) {
               this.killMonster_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.killMonsterBuilder_.clear();
            }

            return this;
         }

         public Builder removeKillMonster(int index) {
            if (this.killMonsterBuilder_ == null) {
               this.ensureKillMonsterIsMutable();
               this.killMonster_.remove(index);
               this.onChanged();
            } else {
               this.killMonsterBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getKillMonsterBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getKillMonsterFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getKillMonsterOrBuilder(int index) {
            return this.killMonsterBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.killMonster_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.killMonsterBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getKillMonsterOrBuilderList() {
            return this.killMonsterBuilder_ != null ? this.killMonsterBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.killMonster_);
         }

         public CommonMsg.MapDataII.Builder addKillMonsterBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getKillMonsterFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addKillMonsterBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getKillMonsterFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getKillMonsterBuilderList() {
            return this.getKillMonsterFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getKillMonsterFieldBuilder() {
            if (this.killMonsterBuilder_ == null) {
               this.killMonsterBuilder_ = new RepeatedFieldBuilderV3(this.killMonster_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.killMonster_ = null;
            }

            return this.killMonsterBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AtkSkip_25304 extends GeneratedMessageV3 implements S2CR_AtkSkip_25304OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_AtkSkip_25304 DEFAULT_INSTANCE = new S2CR_AtkSkip_25304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AtkSkip_25304> PARSER = new AbstractParser<S2CR_AtkSkip_25304>() {
         public S2CR_AtkSkip_25304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AtkSkip_25304(input, extensionRegistry);
         }
      };

      private S2CR_AtkSkip_25304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AtkSkip_25304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AtkSkip_25304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AtkSkip_25304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkSkip_25304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkSkip_25304.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_AtkSkip_25304)) {
            return super.equals(obj);
         } else {
            S2CR_AtkSkip_25304 other = (S2CR_AtkSkip_25304)obj;
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

      public static S2CR_AtkSkip_25304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data);
      }

      public static S2CR_AtkSkip_25304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkSkip_25304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data);
      }

      public static S2CR_AtkSkip_25304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkSkip_25304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data);
      }

      public static S2CR_AtkSkip_25304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkSkip_25304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkSkip_25304 parseFrom(InputStream input) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkSkip_25304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkSkip_25304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AtkSkip_25304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkSkip_25304 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkSkip_25304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkSkip_25304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AtkSkip_25304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AtkSkip_25304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AtkSkip_25304> parser() {
         return PARSER;
      }

      public Parser<S2CR_AtkSkip_25304> getParserForType() {
         return PARSER;
      }

      public S2CR_AtkSkip_25304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AtkSkip_25304OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkSkip_25304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkSkip_25304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_AtkSkip_25304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkSkip_25304_descriptor;
         }

         public S2CR_AtkSkip_25304 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_AtkSkip_25304.getDefaultInstance();
         }

         public S2CR_AtkSkip_25304 build() {
            S2CR_AtkSkip_25304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AtkSkip_25304 buildPartial() {
            S2CR_AtkSkip_25304 result = new S2CR_AtkSkip_25304(this);
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
            if (other instanceof S2CR_AtkSkip_25304) {
               return this.mergeFrom((S2CR_AtkSkip_25304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AtkSkip_25304 other) {
            if (other == CrossDragonCaveMsg.S2CR_AtkSkip_25304.getDefaultInstance()) {
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
            S2CR_AtkSkip_25304 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AtkSkip_25304)CrossDragonCaveMsg.S2CR_AtkSkip_25304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AtkSkip_25304)e.getUnfinishedMessage();
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

   public static final class S2CR_Explore_25306 extends GeneratedMessageV3 implements S2CR_Explore_25306OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_Explore_25306 DEFAULT_INSTANCE = new S2CR_Explore_25306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Explore_25306> PARSER = new AbstractParser<S2CR_Explore_25306>() {
         public S2CR_Explore_25306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Explore_25306(input, extensionRegistry);
         }
      };

      private S2CR_Explore_25306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Explore_25306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Explore_25306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Explore_25306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Explore_25306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Explore_25306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Explore_25306.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Explore_25306)) {
            return super.equals(obj);
         } else {
            S2CR_Explore_25306 other = (S2CR_Explore_25306)obj;
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

      public static S2CR_Explore_25306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data);
      }

      public static S2CR_Explore_25306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Explore_25306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data);
      }

      public static S2CR_Explore_25306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Explore_25306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data);
      }

      public static S2CR_Explore_25306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Explore_25306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Explore_25306 parseFrom(InputStream input) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Explore_25306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Explore_25306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Explore_25306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Explore_25306 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Explore_25306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Explore_25306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Explore_25306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Explore_25306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Explore_25306> parser() {
         return PARSER;
      }

      public Parser<S2CR_Explore_25306> getParserForType() {
         return PARSER;
      }

      public S2CR_Explore_25306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Explore_25306OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Explore_25306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Explore_25306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Explore_25306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_Explore_25306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Explore_25306_descriptor;
         }

         public S2CR_Explore_25306 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_Explore_25306.getDefaultInstance();
         }

         public S2CR_Explore_25306 build() {
            S2CR_Explore_25306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Explore_25306 buildPartial() {
            S2CR_Explore_25306 result = new S2CR_Explore_25306(this);
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
            if (other instanceof S2CR_Explore_25306) {
               return this.mergeFrom((S2CR_Explore_25306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Explore_25306 other) {
            if (other == CrossDragonCaveMsg.S2CR_Explore_25306.getDefaultInstance()) {
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
            S2CR_Explore_25306 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Explore_25306)CrossDragonCaveMsg.S2CR_Explore_25306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Explore_25306)e.getUnfinishedMessage();
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

   public static final class S2CR_EventHandle_25307 extends GeneratedMessageV3 implements S2CR_EventHandle_25307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      public static final int PROPERTYITEM_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> propertyItem_;
      private byte memoizedIsInitialized;
      private static final S2CR_EventHandle_25307 DEFAULT_INSTANCE = new S2CR_EventHandle_25307();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_EventHandle_25307> PARSER = new AbstractParser<S2CR_EventHandle_25307>() {
         public S2CR_EventHandle_25307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_EventHandle_25307(input, extensionRegistry);
         }
      };

      private S2CR_EventHandle_25307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_EventHandle_25307() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
         this.propertyItem_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_EventHandle_25307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_EventHandle_25307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.arraying_ = input.readBytes();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.propertyItem_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.propertyItem_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.propertyItem_ = Collections.unmodifiableList(this.propertyItem_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_EventHandle_25307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EventHandle_25307.class, Builder.class);
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public List<CommonMsg.ItemInfo> getPropertyItemList() {
         return this.propertyItem_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList() {
         return this.propertyItem_;
      }

      public int getPropertyItemCount() {
         return this.propertyItem_.size();
      }

      public CommonMsg.ItemInfo getPropertyItem(int index) {
         return (CommonMsg.ItemInfo)this.propertyItem_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.propertyItem_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertyItemCount(); ++i) {
               if (!this.getPropertyItem(i).isInitialized()) {
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
            output.writeBytes(1, this.arraying_);
         }

         for(int i = 0; i < this.propertyItem_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.propertyItem_.get(i));
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
               size += CodedOutputStream.computeBytesSize(1, this.arraying_);
            }

            for(int i = 0; i < this.propertyItem_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.propertyItem_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_EventHandle_25307)) {
            return super.equals(obj);
         } else {
            S2CR_EventHandle_25307 other = (S2CR_EventHandle_25307)obj;
            if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (!this.getPropertyItemList().equals(other.getPropertyItemList())) {
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
            if (this.hasArraying()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.getPropertyItemCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPropertyItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_EventHandle_25307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data);
      }

      public static S2CR_EventHandle_25307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EventHandle_25307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data);
      }

      public static S2CR_EventHandle_25307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EventHandle_25307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data);
      }

      public static S2CR_EventHandle_25307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EventHandle_25307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EventHandle_25307 parseFrom(InputStream input) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EventHandle_25307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EventHandle_25307 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_EventHandle_25307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EventHandle_25307 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EventHandle_25307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EventHandle_25307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_EventHandle_25307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_EventHandle_25307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_EventHandle_25307> parser() {
         return PARSER;
      }

      public Parser<S2CR_EventHandle_25307> getParserForType() {
         return PARSER;
      }

      public S2CR_EventHandle_25307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_EventHandle_25307OrBuilder {
         private int bitField0_;
         private ByteString arraying_;
         private List<CommonMsg.ItemInfo> propertyItem_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> propertyItemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_EventHandle_25307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EventHandle_25307.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = ByteString.EMPTY;
            this.propertyItem_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = ByteString.EMPTY;
            this.propertyItem_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_EventHandle_25307.alwaysUseFieldBuilders) {
               this.getPropertyItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            if (this.propertyItemBuilder_ == null) {
               this.propertyItem_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyItemBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_EventHandle_25307_descriptor;
         }

         public S2CR_EventHandle_25307 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_EventHandle_25307.getDefaultInstance();
         }

         public S2CR_EventHandle_25307 build() {
            S2CR_EventHandle_25307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_EventHandle_25307 buildPartial() {
            S2CR_EventHandle_25307 result = new S2CR_EventHandle_25307(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arraying_ = this.arraying_;
            if (this.propertyItemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.propertyItem_ = Collections.unmodifiableList(this.propertyItem_);
                  this.bitField0_ &= -3;
               }

               result.propertyItem_ = this.propertyItem_;
            } else {
               result.propertyItem_ = this.propertyItemBuilder_.build();
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
            if (other instanceof S2CR_EventHandle_25307) {
               return this.mergeFrom((S2CR_EventHandle_25307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_EventHandle_25307 other) {
            if (other == CrossDragonCaveMsg.S2CR_EventHandle_25307.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (this.propertyItemBuilder_ == null) {
                  if (!other.propertyItem_.isEmpty()) {
                     if (this.propertyItem_.isEmpty()) {
                        this.propertyItem_ = other.propertyItem_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyItemIsMutable();
                        this.propertyItem_.addAll(other.propertyItem_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyItem_.isEmpty()) {
                  if (this.propertyItemBuilder_.isEmpty()) {
                     this.propertyItemBuilder_.dispose();
                     this.propertyItemBuilder_ = null;
                     this.propertyItem_ = other.propertyItem_;
                     this.bitField0_ &= -3;
                     this.propertyItemBuilder_ = CrossDragonCaveMsg.S2CR_EventHandle_25307.alwaysUseFieldBuilders ? this.getPropertyItemFieldBuilder() : null;
                  } else {
                     this.propertyItemBuilder_.addAllMessages(other.propertyItem_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArraying()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyItemCount(); ++i) {
                  if (!this.getPropertyItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_EventHandle_25307 parsedMessage = null;

            try {
               parsedMessage = (S2CR_EventHandle_25307)CrossDragonCaveMsg.S2CR_EventHandle_25307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_EventHandle_25307)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -2;
            this.arraying_ = CrossDragonCaveMsg.S2CR_EventHandle_25307.getDefaultInstance().getArraying();
            this.onChanged();
            return this;
         }

         private void ensurePropertyItemIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.propertyItem_ = new ArrayList(this.propertyItem_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getPropertyItemList() {
            return this.propertyItemBuilder_ == null ? Collections.unmodifiableList(this.propertyItem_) : this.propertyItemBuilder_.getMessageList();
         }

         public int getPropertyItemCount() {
            return this.propertyItemBuilder_ == null ? this.propertyItem_.size() : this.propertyItemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getPropertyItem(int index) {
            return this.propertyItemBuilder_ == null ? (CommonMsg.ItemInfo)this.propertyItem_.get(index) : (CommonMsg.ItemInfo)this.propertyItemBuilder_.getMessage(index);
         }

         public Builder setPropertyItem(int index, CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.set(index, value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyItem(CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyItem(int index, CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(index, value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyItem_);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyItem() {
            if (this.propertyItemBuilder_ == null) {
               this.propertyItem_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyItemBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyItem(int index) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.remove(index);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getPropertyItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index) {
            return this.propertyItemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.propertyItem_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.propertyItemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList() {
            return this.propertyItemBuilder_ != null ? this.propertyItemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyItem_);
         }

         public CommonMsg.ItemInfo.Builder addPropertyItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addPropertyItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getPropertyItemBuilderList() {
            return this.getPropertyItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getPropertyItemFieldBuilder() {
            if (this.propertyItemBuilder_ == null) {
               this.propertyItemBuilder_ = new RepeatedFieldBuilderV3(this.propertyItem_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.propertyItem_ = null;
            }

            return this.propertyItemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadItem_25308 extends GeneratedMessageV3 implements S2CR_UploadItem_25308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEM_FIELD_NUMBER = 1;
      private int item_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadItem_25308 DEFAULT_INSTANCE = new S2CR_UploadItem_25308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadItem_25308> PARSER = new AbstractParser<S2CR_UploadItem_25308>() {
         public S2CR_UploadItem_25308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadItem_25308(input, extensionRegistry);
         }
      };

      private S2CR_UploadItem_25308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadItem_25308() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadItem_25308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadItem_25308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.item_ = input.readInt32();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadItem_25308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadItem_25308.class, Builder.class);
      }

      public boolean hasItem() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItem() {
         return this.item_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.item_);
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
               size += CodedOutputStream.computeInt32Size(1, this.item_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadItem_25308)) {
            return super.equals(obj);
         } else {
            S2CR_UploadItem_25308 other = (S2CR_UploadItem_25308)obj;
            if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && this.getItem() != other.getItem()) {
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
            if (this.hasItem()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItem();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadItem_25308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data);
      }

      public static S2CR_UploadItem_25308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadItem_25308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data);
      }

      public static S2CR_UploadItem_25308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadItem_25308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data);
      }

      public static S2CR_UploadItem_25308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadItem_25308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadItem_25308 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadItem_25308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadItem_25308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadItem_25308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadItem_25308 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadItem_25308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadItem_25308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadItem_25308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadItem_25308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadItem_25308> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadItem_25308> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadItem_25308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadItem_25308OrBuilder {
         private int bitField0_;
         private int item_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadItem_25308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadItem_25308.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_UploadItem_25308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.item_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadItem_25308_descriptor;
         }

         public S2CR_UploadItem_25308 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_UploadItem_25308.getDefaultInstance();
         }

         public S2CR_UploadItem_25308 build() {
            S2CR_UploadItem_25308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadItem_25308 buildPartial() {
            S2CR_UploadItem_25308 result = new S2CR_UploadItem_25308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.item_ = this.item_;
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
            if (other instanceof S2CR_UploadItem_25308) {
               return this.mergeFrom((S2CR_UploadItem_25308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadItem_25308 other) {
            if (other == CrossDragonCaveMsg.S2CR_UploadItem_25308.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItem()) {
                  this.setItem(other.getItem());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItem();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadItem_25308 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadItem_25308)CrossDragonCaveMsg.S2CR_UploadItem_25308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadItem_25308)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItem() {
            return this.item_;
         }

         public Builder setItem(int value) {
            this.bitField0_ |= 1;
            this.item_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItem() {
            this.bitField0_ &= -2;
            this.item_ = 0;
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

   public static final class S2CR_UploadMap_25309 extends GeneratedMessageV3 implements S2CR_UploadMap_25309OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAPID_FIELD_NUMBER = 1;
      private int mapId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadMap_25309 DEFAULT_INSTANCE = new S2CR_UploadMap_25309();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadMap_25309> PARSER = new AbstractParser<S2CR_UploadMap_25309>() {
         public S2CR_UploadMap_25309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadMap_25309(input, extensionRegistry);
         }
      };

      private S2CR_UploadMap_25309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadMap_25309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadMap_25309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadMap_25309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mapId_ = input.readInt32();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadMap_25309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadMap_25309.class, Builder.class);
      }

      public boolean hasMapId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMapId() {
         return this.mapId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMapId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mapId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mapId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadMap_25309)) {
            return super.equals(obj);
         } else {
            S2CR_UploadMap_25309 other = (S2CR_UploadMap_25309)obj;
            if (this.hasMapId() != other.hasMapId()) {
               return false;
            } else if (this.hasMapId() && this.getMapId() != other.getMapId()) {
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
            if (this.hasMapId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMapId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadMap_25309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMap_25309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMap_25309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMap_25309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMap_25309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMap_25309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMap_25309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMap_25309 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadMap_25309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadMap_25309 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadMap_25309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadMap_25309 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadMap_25309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMap_25309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadMap_25309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadMap_25309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadMap_25309> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadMap_25309> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadMap_25309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadMap_25309OrBuilder {
         private int bitField0_;
         private int mapId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadMap_25309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadMap_25309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_UploadMap_25309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mapId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadMap_25309_descriptor;
         }

         public S2CR_UploadMap_25309 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_UploadMap_25309.getDefaultInstance();
         }

         public S2CR_UploadMap_25309 build() {
            S2CR_UploadMap_25309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadMap_25309 buildPartial() {
            S2CR_UploadMap_25309 result = new S2CR_UploadMap_25309(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mapId_ = this.mapId_;
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
            if (other instanceof S2CR_UploadMap_25309) {
               return this.mergeFrom((S2CR_UploadMap_25309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadMap_25309 other) {
            if (other == CrossDragonCaveMsg.S2CR_UploadMap_25309.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMapId()) {
                  this.setMapId(other.getMapId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMapId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadMap_25309 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadMap_25309)CrossDragonCaveMsg.S2CR_UploadMap_25309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadMap_25309)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMapId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMapId() {
            return this.mapId_;
         }

         public Builder setMapId(int value) {
            this.bitField0_ |= 1;
            this.mapId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapId() {
            this.bitField0_ &= -2;
            this.mapId_ = 0;
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

   public static final class S2CR_UploadPropertyItem_25310 extends GeneratedMessageV3 implements S2CR_UploadPropertyItem_25310OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PROPERTYITEM_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> propertyItem_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadPropertyItem_25310 DEFAULT_INSTANCE = new S2CR_UploadPropertyItem_25310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadPropertyItem_25310> PARSER = new AbstractParser<S2CR_UploadPropertyItem_25310>() {
         public S2CR_UploadPropertyItem_25310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadPropertyItem_25310(input, extensionRegistry);
         }
      };

      private S2CR_UploadPropertyItem_25310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadPropertyItem_25310() {
         this.memoizedIsInitialized = -1;
         this.propertyItem_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadPropertyItem_25310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadPropertyItem_25310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.propertyItem_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.propertyItem_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.propertyItem_ = Collections.unmodifiableList(this.propertyItem_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadPropertyItem_25310.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getPropertyItemList() {
         return this.propertyItem_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList() {
         return this.propertyItem_;
      }

      public int getPropertyItemCount() {
         return this.propertyItem_.size();
      }

      public CommonMsg.ItemInfo getPropertyItem(int index) {
         return (CommonMsg.ItemInfo)this.propertyItem_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.propertyItem_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPropertyItemCount(); ++i) {
               if (!this.getPropertyItem(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.propertyItem_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.propertyItem_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.propertyItem_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.propertyItem_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadPropertyItem_25310)) {
            return super.equals(obj);
         } else {
            S2CR_UploadPropertyItem_25310 other = (S2CR_UploadPropertyItem_25310)obj;
            if (!this.getPropertyItemList().equals(other.getPropertyItemList())) {
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
            if (this.getPropertyItemCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPropertyItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPropertyItem_25310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadPropertyItem_25310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadPropertyItem_25310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadPropertyItem_25310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPropertyItem_25310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadPropertyItem_25310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadPropertyItem_25310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadPropertyItem_25310> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadPropertyItem_25310> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadPropertyItem_25310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadPropertyItem_25310OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> propertyItem_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> propertyItemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadPropertyItem_25310.class, Builder.class);
         }

         private Builder() {
            this.propertyItem_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyItem_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_UploadPropertyItem_25310.alwaysUseFieldBuilders) {
               this.getPropertyItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.propertyItemBuilder_ == null) {
               this.propertyItem_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.propertyItemBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadPropertyItem_25310_descriptor;
         }

         public S2CR_UploadPropertyItem_25310 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_UploadPropertyItem_25310.getDefaultInstance();
         }

         public S2CR_UploadPropertyItem_25310 build() {
            S2CR_UploadPropertyItem_25310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadPropertyItem_25310 buildPartial() {
            S2CR_UploadPropertyItem_25310 result = new S2CR_UploadPropertyItem_25310(this);
            int from_bitField0_ = this.bitField0_;
            if (this.propertyItemBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.propertyItem_ = Collections.unmodifiableList(this.propertyItem_);
                  this.bitField0_ &= -2;
               }

               result.propertyItem_ = this.propertyItem_;
            } else {
               result.propertyItem_ = this.propertyItemBuilder_.build();
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
            if (other instanceof S2CR_UploadPropertyItem_25310) {
               return this.mergeFrom((S2CR_UploadPropertyItem_25310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadPropertyItem_25310 other) {
            if (other == CrossDragonCaveMsg.S2CR_UploadPropertyItem_25310.getDefaultInstance()) {
               return this;
            } else {
               if (this.propertyItemBuilder_ == null) {
                  if (!other.propertyItem_.isEmpty()) {
                     if (this.propertyItem_.isEmpty()) {
                        this.propertyItem_ = other.propertyItem_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePropertyItemIsMutable();
                        this.propertyItem_.addAll(other.propertyItem_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyItem_.isEmpty()) {
                  if (this.propertyItemBuilder_.isEmpty()) {
                     this.propertyItemBuilder_.dispose();
                     this.propertyItemBuilder_ = null;
                     this.propertyItem_ = other.propertyItem_;
                     this.bitField0_ &= -2;
                     this.propertyItemBuilder_ = CrossDragonCaveMsg.S2CR_UploadPropertyItem_25310.alwaysUseFieldBuilders ? this.getPropertyItemFieldBuilder() : null;
                  } else {
                     this.propertyItemBuilder_.addAllMessages(other.propertyItem_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPropertyItemCount(); ++i) {
               if (!this.getPropertyItem(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadPropertyItem_25310 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadPropertyItem_25310)CrossDragonCaveMsg.S2CR_UploadPropertyItem_25310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadPropertyItem_25310)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePropertyItemIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.propertyItem_ = new ArrayList(this.propertyItem_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getPropertyItemList() {
            return this.propertyItemBuilder_ == null ? Collections.unmodifiableList(this.propertyItem_) : this.propertyItemBuilder_.getMessageList();
         }

         public int getPropertyItemCount() {
            return this.propertyItemBuilder_ == null ? this.propertyItem_.size() : this.propertyItemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getPropertyItem(int index) {
            return this.propertyItemBuilder_ == null ? (CommonMsg.ItemInfo)this.propertyItem_.get(index) : (CommonMsg.ItemInfo)this.propertyItemBuilder_.getMessage(index);
         }

         public Builder setPropertyItem(int index, CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.set(index, value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyItem(CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyItem(int index, CommonMsg.ItemInfo value) {
            if (this.propertyItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(index, value);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyItem_);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyItem() {
            if (this.propertyItemBuilder_ == null) {
               this.propertyItem_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.propertyItemBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyItem(int index) {
            if (this.propertyItemBuilder_ == null) {
               this.ensurePropertyItemIsMutable();
               this.propertyItem_.remove(index);
               this.onChanged();
            } else {
               this.propertyItemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getPropertyItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index) {
            return this.propertyItemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.propertyItem_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.propertyItemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList() {
            return this.propertyItemBuilder_ != null ? this.propertyItemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyItem_);
         }

         public CommonMsg.ItemInfo.Builder addPropertyItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addPropertyItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getPropertyItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getPropertyItemBuilderList() {
            return this.getPropertyItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getPropertyItemFieldBuilder() {
            if (this.propertyItemBuilder_ == null) {
               this.propertyItemBuilder_ = new RepeatedFieldBuilderV3(this.propertyItem_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.propertyItem_ = null;
            }

            return this.propertyItemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadArraying_25311 extends GeneratedMessageV3 implements S2CR_UploadArraying_25311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadArraying_25311 DEFAULT_INSTANCE = new S2CR_UploadArraying_25311();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadArraying_25311> PARSER = new AbstractParser<S2CR_UploadArraying_25311>() {
         public S2CR_UploadArraying_25311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadArraying_25311(input, extensionRegistry);
         }
      };

      private S2CR_UploadArraying_25311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadArraying_25311() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadArraying_25311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadArraying_25311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadArraying_25311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadArraying_25311.class, Builder.class);
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeBytes(1, this.arraying_);
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
               size += CodedOutputStream.computeBytesSize(1, this.arraying_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadArraying_25311)) {
            return super.equals(obj);
         } else {
            S2CR_UploadArraying_25311 other = (S2CR_UploadArraying_25311)obj;
            if (this.hasArraying() != other.hasArraying()) {
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
            if (this.hasArraying()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadArraying_25311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_25311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_25311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_25311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_25311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_25311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_25311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_25311 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_25311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadArraying_25311 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_25311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadArraying_25311 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_25311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_25311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadArraying_25311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadArraying_25311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadArraying_25311> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadArraying_25311> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadArraying_25311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadArraying_25311OrBuilder {
         private int bitField0_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadArraying_25311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadArraying_25311.class, Builder.class);
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
            if (CrossDragonCaveMsg.S2CR_UploadArraying_25311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_UploadArraying_25311_descriptor;
         }

         public S2CR_UploadArraying_25311 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_UploadArraying_25311.getDefaultInstance();
         }

         public S2CR_UploadArraying_25311 build() {
            S2CR_UploadArraying_25311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadArraying_25311 buildPartial() {
            S2CR_UploadArraying_25311 result = new S2CR_UploadArraying_25311(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
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
            if (other instanceof S2CR_UploadArraying_25311) {
               return this.mergeFrom((S2CR_UploadArraying_25311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadArraying_25311 other) {
            if (other == CrossDragonCaveMsg.S2CR_UploadArraying_25311.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasArraying();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadArraying_25311 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadArraying_25311)CrossDragonCaveMsg.S2CR_UploadArraying_25311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadArraying_25311)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -2;
            this.arraying_ = CrossDragonCaveMsg.S2CR_UploadArraying_25311.getDefaultInstance().getArraying();
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

   public static final class CR2S_BeKill_25312 extends GeneratedMessageV3 implements CR2S_BeKill_25312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEM_FIELD_NUMBER = 1;
      private int item_;
      public static final int PROPERTYITEM_FIELD_NUMBER = 2;
      private int propertyItem_;
      public static final int DAMAGE_FIELD_NUMBER = 3;
      private long damage_;
      public static final int ATKSERVER_FIELD_NUMBER = 4;
      private int atkServer_;
      public static final int ATKNAME_FIELD_NUMBER = 5;
      private volatile Object atkName_;
      private byte memoizedIsInitialized;
      private static final CR2S_BeKill_25312 DEFAULT_INSTANCE = new CR2S_BeKill_25312();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BeKill_25312> PARSER = new AbstractParser<CR2S_BeKill_25312>() {
         public CR2S_BeKill_25312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BeKill_25312(input, extensionRegistry);
         }
      };

      private CR2S_BeKill_25312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BeKill_25312() {
         this.memoizedIsInitialized = -1;
         this.atkName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BeKill_25312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BeKill_25312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.item_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.propertyItem_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.damage_ = input.readInt64();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.atkServer_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.atkName_ = bs;
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_BeKill_25312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeKill_25312.class, Builder.class);
      }

      public boolean hasItem() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItem() {
         return this.item_;
      }

      public boolean hasPropertyItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPropertyItem() {
         return this.propertyItem_;
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasAtkServer() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getAtkServer() {
         return this.atkServer_;
      }

      public boolean hasAtkName() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getAtkName() {
         Object ref = this.atkName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.atkName_ = s;
            }

            return s;
         }
      }

      public ByteString getAtkNameBytes() {
         Object ref = this.atkName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.atkName_ = b;
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
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPropertyItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkServer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.item_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.propertyItem_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.damage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.atkServer_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.atkName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.item_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.propertyItem_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.damage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.atkServer_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.atkName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BeKill_25312)) {
            return super.equals(obj);
         } else {
            CR2S_BeKill_25312 other = (CR2S_BeKill_25312)obj;
            if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && this.getItem() != other.getItem()) {
               return false;
            } else if (this.hasPropertyItem() != other.hasPropertyItem()) {
               return false;
            } else if (this.hasPropertyItem() && this.getPropertyItem() != other.getPropertyItem()) {
               return false;
            } else if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasAtkServer() != other.hasAtkServer()) {
               return false;
            } else if (this.hasAtkServer() && this.getAtkServer() != other.getAtkServer()) {
               return false;
            } else if (this.hasAtkName() != other.hasAtkName()) {
               return false;
            } else if (this.hasAtkName() && !this.getAtkName().equals(other.getAtkName())) {
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
            if (this.hasItem()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItem();
            }

            if (this.hasPropertyItem()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPropertyItem();
            }

            if (this.hasDamage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasAtkServer()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAtkServer();
            }

            if (this.hasAtkName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getAtkName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BeKill_25312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data);
      }

      public static CR2S_BeKill_25312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeKill_25312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data);
      }

      public static CR2S_BeKill_25312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeKill_25312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data);
      }

      public static CR2S_BeKill_25312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeKill_25312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeKill_25312 parseFrom(InputStream input) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeKill_25312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeKill_25312 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BeKill_25312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeKill_25312 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeKill_25312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeKill_25312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BeKill_25312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BeKill_25312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BeKill_25312> parser() {
         return PARSER;
      }

      public Parser<CR2S_BeKill_25312> getParserForType() {
         return PARSER;
      }

      public CR2S_BeKill_25312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BeKill_25312OrBuilder {
         private int bitField0_;
         private int item_;
         private int propertyItem_;
         private long damage_;
         private int atkServer_;
         private Object atkName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_BeKill_25312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeKill_25312.class, Builder.class);
         }

         private Builder() {
            this.atkName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.atkName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.CR2S_BeKill_25312.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.item_ = 0;
            this.bitField0_ &= -2;
            this.propertyItem_ = 0;
            this.bitField0_ &= -3;
            this.damage_ = 0L;
            this.bitField0_ &= -5;
            this.atkServer_ = 0;
            this.bitField0_ &= -9;
            this.atkName_ = "";
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_BeKill_25312_descriptor;
         }

         public CR2S_BeKill_25312 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.CR2S_BeKill_25312.getDefaultInstance();
         }

         public CR2S_BeKill_25312 build() {
            CR2S_BeKill_25312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BeKill_25312 buildPartial() {
            CR2S_BeKill_25312 result = new CR2S_BeKill_25312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.item_ = this.item_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.propertyItem_ = this.propertyItem_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.atkServer_ = this.atkServer_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.atkName_ = this.atkName_;
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
            if (other instanceof CR2S_BeKill_25312) {
               return this.mergeFrom((CR2S_BeKill_25312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BeKill_25312 other) {
            if (other == CrossDragonCaveMsg.CR2S_BeKill_25312.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItem()) {
                  this.setItem(other.getItem());
               }

               if (other.hasPropertyItem()) {
                  this.setPropertyItem(other.getPropertyItem());
               }

               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasAtkServer()) {
                  this.setAtkServer(other.getAtkServer());
               }

               if (other.hasAtkName()) {
                  this.bitField0_ |= 16;
                  this.atkName_ = other.atkName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItem()) {
               return false;
            } else if (!this.hasPropertyItem()) {
               return false;
            } else if (!this.hasDamage()) {
               return false;
            } else if (!this.hasAtkServer()) {
               return false;
            } else {
               return this.hasAtkName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BeKill_25312 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BeKill_25312)CrossDragonCaveMsg.CR2S_BeKill_25312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BeKill_25312)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItem() {
            return this.item_;
         }

         public Builder setItem(int value) {
            this.bitField0_ |= 1;
            this.item_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItem() {
            this.bitField0_ &= -2;
            this.item_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPropertyItem() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPropertyItem() {
            return this.propertyItem_;
         }

         public Builder setPropertyItem(int value) {
            this.bitField0_ |= 2;
            this.propertyItem_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPropertyItem() {
            this.bitField0_ &= -3;
            this.propertyItem_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 4;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -5;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasAtkServer() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getAtkServer() {
            return this.atkServer_;
         }

         public Builder setAtkServer(int value) {
            this.bitField0_ |= 8;
            this.atkServer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkServer() {
            this.bitField0_ &= -9;
            this.atkServer_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkName() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getAtkName() {
            Object ref = this.atkName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.atkName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getAtkNameBytes() {
            Object ref = this.atkName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.atkName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setAtkName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.atkName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearAtkName() {
            this.bitField0_ &= -17;
            this.atkName_ = CrossDragonCaveMsg.CR2S_BeKill_25312.getDefaultInstance().getAtkName();
            this.onChanged();
            return this;
         }

         public Builder setAtkNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.atkName_ = value;
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

   public static final class S2CR_AddEnergy_25313 extends GeneratedMessageV3 implements S2CR_AddEnergy_25313OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENERGY_FIELD_NUMBER = 1;
      private int energy_;
      private byte memoizedIsInitialized;
      private static final S2CR_AddEnergy_25313 DEFAULT_INSTANCE = new S2CR_AddEnergy_25313();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AddEnergy_25313> PARSER = new AbstractParser<S2CR_AddEnergy_25313>() {
         public S2CR_AddEnergy_25313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AddEnergy_25313(input, extensionRegistry);
         }
      };

      private S2CR_AddEnergy_25313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AddEnergy_25313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AddEnergy_25313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AddEnergy_25313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.energy_ = input.readInt32();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AddEnergy_25313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AddEnergy_25313.class, Builder.class);
      }

      public boolean hasEnergy() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnergy() {
         return this.energy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnergy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.energy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.energy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AddEnergy_25313)) {
            return super.equals(obj);
         } else {
            S2CR_AddEnergy_25313 other = (S2CR_AddEnergy_25313)obj;
            if (this.hasEnergy() != other.hasEnergy()) {
               return false;
            } else if (this.hasEnergy() && this.getEnergy() != other.getEnergy()) {
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
            if (this.hasEnergy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnergy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AddEnergy_25313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data);
      }

      public static S2CR_AddEnergy_25313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AddEnergy_25313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data);
      }

      public static S2CR_AddEnergy_25313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AddEnergy_25313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data);
      }

      public static S2CR_AddEnergy_25313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AddEnergy_25313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AddEnergy_25313 parseFrom(InputStream input) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AddEnergy_25313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AddEnergy_25313 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AddEnergy_25313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AddEnergy_25313 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AddEnergy_25313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AddEnergy_25313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AddEnergy_25313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AddEnergy_25313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AddEnergy_25313> parser() {
         return PARSER;
      }

      public Parser<S2CR_AddEnergy_25313> getParserForType() {
         return PARSER;
      }

      public S2CR_AddEnergy_25313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AddEnergy_25313OrBuilder {
         private int bitField0_;
         private int energy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AddEnergy_25313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AddEnergy_25313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_AddEnergy_25313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.energy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AddEnergy_25313_descriptor;
         }

         public S2CR_AddEnergy_25313 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_AddEnergy_25313.getDefaultInstance();
         }

         public S2CR_AddEnergy_25313 build() {
            S2CR_AddEnergy_25313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AddEnergy_25313 buildPartial() {
            S2CR_AddEnergy_25313 result = new S2CR_AddEnergy_25313(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.energy_ = this.energy_;
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
            if (other instanceof S2CR_AddEnergy_25313) {
               return this.mergeFrom((S2CR_AddEnergy_25313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AddEnergy_25313 other) {
            if (other == CrossDragonCaveMsg.S2CR_AddEnergy_25313.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnergy()) {
                  this.setEnergy(other.getEnergy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEnergy();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AddEnergy_25313 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AddEnergy_25313)CrossDragonCaveMsg.S2CR_AddEnergy_25313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AddEnergy_25313)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnergy() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnergy() {
            return this.energy_;
         }

         public Builder setEnergy(int value) {
            this.bitField0_ |= 1;
            this.energy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnergy() {
            this.bitField0_ &= -2;
            this.energy_ = 0;
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

   public static final class S2CR_AtkCooperation_25314 extends GeneratedMessageV3 implements S2CR_AtkCooperation_25314OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2CR_AtkCooperation_25314 DEFAULT_INSTANCE = new S2CR_AtkCooperation_25314();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AtkCooperation_25314> PARSER = new AbstractParser<S2CR_AtkCooperation_25314>() {
         public S2CR_AtkCooperation_25314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AtkCooperation_25314(input, extensionRegistry);
         }
      };

      private S2CR_AtkCooperation_25314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AtkCooperation_25314() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AtkCooperation_25314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AtkCooperation_25314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkCooperation_25314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkCooperation_25314.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_AtkCooperation_25314)) {
            return super.equals(obj);
         } else {
            S2CR_AtkCooperation_25314 other = (S2CR_AtkCooperation_25314)obj;
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

      public static S2CR_AtkCooperation_25314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkCooperation_25314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(InputStream input) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkCooperation_25314 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AtkCooperation_25314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkCooperation_25314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkCooperation_25314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AtkCooperation_25314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AtkCooperation_25314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AtkCooperation_25314> parser() {
         return PARSER;
      }

      public Parser<S2CR_AtkCooperation_25314> getParserForType() {
         return PARSER;
      }

      public S2CR_AtkCooperation_25314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AtkCooperation_25314OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkCooperation_25314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkCooperation_25314.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_AtkCooperation_25314.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_AtkCooperation_25314_descriptor;
         }

         public S2CR_AtkCooperation_25314 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_AtkCooperation_25314.getDefaultInstance();
         }

         public S2CR_AtkCooperation_25314 build() {
            S2CR_AtkCooperation_25314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AtkCooperation_25314 buildPartial() {
            S2CR_AtkCooperation_25314 result = new S2CR_AtkCooperation_25314(this);
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
            if (other instanceof S2CR_AtkCooperation_25314) {
               return this.mergeFrom((S2CR_AtkCooperation_25314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AtkCooperation_25314 other) {
            if (other == CrossDragonCaveMsg.S2CR_AtkCooperation_25314.getDefaultInstance()) {
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
            S2CR_AtkCooperation_25314 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AtkCooperation_25314)CrossDragonCaveMsg.S2CR_AtkCooperation_25314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AtkCooperation_25314)e.getUnfinishedMessage();
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

   public static final class S2CR_Rank_25315 extends GeneratedMessageV3 implements S2CR_Rank_25315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_Rank_25315 DEFAULT_INSTANCE = new S2CR_Rank_25315();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Rank_25315> PARSER = new AbstractParser<S2CR_Rank_25315>() {
         public S2CR_Rank_25315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Rank_25315(input, extensionRegistry);
         }
      };

      private S2CR_Rank_25315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Rank_25315() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Rank_25315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Rank_25315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DragonCaveMsg.RankType value = DragonCaveMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Rank_25315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Rank_25315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_25315.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public DragonCaveMsg.RankType getType() {
         DragonCaveMsg.RankType result = DragonCaveMsg.RankType.valueOf(this.type_);
         return result == null ? DragonCaveMsg.RankType.PERSONAL : result;
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Rank_25315)) {
            return super.equals(obj);
         } else {
            S2CR_Rank_25315 other = (S2CR_Rank_25315)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Rank_25315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_25315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_25315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_25315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_25315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_25315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_25315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_25315 parseFrom(InputStream input) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_25315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_25315 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Rank_25315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_25315 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_25315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_25315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Rank_25315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Rank_25315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Rank_25315> parser() {
         return PARSER;
      }

      public Parser<S2CR_Rank_25315> getParserForType() {
         return PARSER;
      }

      public S2CR_Rank_25315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Rank_25315OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Rank_25315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Rank_25315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_25315.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_Rank_25315.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Rank_25315_descriptor;
         }

         public S2CR_Rank_25315 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_Rank_25315.getDefaultInstance();
         }

         public S2CR_Rank_25315 build() {
            S2CR_Rank_25315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Rank_25315 buildPartial() {
            S2CR_Rank_25315 result = new S2CR_Rank_25315(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof S2CR_Rank_25315) {
               return this.mergeFrom((S2CR_Rank_25315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Rank_25315 other) {
            if (other == CrossDragonCaveMsg.S2CR_Rank_25315.getDefaultInstance()) {
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
            S2CR_Rank_25315 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Rank_25315)CrossDragonCaveMsg.S2CR_Rank_25315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Rank_25315)e.getUnfinishedMessage();
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

         public DragonCaveMsg.RankType getType() {
            DragonCaveMsg.RankType result = DragonCaveMsg.RankType.valueOf(this.type_);
            return result == null ? DragonCaveMsg.RankType.PERSONAL : result;
         }

         public Builder setType(DragonCaveMsg.RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
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

   public static final class S2CR_Logs_25316 extends GeneratedMessageV3 implements S2CR_Logs_25316OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MINE_FIELD_NUMBER = 1;
      private boolean mine_;
      private byte memoizedIsInitialized;
      private static final S2CR_Logs_25316 DEFAULT_INSTANCE = new S2CR_Logs_25316();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Logs_25316> PARSER = new AbstractParser<S2CR_Logs_25316>() {
         public S2CR_Logs_25316 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Logs_25316(input, extensionRegistry);
         }
      };

      private S2CR_Logs_25316(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Logs_25316() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Logs_25316();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Logs_25316(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mine_ = input.readBool();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Logs_25316_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Logs_25316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Logs_25316.class, Builder.class);
      }

      public boolean hasMine() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getMine() {
         return this.mine_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.mine_);
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
               size += CodedOutputStream.computeBoolSize(1, this.mine_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Logs_25316)) {
            return super.equals(obj);
         } else {
            S2CR_Logs_25316 other = (S2CR_Logs_25316)obj;
            if (this.hasMine() != other.hasMine()) {
               return false;
            } else if (this.hasMine() && this.getMine() != other.getMine()) {
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
            if (this.hasMine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getMine());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Logs_25316 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_25316 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_25316 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_25316 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_25316 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_25316 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_25316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_25316 parseFrom(InputStream input) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Logs_25316 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Logs_25316 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Logs_25316 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Logs_25316 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Logs_25316 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_25316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Logs_25316 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Logs_25316 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Logs_25316> parser() {
         return PARSER;
      }

      public Parser<S2CR_Logs_25316> getParserForType() {
         return PARSER;
      }

      public S2CR_Logs_25316 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Logs_25316OrBuilder {
         private int bitField0_;
         private boolean mine_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Logs_25316_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Logs_25316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Logs_25316.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_Logs_25316.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mine_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Logs_25316_descriptor;
         }

         public S2CR_Logs_25316 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_Logs_25316.getDefaultInstance();
         }

         public S2CR_Logs_25316 build() {
            S2CR_Logs_25316 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Logs_25316 buildPartial() {
            S2CR_Logs_25316 result = new S2CR_Logs_25316(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mine_ = this.mine_;
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
            if (other instanceof S2CR_Logs_25316) {
               return this.mergeFrom((S2CR_Logs_25316)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Logs_25316 other) {
            if (other == CrossDragonCaveMsg.S2CR_Logs_25316.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMine()) {
                  this.setMine(other.getMine());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMine();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Logs_25316 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Logs_25316)CrossDragonCaveMsg.S2CR_Logs_25316.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Logs_25316)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMine() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getMine() {
            return this.mine_;
         }

         public Builder setMine(boolean value) {
            this.bitField0_ |= 1;
            this.mine_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMine() {
            this.bitField0_ &= -2;
            this.mine_ = false;
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

   public static final class S2CR_Cooperation_25317 extends GeneratedMessageV3 implements S2CR_Cooperation_25317OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_Cooperation_25317 DEFAULT_INSTANCE = new S2CR_Cooperation_25317();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Cooperation_25317> PARSER = new AbstractParser<S2CR_Cooperation_25317>() {
         public S2CR_Cooperation_25317 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Cooperation_25317(input, extensionRegistry);
         }
      };

      private S2CR_Cooperation_25317(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Cooperation_25317() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Cooperation_25317();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Cooperation_25317(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Cooperation_25317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Cooperation_25317.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Cooperation_25317)) {
            return super.equals(obj);
         } else {
            S2CR_Cooperation_25317 other = (S2CR_Cooperation_25317)obj;
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

      public static S2CR_Cooperation_25317 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data);
      }

      public static S2CR_Cooperation_25317 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Cooperation_25317 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data);
      }

      public static S2CR_Cooperation_25317 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Cooperation_25317 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data);
      }

      public static S2CR_Cooperation_25317 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Cooperation_25317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Cooperation_25317 parseFrom(InputStream input) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Cooperation_25317 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Cooperation_25317 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Cooperation_25317 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Cooperation_25317 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Cooperation_25317 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Cooperation_25317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Cooperation_25317 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Cooperation_25317 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Cooperation_25317> parser() {
         return PARSER;
      }

      public Parser<S2CR_Cooperation_25317> getParserForType() {
         return PARSER;
      }

      public S2CR_Cooperation_25317 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Cooperation_25317OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Cooperation_25317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Cooperation_25317.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_Cooperation_25317.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Cooperation_25317_descriptor;
         }

         public S2CR_Cooperation_25317 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_Cooperation_25317.getDefaultInstance();
         }

         public S2CR_Cooperation_25317 build() {
            S2CR_Cooperation_25317 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Cooperation_25317 buildPartial() {
            S2CR_Cooperation_25317 result = new S2CR_Cooperation_25317(this);
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
            if (other instanceof S2CR_Cooperation_25317) {
               return this.mergeFrom((S2CR_Cooperation_25317)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Cooperation_25317 other) {
            if (other == CrossDragonCaveMsg.S2CR_Cooperation_25317.getDefaultInstance()) {
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
            S2CR_Cooperation_25317 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Cooperation_25317)CrossDragonCaveMsg.S2CR_Cooperation_25317.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Cooperation_25317)e.getUnfinishedMessage();
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

   public static final class S2CR_MakeCooperation_25318 extends GeneratedMessageV3 implements S2CR_MakeCooperation_25318OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MakeCooperation_25318 DEFAULT_INSTANCE = new S2CR_MakeCooperation_25318();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MakeCooperation_25318> PARSER = new AbstractParser<S2CR_MakeCooperation_25318>() {
         public S2CR_MakeCooperation_25318 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MakeCooperation_25318(input, extensionRegistry);
         }
      };

      private S2CR_MakeCooperation_25318(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MakeCooperation_25318() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MakeCooperation_25318();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MakeCooperation_25318(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_MakeCooperation_25318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MakeCooperation_25318.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MakeCooperation_25318)) {
            return super.equals(obj);
         } else {
            S2CR_MakeCooperation_25318 other = (S2CR_MakeCooperation_25318)obj;
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

      public static S2CR_MakeCooperation_25318 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MakeCooperation_25318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(InputStream input) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MakeCooperation_25318 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MakeCooperation_25318 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MakeCooperation_25318 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MakeCooperation_25318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MakeCooperation_25318 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MakeCooperation_25318 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MakeCooperation_25318> parser() {
         return PARSER;
      }

      public Parser<S2CR_MakeCooperation_25318> getParserForType() {
         return PARSER;
      }

      public S2CR_MakeCooperation_25318 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MakeCooperation_25318OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_MakeCooperation_25318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MakeCooperation_25318.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_MakeCooperation_25318.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_MakeCooperation_25318_descriptor;
         }

         public S2CR_MakeCooperation_25318 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_MakeCooperation_25318.getDefaultInstance();
         }

         public S2CR_MakeCooperation_25318 build() {
            S2CR_MakeCooperation_25318 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MakeCooperation_25318 buildPartial() {
            S2CR_MakeCooperation_25318 result = new S2CR_MakeCooperation_25318(this);
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
            if (other instanceof S2CR_MakeCooperation_25318) {
               return this.mergeFrom((S2CR_MakeCooperation_25318)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MakeCooperation_25318 other) {
            if (other == CrossDragonCaveMsg.S2CR_MakeCooperation_25318.getDefaultInstance()) {
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
            S2CR_MakeCooperation_25318 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MakeCooperation_25318)CrossDragonCaveMsg.S2CR_MakeCooperation_25318.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MakeCooperation_25318)e.getUnfinishedMessage();
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

   public static final class S2CR_Energy_25319 extends GeneratedMessageV3 implements S2CR_Energy_25319OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_Energy_25319 DEFAULT_INSTANCE = new S2CR_Energy_25319();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Energy_25319> PARSER = new AbstractParser<S2CR_Energy_25319>() {
         public S2CR_Energy_25319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Energy_25319(input, extensionRegistry);
         }
      };

      private S2CR_Energy_25319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Energy_25319() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Energy_25319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Energy_25319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Energy_25319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Energy_25319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Energy_25319.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Energy_25319)) {
            return super.equals(obj);
         } else {
            S2CR_Energy_25319 other = (S2CR_Energy_25319)obj;
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

      public static S2CR_Energy_25319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data);
      }

      public static S2CR_Energy_25319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Energy_25319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data);
      }

      public static S2CR_Energy_25319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Energy_25319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data);
      }

      public static S2CR_Energy_25319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Energy_25319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Energy_25319 parseFrom(InputStream input) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Energy_25319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Energy_25319 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Energy_25319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Energy_25319 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Energy_25319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Energy_25319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Energy_25319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Energy_25319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Energy_25319> parser() {
         return PARSER;
      }

      public Parser<S2CR_Energy_25319> getParserForType() {
         return PARSER;
      }

      public S2CR_Energy_25319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Energy_25319OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Energy_25319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Energy_25319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Energy_25319.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.S2CR_Energy_25319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_S2CR_Energy_25319_descriptor;
         }

         public S2CR_Energy_25319 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.S2CR_Energy_25319.getDefaultInstance();
         }

         public S2CR_Energy_25319 build() {
            S2CR_Energy_25319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Energy_25319 buildPartial() {
            S2CR_Energy_25319 result = new S2CR_Energy_25319(this);
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
            if (other instanceof S2CR_Energy_25319) {
               return this.mergeFrom((S2CR_Energy_25319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Energy_25319 other) {
            if (other == CrossDragonCaveMsg.S2CR_Energy_25319.getDefaultInstance()) {
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
            S2CR_Energy_25319 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Energy_25319)CrossDragonCaveMsg.S2CR_Energy_25319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Energy_25319)e.getUnfinishedMessage();
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

   public static final class CR2S_EventHandle_25320 extends GeneratedMessageV3 implements CR2S_EventHandle_25320OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private DragonCaveMsg.Event event_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> reward_;
      public static final int BOXTYPE_FIELD_NUMBER = 3;
      private int boxType_;
      public static final int BATTLE_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 battle_;
      private byte memoizedIsInitialized;
      private static final CR2S_EventHandle_25320 DEFAULT_INSTANCE = new CR2S_EventHandle_25320();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_EventHandle_25320> PARSER = new AbstractParser<CR2S_EventHandle_25320>() {
         public CR2S_EventHandle_25320 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_EventHandle_25320(input, extensionRegistry);
         }
      };

      private CR2S_EventHandle_25320(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_EventHandle_25320() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_EventHandle_25320();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_EventHandle_25320(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DragonCaveMsg.Event.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (DragonCaveMsg.Event)input.readMessage(DragonCaveMsg.Event.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.boxType_ = input.readInt32();
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.battle_.toBuilder();
                        }

                        this.battle_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battle_);
                           this.battle_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_EventHandle_25320_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EventHandle_25320.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public DragonCaveMsg.Event getEvent() {
         return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
      }

      public DragonCaveMsg.EventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public boolean hasBoxType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxType() {
         return this.boxType_;
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattle() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasBattle() && !this.getBattle().isInitialized()) {
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
            output.writeMessage(1, this.getEvent());
         }

         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.reward_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.boxType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getBattle());
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
               size += CodedOutputStream.computeMessageSize(1, this.getEvent());
            }

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.reward_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.boxType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getBattle());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_EventHandle_25320)) {
            return super.equals(obj);
         } else {
            CR2S_EventHandle_25320 other = (CR2S_EventHandle_25320)obj;
            if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
               return false;
            } else if (!this.getRewardList().equals(other.getRewardList())) {
               return false;
            } else if (this.hasBoxType() != other.hasBoxType()) {
               return false;
            } else if (this.hasBoxType() && this.getBoxType() != other.getBoxType()) {
               return false;
            } else if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && !this.getBattle().equals(other.getBattle())) {
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
            if (this.hasEvent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEvent().hashCode();
            }

            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            if (this.hasBoxType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBoxType();
            }

            if (this.hasBattle()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBattle().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_EventHandle_25320 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data);
      }

      public static CR2S_EventHandle_25320 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EventHandle_25320 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data);
      }

      public static CR2S_EventHandle_25320 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EventHandle_25320 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data);
      }

      public static CR2S_EventHandle_25320 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EventHandle_25320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EventHandle_25320 parseFrom(InputStream input) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EventHandle_25320 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EventHandle_25320 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_EventHandle_25320 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EventHandle_25320 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EventHandle_25320 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EventHandle_25320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_EventHandle_25320 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_EventHandle_25320 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_EventHandle_25320> parser() {
         return PARSER;
      }

      public Parser<CR2S_EventHandle_25320> getParserForType() {
         return PARSER;
      }

      public CR2S_EventHandle_25320 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_EventHandle_25320OrBuilder {
         private int bitField0_;
         private DragonCaveMsg.Event event_;
         private SingleFieldBuilderV3<DragonCaveMsg.Event, DragonCaveMsg.Event.Builder, DragonCaveMsg.EventOrBuilder> eventBuilder_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;
         private int boxType_;
         private BattleMsg.S2C_BattleResult_6102 battle_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_EventHandle_25320_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EventHandle_25320.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.CR2S_EventHandle_25320.alwaysUseFieldBuilders) {
               this.getEventFieldBuilder();
               this.getRewardFieldBuilder();
               this.getBattleFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.eventBuilder_ == null) {
               this.event_ = null;
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardBuilder_.clear();
            }

            this.boxType_ = 0;
            this.bitField0_ &= -5;
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_EventHandle_25320_descriptor;
         }

         public CR2S_EventHandle_25320 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.CR2S_EventHandle_25320.getDefaultInstance();
         }

         public CR2S_EventHandle_25320 build() {
            CR2S_EventHandle_25320 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_EventHandle_25320 buildPartial() {
            CR2S_EventHandle_25320 result = new CR2S_EventHandle_25320(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (DragonCaveMsg.Event)this.eventBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -3;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.boxType_ = this.boxType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.battleBuilder_ == null) {
                  result.battle_ = this.battle_;
               } else {
                  result.battle_ = (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.build();
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
            if (other instanceof CR2S_EventHandle_25320) {
               return this.mergeFrom((CR2S_EventHandle_25320)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_EventHandle_25320 other) {
            if (other == CrossDragonCaveMsg.CR2S_EventHandle_25320.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -3;
                     this.rewardBuilder_ = CrossDragonCaveMsg.CR2S_EventHandle_25320.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               if (other.hasBoxType()) {
                  this.setBoxType(other.getBoxType());
               }

               if (other.hasBattle()) {
                  this.mergeBattle(other.getBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEvent()) {
               return false;
            } else if (!this.getEvent().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardCount(); ++i) {
                  if (!this.getReward(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasBattle() && !this.getBattle().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_EventHandle_25320 parsedMessage = null;

            try {
               parsedMessage = (CR2S_EventHandle_25320)CrossDragonCaveMsg.CR2S_EventHandle_25320.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_EventHandle_25320)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public DragonCaveMsg.Event getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
            } else {
               return (DragonCaveMsg.Event)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(DragonCaveMsg.Event value) {
            if (this.eventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.event_ = value;
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setEvent(DragonCaveMsg.Event.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeEvent(DragonCaveMsg.Event value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != DragonCaveMsg.Event.getDefaultInstance()) {
                  this.event_ = DragonCaveMsg.Event.newBuilder(this.event_).mergeFrom(value).buildPartial();
               } else {
                  this.event_ = value;
               }

               this.onChanged();
            } else {
               this.eventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearEvent() {
            if (this.eventBuilder_ == null) {
               this.event_ = null;
               this.onChanged();
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DragonCaveMsg.Event.Builder getEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DragonCaveMsg.Event.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public DragonCaveMsg.EventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (DragonCaveMsg.EventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<DragonCaveMsg.Event, DragonCaveMsg.Event.Builder, DragonCaveMsg.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public boolean hasBoxType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBoxType() {
            return this.boxType_;
         }

         public Builder setBoxType(int value) {
            this.bitField0_ |= 4;
            this.boxType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxType() {
            this.bitField0_ &= -5;
            this.boxType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 8) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattle() {
            if (this.battleBuilder_ == null) {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.getMessage();
            }
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battle_ = value;
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleBuilder_ == null) {
               this.battle_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.battle_ != null && this.battle_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battle_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battle_).mergeFrom(value).buildPartial();
               } else {
                  this.battle_ = value;
               }

               this.onChanged();
            } else {
               this.battleBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBattle() {
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
               this.onChanged();
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
            if (this.battleBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleBuilder_.getMessageOrBuilder();
            } else {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleFieldBuilder() {
            if (this.battleBuilder_ == null) {
               this.battleBuilder_ = new SingleFieldBuilderV3(this.getBattle(), this.getParentForChildren(), this.isClean());
               this.battle_ = null;
            }

            return this.battleBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_AtkCooperation_25321 extends GeneratedMessageV3 implements CR2S_AtkCooperation_25321OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private DragonCaveMsg.Event event_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> reward_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      public static final int BATTLE_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 battle_;
      private byte memoizedIsInitialized;
      private static final CR2S_AtkCooperation_25321 DEFAULT_INSTANCE = new CR2S_AtkCooperation_25321();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_AtkCooperation_25321> PARSER = new AbstractParser<CR2S_AtkCooperation_25321>() {
         public CR2S_AtkCooperation_25321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_AtkCooperation_25321(input, extensionRegistry);
         }
      };

      private CR2S_AtkCooperation_25321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_AtkCooperation_25321() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_AtkCooperation_25321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_AtkCooperation_25321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DragonCaveMsg.Event.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (DragonCaveMsg.Event)input.readMessage(DragonCaveMsg.Event.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.battle_.toBuilder();
                        }

                        this.battle_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battle_);
                           this.battle_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_AtkCooperation_25321_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AtkCooperation_25321.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public DragonCaveMsg.Event getEvent() {
         return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
      }

      public DragonCaveMsg.EventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattle() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getBattle().isInitialized()) {
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
            output.writeMessage(1, this.getEvent());
         }

         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.reward_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getBattle());
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
               size += CodedOutputStream.computeMessageSize(1, this.getEvent());
            }

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.reward_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getBattle());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_AtkCooperation_25321)) {
            return super.equals(obj);
         } else {
            CR2S_AtkCooperation_25321 other = (CR2S_AtkCooperation_25321)obj;
            if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
               return false;
            } else if (!this.getRewardList().equals(other.getRewardList())) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && !this.getBattle().equals(other.getBattle())) {
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
            if (this.hasEvent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEvent().hashCode();
            }

            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasBattle()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBattle().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_AtkCooperation_25321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AtkCooperation_25321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(InputStream input) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AtkCooperation_25321 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_AtkCooperation_25321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AtkCooperation_25321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AtkCooperation_25321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_AtkCooperation_25321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_AtkCooperation_25321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_AtkCooperation_25321> parser() {
         return PARSER;
      }

      public Parser<CR2S_AtkCooperation_25321> getParserForType() {
         return PARSER;
      }

      public CR2S_AtkCooperation_25321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_AtkCooperation_25321OrBuilder {
         private int bitField0_;
         private DragonCaveMsg.Event event_;
         private SingleFieldBuilderV3<DragonCaveMsg.Event, DragonCaveMsg.Event.Builder, DragonCaveMsg.EventOrBuilder> eventBuilder_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;
         private int num_;
         private BattleMsg.S2C_BattleResult_6102 battle_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_AtkCooperation_25321_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AtkCooperation_25321.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.CR2S_AtkCooperation_25321.alwaysUseFieldBuilders) {
               this.getEventFieldBuilder();
               this.getRewardFieldBuilder();
               this.getBattleFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.eventBuilder_ == null) {
               this.event_ = null;
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardBuilder_.clear();
            }

            this.num_ = 0;
            this.bitField0_ &= -5;
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_AtkCooperation_25321_descriptor;
         }

         public CR2S_AtkCooperation_25321 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.CR2S_AtkCooperation_25321.getDefaultInstance();
         }

         public CR2S_AtkCooperation_25321 build() {
            CR2S_AtkCooperation_25321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_AtkCooperation_25321 buildPartial() {
            CR2S_AtkCooperation_25321 result = new CR2S_AtkCooperation_25321(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (DragonCaveMsg.Event)this.eventBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -3;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.battleBuilder_ == null) {
                  result.battle_ = this.battle_;
               } else {
                  result.battle_ = (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.build();
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
            if (other instanceof CR2S_AtkCooperation_25321) {
               return this.mergeFrom((CR2S_AtkCooperation_25321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_AtkCooperation_25321 other) {
            if (other == CrossDragonCaveMsg.CR2S_AtkCooperation_25321.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -3;
                     this.rewardBuilder_ = CrossDragonCaveMsg.CR2S_AtkCooperation_25321.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasBattle()) {
                  this.mergeBattle(other.getBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEvent()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else if (!this.hasBattle()) {
               return false;
            } else if (!this.getEvent().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardCount(); ++i) {
                  if (!this.getReward(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getBattle().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_AtkCooperation_25321 parsedMessage = null;

            try {
               parsedMessage = (CR2S_AtkCooperation_25321)CrossDragonCaveMsg.CR2S_AtkCooperation_25321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_AtkCooperation_25321)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public DragonCaveMsg.Event getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
            } else {
               return (DragonCaveMsg.Event)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(DragonCaveMsg.Event value) {
            if (this.eventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.event_ = value;
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setEvent(DragonCaveMsg.Event.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeEvent(DragonCaveMsg.Event value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != DragonCaveMsg.Event.getDefaultInstance()) {
                  this.event_ = DragonCaveMsg.Event.newBuilder(this.event_).mergeFrom(value).buildPartial();
               } else {
                  this.event_ = value;
               }

               this.onChanged();
            } else {
               this.eventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearEvent() {
            if (this.eventBuilder_ == null) {
               this.event_ = null;
               this.onChanged();
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DragonCaveMsg.Event.Builder getEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DragonCaveMsg.Event.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public DragonCaveMsg.EventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (DragonCaveMsg.EventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? DragonCaveMsg.Event.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<DragonCaveMsg.Event, DragonCaveMsg.Event.Builder, DragonCaveMsg.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 8) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattle() {
            if (this.battleBuilder_ == null) {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.getMessage();
            }
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battle_ = value;
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleBuilder_ == null) {
               this.battle_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.battle_ != null && this.battle_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battle_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battle_).mergeFrom(value).buildPartial();
               } else {
                  this.battle_ = value;
               }

               this.onChanged();
            } else {
               this.battleBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBattle() {
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
               this.onChanged();
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
            if (this.battleBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleBuilder_.getMessageOrBuilder();
            } else {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleFieldBuilder() {
            if (this.battleBuilder_ == null) {
               this.battleBuilder_ = new SingleFieldBuilderV3(this.getBattle(), this.getParentForChildren(), this.isClean());
               this.battle_ = null;
            }

            return this.battleBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Explore_25322 extends GeneratedMessageV3 implements CR2S_Explore_25322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MSG_FIELD_NUMBER = 1;
      private DragonCaveMsg.S2C_Explore_25246 msg_;
      private byte memoizedIsInitialized;
      private static final CR2S_Explore_25322 DEFAULT_INSTANCE = new CR2S_Explore_25322();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Explore_25322> PARSER = new AbstractParser<CR2S_Explore_25322>() {
         public CR2S_Explore_25322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Explore_25322(input, extensionRegistry);
         }
      };

      private CR2S_Explore_25322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Explore_25322() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Explore_25322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Explore_25322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DragonCaveMsg.S2C_Explore_25246.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.msg_.toBuilder();
                        }

                        this.msg_ = (DragonCaveMsg.S2C_Explore_25246)input.readMessage(DragonCaveMsg.S2C_Explore_25246.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.msg_);
                           this.msg_ = subBuilder.buildPartial();
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
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_Explore_25322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_Explore_25322_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Explore_25322.class, Builder.class);
      }

      public boolean hasMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public DragonCaveMsg.S2C_Explore_25246 getMsg() {
         return this.msg_ == null ? DragonCaveMsg.S2C_Explore_25246.getDefaultInstance() : this.msg_;
      }

      public DragonCaveMsg.S2C_Explore_25246OrBuilder getMsgOrBuilder() {
         return this.msg_ == null ? DragonCaveMsg.S2C_Explore_25246.getDefaultInstance() : this.msg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getMsg());
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
               size += CodedOutputStream.computeMessageSize(1, this.getMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Explore_25322)) {
            return super.equals(obj);
         } else {
            CR2S_Explore_25322 other = (CR2S_Explore_25322)obj;
            if (this.hasMsg() != other.hasMsg()) {
               return false;
            } else if (this.hasMsg() && !this.getMsg().equals(other.getMsg())) {
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
            if (this.hasMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Explore_25322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data);
      }

      public static CR2S_Explore_25322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Explore_25322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data);
      }

      public static CR2S_Explore_25322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Explore_25322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data);
      }

      public static CR2S_Explore_25322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Explore_25322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Explore_25322 parseFrom(InputStream input) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Explore_25322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Explore_25322 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Explore_25322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Explore_25322 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Explore_25322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Explore_25322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Explore_25322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Explore_25322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Explore_25322> parser() {
         return PARSER;
      }

      public Parser<CR2S_Explore_25322> getParserForType() {
         return PARSER;
      }

      public CR2S_Explore_25322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Explore_25322OrBuilder {
         private int bitField0_;
         private DragonCaveMsg.S2C_Explore_25246 msg_;
         private SingleFieldBuilderV3<DragonCaveMsg.S2C_Explore_25246, DragonCaveMsg.S2C_Explore_25246.Builder, DragonCaveMsg.S2C_Explore_25246OrBuilder> msgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_Explore_25322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_Explore_25322_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Explore_25322.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDragonCaveMsg.CR2S_Explore_25322.alwaysUseFieldBuilders) {
               this.getMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.msgBuilder_ == null) {
               this.msg_ = null;
            } else {
               this.msgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDragonCaveMsg.internal_static_crossDragonCave_CR2S_Explore_25322_descriptor;
         }

         public CR2S_Explore_25322 getDefaultInstanceForType() {
            return CrossDragonCaveMsg.CR2S_Explore_25322.getDefaultInstance();
         }

         public CR2S_Explore_25322 build() {
            CR2S_Explore_25322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Explore_25322 buildPartial() {
            CR2S_Explore_25322 result = new CR2S_Explore_25322(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.msgBuilder_ == null) {
                  result.msg_ = this.msg_;
               } else {
                  result.msg_ = (DragonCaveMsg.S2C_Explore_25246)this.msgBuilder_.build();
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
            if (other instanceof CR2S_Explore_25322) {
               return this.mergeFrom((CR2S_Explore_25322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Explore_25322 other) {
            if (other == CrossDragonCaveMsg.CR2S_Explore_25322.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMsg()) {
                  this.mergeMsg(other.getMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMsg()) {
               return false;
            } else {
               return this.getMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Explore_25322 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Explore_25322)CrossDragonCaveMsg.CR2S_Explore_25322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Explore_25322)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
         }

         public DragonCaveMsg.S2C_Explore_25246 getMsg() {
            if (this.msgBuilder_ == null) {
               return this.msg_ == null ? DragonCaveMsg.S2C_Explore_25246.getDefaultInstance() : this.msg_;
            } else {
               return (DragonCaveMsg.S2C_Explore_25246)this.msgBuilder_.getMessage();
            }
         }

         public Builder setMsg(DragonCaveMsg.S2C_Explore_25246 value) {
            if (this.msgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.msg_ = value;
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMsg(DragonCaveMsg.S2C_Explore_25246.Builder builderForValue) {
            if (this.msgBuilder_ == null) {
               this.msg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMsg(DragonCaveMsg.S2C_Explore_25246 value) {
            if (this.msgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.msg_ != null && this.msg_ != DragonCaveMsg.S2C_Explore_25246.getDefaultInstance()) {
                  this.msg_ = DragonCaveMsg.S2C_Explore_25246.newBuilder(this.msg_).mergeFrom(value).buildPartial();
               } else {
                  this.msg_ = value;
               }

               this.onChanged();
            } else {
               this.msgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMsg() {
            if (this.msgBuilder_ == null) {
               this.msg_ = null;
               this.onChanged();
            } else {
               this.msgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DragonCaveMsg.S2C_Explore_25246.Builder getMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DragonCaveMsg.S2C_Explore_25246.Builder)this.getMsgFieldBuilder().getBuilder();
         }

         public DragonCaveMsg.S2C_Explore_25246OrBuilder getMsgOrBuilder() {
            if (this.msgBuilder_ != null) {
               return (DragonCaveMsg.S2C_Explore_25246OrBuilder)this.msgBuilder_.getMessageOrBuilder();
            } else {
               return this.msg_ == null ? DragonCaveMsg.S2C_Explore_25246.getDefaultInstance() : this.msg_;
            }
         }

         private SingleFieldBuilderV3<DragonCaveMsg.S2C_Explore_25246, DragonCaveMsg.S2C_Explore_25246.Builder, DragonCaveMsg.S2C_Explore_25246OrBuilder> getMsgFieldBuilder() {
            if (this.msgBuilder_ == null) {
               this.msgBuilder_ = new SingleFieldBuilderV3(this.getMsg(), this.getParentForChildren(), this.isClean());
               this.msg_ = null;
            }

            return this.msgBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface CR2S_AtkCooperation_25321OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      DragonCaveMsg.Event getEvent();

      DragonCaveMsg.EventOrBuilder getEventOrBuilder();

      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);

      boolean hasNum();

      int getNum();

      boolean hasBattle();

      BattleMsg.S2C_BattleResult_6102 getBattle();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder();
   }

   public interface CR2S_BeKill_25312OrBuilder extends MessageOrBuilder {
      boolean hasItem();

      int getItem();

      boolean hasPropertyItem();

      int getPropertyItem();

      boolean hasDamage();

      long getDamage();

      boolean hasAtkServer();

      int getAtkServer();

      boolean hasAtkName();

      String getAtkName();

      ByteString getAtkNameBytes();
   }

   public interface CR2S_EventHandle_25320OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      DragonCaveMsg.Event getEvent();

      DragonCaveMsg.EventOrBuilder getEventOrBuilder();

      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);

      boolean hasBoxType();

      int getBoxType();

      boolean hasBattle();

      BattleMsg.S2C_BattleResult_6102 getBattle();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder();
   }

   public interface CR2S_Explore_25322OrBuilder extends MessageOrBuilder {
      boolean hasMsg();

      DragonCaveMsg.S2C_Explore_25246 getMsg();

      DragonCaveMsg.S2C_Explore_25246OrBuilder getMsgOrBuilder();
   }

   public interface S2CR_AddEnergy_25313OrBuilder extends MessageOrBuilder {
      boolean hasEnergy();

      int getEnergy();
   }

   public interface S2CR_AtkCooperation_25314OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2CR_AtkSkip_25304OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Cooperation_25317OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Energy_25319OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_EventHandle_25307OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();

      List<CommonMsg.ItemInfo> getPropertyItemList();

      CommonMsg.ItemInfo getPropertyItem(int index);

      int getPropertyItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index);
   }

   public interface S2CR_ExploreMain_25303OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getKillMonsterList();

      CommonMsg.MapDataII getKillMonster(int index);

      int getKillMonsterCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getKillMonsterOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getKillMonsterOrBuilder(int index);
   }

   public interface S2CR_Explore_25306OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Logs_25316OrBuilder extends MessageOrBuilder {
      boolean hasMine();

      boolean getMine();
   }

   public interface S2CR_MakeCooperation_25318OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Rank_25315OrBuilder extends MessageOrBuilder {
      boolean hasType();

      DragonCaveMsg.RankType getType();
   }

   public interface S2CR_TeamUpload_25301OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasTeamName();

      String getTeamName();

      ByteString getTeamNameBytes();

      boolean hasCaptain();

      int getCaptain();

      List<Integer> getPlayersList();

      int getPlayersCount();

      int getPlayers(int index);

      boolean hasDismiss();

      boolean getDismiss();
   }

   public interface S2CR_UploadArraying_25311OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2CR_UploadIntegral_25302OrBuilder extends MessageOrBuilder {
      boolean hasIntegral();

      int getIntegral();
   }

   public interface S2CR_UploadItem_25308OrBuilder extends MessageOrBuilder {
      boolean hasItem();

      int getItem();
   }

   public interface S2CR_UploadMap_25309OrBuilder extends MessageOrBuilder {
      boolean hasMapId();

      int getMapId();
   }

   public interface S2CR_UploadPropertyItem_25310OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getPropertyItemList();

      CommonMsg.ItemInfo getPropertyItem(int index);

      int getPropertyItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getPropertyItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getPropertyItemOrBuilder(int index);
   }
}
