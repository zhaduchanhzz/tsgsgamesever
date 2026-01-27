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

public final class ActivityGuoQingMsg {
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityGuoQingMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015ActivityGuoQing.proto\u0012!activityGuoQing.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_21901\">\n\u0016S2C_ActivityInfo_21902\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_21903\"D\n\u0017S2C_ShopAddUpInfo_21904\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_21905\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_21906\"F\n\u0017S2C_SignTotalInfo_21907\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_21908\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_21913\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_21914\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_21915\"×\u0001\n\u0016S2C_LuckDrawInfo_21916\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_21917\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_21918\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0003 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0005 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0006 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0007 \u0002(\u0005\"\"\n\u0014C2S_OpenReward_21919\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_21920\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_21921\"Y\n\u0014S2C_DrawRecord_21922\u0012A\n\bmyRecord\u0018\u0001 \u0003(\u000b2/.activityGuoQing.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_21923\"g\n\u001aS2C_ServerDrawRecord_21924\u0012I\n\fserverRecord\u0018\u0001 \u0003(\u000b23.activityGuoQing.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\"=\n\fGameBuilding\u0012\u000f\n\u0007buildId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardLv\u0018\u0003 \u0003(\u0005\"0\n\tGameEvent\u0012\u000f\n\u0007eventId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\neventParam\u0018\u0002 \u0003(\u0005\"\u0014\n\u0012C2S_GameMain_21931\"Ï\u0001\n\u0012S2C_GameMain_21932\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0003 \u0002(\u0005\u0012A\n\bbuilding\u0018\u0004 \u0003(\u000b2/.activityGuoQing.com.gzbz.protobuf.GameBuilding\u0012;\n\u0005event\u0018\u0005 \u0001(\u000b2,.activityGuoQing.com.gzbz.protobuf.GameEvent\"3\n\u0016C2S_GameRollDice_21933\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"Ö\u0001\n\u0016S2C_GameRollDice_21934\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0004 \u0002(\u0005\u0012;\n\u0005event\u0018\u0005 \u0001(\u000b2,.activityGuoQing.com.gzbz.protobuf.GameEvent\u0012A\n\bbuilding\u0018\u0006 \u0001(\u000b2/.activityGuoQing.com.gzbz.protobuf.GameBuilding\"\u001d\n\u001bC2S_GameAddRandomDice_21935\"2\n\u001bS2C_GameAddRandomDice_21936\u0012\u0013\n\u000bdiceRecover\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_GameGoldDiceBuy_21937\"3\n\u0019S2C_GameGoldDiceBuy_21938\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0001 \u0002(\u0005\"R\n\u0013C2S_GameEvent_21939\u0012;\n\u0005event\u0018\u0001 \u0002(\u000b2,.activityGuoQing.com.gzbz.protobuf.GameEvent\"ä\u0001\n\u0013S2C_GameEvent_21940\u0012;\n\u0005event\u0018\u0001 \u0002(\u000b2,.activityGuoQing.com.gzbz.protobuf.GameEvent\u0012\f\n\u0004grid\u0018\u0002 \u0002(\u0005\u0012A\n\bbuilding\u0018\u0003 \u0001(\u000b2/.activityGuoQing.com.gzbz.protobuf.GameBuilding\u0012?\n\tnextEvent\u0018\u0004 \u0001(\u000b2,.activityGuoQing.com.gzbz.protobuf.GameEvent\"\u0014\n\u0012C2S_GameTask_21941\"0\n\u0012S2C_GameTask_21942\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"*\n\u0018C2S_GameTaskCommit_21943\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_GameTaskCommit_21944\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"6\n\u0018S2C_GameTaskNotify_21946\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\">\n\u001cC2S_GameBuildingReward_21947\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\">\n\u001cS2C_GameBuildingReward_21948\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005B)\n\u0011com.gzbz.protobufB\u0012ActivityGuoQingMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor, new String[]{"OpenDay", "ActivityDay"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor, new String[]{"Id"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor, new String[]{"Day"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor, new String[]{"TargetId"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor, new String[]{"Result", "TargetId"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor, new String[]{"Type"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor, new String[]{"Id"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor, new String[]{"Id"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor, new String[]{"MyRecord"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor, new String[]{"ServerRecord"});
      internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor, new String[]{"BuildId", "Lv", "RewardLv"});
      internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor, new String[]{"EventId", "EventParam"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor, new String[]{"Grid", "DiceRecover", "BuyGoldDiceNum", "Building", "Event"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor, new String[]{"Type", "Num"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor, new String[]{"Type", "Num", "Grid", "DiceRecover", "Event", "Building"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor, new String[]{"DiceRecover"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor, new String[]{"BuyGoldDiceNum"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor, new String[]{"Event"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor, new String[]{"Event", "Grid", "Building", "NextEvent"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor, new String[0]);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor, new String[]{"Task"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor, new String[]{"TaskId"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor, new String[]{"TaskId"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor, new String[]{"Task"});
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor, new String[]{"BuildingId", "Lv"});
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor, new String[]{"BuildingId", "Lv"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_21901 extends GeneratedMessageV3 implements C2S_ActivityInfo_21901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_21901 DEFAULT_INSTANCE = new C2S_ActivityInfo_21901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_21901> PARSER = new AbstractParser<C2S_ActivityInfo_21901>() {
         public C2S_ActivityInfo_21901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_21901(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_21901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_21901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_21901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_21901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_21901)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_21901 other = (C2S_ActivityInfo_21901)obj;
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

      public static C2S_ActivityInfo_21901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21901 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_21901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_21901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_21901> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_21901> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_21901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_21901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_ActivityInfo_21901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ActivityInfo_21901_descriptor;
         }

         public C2S_ActivityInfo_21901 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_ActivityInfo_21901.getDefaultInstance();
         }

         public C2S_ActivityInfo_21901 build() {
            C2S_ActivityInfo_21901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_21901 buildPartial() {
            C2S_ActivityInfo_21901 result = new C2S_ActivityInfo_21901(this);
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
            if (other instanceof C2S_ActivityInfo_21901) {
               return this.mergeFrom((C2S_ActivityInfo_21901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_21901 other) {
            if (other == ActivityGuoQingMsg.C2S_ActivityInfo_21901.getDefaultInstance()) {
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
            C2S_ActivityInfo_21901 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_21901)ActivityGuoQingMsg.C2S_ActivityInfo_21901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_21901)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_21902 extends GeneratedMessageV3 implements S2C_ActivityInfo_21902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_21902 DEFAULT_INSTANCE = new S2C_ActivityInfo_21902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_21902> PARSER = new AbstractParser<S2C_ActivityInfo_21902>() {
         public S2C_ActivityInfo_21902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_21902(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_21902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_21902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_21902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_21902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityDay_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21902.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
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
         } else if (!this.hasActivityDay()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.activityDay_);
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
               size += CodedOutputStream.computeInt32Size(2, this.activityDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_21902)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_21902 other = (S2C_ActivityInfo_21902)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
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

            if (this.hasActivityDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActivityDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_21902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21902 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_21902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_21902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_21902> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_21902> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_21902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_21902OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_ActivityInfo_21902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.activityDay_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ActivityInfo_21902_descriptor;
         }

         public S2C_ActivityInfo_21902 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_ActivityInfo_21902.getDefaultInstance();
         }

         public S2C_ActivityInfo_21902 build() {
            S2C_ActivityInfo_21902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_21902 buildPartial() {
            S2C_ActivityInfo_21902 result = new S2C_ActivityInfo_21902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.activityDay_ = this.activityDay_;
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
            if (other instanceof S2C_ActivityInfo_21902) {
               return this.mergeFrom((S2C_ActivityInfo_21902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_21902 other) {
            if (other == ActivityGuoQingMsg.S2C_ActivityInfo_21902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenDay()) {
               return false;
            } else {
               return this.hasActivityDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_21902 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_21902)ActivityGuoQingMsg.S2C_ActivityInfo_21902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_21902)e.getUnfinishedMessage();
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

         public boolean hasActivityDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 2;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -3;
            this.activityDay_ = 0;
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

   public static final class C2S_ShopAddUpInfo_21903 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_21903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_21903 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_21903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_21903> PARSER = new AbstractParser<C2S_ShopAddUpInfo_21903>() {
         public C2S_ShopAddUpInfo_21903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_21903(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_21903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_21903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_21903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_21903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_21903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_21903)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_21903 other = (C2S_ShopAddUpInfo_21903)obj;
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

      public static C2S_ShopAddUpInfo_21903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_21903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_21903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_21903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_21903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_21903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_21903> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_21903> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_21903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_21903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_21903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_ShopAddUpInfo_21903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ShopAddUpInfo_21903_descriptor;
         }

         public C2S_ShopAddUpInfo_21903 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_ShopAddUpInfo_21903.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_21903 build() {
            C2S_ShopAddUpInfo_21903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_21903 buildPartial() {
            C2S_ShopAddUpInfo_21903 result = new C2S_ShopAddUpInfo_21903(this);
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
            if (other instanceof C2S_ShopAddUpInfo_21903) {
               return this.mergeFrom((C2S_ShopAddUpInfo_21903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_21903 other) {
            if (other == ActivityGuoQingMsg.C2S_ShopAddUpInfo_21903.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_21903 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_21903)ActivityGuoQingMsg.C2S_ShopAddUpInfo_21903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_21903)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_21904 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_21904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_21904 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_21904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_21904> PARSER = new AbstractParser<S2C_ShopAddUpInfo_21904>() {
         public S2C_ShopAddUpInfo_21904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_21904(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_21904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_21904() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_21904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_21904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dailyRecharge_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRewards_.addInt(input.readInt32());
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
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_21904.class, Builder.class);
      }

      public boolean hasDailyRecharge() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDailyRecharge() {
         return this.dailyRecharge_;
      }

      public List<Integer> getGotRewardsList() {
         return this.gotRewards_;
      }

      public int getGotRewardsCount() {
         return this.gotRewards_.size();
      }

      public int getGotRewards(int index) {
         return this.gotRewards_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDailyRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dailyRecharge_);
         }

         for(int i = 0; i < this.gotRewards_.size(); ++i) {
            output.writeInt32(2, this.gotRewards_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.dailyRecharge_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopAddUpInfo_21904)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_21904 other = (S2C_ShopAddUpInfo_21904)obj;
            if (this.hasDailyRecharge() != other.hasDailyRecharge()) {
               return false;
            } else if (this.hasDailyRecharge() && this.getDailyRecharge() != other.getDailyRecharge()) {
               return false;
            } else if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
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
            if (this.hasDailyRecharge()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDailyRecharge();
            }

            if (this.getGotRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_21904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_21904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_21904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_21904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_21904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_21904> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_21904> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_21904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_21904OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_21904.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ShopAddUpInfo_21904_descriptor;
         }

         public S2C_ShopAddUpInfo_21904 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_21904 build() {
            S2C_ShopAddUpInfo_21904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_21904 buildPartial() {
            S2C_ShopAddUpInfo_21904 result = new S2C_ShopAddUpInfo_21904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dailyRecharge_ = this.dailyRecharge_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotRewards_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotRewards_ = this.gotRewards_;
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
            if (other instanceof S2C_ShopAddUpInfo_21904) {
               return this.mergeFrom((S2C_ShopAddUpInfo_21904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_21904 other) {
            if (other == ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDailyRecharge()) {
                  this.setDailyRecharge(other.getDailyRecharge());
               }

               if (!other.gotRewards_.isEmpty()) {
                  if (this.gotRewards_.isEmpty()) {
                     this.gotRewards_ = other.gotRewards_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRewardsIsMutable();
                     this.gotRewards_.addAll(other.gotRewards_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDailyRecharge();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopAddUpInfo_21904 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_21904)ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_21904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDailyRecharge() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDailyRecharge() {
            return this.dailyRecharge_;
         }

         public Builder setDailyRecharge(int value) {
            this.bitField0_ |= 1;
            this.dailyRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyRecharge() {
            this.bitField0_ &= -2;
            this.dailyRecharge_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotRewards_ = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.mutableCopy(this.gotRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotRewards_) : this.gotRewards_);
         }

         public int getGotRewardsCount() {
            return this.gotRewards_.size();
         }

         public int getGotRewards(int index) {
            return this.gotRewards_.getInt(index);
         }

         public Builder setGotRewards(int index, int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewards(int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewards(Iterable<? extends Integer> values) {
            this.ensureGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewards() {
            this.gotRewards_ = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_21905 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_21905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_21905 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_21905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_21905> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_21905>() {
         public C2S_ReceiveShopAddUpReward_21905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_21905(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_21905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_21905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_21905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_21905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_21905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_21905)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_21905 other = (C2S_ReceiveShopAddUpReward_21905)obj;
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

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_21905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_21905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_21905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_21905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_21905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_21905> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_21905> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_21905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_21905OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_21905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_ReceiveShopAddUpReward_21905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_21905_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_21905 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_ReceiveShopAddUpReward_21905.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_21905 build() {
            C2S_ReceiveShopAddUpReward_21905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_21905 buildPartial() {
            C2S_ReceiveShopAddUpReward_21905 result = new C2S_ReceiveShopAddUpReward_21905(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_21905) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_21905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_21905 other) {
            if (other == ActivityGuoQingMsg.C2S_ReceiveShopAddUpReward_21905.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_21905 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_21905)ActivityGuoQingMsg.C2S_ReceiveShopAddUpReward_21905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_21905)e.getUnfinishedMessage();
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

   public static final class C2S_SignTotalInfo_21906 extends GeneratedMessageV3 implements C2S_SignTotalInfo_21906OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_21906 DEFAULT_INSTANCE = new C2S_SignTotalInfo_21906();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_21906> PARSER = new AbstractParser<C2S_SignTotalInfo_21906>() {
         public C2S_SignTotalInfo_21906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_21906(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_21906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_21906() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_21906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_21906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_21906.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_21906)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_21906 other = (C2S_SignTotalInfo_21906)obj;
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

      public static C2S_SignTotalInfo_21906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_21906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21906 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_21906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_21906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_21906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_21906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_21906> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_21906> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_21906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_21906OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_21906.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_SignTotalInfo_21906.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_SignTotalInfo_21906_descriptor;
         }

         public C2S_SignTotalInfo_21906 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_SignTotalInfo_21906.getDefaultInstance();
         }

         public C2S_SignTotalInfo_21906 build() {
            C2S_SignTotalInfo_21906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_21906 buildPartial() {
            C2S_SignTotalInfo_21906 result = new C2S_SignTotalInfo_21906(this);
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
            if (other instanceof C2S_SignTotalInfo_21906) {
               return this.mergeFrom((C2S_SignTotalInfo_21906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_21906 other) {
            if (other == ActivityGuoQingMsg.C2S_SignTotalInfo_21906.getDefaultInstance()) {
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
            C2S_SignTotalInfo_21906 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_21906)ActivityGuoQingMsg.C2S_SignTotalInfo_21906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_21906)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_21907 extends GeneratedMessageV3 implements S2C_SignTotalInfo_21907OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_21907 DEFAULT_INSTANCE = new S2C_SignTotalInfo_21907();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_21907> PARSER = new AbstractParser<S2C_SignTotalInfo_21907>() {
         public S2C_SignTotalInfo_21907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_21907(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_21907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_21907() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_21907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_21907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityDay_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.signGotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.signGotRewards_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.signGotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.signGotRewards_.addInt(input.readInt32());
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
                  this.signGotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_21907.class, Builder.class);
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public List<Integer> getSignGotRewardsList() {
         return this.signGotRewards_;
      }

      public int getSignGotRewardsCount() {
         return this.signGotRewards_.size();
      }

      public int getSignGotRewards(int index) {
         return this.signGotRewards_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityDay_);
         }

         for(int i = 0; i < this.signGotRewards_.size(); ++i) {
            output.writeInt32(2, this.signGotRewards_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.activityDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.signGotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.signGotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSignGotRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SignTotalInfo_21907)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_21907 other = (S2C_SignTotalInfo_21907)obj;
            if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (!this.getSignGotRewardsList().equals(other.getSignGotRewardsList())) {
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
            if (this.hasActivityDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.getSignGotRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSignGotRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SignTotalInfo_21907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_21907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21907 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_21907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_21907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_21907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_21907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_21907> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_21907> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_21907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_21907OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_21907.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_SignTotalInfo_21907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_SignTotalInfo_21907_descriptor;
         }

         public S2C_SignTotalInfo_21907 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_SignTotalInfo_21907.getDefaultInstance();
         }

         public S2C_SignTotalInfo_21907 build() {
            S2C_SignTotalInfo_21907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_21907 buildPartial() {
            S2C_SignTotalInfo_21907 result = new S2C_SignTotalInfo_21907(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.signGotRewards_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.signGotRewards_ = this.signGotRewards_;
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
            if (other instanceof S2C_SignTotalInfo_21907) {
               return this.mergeFrom((S2C_SignTotalInfo_21907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_21907 other) {
            if (other == ActivityGuoQingMsg.S2C_SignTotalInfo_21907.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (!other.signGotRewards_.isEmpty()) {
                  if (this.signGotRewards_.isEmpty()) {
                     this.signGotRewards_ = other.signGotRewards_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureSignGotRewardsIsMutable();
                     this.signGotRewards_.addAll(other.signGotRewards_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActivityDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SignTotalInfo_21907 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_21907)ActivityGuoQingMsg.S2C_SignTotalInfo_21907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_21907)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 1;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -2;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSignGotRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.signGotRewards_ = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.mutableCopy(this.signGotRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getSignGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.signGotRewards_) : this.signGotRewards_);
         }

         public int getSignGotRewardsCount() {
            return this.signGotRewards_.size();
         }

         public int getSignGotRewards(int index) {
            return this.signGotRewards_.getInt(index);
         }

         public Builder setSignGotRewards(int index, int value) {
            this.ensureSignGotRewardsIsMutable();
            this.signGotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSignGotRewards(int value) {
            this.ensureSignGotRewardsIsMutable();
            this.signGotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSignGotRewards(Iterable<? extends Integer> values) {
            this.ensureSignGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.signGotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearSignGotRewards() {
            this.signGotRewards_ = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.emptyIntList();
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

   public static final class C2S_Sign_21908 extends GeneratedMessageV3 implements C2S_Sign_21908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_21908 DEFAULT_INSTANCE = new C2S_Sign_21908();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_21908> PARSER = new AbstractParser<C2S_Sign_21908>() {
         public C2S_Sign_21908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_21908(input, extensionRegistry);
         }
      };

      private C2S_Sign_21908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_21908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_21908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_21908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_21908.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_21908)) {
            return super.equals(obj);
         } else {
            C2S_Sign_21908 other = (C2S_Sign_21908)obj;
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

      public static C2S_Sign_21908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data);
      }

      public static C2S_Sign_21908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_21908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_21908 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_21908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_21908 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_21908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_21908 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_21908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_21908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_21908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_21908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_21908> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_21908> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_21908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_21908OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_21908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_Sign_21908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Sign_21908_descriptor;
         }

         public C2S_Sign_21908 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_Sign_21908.getDefaultInstance();
         }

         public C2S_Sign_21908 build() {
            C2S_Sign_21908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_21908 buildPartial() {
            C2S_Sign_21908 result = new C2S_Sign_21908(this);
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
            if (other instanceof C2S_Sign_21908) {
               return this.mergeFrom((C2S_Sign_21908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_21908 other) {
            if (other == ActivityGuoQingMsg.C2S_Sign_21908.getDefaultInstance()) {
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
            C2S_Sign_21908 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_21908)ActivityGuoQingMsg.C2S_Sign_21908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_21908)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_21913 extends GeneratedMessageV3 implements C2S_FancyReward_21913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_21913 DEFAULT_INSTANCE = new C2S_FancyReward_21913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_21913> PARSER = new AbstractParser<C2S_FancyReward_21913>() {
         public C2S_FancyReward_21913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_21913(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_21913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_21913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_21913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_21913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetId_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_21913.class, Builder.class);
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FancyReward_21913)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_21913 other = (C2S_FancyReward_21913)obj;
            if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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
            if (this.hasTargetId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FancyReward_21913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_21913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_21913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_21913 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_21913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_21913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_21913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_21913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_21913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_21913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_21913> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_21913> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_21913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_21913OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_21913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_FancyReward_21913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_FancyReward_21913_descriptor;
         }

         public C2S_FancyReward_21913 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_FancyReward_21913.getDefaultInstance();
         }

         public C2S_FancyReward_21913 build() {
            C2S_FancyReward_21913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_21913 buildPartial() {
            C2S_FancyReward_21913 result = new C2S_FancyReward_21913(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_FancyReward_21913) {
               return this.mergeFrom((C2S_FancyReward_21913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_21913 other) {
            if (other == ActivityGuoQingMsg.C2S_FancyReward_21913.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FancyReward_21913 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_21913)ActivityGuoQingMsg.C2S_FancyReward_21913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_21913)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 1;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -2;
            this.targetId_ = 0;
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

   public static final class S2C_FancyReward_21914 extends GeneratedMessageV3 implements S2C_FancyReward_21914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_21914 DEFAULT_INSTANCE = new S2C_FancyReward_21914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_21914> PARSER = new AbstractParser<S2C_FancyReward_21914>() {
         public S2C_FancyReward_21914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_21914(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_21914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_21914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_21914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_21914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetId_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_21914.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
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
         } else if (!this.hasTargetId()) {
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
            output.writeInt32(2, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FancyReward_21914)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_21914 other = (S2C_FancyReward_21914)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FancyReward_21914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_21914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_21914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_21914 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_21914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_21914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_21914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_21914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_21914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_21914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_21914> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_21914> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_21914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_21914OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_21914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_FancyReward_21914.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.targetId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_FancyReward_21914_descriptor;
         }

         public S2C_FancyReward_21914 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_FancyReward_21914.getDefaultInstance();
         }

         public S2C_FancyReward_21914 build() {
            S2C_FancyReward_21914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_21914 buildPartial() {
            S2C_FancyReward_21914 result = new S2C_FancyReward_21914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof S2C_FancyReward_21914) {
               return this.mergeFrom((S2C_FancyReward_21914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_21914 other) {
            if (other == ActivityGuoQingMsg.S2C_FancyReward_21914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
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
               return this.hasTargetId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FancyReward_21914 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_21914)ActivityGuoQingMsg.S2C_FancyReward_21914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_21914)e.getUnfinishedMessage();
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

         public boolean hasTargetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 2;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -3;
            this.targetId_ = 0;
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

   public static final class C2S_LuckDrawInfo_21915 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_21915OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_21915 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_21915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_21915> PARSER = new AbstractParser<C2S_LuckDrawInfo_21915>() {
         public C2S_LuckDrawInfo_21915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_21915(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_21915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_21915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_21915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_21915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_21915.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_21915)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_21915 other = (C2S_LuckDrawInfo_21915)obj;
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

      public static C2S_LuckDrawInfo_21915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_21915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_21915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_21915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_21915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_21915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_21915> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_21915> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_21915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_21915OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_21915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_LuckDrawInfo_21915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_LuckDrawInfo_21915_descriptor;
         }

         public C2S_LuckDrawInfo_21915 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_LuckDrawInfo_21915.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_21915 build() {
            C2S_LuckDrawInfo_21915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_21915 buildPartial() {
            C2S_LuckDrawInfo_21915 result = new C2S_LuckDrawInfo_21915(this);
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
            if (other instanceof C2S_LuckDrawInfo_21915) {
               return this.mergeFrom((C2S_LuckDrawInfo_21915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_21915 other) {
            if (other == ActivityGuoQingMsg.C2S_LuckDrawInfo_21915.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_21915 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_21915)ActivityGuoQingMsg.C2S_LuckDrawInfo_21915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_21915)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_21916 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_21916OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWTIMES_FIELD_NUMBER = 1;
      private int drawTimes_;
      public static final int HADREWARDID_FIELD_NUMBER = 2;
      private Internal.IntList hadRewardId_;
      public static final int STAGENDTIME_FIELD_NUMBER = 3;
      private long stagEndTime_;
      public static final int RECRUITNUM_FIELD_NUMBER = 4;
      private int recruitNum_;
      public static final int SENIORREWARDS_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> seniorRewards_;
      public static final int LOTTERYSTAGE_FIELD_NUMBER = 6;
      private int lotteryStage_;
      public static final int FANCYID_FIELD_NUMBER = 7;
      private int fancyId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckDrawInfo_21916 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_21916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_21916> PARSER = new AbstractParser<S2C_LuckDrawInfo_21916>() {
         public S2C_LuckDrawInfo_21916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_21916(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_21916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_21916() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_21916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_21916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawTimes_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.hadRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.hadRewardId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hadRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.stagEndTime_ = input.readInt64();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.recruitNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.seniorRewards_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.seniorRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.lotteryStage_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.fancyId_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.hadRewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.hadRewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_21916.class, Builder.class);
      }

      public boolean hasDrawTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawTimes() {
         return this.drawTimes_;
      }

      public List<Integer> getHadRewardIdList() {
         return this.hadRewardId_;
      }

      public int getHadRewardIdCount() {
         return this.hadRewardId_.size();
      }

      public int getHadRewardId(int index) {
         return this.hadRewardId_.getInt(index);
      }

      public boolean hasStagEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getStagEndTime() {
         return this.stagEndTime_;
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public List<CommonMsg.MapDataII> getSeniorRewardsList() {
         return this.seniorRewards_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
         return this.seniorRewards_;
      }

      public int getSeniorRewardsCount() {
         return this.seniorRewards_.size();
      }

      public CommonMsg.MapDataII getSeniorRewards(int index) {
         return (CommonMsg.MapDataII)this.seniorRewards_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index);
      }

      public boolean hasLotteryStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLotteryStage() {
         return this.lotteryStage_;
      }

      public boolean hasFancyId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getFancyId() {
         return this.fancyId_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStagEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotteryStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
               if (!this.getSeniorRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.drawTimes_);
         }

         for(int i = 0; i < this.hadRewardId_.size(); ++i) {
            output.writeInt32(2, this.hadRewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.stagEndTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.recruitNum_);
         }

         for(int i = 0; i < this.seniorRewards_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.seniorRewards_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.lotteryStage_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.fancyId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.drawTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.hadRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hadRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHadRewardIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.stagEndTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recruitNum_);
            }

            for(int i = 0; i < this.seniorRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.seniorRewards_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.lotteryStage_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.fancyId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckDrawInfo_21916)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_21916 other = (S2C_LuckDrawInfo_21916)obj;
            if (this.hasDrawTimes() != other.hasDrawTimes()) {
               return false;
            } else if (this.hasDrawTimes() && this.getDrawTimes() != other.getDrawTimes()) {
               return false;
            } else if (!this.getHadRewardIdList().equals(other.getHadRewardIdList())) {
               return false;
            } else if (this.hasStagEndTime() != other.hasStagEndTime()) {
               return false;
            } else if (this.hasStagEndTime() && this.getStagEndTime() != other.getStagEndTime()) {
               return false;
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
               return false;
            } else if (!this.getSeniorRewardsList().equals(other.getSeniorRewardsList())) {
               return false;
            } else if (this.hasLotteryStage() != other.hasLotteryStage()) {
               return false;
            } else if (this.hasLotteryStage() && this.getLotteryStage() != other.getLotteryStage()) {
               return false;
            } else if (this.hasFancyId() != other.hasFancyId()) {
               return false;
            } else if (this.hasFancyId() && this.getFancyId() != other.getFancyId()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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
            if (this.hasDrawTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawTimes();
            }

            if (this.getHadRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHadRewardIdList().hashCode();
            }

            if (this.hasStagEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getStagEndTime());
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.getSeniorRewardsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSeniorRewardsList().hashCode();
            }

            if (this.hasLotteryStage()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLotteryStage();
            }

            if (this.hasFancyId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getFancyId();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_21916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_21916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_21916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_21916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_21916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_21916> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_21916> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_21916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_21916OrBuilder {
         private int bitField0_;
         private int drawTimes_;
         private Internal.IntList hadRewardId_;
         private long stagEndTime_;
         private int recruitNum_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int lotteryStage_;
         private int fancyId_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_21916.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.emptyIntList();
            this.bitField0_ &= -3;
            this.stagEndTime_ = 0L;
            this.bitField0_ &= -5;
            this.recruitNum_ = 0;
            this.bitField0_ &= -9;
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            this.lotteryStage_ = 0;
            this.bitField0_ &= -33;
            this.fancyId_ = 0;
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_LuckDrawInfo_21916_descriptor;
         }

         public S2C_LuckDrawInfo_21916 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_21916 build() {
            S2C_LuckDrawInfo_21916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_21916 buildPartial() {
            S2C_LuckDrawInfo_21916 result = new S2C_LuckDrawInfo_21916(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawTimes_ = this.drawTimes_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.hadRewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.hadRewardId_ = this.hadRewardId_;
            if ((from_bitField0_ & 4) != 0) {
               result.stagEndTime_ = this.stagEndTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.recruitNum_ = this.recruitNum_;
               to_bitField0_ |= 4;
            }

            if (this.seniorRewardsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
                  this.bitField0_ &= -17;
               }

               result.seniorRewards_ = this.seniorRewards_;
            } else {
               result.seniorRewards_ = this.seniorRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.lotteryStage_ = this.lotteryStage_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.fancyId_ = this.fancyId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_LuckDrawInfo_21916) {
               return this.mergeFrom((S2C_LuckDrawInfo_21916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_21916 other) {
            if (other == ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawTimes()) {
                  this.setDrawTimes(other.getDrawTimes());
               }

               if (!other.hadRewardId_.isEmpty()) {
                  if (this.hadRewardId_.isEmpty()) {
                     this.hadRewardId_ = other.hadRewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHadRewardIdIsMutable();
                     this.hadRewardId_.addAll(other.hadRewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasStagEndTime()) {
                  this.setStagEndTime(other.getStagEndTime());
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               if (this.seniorRewardsBuilder_ == null) {
                  if (!other.seniorRewards_.isEmpty()) {
                     if (this.seniorRewards_.isEmpty()) {
                        this.seniorRewards_ = other.seniorRewards_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureSeniorRewardsIsMutable();
                        this.seniorRewards_.addAll(other.seniorRewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorRewards_.isEmpty()) {
                  if (this.seniorRewardsBuilder_.isEmpty()) {
                     this.seniorRewardsBuilder_.dispose();
                     this.seniorRewardsBuilder_ = null;
                     this.seniorRewards_ = other.seniorRewards_;
                     this.bitField0_ &= -17;
                     this.seniorRewardsBuilder_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasLotteryStage()) {
                  this.setLotteryStage(other.getLotteryStage());
               }

               if (other.hasFancyId()) {
                  this.setFancyId(other.getFancyId());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDrawTimes()) {
               return false;
            } else if (!this.hasStagEndTime()) {
               return false;
            } else if (!this.hasRecruitNum()) {
               return false;
            } else if (!this.hasLotteryStage()) {
               return false;
            } else if (!this.hasFancyId()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
                  if (!this.getSeniorRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckDrawInfo_21916 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_21916)ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_21916)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawTimes() {
            return this.drawTimes_;
         }

         public Builder setDrawTimes(int value) {
            this.bitField0_ |= 1;
            this.drawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawTimes() {
            this.bitField0_ &= -2;
            this.drawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHadRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.hadRewardId_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.mutableCopy(this.hadRewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHadRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.hadRewardId_) : this.hadRewardId_);
         }

         public int getHadRewardIdCount() {
            return this.hadRewardId_.size();
         }

         public int getHadRewardId(int index) {
            return this.hadRewardId_.getInt(index);
         }

         public Builder setHadRewardId(int index, int value) {
            this.ensureHadRewardIdIsMutable();
            this.hadRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHadRewardId(int value) {
            this.ensureHadRewardIdIsMutable();
            this.hadRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHadRewardId(Iterable<? extends Integer> values) {
            this.ensureHadRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hadRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearHadRewardId() {
            this.hadRewardId_ = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasStagEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getStagEndTime() {
            return this.stagEndTime_;
         }

         public Builder setStagEndTime(long value) {
            this.bitField0_ |= 4;
            this.stagEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStagEndTime() {
            this.bitField0_ &= -5;
            this.stagEndTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 8;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -9;
            this.recruitNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorRewardsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.seniorRewards_ = new ArrayList(this.seniorRewards_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorRewardsList() {
            return this.seniorRewardsBuilder_ == null ? Collections.unmodifiableList(this.seniorRewards_) : this.seniorRewardsBuilder_.getMessageList();
         }

         public int getSeniorRewardsCount() {
            return this.seniorRewardsBuilder_ == null ? this.seniorRewards_.size() : this.seniorRewardsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorRewards(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataII)this.seniorRewards_.get(index) : (CommonMsg.MapDataII)this.seniorRewardsBuilder_.getMessage(index);
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorRewards(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorRewards_);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorRewards() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorRewards(int index) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.remove(index);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorRewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
            return this.seniorRewardsBuilder_ != null ? this.seniorRewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorRewards_);
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorRewardsBuilderList() {
            return this.getSeniorRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorRewardsFieldBuilder() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewardsBuilder_ = new RepeatedFieldBuilderV3(this.seniorRewards_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.seniorRewards_ = null;
            }

            return this.seniorRewardsBuilder_;
         }

         public boolean hasLotteryStage() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLotteryStage() {
            return this.lotteryStage_;
         }

         public Builder setLotteryStage(int value) {
            this.bitField0_ |= 32;
            this.lotteryStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryStage() {
            this.bitField0_ &= -33;
            this.lotteryStage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getFancyId() {
            return this.fancyId_;
         }

         public Builder setFancyId(int value) {
            this.bitField0_ |= 64;
            this.fancyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyId() {
            this.bitField0_ &= -65;
            this.fancyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 128;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -129;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_Draw_21917 extends GeneratedMessageV3 implements C2S_Draw_21917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_21917 DEFAULT_INSTANCE = new C2S_Draw_21917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_21917> PARSER = new AbstractParser<C2S_Draw_21917>() {
         public C2S_Draw_21917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_21917(input, extensionRegistry);
         }
      };

      private C2S_Draw_21917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_21917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_21917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_21917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_21917.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_21917)) {
            return super.equals(obj);
         } else {
            C2S_Draw_21917 other = (C2S_Draw_21917)obj;
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

      public static C2S_Draw_21917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data);
      }

      public static C2S_Draw_21917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_21917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_21917 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_21917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_21917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_21917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_21917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_21917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_21917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_21917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_21917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_21917> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_21917> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_21917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_21917OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_21917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_Draw_21917.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_Draw_21917_descriptor;
         }

         public C2S_Draw_21917 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_Draw_21917.getDefaultInstance();
         }

         public C2S_Draw_21917 build() {
            C2S_Draw_21917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_21917 buildPartial() {
            C2S_Draw_21917 result = new C2S_Draw_21917(this);
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
            if (other instanceof C2S_Draw_21917) {
               return this.mergeFrom((C2S_Draw_21917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_21917 other) {
            if (other == ActivityGuoQingMsg.C2S_Draw_21917.getDefaultInstance()) {
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
            C2S_Draw_21917 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_21917)ActivityGuoQingMsg.C2S_Draw_21917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_21917)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_21918 extends GeneratedMessageV3 implements S2C_Draw_21918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWTIMES_FIELD_NUMBER = 1;
      private int drawTimes_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      public static final int RECRUITNUM_FIELD_NUMBER = 3;
      private int recruitNum_;
      public static final int SENIORNUM_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 5;
      private boolean isHaveFancy_;
      public static final int TARGETID_FIELD_NUMBER = 6;
      private int targetId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 7;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_Draw_21918 DEFAULT_INSTANCE = new S2C_Draw_21918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_21918> PARSER = new AbstractParser<S2C_Draw_21918>() {
         public S2C_Draw_21918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_21918(input, extensionRegistry);
         }
      };

      private S2C_Draw_21918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_21918() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_21918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_21918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawTimes_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.recruitNum_ = input.readInt32();
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.isHaveFancy_ = input.readBool();
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.targetId_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.id_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.id_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_21918.class, Builder.class);
      }

      public boolean hasDrawTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawTimes() {
         return this.drawTimes_;
      }

      public List<Integer> getIdList() {
         return this.id_;
      }

      public int getIdCount() {
         return this.id_.size();
      }

      public int getId(int index) {
         return this.id_.getInt(index);
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public List<CommonMsg.MapDataII> getSeniorNumList() {
         return this.seniorNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
         return this.seniorNum_;
      }

      public int getSeniorNumCount() {
         return this.seniorNum_.size();
      }

      public CommonMsg.MapDataII getSeniorNum(int index) {
         return (CommonMsg.MapDataII)this.seniorNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index);
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorNumCount(); ++i) {
               if (!this.getSeniorNum(i).isInitialized()) {
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
            output.writeInt32(1, this.drawTimes_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.recruitNum_);
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(5, this.isHaveFancy_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.targetId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.drawTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.recruitNum_);
            }

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isHaveFancy_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.targetId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Draw_21918)) {
            return super.equals(obj);
         } else {
            S2C_Draw_21918 other = (S2C_Draw_21918)obj;
            if (this.hasDrawTimes() != other.hasDrawTimes()) {
               return false;
            } else if (this.hasDrawTimes() && this.getDrawTimes() != other.getDrawTimes()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
               return false;
            } else if (!this.getSeniorNumList().equals(other.getSeniorNumList())) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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
            if (this.hasDrawTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawTimes();
            }

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.hasTargetId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTargetId();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Draw_21918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data);
      }

      public static S2C_Draw_21918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_21918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_21918 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_21918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_21918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_21918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_21918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_21918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_21918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_21918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_21918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_21918> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_21918> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_21918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_21918OrBuilder {
         private int bitField0_;
         private int drawTimes_;
         private Internal.IntList id_;
         private int recruitNum_;
         private List<CommonMsg.MapDataII> seniorNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorNumBuilder_;
         private boolean isHaveFancy_;
         private int targetId_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_21918.class, Builder.class);
         }

         private Builder() {
            this.id_ = ActivityGuoQingMsg.S2C_Draw_21918.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = ActivityGuoQingMsg.S2C_Draw_21918.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_Draw_21918.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = ActivityGuoQingMsg.S2C_Draw_21918.emptyIntList();
            this.bitField0_ &= -3;
            this.recruitNum_ = 0;
            this.bitField0_ &= -5;
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.seniorNumBuilder_.clear();
            }

            this.isHaveFancy_ = false;
            this.bitField0_ &= -17;
            this.targetId_ = 0;
            this.bitField0_ &= -33;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_Draw_21918_descriptor;
         }

         public S2C_Draw_21918 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_Draw_21918.getDefaultInstance();
         }

         public S2C_Draw_21918 build() {
            S2C_Draw_21918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_21918 buildPartial() {
            S2C_Draw_21918 result = new S2C_Draw_21918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawTimes_ = this.drawTimes_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
            if ((from_bitField0_ & 4) != 0) {
               result.recruitNum_ = this.recruitNum_;
               to_bitField0_ |= 2;
            }

            if (this.seniorNumBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
                  this.bitField0_ &= -9;
               }

               result.seniorNum_ = this.seniorNum_;
            } else {
               result.seniorNum_ = this.seniorNumBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.targetId_ = this.targetId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_Draw_21918) {
               return this.mergeFrom((S2C_Draw_21918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_21918 other) {
            if (other == ActivityGuoQingMsg.S2C_Draw_21918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawTimes()) {
                  this.setDrawTimes(other.getDrawTimes());
               }

               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               if (this.seniorNumBuilder_ == null) {
                  if (!other.seniorNum_.isEmpty()) {
                     if (this.seniorNum_.isEmpty()) {
                        this.seniorNum_ = other.seniorNum_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureSeniorNumIsMutable();
                        this.seniorNum_.addAll(other.seniorNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorNum_.isEmpty()) {
                  if (this.seniorNumBuilder_.isEmpty()) {
                     this.seniorNumBuilder_.dispose();
                     this.seniorNumBuilder_ = null;
                     this.seniorNum_ = other.seniorNum_;
                     this.bitField0_ &= -9;
                     this.seniorNumBuilder_ = ActivityGuoQingMsg.S2C_Draw_21918.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
                  } else {
                     this.seniorNumBuilder_.addAllMessages(other.seniorNum_);
                  }
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDrawTimes()) {
               return false;
            } else if (!this.hasRecruitNum()) {
               return false;
            } else if (!this.hasTargetId()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorNumCount(); ++i) {
                  if (!this.getSeniorNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Draw_21918 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_21918)ActivityGuoQingMsg.S2C_Draw_21918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_21918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawTimes() {
            return this.drawTimes_;
         }

         public Builder setDrawTimes(int value) {
            this.bitField0_ |= 1;
            this.drawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawTimes() {
            this.bitField0_ &= -2;
            this.drawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = ActivityGuoQingMsg.S2C_Draw_21918.mutableCopy(this.id_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
         }

         public int getIdCount() {
            return this.id_.size();
         }

         public int getId(int index) {
            return this.id_.getInt(index);
         }

         public Builder setId(int index, int value) {
            this.ensureIdIsMutable();
            this.id_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addId(int value) {
            this.ensureIdIsMutable();
            this.id_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllId(Iterable<? extends Integer> values) {
            this.ensureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.id_);
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.id_ = ActivityGuoQingMsg.S2C_Draw_21918.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 4;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -5;
            this.recruitNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorNumIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.seniorNum_ = new ArrayList(this.seniorNum_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorNumList() {
            return this.seniorNumBuilder_ == null ? Collections.unmodifiableList(this.seniorNum_) : this.seniorNumBuilder_.getMessageList();
         }

         public int getSeniorNumCount() {
            return this.seniorNumBuilder_ == null ? this.seniorNum_.size() : this.seniorNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorNum(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataII)this.seniorNum_.get(index) : (CommonMsg.MapDataII)this.seniorNumBuilder_.getMessage(index);
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorNum_);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorNum() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.seniorNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorNum(int index) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.remove(index);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
            return this.seniorNumBuilder_ != null ? this.seniorNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorNum_);
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorNumBuilderList() {
            return this.getSeniorNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorNumFieldBuilder() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNumBuilder_ = new RepeatedFieldBuilderV3(this.seniorNum_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.seniorNum_ = null;
            }

            return this.seniorNumBuilder_;
         }

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 16;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -17;
            this.isHaveFancy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 32;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -33;
            this.targetId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 64;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_OpenReward_21919 extends GeneratedMessageV3 implements C2S_OpenReward_21919OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_21919 DEFAULT_INSTANCE = new C2S_OpenReward_21919();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_21919> PARSER = new AbstractParser<C2S_OpenReward_21919>() {
         public C2S_OpenReward_21919 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_21919(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_21919(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_21919() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_21919();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_21919(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_21919.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_21919)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_21919 other = (C2S_OpenReward_21919)obj;
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

      public static C2S_OpenReward_21919 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21919 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21919 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21919 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21919 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_21919 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_21919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_21919 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21919 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_21919 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21919 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_21919 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_21919 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_21919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_21919 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_21919 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_21919> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_21919> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_21919 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_21919OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_21919.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_OpenReward_21919.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_OpenReward_21919_descriptor;
         }

         public C2S_OpenReward_21919 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_OpenReward_21919.getDefaultInstance();
         }

         public C2S_OpenReward_21919 build() {
            C2S_OpenReward_21919 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_21919 buildPartial() {
            C2S_OpenReward_21919 result = new C2S_OpenReward_21919(this);
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
            if (other instanceof C2S_OpenReward_21919) {
               return this.mergeFrom((C2S_OpenReward_21919)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_21919 other) {
            if (other == ActivityGuoQingMsg.C2S_OpenReward_21919.getDefaultInstance()) {
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
            C2S_OpenReward_21919 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_21919)ActivityGuoQingMsg.C2S_OpenReward_21919.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_21919)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_21920 extends GeneratedMessageV3 implements S2C_OpenReward_21920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_21920 DEFAULT_INSTANCE = new S2C_OpenReward_21920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_21920> PARSER = new AbstractParser<S2C_OpenReward_21920>() {
         public S2C_OpenReward_21920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_21920(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_21920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_21920() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_21920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_21920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_21920.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_21920)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_21920 other = (S2C_OpenReward_21920)obj;
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

      public static S2C_OpenReward_21920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_21920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_21920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_21920 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_21920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_21920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_21920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_21920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_21920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_21920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_21920> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_21920> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_21920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_21920OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_21920.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_OpenReward_21920.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_OpenReward_21920_descriptor;
         }

         public S2C_OpenReward_21920 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_OpenReward_21920.getDefaultInstance();
         }

         public S2C_OpenReward_21920 build() {
            S2C_OpenReward_21920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_21920 buildPartial() {
            S2C_OpenReward_21920 result = new S2C_OpenReward_21920(this);
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
            if (other instanceof S2C_OpenReward_21920) {
               return this.mergeFrom((S2C_OpenReward_21920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_21920 other) {
            if (other == ActivityGuoQingMsg.S2C_OpenReward_21920.getDefaultInstance()) {
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
            S2C_OpenReward_21920 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_21920)ActivityGuoQingMsg.S2C_OpenReward_21920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_21920)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_21921 extends GeneratedMessageV3 implements C2S_DrawRecord_21921OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_21921 DEFAULT_INSTANCE = new C2S_DrawRecord_21921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_21921> PARSER = new AbstractParser<C2S_DrawRecord_21921>() {
         public C2S_DrawRecord_21921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_21921(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_21921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_21921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_21921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_21921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_21921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_21921)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_21921 other = (C2S_DrawRecord_21921)obj;
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

      public static C2S_DrawRecord_21921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_21921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_21921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_21921 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_21921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_21921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_21921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_21921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_21921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_21921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_21921> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_21921> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_21921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_21921OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_21921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_DrawRecord_21921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_DrawRecord_21921_descriptor;
         }

         public C2S_DrawRecord_21921 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_DrawRecord_21921.getDefaultInstance();
         }

         public C2S_DrawRecord_21921 build() {
            C2S_DrawRecord_21921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_21921 buildPartial() {
            C2S_DrawRecord_21921 result = new C2S_DrawRecord_21921(this);
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
            if (other instanceof C2S_DrawRecord_21921) {
               return this.mergeFrom((C2S_DrawRecord_21921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_21921 other) {
            if (other == ActivityGuoQingMsg.C2S_DrawRecord_21921.getDefaultInstance()) {
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
            C2S_DrawRecord_21921 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_21921)ActivityGuoQingMsg.C2S_DrawRecord_21921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_21921)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_21922 extends GeneratedMessageV3 implements S2C_DrawRecord_21922OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_21922 DEFAULT_INSTANCE = new S2C_DrawRecord_21922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_21922> PARSER = new AbstractParser<S2C_DrawRecord_21922>() {
         public S2C_DrawRecord_21922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_21922(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_21922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_21922() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_21922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_21922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(ActivityGuoQingMsg.MyDrawRecord.PARSER, extensionRegistry));
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_21922.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_21922)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_21922 other = (S2C_DrawRecord_21922)obj;
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

      public static S2C_DrawRecord_21922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_21922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_21922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_21922 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_21922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_21922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_21922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_21922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_21922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_21922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_21922> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_21922> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_21922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_21922OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_21922.class, Builder.class);
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
            if (ActivityGuoQingMsg.S2C_DrawRecord_21922.alwaysUseFieldBuilders) {
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_DrawRecord_21922_descriptor;
         }

         public S2C_DrawRecord_21922 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_DrawRecord_21922.getDefaultInstance();
         }

         public S2C_DrawRecord_21922 build() {
            S2C_DrawRecord_21922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_21922 buildPartial() {
            S2C_DrawRecord_21922 result = new S2C_DrawRecord_21922(this);
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
            if (other instanceof S2C_DrawRecord_21922) {
               return this.mergeFrom((S2C_DrawRecord_21922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_21922 other) {
            if (other == ActivityGuoQingMsg.S2C_DrawRecord_21922.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = ActivityGuoQingMsg.S2C_DrawRecord_21922.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_21922 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_21922)ActivityGuoQingMsg.S2C_DrawRecord_21922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_21922)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(ActivityGuoQingMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, ActivityGuoQingMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_21923 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_21923OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_21923 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_21923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_21923> PARSER = new AbstractParser<C2S_ServerDrawRecord_21923>() {
         public C2S_ServerDrawRecord_21923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_21923(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_21923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_21923() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_21923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_21923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_21923.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_21923)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_21923 other = (C2S_ServerDrawRecord_21923)obj;
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

      public static C2S_ServerDrawRecord_21923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_21923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_21923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_21923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_21923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_21923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_21923> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_21923> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_21923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_21923OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_21923.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_ServerDrawRecord_21923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_ServerDrawRecord_21923_descriptor;
         }

         public C2S_ServerDrawRecord_21923 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_ServerDrawRecord_21923.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_21923 build() {
            C2S_ServerDrawRecord_21923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_21923 buildPartial() {
            C2S_ServerDrawRecord_21923 result = new C2S_ServerDrawRecord_21923(this);
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
            if (other instanceof C2S_ServerDrawRecord_21923) {
               return this.mergeFrom((C2S_ServerDrawRecord_21923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_21923 other) {
            if (other == ActivityGuoQingMsg.C2S_ServerDrawRecord_21923.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_21923 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_21923)ActivityGuoQingMsg.C2S_ServerDrawRecord_21923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_21923)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_21924 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_21924OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_21924 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_21924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_21924> PARSER = new AbstractParser<S2C_ServerDrawRecord_21924>() {
         public S2C_ServerDrawRecord_21924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_21924(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_21924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_21924() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_21924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_21924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(ActivityGuoQingMsg.ServerDrawRecord.PARSER, extensionRegistry));
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_21924.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_21924)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_21924 other = (S2C_ServerDrawRecord_21924)obj;
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

      public static S2C_ServerDrawRecord_21924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_21924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_21924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_21924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_21924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_21924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_21924> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_21924> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_21924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_21924OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_21924.class, Builder.class);
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
            if (ActivityGuoQingMsg.S2C_ServerDrawRecord_21924.alwaysUseFieldBuilders) {
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_ServerDrawRecord_21924_descriptor;
         }

         public S2C_ServerDrawRecord_21924 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_ServerDrawRecord_21924.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_21924 build() {
            S2C_ServerDrawRecord_21924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_21924 buildPartial() {
            S2C_ServerDrawRecord_21924 result = new S2C_ServerDrawRecord_21924(this);
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
            if (other instanceof S2C_ServerDrawRecord_21924) {
               return this.mergeFrom((S2C_ServerDrawRecord_21924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_21924 other) {
            if (other == ActivityGuoQingMsg.S2C_ServerDrawRecord_21924.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = ActivityGuoQingMsg.S2C_ServerDrawRecord_21924.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_21924 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_21924)ActivityGuoQingMsg.S2C_ServerDrawRecord_21924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_21924)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(ActivityGuoQingMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, ActivityGuoQingMsg.ServerDrawRecord.getDefaultInstance());
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (ActivityGuoQingMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return ActivityGuoQingMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == ActivityGuoQingMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = ActivityGuoQingMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)ActivityGuoQingMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActivityGuoQingMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (ActivityGuoQingMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return ActivityGuoQingMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == ActivityGuoQingMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)ActivityGuoQingMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActivityGuoQingMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class GameBuilding extends GeneratedMessageV3 implements GameBuildingOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDID_FIELD_NUMBER = 1;
      private int buildId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      public static final int REWARDLV_FIELD_NUMBER = 3;
      private Internal.IntList rewardLv_;
      private byte memoizedIsInitialized;
      private static final GameBuilding DEFAULT_INSTANCE = new GameBuilding();
      /** @deprecated */
      @Deprecated
      public static final Parser<GameBuilding> PARSER = new AbstractParser<GameBuilding>() {
         public GameBuilding parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GameBuilding(input, extensionRegistry);
         }
      };

      private GameBuilding(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GameBuilding() {
         this.memoizedIsInitialized = -1;
         this.rewardLv_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GameBuilding();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GameBuilding(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buildId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.lv_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardLv_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardLv_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardLv_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardLv_.addInt(input.readInt32());
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
                  this.rewardLv_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
      }

      public boolean hasBuildId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuildId() {
         return this.buildId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public List<Integer> getRewardLvList() {
         return this.rewardLv_;
      }

      public int getRewardLvCount() {
         return this.rewardLv_.size();
      }

      public int getRewardLv(int index) {
         return this.rewardLv_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuildId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buildId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.lv_);
         }

         for(int i = 0; i < this.rewardLv_.size(); ++i) {
            output.writeInt32(3, this.rewardLv_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.buildId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardLv_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardLv_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardLvList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GameBuilding)) {
            return super.equals(obj);
         } else {
            GameBuilding other = (GameBuilding)obj;
            if (this.hasBuildId() != other.hasBuildId()) {
               return false;
            } else if (this.hasBuildId() && this.getBuildId() != other.getBuildId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (!this.getRewardLvList().equals(other.getRewardLvList())) {
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
            if (this.hasBuildId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuildId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            if (this.getRewardLvCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardLvList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GameBuilding parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data);
      }

      public static GameBuilding parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameBuilding parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data);
      }

      public static GameBuilding parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameBuilding parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data);
      }

      public static GameBuilding parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameBuilding)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameBuilding parseFrom(InputStream input) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GameBuilding parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GameBuilding parseDelimitedFrom(InputStream input) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GameBuilding parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GameBuilding parseFrom(CodedInputStream input) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GameBuilding parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameBuilding)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GameBuilding prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GameBuilding getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GameBuilding> parser() {
         return PARSER;
      }

      public Parser<GameBuilding> getParserForType() {
         return PARSER;
      }

      public GameBuilding getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GameBuildingOrBuilder {
         private int bitField0_;
         private int buildId_;
         private int lv_;
         private Internal.IntList rewardLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
         }

         private Builder() {
            this.rewardLv_ = ActivityGuoQingMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardLv_ = ActivityGuoQingMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.GameBuilding.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buildId_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            this.rewardLv_ = ActivityGuoQingMsg.GameBuilding.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         public GameBuilding getDefaultInstanceForType() {
            return ActivityGuoQingMsg.GameBuilding.getDefaultInstance();
         }

         public GameBuilding build() {
            GameBuilding result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GameBuilding buildPartial() {
            GameBuilding result = new GameBuilding(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buildId_ = this.buildId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.rewardLv_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardLv_ = this.rewardLv_;
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
            if (other instanceof GameBuilding) {
               return this.mergeFrom((GameBuilding)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GameBuilding other) {
            if (other == ActivityGuoQingMsg.GameBuilding.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuildId()) {
                  this.setBuildId(other.getBuildId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (!other.rewardLv_.isEmpty()) {
                  if (this.rewardLv_.isEmpty()) {
                     this.rewardLv_ = other.rewardLv_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardLvIsMutable();
                     this.rewardLv_.addAll(other.rewardLv_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuildId()) {
               return false;
            } else {
               return this.hasLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GameBuilding parsedMessage = null;

            try {
               parsedMessage = (GameBuilding)ActivityGuoQingMsg.GameBuilding.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GameBuilding)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuildId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuildId() {
            return this.buildId_;
         }

         public Builder setBuildId(int value) {
            this.bitField0_ |= 1;
            this.buildId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuildId() {
            this.bitField0_ &= -2;
            this.buildId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 2;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardLvIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardLv_ = ActivityGuoQingMsg.GameBuilding.mutableCopy(this.rewardLv_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardLvList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardLv_) : this.rewardLv_);
         }

         public int getRewardLvCount() {
            return this.rewardLv_.size();
         }

         public int getRewardLv(int index) {
            return this.rewardLv_.getInt(index);
         }

         public Builder setRewardLv(int index, int value) {
            this.ensureRewardLvIsMutable();
            this.rewardLv_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardLv(int value) {
            this.ensureRewardLvIsMutable();
            this.rewardLv_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardLv(Iterable<? extends Integer> values) {
            this.ensureRewardLvIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardLv_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardLv() {
            this.rewardLv_ = ActivityGuoQingMsg.GameBuilding.emptyIntList();
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

   public static final class GameEvent extends GeneratedMessageV3 implements GameEventOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTID_FIELD_NUMBER = 1;
      private int eventId_;
      public static final int EVENTPARAM_FIELD_NUMBER = 2;
      private Internal.IntList eventParam_;
      private byte memoizedIsInitialized;
      private static final GameEvent DEFAULT_INSTANCE = new GameEvent();
      /** @deprecated */
      @Deprecated
      public static final Parser<GameEvent> PARSER = new AbstractParser<GameEvent>() {
         public GameEvent parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GameEvent(input, extensionRegistry);
         }
      };

      private GameEvent(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GameEvent() {
         this.memoizedIsInitialized = -1;
         this.eventParam_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GameEvent();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GameEvent(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.eventParam_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.eventParam_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.eventParam_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.eventParam_.addInt(input.readInt32());
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
                  this.eventParam_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public List<Integer> getEventParamList() {
         return this.eventParam_;
      }

      public int getEventParamCount() {
         return this.eventParam_.size();
      }

      public int getEventParam(int index) {
         return this.eventParam_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventId_);
         }

         for(int i = 0; i < this.eventParam_.size(); ++i) {
            output.writeInt32(2, this.eventParam_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.eventId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.eventParam_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.eventParam_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getEventParamList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GameEvent)) {
            return super.equals(obj);
         } else {
            GameEvent other = (GameEvent)obj;
            if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
               return false;
            } else if (!this.getEventParamList().equals(other.getEventParamList())) {
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
            if (this.hasEventId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventId();
            }

            if (this.getEventParamCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventParamList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GameEvent parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data);
      }

      public static GameEvent parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameEvent parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data);
      }

      public static GameEvent parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameEvent parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data);
      }

      public static GameEvent parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GameEvent)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GameEvent parseFrom(InputStream input) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GameEvent parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GameEvent parseDelimitedFrom(InputStream input) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GameEvent parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GameEvent parseFrom(CodedInputStream input) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GameEvent parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GameEvent)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GameEvent prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GameEvent getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GameEvent> parser() {
         return PARSER;
      }

      public Parser<GameEvent> getParserForType() {
         return PARSER;
      }

      public GameEvent getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GameEventOrBuilder {
         private int bitField0_;
         private int eventId_;
         private Internal.IntList eventParam_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
         }

         private Builder() {
            this.eventParam_ = ActivityGuoQingMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.eventParam_ = ActivityGuoQingMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.GameEvent.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventId_ = 0;
            this.bitField0_ &= -2;
            this.eventParam_ = ActivityGuoQingMsg.GameEvent.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_GameEvent_descriptor;
         }

         public GameEvent getDefaultInstanceForType() {
            return ActivityGuoQingMsg.GameEvent.getDefaultInstance();
         }

         public GameEvent build() {
            GameEvent result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GameEvent buildPartial() {
            GameEvent result = new GameEvent(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventId_ = this.eventId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.eventParam_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.eventParam_ = this.eventParam_;
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
            if (other instanceof GameEvent) {
               return this.mergeFrom((GameEvent)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GameEvent other) {
            if (other == ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               if (!other.eventParam_.isEmpty()) {
                  if (this.eventParam_.isEmpty()) {
                     this.eventParam_ = other.eventParam_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureEventParamIsMutable();
                     this.eventParam_.addAll(other.eventParam_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEventId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GameEvent parsedMessage = null;

            try {
               parsedMessage = (GameEvent)ActivityGuoQingMsg.GameEvent.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GameEvent)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 1;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEventParamIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.eventParam_ = ActivityGuoQingMsg.GameEvent.mutableCopy(this.eventParam_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getEventParamList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.eventParam_) : this.eventParam_);
         }

         public int getEventParamCount() {
            return this.eventParam_.size();
         }

         public int getEventParam(int index) {
            return this.eventParam_.getInt(index);
         }

         public Builder setEventParam(int index, int value) {
            this.ensureEventParamIsMutable();
            this.eventParam_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addEventParam(int value) {
            this.ensureEventParamIsMutable();
            this.eventParam_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllEventParam(Iterable<? extends Integer> values) {
            this.ensureEventParamIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.eventParam_);
            this.onChanged();
            return this;
         }

         public Builder clearEventParam() {
            this.eventParam_ = ActivityGuoQingMsg.GameEvent.emptyIntList();
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

   public static final class C2S_GameMain_21931 extends GeneratedMessageV3 implements C2S_GameMain_21931OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameMain_21931 DEFAULT_INSTANCE = new C2S_GameMain_21931();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameMain_21931> PARSER = new AbstractParser<C2S_GameMain_21931>() {
         public C2S_GameMain_21931 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameMain_21931(input, extensionRegistry);
         }
      };

      private C2S_GameMain_21931(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameMain_21931() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameMain_21931();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameMain_21931(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_21931.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameMain_21931)) {
            return super.equals(obj);
         } else {
            C2S_GameMain_21931 other = (C2S_GameMain_21931)obj;
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

      public static C2S_GameMain_21931 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_21931 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_21931 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_21931 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_21931 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_21931 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_21931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_21931 parseFrom(InputStream input) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_21931 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_21931 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameMain_21931 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_21931 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_21931 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_21931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameMain_21931 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameMain_21931 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameMain_21931> parser() {
         return PARSER;
      }

      public Parser<C2S_GameMain_21931> getParserForType() {
         return PARSER;
      }

      public C2S_GameMain_21931 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameMain_21931OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_21931.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameMain_21931.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameMain_21931_descriptor;
         }

         public C2S_GameMain_21931 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameMain_21931.getDefaultInstance();
         }

         public C2S_GameMain_21931 build() {
            C2S_GameMain_21931 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameMain_21931 buildPartial() {
            C2S_GameMain_21931 result = new C2S_GameMain_21931(this);
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
            if (other instanceof C2S_GameMain_21931) {
               return this.mergeFrom((C2S_GameMain_21931)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameMain_21931 other) {
            if (other == ActivityGuoQingMsg.C2S_GameMain_21931.getDefaultInstance()) {
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
            C2S_GameMain_21931 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameMain_21931)ActivityGuoQingMsg.C2S_GameMain_21931.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameMain_21931)e.getUnfinishedMessage();
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

   public static final class S2C_GameMain_21932 extends GeneratedMessageV3 implements S2C_GameMain_21932OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int DICERECOVER_FIELD_NUMBER = 2;
      private int diceRecover_;
      public static final int BUYGOLDDICENUM_FIELD_NUMBER = 3;
      private int buyGoldDiceNum_;
      public static final int BUILDING_FIELD_NUMBER = 4;
      private List<GameBuilding> building_;
      public static final int EVENT_FIELD_NUMBER = 5;
      private GameEvent event_;
      private byte memoizedIsInitialized;
      private static final S2C_GameMain_21932 DEFAULT_INSTANCE = new S2C_GameMain_21932();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameMain_21932> PARSER = new AbstractParser<S2C_GameMain_21932>() {
         public S2C_GameMain_21932 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameMain_21932(input, extensionRegistry);
         }
      };

      private S2C_GameMain_21932(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameMain_21932() {
         this.memoizedIsInitialized = -1;
         this.building_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameMain_21932();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameMain_21932(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.diceRecover_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buyGoldDiceNum_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.building_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.building_.add(input.readMessage(ActivityGuoQingMsg.GameBuilding.PARSER, extensionRegistry));
                        break;
                     case 42:
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(ActivityGuoQingMsg.GameEvent.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.building_ = Collections.unmodifiableList(this.building_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_21932.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasDiceRecover() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDiceRecover() {
         return this.diceRecover_;
      }

      public boolean hasBuyGoldDiceNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuyGoldDiceNum() {
         return this.buyGoldDiceNum_;
      }

      public List<GameBuilding> getBuildingList() {
         return this.building_;
      }

      public List<? extends GameBuildingOrBuilder> getBuildingOrBuilderList() {
         return this.building_;
      }

      public int getBuildingCount() {
         return this.building_.size();
      }

      public GameBuilding getBuilding(int index) {
         return (GameBuilding)this.building_.get(index);
      }

      public GameBuildingOrBuilder getBuildingOrBuilder(int index) {
         return (GameBuildingOrBuilder)this.building_.get(index);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 8) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDiceRecover()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyGoldDiceNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBuildingCount(); ++i) {
               if (!this.getBuilding(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasEvent() && !this.getEvent().isInitialized()) {
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
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.diceRecover_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buyGoldDiceNum_);
         }

         for(int i = 0; i < this.building_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.building_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(5, this.getEvent());
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.diceRecover_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyGoldDiceNum_);
            }

            for(int i = 0; i < this.building_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.building_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameMain_21932)) {
            return super.equals(obj);
         } else {
            S2C_GameMain_21932 other = (S2C_GameMain_21932)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasDiceRecover() != other.hasDiceRecover()) {
               return false;
            } else if (this.hasDiceRecover() && this.getDiceRecover() != other.getDiceRecover()) {
               return false;
            } else if (this.hasBuyGoldDiceNum() != other.hasBuyGoldDiceNum()) {
               return false;
            } else if (this.hasBuyGoldDiceNum() && this.getBuyGoldDiceNum() != other.getBuyGoldDiceNum()) {
               return false;
            } else if (!this.getBuildingList().equals(other.getBuildingList())) {
               return false;
            } else if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasDiceRecover()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDiceRecover();
            }

            if (this.hasBuyGoldDiceNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyGoldDiceNum();
            }

            if (this.getBuildingCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuildingList().hashCode();
            }

            if (this.hasEvent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameMain_21932 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_21932 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_21932 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_21932 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_21932 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_21932 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_21932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_21932 parseFrom(InputStream input) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_21932 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_21932 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameMain_21932 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_21932 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_21932 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_21932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameMain_21932 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameMain_21932 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameMain_21932> parser() {
         return PARSER;
      }

      public Parser<S2C_GameMain_21932> getParserForType() {
         return PARSER;
      }

      public S2C_GameMain_21932 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameMain_21932OrBuilder {
         private int bitField0_;
         private int grid_;
         private int diceRecover_;
         private int buyGoldDiceNum_;
         private List<GameBuilding> building_;
         private RepeatedFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_21932.class, Builder.class);
         }

         private Builder() {
            this.building_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.building_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameMain_21932.alwaysUseFieldBuilders) {
               this.getBuildingFieldBuilder();
               this.getEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.diceRecover_ = 0;
            this.bitField0_ &= -3;
            this.buyGoldDiceNum_ = 0;
            this.bitField0_ &= -5;
            if (this.buildingBuilder_ == null) {
               this.building_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.buildingBuilder_.clear();
            }

            if (this.eventBuilder_ == null) {
               this.event_ = null;
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameMain_21932_descriptor;
         }

         public S2C_GameMain_21932 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameMain_21932.getDefaultInstance();
         }

         public S2C_GameMain_21932 build() {
            S2C_GameMain_21932 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameMain_21932 buildPartial() {
            S2C_GameMain_21932 result = new S2C_GameMain_21932(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.diceRecover_ = this.diceRecover_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyGoldDiceNum_ = this.buyGoldDiceNum_;
               to_bitField0_ |= 4;
            }

            if (this.buildingBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.building_ = Collections.unmodifiableList(this.building_);
                  this.bitField0_ &= -9;
               }

               result.building_ = this.building_;
            } else {
               result.building_ = this.buildingBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (GameEvent)this.eventBuilder_.build();
               }

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
            if (other instanceof S2C_GameMain_21932) {
               return this.mergeFrom((S2C_GameMain_21932)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameMain_21932 other) {
            if (other == ActivityGuoQingMsg.S2C_GameMain_21932.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasDiceRecover()) {
                  this.setDiceRecover(other.getDiceRecover());
               }

               if (other.hasBuyGoldDiceNum()) {
                  this.setBuyGoldDiceNum(other.getBuyGoldDiceNum());
               }

               if (this.buildingBuilder_ == null) {
                  if (!other.building_.isEmpty()) {
                     if (this.building_.isEmpty()) {
                        this.building_ = other.building_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureBuildingIsMutable();
                        this.building_.addAll(other.building_);
                     }

                     this.onChanged();
                  }
               } else if (!other.building_.isEmpty()) {
                  if (this.buildingBuilder_.isEmpty()) {
                     this.buildingBuilder_.dispose();
                     this.buildingBuilder_ = null;
                     this.building_ = other.building_;
                     this.bitField0_ &= -9;
                     this.buildingBuilder_ = ActivityGuoQingMsg.S2C_GameMain_21932.alwaysUseFieldBuilders ? this.getBuildingFieldBuilder() : null;
                  } else {
                     this.buildingBuilder_.addAllMessages(other.building_);
                  }
               }

               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasDiceRecover()) {
               return false;
            } else if (!this.hasBuyGoldDiceNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getBuildingCount(); ++i) {
                  if (!this.getBuilding(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasEvent() && !this.getEvent().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameMain_21932 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameMain_21932)ActivityGuoQingMsg.S2C_GameMain_21932.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameMain_21932)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDiceRecover() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDiceRecover() {
            return this.diceRecover_;
         }

         public Builder setDiceRecover(int value) {
            this.bitField0_ |= 2;
            this.diceRecover_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiceRecover() {
            this.bitField0_ &= -3;
            this.diceRecover_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyGoldDiceNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyGoldDiceNum() {
            return this.buyGoldDiceNum_;
         }

         public Builder setBuyGoldDiceNum(int value) {
            this.bitField0_ |= 4;
            this.buyGoldDiceNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyGoldDiceNum() {
            this.bitField0_ &= -5;
            this.buyGoldDiceNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuildingIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.building_ = new ArrayList(this.building_);
               this.bitField0_ |= 8;
            }

         }

         public List<GameBuilding> getBuildingList() {
            return this.buildingBuilder_ == null ? Collections.unmodifiableList(this.building_) : this.buildingBuilder_.getMessageList();
         }

         public int getBuildingCount() {
            return this.buildingBuilder_ == null ? this.building_.size() : this.buildingBuilder_.getCount();
         }

         public GameBuilding getBuilding(int index) {
            return this.buildingBuilder_ == null ? (GameBuilding)this.building_.get(index) : (GameBuilding)this.buildingBuilder_.getMessage(index);
         }

         public Builder setBuilding(int index, GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingIsMutable();
               this.building_.set(index, value);
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuilding(int index, GameBuilding.Builder builderForValue) {
            if (this.buildingBuilder_ == null) {
               this.ensureBuildingIsMutable();
               this.building_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuilding(GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingIsMutable();
               this.building_.add(value);
               this.onChanged();
            } else {
               this.buildingBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuilding(int index, GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingIsMutable();
               this.building_.add(index, value);
               this.onChanged();
            } else {
               this.buildingBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuilding(GameBuilding.Builder builderForValue) {
            if (this.buildingBuilder_ == null) {
               this.ensureBuildingIsMutable();
               this.building_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buildingBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuilding(int index, GameBuilding.Builder builderForValue) {
            if (this.buildingBuilder_ == null) {
               this.ensureBuildingIsMutable();
               this.building_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buildingBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuilding(Iterable<? extends GameBuilding> values) {
            if (this.buildingBuilder_ == null) {
               this.ensureBuildingIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.building_);
               this.onChanged();
            } else {
               this.buildingBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuilding() {
            if (this.buildingBuilder_ == null) {
               this.building_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.buildingBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuilding(int index) {
            if (this.buildingBuilder_ == null) {
               this.ensureBuildingIsMutable();
               this.building_.remove(index);
               this.onChanged();
            } else {
               this.buildingBuilder_.remove(index);
            }

            return this;
         }

         public GameBuilding.Builder getBuildingBuilder(int index) {
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().getBuilder(index);
         }

         public GameBuildingOrBuilder getBuildingOrBuilder(int index) {
            return this.buildingBuilder_ == null ? (GameBuildingOrBuilder)this.building_.get(index) : (GameBuildingOrBuilder)this.buildingBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GameBuildingOrBuilder> getBuildingOrBuilderList() {
            return this.buildingBuilder_ != null ? this.buildingBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.building_);
         }

         public GameBuilding.Builder addBuildingBuilder() {
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(ActivityGuoQingMsg.GameBuilding.getDefaultInstance());
         }

         public GameBuilding.Builder addBuildingBuilder(int index) {
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(index, ActivityGuoQingMsg.GameBuilding.getDefaultInstance());
         }

         public List<GameBuilding.Builder> getBuildingBuilderList() {
            return this.getBuildingFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> getBuildingFieldBuilder() {
            if (this.buildingBuilder_ == null) {
               this.buildingBuilder_ = new RepeatedFieldBuilderV3(this.building_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.building_ = null;
            }

            return this.buildingBuilder_;
         }

         public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
         }

         public GameEvent getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            } else {
               return (GameEvent)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.event_ = value;
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setEvent(GameEvent.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActivityGuoQingMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
               } else {
                  this.event_ = value;
               }

               this.onChanged();
            } else {
               this.eventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearEvent() {
            if (this.eventBuilder_ == null) {
               this.event_ = null;
               this.onChanged();
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public GameEvent.Builder getEventBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (GameEvent.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public GameEventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (GameEventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GameRollDice_21933 extends GeneratedMessageV3 implements C2S_GameRollDice_21933OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_GameRollDice_21933 DEFAULT_INSTANCE = new C2S_GameRollDice_21933();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameRollDice_21933> PARSER = new AbstractParser<C2S_GameRollDice_21933>() {
         public C2S_GameRollDice_21933 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameRollDice_21933(input, extensionRegistry);
         }
      };

      private C2S_GameRollDice_21933(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameRollDice_21933() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameRollDice_21933();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameRollDice_21933(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_21933.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
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
         } else if (!(obj instanceof C2S_GameRollDice_21933)) {
            return super.equals(obj);
         } else {
            C2S_GameRollDice_21933 other = (C2S_GameRollDice_21933)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
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

      public static C2S_GameRollDice_21933 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_21933 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_21933 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_21933 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_21933 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_21933 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_21933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_21933 parseFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_21933 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_21933 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_21933 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_21933 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_21933 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_21933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameRollDice_21933 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameRollDice_21933 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameRollDice_21933> parser() {
         return PARSER;
      }

      public Parser<C2S_GameRollDice_21933> getParserForType() {
         return PARSER;
      }

      public C2S_GameRollDice_21933 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameRollDice_21933OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_21933.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameRollDice_21933.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameRollDice_21933_descriptor;
         }

         public C2S_GameRollDice_21933 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameRollDice_21933.getDefaultInstance();
         }

         public C2S_GameRollDice_21933 build() {
            C2S_GameRollDice_21933 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameRollDice_21933 buildPartial() {
            C2S_GameRollDice_21933 result = new C2S_GameRollDice_21933(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_GameRollDice_21933) {
               return this.mergeFrom((C2S_GameRollDice_21933)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameRollDice_21933 other) {
            if (other == ActivityGuoQingMsg.C2S_GameRollDice_21933.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GameRollDice_21933 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameRollDice_21933)ActivityGuoQingMsg.C2S_GameRollDice_21933.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameRollDice_21933)e.getUnfinishedMessage();
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

   public static final class S2C_GameRollDice_21934 extends GeneratedMessageV3 implements S2C_GameRollDice_21934OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int GRID_FIELD_NUMBER = 3;
      private int grid_;
      public static final int DICERECOVER_FIELD_NUMBER = 4;
      private int diceRecover_;
      public static final int EVENT_FIELD_NUMBER = 5;
      private GameEvent event_;
      public static final int BUILDING_FIELD_NUMBER = 6;
      private GameBuilding building_;
      private byte memoizedIsInitialized;
      private static final S2C_GameRollDice_21934 DEFAULT_INSTANCE = new S2C_GameRollDice_21934();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameRollDice_21934> PARSER = new AbstractParser<S2C_GameRollDice_21934>() {
         public S2C_GameRollDice_21934 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameRollDice_21934(input, extensionRegistry);
         }
      };

      private S2C_GameRollDice_21934(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameRollDice_21934() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameRollDice_21934();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameRollDice_21934(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.grid_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.diceRecover_ = input.readInt32();
                        break;
                     case 42:
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(ActivityGuoQingMsg.GameEvent.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 50:
                        GameBuilding.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.building_.toBuilder();
                        }

                        this.building_ = (GameBuilding)input.readMessage(ActivityGuoQingMsg.GameBuilding.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.building_);
                           this.building_ = subBuilder.buildPartial();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_21934.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasDiceRecover() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDiceRecover() {
         return this.diceRecover_;
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 16) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public boolean hasBuilding() {
         return (this.bitField0_ & 32) != 0;
      }

      public GameBuilding getBuilding() {
         return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
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
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDiceRecover()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasEvent() && !this.getEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasBuilding() && !this.getBuilding().isInitialized()) {
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
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.grid_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.diceRecover_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getEvent());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getBuilding());
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.grid_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.diceRecover_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getEvent());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getBuilding());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameRollDice_21934)) {
            return super.equals(obj);
         } else {
            S2C_GameRollDice_21934 other = (S2C_GameRollDice_21934)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasDiceRecover() != other.hasDiceRecover()) {
               return false;
            } else if (this.hasDiceRecover() && this.getDiceRecover() != other.getDiceRecover()) {
               return false;
            } else if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
               return false;
            } else if (this.hasBuilding() != other.hasBuilding()) {
               return false;
            } else if (this.hasBuilding() && !this.getBuilding().equals(other.getBuilding())) {
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

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasGrid()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasDiceRecover()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDiceRecover();
            }

            if (this.hasEvent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEvent().hashCode();
            }

            if (this.hasBuilding()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBuilding().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameRollDice_21934 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_21934 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_21934 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_21934 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_21934 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_21934 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_21934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_21934 parseFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_21934 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_21934 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_21934 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_21934 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_21934 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_21934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameRollDice_21934 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameRollDice_21934 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameRollDice_21934> parser() {
         return PARSER;
      }

      public Parser<S2C_GameRollDice_21934> getParserForType() {
         return PARSER;
      }

      public S2C_GameRollDice_21934 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameRollDice_21934OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;
         private int grid_;
         private int diceRecover_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;
         private GameBuilding building_;
         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_21934.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameRollDice_21934.alwaysUseFieldBuilders) {
               this.getEventFieldBuilder();
               this.getBuildingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.grid_ = 0;
            this.bitField0_ &= -5;
            this.diceRecover_ = 0;
            this.bitField0_ &= -9;
            if (this.eventBuilder_ == null) {
               this.event_ = null;
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -17;
            if (this.buildingBuilder_ == null) {
               this.building_ = null;
            } else {
               this.buildingBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameRollDice_21934_descriptor;
         }

         public S2C_GameRollDice_21934 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameRollDice_21934.getDefaultInstance();
         }

         public S2C_GameRollDice_21934 build() {
            S2C_GameRollDice_21934 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameRollDice_21934 buildPartial() {
            S2C_GameRollDice_21934 result = new S2C_GameRollDice_21934(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.diceRecover_ = this.diceRecover_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (GameEvent)this.eventBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.buildingBuilder_ == null) {
                  result.building_ = this.building_;
               } else {
                  result.building_ = (GameBuilding)this.buildingBuilder_.build();
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
            if (other instanceof S2C_GameRollDice_21934) {
               return this.mergeFrom((S2C_GameRollDice_21934)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameRollDice_21934 other) {
            if (other == ActivityGuoQingMsg.S2C_GameRollDice_21934.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasDiceRecover()) {
                  this.setDiceRecover(other.getDiceRecover());
               }

               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               if (other.hasBuilding()) {
                  this.mergeBuilding(other.getBuilding());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else if (!this.hasGrid()) {
               return false;
            } else if (!this.hasDiceRecover()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().isInitialized()) {
               return false;
            } else {
               return !this.hasBuilding() || this.getBuilding().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameRollDice_21934 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameRollDice_21934)ActivityGuoQingMsg.S2C_GameRollDice_21934.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameRollDice_21934)e.getUnfinishedMessage();
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

         public boolean hasGrid() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 4;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -5;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDiceRecover() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDiceRecover() {
            return this.diceRecover_;
         }

         public Builder setDiceRecover(int value) {
            this.bitField0_ |= 8;
            this.diceRecover_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiceRecover() {
            this.bitField0_ &= -9;
            this.diceRecover_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
         }

         public GameEvent getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            } else {
               return (GameEvent)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.event_ = value;
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setEvent(GameEvent.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActivityGuoQingMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
               } else {
                  this.event_ = value;
               }

               this.onChanged();
            } else {
               this.eventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearEvent() {
            if (this.eventBuilder_ == null) {
               this.event_ = null;
               this.onChanged();
            } else {
               this.eventBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public GameEvent.Builder getEventBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (GameEvent.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public GameEventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (GameEventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         public boolean hasBuilding() {
            return (this.bitField0_ & 32) != 0;
         }

         public GameBuilding getBuilding() {
            if (this.buildingBuilder_ == null) {
               return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
            } else {
               return (GameBuilding)this.buildingBuilder_.getMessage();
            }
         }

         public Builder setBuilding(GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.building_ = value;
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setBuilding(GameBuilding.Builder builderForValue) {
            if (this.buildingBuilder_ == null) {
               this.building_ = builderForValue.build();
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeBuilding(GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.building_ != null && this.building_ != ActivityGuoQingMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = ActivityGuoQingMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
               } else {
                  this.building_ = value;
               }

               this.onChanged();
            } else {
               this.buildingBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearBuilding() {
            if (this.buildingBuilder_ == null) {
               this.building_ = null;
               this.onChanged();
            } else {
               this.buildingBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public GameBuilding.Builder getBuildingBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().getBuilder();
         }

         public GameBuildingOrBuilder getBuildingOrBuilder() {
            if (this.buildingBuilder_ != null) {
               return (GameBuildingOrBuilder)this.buildingBuilder_.getMessageOrBuilder();
            } else {
               return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
            }
         }

         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> getBuildingFieldBuilder() {
            if (this.buildingBuilder_ == null) {
               this.buildingBuilder_ = new SingleFieldBuilderV3(this.getBuilding(), this.getParentForChildren(), this.isClean());
               this.building_ = null;
            }

            return this.buildingBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GameAddRandomDice_21935 extends GeneratedMessageV3 implements C2S_GameAddRandomDice_21935OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameAddRandomDice_21935 DEFAULT_INSTANCE = new C2S_GameAddRandomDice_21935();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameAddRandomDice_21935> PARSER = new AbstractParser<C2S_GameAddRandomDice_21935>() {
         public C2S_GameAddRandomDice_21935 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameAddRandomDice_21935(input, extensionRegistry);
         }
      };

      private C2S_GameAddRandomDice_21935(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameAddRandomDice_21935() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameAddRandomDice_21935();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameAddRandomDice_21935(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_21935.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameAddRandomDice_21935)) {
            return super.equals(obj);
         } else {
            C2S_GameAddRandomDice_21935 other = (C2S_GameAddRandomDice_21935)obj;
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

      public static C2S_GameAddRandomDice_21935 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_21935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_21935 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_21935 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_21935 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_21935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameAddRandomDice_21935 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameAddRandomDice_21935 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameAddRandomDice_21935> parser() {
         return PARSER;
      }

      public Parser<C2S_GameAddRandomDice_21935> getParserForType() {
         return PARSER;
      }

      public C2S_GameAddRandomDice_21935 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameAddRandomDice_21935OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_21935.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameAddRandomDice_21935.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameAddRandomDice_21935_descriptor;
         }

         public C2S_GameAddRandomDice_21935 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameAddRandomDice_21935.getDefaultInstance();
         }

         public C2S_GameAddRandomDice_21935 build() {
            C2S_GameAddRandomDice_21935 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameAddRandomDice_21935 buildPartial() {
            C2S_GameAddRandomDice_21935 result = new C2S_GameAddRandomDice_21935(this);
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
            if (other instanceof C2S_GameAddRandomDice_21935) {
               return this.mergeFrom((C2S_GameAddRandomDice_21935)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameAddRandomDice_21935 other) {
            if (other == ActivityGuoQingMsg.C2S_GameAddRandomDice_21935.getDefaultInstance()) {
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
            C2S_GameAddRandomDice_21935 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameAddRandomDice_21935)ActivityGuoQingMsg.C2S_GameAddRandomDice_21935.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameAddRandomDice_21935)e.getUnfinishedMessage();
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

   public static final class S2C_GameAddRandomDice_21936 extends GeneratedMessageV3 implements S2C_GameAddRandomDice_21936OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DICERECOVER_FIELD_NUMBER = 1;
      private int diceRecover_;
      private byte memoizedIsInitialized;
      private static final S2C_GameAddRandomDice_21936 DEFAULT_INSTANCE = new S2C_GameAddRandomDice_21936();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameAddRandomDice_21936> PARSER = new AbstractParser<S2C_GameAddRandomDice_21936>() {
         public S2C_GameAddRandomDice_21936 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameAddRandomDice_21936(input, extensionRegistry);
         }
      };

      private S2C_GameAddRandomDice_21936(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameAddRandomDice_21936() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameAddRandomDice_21936();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameAddRandomDice_21936(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.diceRecover_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_21936.class, Builder.class);
      }

      public boolean hasDiceRecover() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDiceRecover() {
         return this.diceRecover_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDiceRecover()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.diceRecover_);
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
               size += CodedOutputStream.computeInt32Size(1, this.diceRecover_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameAddRandomDice_21936)) {
            return super.equals(obj);
         } else {
            S2C_GameAddRandomDice_21936 other = (S2C_GameAddRandomDice_21936)obj;
            if (this.hasDiceRecover() != other.hasDiceRecover()) {
               return false;
            } else if (this.hasDiceRecover() && this.getDiceRecover() != other.getDiceRecover()) {
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
            if (this.hasDiceRecover()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDiceRecover();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_21936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_21936 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_21936 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_21936 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_21936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameAddRandomDice_21936 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameAddRandomDice_21936 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameAddRandomDice_21936> parser() {
         return PARSER;
      }

      public Parser<S2C_GameAddRandomDice_21936> getParserForType() {
         return PARSER;
      }

      public S2C_GameAddRandomDice_21936 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameAddRandomDice_21936OrBuilder {
         private int bitField0_;
         private int diceRecover_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_21936.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.diceRecover_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameAddRandomDice_21936_descriptor;
         }

         public S2C_GameAddRandomDice_21936 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.getDefaultInstance();
         }

         public S2C_GameAddRandomDice_21936 build() {
            S2C_GameAddRandomDice_21936 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameAddRandomDice_21936 buildPartial() {
            S2C_GameAddRandomDice_21936 result = new S2C_GameAddRandomDice_21936(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.diceRecover_ = this.diceRecover_;
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
            if (other instanceof S2C_GameAddRandomDice_21936) {
               return this.mergeFrom((S2C_GameAddRandomDice_21936)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameAddRandomDice_21936 other) {
            if (other == ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDiceRecover()) {
                  this.setDiceRecover(other.getDiceRecover());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDiceRecover();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameAddRandomDice_21936 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameAddRandomDice_21936)ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameAddRandomDice_21936)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDiceRecover() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDiceRecover() {
            return this.diceRecover_;
         }

         public Builder setDiceRecover(int value) {
            this.bitField0_ |= 1;
            this.diceRecover_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiceRecover() {
            this.bitField0_ &= -2;
            this.diceRecover_ = 0;
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

   public static final class C2S_GameGoldDiceBuy_21937 extends GeneratedMessageV3 implements C2S_GameGoldDiceBuy_21937OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameGoldDiceBuy_21937 DEFAULT_INSTANCE = new C2S_GameGoldDiceBuy_21937();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameGoldDiceBuy_21937> PARSER = new AbstractParser<C2S_GameGoldDiceBuy_21937>() {
         public C2S_GameGoldDiceBuy_21937 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameGoldDiceBuy_21937(input, extensionRegistry);
         }
      };

      private C2S_GameGoldDiceBuy_21937(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameGoldDiceBuy_21937() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameGoldDiceBuy_21937();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameGoldDiceBuy_21937(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_21937.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameGoldDiceBuy_21937)) {
            return super.equals(obj);
         } else {
            C2S_GameGoldDiceBuy_21937 other = (C2S_GameGoldDiceBuy_21937)obj;
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

      public static C2S_GameGoldDiceBuy_21937 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_21937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_21937 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_21937 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_21937 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_21937)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameGoldDiceBuy_21937 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameGoldDiceBuy_21937 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameGoldDiceBuy_21937> parser() {
         return PARSER;
      }

      public Parser<C2S_GameGoldDiceBuy_21937> getParserForType() {
         return PARSER;
      }

      public C2S_GameGoldDiceBuy_21937 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameGoldDiceBuy_21937OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_21937.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameGoldDiceBuy_21937.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameGoldDiceBuy_21937_descriptor;
         }

         public C2S_GameGoldDiceBuy_21937 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameGoldDiceBuy_21937.getDefaultInstance();
         }

         public C2S_GameGoldDiceBuy_21937 build() {
            C2S_GameGoldDiceBuy_21937 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameGoldDiceBuy_21937 buildPartial() {
            C2S_GameGoldDiceBuy_21937 result = new C2S_GameGoldDiceBuy_21937(this);
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
            if (other instanceof C2S_GameGoldDiceBuy_21937) {
               return this.mergeFrom((C2S_GameGoldDiceBuy_21937)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameGoldDiceBuy_21937 other) {
            if (other == ActivityGuoQingMsg.C2S_GameGoldDiceBuy_21937.getDefaultInstance()) {
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
            C2S_GameGoldDiceBuy_21937 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameGoldDiceBuy_21937)ActivityGuoQingMsg.C2S_GameGoldDiceBuy_21937.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameGoldDiceBuy_21937)e.getUnfinishedMessage();
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

   public static final class S2C_GameGoldDiceBuy_21938 extends GeneratedMessageV3 implements S2C_GameGoldDiceBuy_21938OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYGOLDDICENUM_FIELD_NUMBER = 1;
      private int buyGoldDiceNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GameGoldDiceBuy_21938 DEFAULT_INSTANCE = new S2C_GameGoldDiceBuy_21938();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameGoldDiceBuy_21938> PARSER = new AbstractParser<S2C_GameGoldDiceBuy_21938>() {
         public S2C_GameGoldDiceBuy_21938 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameGoldDiceBuy_21938(input, extensionRegistry);
         }
      };

      private S2C_GameGoldDiceBuy_21938(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameGoldDiceBuy_21938() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameGoldDiceBuy_21938();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameGoldDiceBuy_21938(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyGoldDiceNum_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_21938.class, Builder.class);
      }

      public boolean hasBuyGoldDiceNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyGoldDiceNum() {
         return this.buyGoldDiceNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyGoldDiceNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyGoldDiceNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyGoldDiceNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameGoldDiceBuy_21938)) {
            return super.equals(obj);
         } else {
            S2C_GameGoldDiceBuy_21938 other = (S2C_GameGoldDiceBuy_21938)obj;
            if (this.hasBuyGoldDiceNum() != other.hasBuyGoldDiceNum()) {
               return false;
            } else if (this.hasBuyGoldDiceNum() && this.getBuyGoldDiceNum() != other.getBuyGoldDiceNum()) {
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
            if (this.hasBuyGoldDiceNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyGoldDiceNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_21938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_21938 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_21938 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_21938 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_21938)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameGoldDiceBuy_21938 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameGoldDiceBuy_21938 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameGoldDiceBuy_21938> parser() {
         return PARSER;
      }

      public Parser<S2C_GameGoldDiceBuy_21938> getParserForType() {
         return PARSER;
      }

      public S2C_GameGoldDiceBuy_21938 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameGoldDiceBuy_21938OrBuilder {
         private int bitField0_;
         private int buyGoldDiceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_21938.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyGoldDiceNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameGoldDiceBuy_21938_descriptor;
         }

         public S2C_GameGoldDiceBuy_21938 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.getDefaultInstance();
         }

         public S2C_GameGoldDiceBuy_21938 build() {
            S2C_GameGoldDiceBuy_21938 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameGoldDiceBuy_21938 buildPartial() {
            S2C_GameGoldDiceBuy_21938 result = new S2C_GameGoldDiceBuy_21938(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyGoldDiceNum_ = this.buyGoldDiceNum_;
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
            if (other instanceof S2C_GameGoldDiceBuy_21938) {
               return this.mergeFrom((S2C_GameGoldDiceBuy_21938)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameGoldDiceBuy_21938 other) {
            if (other == ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyGoldDiceNum()) {
                  this.setBuyGoldDiceNum(other.getBuyGoldDiceNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyGoldDiceNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameGoldDiceBuy_21938 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameGoldDiceBuy_21938)ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameGoldDiceBuy_21938)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyGoldDiceNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyGoldDiceNum() {
            return this.buyGoldDiceNum_;
         }

         public Builder setBuyGoldDiceNum(int value) {
            this.bitField0_ |= 1;
            this.buyGoldDiceNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyGoldDiceNum() {
            this.bitField0_ &= -2;
            this.buyGoldDiceNum_ = 0;
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

   public static final class C2S_GameEvent_21939 extends GeneratedMessageV3 implements C2S_GameEvent_21939OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private GameEvent event_;
      private byte memoizedIsInitialized;
      private static final C2S_GameEvent_21939 DEFAULT_INSTANCE = new C2S_GameEvent_21939();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameEvent_21939> PARSER = new AbstractParser<C2S_GameEvent_21939>() {
         public C2S_GameEvent_21939 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameEvent_21939(input, extensionRegistry);
         }
      };

      private C2S_GameEvent_21939(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameEvent_21939() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameEvent_21939();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameEvent_21939(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(ActivityGuoQingMsg.GameEvent.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_21939.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getEvent());
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GameEvent_21939)) {
            return super.equals(obj);
         } else {
            C2S_GameEvent_21939 other = (C2S_GameEvent_21939)obj;
            if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GameEvent_21939 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_21939 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_21939 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_21939 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_21939 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_21939 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_21939)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_21939 parseFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_21939 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_21939 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_21939 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_21939 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_21939 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_21939)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameEvent_21939 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameEvent_21939 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameEvent_21939> parser() {
         return PARSER;
      }

      public Parser<C2S_GameEvent_21939> getParserForType() {
         return PARSER;
      }

      public C2S_GameEvent_21939 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameEvent_21939OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_21939.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameEvent_21939.alwaysUseFieldBuilders) {
               this.getEventFieldBuilder();
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameEvent_21939_descriptor;
         }

         public C2S_GameEvent_21939 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameEvent_21939.getDefaultInstance();
         }

         public C2S_GameEvent_21939 build() {
            C2S_GameEvent_21939 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameEvent_21939 buildPartial() {
            C2S_GameEvent_21939 result = new C2S_GameEvent_21939(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (GameEvent)this.eventBuilder_.build();
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
            if (other instanceof C2S_GameEvent_21939) {
               return this.mergeFrom((C2S_GameEvent_21939)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameEvent_21939 other) {
            if (other == ActivityGuoQingMsg.C2S_GameEvent_21939.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEvent()) {
               return false;
            } else {
               return this.getEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GameEvent_21939 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameEvent_21939)ActivityGuoQingMsg.C2S_GameEvent_21939.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameEvent_21939)e.getUnfinishedMessage();
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

         public GameEvent getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            } else {
               return (GameEvent)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(GameEvent value) {
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

         public Builder setEvent(GameEvent.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActivityGuoQingMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

         public GameEvent.Builder getEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (GameEvent.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public GameEventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (GameEventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_GameEvent_21940 extends GeneratedMessageV3 implements S2C_GameEvent_21940OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private GameEvent event_;
      public static final int GRID_FIELD_NUMBER = 2;
      private int grid_;
      public static final int BUILDING_FIELD_NUMBER = 3;
      private GameBuilding building_;
      public static final int NEXTEVENT_FIELD_NUMBER = 4;
      private GameEvent nextEvent_;
      private byte memoizedIsInitialized;
      private static final S2C_GameEvent_21940 DEFAULT_INSTANCE = new S2C_GameEvent_21940();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameEvent_21940> PARSER = new AbstractParser<S2C_GameEvent_21940>() {
         public S2C_GameEvent_21940 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameEvent_21940(input, extensionRegistry);
         }
      };

      private S2C_GameEvent_21940(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameEvent_21940() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameEvent_21940();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameEvent_21940(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(ActivityGuoQingMsg.GameEvent.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.event_);
                           this.event_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.grid_ = input.readInt32();
                        break;
                     case 26:
                        GameBuilding.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.building_.toBuilder();
                        }

                        this.building_ = (GameBuilding)input.readMessage(ActivityGuoQingMsg.GameBuilding.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.building_);
                           this.building_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.nextEvent_.toBuilder();
                        }

                        this.nextEvent_ = (GameEvent)input.readMessage(ActivityGuoQingMsg.GameEvent.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.nextEvent_);
                           this.nextEvent_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_21940.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasBuilding() {
         return (this.bitField0_ & 4) != 0;
      }

      public GameBuilding getBuilding() {
         return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public boolean hasNextEvent() {
         return (this.bitField0_ & 8) != 0;
      }

      public GameEvent getNextEvent() {
         return this.nextEvent_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
      }

      public GameEventOrBuilder getNextEventOrBuilder() {
         return this.nextEvent_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasBuilding() && !this.getBuilding().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasNextEvent() && !this.getNextEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getEvent());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.grid_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getBuilding());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getNextEvent());
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.grid_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getBuilding());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getNextEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameEvent_21940)) {
            return super.equals(obj);
         } else {
            S2C_GameEvent_21940 other = (S2C_GameEvent_21940)obj;
            if (this.hasEvent() != other.hasEvent()) {
               return false;
            } else if (this.hasEvent() && !this.getEvent().equals(other.getEvent())) {
               return false;
            } else if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasBuilding() != other.hasBuilding()) {
               return false;
            } else if (this.hasBuilding() && !this.getBuilding().equals(other.getBuilding())) {
               return false;
            } else if (this.hasNextEvent() != other.hasNextEvent()) {
               return false;
            } else if (this.hasNextEvent() && !this.getNextEvent().equals(other.getNextEvent())) {
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

            if (this.hasGrid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasBuilding()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuilding().hashCode();
            }

            if (this.hasNextEvent()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNextEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameEvent_21940 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_21940 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_21940 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_21940 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_21940 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_21940 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_21940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_21940 parseFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_21940 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_21940 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_21940 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_21940 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_21940 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_21940)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameEvent_21940 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameEvent_21940 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameEvent_21940> parser() {
         return PARSER;
      }

      public Parser<S2C_GameEvent_21940> getParserForType() {
         return PARSER;
      }

      public S2C_GameEvent_21940 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameEvent_21940OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;
         private int grid_;
         private GameBuilding building_;
         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent nextEvent_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> nextEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_21940.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameEvent_21940.alwaysUseFieldBuilders) {
               this.getEventFieldBuilder();
               this.getBuildingFieldBuilder();
               this.getNextEventFieldBuilder();
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
            this.grid_ = 0;
            this.bitField0_ &= -3;
            if (this.buildingBuilder_ == null) {
               this.building_ = null;
            } else {
               this.buildingBuilder_.clear();
            }

            this.bitField0_ &= -5;
            if (this.nextEventBuilder_ == null) {
               this.nextEvent_ = null;
            } else {
               this.nextEventBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameEvent_21940_descriptor;
         }

         public S2C_GameEvent_21940 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameEvent_21940.getDefaultInstance();
         }

         public S2C_GameEvent_21940 build() {
            S2C_GameEvent_21940 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameEvent_21940 buildPartial() {
            S2C_GameEvent_21940 result = new S2C_GameEvent_21940(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.eventBuilder_ == null) {
                  result.event_ = this.event_;
               } else {
                  result.event_ = (GameEvent)this.eventBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.buildingBuilder_ == null) {
                  result.building_ = this.building_;
               } else {
                  result.building_ = (GameBuilding)this.buildingBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.nextEventBuilder_ == null) {
                  result.nextEvent_ = this.nextEvent_;
               } else {
                  result.nextEvent_ = (GameEvent)this.nextEventBuilder_.build();
               }

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
            if (other instanceof S2C_GameEvent_21940) {
               return this.mergeFrom((S2C_GameEvent_21940)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameEvent_21940 other) {
            if (other == ActivityGuoQingMsg.S2C_GameEvent_21940.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEvent()) {
                  this.mergeEvent(other.getEvent());
               }

               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasBuilding()) {
                  this.mergeBuilding(other.getBuilding());
               }

               if (other.hasNextEvent()) {
                  this.mergeNextEvent(other.getNextEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEvent()) {
               return false;
            } else if (!this.hasGrid()) {
               return false;
            } else if (!this.getEvent().isInitialized()) {
               return false;
            } else if (this.hasBuilding() && !this.getBuilding().isInitialized()) {
               return false;
            } else {
               return !this.hasNextEvent() || this.getNextEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameEvent_21940 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameEvent_21940)ActivityGuoQingMsg.S2C_GameEvent_21940.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameEvent_21940)e.getUnfinishedMessage();
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

         public GameEvent getEvent() {
            if (this.eventBuilder_ == null) {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            } else {
               return (GameEvent)this.eventBuilder_.getMessage();
            }
         }

         public Builder setEvent(GameEvent value) {
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

         public Builder setEvent(GameEvent.Builder builderForValue) {
            if (this.eventBuilder_ == null) {
               this.event_ = builderForValue.build();
               this.onChanged();
            } else {
               this.eventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeEvent(GameEvent value) {
            if (this.eventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActivityGuoQingMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

         public GameEvent.Builder getEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (GameEvent.Builder)this.getEventFieldBuilder().getBuilder();
         }

         public GameEventOrBuilder getEventOrBuilder() {
            if (this.eventBuilder_ != null) {
               return (GameEventOrBuilder)this.eventBuilder_.getMessageOrBuilder();
            } else {
               return this.event_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.event_;
            }
         }

         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
               this.eventBuilder_ = new SingleFieldBuilderV3(this.getEvent(), this.getParentForChildren(), this.isClean());
               this.event_ = null;
            }

            return this.eventBuilder_;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 2;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -3;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuilding() {
            return (this.bitField0_ & 4) != 0;
         }

         public GameBuilding getBuilding() {
            if (this.buildingBuilder_ == null) {
               return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
            } else {
               return (GameBuilding)this.buildingBuilder_.getMessage();
            }
         }

         public Builder setBuilding(GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.building_ = value;
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setBuilding(GameBuilding.Builder builderForValue) {
            if (this.buildingBuilder_ == null) {
               this.building_ = builderForValue.build();
               this.onChanged();
            } else {
               this.buildingBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeBuilding(GameBuilding value) {
            if (this.buildingBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.building_ != null && this.building_ != ActivityGuoQingMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = ActivityGuoQingMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
               } else {
                  this.building_ = value;
               }

               this.onChanged();
            } else {
               this.buildingBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearBuilding() {
            if (this.buildingBuilder_ == null) {
               this.building_ = null;
               this.onChanged();
            } else {
               this.buildingBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public GameBuilding.Builder getBuildingBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().getBuilder();
         }

         public GameBuildingOrBuilder getBuildingOrBuilder() {
            if (this.buildingBuilder_ != null) {
               return (GameBuildingOrBuilder)this.buildingBuilder_.getMessageOrBuilder();
            } else {
               return this.building_ == null ? ActivityGuoQingMsg.GameBuilding.getDefaultInstance() : this.building_;
            }
         }

         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> getBuildingFieldBuilder() {
            if (this.buildingBuilder_ == null) {
               this.buildingBuilder_ = new SingleFieldBuilderV3(this.getBuilding(), this.getParentForChildren(), this.isClean());
               this.building_ = null;
            }

            return this.buildingBuilder_;
         }

         public boolean hasNextEvent() {
            return (this.bitField0_ & 8) != 0;
         }

         public GameEvent getNextEvent() {
            if (this.nextEventBuilder_ == null) {
               return this.nextEvent_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
            } else {
               return (GameEvent)this.nextEventBuilder_.getMessage();
            }
         }

         public Builder setNextEvent(GameEvent value) {
            if (this.nextEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.nextEvent_ = value;
               this.onChanged();
            } else {
               this.nextEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setNextEvent(GameEvent.Builder builderForValue) {
            if (this.nextEventBuilder_ == null) {
               this.nextEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.nextEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeNextEvent(GameEvent value) {
            if (this.nextEventBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.nextEvent_ != null && this.nextEvent_ != ActivityGuoQingMsg.GameEvent.getDefaultInstance()) {
                  this.nextEvent_ = ActivityGuoQingMsg.GameEvent.newBuilder(this.nextEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.nextEvent_ = value;
               }

               this.onChanged();
            } else {
               this.nextEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearNextEvent() {
            if (this.nextEventBuilder_ == null) {
               this.nextEvent_ = null;
               this.onChanged();
            } else {
               this.nextEventBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public GameEvent.Builder getNextEventBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (GameEvent.Builder)this.getNextEventFieldBuilder().getBuilder();
         }

         public GameEventOrBuilder getNextEventOrBuilder() {
            if (this.nextEventBuilder_ != null) {
               return (GameEventOrBuilder)this.nextEventBuilder_.getMessageOrBuilder();
            } else {
               return this.nextEvent_ == null ? ActivityGuoQingMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
            }
         }

         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> getNextEventFieldBuilder() {
            if (this.nextEventBuilder_ == null) {
               this.nextEventBuilder_ = new SingleFieldBuilderV3(this.getNextEvent(), this.getParentForChildren(), this.isClean());
               this.nextEvent_ = null;
            }

            return this.nextEventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GameTask_21941 extends GeneratedMessageV3 implements C2S_GameTask_21941OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameTask_21941 DEFAULT_INSTANCE = new C2S_GameTask_21941();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTask_21941> PARSER = new AbstractParser<C2S_GameTask_21941>() {
         public C2S_GameTask_21941 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTask_21941(input, extensionRegistry);
         }
      };

      private C2S_GameTask_21941(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTask_21941() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTask_21941();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTask_21941(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_21941.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTask_21941)) {
            return super.equals(obj);
         } else {
            C2S_GameTask_21941 other = (C2S_GameTask_21941)obj;
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

      public static C2S_GameTask_21941 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_21941 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_21941 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_21941 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_21941 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_21941 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_21941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_21941 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_21941 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_21941 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTask_21941 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_21941 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_21941 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_21941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTask_21941 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTask_21941 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTask_21941> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTask_21941> getParserForType() {
         return PARSER;
      }

      public C2S_GameTask_21941 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTask_21941OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_21941.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameTask_21941.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTask_21941_descriptor;
         }

         public C2S_GameTask_21941 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameTask_21941.getDefaultInstance();
         }

         public C2S_GameTask_21941 build() {
            C2S_GameTask_21941 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTask_21941 buildPartial() {
            C2S_GameTask_21941 result = new C2S_GameTask_21941(this);
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
            if (other instanceof C2S_GameTask_21941) {
               return this.mergeFrom((C2S_GameTask_21941)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTask_21941 other) {
            if (other == ActivityGuoQingMsg.C2S_GameTask_21941.getDefaultInstance()) {
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
            C2S_GameTask_21941 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTask_21941)ActivityGuoQingMsg.C2S_GameTask_21941.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTask_21941)e.getUnfinishedMessage();
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

   public static final class S2C_GameTask_21942 extends GeneratedMessageV3 implements S2C_GameTask_21942OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTask_21942 DEFAULT_INSTANCE = new S2C_GameTask_21942();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTask_21942> PARSER = new AbstractParser<S2C_GameTask_21942>() {
         public S2C_GameTask_21942 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTask_21942(input, extensionRegistry);
         }
      };

      private S2C_GameTask_21942(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTask_21942() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTask_21942();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTask_21942(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_21942.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTask_21942)) {
            return super.equals(obj);
         } else {
            S2C_GameTask_21942 other = (S2C_GameTask_21942)obj;
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

      public static S2C_GameTask_21942 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_21942 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_21942 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_21942 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_21942 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_21942 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_21942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_21942 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_21942 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_21942 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTask_21942 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_21942 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_21942 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_21942)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTask_21942 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTask_21942 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTask_21942> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTask_21942> getParserForType() {
         return PARSER;
      }

      public S2C_GameTask_21942 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTask_21942OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_21942.class, Builder.class);
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
            if (ActivityGuoQingMsg.S2C_GameTask_21942.alwaysUseFieldBuilders) {
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTask_21942_descriptor;
         }

         public S2C_GameTask_21942 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameTask_21942.getDefaultInstance();
         }

         public S2C_GameTask_21942 build() {
            S2C_GameTask_21942 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTask_21942 buildPartial() {
            S2C_GameTask_21942 result = new S2C_GameTask_21942(this);
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
            if (other instanceof S2C_GameTask_21942) {
               return this.mergeFrom((S2C_GameTask_21942)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTask_21942 other) {
            if (other == ActivityGuoQingMsg.S2C_GameTask_21942.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityGuoQingMsg.S2C_GameTask_21942.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTask_21942 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTask_21942)ActivityGuoQingMsg.S2C_GameTask_21942.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTask_21942)e.getUnfinishedMessage();
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

   public static final class C2S_GameTaskCommit_21943 extends GeneratedMessageV3 implements C2S_GameTaskCommit_21943OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_GameTaskCommit_21943 DEFAULT_INSTANCE = new C2S_GameTaskCommit_21943();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTaskCommit_21943> PARSER = new AbstractParser<C2S_GameTaskCommit_21943>() {
         public C2S_GameTaskCommit_21943 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTaskCommit_21943(input, extensionRegistry);
         }
      };

      private C2S_GameTaskCommit_21943(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTaskCommit_21943() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTaskCommit_21943();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTaskCommit_21943(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_21943.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTaskCommit_21943)) {
            return super.equals(obj);
         } else {
            C2S_GameTaskCommit_21943 other = (C2S_GameTaskCommit_21943)obj;
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

      public static C2S_GameTaskCommit_21943 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_21943)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_21943 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_21943 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_21943 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_21943)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTaskCommit_21943 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTaskCommit_21943 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTaskCommit_21943> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTaskCommit_21943> getParserForType() {
         return PARSER;
      }

      public C2S_GameTaskCommit_21943 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTaskCommit_21943OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_21943.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameTaskCommit_21943.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameTaskCommit_21943_descriptor;
         }

         public C2S_GameTaskCommit_21943 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameTaskCommit_21943.getDefaultInstance();
         }

         public C2S_GameTaskCommit_21943 build() {
            C2S_GameTaskCommit_21943 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTaskCommit_21943 buildPartial() {
            C2S_GameTaskCommit_21943 result = new C2S_GameTaskCommit_21943(this);
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
            if (other instanceof C2S_GameTaskCommit_21943) {
               return this.mergeFrom((C2S_GameTaskCommit_21943)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTaskCommit_21943 other) {
            if (other == ActivityGuoQingMsg.C2S_GameTaskCommit_21943.getDefaultInstance()) {
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
            C2S_GameTaskCommit_21943 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTaskCommit_21943)ActivityGuoQingMsg.C2S_GameTaskCommit_21943.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTaskCommit_21943)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskCommit_21944 extends GeneratedMessageV3 implements S2C_GameTaskCommit_21944OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskCommit_21944 DEFAULT_INSTANCE = new S2C_GameTaskCommit_21944();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskCommit_21944> PARSER = new AbstractParser<S2C_GameTaskCommit_21944>() {
         public S2C_GameTaskCommit_21944 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskCommit_21944(input, extensionRegistry);
         }
      };

      private S2C_GameTaskCommit_21944(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskCommit_21944() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskCommit_21944();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskCommit_21944(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_21944.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskCommit_21944)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskCommit_21944 other = (S2C_GameTaskCommit_21944)obj;
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

      public static S2C_GameTaskCommit_21944 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_21944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_21944 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_21944 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_21944 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_21944)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskCommit_21944 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskCommit_21944 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskCommit_21944> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskCommit_21944> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskCommit_21944 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskCommit_21944OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_21944.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameTaskCommit_21944.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskCommit_21944_descriptor;
         }

         public S2C_GameTaskCommit_21944 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameTaskCommit_21944.getDefaultInstance();
         }

         public S2C_GameTaskCommit_21944 build() {
            S2C_GameTaskCommit_21944 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskCommit_21944 buildPartial() {
            S2C_GameTaskCommit_21944 result = new S2C_GameTaskCommit_21944(this);
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
            if (other instanceof S2C_GameTaskCommit_21944) {
               return this.mergeFrom((S2C_GameTaskCommit_21944)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskCommit_21944 other) {
            if (other == ActivityGuoQingMsg.S2C_GameTaskCommit_21944.getDefaultInstance()) {
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
            S2C_GameTaskCommit_21944 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskCommit_21944)ActivityGuoQingMsg.S2C_GameTaskCommit_21944.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskCommit_21944)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskNotify_21946 extends GeneratedMessageV3 implements S2C_GameTaskNotify_21946OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskNotify_21946 DEFAULT_INSTANCE = new S2C_GameTaskNotify_21946();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskNotify_21946> PARSER = new AbstractParser<S2C_GameTaskNotify_21946>() {
         public S2C_GameTaskNotify_21946 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskNotify_21946(input, extensionRegistry);
         }
      };

      private S2C_GameTaskNotify_21946(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskNotify_21946() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskNotify_21946();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskNotify_21946(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_21946.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskNotify_21946)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskNotify_21946 other = (S2C_GameTaskNotify_21946)obj;
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

      public static S2C_GameTaskNotify_21946 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_21946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_21946 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_21946 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_21946 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_21946)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskNotify_21946 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskNotify_21946 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskNotify_21946> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskNotify_21946> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskNotify_21946 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskNotify_21946OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_21946.class, Builder.class);
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
            if (ActivityGuoQingMsg.S2C_GameTaskNotify_21946.alwaysUseFieldBuilders) {
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
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameTaskNotify_21946_descriptor;
         }

         public S2C_GameTaskNotify_21946 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameTaskNotify_21946.getDefaultInstance();
         }

         public S2C_GameTaskNotify_21946 build() {
            S2C_GameTaskNotify_21946 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskNotify_21946 buildPartial() {
            S2C_GameTaskNotify_21946 result = new S2C_GameTaskNotify_21946(this);
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
            if (other instanceof S2C_GameTaskNotify_21946) {
               return this.mergeFrom((S2C_GameTaskNotify_21946)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskNotify_21946 other) {
            if (other == ActivityGuoQingMsg.S2C_GameTaskNotify_21946.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityGuoQingMsg.S2C_GameTaskNotify_21946.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTaskNotify_21946 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskNotify_21946)ActivityGuoQingMsg.S2C_GameTaskNotify_21946.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskNotify_21946)e.getUnfinishedMessage();
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

   public static final class C2S_GameBuildingReward_21947 extends GeneratedMessageV3 implements C2S_GameBuildingReward_21947OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final C2S_GameBuildingReward_21947 DEFAULT_INSTANCE = new C2S_GameBuildingReward_21947();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameBuildingReward_21947> PARSER = new AbstractParser<C2S_GameBuildingReward_21947>() {
         public C2S_GameBuildingReward_21947 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameBuildingReward_21947(input, extensionRegistry);
         }
      };

      private C2S_GameBuildingReward_21947(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameBuildingReward_21947() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameBuildingReward_21947();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameBuildingReward_21947(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buildingId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.lv_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_21947.class, Builder.class);
      }

      public boolean hasBuildingId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuildingId() {
         return this.buildingId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuildingId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buildingId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buildingId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GameBuildingReward_21947)) {
            return super.equals(obj);
         } else {
            C2S_GameBuildingReward_21947 other = (C2S_GameBuildingReward_21947)obj;
            if (this.hasBuildingId() != other.hasBuildingId()) {
               return false;
            } else if (this.hasBuildingId() && this.getBuildingId() != other.getBuildingId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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
            if (this.hasBuildingId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuildingId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GameBuildingReward_21947 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_21947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_21947 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_21947 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_21947 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_21947)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameBuildingReward_21947 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameBuildingReward_21947 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameBuildingReward_21947> parser() {
         return PARSER;
      }

      public Parser<C2S_GameBuildingReward_21947> getParserForType() {
         return PARSER;
      }

      public C2S_GameBuildingReward_21947 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameBuildingReward_21947OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_21947.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.C2S_GameBuildingReward_21947.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buildingId_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_C2S_GameBuildingReward_21947_descriptor;
         }

         public C2S_GameBuildingReward_21947 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.C2S_GameBuildingReward_21947.getDefaultInstance();
         }

         public C2S_GameBuildingReward_21947 build() {
            C2S_GameBuildingReward_21947 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameBuildingReward_21947 buildPartial() {
            C2S_GameBuildingReward_21947 result = new C2S_GameBuildingReward_21947(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buildingId_ = this.buildingId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof C2S_GameBuildingReward_21947) {
               return this.mergeFrom((C2S_GameBuildingReward_21947)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameBuildingReward_21947 other) {
            if (other == ActivityGuoQingMsg.C2S_GameBuildingReward_21947.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuildingId()) {
                  this.setBuildingId(other.getBuildingId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuildingId()) {
               return false;
            } else {
               return this.hasLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GameBuildingReward_21947 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameBuildingReward_21947)ActivityGuoQingMsg.C2S_GameBuildingReward_21947.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameBuildingReward_21947)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuildingId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuildingId() {
            return this.buildingId_;
         }

         public Builder setBuildingId(int value) {
            this.bitField0_ |= 1;
            this.buildingId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuildingId() {
            this.bitField0_ &= -2;
            this.buildingId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 2;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -3;
            this.lv_ = 0;
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

   public static final class S2C_GameBuildingReward_21948 extends GeneratedMessageV3 implements S2C_GameBuildingReward_21948OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final S2C_GameBuildingReward_21948 DEFAULT_INSTANCE = new S2C_GameBuildingReward_21948();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameBuildingReward_21948> PARSER = new AbstractParser<S2C_GameBuildingReward_21948>() {
         public S2C_GameBuildingReward_21948 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameBuildingReward_21948(input, extensionRegistry);
         }
      };

      private S2C_GameBuildingReward_21948(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameBuildingReward_21948() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameBuildingReward_21948();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameBuildingReward_21948(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buildingId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.lv_ = input.readInt32();
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
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_21948.class, Builder.class);
      }

      public boolean hasBuildingId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuildingId() {
         return this.buildingId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuildingId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buildingId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buildingId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GameBuildingReward_21948)) {
            return super.equals(obj);
         } else {
            S2C_GameBuildingReward_21948 other = (S2C_GameBuildingReward_21948)obj;
            if (this.hasBuildingId() != other.hasBuildingId()) {
               return false;
            } else if (this.hasBuildingId() && this.getBuildingId() != other.getBuildingId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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
            if (this.hasBuildingId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuildingId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GameBuildingReward_21948 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_21948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_21948 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_21948 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_21948 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_21948)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameBuildingReward_21948 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameBuildingReward_21948 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameBuildingReward_21948> parser() {
         return PARSER;
      }

      public Parser<S2C_GameBuildingReward_21948> getParserForType() {
         return PARSER;
      }

      public S2C_GameBuildingReward_21948 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameBuildingReward_21948OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_21948.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityGuoQingMsg.S2C_GameBuildingReward_21948.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buildingId_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityGuoQingMsg.internal_static_activityGuoQing_com_gzbz_protobuf_S2C_GameBuildingReward_21948_descriptor;
         }

         public S2C_GameBuildingReward_21948 getDefaultInstanceForType() {
            return ActivityGuoQingMsg.S2C_GameBuildingReward_21948.getDefaultInstance();
         }

         public S2C_GameBuildingReward_21948 build() {
            S2C_GameBuildingReward_21948 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameBuildingReward_21948 buildPartial() {
            S2C_GameBuildingReward_21948 result = new S2C_GameBuildingReward_21948(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buildingId_ = this.buildingId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof S2C_GameBuildingReward_21948) {
               return this.mergeFrom((S2C_GameBuildingReward_21948)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameBuildingReward_21948 other) {
            if (other == ActivityGuoQingMsg.S2C_GameBuildingReward_21948.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuildingId()) {
                  this.setBuildingId(other.getBuildingId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuildingId()) {
               return false;
            } else {
               return this.hasLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GameBuildingReward_21948 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameBuildingReward_21948)ActivityGuoQingMsg.S2C_GameBuildingReward_21948.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameBuildingReward_21948)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuildingId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuildingId() {
            return this.buildingId_;
         }

         public Builder setBuildingId(int value) {
            this.bitField0_ |= 1;
            this.buildingId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuildingId() {
            this.bitField0_ &= -2;
            this.buildingId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 2;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -3;
            this.lv_ = 0;
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

   public interface C2S_ActivityInfo_21901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_21921OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_21917OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_21913OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_GameAddRandomDice_21935OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameBuildingReward_21947OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface C2S_GameEvent_21939OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();
   }

   public interface C2S_GameGoldDiceBuy_21937OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameMain_21931OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameRollDice_21933OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_GameTaskCommit_21943OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_GameTask_21941OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckDrawInfo_21915OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_21919OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveShopAddUpReward_21905OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_21923OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_21903OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_21906OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_21908OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface GameBuildingOrBuilder extends MessageOrBuilder {
      boolean hasBuildId();

      int getBuildId();

      boolean hasLv();

      int getLv();

      List<Integer> getRewardLvList();

      int getRewardLvCount();

      int getRewardLv(int index);
   }

   public interface GameEventOrBuilder extends MessageOrBuilder {
      boolean hasEventId();

      int getEventId();

      List<Integer> getEventParamList();

      int getEventParamCount();

      int getEventParam(int index);
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

   public interface S2C_ActivityInfo_21902OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_DrawRecord_21922OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_21918OrBuilder extends MessageOrBuilder {
      boolean hasDrawTimes();

      int getDrawTimes();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);

      boolean hasRecruitNum();

      int getRecruitNum();

      List<CommonMsg.MapDataII> getSeniorNumList();

      CommonMsg.MapDataII getSeniorNum(int index);

      int getSeniorNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index);

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      boolean hasTargetId();

      int getTargetId();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_FancyReward_21914OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_GameAddRandomDice_21936OrBuilder extends MessageOrBuilder {
      boolean hasDiceRecover();

      int getDiceRecover();
   }

   public interface S2C_GameBuildingReward_21948OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_GameEvent_21940OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();

      boolean hasGrid();

      int getGrid();

      boolean hasBuilding();

      GameBuilding getBuilding();

      GameBuildingOrBuilder getBuildingOrBuilder();

      boolean hasNextEvent();

      GameEvent getNextEvent();

      GameEventOrBuilder getNextEventOrBuilder();
   }

   public interface S2C_GameGoldDiceBuy_21938OrBuilder extends MessageOrBuilder {
      boolean hasBuyGoldDiceNum();

      int getBuyGoldDiceNum();
   }

   public interface S2C_GameMain_21932OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasDiceRecover();

      int getDiceRecover();

      boolean hasBuyGoldDiceNum();

      int getBuyGoldDiceNum();

      List<GameBuilding> getBuildingList();

      GameBuilding getBuilding(int index);

      int getBuildingCount();

      List<? extends GameBuildingOrBuilder> getBuildingOrBuilderList();

      GameBuildingOrBuilder getBuildingOrBuilder(int index);

      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();
   }

   public interface S2C_GameRollDice_21934OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();

      boolean hasGrid();

      int getGrid();

      boolean hasDiceRecover();

      int getDiceRecover();

      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();

      boolean hasBuilding();

      GameBuilding getBuilding();

      GameBuildingOrBuilder getBuildingOrBuilder();
   }

   public interface S2C_GameTaskCommit_21944OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_GameTaskNotify_21946OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_GameTask_21942OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LuckDrawInfo_21916OrBuilder extends MessageOrBuilder {
      boolean hasDrawTimes();

      int getDrawTimes();

      List<Integer> getHadRewardIdList();

      int getHadRewardIdCount();

      int getHadRewardId(int index);

      boolean hasStagEndTime();

      long getStagEndTime();

      boolean hasRecruitNum();

      int getRecruitNum();

      List<CommonMsg.MapDataII> getSeniorRewardsList();

      CommonMsg.MapDataII getSeniorRewards(int index);

      int getSeniorRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index);

      boolean hasLotteryStage();

      int getLotteryStage();

      boolean hasFancyId();

      int getFancyId();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_OpenReward_21920OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ServerDrawRecord_21924OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_21904OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_21907OrBuilder extends MessageOrBuilder {
      boolean hasActivityDay();

      int getActivityDay();

      List<Integer> getSignGotRewardsList();

      int getSignGotRewardsCount();

      int getSignGotRewards(int index);
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
   }
}
