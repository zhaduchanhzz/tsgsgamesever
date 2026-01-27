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

public final class ActGoldWeekMsg {
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActGoldWeekMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011ActGoldWeek.proto\u0012\u001dActGoldWeek.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_24001\">\n\u0016S2C_ActivityInfo_24002\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_24003\"D\n\u0017S2C_ShopAddUpInfo_24004\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_24005\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_24006\"F\n\u0017S2C_SignTotalInfo_24007\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_24008\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_24013\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_24014\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_24015\"×\u0001\n\u0016S2C_LuckDrawInfo_24016\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_24017\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_24018\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0003 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0005 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0006 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0007 \u0002(\u0005\"\"\n\u0014C2S_OpenReward_24019\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_24020\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_24021\"U\n\u0014S2C_DrawRecord_24022\u0012=\n\bmyRecord\u0018\u0001 \u0003(\u000b2+.ActGoldWeek.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_24023\"c\n\u001aS2C_ServerDrawRecord_24024\u0012E\n\fserverRecord\u0018\u0001 \u0003(\u000b2/.ActGoldWeek.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005\"=\n\fGameBuilding\u0012\u000f\n\u0007buildId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardLv\u0018\u0003 \u0003(\u0005\"0\n\tGameEvent\u0012\u000f\n\u0007eventId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\neventParam\u0018\u0002 \u0003(\u0005\"\u0014\n\u0012C2S_GameMain_24031\"Ç\u0001\n\u0012S2C_GameMain_24032\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0003 \u0002(\u0005\u0012=\n\bbuilding\u0018\u0004 \u0003(\u000b2+.ActGoldWeek.com.gzbz.protobuf.GameBuilding\u00127\n\u0005event\u0018\u0005 \u0001(\u000b2(.ActGoldWeek.com.gzbz.protobuf.GameEvent\"3\n\u0016C2S_GameRollDice_24033\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"Î\u0001\n\u0016S2C_GameRollDice_24034\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdiceRecover\u0018\u0004 \u0002(\u0005\u00127\n\u0005event\u0018\u0005 \u0001(\u000b2(.ActGoldWeek.com.gzbz.protobuf.GameEvent\u0012=\n\bbuilding\u0018\u0006 \u0001(\u000b2+.ActGoldWeek.com.gzbz.protobuf.GameBuilding\"\u001d\n\u001bC2S_GameAddRandomDice_24035\"2\n\u001bS2C_GameAddRandomDice_24036\u0012\u0013\n\u000bdiceRecover\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_GameGoldDiceBuy_24037\"3\n\u0019S2C_GameGoldDiceBuy_24038\u0012\u0016\n\u000ebuyGoldDiceNum\u0018\u0001 \u0002(\u0005\"N\n\u0013C2S_GameEvent_24039\u00127\n\u0005event\u0018\u0001 \u0002(\u000b2(.ActGoldWeek.com.gzbz.protobuf.GameEvent\"Ø\u0001\n\u0013S2C_GameEvent_24040\u00127\n\u0005event\u0018\u0001 \u0002(\u000b2(.ActGoldWeek.com.gzbz.protobuf.GameEvent\u0012\f\n\u0004grid\u0018\u0002 \u0002(\u0005\u0012=\n\bbuilding\u0018\u0003 \u0001(\u000b2+.ActGoldWeek.com.gzbz.protobuf.GameBuilding\u0012;\n\tnextEvent\u0018\u0004 \u0001(\u000b2(.ActGoldWeek.com.gzbz.protobuf.GameEvent\"\u0014\n\u0012C2S_GameTask_24041\"0\n\u0012S2C_GameTask_24042\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"*\n\u0018C2S_GameTaskCommit_24043\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_GameTaskCommit_24044\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"6\n\u0018S2C_GameTaskNotify_24046\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\">\n\u001cC2S_GameBuildingReward_24047\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\">\n\u001cS2C_GameBuildingReward_24048\u0012\u0012\n\nbuildingId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eActGoldWeekMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor, new String[]{"OpenDay", "ActivityDay"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor, new String[]{"Id"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor, new String[]{"Day"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor, new String[]{"TargetId"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor, new String[]{"Result", "TargetId"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor, new String[]{"Type"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor, new String[]{"Id"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor, new String[]{"Id"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor, new String[]{"MyRecord"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor, new String[]{"ServerRecord"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor, new String[]{"BuildId", "Lv", "RewardLv"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor, new String[]{"EventId", "EventParam"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor, new String[]{"Grid", "DiceRecover", "BuyGoldDiceNum", "Building", "Event"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor, new String[]{"Type", "Num"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor, new String[]{"Type", "Num", "Grid", "DiceRecover", "Event", "Building"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor, new String[]{"DiceRecover"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor, new String[]{"BuyGoldDiceNum"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor, new String[]{"Event"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor, new String[]{"Event", "Grid", "Building", "NextEvent"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor, new String[0]);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor, new String[]{"Task"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor, new String[]{"TaskId"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor, new String[]{"TaskId"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor, new String[]{"Task"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor, new String[]{"BuildingId", "Lv"});
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor, new String[]{"BuildingId", "Lv"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_24001 extends GeneratedMessageV3 implements C2S_ActivityInfo_24001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_24001 DEFAULT_INSTANCE = new C2S_ActivityInfo_24001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_24001> PARSER = new AbstractParser<C2S_ActivityInfo_24001>() {
         public C2S_ActivityInfo_24001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_24001(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_24001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_24001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_24001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_24001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_24001)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_24001 other = (C2S_ActivityInfo_24001)obj;
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

      public static C2S_ActivityInfo_24001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_24001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_24001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_24001 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_24001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_24001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_24001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_24001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_24001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_24001> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_24001> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_24001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_24001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_24001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_ActivityInfo_24001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ActivityInfo_24001_descriptor;
         }

         public C2S_ActivityInfo_24001 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_ActivityInfo_24001.getDefaultInstance();
         }

         public C2S_ActivityInfo_24001 build() {
            C2S_ActivityInfo_24001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_24001 buildPartial() {
            C2S_ActivityInfo_24001 result = new C2S_ActivityInfo_24001(this);
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
            if (other instanceof C2S_ActivityInfo_24001) {
               return this.mergeFrom((C2S_ActivityInfo_24001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_24001 other) {
            if (other == ActGoldWeekMsg.C2S_ActivityInfo_24001.getDefaultInstance()) {
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
            C2S_ActivityInfo_24001 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_24001)ActGoldWeekMsg.C2S_ActivityInfo_24001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_24001)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_24002 extends GeneratedMessageV3 implements S2C_ActivityInfo_24002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_24002 DEFAULT_INSTANCE = new S2C_ActivityInfo_24002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_24002> PARSER = new AbstractParser<S2C_ActivityInfo_24002>() {
         public S2C_ActivityInfo_24002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_24002(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_24002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_24002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_24002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_24002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24002.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityInfo_24002)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_24002 other = (S2C_ActivityInfo_24002)obj;
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

      public static S2C_ActivityInfo_24002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_24002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_24002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_24002 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_24002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_24002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_24002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_24002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_24002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_24002> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_24002> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_24002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_24002OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_24002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_ActivityInfo_24002.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ActivityInfo_24002_descriptor;
         }

         public S2C_ActivityInfo_24002 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_ActivityInfo_24002.getDefaultInstance();
         }

         public S2C_ActivityInfo_24002 build() {
            S2C_ActivityInfo_24002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_24002 buildPartial() {
            S2C_ActivityInfo_24002 result = new S2C_ActivityInfo_24002(this);
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
            if (other instanceof S2C_ActivityInfo_24002) {
               return this.mergeFrom((S2C_ActivityInfo_24002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_24002 other) {
            if (other == ActGoldWeekMsg.S2C_ActivityInfo_24002.getDefaultInstance()) {
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
            S2C_ActivityInfo_24002 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_24002)ActGoldWeekMsg.S2C_ActivityInfo_24002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_24002)e.getUnfinishedMessage();
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

   public static final class C2S_ShopAddUpInfo_24003 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_24003OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_24003 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_24003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_24003> PARSER = new AbstractParser<C2S_ShopAddUpInfo_24003>() {
         public C2S_ShopAddUpInfo_24003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_24003(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_24003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_24003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_24003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_24003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_24003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_24003)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_24003 other = (C2S_ShopAddUpInfo_24003)obj;
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

      public static C2S_ShopAddUpInfo_24003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_24003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_24003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_24003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_24003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_24003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_24003> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_24003> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_24003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_24003OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_24003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_ShopAddUpInfo_24003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ShopAddUpInfo_24003_descriptor;
         }

         public C2S_ShopAddUpInfo_24003 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_ShopAddUpInfo_24003.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_24003 build() {
            C2S_ShopAddUpInfo_24003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_24003 buildPartial() {
            C2S_ShopAddUpInfo_24003 result = new C2S_ShopAddUpInfo_24003(this);
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
            if (other instanceof C2S_ShopAddUpInfo_24003) {
               return this.mergeFrom((C2S_ShopAddUpInfo_24003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_24003 other) {
            if (other == ActGoldWeekMsg.C2S_ShopAddUpInfo_24003.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_24003 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_24003)ActGoldWeekMsg.C2S_ShopAddUpInfo_24003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_24003)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_24004 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_24004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_24004 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_24004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_24004> PARSER = new AbstractParser<S2C_ShopAddUpInfo_24004>() {
         public S2C_ShopAddUpInfo_24004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_24004(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_24004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_24004() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_24004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_24004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_24004.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShopAddUpInfo_24004)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_24004 other = (S2C_ShopAddUpInfo_24004)obj;
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

      public static S2C_ShopAddUpInfo_24004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_24004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_24004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_24004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_24004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_24004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_24004> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_24004> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_24004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_24004OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_24004.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ShopAddUpInfo_24004_descriptor;
         }

         public S2C_ShopAddUpInfo_24004 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_24004 build() {
            S2C_ShopAddUpInfo_24004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_24004 buildPartial() {
            S2C_ShopAddUpInfo_24004 result = new S2C_ShopAddUpInfo_24004(this);
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
            if (other instanceof S2C_ShopAddUpInfo_24004) {
               return this.mergeFrom((S2C_ShopAddUpInfo_24004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_24004 other) {
            if (other == ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.getDefaultInstance()) {
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
            S2C_ShopAddUpInfo_24004 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_24004)ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_24004)e.getUnfinishedMessage();
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
               this.gotRewards_ = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_24005 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_24005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_24005 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_24005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_24005> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_24005>() {
         public C2S_ReceiveShopAddUpReward_24005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_24005(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_24005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_24005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_24005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_24005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_24005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_24005)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_24005 other = (C2S_ReceiveShopAddUpReward_24005)obj;
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

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_24005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_24005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_24005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_24005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_24005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_24005> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_24005> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_24005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_24005OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_24005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_ReceiveShopAddUpReward_24005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_24005_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_24005 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_ReceiveShopAddUpReward_24005.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_24005 build() {
            C2S_ReceiveShopAddUpReward_24005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_24005 buildPartial() {
            C2S_ReceiveShopAddUpReward_24005 result = new C2S_ReceiveShopAddUpReward_24005(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_24005) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_24005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_24005 other) {
            if (other == ActGoldWeekMsg.C2S_ReceiveShopAddUpReward_24005.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_24005 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_24005)ActGoldWeekMsg.C2S_ReceiveShopAddUpReward_24005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_24005)e.getUnfinishedMessage();
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

   public static final class C2S_SignTotalInfo_24006 extends GeneratedMessageV3 implements C2S_SignTotalInfo_24006OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_24006 DEFAULT_INSTANCE = new C2S_SignTotalInfo_24006();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_24006> PARSER = new AbstractParser<C2S_SignTotalInfo_24006>() {
         public C2S_SignTotalInfo_24006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_24006(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_24006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_24006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_24006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_24006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_24006.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_24006)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_24006 other = (C2S_SignTotalInfo_24006)obj;
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

      public static C2S_SignTotalInfo_24006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_24006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24006 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_24006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_24006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_24006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_24006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_24006> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_24006> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_24006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_24006OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_24006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_SignTotalInfo_24006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_SignTotalInfo_24006_descriptor;
         }

         public C2S_SignTotalInfo_24006 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_SignTotalInfo_24006.getDefaultInstance();
         }

         public C2S_SignTotalInfo_24006 build() {
            C2S_SignTotalInfo_24006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_24006 buildPartial() {
            C2S_SignTotalInfo_24006 result = new C2S_SignTotalInfo_24006(this);
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
            if (other instanceof C2S_SignTotalInfo_24006) {
               return this.mergeFrom((C2S_SignTotalInfo_24006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_24006 other) {
            if (other == ActGoldWeekMsg.C2S_SignTotalInfo_24006.getDefaultInstance()) {
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
            C2S_SignTotalInfo_24006 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_24006)ActGoldWeekMsg.C2S_SignTotalInfo_24006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_24006)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_24007 extends GeneratedMessageV3 implements S2C_SignTotalInfo_24007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_24007 DEFAULT_INSTANCE = new S2C_SignTotalInfo_24007();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_24007> PARSER = new AbstractParser<S2C_SignTotalInfo_24007>() {
         public S2C_SignTotalInfo_24007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_24007(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_24007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_24007() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_24007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_24007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_24007.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignTotalInfo_24007)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_24007 other = (S2C_SignTotalInfo_24007)obj;
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

      public static S2C_SignTotalInfo_24007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_24007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24007 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_24007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_24007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_24007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_24007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_24007> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_24007> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_24007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_24007OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_24007.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = ActGoldWeekMsg.S2C_SignTotalInfo_24007.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = ActGoldWeekMsg.S2C_SignTotalInfo_24007.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_SignTotalInfo_24007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = ActGoldWeekMsg.S2C_SignTotalInfo_24007.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_SignTotalInfo_24007_descriptor;
         }

         public S2C_SignTotalInfo_24007 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_SignTotalInfo_24007.getDefaultInstance();
         }

         public S2C_SignTotalInfo_24007 build() {
            S2C_SignTotalInfo_24007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_24007 buildPartial() {
            S2C_SignTotalInfo_24007 result = new S2C_SignTotalInfo_24007(this);
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
            if (other instanceof S2C_SignTotalInfo_24007) {
               return this.mergeFrom((S2C_SignTotalInfo_24007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_24007 other) {
            if (other == ActGoldWeekMsg.S2C_SignTotalInfo_24007.getDefaultInstance()) {
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
            S2C_SignTotalInfo_24007 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_24007)ActGoldWeekMsg.S2C_SignTotalInfo_24007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_24007)e.getUnfinishedMessage();
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
               this.signGotRewards_ = ActGoldWeekMsg.S2C_SignTotalInfo_24007.mutableCopy(this.signGotRewards_);
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
            this.signGotRewards_ = ActGoldWeekMsg.S2C_SignTotalInfo_24007.emptyIntList();
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

   public static final class C2S_Sign_24008 extends GeneratedMessageV3 implements C2S_Sign_24008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_24008 DEFAULT_INSTANCE = new C2S_Sign_24008();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_24008> PARSER = new AbstractParser<C2S_Sign_24008>() {
         public C2S_Sign_24008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_24008(input, extensionRegistry);
         }
      };

      private C2S_Sign_24008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_24008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_24008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_24008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_24008.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Sign_24008)) {
            return super.equals(obj);
         } else {
            C2S_Sign_24008 other = (C2S_Sign_24008)obj;
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

      public static C2S_Sign_24008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data);
      }

      public static C2S_Sign_24008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_24008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_24008 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_24008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_24008 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_24008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_24008 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_24008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_24008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_24008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_24008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_24008> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_24008> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_24008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_24008OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_24008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_Sign_24008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Sign_24008_descriptor;
         }

         public C2S_Sign_24008 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_Sign_24008.getDefaultInstance();
         }

         public C2S_Sign_24008 build() {
            C2S_Sign_24008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_24008 buildPartial() {
            C2S_Sign_24008 result = new C2S_Sign_24008(this);
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
            if (other instanceof C2S_Sign_24008) {
               return this.mergeFrom((C2S_Sign_24008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_24008 other) {
            if (other == ActGoldWeekMsg.C2S_Sign_24008.getDefaultInstance()) {
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
            C2S_Sign_24008 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_24008)ActGoldWeekMsg.C2S_Sign_24008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_24008)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_24013 extends GeneratedMessageV3 implements C2S_FancyReward_24013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_24013 DEFAULT_INSTANCE = new C2S_FancyReward_24013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_24013> PARSER = new AbstractParser<C2S_FancyReward_24013>() {
         public C2S_FancyReward_24013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_24013(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_24013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_24013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_24013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_24013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_24013.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_24013)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_24013 other = (C2S_FancyReward_24013)obj;
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

      public static C2S_FancyReward_24013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_24013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_24013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_24013 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_24013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_24013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_24013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_24013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_24013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_24013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_24013> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_24013> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_24013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_24013OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_24013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_FancyReward_24013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_FancyReward_24013_descriptor;
         }

         public C2S_FancyReward_24013 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_FancyReward_24013.getDefaultInstance();
         }

         public C2S_FancyReward_24013 build() {
            C2S_FancyReward_24013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_24013 buildPartial() {
            C2S_FancyReward_24013 result = new C2S_FancyReward_24013(this);
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
            if (other instanceof C2S_FancyReward_24013) {
               return this.mergeFrom((C2S_FancyReward_24013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_24013 other) {
            if (other == ActGoldWeekMsg.C2S_FancyReward_24013.getDefaultInstance()) {
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
            C2S_FancyReward_24013 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_24013)ActGoldWeekMsg.C2S_FancyReward_24013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_24013)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_24014 extends GeneratedMessageV3 implements S2C_FancyReward_24014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_24014 DEFAULT_INSTANCE = new S2C_FancyReward_24014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_24014> PARSER = new AbstractParser<S2C_FancyReward_24014>() {
         public S2C_FancyReward_24014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_24014(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_24014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_24014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_24014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_24014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_24014.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_24014)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_24014 other = (S2C_FancyReward_24014)obj;
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

      public static S2C_FancyReward_24014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_24014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_24014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_24014 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_24014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_24014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_24014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_24014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_24014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_24014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_24014> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_24014> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_24014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_24014OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_24014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_FancyReward_24014.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_FancyReward_24014_descriptor;
         }

         public S2C_FancyReward_24014 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_FancyReward_24014.getDefaultInstance();
         }

         public S2C_FancyReward_24014 build() {
            S2C_FancyReward_24014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_24014 buildPartial() {
            S2C_FancyReward_24014 result = new S2C_FancyReward_24014(this);
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
            if (other instanceof S2C_FancyReward_24014) {
               return this.mergeFrom((S2C_FancyReward_24014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_24014 other) {
            if (other == ActGoldWeekMsg.S2C_FancyReward_24014.getDefaultInstance()) {
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
            S2C_FancyReward_24014 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_24014)ActGoldWeekMsg.S2C_FancyReward_24014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_24014)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_24015 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_24015OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_24015 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_24015();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_24015> PARSER = new AbstractParser<C2S_LuckDrawInfo_24015>() {
         public C2S_LuckDrawInfo_24015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_24015(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_24015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_24015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_24015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_24015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_24015.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_24015)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_24015 other = (C2S_LuckDrawInfo_24015)obj;
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

      public static C2S_LuckDrawInfo_24015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_24015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_24015 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_24015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_24015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_24015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_24015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_24015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_24015> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_24015> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_24015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_24015OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_24015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_LuckDrawInfo_24015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_LuckDrawInfo_24015_descriptor;
         }

         public C2S_LuckDrawInfo_24015 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_LuckDrawInfo_24015.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_24015 build() {
            C2S_LuckDrawInfo_24015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_24015 buildPartial() {
            C2S_LuckDrawInfo_24015 result = new C2S_LuckDrawInfo_24015(this);
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
            if (other instanceof C2S_LuckDrawInfo_24015) {
               return this.mergeFrom((C2S_LuckDrawInfo_24015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_24015 other) {
            if (other == ActGoldWeekMsg.C2S_LuckDrawInfo_24015.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_24015 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_24015)ActGoldWeekMsg.C2S_LuckDrawInfo_24015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_24015)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_24016 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_24016OrBuilder {
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
      private static final S2C_LuckDrawInfo_24016 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_24016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_24016> PARSER = new AbstractParser<S2C_LuckDrawInfo_24016>() {
         public S2C_LuckDrawInfo_24016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_24016(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_24016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_24016() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_24016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_24016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_24016.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LuckDrawInfo_24016)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_24016 other = (S2C_LuckDrawInfo_24016)obj;
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

      public static S2C_LuckDrawInfo_24016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_24016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_24016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_24016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_24016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_24016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_24016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_24016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_24016> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_24016> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_24016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_24016OrBuilder {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_24016.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_LuckDrawInfo_24016.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.emptyIntList();
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_LuckDrawInfo_24016_descriptor;
         }

         public S2C_LuckDrawInfo_24016 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_LuckDrawInfo_24016.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_24016 build() {
            S2C_LuckDrawInfo_24016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_24016 buildPartial() {
            S2C_LuckDrawInfo_24016 result = new S2C_LuckDrawInfo_24016(this);
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
            if (other instanceof S2C_LuckDrawInfo_24016) {
               return this.mergeFrom((S2C_LuckDrawInfo_24016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_24016 other) {
            if (other == ActGoldWeekMsg.S2C_LuckDrawInfo_24016.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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
            S2C_LuckDrawInfo_24016 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_24016)ActGoldWeekMsg.S2C_LuckDrawInfo_24016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_24016)e.getUnfinishedMessage();
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
               this.hadRewardId_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.emptyIntList();
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

   public static final class C2S_Draw_24017 extends GeneratedMessageV3 implements C2S_Draw_24017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_24017 DEFAULT_INSTANCE = new C2S_Draw_24017();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_24017> PARSER = new AbstractParser<C2S_Draw_24017>() {
         public C2S_Draw_24017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_24017(input, extensionRegistry);
         }
      };

      private C2S_Draw_24017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_24017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_24017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_24017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_24017.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_24017)) {
            return super.equals(obj);
         } else {
            C2S_Draw_24017 other = (C2S_Draw_24017)obj;
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

      public static C2S_Draw_24017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_24017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_24017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_24017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_24017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data);
      }

      public static C2S_Draw_24017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_24017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_24017 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_24017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_24017 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_24017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_24017 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_24017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_24017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_24017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_24017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_24017> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_24017> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_24017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_24017OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_24017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_Draw_24017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_Draw_24017_descriptor;
         }

         public C2S_Draw_24017 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_Draw_24017.getDefaultInstance();
         }

         public C2S_Draw_24017 build() {
            C2S_Draw_24017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_24017 buildPartial() {
            C2S_Draw_24017 result = new C2S_Draw_24017(this);
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
            if (other instanceof C2S_Draw_24017) {
               return this.mergeFrom((C2S_Draw_24017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_24017 other) {
            if (other == ActGoldWeekMsg.C2S_Draw_24017.getDefaultInstance()) {
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
            C2S_Draw_24017 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_24017)ActGoldWeekMsg.C2S_Draw_24017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_24017)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_24018 extends GeneratedMessageV3 implements S2C_Draw_24018OrBuilder {
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
      private static final S2C_Draw_24018 DEFAULT_INSTANCE = new S2C_Draw_24018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_24018> PARSER = new AbstractParser<S2C_Draw_24018>() {
         public S2C_Draw_24018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_24018(input, extensionRegistry);
         }
      };

      private S2C_Draw_24018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_24018() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_24018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_24018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_24018.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_24018)) {
            return super.equals(obj);
         } else {
            S2C_Draw_24018 other = (S2C_Draw_24018)obj;
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

      public static S2C_Draw_24018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_24018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_24018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_24018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_24018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data);
      }

      public static S2C_Draw_24018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_24018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_24018 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_24018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_24018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_24018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_24018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_24018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_24018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_24018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_24018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_24018> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_24018> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_24018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_24018OrBuilder {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_24018.class, Builder.class);
         }

         private Builder() {
            this.id_ = ActGoldWeekMsg.S2C_Draw_24018.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = ActGoldWeekMsg.S2C_Draw_24018.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_Draw_24018.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = ActGoldWeekMsg.S2C_Draw_24018.emptyIntList();
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_Draw_24018_descriptor;
         }

         public S2C_Draw_24018 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_Draw_24018.getDefaultInstance();
         }

         public S2C_Draw_24018 build() {
            S2C_Draw_24018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_24018 buildPartial() {
            S2C_Draw_24018 result = new S2C_Draw_24018(this);
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
            if (other instanceof S2C_Draw_24018) {
               return this.mergeFrom((S2C_Draw_24018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_24018 other) {
            if (other == ActGoldWeekMsg.S2C_Draw_24018.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = ActGoldWeekMsg.S2C_Draw_24018.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_24018 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_24018)ActGoldWeekMsg.S2C_Draw_24018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_24018)e.getUnfinishedMessage();
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
               this.id_ = ActGoldWeekMsg.S2C_Draw_24018.mutableCopy(this.id_);
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
            this.id_ = ActGoldWeekMsg.S2C_Draw_24018.emptyIntList();
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

   public static final class C2S_OpenReward_24019 extends GeneratedMessageV3 implements C2S_OpenReward_24019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_24019 DEFAULT_INSTANCE = new C2S_OpenReward_24019();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_24019> PARSER = new AbstractParser<C2S_OpenReward_24019>() {
         public C2S_OpenReward_24019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_24019(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_24019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_24019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_24019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_24019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_24019.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_24019)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_24019 other = (C2S_OpenReward_24019)obj;
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

      public static C2S_OpenReward_24019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_24019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_24019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_24019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_24019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_24019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_24019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_24019 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_24019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_24019 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_24019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_24019 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_24019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_24019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_24019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_24019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_24019> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_24019> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_24019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_24019OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_24019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_OpenReward_24019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_OpenReward_24019_descriptor;
         }

         public C2S_OpenReward_24019 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_OpenReward_24019.getDefaultInstance();
         }

         public C2S_OpenReward_24019 build() {
            C2S_OpenReward_24019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_24019 buildPartial() {
            C2S_OpenReward_24019 result = new C2S_OpenReward_24019(this);
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
            if (other instanceof C2S_OpenReward_24019) {
               return this.mergeFrom((C2S_OpenReward_24019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_24019 other) {
            if (other == ActGoldWeekMsg.C2S_OpenReward_24019.getDefaultInstance()) {
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
            C2S_OpenReward_24019 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_24019)ActGoldWeekMsg.C2S_OpenReward_24019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_24019)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_24020 extends GeneratedMessageV3 implements S2C_OpenReward_24020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_24020 DEFAULT_INSTANCE = new S2C_OpenReward_24020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_24020> PARSER = new AbstractParser<S2C_OpenReward_24020>() {
         public S2C_OpenReward_24020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_24020(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_24020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_24020() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_24020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_24020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_24020.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_24020)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_24020 other = (S2C_OpenReward_24020)obj;
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

      public static S2C_OpenReward_24020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_24020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_24020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_24020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_24020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_24020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_24020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_24020 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_24020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_24020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_24020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_24020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_24020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_24020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_24020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_24020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_24020> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_24020> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_24020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_24020OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_24020.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_OpenReward_24020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_OpenReward_24020_descriptor;
         }

         public S2C_OpenReward_24020 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_OpenReward_24020.getDefaultInstance();
         }

         public S2C_OpenReward_24020 build() {
            S2C_OpenReward_24020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_24020 buildPartial() {
            S2C_OpenReward_24020 result = new S2C_OpenReward_24020(this);
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
            if (other instanceof S2C_OpenReward_24020) {
               return this.mergeFrom((S2C_OpenReward_24020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_24020 other) {
            if (other == ActGoldWeekMsg.S2C_OpenReward_24020.getDefaultInstance()) {
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
            S2C_OpenReward_24020 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_24020)ActGoldWeekMsg.S2C_OpenReward_24020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_24020)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_24021 extends GeneratedMessageV3 implements C2S_DrawRecord_24021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_24021 DEFAULT_INSTANCE = new C2S_DrawRecord_24021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_24021> PARSER = new AbstractParser<C2S_DrawRecord_24021>() {
         public C2S_DrawRecord_24021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_24021(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_24021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_24021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_24021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_24021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_24021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_24021)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_24021 other = (C2S_DrawRecord_24021)obj;
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

      public static C2S_DrawRecord_24021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_24021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_24021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_24021 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_24021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_24021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_24021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_24021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_24021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_24021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_24021> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_24021> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_24021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_24021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_24021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_DrawRecord_24021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_DrawRecord_24021_descriptor;
         }

         public C2S_DrawRecord_24021 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_DrawRecord_24021.getDefaultInstance();
         }

         public C2S_DrawRecord_24021 build() {
            C2S_DrawRecord_24021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_24021 buildPartial() {
            C2S_DrawRecord_24021 result = new C2S_DrawRecord_24021(this);
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
            if (other instanceof C2S_DrawRecord_24021) {
               return this.mergeFrom((C2S_DrawRecord_24021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_24021 other) {
            if (other == ActGoldWeekMsg.C2S_DrawRecord_24021.getDefaultInstance()) {
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
            C2S_DrawRecord_24021 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_24021)ActGoldWeekMsg.C2S_DrawRecord_24021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_24021)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_24022 extends GeneratedMessageV3 implements S2C_DrawRecord_24022OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_24022 DEFAULT_INSTANCE = new S2C_DrawRecord_24022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_24022> PARSER = new AbstractParser<S2C_DrawRecord_24022>() {
         public S2C_DrawRecord_24022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_24022(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_24022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_24022() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_24022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_24022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(ActGoldWeekMsg.MyDrawRecord.PARSER, extensionRegistry));
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_24022.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_24022)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_24022 other = (S2C_DrawRecord_24022)obj;
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

      public static S2C_DrawRecord_24022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_24022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_24022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_24022 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_24022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_24022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_24022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_24022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_24022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_24022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_24022> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_24022> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_24022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_24022OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_24022.class, Builder.class);
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
            if (ActGoldWeekMsg.S2C_DrawRecord_24022.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_DrawRecord_24022_descriptor;
         }

         public S2C_DrawRecord_24022 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_DrawRecord_24022.getDefaultInstance();
         }

         public S2C_DrawRecord_24022 build() {
            S2C_DrawRecord_24022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_24022 buildPartial() {
            S2C_DrawRecord_24022 result = new S2C_DrawRecord_24022(this);
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
            if (other instanceof S2C_DrawRecord_24022) {
               return this.mergeFrom((S2C_DrawRecord_24022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_24022 other) {
            if (other == ActGoldWeekMsg.S2C_DrawRecord_24022.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = ActGoldWeekMsg.S2C_DrawRecord_24022.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_24022 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_24022)ActGoldWeekMsg.S2C_DrawRecord_24022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_24022)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(ActGoldWeekMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, ActGoldWeekMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_24023 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_24023OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_24023 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_24023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_24023> PARSER = new AbstractParser<C2S_ServerDrawRecord_24023>() {
         public C2S_ServerDrawRecord_24023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_24023(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_24023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_24023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_24023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_24023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_24023.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_24023)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_24023 other = (C2S_ServerDrawRecord_24023)obj;
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

      public static C2S_ServerDrawRecord_24023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_24023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_24023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_24023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_24023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_24023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_24023> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_24023> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_24023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_24023OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_24023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_ServerDrawRecord_24023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_ServerDrawRecord_24023_descriptor;
         }

         public C2S_ServerDrawRecord_24023 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_ServerDrawRecord_24023.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_24023 build() {
            C2S_ServerDrawRecord_24023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_24023 buildPartial() {
            C2S_ServerDrawRecord_24023 result = new C2S_ServerDrawRecord_24023(this);
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
            if (other instanceof C2S_ServerDrawRecord_24023) {
               return this.mergeFrom((C2S_ServerDrawRecord_24023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_24023 other) {
            if (other == ActGoldWeekMsg.C2S_ServerDrawRecord_24023.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_24023 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_24023)ActGoldWeekMsg.C2S_ServerDrawRecord_24023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_24023)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_24024 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_24024OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_24024 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_24024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_24024> PARSER = new AbstractParser<S2C_ServerDrawRecord_24024>() {
         public S2C_ServerDrawRecord_24024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_24024(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_24024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_24024() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_24024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_24024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.serverRecord_.add(input.readMessage(ActGoldWeekMsg.ServerDrawRecord.PARSER, extensionRegistry));
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_24024.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_24024)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_24024 other = (S2C_ServerDrawRecord_24024)obj;
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

      public static S2C_ServerDrawRecord_24024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_24024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_24024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_24024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_24024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_24024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_24024> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_24024> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_24024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_24024OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_24024.class, Builder.class);
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
            if (ActGoldWeekMsg.S2C_ServerDrawRecord_24024.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_ServerDrawRecord_24024_descriptor;
         }

         public S2C_ServerDrawRecord_24024 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_ServerDrawRecord_24024.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_24024 build() {
            S2C_ServerDrawRecord_24024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_24024 buildPartial() {
            S2C_ServerDrawRecord_24024 result = new S2C_ServerDrawRecord_24024(this);
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
            if (other instanceof S2C_ServerDrawRecord_24024) {
               return this.mergeFrom((S2C_ServerDrawRecord_24024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_24024 other) {
            if (other == ActGoldWeekMsg.S2C_ServerDrawRecord_24024.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = ActGoldWeekMsg.S2C_ServerDrawRecord_24024.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_24024 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_24024)ActGoldWeekMsg.S2C_ServerDrawRecord_24024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_24024)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(ActGoldWeekMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, ActGoldWeekMsg.ServerDrawRecord.getDefaultInstance());
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (ActGoldWeekMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return ActGoldWeekMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == ActGoldWeekMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = ActGoldWeekMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)ActGoldWeekMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActGoldWeekMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (ActGoldWeekMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return ActGoldWeekMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == ActGoldWeekMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)ActGoldWeekMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = ActGoldWeekMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_fieldAccessorTable.ensureFieldAccessorsInitialized(GameBuilding.class, Builder.class);
         }

         private Builder() {
            this.rewardLv_ = ActGoldWeekMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardLv_ = ActGoldWeekMsg.GameBuilding.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.GameBuilding.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buildId_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            this.rewardLv_ = ActGoldWeekMsg.GameBuilding.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameBuilding_descriptor;
         }

         public GameBuilding getDefaultInstanceForType() {
            return ActGoldWeekMsg.GameBuilding.getDefaultInstance();
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
            if (other == ActGoldWeekMsg.GameBuilding.getDefaultInstance()) {
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
               parsedMessage = (GameBuilding)ActGoldWeekMsg.GameBuilding.PARSER.parsePartialFrom(input, extensionRegistry);
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
               this.rewardLv_ = ActGoldWeekMsg.GameBuilding.mutableCopy(this.rewardLv_);
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
            this.rewardLv_ = ActGoldWeekMsg.GameBuilding.emptyIntList();
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(GameEvent.class, Builder.class);
         }

         private Builder() {
            this.eventParam_ = ActGoldWeekMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.eventParam_ = ActGoldWeekMsg.GameEvent.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.GameEvent.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventId_ = 0;
            this.bitField0_ &= -2;
            this.eventParam_ = ActGoldWeekMsg.GameEvent.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_GameEvent_descriptor;
         }

         public GameEvent getDefaultInstanceForType() {
            return ActGoldWeekMsg.GameEvent.getDefaultInstance();
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
            if (other == ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
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
               parsedMessage = (GameEvent)ActGoldWeekMsg.GameEvent.PARSER.parsePartialFrom(input, extensionRegistry);
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
               this.eventParam_ = ActGoldWeekMsg.GameEvent.mutableCopy(this.eventParam_);
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
            this.eventParam_ = ActGoldWeekMsg.GameEvent.emptyIntList();
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

   public static final class C2S_GameMain_24031 extends GeneratedMessageV3 implements C2S_GameMain_24031OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameMain_24031 DEFAULT_INSTANCE = new C2S_GameMain_24031();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameMain_24031> PARSER = new AbstractParser<C2S_GameMain_24031>() {
         public C2S_GameMain_24031 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameMain_24031(input, extensionRegistry);
         }
      };

      private C2S_GameMain_24031(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameMain_24031() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameMain_24031();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameMain_24031(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_24031.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameMain_24031)) {
            return super.equals(obj);
         } else {
            C2S_GameMain_24031 other = (C2S_GameMain_24031)obj;
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

      public static C2S_GameMain_24031 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_24031 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_24031 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_24031 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_24031 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data);
      }

      public static C2S_GameMain_24031 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameMain_24031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameMain_24031 parseFrom(InputStream input) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_24031 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_24031 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameMain_24031 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameMain_24031 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameMain_24031 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameMain_24031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameMain_24031 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameMain_24031 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameMain_24031> parser() {
         return PARSER;
      }

      public Parser<C2S_GameMain_24031> getParserForType() {
         return PARSER;
      }

      public C2S_GameMain_24031 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameMain_24031OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameMain_24031.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameMain_24031.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameMain_24031_descriptor;
         }

         public C2S_GameMain_24031 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameMain_24031.getDefaultInstance();
         }

         public C2S_GameMain_24031 build() {
            C2S_GameMain_24031 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameMain_24031 buildPartial() {
            C2S_GameMain_24031 result = new C2S_GameMain_24031(this);
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
            if (other instanceof C2S_GameMain_24031) {
               return this.mergeFrom((C2S_GameMain_24031)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameMain_24031 other) {
            if (other == ActGoldWeekMsg.C2S_GameMain_24031.getDefaultInstance()) {
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
            C2S_GameMain_24031 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameMain_24031)ActGoldWeekMsg.C2S_GameMain_24031.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameMain_24031)e.getUnfinishedMessage();
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

   public static final class S2C_GameMain_24032 extends GeneratedMessageV3 implements S2C_GameMain_24032OrBuilder {
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
      private static final S2C_GameMain_24032 DEFAULT_INSTANCE = new S2C_GameMain_24032();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameMain_24032> PARSER = new AbstractParser<S2C_GameMain_24032>() {
         public S2C_GameMain_24032 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameMain_24032(input, extensionRegistry);
         }
      };

      private S2C_GameMain_24032(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameMain_24032() {
         this.memoizedIsInitialized = -1;
         this.building_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameMain_24032();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameMain_24032(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.building_.add(input.readMessage(ActGoldWeekMsg.GameBuilding.PARSER, extensionRegistry));
                        break;
                     case 42:
                        GameEvent.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.event_.toBuilder();
                        }

                        this.event_ = (GameEvent)input.readMessage(ActGoldWeekMsg.GameEvent.PARSER, extensionRegistry);
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_24032.class, Builder.class);
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
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
         } else if (!(obj instanceof S2C_GameMain_24032)) {
            return super.equals(obj);
         } else {
            S2C_GameMain_24032 other = (S2C_GameMain_24032)obj;
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

      public static S2C_GameMain_24032 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_24032 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_24032 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_24032 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_24032 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data);
      }

      public static S2C_GameMain_24032 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameMain_24032)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameMain_24032 parseFrom(InputStream input) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_24032 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_24032 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameMain_24032 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameMain_24032 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameMain_24032 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameMain_24032)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameMain_24032 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameMain_24032 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameMain_24032> parser() {
         return PARSER;
      }

      public Parser<S2C_GameMain_24032> getParserForType() {
         return PARSER;
      }

      public S2C_GameMain_24032 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameMain_24032OrBuilder {
         private int bitField0_;
         private int grid_;
         private int diceRecover_;
         private int buyGoldDiceNum_;
         private List<GameBuilding> building_;
         private RepeatedFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameMain_24032.class, Builder.class);
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
            if (ActGoldWeekMsg.S2C_GameMain_24032.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameMain_24032_descriptor;
         }

         public S2C_GameMain_24032 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameMain_24032.getDefaultInstance();
         }

         public S2C_GameMain_24032 build() {
            S2C_GameMain_24032 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameMain_24032 buildPartial() {
            S2C_GameMain_24032 result = new S2C_GameMain_24032(this);
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
            if (other instanceof S2C_GameMain_24032) {
               return this.mergeFrom((S2C_GameMain_24032)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameMain_24032 other) {
            if (other == ActGoldWeekMsg.S2C_GameMain_24032.getDefaultInstance()) {
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
                     this.buildingBuilder_ = ActGoldWeekMsg.S2C_GameMain_24032.alwaysUseFieldBuilders ? this.getBuildingFieldBuilder() : null;
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
            S2C_GameMain_24032 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameMain_24032)ActGoldWeekMsg.S2C_GameMain_24032.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameMain_24032)e.getUnfinishedMessage();
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
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(ActGoldWeekMsg.GameBuilding.getDefaultInstance());
         }

         public GameBuilding.Builder addBuildingBuilder(int index) {
            return (GameBuilding.Builder)this.getBuildingFieldBuilder().addBuilder(index, ActGoldWeekMsg.GameBuilding.getDefaultInstance());
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActGoldWeekMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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

   public static final class C2S_GameRollDice_24033 extends GeneratedMessageV3 implements C2S_GameRollDice_24033OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_GameRollDice_24033 DEFAULT_INSTANCE = new C2S_GameRollDice_24033();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameRollDice_24033> PARSER = new AbstractParser<C2S_GameRollDice_24033>() {
         public C2S_GameRollDice_24033 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameRollDice_24033(input, extensionRegistry);
         }
      };

      private C2S_GameRollDice_24033(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameRollDice_24033() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameRollDice_24033();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameRollDice_24033(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_24033.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameRollDice_24033)) {
            return super.equals(obj);
         } else {
            C2S_GameRollDice_24033 other = (C2S_GameRollDice_24033)obj;
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

      public static C2S_GameRollDice_24033 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_24033 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_24033 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_24033 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_24033 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data);
      }

      public static C2S_GameRollDice_24033 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameRollDice_24033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameRollDice_24033 parseFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_24033 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_24033 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_24033 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameRollDice_24033 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameRollDice_24033 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameRollDice_24033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameRollDice_24033 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameRollDice_24033 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameRollDice_24033> parser() {
         return PARSER;
      }

      public Parser<C2S_GameRollDice_24033> getParserForType() {
         return PARSER;
      }

      public C2S_GameRollDice_24033 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameRollDice_24033OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameRollDice_24033.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameRollDice_24033.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameRollDice_24033_descriptor;
         }

         public C2S_GameRollDice_24033 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameRollDice_24033.getDefaultInstance();
         }

         public C2S_GameRollDice_24033 build() {
            C2S_GameRollDice_24033 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameRollDice_24033 buildPartial() {
            C2S_GameRollDice_24033 result = new C2S_GameRollDice_24033(this);
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
            if (other instanceof C2S_GameRollDice_24033) {
               return this.mergeFrom((C2S_GameRollDice_24033)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameRollDice_24033 other) {
            if (other == ActGoldWeekMsg.C2S_GameRollDice_24033.getDefaultInstance()) {
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
            C2S_GameRollDice_24033 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameRollDice_24033)ActGoldWeekMsg.C2S_GameRollDice_24033.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameRollDice_24033)e.getUnfinishedMessage();
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

   public static final class S2C_GameRollDice_24034 extends GeneratedMessageV3 implements S2C_GameRollDice_24034OrBuilder {
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
      private static final S2C_GameRollDice_24034 DEFAULT_INSTANCE = new S2C_GameRollDice_24034();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameRollDice_24034> PARSER = new AbstractParser<S2C_GameRollDice_24034>() {
         public S2C_GameRollDice_24034 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameRollDice_24034(input, extensionRegistry);
         }
      };

      private S2C_GameRollDice_24034(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameRollDice_24034() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameRollDice_24034();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameRollDice_24034(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(ActGoldWeekMsg.GameEvent.PARSER, extensionRegistry);
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

                        this.building_ = (GameBuilding)input.readMessage(ActGoldWeekMsg.GameBuilding.PARSER, extensionRegistry);
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_24034.class, Builder.class);
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
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public boolean hasBuilding() {
         return (this.bitField0_ & 32) != 0;
      }

      public GameBuilding getBuilding() {
         return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
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
         } else if (!(obj instanceof S2C_GameRollDice_24034)) {
            return super.equals(obj);
         } else {
            S2C_GameRollDice_24034 other = (S2C_GameRollDice_24034)obj;
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

      public static S2C_GameRollDice_24034 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_24034 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_24034 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_24034 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_24034 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data);
      }

      public static S2C_GameRollDice_24034 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameRollDice_24034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameRollDice_24034 parseFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_24034 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_24034 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_24034 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameRollDice_24034 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameRollDice_24034 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameRollDice_24034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameRollDice_24034 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameRollDice_24034 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameRollDice_24034> parser() {
         return PARSER;
      }

      public Parser<S2C_GameRollDice_24034> getParserForType() {
         return PARSER;
      }

      public S2C_GameRollDice_24034 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameRollDice_24034OrBuilder {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameRollDice_24034.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameRollDice_24034.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameRollDice_24034_descriptor;
         }

         public S2C_GameRollDice_24034 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameRollDice_24034.getDefaultInstance();
         }

         public S2C_GameRollDice_24034 build() {
            S2C_GameRollDice_24034 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameRollDice_24034 buildPartial() {
            S2C_GameRollDice_24034 result = new S2C_GameRollDice_24034(this);
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
            if (other instanceof S2C_GameRollDice_24034) {
               return this.mergeFrom((S2C_GameRollDice_24034)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameRollDice_24034 other) {
            if (other == ActGoldWeekMsg.S2C_GameRollDice_24034.getDefaultInstance()) {
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
            S2C_GameRollDice_24034 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameRollDice_24034)ActGoldWeekMsg.S2C_GameRollDice_24034.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameRollDice_24034)e.getUnfinishedMessage();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 16) != 0 && this.event_ != null && this.event_ != ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActGoldWeekMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               if ((this.bitField0_ & 32) != 0 && this.building_ != null && this.building_ != ActGoldWeekMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = ActGoldWeekMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
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
               return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
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

   public static final class C2S_GameAddRandomDice_24035 extends GeneratedMessageV3 implements C2S_GameAddRandomDice_24035OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameAddRandomDice_24035 DEFAULT_INSTANCE = new C2S_GameAddRandomDice_24035();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameAddRandomDice_24035> PARSER = new AbstractParser<C2S_GameAddRandomDice_24035>() {
         public C2S_GameAddRandomDice_24035 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameAddRandomDice_24035(input, extensionRegistry);
         }
      };

      private C2S_GameAddRandomDice_24035(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameAddRandomDice_24035() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameAddRandomDice_24035();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameAddRandomDice_24035(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_24035.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameAddRandomDice_24035)) {
            return super.equals(obj);
         } else {
            C2S_GameAddRandomDice_24035 other = (C2S_GameAddRandomDice_24035)obj;
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

      public static C2S_GameAddRandomDice_24035 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameAddRandomDice_24035)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_24035 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_24035 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameAddRandomDice_24035 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameAddRandomDice_24035)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameAddRandomDice_24035 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameAddRandomDice_24035 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameAddRandomDice_24035> parser() {
         return PARSER;
      }

      public Parser<C2S_GameAddRandomDice_24035> getParserForType() {
         return PARSER;
      }

      public C2S_GameAddRandomDice_24035 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameAddRandomDice_24035OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameAddRandomDice_24035.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameAddRandomDice_24035.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameAddRandomDice_24035_descriptor;
         }

         public C2S_GameAddRandomDice_24035 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameAddRandomDice_24035.getDefaultInstance();
         }

         public C2S_GameAddRandomDice_24035 build() {
            C2S_GameAddRandomDice_24035 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameAddRandomDice_24035 buildPartial() {
            C2S_GameAddRandomDice_24035 result = new C2S_GameAddRandomDice_24035(this);
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
            if (other instanceof C2S_GameAddRandomDice_24035) {
               return this.mergeFrom((C2S_GameAddRandomDice_24035)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameAddRandomDice_24035 other) {
            if (other == ActGoldWeekMsg.C2S_GameAddRandomDice_24035.getDefaultInstance()) {
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
            C2S_GameAddRandomDice_24035 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameAddRandomDice_24035)ActGoldWeekMsg.C2S_GameAddRandomDice_24035.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameAddRandomDice_24035)e.getUnfinishedMessage();
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

   public static final class S2C_GameAddRandomDice_24036 extends GeneratedMessageV3 implements S2C_GameAddRandomDice_24036OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DICERECOVER_FIELD_NUMBER = 1;
      private int diceRecover_;
      private byte memoizedIsInitialized;
      private static final S2C_GameAddRandomDice_24036 DEFAULT_INSTANCE = new S2C_GameAddRandomDice_24036();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameAddRandomDice_24036> PARSER = new AbstractParser<S2C_GameAddRandomDice_24036>() {
         public S2C_GameAddRandomDice_24036 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameAddRandomDice_24036(input, extensionRegistry);
         }
      };

      private S2C_GameAddRandomDice_24036(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameAddRandomDice_24036() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameAddRandomDice_24036();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameAddRandomDice_24036(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_24036.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameAddRandomDice_24036)) {
            return super.equals(obj);
         } else {
            S2C_GameAddRandomDice_24036 other = (S2C_GameAddRandomDice_24036)obj;
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

      public static S2C_GameAddRandomDice_24036 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameAddRandomDice_24036)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_24036 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_24036 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameAddRandomDice_24036 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameAddRandomDice_24036)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameAddRandomDice_24036 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameAddRandomDice_24036 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameAddRandomDice_24036> parser() {
         return PARSER;
      }

      public Parser<S2C_GameAddRandomDice_24036> getParserForType() {
         return PARSER;
      }

      public S2C_GameAddRandomDice_24036 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameAddRandomDice_24036OrBuilder {
         private int bitField0_;
         private int diceRecover_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameAddRandomDice_24036.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameAddRandomDice_24036.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.diceRecover_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameAddRandomDice_24036_descriptor;
         }

         public S2C_GameAddRandomDice_24036 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameAddRandomDice_24036.getDefaultInstance();
         }

         public S2C_GameAddRandomDice_24036 build() {
            S2C_GameAddRandomDice_24036 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameAddRandomDice_24036 buildPartial() {
            S2C_GameAddRandomDice_24036 result = new S2C_GameAddRandomDice_24036(this);
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
            if (other instanceof S2C_GameAddRandomDice_24036) {
               return this.mergeFrom((S2C_GameAddRandomDice_24036)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameAddRandomDice_24036 other) {
            if (other == ActGoldWeekMsg.S2C_GameAddRandomDice_24036.getDefaultInstance()) {
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
            S2C_GameAddRandomDice_24036 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameAddRandomDice_24036)ActGoldWeekMsg.S2C_GameAddRandomDice_24036.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameAddRandomDice_24036)e.getUnfinishedMessage();
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

   public static final class C2S_GameGoldDiceBuy_24037 extends GeneratedMessageV3 implements C2S_GameGoldDiceBuy_24037OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameGoldDiceBuy_24037 DEFAULT_INSTANCE = new C2S_GameGoldDiceBuy_24037();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameGoldDiceBuy_24037> PARSER = new AbstractParser<C2S_GameGoldDiceBuy_24037>() {
         public C2S_GameGoldDiceBuy_24037 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameGoldDiceBuy_24037(input, extensionRegistry);
         }
      };

      private C2S_GameGoldDiceBuy_24037(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameGoldDiceBuy_24037() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameGoldDiceBuy_24037();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameGoldDiceBuy_24037(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_24037.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameGoldDiceBuy_24037)) {
            return super.equals(obj);
         } else {
            C2S_GameGoldDiceBuy_24037 other = (C2S_GameGoldDiceBuy_24037)obj;
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

      public static C2S_GameGoldDiceBuy_24037 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameGoldDiceBuy_24037)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_24037 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_24037 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameGoldDiceBuy_24037 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameGoldDiceBuy_24037)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameGoldDiceBuy_24037 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameGoldDiceBuy_24037 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameGoldDiceBuy_24037> parser() {
         return PARSER;
      }

      public Parser<C2S_GameGoldDiceBuy_24037> getParserForType() {
         return PARSER;
      }

      public C2S_GameGoldDiceBuy_24037 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameGoldDiceBuy_24037OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameGoldDiceBuy_24037.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameGoldDiceBuy_24037.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameGoldDiceBuy_24037_descriptor;
         }

         public C2S_GameGoldDiceBuy_24037 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameGoldDiceBuy_24037.getDefaultInstance();
         }

         public C2S_GameGoldDiceBuy_24037 build() {
            C2S_GameGoldDiceBuy_24037 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameGoldDiceBuy_24037 buildPartial() {
            C2S_GameGoldDiceBuy_24037 result = new C2S_GameGoldDiceBuy_24037(this);
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
            if (other instanceof C2S_GameGoldDiceBuy_24037) {
               return this.mergeFrom((C2S_GameGoldDiceBuy_24037)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameGoldDiceBuy_24037 other) {
            if (other == ActGoldWeekMsg.C2S_GameGoldDiceBuy_24037.getDefaultInstance()) {
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
            C2S_GameGoldDiceBuy_24037 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameGoldDiceBuy_24037)ActGoldWeekMsg.C2S_GameGoldDiceBuy_24037.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameGoldDiceBuy_24037)e.getUnfinishedMessage();
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

   public static final class S2C_GameGoldDiceBuy_24038 extends GeneratedMessageV3 implements S2C_GameGoldDiceBuy_24038OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYGOLDDICENUM_FIELD_NUMBER = 1;
      private int buyGoldDiceNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GameGoldDiceBuy_24038 DEFAULT_INSTANCE = new S2C_GameGoldDiceBuy_24038();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameGoldDiceBuy_24038> PARSER = new AbstractParser<S2C_GameGoldDiceBuy_24038>() {
         public S2C_GameGoldDiceBuy_24038 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameGoldDiceBuy_24038(input, extensionRegistry);
         }
      };

      private S2C_GameGoldDiceBuy_24038(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameGoldDiceBuy_24038() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameGoldDiceBuy_24038();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameGoldDiceBuy_24038(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_24038.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameGoldDiceBuy_24038)) {
            return super.equals(obj);
         } else {
            S2C_GameGoldDiceBuy_24038 other = (S2C_GameGoldDiceBuy_24038)obj;
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

      public static S2C_GameGoldDiceBuy_24038 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameGoldDiceBuy_24038)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_24038 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_24038 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameGoldDiceBuy_24038 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameGoldDiceBuy_24038)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameGoldDiceBuy_24038 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameGoldDiceBuy_24038 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameGoldDiceBuy_24038> parser() {
         return PARSER;
      }

      public Parser<S2C_GameGoldDiceBuy_24038> getParserForType() {
         return PARSER;
      }

      public S2C_GameGoldDiceBuy_24038 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameGoldDiceBuy_24038OrBuilder {
         private int bitField0_;
         private int buyGoldDiceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameGoldDiceBuy_24038.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyGoldDiceNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameGoldDiceBuy_24038_descriptor;
         }

         public S2C_GameGoldDiceBuy_24038 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.getDefaultInstance();
         }

         public S2C_GameGoldDiceBuy_24038 build() {
            S2C_GameGoldDiceBuy_24038 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameGoldDiceBuy_24038 buildPartial() {
            S2C_GameGoldDiceBuy_24038 result = new S2C_GameGoldDiceBuy_24038(this);
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
            if (other instanceof S2C_GameGoldDiceBuy_24038) {
               return this.mergeFrom((S2C_GameGoldDiceBuy_24038)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameGoldDiceBuy_24038 other) {
            if (other == ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.getDefaultInstance()) {
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
            S2C_GameGoldDiceBuy_24038 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameGoldDiceBuy_24038)ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameGoldDiceBuy_24038)e.getUnfinishedMessage();
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

   public static final class C2S_GameEvent_24039 extends GeneratedMessageV3 implements C2S_GameEvent_24039OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENT_FIELD_NUMBER = 1;
      private GameEvent event_;
      private byte memoizedIsInitialized;
      private static final C2S_GameEvent_24039 DEFAULT_INSTANCE = new C2S_GameEvent_24039();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameEvent_24039> PARSER = new AbstractParser<C2S_GameEvent_24039>() {
         public C2S_GameEvent_24039 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameEvent_24039(input, extensionRegistry);
         }
      };

      private C2S_GameEvent_24039(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameEvent_24039() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameEvent_24039();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameEvent_24039(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(ActGoldWeekMsg.GameEvent.PARSER, extensionRegistry);
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_24039.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
         } else if (!(obj instanceof C2S_GameEvent_24039)) {
            return super.equals(obj);
         } else {
            C2S_GameEvent_24039 other = (C2S_GameEvent_24039)obj;
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

      public static C2S_GameEvent_24039 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_24039 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_24039 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_24039 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_24039 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data);
      }

      public static C2S_GameEvent_24039 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameEvent_24039)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameEvent_24039 parseFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_24039 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_24039 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_24039 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameEvent_24039 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameEvent_24039 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameEvent_24039)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameEvent_24039 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameEvent_24039 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameEvent_24039> parser() {
         return PARSER;
      }

      public Parser<C2S_GameEvent_24039> getParserForType() {
         return PARSER;
      }

      public C2S_GameEvent_24039 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameEvent_24039OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameEvent_24039.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameEvent_24039.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameEvent_24039_descriptor;
         }

         public C2S_GameEvent_24039 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameEvent_24039.getDefaultInstance();
         }

         public C2S_GameEvent_24039 build() {
            C2S_GameEvent_24039 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameEvent_24039 buildPartial() {
            C2S_GameEvent_24039 result = new C2S_GameEvent_24039(this);
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
            if (other instanceof C2S_GameEvent_24039) {
               return this.mergeFrom((C2S_GameEvent_24039)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameEvent_24039 other) {
            if (other == ActGoldWeekMsg.C2S_GameEvent_24039.getDefaultInstance()) {
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
            C2S_GameEvent_24039 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameEvent_24039)ActGoldWeekMsg.C2S_GameEvent_24039.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameEvent_24039)e.getUnfinishedMessage();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActGoldWeekMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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

   public static final class S2C_GameEvent_24040 extends GeneratedMessageV3 implements S2C_GameEvent_24040OrBuilder {
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
      private static final S2C_GameEvent_24040 DEFAULT_INSTANCE = new S2C_GameEvent_24040();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameEvent_24040> PARSER = new AbstractParser<S2C_GameEvent_24040>() {
         public S2C_GameEvent_24040 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameEvent_24040(input, extensionRegistry);
         }
      };

      private S2C_GameEvent_24040(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameEvent_24040() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameEvent_24040();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameEvent_24040(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.event_ = (GameEvent)input.readMessage(ActGoldWeekMsg.GameEvent.PARSER, extensionRegistry);
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

                        this.building_ = (GameBuilding)input.readMessage(ActGoldWeekMsg.GameBuilding.PARSER, extensionRegistry);
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

                        this.nextEvent_ = (GameEvent)input.readMessage(ActGoldWeekMsg.GameEvent.PARSER, extensionRegistry);
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_24040.class, Builder.class);
      }

      public boolean hasEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public GameEvent getEvent() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
      }

      public GameEventOrBuilder getEventOrBuilder() {
         return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
         return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public GameBuildingOrBuilder getBuildingOrBuilder() {
         return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
      }

      public boolean hasNextEvent() {
         return (this.bitField0_ & 8) != 0;
      }

      public GameEvent getNextEvent() {
         return this.nextEvent_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
      }

      public GameEventOrBuilder getNextEventOrBuilder() {
         return this.nextEvent_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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
         } else if (!(obj instanceof S2C_GameEvent_24040)) {
            return super.equals(obj);
         } else {
            S2C_GameEvent_24040 other = (S2C_GameEvent_24040)obj;
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

      public static S2C_GameEvent_24040 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_24040 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_24040 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_24040 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_24040 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data);
      }

      public static S2C_GameEvent_24040 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameEvent_24040)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameEvent_24040 parseFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_24040 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_24040 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_24040 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameEvent_24040 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameEvent_24040 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameEvent_24040)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameEvent_24040 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameEvent_24040 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameEvent_24040> parser() {
         return PARSER;
      }

      public Parser<S2C_GameEvent_24040> getParserForType() {
         return PARSER;
      }

      public S2C_GameEvent_24040 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameEvent_24040OrBuilder {
         private int bitField0_;
         private GameEvent event_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> eventBuilder_;
         private int grid_;
         private GameBuilding building_;
         private SingleFieldBuilderV3<GameBuilding, GameBuilding.Builder, GameBuildingOrBuilder> buildingBuilder_;
         private GameEvent nextEvent_;
         private SingleFieldBuilderV3<GameEvent, GameEvent.Builder, GameEventOrBuilder> nextEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameEvent_24040.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameEvent_24040.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameEvent_24040_descriptor;
         }

         public S2C_GameEvent_24040 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameEvent_24040.getDefaultInstance();
         }

         public S2C_GameEvent_24040 build() {
            S2C_GameEvent_24040 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameEvent_24040 buildPartial() {
            S2C_GameEvent_24040 result = new S2C_GameEvent_24040(this);
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
            if (other instanceof S2C_GameEvent_24040) {
               return this.mergeFrom((S2C_GameEvent_24040)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameEvent_24040 other) {
            if (other == ActGoldWeekMsg.S2C_GameEvent_24040.getDefaultInstance()) {
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
            S2C_GameEvent_24040 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameEvent_24040)ActGoldWeekMsg.S2C_GameEvent_24040.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameEvent_24040)e.getUnfinishedMessage();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               if ((this.bitField0_ & 1) != 0 && this.event_ != null && this.event_ != ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
                  this.event_ = ActGoldWeekMsg.GameEvent.newBuilder(this.event_).mergeFrom(value).buildPartial();
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
               return this.event_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.event_;
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
               return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               if ((this.bitField0_ & 4) != 0 && this.building_ != null && this.building_ != ActGoldWeekMsg.GameBuilding.getDefaultInstance()) {
                  this.building_ = ActGoldWeekMsg.GameBuilding.newBuilder(this.building_).mergeFrom(value).buildPartial();
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
               return this.building_ == null ? ActGoldWeekMsg.GameBuilding.getDefaultInstance() : this.building_;
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
               return this.nextEvent_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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
               if ((this.bitField0_ & 8) != 0 && this.nextEvent_ != null && this.nextEvent_ != ActGoldWeekMsg.GameEvent.getDefaultInstance()) {
                  this.nextEvent_ = ActGoldWeekMsg.GameEvent.newBuilder(this.nextEvent_).mergeFrom(value).buildPartial();
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
               return this.nextEvent_ == null ? ActGoldWeekMsg.GameEvent.getDefaultInstance() : this.nextEvent_;
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

   public static final class C2S_GameTask_24041 extends GeneratedMessageV3 implements C2S_GameTask_24041OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GameTask_24041 DEFAULT_INSTANCE = new C2S_GameTask_24041();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTask_24041> PARSER = new AbstractParser<C2S_GameTask_24041>() {
         public C2S_GameTask_24041 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTask_24041(input, extensionRegistry);
         }
      };

      private C2S_GameTask_24041(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTask_24041() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTask_24041();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTask_24041(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_24041.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTask_24041)) {
            return super.equals(obj);
         } else {
            C2S_GameTask_24041 other = (C2S_GameTask_24041)obj;
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

      public static C2S_GameTask_24041 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_24041 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_24041 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_24041 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_24041 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data);
      }

      public static C2S_GameTask_24041 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTask_24041)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTask_24041 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_24041 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_24041 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTask_24041 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTask_24041 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTask_24041 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTask_24041)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTask_24041 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTask_24041 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTask_24041> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTask_24041> getParserForType() {
         return PARSER;
      }

      public C2S_GameTask_24041 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTask_24041OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTask_24041.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameTask_24041.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTask_24041_descriptor;
         }

         public C2S_GameTask_24041 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameTask_24041.getDefaultInstance();
         }

         public C2S_GameTask_24041 build() {
            C2S_GameTask_24041 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTask_24041 buildPartial() {
            C2S_GameTask_24041 result = new C2S_GameTask_24041(this);
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
            if (other instanceof C2S_GameTask_24041) {
               return this.mergeFrom((C2S_GameTask_24041)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTask_24041 other) {
            if (other == ActGoldWeekMsg.C2S_GameTask_24041.getDefaultInstance()) {
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
            C2S_GameTask_24041 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTask_24041)ActGoldWeekMsg.C2S_GameTask_24041.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTask_24041)e.getUnfinishedMessage();
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

   public static final class S2C_GameTask_24042 extends GeneratedMessageV3 implements S2C_GameTask_24042OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTask_24042 DEFAULT_INSTANCE = new S2C_GameTask_24042();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTask_24042> PARSER = new AbstractParser<S2C_GameTask_24042>() {
         public S2C_GameTask_24042 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTask_24042(input, extensionRegistry);
         }
      };

      private S2C_GameTask_24042(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTask_24042() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTask_24042();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTask_24042(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_24042.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTask_24042)) {
            return super.equals(obj);
         } else {
            S2C_GameTask_24042 other = (S2C_GameTask_24042)obj;
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

      public static S2C_GameTask_24042 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_24042 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_24042 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_24042 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_24042 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data);
      }

      public static S2C_GameTask_24042 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTask_24042)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTask_24042 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_24042 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_24042 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTask_24042 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTask_24042 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTask_24042 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTask_24042)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTask_24042 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTask_24042 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTask_24042> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTask_24042> getParserForType() {
         return PARSER;
      }

      public S2C_GameTask_24042 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTask_24042OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTask_24042.class, Builder.class);
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
            if (ActGoldWeekMsg.S2C_GameTask_24042.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTask_24042_descriptor;
         }

         public S2C_GameTask_24042 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameTask_24042.getDefaultInstance();
         }

         public S2C_GameTask_24042 build() {
            S2C_GameTask_24042 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTask_24042 buildPartial() {
            S2C_GameTask_24042 result = new S2C_GameTask_24042(this);
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
            if (other instanceof S2C_GameTask_24042) {
               return this.mergeFrom((S2C_GameTask_24042)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTask_24042 other) {
            if (other == ActGoldWeekMsg.S2C_GameTask_24042.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActGoldWeekMsg.S2C_GameTask_24042.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTask_24042 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTask_24042)ActGoldWeekMsg.S2C_GameTask_24042.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTask_24042)e.getUnfinishedMessage();
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

   public static final class C2S_GameTaskCommit_24043 extends GeneratedMessageV3 implements C2S_GameTaskCommit_24043OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_GameTaskCommit_24043 DEFAULT_INSTANCE = new C2S_GameTaskCommit_24043();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameTaskCommit_24043> PARSER = new AbstractParser<C2S_GameTaskCommit_24043>() {
         public C2S_GameTaskCommit_24043 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameTaskCommit_24043(input, extensionRegistry);
         }
      };

      private C2S_GameTaskCommit_24043(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameTaskCommit_24043() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameTaskCommit_24043();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameTaskCommit_24043(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_24043.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameTaskCommit_24043)) {
            return super.equals(obj);
         } else {
            C2S_GameTaskCommit_24043 other = (C2S_GameTaskCommit_24043)obj;
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

      public static C2S_GameTaskCommit_24043 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameTaskCommit_24043)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_24043 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_24043 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameTaskCommit_24043 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameTaskCommit_24043)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameTaskCommit_24043 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameTaskCommit_24043 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameTaskCommit_24043> parser() {
         return PARSER;
      }

      public Parser<C2S_GameTaskCommit_24043> getParserForType() {
         return PARSER;
      }

      public C2S_GameTaskCommit_24043 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameTaskCommit_24043OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameTaskCommit_24043.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameTaskCommit_24043.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameTaskCommit_24043_descriptor;
         }

         public C2S_GameTaskCommit_24043 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameTaskCommit_24043.getDefaultInstance();
         }

         public C2S_GameTaskCommit_24043 build() {
            C2S_GameTaskCommit_24043 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameTaskCommit_24043 buildPartial() {
            C2S_GameTaskCommit_24043 result = new C2S_GameTaskCommit_24043(this);
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
            if (other instanceof C2S_GameTaskCommit_24043) {
               return this.mergeFrom((C2S_GameTaskCommit_24043)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameTaskCommit_24043 other) {
            if (other == ActGoldWeekMsg.C2S_GameTaskCommit_24043.getDefaultInstance()) {
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
            C2S_GameTaskCommit_24043 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameTaskCommit_24043)ActGoldWeekMsg.C2S_GameTaskCommit_24043.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameTaskCommit_24043)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskCommit_24044 extends GeneratedMessageV3 implements S2C_GameTaskCommit_24044OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskCommit_24044 DEFAULT_INSTANCE = new S2C_GameTaskCommit_24044();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskCommit_24044> PARSER = new AbstractParser<S2C_GameTaskCommit_24044>() {
         public S2C_GameTaskCommit_24044 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskCommit_24044(input, extensionRegistry);
         }
      };

      private S2C_GameTaskCommit_24044(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskCommit_24044() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskCommit_24044();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskCommit_24044(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_24044.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskCommit_24044)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskCommit_24044 other = (S2C_GameTaskCommit_24044)obj;
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

      public static S2C_GameTaskCommit_24044 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskCommit_24044)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_24044 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_24044 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskCommit_24044 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskCommit_24044)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskCommit_24044 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskCommit_24044 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskCommit_24044> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskCommit_24044> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskCommit_24044 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskCommit_24044OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskCommit_24044.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameTaskCommit_24044.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskCommit_24044_descriptor;
         }

         public S2C_GameTaskCommit_24044 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameTaskCommit_24044.getDefaultInstance();
         }

         public S2C_GameTaskCommit_24044 build() {
            S2C_GameTaskCommit_24044 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskCommit_24044 buildPartial() {
            S2C_GameTaskCommit_24044 result = new S2C_GameTaskCommit_24044(this);
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
            if (other instanceof S2C_GameTaskCommit_24044) {
               return this.mergeFrom((S2C_GameTaskCommit_24044)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskCommit_24044 other) {
            if (other == ActGoldWeekMsg.S2C_GameTaskCommit_24044.getDefaultInstance()) {
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
            S2C_GameTaskCommit_24044 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskCommit_24044)ActGoldWeekMsg.S2C_GameTaskCommit_24044.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskCommit_24044)e.getUnfinishedMessage();
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

   public static final class S2C_GameTaskNotify_24046 extends GeneratedMessageV3 implements S2C_GameTaskNotify_24046OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_GameTaskNotify_24046 DEFAULT_INSTANCE = new S2C_GameTaskNotify_24046();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameTaskNotify_24046> PARSER = new AbstractParser<S2C_GameTaskNotify_24046>() {
         public S2C_GameTaskNotify_24046 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameTaskNotify_24046(input, extensionRegistry);
         }
      };

      private S2C_GameTaskNotify_24046(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameTaskNotify_24046() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameTaskNotify_24046();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameTaskNotify_24046(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_24046.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameTaskNotify_24046)) {
            return super.equals(obj);
         } else {
            S2C_GameTaskNotify_24046 other = (S2C_GameTaskNotify_24046)obj;
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

      public static S2C_GameTaskNotify_24046 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameTaskNotify_24046)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_24046 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_24046 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameTaskNotify_24046 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameTaskNotify_24046)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameTaskNotify_24046 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameTaskNotify_24046 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameTaskNotify_24046> parser() {
         return PARSER;
      }

      public Parser<S2C_GameTaskNotify_24046> getParserForType() {
         return PARSER;
      }

      public S2C_GameTaskNotify_24046 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameTaskNotify_24046OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameTaskNotify_24046.class, Builder.class);
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
            if (ActGoldWeekMsg.S2C_GameTaskNotify_24046.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameTaskNotify_24046_descriptor;
         }

         public S2C_GameTaskNotify_24046 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameTaskNotify_24046.getDefaultInstance();
         }

         public S2C_GameTaskNotify_24046 build() {
            S2C_GameTaskNotify_24046 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameTaskNotify_24046 buildPartial() {
            S2C_GameTaskNotify_24046 result = new S2C_GameTaskNotify_24046(this);
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
            if (other instanceof S2C_GameTaskNotify_24046) {
               return this.mergeFrom((S2C_GameTaskNotify_24046)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameTaskNotify_24046 other) {
            if (other == ActGoldWeekMsg.S2C_GameTaskNotify_24046.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActGoldWeekMsg.S2C_GameTaskNotify_24046.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_GameTaskNotify_24046 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameTaskNotify_24046)ActGoldWeekMsg.S2C_GameTaskNotify_24046.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameTaskNotify_24046)e.getUnfinishedMessage();
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

   public static final class C2S_GameBuildingReward_24047 extends GeneratedMessageV3 implements C2S_GameBuildingReward_24047OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final C2S_GameBuildingReward_24047 DEFAULT_INSTANCE = new C2S_GameBuildingReward_24047();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GameBuildingReward_24047> PARSER = new AbstractParser<C2S_GameBuildingReward_24047>() {
         public C2S_GameBuildingReward_24047 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GameBuildingReward_24047(input, extensionRegistry);
         }
      };

      private C2S_GameBuildingReward_24047(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GameBuildingReward_24047() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GameBuildingReward_24047();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GameBuildingReward_24047(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_24047.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GameBuildingReward_24047)) {
            return super.equals(obj);
         } else {
            C2S_GameBuildingReward_24047 other = (C2S_GameBuildingReward_24047)obj;
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

      public static C2S_GameBuildingReward_24047 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GameBuildingReward_24047)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_24047 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_24047 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GameBuildingReward_24047 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GameBuildingReward_24047)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GameBuildingReward_24047 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GameBuildingReward_24047 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GameBuildingReward_24047> parser() {
         return PARSER;
      }

      public Parser<C2S_GameBuildingReward_24047> getParserForType() {
         return PARSER;
      }

      public C2S_GameBuildingReward_24047 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GameBuildingReward_24047OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GameBuildingReward_24047.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.C2S_GameBuildingReward_24047.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_C2S_GameBuildingReward_24047_descriptor;
         }

         public C2S_GameBuildingReward_24047 getDefaultInstanceForType() {
            return ActGoldWeekMsg.C2S_GameBuildingReward_24047.getDefaultInstance();
         }

         public C2S_GameBuildingReward_24047 build() {
            C2S_GameBuildingReward_24047 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GameBuildingReward_24047 buildPartial() {
            C2S_GameBuildingReward_24047 result = new C2S_GameBuildingReward_24047(this);
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
            if (other instanceof C2S_GameBuildingReward_24047) {
               return this.mergeFrom((C2S_GameBuildingReward_24047)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GameBuildingReward_24047 other) {
            if (other == ActGoldWeekMsg.C2S_GameBuildingReward_24047.getDefaultInstance()) {
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
            C2S_GameBuildingReward_24047 parsedMessage = null;

            try {
               parsedMessage = (C2S_GameBuildingReward_24047)ActGoldWeekMsg.C2S_GameBuildingReward_24047.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GameBuildingReward_24047)e.getUnfinishedMessage();
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

   public static final class S2C_GameBuildingReward_24048 extends GeneratedMessageV3 implements S2C_GameBuildingReward_24048OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUILDINGID_FIELD_NUMBER = 1;
      private int buildingId_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final S2C_GameBuildingReward_24048 DEFAULT_INSTANCE = new S2C_GameBuildingReward_24048();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GameBuildingReward_24048> PARSER = new AbstractParser<S2C_GameBuildingReward_24048>() {
         public S2C_GameBuildingReward_24048 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GameBuildingReward_24048(input, extensionRegistry);
         }
      };

      private S2C_GameBuildingReward_24048(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GameBuildingReward_24048() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GameBuildingReward_24048();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GameBuildingReward_24048(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_24048.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GameBuildingReward_24048)) {
            return super.equals(obj);
         } else {
            S2C_GameBuildingReward_24048 other = (S2C_GameBuildingReward_24048)obj;
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

      public static S2C_GameBuildingReward_24048 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GameBuildingReward_24048)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_24048 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_24048 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GameBuildingReward_24048 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GameBuildingReward_24048)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GameBuildingReward_24048 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GameBuildingReward_24048 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GameBuildingReward_24048> parser() {
         return PARSER;
      }

      public Parser<S2C_GameBuildingReward_24048> getParserForType() {
         return PARSER;
      }

      public S2C_GameBuildingReward_24048 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GameBuildingReward_24048OrBuilder {
         private int bitField0_;
         private int buildingId_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GameBuildingReward_24048.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActGoldWeekMsg.S2C_GameBuildingReward_24048.alwaysUseFieldBuilders) {
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
            return ActGoldWeekMsg.internal_static_ActGoldWeek_com_gzbz_protobuf_S2C_GameBuildingReward_24048_descriptor;
         }

         public S2C_GameBuildingReward_24048 getDefaultInstanceForType() {
            return ActGoldWeekMsg.S2C_GameBuildingReward_24048.getDefaultInstance();
         }

         public S2C_GameBuildingReward_24048 build() {
            S2C_GameBuildingReward_24048 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GameBuildingReward_24048 buildPartial() {
            S2C_GameBuildingReward_24048 result = new S2C_GameBuildingReward_24048(this);
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
            if (other instanceof S2C_GameBuildingReward_24048) {
               return this.mergeFrom((S2C_GameBuildingReward_24048)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GameBuildingReward_24048 other) {
            if (other == ActGoldWeekMsg.S2C_GameBuildingReward_24048.getDefaultInstance()) {
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
            S2C_GameBuildingReward_24048 parsedMessage = null;

            try {
               parsedMessage = (S2C_GameBuildingReward_24048)ActGoldWeekMsg.S2C_GameBuildingReward_24048.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GameBuildingReward_24048)e.getUnfinishedMessage();
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

   public interface C2S_ActivityInfo_24001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_24021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_24017OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_24013OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_GameAddRandomDice_24035OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameBuildingReward_24047OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface C2S_GameEvent_24039OrBuilder extends MessageOrBuilder {
      boolean hasEvent();

      GameEvent getEvent();

      GameEventOrBuilder getEventOrBuilder();
   }

   public interface C2S_GameGoldDiceBuy_24037OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameMain_24031OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GameRollDice_24033OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_GameTaskCommit_24043OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_GameTask_24041OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckDrawInfo_24015OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_24019OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveShopAddUpReward_24005OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_24023OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_24003OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_24006OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_24008OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ActivityInfo_24002OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_DrawRecord_24022OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_24018OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FancyReward_24014OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_GameAddRandomDice_24036OrBuilder extends MessageOrBuilder {
      boolean hasDiceRecover();

      int getDiceRecover();
   }

   public interface S2C_GameBuildingReward_24048OrBuilder extends MessageOrBuilder {
      boolean hasBuildingId();

      int getBuildingId();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_GameEvent_24040OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameGoldDiceBuy_24038OrBuilder extends MessageOrBuilder {
      boolean hasBuyGoldDiceNum();

      int getBuyGoldDiceNum();
   }

   public interface S2C_GameMain_24032OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameRollDice_24034OrBuilder extends MessageOrBuilder {
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

   public interface S2C_GameTaskCommit_24044OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_GameTaskNotify_24046OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_GameTask_24042OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LuckDrawInfo_24016OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OpenReward_24020OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ServerDrawRecord_24024OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_24004OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignTotalInfo_24007OrBuilder extends MessageOrBuilder {
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
